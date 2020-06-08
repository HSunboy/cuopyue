import * as antlr4 from 'antlr4';
import { ErrorListener } from 'antlr4/error';
import { sparkLexer } from "../../antlr/spark/output/sparkLexer";
import { sparkParser } from "../../antlr/spark/output/sparkParser";
import { SparkTreeVisitor } from "../visitor/spark/index";
import { Parser } from "./index";
import { splitSql } from '../utils/index';

class SparkTree extends sparkParser.SingleStatementContext {
}
class SparkErrorListener extends ErrorListener {
    private errorListener;
    private parser;
    constructor (errorlistener, parser) {
        super();
        this.parser = parser
        this.errorListener = errorlistener;
    }
    syntaxError () {
        this.errorListener.apply(this, Array.from(arguments).concat(this.parser));
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
    // parser._interp.predictionMode = 0;

    (parser as any).buildParseTrees = true;
    if (errorListener) {
        let listener = new SparkErrorListener(errorListener, parser);
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
