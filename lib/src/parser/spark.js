var __extends = (this && this.__extends) || (function () {
    var extendStatics = function (d, b) {
        extendStatics = Object.setPrototypeOf ||
            ({ __proto__: [] } instanceof Array && function (d, b) { d.__proto__ = b; }) ||
            function (d, b) { for (var p in b) if (b.hasOwnProperty(p)) d[p] = b[p]; };
        return extendStatics(d, b);
    };
    return function (d, b) {
        extendStatics(d, b);
        function __() { this.constructor = d; }
        d.prototype = b === null ? Object.create(b) : (__.prototype = b.prototype, new __());
    };
})();
(function (factory) {
    if (typeof module === "object" && typeof module.exports === "object") {
        var v = factory(require, exports);
        if (v !== undefined) module.exports = v;
    }
    else if (typeof define === "function" && define.amd) {
        define(["require", "exports", "antlr4", "antlr4/error", "../../antlr/spark/output/sparkLexer", "../../antlr/spark/output/sparkParser", "../utils/index"], factory);
    }
})(function (require, exports) {
    "use strict";
    exports.__esModule = true;
    var antlr4 = require("antlr4");
    var error_1 = require("antlr4/error");
    var sparkLexer_1 = require("../../antlr/spark/output/sparkLexer");
    var sparkParser_1 = require("../../antlr/spark/output/sparkParser");
    var index_1 = require("../utils/index");
    var SparkTree = /** @class */ (function (_super) {
        __extends(SparkTree, _super);
        function SparkTree() {
            return _super !== null && _super.apply(this, arguments) || this;
        }
        return SparkTree;
    }(sparkParser_1.sparkParser.SingleStatementContext));
    var SparkErrorListener = /** @class */ (function (_super) {
        __extends(SparkErrorListener, _super);
        function SparkErrorListener(errorlistener, parser) {
            var _this = _super.call(this) || this;
            _this.parser = parser;
            _this.errorListener = errorlistener;
            return _this;
        }
        SparkErrorListener.prototype.syntaxError = function () {
            this.errorListener.apply(this, Array.from(arguments).concat(this.parser));
        };
        return SparkErrorListener;
    }(error_1.ErrorListener));
    var parserSingle = function (sql, errorListener, visitor) {
        if (!sql || !sql.trim()) {
            return null;
        }
        var inputStream = new antlr4.InputStream(sql.toUpperCase());
        var lexer = new sparkLexer_1.sparkLexer(inputStream);
        var tokenStream = new antlr4.CommonTokenStream(lexer);
        var parser = new sparkParser_1.sparkParser(tokenStream);
        parser.buildParseTrees = true;
        if (errorListener) {
            var listener = new SparkErrorListener(errorListener, parser);
            parser.addErrorListener(listener);
        }
        var tree = parser.singleStatement();
        if (visitor) {
            visitor.visit(tree);
        }
        return tree;
    };
    exports.parser = function (sql, errorListener, visitor) {
        var runSql = typeof sql == 'string' ? sql : '';
        var sqls = index_1.splitSql(runSql);
        var result = [];
        for (var i = 0, index = 0; i < sqls.length; i++) {
            var end = runSql[sqls[i]] == ';' ? sqls[i] : sqls[i] + 1;
            /**
             * 这边不取分号
             */
            var sql_1 = new Array(index).fill(' ').join('') + runSql.substring(index, end);
            var tree = parserSingle(sql_1, errorListener, visitor);
            result.push(tree);
            index = sqls[i] + 1;
        }
        return result;
    };
});
