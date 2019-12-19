(function (factory) {
    if (typeof module === "object" && typeof module.exports === "object") {
        var v = factory(require, exports);
        if (v !== undefined) module.exports = v;
    }
    else if (typeof define === "function" && define.amd) {
        define(["require", "exports", "./spark", "./spark"], factory);
    }
})(function (require, exports) {
    "use strict";
    exports.__esModule = true;
    var spark_1 = require("./spark");
    exports.parserSparkSql = spark_1.parser;
    var spark_2 = require("./spark");
    exports.SparkTreeVisitor = spark_2.SparkTreeVisitor;
});
