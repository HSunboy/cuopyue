// Generated from antlr/spark/grammar/spark.g4 by ANTLR 4.7.1
// jshint ignore: start
var antlr4 = require('antlr4/index');
// This class defines a complete listener for a parse tree produced by sparkParser.
function sparkListener() {
    antlr4.tree.ParseTreeListener.call(this);
    return this;
}
sparkListener.prototype = Object.create(antlr4.tree.ParseTreeListener.prototype);
sparkListener.prototype.constructor = sparkListener;
// Enter a parse tree produced by sparkParser#singleStatement.
sparkListener.prototype.enterSingleStatement = function (ctx) {
};
// Exit a parse tree produced by sparkParser#singleStatement.
sparkListener.prototype.exitSingleStatement = function (ctx) {
};
// Enter a parse tree produced by sparkParser#singleExpression.
sparkListener.prototype.enterSingleExpression = function (ctx) {
};
// Exit a parse tree produced by sparkParser#singleExpression.
sparkListener.prototype.exitSingleExpression = function (ctx) {
};
// Enter a parse tree produced by sparkParser#singleTableIdentifier.
sparkListener.prototype.enterSingleTableIdentifier = function (ctx) {
};
// Exit a parse tree produced by sparkParser#singleTableIdentifier.
sparkListener.prototype.exitSingleTableIdentifier = function (ctx) {
};
// Enter a parse tree produced by sparkParser#singleFunctionIdentifier.
sparkListener.prototype.enterSingleFunctionIdentifier = function (ctx) {
};
// Exit a parse tree produced by sparkParser#singleFunctionIdentifier.
sparkListener.prototype.exitSingleFunctionIdentifier = function (ctx) {
};
// Enter a parse tree produced by sparkParser#singleDataType.
sparkListener.prototype.enterSingleDataType = function (ctx) {
};
// Exit a parse tree produced by sparkParser#singleDataType.
sparkListener.prototype.exitSingleDataType = function (ctx) {
};
// Enter a parse tree produced by sparkParser#singleTableSchema.
sparkListener.prototype.enterSingleTableSchema = function (ctx) {
};
// Exit a parse tree produced by sparkParser#singleTableSchema.
sparkListener.prototype.exitSingleTableSchema = function (ctx) {
};
// Enter a parse tree produced by sparkParser#statementDefault.
sparkListener.prototype.enterStatementDefault = function (ctx) {
};
// Exit a parse tree produced by sparkParser#statementDefault.
sparkListener.prototype.exitStatementDefault = function (ctx) {
};
// Enter a parse tree produced by sparkParser#use.
sparkListener.prototype.enterUse = function (ctx) {
};
// Exit a parse tree produced by sparkParser#use.
sparkListener.prototype.exitUse = function (ctx) {
};
// Enter a parse tree produced by sparkParser#createDatabase.
sparkListener.prototype.enterCreateDatabase = function (ctx) {
};
// Exit a parse tree produced by sparkParser#createDatabase.
sparkListener.prototype.exitCreateDatabase = function (ctx) {
};
// Enter a parse tree produced by sparkParser#setDatabaseProperties.
sparkListener.prototype.enterSetDatabaseProperties = function (ctx) {
};
// Exit a parse tree produced by sparkParser#setDatabaseProperties.
sparkListener.prototype.exitSetDatabaseProperties = function (ctx) {
};
// Enter a parse tree produced by sparkParser#dropDatabase.
sparkListener.prototype.enterDropDatabase = function (ctx) {
};
// Exit a parse tree produced by sparkParser#dropDatabase.
sparkListener.prototype.exitDropDatabase = function (ctx) {
};
// Enter a parse tree produced by sparkParser#createTable.
sparkListener.prototype.enterCreateTable = function (ctx) {
};
// Exit a parse tree produced by sparkParser#createTable.
sparkListener.prototype.exitCreateTable = function (ctx) {
};
// Enter a parse tree produced by sparkParser#createHiveTable.
sparkListener.prototype.enterCreateHiveTable = function (ctx) {
};
// Exit a parse tree produced by sparkParser#createHiveTable.
sparkListener.prototype.exitCreateHiveTable = function (ctx) {
};
// Enter a parse tree produced by sparkParser#createTableLike.
sparkListener.prototype.enterCreateTableLike = function (ctx) {
};
// Exit a parse tree produced by sparkParser#createTableLike.
sparkListener.prototype.exitCreateTableLike = function (ctx) {
};
// Enter a parse tree produced by sparkParser#analyze.
sparkListener.prototype.enterAnalyze = function (ctx) {
};
// Exit a parse tree produced by sparkParser#analyze.
sparkListener.prototype.exitAnalyze = function (ctx) {
};
// Enter a parse tree produced by sparkParser#addTableColumns.
sparkListener.prototype.enterAddTableColumns = function (ctx) {
};
// Exit a parse tree produced by sparkParser#addTableColumns.
sparkListener.prototype.exitAddTableColumns = function (ctx) {
};
// Enter a parse tree produced by sparkParser#renameTable.
sparkListener.prototype.enterRenameTable = function (ctx) {
};
// Exit a parse tree produced by sparkParser#renameTable.
sparkListener.prototype.exitRenameTable = function (ctx) {
};
// Enter a parse tree produced by sparkParser#setTableProperties.
sparkListener.prototype.enterSetTableProperties = function (ctx) {
};
// Exit a parse tree produced by sparkParser#setTableProperties.
sparkListener.prototype.exitSetTableProperties = function (ctx) {
};
// Enter a parse tree produced by sparkParser#unsetTableProperties.
sparkListener.prototype.enterUnsetTableProperties = function (ctx) {
};
// Exit a parse tree produced by sparkParser#unsetTableProperties.
sparkListener.prototype.exitUnsetTableProperties = function (ctx) {
};
// Enter a parse tree produced by sparkParser#changeColumn.
sparkListener.prototype.enterChangeColumn = function (ctx) {
};
// Exit a parse tree produced by sparkParser#changeColumn.
sparkListener.prototype.exitChangeColumn = function (ctx) {
};
// Enter a parse tree produced by sparkParser#setTableSerDe.
sparkListener.prototype.enterSetTableSerDe = function (ctx) {
};
// Exit a parse tree produced by sparkParser#setTableSerDe.
sparkListener.prototype.exitSetTableSerDe = function (ctx) {
};
// Enter a parse tree produced by sparkParser#addTablePartition.
sparkListener.prototype.enterAddTablePartition = function (ctx) {
};
// Exit a parse tree produced by sparkParser#addTablePartition.
sparkListener.prototype.exitAddTablePartition = function (ctx) {
};
// Enter a parse tree produced by sparkParser#renameTablePartition.
sparkListener.prototype.enterRenameTablePartition = function (ctx) {
};
// Exit a parse tree produced by sparkParser#renameTablePartition.
sparkListener.prototype.exitRenameTablePartition = function (ctx) {
};
// Enter a parse tree produced by sparkParser#dropTablePartitions.
sparkListener.prototype.enterDropTablePartitions = function (ctx) {
};
// Exit a parse tree produced by sparkParser#dropTablePartitions.
sparkListener.prototype.exitDropTablePartitions = function (ctx) {
};
// Enter a parse tree produced by sparkParser#setTableLocation.
sparkListener.prototype.enterSetTableLocation = function (ctx) {
};
// Exit a parse tree produced by sparkParser#setTableLocation.
sparkListener.prototype.exitSetTableLocation = function (ctx) {
};
// Enter a parse tree produced by sparkParser#recoverPartitions.
sparkListener.prototype.enterRecoverPartitions = function (ctx) {
};
// Exit a parse tree produced by sparkParser#recoverPartitions.
sparkListener.prototype.exitRecoverPartitions = function (ctx) {
};
// Enter a parse tree produced by sparkParser#dropTable.
sparkListener.prototype.enterDropTable = function (ctx) {
};
// Exit a parse tree produced by sparkParser#dropTable.
sparkListener.prototype.exitDropTable = function (ctx) {
};
// Enter a parse tree produced by sparkParser#createView.
sparkListener.prototype.enterCreateView = function (ctx) {
};
// Exit a parse tree produced by sparkParser#createView.
sparkListener.prototype.exitCreateView = function (ctx) {
};
// Enter a parse tree produced by sparkParser#createTempViewUsing.
sparkListener.prototype.enterCreateTempViewUsing = function (ctx) {
};
// Exit a parse tree produced by sparkParser#createTempViewUsing.
sparkListener.prototype.exitCreateTempViewUsing = function (ctx) {
};
// Enter a parse tree produced by sparkParser#alterViewQuery.
sparkListener.prototype.enterAlterViewQuery = function (ctx) {
};
// Exit a parse tree produced by sparkParser#alterViewQuery.
sparkListener.prototype.exitAlterViewQuery = function (ctx) {
};
// Enter a parse tree produced by sparkParser#createFunction.
sparkListener.prototype.enterCreateFunction = function (ctx) {
};
// Exit a parse tree produced by sparkParser#createFunction.
sparkListener.prototype.exitCreateFunction = function (ctx) {
};
// Enter a parse tree produced by sparkParser#dropFunction.
sparkListener.prototype.enterDropFunction = function (ctx) {
};
// Exit a parse tree produced by sparkParser#dropFunction.
sparkListener.prototype.exitDropFunction = function (ctx) {
};
// Enter a parse tree produced by sparkParser#explain.
sparkListener.prototype.enterExplain = function (ctx) {
};
// Exit a parse tree produced by sparkParser#explain.
sparkListener.prototype.exitExplain = function (ctx) {
};
// Enter a parse tree produced by sparkParser#showTables.
sparkListener.prototype.enterShowTables = function (ctx) {
};
// Exit a parse tree produced by sparkParser#showTables.
sparkListener.prototype.exitShowTables = function (ctx) {
};
// Enter a parse tree produced by sparkParser#showTable.
sparkListener.prototype.enterShowTable = function (ctx) {
};
// Exit a parse tree produced by sparkParser#showTable.
sparkListener.prototype.exitShowTable = function (ctx) {
};
// Enter a parse tree produced by sparkParser#showDatabases.
sparkListener.prototype.enterShowDatabases = function (ctx) {
};
// Exit a parse tree produced by sparkParser#showDatabases.
sparkListener.prototype.exitShowDatabases = function (ctx) {
};
// Enter a parse tree produced by sparkParser#showTblProperties.
sparkListener.prototype.enterShowTblProperties = function (ctx) {
};
// Exit a parse tree produced by sparkParser#showTblProperties.
sparkListener.prototype.exitShowTblProperties = function (ctx) {
};
// Enter a parse tree produced by sparkParser#showColumns.
sparkListener.prototype.enterShowColumns = function (ctx) {
};
// Exit a parse tree produced by sparkParser#showColumns.
sparkListener.prototype.exitShowColumns = function (ctx) {
};
// Enter a parse tree produced by sparkParser#showPartitions.
sparkListener.prototype.enterShowPartitions = function (ctx) {
};
// Exit a parse tree produced by sparkParser#showPartitions.
sparkListener.prototype.exitShowPartitions = function (ctx) {
};
// Enter a parse tree produced by sparkParser#showFunctions.
sparkListener.prototype.enterShowFunctions = function (ctx) {
};
// Exit a parse tree produced by sparkParser#showFunctions.
sparkListener.prototype.exitShowFunctions = function (ctx) {
};
// Enter a parse tree produced by sparkParser#showCreateTable.
sparkListener.prototype.enterShowCreateTable = function (ctx) {
};
// Exit a parse tree produced by sparkParser#showCreateTable.
sparkListener.prototype.exitShowCreateTable = function (ctx) {
};
// Enter a parse tree produced by sparkParser#describeFunction.
sparkListener.prototype.enterDescribeFunction = function (ctx) {
};
// Exit a parse tree produced by sparkParser#describeFunction.
sparkListener.prototype.exitDescribeFunction = function (ctx) {
};
// Enter a parse tree produced by sparkParser#describeDatabase.
sparkListener.prototype.enterDescribeDatabase = function (ctx) {
};
// Exit a parse tree produced by sparkParser#describeDatabase.
sparkListener.prototype.exitDescribeDatabase = function (ctx) {
};
// Enter a parse tree produced by sparkParser#describeTable.
sparkListener.prototype.enterDescribeTable = function (ctx) {
};
// Exit a parse tree produced by sparkParser#describeTable.
sparkListener.prototype.exitDescribeTable = function (ctx) {
};
// Enter a parse tree produced by sparkParser#refreshTable.
sparkListener.prototype.enterRefreshTable = function (ctx) {
};
// Exit a parse tree produced by sparkParser#refreshTable.
sparkListener.prototype.exitRefreshTable = function (ctx) {
};
// Enter a parse tree produced by sparkParser#refreshResource.
sparkListener.prototype.enterRefreshResource = function (ctx) {
};
// Exit a parse tree produced by sparkParser#refreshResource.
sparkListener.prototype.exitRefreshResource = function (ctx) {
};
// Enter a parse tree produced by sparkParser#cacheTable.
sparkListener.prototype.enterCacheTable = function (ctx) {
};
// Exit a parse tree produced by sparkParser#cacheTable.
sparkListener.prototype.exitCacheTable = function (ctx) {
};
// Enter a parse tree produced by sparkParser#uncacheTable.
sparkListener.prototype.enterUncacheTable = function (ctx) {
};
// Exit a parse tree produced by sparkParser#uncacheTable.
sparkListener.prototype.exitUncacheTable = function (ctx) {
};
// Enter a parse tree produced by sparkParser#clearCache.
sparkListener.prototype.enterClearCache = function (ctx) {
};
// Exit a parse tree produced by sparkParser#clearCache.
sparkListener.prototype.exitClearCache = function (ctx) {
};
// Enter a parse tree produced by sparkParser#loadData.
sparkListener.prototype.enterLoadData = function (ctx) {
};
// Exit a parse tree produced by sparkParser#loadData.
sparkListener.prototype.exitLoadData = function (ctx) {
};
// Enter a parse tree produced by sparkParser#truncateTable.
sparkListener.prototype.enterTruncateTable = function (ctx) {
};
// Exit a parse tree produced by sparkParser#truncateTable.
sparkListener.prototype.exitTruncateTable = function (ctx) {
};
// Enter a parse tree produced by sparkParser#repairTable.
sparkListener.prototype.enterRepairTable = function (ctx) {
};
// Exit a parse tree produced by sparkParser#repairTable.
sparkListener.prototype.exitRepairTable = function (ctx) {
};
// Enter a parse tree produced by sparkParser#manageResource.
sparkListener.prototype.enterManageResource = function (ctx) {
};
// Exit a parse tree produced by sparkParser#manageResource.
sparkListener.prototype.exitManageResource = function (ctx) {
};
// Enter a parse tree produced by sparkParser#failNativeCommand.
sparkListener.prototype.enterFailNativeCommand = function (ctx) {
};
// Exit a parse tree produced by sparkParser#failNativeCommand.
sparkListener.prototype.exitFailNativeCommand = function (ctx) {
};
// Enter a parse tree produced by sparkParser#setConfiguration.
sparkListener.prototype.enterSetConfiguration = function (ctx) {
};
// Exit a parse tree produced by sparkParser#setConfiguration.
sparkListener.prototype.exitSetConfiguration = function (ctx) {
};
// Enter a parse tree produced by sparkParser#resetConfiguration.
sparkListener.prototype.enterResetConfiguration = function (ctx) {
};
// Exit a parse tree produced by sparkParser#resetConfiguration.
sparkListener.prototype.exitResetConfiguration = function (ctx) {
};
// Enter a parse tree produced by sparkParser#unsupportedHiveNativeCommands.
sparkListener.prototype.enterUnsupportedHiveNativeCommands = function (ctx) {
};
// Exit a parse tree produced by sparkParser#unsupportedHiveNativeCommands.
sparkListener.prototype.exitUnsupportedHiveNativeCommands = function (ctx) {
};
// Enter a parse tree produced by sparkParser#createTableHeader.
sparkListener.prototype.enterCreateTableHeader = function (ctx) {
};
// Exit a parse tree produced by sparkParser#createTableHeader.
sparkListener.prototype.exitCreateTableHeader = function (ctx) {
};
// Enter a parse tree produced by sparkParser#bucketSpec.
sparkListener.prototype.enterBucketSpec = function (ctx) {
};
// Exit a parse tree produced by sparkParser#bucketSpec.
sparkListener.prototype.exitBucketSpec = function (ctx) {
};
// Enter a parse tree produced by sparkParser#skewSpec.
sparkListener.prototype.enterSkewSpec = function (ctx) {
};
// Exit a parse tree produced by sparkParser#skewSpec.
sparkListener.prototype.exitSkewSpec = function (ctx) {
};
// Enter a parse tree produced by sparkParser#locationSpec.
sparkListener.prototype.enterLocationSpec = function (ctx) {
};
// Exit a parse tree produced by sparkParser#locationSpec.
sparkListener.prototype.exitLocationSpec = function (ctx) {
};
// Enter a parse tree produced by sparkParser#query.
sparkListener.prototype.enterQuery = function (ctx) {
};
// Exit a parse tree produced by sparkParser#query.
sparkListener.prototype.exitQuery = function (ctx) {
};
// Enter a parse tree produced by sparkParser#insertOverwriteTable.
sparkListener.prototype.enterInsertOverwriteTable = function (ctx) {
};
// Exit a parse tree produced by sparkParser#insertOverwriteTable.
sparkListener.prototype.exitInsertOverwriteTable = function (ctx) {
};
// Enter a parse tree produced by sparkParser#insertIntoTable.
sparkListener.prototype.enterInsertIntoTable = function (ctx) {
};
// Exit a parse tree produced by sparkParser#insertIntoTable.
sparkListener.prototype.exitInsertIntoTable = function (ctx) {
};
// Enter a parse tree produced by sparkParser#insertOverwriteHiveDir.
sparkListener.prototype.enterInsertOverwriteHiveDir = function (ctx) {
};
// Exit a parse tree produced by sparkParser#insertOverwriteHiveDir.
sparkListener.prototype.exitInsertOverwriteHiveDir = function (ctx) {
};
// Enter a parse tree produced by sparkParser#insertOverwriteDir.
sparkListener.prototype.enterInsertOverwriteDir = function (ctx) {
};
// Exit a parse tree produced by sparkParser#insertOverwriteDir.
sparkListener.prototype.exitInsertOverwriteDir = function (ctx) {
};
// Enter a parse tree produced by sparkParser#partitionSpecLocation.
sparkListener.prototype.enterPartitionSpecLocation = function (ctx) {
};
// Exit a parse tree produced by sparkParser#partitionSpecLocation.
sparkListener.prototype.exitPartitionSpecLocation = function (ctx) {
};
// Enter a parse tree produced by sparkParser#partitionSpec.
sparkListener.prototype.enterPartitionSpec = function (ctx) {
};
// Exit a parse tree produced by sparkParser#partitionSpec.
sparkListener.prototype.exitPartitionSpec = function (ctx) {
};
// Enter a parse tree produced by sparkParser#partitionVal.
sparkListener.prototype.enterPartitionVal = function (ctx) {
};
// Exit a parse tree produced by sparkParser#partitionVal.
sparkListener.prototype.exitPartitionVal = function (ctx) {
};
// Enter a parse tree produced by sparkParser#describeFuncName.
sparkListener.prototype.enterDescribeFuncName = function (ctx) {
};
// Exit a parse tree produced by sparkParser#describeFuncName.
sparkListener.prototype.exitDescribeFuncName = function (ctx) {
};
// Enter a parse tree produced by sparkParser#describeColName.
sparkListener.prototype.enterDescribeColName = function (ctx) {
};
// Exit a parse tree produced by sparkParser#describeColName.
sparkListener.prototype.exitDescribeColName = function (ctx) {
};
// Enter a parse tree produced by sparkParser#ctes.
sparkListener.prototype.enterCtes = function (ctx) {
};
// Exit a parse tree produced by sparkParser#ctes.
sparkListener.prototype.exitCtes = function (ctx) {
};
// Enter a parse tree produced by sparkParser#namedQuery.
sparkListener.prototype.enterNamedQuery = function (ctx) {
};
// Exit a parse tree produced by sparkParser#namedQuery.
sparkListener.prototype.exitNamedQuery = function (ctx) {
};
// Enter a parse tree produced by sparkParser#tableProvider.
sparkListener.prototype.enterTableProvider = function (ctx) {
};
// Exit a parse tree produced by sparkParser#tableProvider.
sparkListener.prototype.exitTableProvider = function (ctx) {
};
// Enter a parse tree produced by sparkParser#tablePropertyList.
sparkListener.prototype.enterTablePropertyList = function (ctx) {
};
// Exit a parse tree produced by sparkParser#tablePropertyList.
sparkListener.prototype.exitTablePropertyList = function (ctx) {
};
// Enter a parse tree produced by sparkParser#tableProperty.
sparkListener.prototype.enterTableProperty = function (ctx) {
};
// Exit a parse tree produced by sparkParser#tableProperty.
sparkListener.prototype.exitTableProperty = function (ctx) {
};
// Enter a parse tree produced by sparkParser#tablePropertyKey.
sparkListener.prototype.enterTablePropertyKey = function (ctx) {
};
// Exit a parse tree produced by sparkParser#tablePropertyKey.
sparkListener.prototype.exitTablePropertyKey = function (ctx) {
};
// Enter a parse tree produced by sparkParser#tablePropertyValue.
sparkListener.prototype.enterTablePropertyValue = function (ctx) {
};
// Exit a parse tree produced by sparkParser#tablePropertyValue.
sparkListener.prototype.exitTablePropertyValue = function (ctx) {
};
// Enter a parse tree produced by sparkParser#constantList.
sparkListener.prototype.enterConstantList = function (ctx) {
};
// Exit a parse tree produced by sparkParser#constantList.
sparkListener.prototype.exitConstantList = function (ctx) {
};
// Enter a parse tree produced by sparkParser#nestedConstantList.
sparkListener.prototype.enterNestedConstantList = function (ctx) {
};
// Exit a parse tree produced by sparkParser#nestedConstantList.
sparkListener.prototype.exitNestedConstantList = function (ctx) {
};
// Enter a parse tree produced by sparkParser#createFileFormat.
sparkListener.prototype.enterCreateFileFormat = function (ctx) {
};
// Exit a parse tree produced by sparkParser#createFileFormat.
sparkListener.prototype.exitCreateFileFormat = function (ctx) {
};
// Enter a parse tree produced by sparkParser#tableFileFormat.
sparkListener.prototype.enterTableFileFormat = function (ctx) {
};
// Exit a parse tree produced by sparkParser#tableFileFormat.
sparkListener.prototype.exitTableFileFormat = function (ctx) {
};
// Enter a parse tree produced by sparkParser#genericFileFormat.
sparkListener.prototype.enterGenericFileFormat = function (ctx) {
};
// Exit a parse tree produced by sparkParser#genericFileFormat.
sparkListener.prototype.exitGenericFileFormat = function (ctx) {
};
// Enter a parse tree produced by sparkParser#storageHandler.
sparkListener.prototype.enterStorageHandler = function (ctx) {
};
// Exit a parse tree produced by sparkParser#storageHandler.
sparkListener.prototype.exitStorageHandler = function (ctx) {
};
// Enter a parse tree produced by sparkParser#resource.
sparkListener.prototype.enterResource = function (ctx) {
};
// Exit a parse tree produced by sparkParser#resource.
sparkListener.prototype.exitResource = function (ctx) {
};
// Enter a parse tree produced by sparkParser#singleInsertQuery.
sparkListener.prototype.enterSingleInsertQuery = function (ctx) {
};
// Exit a parse tree produced by sparkParser#singleInsertQuery.
sparkListener.prototype.exitSingleInsertQuery = function (ctx) {
};
// Enter a parse tree produced by sparkParser#multiInsertQuery.
sparkListener.prototype.enterMultiInsertQuery = function (ctx) {
};
// Exit a parse tree produced by sparkParser#multiInsertQuery.
sparkListener.prototype.exitMultiInsertQuery = function (ctx) {
};
// Enter a parse tree produced by sparkParser#queryOrganization.
sparkListener.prototype.enterQueryOrganization = function (ctx) {
};
// Exit a parse tree produced by sparkParser#queryOrganization.
sparkListener.prototype.exitQueryOrganization = function (ctx) {
};
// Enter a parse tree produced by sparkParser#multiInsertQueryBody.
sparkListener.prototype.enterMultiInsertQueryBody = function (ctx) {
};
// Exit a parse tree produced by sparkParser#multiInsertQueryBody.
sparkListener.prototype.exitMultiInsertQueryBody = function (ctx) {
};
// Enter a parse tree produced by sparkParser#queryTermDefault.
sparkListener.prototype.enterQueryTermDefault = function (ctx) {
};
// Exit a parse tree produced by sparkParser#queryTermDefault.
sparkListener.prototype.exitQueryTermDefault = function (ctx) {
};
// Enter a parse tree produced by sparkParser#setOperation.
sparkListener.prototype.enterSetOperation = function (ctx) {
};
// Exit a parse tree produced by sparkParser#setOperation.
sparkListener.prototype.exitSetOperation = function (ctx) {
};
// Enter a parse tree produced by sparkParser#queryPrimaryDefault.
sparkListener.prototype.enterQueryPrimaryDefault = function (ctx) {
};
// Exit a parse tree produced by sparkParser#queryPrimaryDefault.
sparkListener.prototype.exitQueryPrimaryDefault = function (ctx) {
};
// Enter a parse tree produced by sparkParser#table.
sparkListener.prototype.enterTable = function (ctx) {
};
// Exit a parse tree produced by sparkParser#table.
sparkListener.prototype.exitTable = function (ctx) {
};
// Enter a parse tree produced by sparkParser#inlineTableDefault1.
sparkListener.prototype.enterInlineTableDefault1 = function (ctx) {
};
// Exit a parse tree produced by sparkParser#inlineTableDefault1.
sparkListener.prototype.exitInlineTableDefault1 = function (ctx) {
};
// Enter a parse tree produced by sparkParser#subquery.
sparkListener.prototype.enterSubquery = function (ctx) {
};
// Exit a parse tree produced by sparkParser#subquery.
sparkListener.prototype.exitSubquery = function (ctx) {
};
// Enter a parse tree produced by sparkParser#sortItem.
sparkListener.prototype.enterSortItem = function (ctx) {
};
// Exit a parse tree produced by sparkParser#sortItem.
sparkListener.prototype.exitSortItem = function (ctx) {
};
// Enter a parse tree produced by sparkParser#querySpecification.
sparkListener.prototype.enterQuerySpecification = function (ctx) {
};
// Exit a parse tree produced by sparkParser#querySpecification.
sparkListener.prototype.exitQuerySpecification = function (ctx) {
};
// Enter a parse tree produced by sparkParser#hint.
sparkListener.prototype.enterHint = function (ctx) {
};
// Exit a parse tree produced by sparkParser#hint.
sparkListener.prototype.exitHint = function (ctx) {
};
// Enter a parse tree produced by sparkParser#hintStatement.
sparkListener.prototype.enterHintStatement = function (ctx) {
};
// Exit a parse tree produced by sparkParser#hintStatement.
sparkListener.prototype.exitHintStatement = function (ctx) {
};
// Enter a parse tree produced by sparkParser#fromClause.
sparkListener.prototype.enterFromClause = function (ctx) {
};
// Exit a parse tree produced by sparkParser#fromClause.
sparkListener.prototype.exitFromClause = function (ctx) {
};
// Enter a parse tree produced by sparkParser#aggregation.
sparkListener.prototype.enterAggregation = function (ctx) {
};
// Exit a parse tree produced by sparkParser#aggregation.
sparkListener.prototype.exitAggregation = function (ctx) {
};
// Enter a parse tree produced by sparkParser#groupingSet.
sparkListener.prototype.enterGroupingSet = function (ctx) {
};
// Exit a parse tree produced by sparkParser#groupingSet.
sparkListener.prototype.exitGroupingSet = function (ctx) {
};
// Enter a parse tree produced by sparkParser#pivotClause.
sparkListener.prototype.enterPivotClause = function (ctx) {
};
// Exit a parse tree produced by sparkParser#pivotClause.
sparkListener.prototype.exitPivotClause = function (ctx) {
};
// Enter a parse tree produced by sparkParser#pivotColumn.
sparkListener.prototype.enterPivotColumn = function (ctx) {
};
// Exit a parse tree produced by sparkParser#pivotColumn.
sparkListener.prototype.exitPivotColumn = function (ctx) {
};
// Enter a parse tree produced by sparkParser#pivotValue.
sparkListener.prototype.enterPivotValue = function (ctx) {
};
// Exit a parse tree produced by sparkParser#pivotValue.
sparkListener.prototype.exitPivotValue = function (ctx) {
};
// Enter a parse tree produced by sparkParser#lateralView.
sparkListener.prototype.enterLateralView = function (ctx) {
};
// Exit a parse tree produced by sparkParser#lateralView.
sparkListener.prototype.exitLateralView = function (ctx) {
};
// Enter a parse tree produced by sparkParser#setQuantifier.
sparkListener.prototype.enterSetQuantifier = function (ctx) {
};
// Exit a parse tree produced by sparkParser#setQuantifier.
sparkListener.prototype.exitSetQuantifier = function (ctx) {
};
// Enter a parse tree produced by sparkParser#relation.
sparkListener.prototype.enterRelation = function (ctx) {
};
// Exit a parse tree produced by sparkParser#relation.
sparkListener.prototype.exitRelation = function (ctx) {
};
// Enter a parse tree produced by sparkParser#joinRelation.
sparkListener.prototype.enterJoinRelation = function (ctx) {
};
// Exit a parse tree produced by sparkParser#joinRelation.
sparkListener.prototype.exitJoinRelation = function (ctx) {
};
// Enter a parse tree produced by sparkParser#joinType.
sparkListener.prototype.enterJoinType = function (ctx) {
};
// Exit a parse tree produced by sparkParser#joinType.
sparkListener.prototype.exitJoinType = function (ctx) {
};
// Enter a parse tree produced by sparkParser#joinCriteria.
sparkListener.prototype.enterJoinCriteria = function (ctx) {
};
// Exit a parse tree produced by sparkParser#joinCriteria.
sparkListener.prototype.exitJoinCriteria = function (ctx) {
};
// Enter a parse tree produced by sparkParser#sample.
sparkListener.prototype.enterSample = function (ctx) {
};
// Exit a parse tree produced by sparkParser#sample.
sparkListener.prototype.exitSample = function (ctx) {
};
// Enter a parse tree produced by sparkParser#sampleByPercentile.
sparkListener.prototype.enterSampleByPercentile = function (ctx) {
};
// Exit a parse tree produced by sparkParser#sampleByPercentile.
sparkListener.prototype.exitSampleByPercentile = function (ctx) {
};
// Enter a parse tree produced by sparkParser#sampleByRows.
sparkListener.prototype.enterSampleByRows = function (ctx) {
};
// Exit a parse tree produced by sparkParser#sampleByRows.
sparkListener.prototype.exitSampleByRows = function (ctx) {
};
// Enter a parse tree produced by sparkParser#sampleByBucket.
sparkListener.prototype.enterSampleByBucket = function (ctx) {
};
// Exit a parse tree produced by sparkParser#sampleByBucket.
sparkListener.prototype.exitSampleByBucket = function (ctx) {
};
// Enter a parse tree produced by sparkParser#sampleByBytes.
sparkListener.prototype.enterSampleByBytes = function (ctx) {
};
// Exit a parse tree produced by sparkParser#sampleByBytes.
sparkListener.prototype.exitSampleByBytes = function (ctx) {
};
// Enter a parse tree produced by sparkParser#identifierList.
sparkListener.prototype.enterIdentifierList = function (ctx) {
};
// Exit a parse tree produced by sparkParser#identifierList.
sparkListener.prototype.exitIdentifierList = function (ctx) {
};
// Enter a parse tree produced by sparkParser#identifierSeq.
sparkListener.prototype.enterIdentifierSeq = function (ctx) {
};
// Exit a parse tree produced by sparkParser#identifierSeq.
sparkListener.prototype.exitIdentifierSeq = function (ctx) {
};
// Enter a parse tree produced by sparkParser#orderedIdentifierList.
sparkListener.prototype.enterOrderedIdentifierList = function (ctx) {
};
// Exit a parse tree produced by sparkParser#orderedIdentifierList.
sparkListener.prototype.exitOrderedIdentifierList = function (ctx) {
};
// Enter a parse tree produced by sparkParser#orderedIdentifier.
sparkListener.prototype.enterOrderedIdentifier = function (ctx) {
};
// Exit a parse tree produced by sparkParser#orderedIdentifier.
sparkListener.prototype.exitOrderedIdentifier = function (ctx) {
};
// Enter a parse tree produced by sparkParser#identifierCommentList.
sparkListener.prototype.enterIdentifierCommentList = function (ctx) {
};
// Exit a parse tree produced by sparkParser#identifierCommentList.
sparkListener.prototype.exitIdentifierCommentList = function (ctx) {
};
// Enter a parse tree produced by sparkParser#identifierComment.
sparkListener.prototype.enterIdentifierComment = function (ctx) {
};
// Exit a parse tree produced by sparkParser#identifierComment.
sparkListener.prototype.exitIdentifierComment = function (ctx) {
};
// Enter a parse tree produced by sparkParser#tableName.
sparkListener.prototype.enterTableName = function (ctx) {
};
// Exit a parse tree produced by sparkParser#tableName.
sparkListener.prototype.exitTableName = function (ctx) {
};
// Enter a parse tree produced by sparkParser#aliasedQuery.
sparkListener.prototype.enterAliasedQuery = function (ctx) {
};
// Exit a parse tree produced by sparkParser#aliasedQuery.
sparkListener.prototype.exitAliasedQuery = function (ctx) {
};
// Enter a parse tree produced by sparkParser#aliasedRelation.
sparkListener.prototype.enterAliasedRelation = function (ctx) {
};
// Exit a parse tree produced by sparkParser#aliasedRelation.
sparkListener.prototype.exitAliasedRelation = function (ctx) {
};
// Enter a parse tree produced by sparkParser#inlineTableDefault2.
sparkListener.prototype.enterInlineTableDefault2 = function (ctx) {
};
// Exit a parse tree produced by sparkParser#inlineTableDefault2.
sparkListener.prototype.exitInlineTableDefault2 = function (ctx) {
};
// Enter a parse tree produced by sparkParser#tableValuedFunction.
sparkListener.prototype.enterTableValuedFunction = function (ctx) {
};
// Exit a parse tree produced by sparkParser#tableValuedFunction.
sparkListener.prototype.exitTableValuedFunction = function (ctx) {
};
// Enter a parse tree produced by sparkParser#inlineTable.
sparkListener.prototype.enterInlineTable = function (ctx) {
};
// Exit a parse tree produced by sparkParser#inlineTable.
sparkListener.prototype.exitInlineTable = function (ctx) {
};
// Enter a parse tree produced by sparkParser#functionTable.
sparkListener.prototype.enterFunctionTable = function (ctx) {
};
// Exit a parse tree produced by sparkParser#functionTable.
sparkListener.prototype.exitFunctionTable = function (ctx) {
};
// Enter a parse tree produced by sparkParser#tableAlias.
sparkListener.prototype.enterTableAlias = function (ctx) {
};
// Exit a parse tree produced by sparkParser#tableAlias.
sparkListener.prototype.exitTableAlias = function (ctx) {
};
// Enter a parse tree produced by sparkParser#rowFormatSerde.
sparkListener.prototype.enterRowFormatSerde = function (ctx) {
};
// Exit a parse tree produced by sparkParser#rowFormatSerde.
sparkListener.prototype.exitRowFormatSerde = function (ctx) {
};
// Enter a parse tree produced by sparkParser#rowFormatDelimited.
sparkListener.prototype.enterRowFormatDelimited = function (ctx) {
};
// Exit a parse tree produced by sparkParser#rowFormatDelimited.
sparkListener.prototype.exitRowFormatDelimited = function (ctx) {
};
// Enter a parse tree produced by sparkParser#tableIdentifier.
sparkListener.prototype.enterTableIdentifier = function (ctx) {
};
// Exit a parse tree produced by sparkParser#tableIdentifier.
sparkListener.prototype.exitTableIdentifier = function (ctx) {
};
// Enter a parse tree produced by sparkParser#functionIdentifier.
sparkListener.prototype.enterFunctionIdentifier = function (ctx) {
};
// Exit a parse tree produced by sparkParser#functionIdentifier.
sparkListener.prototype.exitFunctionIdentifier = function (ctx) {
};
// Enter a parse tree produced by sparkParser#namedExpression.
sparkListener.prototype.enterNamedExpression = function (ctx) {
};
// Exit a parse tree produced by sparkParser#namedExpression.
sparkListener.prototype.exitNamedExpression = function (ctx) {
};
// Enter a parse tree produced by sparkParser#namedExpressionSeq.
sparkListener.prototype.enterNamedExpressionSeq = function (ctx) {
};
// Exit a parse tree produced by sparkParser#namedExpressionSeq.
sparkListener.prototype.exitNamedExpressionSeq = function (ctx) {
};
// Enter a parse tree produced by sparkParser#expression.
sparkListener.prototype.enterExpression = function (ctx) {
};
// Exit a parse tree produced by sparkParser#expression.
sparkListener.prototype.exitExpression = function (ctx) {
};
// Enter a parse tree produced by sparkParser#logicalNot.
sparkListener.prototype.enterLogicalNot = function (ctx) {
};
// Exit a parse tree produced by sparkParser#logicalNot.
sparkListener.prototype.exitLogicalNot = function (ctx) {
};
// Enter a parse tree produced by sparkParser#predicated.
sparkListener.prototype.enterPredicated = function (ctx) {
};
// Exit a parse tree produced by sparkParser#predicated.
sparkListener.prototype.exitPredicated = function (ctx) {
};
// Enter a parse tree produced by sparkParser#exists.
sparkListener.prototype.enterExists = function (ctx) {
};
// Exit a parse tree produced by sparkParser#exists.
sparkListener.prototype.exitExists = function (ctx) {
};
// Enter a parse tree produced by sparkParser#logicalBinary.
sparkListener.prototype.enterLogicalBinary = function (ctx) {
};
// Exit a parse tree produced by sparkParser#logicalBinary.
sparkListener.prototype.exitLogicalBinary = function (ctx) {
};
// Enter a parse tree produced by sparkParser#predicate.
sparkListener.prototype.enterPredicate = function (ctx) {
};
// Exit a parse tree produced by sparkParser#predicate.
sparkListener.prototype.exitPredicate = function (ctx) {
};
// Enter a parse tree produced by sparkParser#valueExpressionDefault.
sparkListener.prototype.enterValueExpressionDefault = function (ctx) {
};
// Exit a parse tree produced by sparkParser#valueExpressionDefault.
sparkListener.prototype.exitValueExpressionDefault = function (ctx) {
};
// Enter a parse tree produced by sparkParser#comparison.
sparkListener.prototype.enterComparison = function (ctx) {
};
// Exit a parse tree produced by sparkParser#comparison.
sparkListener.prototype.exitComparison = function (ctx) {
};
// Enter a parse tree produced by sparkParser#arithmeticBinary.
sparkListener.prototype.enterArithmeticBinary = function (ctx) {
};
// Exit a parse tree produced by sparkParser#arithmeticBinary.
sparkListener.prototype.exitArithmeticBinary = function (ctx) {
};
// Enter a parse tree produced by sparkParser#arithmeticUnary.
sparkListener.prototype.enterArithmeticUnary = function (ctx) {
};
// Exit a parse tree produced by sparkParser#arithmeticUnary.
sparkListener.prototype.exitArithmeticUnary = function (ctx) {
};
// Enter a parse tree produced by sparkParser#struct.
sparkListener.prototype.enterStruct = function (ctx) {
};
// Exit a parse tree produced by sparkParser#struct.
sparkListener.prototype.exitStruct = function (ctx) {
};
// Enter a parse tree produced by sparkParser#dereference.
sparkListener.prototype.enterDereference = function (ctx) {
};
// Exit a parse tree produced by sparkParser#dereference.
sparkListener.prototype.exitDereference = function (ctx) {
};
// Enter a parse tree produced by sparkParser#simpleCase.
sparkListener.prototype.enterSimpleCase = function (ctx) {
};
// Exit a parse tree produced by sparkParser#simpleCase.
sparkListener.prototype.exitSimpleCase = function (ctx) {
};
// Enter a parse tree produced by sparkParser#columnReference.
sparkListener.prototype.enterColumnReference = function (ctx) {
};
// Exit a parse tree produced by sparkParser#columnReference.
sparkListener.prototype.exitColumnReference = function (ctx) {
};
// Enter a parse tree produced by sparkParser#rowConstructor.
sparkListener.prototype.enterRowConstructor = function (ctx) {
};
// Exit a parse tree produced by sparkParser#rowConstructor.
sparkListener.prototype.exitRowConstructor = function (ctx) {
};
// Enter a parse tree produced by sparkParser#last.
sparkListener.prototype.enterLast = function (ctx) {
};
// Exit a parse tree produced by sparkParser#last.
sparkListener.prototype.exitLast = function (ctx) {
};
// Enter a parse tree produced by sparkParser#star.
sparkListener.prototype.enterStar = function (ctx) {
};
// Exit a parse tree produced by sparkParser#star.
sparkListener.prototype.exitStar = function (ctx) {
};
// Enter a parse tree produced by sparkParser#subscript.
sparkListener.prototype.enterSubscript = function (ctx) {
};
// Exit a parse tree produced by sparkParser#subscript.
sparkListener.prototype.exitSubscript = function (ctx) {
};
// Enter a parse tree produced by sparkParser#subqueryExpression.
sparkListener.prototype.enterSubqueryExpression = function (ctx) {
};
// Exit a parse tree produced by sparkParser#subqueryExpression.
sparkListener.prototype.exitSubqueryExpression = function (ctx) {
};
// Enter a parse tree produced by sparkParser#cast.
sparkListener.prototype.enterCast = function (ctx) {
};
// Exit a parse tree produced by sparkParser#cast.
sparkListener.prototype.exitCast = function (ctx) {
};
// Enter a parse tree produced by sparkParser#constantDefault.
sparkListener.prototype.enterConstantDefault = function (ctx) {
};
// Exit a parse tree produced by sparkParser#constantDefault.
sparkListener.prototype.exitConstantDefault = function (ctx) {
};
// Enter a parse tree produced by sparkParser#lambda.
sparkListener.prototype.enterLambda = function (ctx) {
};
// Exit a parse tree produced by sparkParser#lambda.
sparkListener.prototype.exitLambda = function (ctx) {
};
// Enter a parse tree produced by sparkParser#parenthesizedExpression.
sparkListener.prototype.enterParenthesizedExpression = function (ctx) {
};
// Exit a parse tree produced by sparkParser#parenthesizedExpression.
sparkListener.prototype.exitParenthesizedExpression = function (ctx) {
};
// Enter a parse tree produced by sparkParser#extract.
sparkListener.prototype.enterExtract = function (ctx) {
};
// Exit a parse tree produced by sparkParser#extract.
sparkListener.prototype.exitExtract = function (ctx) {
};
// Enter a parse tree produced by sparkParser#functionCall.
sparkListener.prototype.enterFunctionCall = function (ctx) {
};
// Exit a parse tree produced by sparkParser#functionCall.
sparkListener.prototype.exitFunctionCall = function (ctx) {
};
// Enter a parse tree produced by sparkParser#searchedCase.
sparkListener.prototype.enterSearchedCase = function (ctx) {
};
// Exit a parse tree produced by sparkParser#searchedCase.
sparkListener.prototype.exitSearchedCase = function (ctx) {
};
// Enter a parse tree produced by sparkParser#position.
sparkListener.prototype.enterPosition = function (ctx) {
};
// Exit a parse tree produced by sparkParser#position.
sparkListener.prototype.exitPosition = function (ctx) {
};
// Enter a parse tree produced by sparkParser#first.
sparkListener.prototype.enterFirst = function (ctx) {
};
// Exit a parse tree produced by sparkParser#first.
sparkListener.prototype.exitFirst = function (ctx) {
};
// Enter a parse tree produced by sparkParser#nullLiteral.
sparkListener.prototype.enterNullLiteral = function (ctx) {
};
// Exit a parse tree produced by sparkParser#nullLiteral.
sparkListener.prototype.exitNullLiteral = function (ctx) {
};
// Enter a parse tree produced by sparkParser#intervalLiteral.
sparkListener.prototype.enterIntervalLiteral = function (ctx) {
};
// Exit a parse tree produced by sparkParser#intervalLiteral.
sparkListener.prototype.exitIntervalLiteral = function (ctx) {
};
// Enter a parse tree produced by sparkParser#typeConstructor.
sparkListener.prototype.enterTypeConstructor = function (ctx) {
};
// Exit a parse tree produced by sparkParser#typeConstructor.
sparkListener.prototype.exitTypeConstructor = function (ctx) {
};
// Enter a parse tree produced by sparkParser#numericLiteral.
sparkListener.prototype.enterNumericLiteral = function (ctx) {
};
// Exit a parse tree produced by sparkParser#numericLiteral.
sparkListener.prototype.exitNumericLiteral = function (ctx) {
};
// Enter a parse tree produced by sparkParser#booleanLiteral.
sparkListener.prototype.enterBooleanLiteral = function (ctx) {
};
// Exit a parse tree produced by sparkParser#booleanLiteral.
sparkListener.prototype.exitBooleanLiteral = function (ctx) {
};
// Enter a parse tree produced by sparkParser#stringLiteral.
sparkListener.prototype.enterStringLiteral = function (ctx) {
};
// Exit a parse tree produced by sparkParser#stringLiteral.
sparkListener.prototype.exitStringLiteral = function (ctx) {
};
// Enter a parse tree produced by sparkParser#comparisonOperator.
sparkListener.prototype.enterComparisonOperator = function (ctx) {
};
// Exit a parse tree produced by sparkParser#comparisonOperator.
sparkListener.prototype.exitComparisonOperator = function (ctx) {
};
// Enter a parse tree produced by sparkParser#arithmeticOperator.
sparkListener.prototype.enterArithmeticOperator = function (ctx) {
};
// Exit a parse tree produced by sparkParser#arithmeticOperator.
sparkListener.prototype.exitArithmeticOperator = function (ctx) {
};
// Enter a parse tree produced by sparkParser#predicateOperator.
sparkListener.prototype.enterPredicateOperator = function (ctx) {
};
// Exit a parse tree produced by sparkParser#predicateOperator.
sparkListener.prototype.exitPredicateOperator = function (ctx) {
};
// Enter a parse tree produced by sparkParser#booleanValue.
sparkListener.prototype.enterBooleanValue = function (ctx) {
};
// Exit a parse tree produced by sparkParser#booleanValue.
sparkListener.prototype.exitBooleanValue = function (ctx) {
};
// Enter a parse tree produced by sparkParser#interval.
sparkListener.prototype.enterInterval = function (ctx) {
};
// Exit a parse tree produced by sparkParser#interval.
sparkListener.prototype.exitInterval = function (ctx) {
};
// Enter a parse tree produced by sparkParser#intervalField.
sparkListener.prototype.enterIntervalField = function (ctx) {
};
// Exit a parse tree produced by sparkParser#intervalField.
sparkListener.prototype.exitIntervalField = function (ctx) {
};
// Enter a parse tree produced by sparkParser#intervalValue.
sparkListener.prototype.enterIntervalValue = function (ctx) {
};
// Exit a parse tree produced by sparkParser#intervalValue.
sparkListener.prototype.exitIntervalValue = function (ctx) {
};
// Enter a parse tree produced by sparkParser#colPosition.
sparkListener.prototype.enterColPosition = function (ctx) {
};
// Exit a parse tree produced by sparkParser#colPosition.
sparkListener.prototype.exitColPosition = function (ctx) {
};
// Enter a parse tree produced by sparkParser#complexDataType.
sparkListener.prototype.enterComplexDataType = function (ctx) {
};
// Exit a parse tree produced by sparkParser#complexDataType.
sparkListener.prototype.exitComplexDataType = function (ctx) {
};
// Enter a parse tree produced by sparkParser#primitiveDataType.
sparkListener.prototype.enterPrimitiveDataType = function (ctx) {
};
// Exit a parse tree produced by sparkParser#primitiveDataType.
sparkListener.prototype.exitPrimitiveDataType = function (ctx) {
};
// Enter a parse tree produced by sparkParser#colTypeList.
sparkListener.prototype.enterColTypeList = function (ctx) {
};
// Exit a parse tree produced by sparkParser#colTypeList.
sparkListener.prototype.exitColTypeList = function (ctx) {
};
// Enter a parse tree produced by sparkParser#colType.
sparkListener.prototype.enterColType = function (ctx) {
};
// Exit a parse tree produced by sparkParser#colType.
sparkListener.prototype.exitColType = function (ctx) {
};
// Enter a parse tree produced by sparkParser#complexColTypeList.
sparkListener.prototype.enterComplexColTypeList = function (ctx) {
};
// Exit a parse tree produced by sparkParser#complexColTypeList.
sparkListener.prototype.exitComplexColTypeList = function (ctx) {
};
// Enter a parse tree produced by sparkParser#complexColType.
sparkListener.prototype.enterComplexColType = function (ctx) {
};
// Exit a parse tree produced by sparkParser#complexColType.
sparkListener.prototype.exitComplexColType = function (ctx) {
};
// Enter a parse tree produced by sparkParser#whenClause.
sparkListener.prototype.enterWhenClause = function (ctx) {
};
// Exit a parse tree produced by sparkParser#whenClause.
sparkListener.prototype.exitWhenClause = function (ctx) {
};
// Enter a parse tree produced by sparkParser#windows.
sparkListener.prototype.enterWindows = function (ctx) {
};
// Exit a parse tree produced by sparkParser#windows.
sparkListener.prototype.exitWindows = function (ctx) {
};
// Enter a parse tree produced by sparkParser#namedWindow.
sparkListener.prototype.enterNamedWindow = function (ctx) {
};
// Exit a parse tree produced by sparkParser#namedWindow.
sparkListener.prototype.exitNamedWindow = function (ctx) {
};
// Enter a parse tree produced by sparkParser#windowRef.
sparkListener.prototype.enterWindowRef = function (ctx) {
};
// Exit a parse tree produced by sparkParser#windowRef.
sparkListener.prototype.exitWindowRef = function (ctx) {
};
// Enter a parse tree produced by sparkParser#windowDef.
sparkListener.prototype.enterWindowDef = function (ctx) {
};
// Exit a parse tree produced by sparkParser#windowDef.
sparkListener.prototype.exitWindowDef = function (ctx) {
};
// Enter a parse tree produced by sparkParser#windowFrame.
sparkListener.prototype.enterWindowFrame = function (ctx) {
};
// Exit a parse tree produced by sparkParser#windowFrame.
sparkListener.prototype.exitWindowFrame = function (ctx) {
};
// Enter a parse tree produced by sparkParser#frameBound.
sparkListener.prototype.enterFrameBound = function (ctx) {
};
// Exit a parse tree produced by sparkParser#frameBound.
sparkListener.prototype.exitFrameBound = function (ctx) {
};
// Enter a parse tree produced by sparkParser#qualifiedName.
sparkListener.prototype.enterQualifiedName = function (ctx) {
};
// Exit a parse tree produced by sparkParser#qualifiedName.
sparkListener.prototype.exitQualifiedName = function (ctx) {
};
// Enter a parse tree produced by sparkParser#identifier.
sparkListener.prototype.enterIdentifier = function (ctx) {
};
// Exit a parse tree produced by sparkParser#identifier.
sparkListener.prototype.exitIdentifier = function (ctx) {
};
// Enter a parse tree produced by sparkParser#unquotedIdentifier.
sparkListener.prototype.enterUnquotedIdentifier = function (ctx) {
};
// Exit a parse tree produced by sparkParser#unquotedIdentifier.
sparkListener.prototype.exitUnquotedIdentifier = function (ctx) {
};
// Enter a parse tree produced by sparkParser#quotedIdentifierAlternative.
sparkListener.prototype.enterQuotedIdentifierAlternative = function (ctx) {
};
// Exit a parse tree produced by sparkParser#quotedIdentifierAlternative.
sparkListener.prototype.exitQuotedIdentifierAlternative = function (ctx) {
};
// Enter a parse tree produced by sparkParser#quotedIdentifier.
sparkListener.prototype.enterQuotedIdentifier = function (ctx) {
};
// Exit a parse tree produced by sparkParser#quotedIdentifier.
sparkListener.prototype.exitQuotedIdentifier = function (ctx) {
};
// Enter a parse tree produced by sparkParser#decimalLiteral.
sparkListener.prototype.enterDecimalLiteral = function (ctx) {
};
// Exit a parse tree produced by sparkParser#decimalLiteral.
sparkListener.prototype.exitDecimalLiteral = function (ctx) {
};
// Enter a parse tree produced by sparkParser#integerLiteral.
sparkListener.prototype.enterIntegerLiteral = function (ctx) {
};
// Exit a parse tree produced by sparkParser#integerLiteral.
sparkListener.prototype.exitIntegerLiteral = function (ctx) {
};
// Enter a parse tree produced by sparkParser#bigIntLiteral.
sparkListener.prototype.enterBigIntLiteral = function (ctx) {
};
// Exit a parse tree produced by sparkParser#bigIntLiteral.
sparkListener.prototype.exitBigIntLiteral = function (ctx) {
};
// Enter a parse tree produced by sparkParser#smallIntLiteral.
sparkListener.prototype.enterSmallIntLiteral = function (ctx) {
};
// Exit a parse tree produced by sparkParser#smallIntLiteral.
sparkListener.prototype.exitSmallIntLiteral = function (ctx) {
};
// Enter a parse tree produced by sparkParser#tinyIntLiteral.
sparkListener.prototype.enterTinyIntLiteral = function (ctx) {
};
// Exit a parse tree produced by sparkParser#tinyIntLiteral.
sparkListener.prototype.exitTinyIntLiteral = function (ctx) {
};
// Enter a parse tree produced by sparkParser#doubleLiteral.
sparkListener.prototype.enterDoubleLiteral = function (ctx) {
};
// Exit a parse tree produced by sparkParser#doubleLiteral.
sparkListener.prototype.exitDoubleLiteral = function (ctx) {
};
// Enter a parse tree produced by sparkParser#bigDecimalLiteral.
sparkListener.prototype.enterBigDecimalLiteral = function (ctx) {
};
// Exit a parse tree produced by sparkParser#bigDecimalLiteral.
sparkListener.prototype.exitBigDecimalLiteral = function (ctx) {
};
// Enter a parse tree produced by sparkParser#nonReserved.
sparkListener.prototype.enterNonReserved = function (ctx) {
};
// Exit a parse tree produced by sparkParser#nonReserved.
sparkListener.prototype.exitNonReserved = function (ctx) {
};
exports.sparkListener = sparkListener;
