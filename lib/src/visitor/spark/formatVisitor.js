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
        define(["require", "exports", "./base"], factory);
    }
})(function (require, exports) {
    "use strict";
    exports.__esModule = true;
    var base_1 = require("./base");
    var SparkFormatVisitor = /** @class */ (function (_super) {
        __extends(SparkFormatVisitor, _super);
        function SparkFormatVisitor() {
            // visitSingleStatement (ctx) {
            var _this = _super !== null && _super.apply(this, arguments) || this;
            // }
            _this.printArr = [];
            _this.isMerge = false;
            _this.levelArr = [];
            return _this;
        }
        SparkFormatVisitor.prototype.getSpace = function () {
            var count = this.levelArr.reduce(function (levelCount, level) {
                return levelCount + level;
            }, 0);
            return new Array(count).fill(' ').join('');
        };
        SparkFormatVisitor.prototype.pushLevel = function () {
            var lastToken = this.printArr[this.printArr.length - 1];
            var baseLength = 1;
            if (lastToken) {
                baseLength = lastToken.length + baseLength;
            }
            this.levelArr.push(baseLength);
        };
        SparkFormatVisitor.prototype.popLevel = function () {
            this.levelArr.pop();
        };
        SparkFormatVisitor.prototype.loopCtxChildren = function (ctx, callback) {
            var _a;
            var children = ctx.children;
            if ((_a = children) === null || _a === void 0 ? void 0 : _a.length) {
                children.forEach(function (child, index) {
                    var isSymbol = false;
                    var symbolText = null;
                    if (child.symbol) {
                        isSymbol = true;
                        symbolText = child.getText();
                    }
                    callback(child, isSymbol, symbolText, index);
                });
            }
        };
        SparkFormatVisitor.prototype.print = function (text) {
            if (this.isMerge) {
                this.appendPrint(text);
                return;
            }
            this.printArr.push(this.getSpace() + text);
        };
        SparkFormatVisitor.prototype.appendPrint = function (text) {
            var lastToken = this.printArr[this.printArr.length - 1];
            if (lastToken) {
                this.printArr[this.printArr.length - 1] = lastToken + (this.haveTokenSpace(text) ? ' ' : '') + text;
                return;
            }
            else {
                this.printArr.push(this.getSpace() + text);
            }
        };
        SparkFormatVisitor.prototype.haveTokenSpace = function (text) {
            return [',', ';'].indexOf(text) == -1;
        };
        SparkFormatVisitor.prototype.getFormatText = function () {
            return this.printArr.join('\n');
        };
        SparkFormatVisitor.prototype.visitLogicalBinary = function (ctx) {
            var _this = this;
            this.loopCtxChildren(ctx, function (child, isSymbol, symbolText) {
                if (isSymbol) {
                    var text = symbolText;
                    _this.print(text);
                    if (text == ctx.operator.text) {
                        _this.isMerge = true;
                    }
                }
                else {
                    child.accept(_this);
                }
            });
            this.isMerge = false;
        };
        SparkFormatVisitor.prototype.visitFromClause = function (ctx) {
            var _this = this;
            this.loopCtxChildren(ctx, function (child, isSymbol, symbolText) {
                if (isSymbol) {
                    var text = symbolText;
                    _this.print(text);
                    if (text == 'FROM') {
                        _this.isMerge = true;
                    }
                }
                else {
                    child.accept(_this);
                }
            });
            this.isMerge = false;
        };
        SparkFormatVisitor.prototype.visitExpression = function (ctx) {
            this.print(ctx.getText());
        };
        SparkFormatVisitor.prototype.visitValueExpressionDefault = function (ctx) {
            this.print(ctx.getText());
        };
        SparkFormatVisitor.prototype.visitArithmeticBinary = function (ctx) {
            this.print(ctx.getText());
        };
        SparkFormatVisitor.prototype.visitComparison = function (ctx) {
            this.print(ctx.getText());
        };
        SparkFormatVisitor.prototype.visitQuerySpecification = function (ctx) {
            var _this = this;
            this.loopCtxChildren(ctx, function (child, isSymbol, symbolText) {
                if (child.constructor.name == 'FromClauseContext') {
                    _this.isMerge = false;
                }
                if (isSymbol) {
                    var text = symbolText;
                    _this.print(text);
                    if (text == 'SELECT') {
                        _this.isMerge = true;
                    }
                }
                else {
                    child.accept(_this);
                }
            });
        };
        SparkFormatVisitor.prototype.visitChildren = function (ctx) {
            var _this = this;
            this.loopCtxChildren(ctx, function (child, isSymbol, symbolText) {
                if (isSymbol) {
                    var text = symbolText;
                    switch (text) {
                        case '<EOF>': {
                            _this.appendPrint(';');
                            return;
                        }
                        case '(': {
                            _this.print(text);
                            _this.pushLevel();
                            return;
                        }
                        case ')': {
                            _this.popLevel();
                            _this.appendPrint(text);
                            return;
                        }
                        default: {
                            _this.print(text);
                        }
                    }
                }
                else {
                    child.accept(_this);
                }
            });
            // console.log(ctx.getText())
            // console.log(ctx.__proto__.constructor)
            // // console.log(ctx)
            // return super.visitChildren(ctx);
        };
        return SparkFormatVisitor;
    }(base_1.SparkTreeVisitor));
    exports.SparkFormatVisitor = SparkFormatVisitor;
});
