import { SparkTreeVisitor } from './base';

export class SparkFormatVisitor extends SparkTreeVisitor {

    // visitSingleStatement (ctx) {

    // }
    private printArr: string[] = [];
    private isMerge: boolean = false;
    private levelArr: number[] = [];
    getSpace () {
        const count = this.levelArr.reduce((levelCount: number, level: number) => {
            return levelCount + level;
        }, 0);
        return new Array(count).fill(' ').join('');
    }
    pushLevel () {
        const lastToken = this.printArr[this.printArr.length - 1];
        let baseLength = 1;
        if (lastToken) {
            baseLength = lastToken.length + baseLength;
        }
        this.levelArr.push(baseLength);
    }
    popLevel() {
        this.levelArr.pop();
    }
    loopCtxChildren (ctx, callback: (child: any, isSymbol: boolean, symbolText: string, index: number) => any) {
        const children = ctx.children;
        if (children?.length) {
            children.forEach((child, index) => {
                let isSymbol = false;
                let symbolText = null;
                if (child.symbol) {
                    isSymbol = true;
                    symbolText = child.getText();
                }
                callback(child, isSymbol, symbolText, index);
            })
        }
    }
    print(text: string) {
        if (this.isMerge) {
            this.appendPrint(text)
            return;
        }
        this.printArr.push(this.getSpace() + text);
    }
    appendPrint(text: string) {
        const lastToken = this.printArr[this.printArr.length - 1];
        if (lastToken) {
            this.printArr[this.printArr.length - 1] = lastToken + (this.haveTokenSpace(text) ? ' ' : '') + text;
            return;
        } else {
            this.printArr.push(this.getSpace() + text);
        }
    }
    haveTokenSpace (text) {
        return [',', ';'].indexOf(text) == -1;
    }
    getFormatText() {
        return this.printArr.join('\n');
    }
    visitLogicalBinary(ctx) {
        this.loopCtxChildren(ctx, (child, isSymbol, symbolText) => {
            if (isSymbol) {
                const text = symbolText;
                this.print(text);
                if (text == ctx.operator.text) {
                    this.isMerge = true;
                }
            } else {
                child.accept(this);
            }
        });
        this.isMerge = false;
    }
    visitFromClause(ctx) {
        this.loopCtxChildren(ctx, (child, isSymbol, symbolText) => {
            if (isSymbol) {
                const text = symbolText;
                this.print(text);
                if (text == 'FROM') {
                    this.isMerge = true;
                }
            } else {
                child.accept(this);
            }
        });
        this.isMerge = false;
    }
    visitExpression(ctx) {
        this.print(ctx.getText());
    }
    visitValueExpressionDefault(ctx) {
        this.print(ctx.getText());
    }
    visitArithmeticBinary(ctx) {
        this.print(ctx.getText());
    }
    visitComparison(ctx) {
        this.print(ctx.getText());
    }
    
    visitQuerySpecification(ctx) {
        this.loopCtxChildren(ctx, (child, isSymbol, symbolText) => {
            if (child.constructor.name == 'FromClauseContext') {
                this.isMerge = false;
            }
            if (isSymbol) {
                const text = symbolText;
                this.print(text);
                if (text == 'SELECT') {
                    this.isMerge = true;
                }
            } else {
                child.accept(this);
            }
        })
    }
    visitChildren(ctx) {
        this.loopCtxChildren(ctx, (child, isSymbol, symbolText) => {
            if (isSymbol) {
                const text = symbolText;
                switch (text) {
                    case '<EOF>': {
                        this.appendPrint(';');
                        return;
                    }
                    case '(': {
                        this.print(text);
                        this.pushLevel();
                        return;
                    }
                    case ')': {
                        this.popLevel();
                        this.appendPrint(text);
                        return;
                    }
                    default: {
                        this.print(text);
                    }
                }
            } else {
                child.accept(this);
            }
        })
        // console.log(ctx.getText())
        // console.log(ctx.__proto__.constructor)
        // // console.log(ctx)
        // return super.visitChildren(ctx);
    }
}