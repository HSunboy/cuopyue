const parser  = require('../lib/src').parser;
const SparkFormatVisitor = require('../lib/src').visitor.SparkFormatVisitor
console.time('a');
const sql = `SELECT name, id, sex
FROM (SELECT *
        FROM school_score
       WHERE class_cd = 110)
WHERE sex = 'man'
 AND exam_dt = '2016-06-01';`
const v = new SparkFormatVisitor();
let result = parser.parserSparkSql(sql, function(recognizer, offendingSymbol, line, column, msg, err, _parser){
    let et = recognizer.getExpectedTokens();
    console.log(et)
}, v);
console.log(v.getFormatText());
    console.timeEnd('a');
