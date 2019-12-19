(function (factory) {
    if (typeof module === "object" && typeof module.exports === "object") {
        var v = factory(require, exports);
        if (v !== undefined) module.exports = v;
    }
    else if (typeof define === "function" && define.amd) {
        define(["require", "exports"], factory);
    }
})(function (require, exports) {
    "use strict";
    exports.__esModule = true;
    function replaceStrFormIndexArr(str, replaceStr, indexArr) {
        var arr = [];
        var result = "";
        var index = 0;
        if (!indexArr || indexArr.length < 1) {
            return str;
        }
        for (var i = 0; i < indexArr.length; i++) {
            var indexItem = indexArr[i];
            var begin = indexItem.begin;
            result = result + str.substring(index, begin) + replaceStr;
            index = indexItem.end + 1;
            if (i == indexArr.length - 1) {
                result = result + str.substring(index);
            }
        }
        return result;
    }
    exports.replaceStrFormIndexArr = replaceStrFormIndexArr;
    function splitSql(sql) {
        var haveEnd = true;
        if (!sql.endsWith(';')) {
            sql += ';';
            haveEnd = false;
        }
        function pushSql(parser, sql) {
            if (!haveEnd && parser.index == sql.length - 1) {
                parser.sqls.push(parser.index - 1);
                parser.queue = '';
            }
            else {
                parser.sqls.push(parser.index);
                parser.queue = '';
            }
        }
        // 处理引号
        function quoteToken(parser, sql) {
            var queue = parser.queue;
            var endsWith = queue[queue.length - 1];
            if (endsWith == '\'' || endsWith == '"') {
                var nextToken = sql.indexOf(endsWith, parser.index + 1);
                if (nextToken != -1) {
                    parser.index = nextToken;
                    parser.queue = '';
                }
                else {
                    parser.index = sql.length - 1;
                }
            }
            else {
                return null;
            }
        }
        // 处理单行注释
        function singleLineCommentToken(parser, sql) {
            var queue = parser.queue;
            if (queue.endsWith('--')) {
                var nextToken = sql.indexOf('\n', parser.index + 1);
                if (nextToken != -1) {
                    parser.index = nextToken;
                    queue = '';
                }
                else {
                    parser.index = sql.length - 1;
                }
            }
            else {
                return null;
            }
        }
        // 处理多行注释
        function multipleLineCommentToken(parser, sql) {
            var queue = parser.queue;
            if (queue.endsWith('/*')) {
                var nextToken = sql.indexOf('*/', parser.index + 1);
                if (nextToken != -1) {
                    parser.index = nextToken + 1;
                    parser.queue = '';
                }
                else {
                    parser.index = sql.length - 1;
                    parser.queue = '';
                }
            }
            else {
                return null;
            }
        }
        function splitToken(parser, sql) {
            var queue = parser.queue;
            if (queue.endsWith(';')) {
                pushSql(parser, sql);
            }
            else {
                return null;
            }
        }
        var parser = {
            index: 0,
            queue: '',
            sqls: []
        };
        for (parser.index = 0; parser.index < sql.length; parser.index++) {
            var char = sql[parser.index];
            parser.queue += char;
            var tokenFuncs = [quoteToken, singleLineCommentToken, multipleLineCommentToken, splitToken];
            for (var i = 0; i < tokenFuncs.length; i++) {
                tokenFuncs[i](parser, sql);
            }
            if (parser.index == sql.length - 1 && parser.queue) {
                pushSql(parser, sql);
            }
        }
        return parser.sqls;
    }
    exports.splitSql = splitSql;
});
