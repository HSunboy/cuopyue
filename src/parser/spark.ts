import * as antlr4 from 'antlr4';
import { ErrorListener } from 'antlr4/error';
import { sparkLexer } from "../../antlr/spark/output/sparkLexer";
import { sparkParser } from "../../antlr/spark/output/sparkParser";
import { sparkVisitor } from "../../antlr/spark/output/sparkVisitor";
import { Parser } from "./index";
import { splitSql } from '../utils/index';

export class SparkTreeVisitor extends sparkVisitor {
}

class SparkTree extends sparkParser.SingleStatementContext {
}
class SparkErrorListener extends ErrorListener {
    private errorListener;
    constructor (errorlistener) {
        super();
        this.errorListener = errorlistener;
    }
    syntaxError () {
        this.errorListener.apply(this, arguments);
    }
}

let parserSingle: Parser<SparkTreeVisitor, SparkTree> = function (sql: string, errorListener, visitor)  {
    if (!sql || !sql.trim()) {
        return null;
    }

    const inputStream = new antlr4.InputStream(sql.toUpperCase());
    const lexer = <unknown>new sparkLexer(inputStream) as antlr4.Lexer;
    const tokenStream = new antlr4.CommonTokenStream(lexer);
    const parser = new sparkParser(tokenStream);

    (parser as any).buildParseTrees = true;
    if (errorListener) {
        let listener = new SparkErrorListener(errorListener);
        (parser as any).addErrorListener(listener)
    }

    const tree = parser.singleStatement();
    if (visitor) {
        (visitor as any).visit(tree);
    }
    
    return tree;
};
export let parser: Parser<SparkTreeVisitor, SparkTree[]> = function (sql: string, errorListener, visitor) {
    let runSql = typeof sql == 'string' ? sql : '';
    const sqls = splitSql(runSql);
    let result = [];
    for (let i = 0, index = 0; i < sqls.length; i++) {
        let end = runSql[sqls[i]] == ';' ? sqls[i] : sqls[i] + 1
        /**
         * 这边不取分号
         */
        let sql =  new Array(index).fill(' ').join('') + runSql.substring(index, end);
        let tree = parserSingle(sql, errorListener, visitor);
        result.push(tree);
        index = sqls[i] + 1;
    }
    return result;
}
