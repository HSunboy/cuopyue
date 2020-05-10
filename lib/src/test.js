const parser  = require('./index');
console.time('a');
let result = parser.parserSparkSql(sql);
    console.timeEnd('a');