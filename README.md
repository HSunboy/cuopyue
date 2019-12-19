# cuopyue
---
parse sparksql syntax

[![NPM version][npm-image]][npm-url]

[npm-image]: https://img.shields.io/npm/v/cuopyue.svg?style=flat-square
[npm-url]: https://www.npmjs.com/package/cuopyue

## Getting Started

Install cuopyue using npm:

```bash
npm install coupyue -S
```

Import coupyue in your js file

```javascript
import { parser } from 'cuopyue';
```

Then, call parserSparksql method

```javascript
const sql = 'select age, nickname from userInfo; select id, price from payInfo;'
const tree = parser.parserSparkSql(sql);
...
```
You will get an array of syntax tree.

## Complex example

### Catch Syntax Error

```javascript
import { parser } from 'cuopyue';
const sql = 'select age, nickname fr1om userInfo;'
parser.parserSparkSql(sql, (recognizer, offendingSymbol, line, column, msg) => {
    const errorText = offendingSymbol.text;
    console.error(msg);
});
```

### Get Table Name

```javascript
import { parser } from 'cuopyue';
const sql = 'select age, nickname from userInfo as u;'
class Visitor extends parser.SparkTreeVisitor {
    visitTableName (ctx) {
        const tableName = ctx.tableIdentifier().getText();
        const tableAlias = ctx.tableAlias().strictIdentifier().getText();
        super.visitTableName(ctx);
    }
}
parser.parserSparkSql(sql, null, new Visitor());
```

