// Generated from antlr/spark/grammar/spark.g4 by ANTLR 4.7.1
// jshint ignore: start
var antlr4 = require('antlr4/index');

// This class defines a complete generic visitor for a parse tree produced by sparkParser.

function sparkVisitor() {
	antlr4.tree.ParseTreeVisitor.call(this);
	return this;
}

sparkVisitor.prototype = Object.create(antlr4.tree.ParseTreeVisitor.prototype);
sparkVisitor.prototype.constructor = sparkVisitor;

// Visit a parse tree produced by sparkParser#singleStatement.
sparkVisitor.prototype.visitSingleStatement = function(ctx) {
  return this.visitChildren(ctx);
};


// Visit a parse tree produced by sparkParser#singleExpression.
sparkVisitor.prototype.visitSingleExpression = function(ctx) {
  return this.visitChildren(ctx);
};


// Visit a parse tree produced by sparkParser#singleTableIdentifier.
sparkVisitor.prototype.visitSingleTableIdentifier = function(ctx) {
  return this.visitChildren(ctx);
};


// Visit a parse tree produced by sparkParser#singleFunctionIdentifier.
sparkVisitor.prototype.visitSingleFunctionIdentifier = function(ctx) {
  return this.visitChildren(ctx);
};


// Visit a parse tree produced by sparkParser#singleDataType.
sparkVisitor.prototype.visitSingleDataType = function(ctx) {
  return this.visitChildren(ctx);
};


// Visit a parse tree produced by sparkParser#singleTableSchema.
sparkVisitor.prototype.visitSingleTableSchema = function(ctx) {
  return this.visitChildren(ctx);
};


// Visit a parse tree produced by sparkParser#statementDefault.
sparkVisitor.prototype.visitStatementDefault = function(ctx) {
  return this.visitChildren(ctx);
};


// Visit a parse tree produced by sparkParser#use.
sparkVisitor.prototype.visitUse = function(ctx) {
  return this.visitChildren(ctx);
};


// Visit a parse tree produced by sparkParser#createDatabase.
sparkVisitor.prototype.visitCreateDatabase = function(ctx) {
  return this.visitChildren(ctx);
};


// Visit a parse tree produced by sparkParser#setDatabaseProperties.
sparkVisitor.prototype.visitSetDatabaseProperties = function(ctx) {
  return this.visitChildren(ctx);
};


// Visit a parse tree produced by sparkParser#dropDatabase.
sparkVisitor.prototype.visitDropDatabase = function(ctx) {
  return this.visitChildren(ctx);
};


// Visit a parse tree produced by sparkParser#createTable.
sparkVisitor.prototype.visitCreateTable = function(ctx) {
  return this.visitChildren(ctx);
};


// Visit a parse tree produced by sparkParser#createHiveTable.
sparkVisitor.prototype.visitCreateHiveTable = function(ctx) {
  return this.visitChildren(ctx);
};


// Visit a parse tree produced by sparkParser#createTableLike.
sparkVisitor.prototype.visitCreateTableLike = function(ctx) {
  return this.visitChildren(ctx);
};


// Visit a parse tree produced by sparkParser#analyze.
sparkVisitor.prototype.visitAnalyze = function(ctx) {
  return this.visitChildren(ctx);
};


// Visit a parse tree produced by sparkParser#addTableColumns.
sparkVisitor.prototype.visitAddTableColumns = function(ctx) {
  return this.visitChildren(ctx);
};


// Visit a parse tree produced by sparkParser#renameTable.
sparkVisitor.prototype.visitRenameTable = function(ctx) {
  return this.visitChildren(ctx);
};


// Visit a parse tree produced by sparkParser#setTableProperties.
sparkVisitor.prototype.visitSetTableProperties = function(ctx) {
  return this.visitChildren(ctx);
};


// Visit a parse tree produced by sparkParser#unsetTableProperties.
sparkVisitor.prototype.visitUnsetTableProperties = function(ctx) {
  return this.visitChildren(ctx);
};


// Visit a parse tree produced by sparkParser#changeColumn.
sparkVisitor.prototype.visitChangeColumn = function(ctx) {
  return this.visitChildren(ctx);
};


// Visit a parse tree produced by sparkParser#setTableSerDe.
sparkVisitor.prototype.visitSetTableSerDe = function(ctx) {
  return this.visitChildren(ctx);
};


// Visit a parse tree produced by sparkParser#addTablePartition.
sparkVisitor.prototype.visitAddTablePartition = function(ctx) {
  return this.visitChildren(ctx);
};


// Visit a parse tree produced by sparkParser#renameTablePartition.
sparkVisitor.prototype.visitRenameTablePartition = function(ctx) {
  return this.visitChildren(ctx);
};


// Visit a parse tree produced by sparkParser#dropTablePartitions.
sparkVisitor.prototype.visitDropTablePartitions = function(ctx) {
  return this.visitChildren(ctx);
};


// Visit a parse tree produced by sparkParser#setTableLocation.
sparkVisitor.prototype.visitSetTableLocation = function(ctx) {
  return this.visitChildren(ctx);
};


// Visit a parse tree produced by sparkParser#recoverPartitions.
sparkVisitor.prototype.visitRecoverPartitions = function(ctx) {
  return this.visitChildren(ctx);
};


// Visit a parse tree produced by sparkParser#dropTable.
sparkVisitor.prototype.visitDropTable = function(ctx) {
  return this.visitChildren(ctx);
};


// Visit a parse tree produced by sparkParser#createView.
sparkVisitor.prototype.visitCreateView = function(ctx) {
  return this.visitChildren(ctx);
};


// Visit a parse tree produced by sparkParser#createTempViewUsing.
sparkVisitor.prototype.visitCreateTempViewUsing = function(ctx) {
  return this.visitChildren(ctx);
};


// Visit a parse tree produced by sparkParser#alterViewQuery.
sparkVisitor.prototype.visitAlterViewQuery = function(ctx) {
  return this.visitChildren(ctx);
};


// Visit a parse tree produced by sparkParser#createFunction.
sparkVisitor.prototype.visitCreateFunction = function(ctx) {
  return this.visitChildren(ctx);
};


// Visit a parse tree produced by sparkParser#dropFunction.
sparkVisitor.prototype.visitDropFunction = function(ctx) {
  return this.visitChildren(ctx);
};


// Visit a parse tree produced by sparkParser#explain.
sparkVisitor.prototype.visitExplain = function(ctx) {
  return this.visitChildren(ctx);
};


// Visit a parse tree produced by sparkParser#showTables.
sparkVisitor.prototype.visitShowTables = function(ctx) {
  return this.visitChildren(ctx);
};


// Visit a parse tree produced by sparkParser#showTable.
sparkVisitor.prototype.visitShowTable = function(ctx) {
  return this.visitChildren(ctx);
};


// Visit a parse tree produced by sparkParser#showDatabases.
sparkVisitor.prototype.visitShowDatabases = function(ctx) {
  return this.visitChildren(ctx);
};


// Visit a parse tree produced by sparkParser#showTblProperties.
sparkVisitor.prototype.visitShowTblProperties = function(ctx) {
  return this.visitChildren(ctx);
};


// Visit a parse tree produced by sparkParser#showColumns.
sparkVisitor.prototype.visitShowColumns = function(ctx) {
  return this.visitChildren(ctx);
};


// Visit a parse tree produced by sparkParser#showPartitions.
sparkVisitor.prototype.visitShowPartitions = function(ctx) {
  return this.visitChildren(ctx);
};


// Visit a parse tree produced by sparkParser#showFunctions.
sparkVisitor.prototype.visitShowFunctions = function(ctx) {
  return this.visitChildren(ctx);
};


// Visit a parse tree produced by sparkParser#showCreateTable.
sparkVisitor.prototype.visitShowCreateTable = function(ctx) {
  return this.visitChildren(ctx);
};


// Visit a parse tree produced by sparkParser#describeFunction.
sparkVisitor.prototype.visitDescribeFunction = function(ctx) {
  return this.visitChildren(ctx);
};


// Visit a parse tree produced by sparkParser#describeDatabase.
sparkVisitor.prototype.visitDescribeDatabase = function(ctx) {
  return this.visitChildren(ctx);
};


// Visit a parse tree produced by sparkParser#describeTable.
sparkVisitor.prototype.visitDescribeTable = function(ctx) {
  return this.visitChildren(ctx);
};


// Visit a parse tree produced by sparkParser#refreshTable.
sparkVisitor.prototype.visitRefreshTable = function(ctx) {
  return this.visitChildren(ctx);
};


// Visit a parse tree produced by sparkParser#refreshResource.
sparkVisitor.prototype.visitRefreshResource = function(ctx) {
  return this.visitChildren(ctx);
};


// Visit a parse tree produced by sparkParser#cacheTable.
sparkVisitor.prototype.visitCacheTable = function(ctx) {
  return this.visitChildren(ctx);
};


// Visit a parse tree produced by sparkParser#uncacheTable.
sparkVisitor.prototype.visitUncacheTable = function(ctx) {
  return this.visitChildren(ctx);
};


// Visit a parse tree produced by sparkParser#clearCache.
sparkVisitor.prototype.visitClearCache = function(ctx) {
  return this.visitChildren(ctx);
};


// Visit a parse tree produced by sparkParser#loadData.
sparkVisitor.prototype.visitLoadData = function(ctx) {
  return this.visitChildren(ctx);
};


// Visit a parse tree produced by sparkParser#truncateTable.
sparkVisitor.prototype.visitTruncateTable = function(ctx) {
  return this.visitChildren(ctx);
};


// Visit a parse tree produced by sparkParser#repairTable.
sparkVisitor.prototype.visitRepairTable = function(ctx) {
  return this.visitChildren(ctx);
};


// Visit a parse tree produced by sparkParser#manageResource.
sparkVisitor.prototype.visitManageResource = function(ctx) {
  return this.visitChildren(ctx);
};


// Visit a parse tree produced by sparkParser#failNativeCommand.
sparkVisitor.prototype.visitFailNativeCommand = function(ctx) {
  return this.visitChildren(ctx);
};


// Visit a parse tree produced by sparkParser#setConfiguration.
sparkVisitor.prototype.visitSetConfiguration = function(ctx) {
  return this.visitChildren(ctx);
};


// Visit a parse tree produced by sparkParser#resetConfiguration.
sparkVisitor.prototype.visitResetConfiguration = function(ctx) {
  return this.visitChildren(ctx);
};


// Visit a parse tree produced by sparkParser#unsupportedHiveNativeCommands.
sparkVisitor.prototype.visitUnsupportedHiveNativeCommands = function(ctx) {
  return this.visitChildren(ctx);
};


// Visit a parse tree produced by sparkParser#createTableHeader.
sparkVisitor.prototype.visitCreateTableHeader = function(ctx) {
  return this.visitChildren(ctx);
};


// Visit a parse tree produced by sparkParser#bucketSpec.
sparkVisitor.prototype.visitBucketSpec = function(ctx) {
  return this.visitChildren(ctx);
};


// Visit a parse tree produced by sparkParser#skewSpec.
sparkVisitor.prototype.visitSkewSpec = function(ctx) {
  return this.visitChildren(ctx);
};


// Visit a parse tree produced by sparkParser#locationSpec.
sparkVisitor.prototype.visitLocationSpec = function(ctx) {
  return this.visitChildren(ctx);
};


// Visit a parse tree produced by sparkParser#query.
sparkVisitor.prototype.visitQuery = function(ctx) {
  return this.visitChildren(ctx);
};


// Visit a parse tree produced by sparkParser#insertOverwriteTable.
sparkVisitor.prototype.visitInsertOverwriteTable = function(ctx) {
  return this.visitChildren(ctx);
};


// Visit a parse tree produced by sparkParser#insertIntoTable.
sparkVisitor.prototype.visitInsertIntoTable = function(ctx) {
  return this.visitChildren(ctx);
};


// Visit a parse tree produced by sparkParser#insertOverwriteHiveDir.
sparkVisitor.prototype.visitInsertOverwriteHiveDir = function(ctx) {
  return this.visitChildren(ctx);
};


// Visit a parse tree produced by sparkParser#insertOverwriteDir.
sparkVisitor.prototype.visitInsertOverwriteDir = function(ctx) {
  return this.visitChildren(ctx);
};


// Visit a parse tree produced by sparkParser#partitionSpecLocation.
sparkVisitor.prototype.visitPartitionSpecLocation = function(ctx) {
  return this.visitChildren(ctx);
};


// Visit a parse tree produced by sparkParser#partitionSpec.
sparkVisitor.prototype.visitPartitionSpec = function(ctx) {
  return this.visitChildren(ctx);
};


// Visit a parse tree produced by sparkParser#partitionVal.
sparkVisitor.prototype.visitPartitionVal = function(ctx) {
  return this.visitChildren(ctx);
};


// Visit a parse tree produced by sparkParser#describeFuncName.
sparkVisitor.prototype.visitDescribeFuncName = function(ctx) {
  return this.visitChildren(ctx);
};


// Visit a parse tree produced by sparkParser#describeColName.
sparkVisitor.prototype.visitDescribeColName = function(ctx) {
  return this.visitChildren(ctx);
};


// Visit a parse tree produced by sparkParser#ctes.
sparkVisitor.prototype.visitCtes = function(ctx) {
  return this.visitChildren(ctx);
};


// Visit a parse tree produced by sparkParser#namedQuery.
sparkVisitor.prototype.visitNamedQuery = function(ctx) {
  return this.visitChildren(ctx);
};


// Visit a parse tree produced by sparkParser#tableProvider.
sparkVisitor.prototype.visitTableProvider = function(ctx) {
  return this.visitChildren(ctx);
};


// Visit a parse tree produced by sparkParser#tablePropertyList.
sparkVisitor.prototype.visitTablePropertyList = function(ctx) {
  return this.visitChildren(ctx);
};


// Visit a parse tree produced by sparkParser#tableProperty.
sparkVisitor.prototype.visitTableProperty = function(ctx) {
  return this.visitChildren(ctx);
};


// Visit a parse tree produced by sparkParser#tablePropertyKey.
sparkVisitor.prototype.visitTablePropertyKey = function(ctx) {
  return this.visitChildren(ctx);
};


// Visit a parse tree produced by sparkParser#tablePropertyValue.
sparkVisitor.prototype.visitTablePropertyValue = function(ctx) {
  return this.visitChildren(ctx);
};


// Visit a parse tree produced by sparkParser#constantList.
sparkVisitor.prototype.visitConstantList = function(ctx) {
  return this.visitChildren(ctx);
};


// Visit a parse tree produced by sparkParser#nestedConstantList.
sparkVisitor.prototype.visitNestedConstantList = function(ctx) {
  return this.visitChildren(ctx);
};


// Visit a parse tree produced by sparkParser#createFileFormat.
sparkVisitor.prototype.visitCreateFileFormat = function(ctx) {
  return this.visitChildren(ctx);
};


// Visit a parse tree produced by sparkParser#tableFileFormat.
sparkVisitor.prototype.visitTableFileFormat = function(ctx) {
  return this.visitChildren(ctx);
};


// Visit a parse tree produced by sparkParser#genericFileFormat.
sparkVisitor.prototype.visitGenericFileFormat = function(ctx) {
  return this.visitChildren(ctx);
};


// Visit a parse tree produced by sparkParser#storageHandler.
sparkVisitor.prototype.visitStorageHandler = function(ctx) {
  return this.visitChildren(ctx);
};


// Visit a parse tree produced by sparkParser#resource.
sparkVisitor.prototype.visitResource = function(ctx) {
  return this.visitChildren(ctx);
};


// Visit a parse tree produced by sparkParser#singleInsertQuery.
sparkVisitor.prototype.visitSingleInsertQuery = function(ctx) {
  return this.visitChildren(ctx);
};


// Visit a parse tree produced by sparkParser#multiInsertQuery.
sparkVisitor.prototype.visitMultiInsertQuery = function(ctx) {
  return this.visitChildren(ctx);
};


// Visit a parse tree produced by sparkParser#queryOrganization.
sparkVisitor.prototype.visitQueryOrganization = function(ctx) {
  return this.visitChildren(ctx);
};


// Visit a parse tree produced by sparkParser#multiInsertQueryBody.
sparkVisitor.prototype.visitMultiInsertQueryBody = function(ctx) {
  return this.visitChildren(ctx);
};


// Visit a parse tree produced by sparkParser#queryTermDefault.
sparkVisitor.prototype.visitQueryTermDefault = function(ctx) {
  return this.visitChildren(ctx);
};


// Visit a parse tree produced by sparkParser#setOperation.
sparkVisitor.prototype.visitSetOperation = function(ctx) {
  return this.visitChildren(ctx);
};


// Visit a parse tree produced by sparkParser#queryPrimaryDefault.
sparkVisitor.prototype.visitQueryPrimaryDefault = function(ctx) {
  return this.visitChildren(ctx);
};


// Visit a parse tree produced by sparkParser#table.
sparkVisitor.prototype.visitTable = function(ctx) {
  return this.visitChildren(ctx);
};


// Visit a parse tree produced by sparkParser#inlineTableDefault1.
sparkVisitor.prototype.visitInlineTableDefault1 = function(ctx) {
  return this.visitChildren(ctx);
};


// Visit a parse tree produced by sparkParser#subquery.
sparkVisitor.prototype.visitSubquery = function(ctx) {
  return this.visitChildren(ctx);
};


// Visit a parse tree produced by sparkParser#sortItem.
sparkVisitor.prototype.visitSortItem = function(ctx) {
  return this.visitChildren(ctx);
};


// Visit a parse tree produced by sparkParser#querySpecification.
sparkVisitor.prototype.visitQuerySpecification = function(ctx) {
  return this.visitChildren(ctx);
};


// Visit a parse tree produced by sparkParser#hint.
sparkVisitor.prototype.visitHint = function(ctx) {
  return this.visitChildren(ctx);
};


// Visit a parse tree produced by sparkParser#hintStatement.
sparkVisitor.prototype.visitHintStatement = function(ctx) {
  return this.visitChildren(ctx);
};


// Visit a parse tree produced by sparkParser#fromClause.
sparkVisitor.prototype.visitFromClause = function(ctx) {
  return this.visitChildren(ctx);
};


// Visit a parse tree produced by sparkParser#aggregation.
sparkVisitor.prototype.visitAggregation = function(ctx) {
  return this.visitChildren(ctx);
};


// Visit a parse tree produced by sparkParser#groupingSet.
sparkVisitor.prototype.visitGroupingSet = function(ctx) {
  return this.visitChildren(ctx);
};


// Visit a parse tree produced by sparkParser#pivotClause.
sparkVisitor.prototype.visitPivotClause = function(ctx) {
  return this.visitChildren(ctx);
};


// Visit a parse tree produced by sparkParser#pivotColumn.
sparkVisitor.prototype.visitPivotColumn = function(ctx) {
  return this.visitChildren(ctx);
};


// Visit a parse tree produced by sparkParser#pivotValue.
sparkVisitor.prototype.visitPivotValue = function(ctx) {
  return this.visitChildren(ctx);
};


// Visit a parse tree produced by sparkParser#lateralView.
sparkVisitor.prototype.visitLateralView = function(ctx) {
  return this.visitChildren(ctx);
};


// Visit a parse tree produced by sparkParser#setQuantifier.
sparkVisitor.prototype.visitSetQuantifier = function(ctx) {
  return this.visitChildren(ctx);
};


// Visit a parse tree produced by sparkParser#relation.
sparkVisitor.prototype.visitRelation = function(ctx) {
  return this.visitChildren(ctx);
};


// Visit a parse tree produced by sparkParser#joinRelation.
sparkVisitor.prototype.visitJoinRelation = function(ctx) {
  return this.visitChildren(ctx);
};


// Visit a parse tree produced by sparkParser#joinType.
sparkVisitor.prototype.visitJoinType = function(ctx) {
  return this.visitChildren(ctx);
};


// Visit a parse tree produced by sparkParser#joinCriteria.
sparkVisitor.prototype.visitJoinCriteria = function(ctx) {
  return this.visitChildren(ctx);
};


// Visit a parse tree produced by sparkParser#sample.
sparkVisitor.prototype.visitSample = function(ctx) {
  return this.visitChildren(ctx);
};


// Visit a parse tree produced by sparkParser#sampleByPercentile.
sparkVisitor.prototype.visitSampleByPercentile = function(ctx) {
  return this.visitChildren(ctx);
};


// Visit a parse tree produced by sparkParser#sampleByRows.
sparkVisitor.prototype.visitSampleByRows = function(ctx) {
  return this.visitChildren(ctx);
};


// Visit a parse tree produced by sparkParser#sampleByBucket.
sparkVisitor.prototype.visitSampleByBucket = function(ctx) {
  return this.visitChildren(ctx);
};


// Visit a parse tree produced by sparkParser#sampleByBytes.
sparkVisitor.prototype.visitSampleByBytes = function(ctx) {
  return this.visitChildren(ctx);
};


// Visit a parse tree produced by sparkParser#identifierList.
sparkVisitor.prototype.visitIdentifierList = function(ctx) {
  return this.visitChildren(ctx);
};


// Visit a parse tree produced by sparkParser#identifierSeq.
sparkVisitor.prototype.visitIdentifierSeq = function(ctx) {
  return this.visitChildren(ctx);
};


// Visit a parse tree produced by sparkParser#orderedIdentifierList.
sparkVisitor.prototype.visitOrderedIdentifierList = function(ctx) {
  return this.visitChildren(ctx);
};


// Visit a parse tree produced by sparkParser#orderedIdentifier.
sparkVisitor.prototype.visitOrderedIdentifier = function(ctx) {
  return this.visitChildren(ctx);
};


// Visit a parse tree produced by sparkParser#identifierCommentList.
sparkVisitor.prototype.visitIdentifierCommentList = function(ctx) {
  return this.visitChildren(ctx);
};


// Visit a parse tree produced by sparkParser#identifierComment.
sparkVisitor.prototype.visitIdentifierComment = function(ctx) {
  return this.visitChildren(ctx);
};


// Visit a parse tree produced by sparkParser#tableName.
sparkVisitor.prototype.visitTableName = function(ctx) {
  return this.visitChildren(ctx);
};


// Visit a parse tree produced by sparkParser#aliasedQuery.
sparkVisitor.prototype.visitAliasedQuery = function(ctx) {
  return this.visitChildren(ctx);
};


// Visit a parse tree produced by sparkParser#aliasedRelation.
sparkVisitor.prototype.visitAliasedRelation = function(ctx) {
  return this.visitChildren(ctx);
};


// Visit a parse tree produced by sparkParser#inlineTableDefault2.
sparkVisitor.prototype.visitInlineTableDefault2 = function(ctx) {
  return this.visitChildren(ctx);
};


// Visit a parse tree produced by sparkParser#tableValuedFunction.
sparkVisitor.prototype.visitTableValuedFunction = function(ctx) {
  return this.visitChildren(ctx);
};


// Visit a parse tree produced by sparkParser#inlineTable.
sparkVisitor.prototype.visitInlineTable = function(ctx) {
  return this.visitChildren(ctx);
};


// Visit a parse tree produced by sparkParser#functionTable.
sparkVisitor.prototype.visitFunctionTable = function(ctx) {
  return this.visitChildren(ctx);
};


// Visit a parse tree produced by sparkParser#tableAlias.
sparkVisitor.prototype.visitTableAlias = function(ctx) {
  return this.visitChildren(ctx);
};


// Visit a parse tree produced by sparkParser#rowFormatSerde.
sparkVisitor.prototype.visitRowFormatSerde = function(ctx) {
  return this.visitChildren(ctx);
};


// Visit a parse tree produced by sparkParser#rowFormatDelimited.
sparkVisitor.prototype.visitRowFormatDelimited = function(ctx) {
  return this.visitChildren(ctx);
};


// Visit a parse tree produced by sparkParser#tableIdentifier.
sparkVisitor.prototype.visitTableIdentifier = function(ctx) {
  return this.visitChildren(ctx);
};


// Visit a parse tree produced by sparkParser#functionIdentifier.
sparkVisitor.prototype.visitFunctionIdentifier = function(ctx) {
  return this.visitChildren(ctx);
};


// Visit a parse tree produced by sparkParser#namedExpression.
sparkVisitor.prototype.visitNamedExpression = function(ctx) {
  return this.visitChildren(ctx);
};


// Visit a parse tree produced by sparkParser#namedExpressionSeq.
sparkVisitor.prototype.visitNamedExpressionSeq = function(ctx) {
  return this.visitChildren(ctx);
};


// Visit a parse tree produced by sparkParser#expression.
sparkVisitor.prototype.visitExpression = function(ctx) {
  return this.visitChildren(ctx);
};


// Visit a parse tree produced by sparkParser#logicalNot.
sparkVisitor.prototype.visitLogicalNot = function(ctx) {
  return this.visitChildren(ctx);
};


// Visit a parse tree produced by sparkParser#predicated.
sparkVisitor.prototype.visitPredicated = function(ctx) {
  return this.visitChildren(ctx);
};


// Visit a parse tree produced by sparkParser#exists.
sparkVisitor.prototype.visitExists = function(ctx) {
  return this.visitChildren(ctx);
};


// Visit a parse tree produced by sparkParser#logicalBinary.
sparkVisitor.prototype.visitLogicalBinary = function(ctx) {
  return this.visitChildren(ctx);
};


// Visit a parse tree produced by sparkParser#predicate.
sparkVisitor.prototype.visitPredicate = function(ctx) {
  return this.visitChildren(ctx);
};


// Visit a parse tree produced by sparkParser#valueExpressionDefault.
sparkVisitor.prototype.visitValueExpressionDefault = function(ctx) {
  return this.visitChildren(ctx);
};


// Visit a parse tree produced by sparkParser#comparison.
sparkVisitor.prototype.visitComparison = function(ctx) {
  return this.visitChildren(ctx);
};


// Visit a parse tree produced by sparkParser#arithmeticBinary.
sparkVisitor.prototype.visitArithmeticBinary = function(ctx) {
  return this.visitChildren(ctx);
};


// Visit a parse tree produced by sparkParser#arithmeticUnary.
sparkVisitor.prototype.visitArithmeticUnary = function(ctx) {
  return this.visitChildren(ctx);
};


// Visit a parse tree produced by sparkParser#struct.
sparkVisitor.prototype.visitStruct = function(ctx) {
  return this.visitChildren(ctx);
};


// Visit a parse tree produced by sparkParser#dereference.
sparkVisitor.prototype.visitDereference = function(ctx) {
  return this.visitChildren(ctx);
};


// Visit a parse tree produced by sparkParser#simpleCase.
sparkVisitor.prototype.visitSimpleCase = function(ctx) {
  return this.visitChildren(ctx);
};


// Visit a parse tree produced by sparkParser#columnReference.
sparkVisitor.prototype.visitColumnReference = function(ctx) {
  return this.visitChildren(ctx);
};


// Visit a parse tree produced by sparkParser#rowConstructor.
sparkVisitor.prototype.visitRowConstructor = function(ctx) {
  return this.visitChildren(ctx);
};


// Visit a parse tree produced by sparkParser#last.
sparkVisitor.prototype.visitLast = function(ctx) {
  return this.visitChildren(ctx);
};


// Visit a parse tree produced by sparkParser#star.
sparkVisitor.prototype.visitStar = function(ctx) {
  return this.visitChildren(ctx);
};


// Visit a parse tree produced by sparkParser#subscript.
sparkVisitor.prototype.visitSubscript = function(ctx) {
  return this.visitChildren(ctx);
};


// Visit a parse tree produced by sparkParser#subqueryExpression.
sparkVisitor.prototype.visitSubqueryExpression = function(ctx) {
  return this.visitChildren(ctx);
};


// Visit a parse tree produced by sparkParser#cast.
sparkVisitor.prototype.visitCast = function(ctx) {
  return this.visitChildren(ctx);
};


// Visit a parse tree produced by sparkParser#constantDefault.
sparkVisitor.prototype.visitConstantDefault = function(ctx) {
  return this.visitChildren(ctx);
};


// Visit a parse tree produced by sparkParser#lambda.
sparkVisitor.prototype.visitLambda = function(ctx) {
  return this.visitChildren(ctx);
};


// Visit a parse tree produced by sparkParser#parenthesizedExpression.
sparkVisitor.prototype.visitParenthesizedExpression = function(ctx) {
  return this.visitChildren(ctx);
};


// Visit a parse tree produced by sparkParser#extract.
sparkVisitor.prototype.visitExtract = function(ctx) {
  return this.visitChildren(ctx);
};


// Visit a parse tree produced by sparkParser#functionCall.
sparkVisitor.prototype.visitFunctionCall = function(ctx) {
  return this.visitChildren(ctx);
};


// Visit a parse tree produced by sparkParser#searchedCase.
sparkVisitor.prototype.visitSearchedCase = function(ctx) {
  return this.visitChildren(ctx);
};


// Visit a parse tree produced by sparkParser#position.
sparkVisitor.prototype.visitPosition = function(ctx) {
  return this.visitChildren(ctx);
};


// Visit a parse tree produced by sparkParser#first.
sparkVisitor.prototype.visitFirst = function(ctx) {
  return this.visitChildren(ctx);
};


// Visit a parse tree produced by sparkParser#nullLiteral.
sparkVisitor.prototype.visitNullLiteral = function(ctx) {
  return this.visitChildren(ctx);
};


// Visit a parse tree produced by sparkParser#intervalLiteral.
sparkVisitor.prototype.visitIntervalLiteral = function(ctx) {
  return this.visitChildren(ctx);
};


// Visit a parse tree produced by sparkParser#typeConstructor.
sparkVisitor.prototype.visitTypeConstructor = function(ctx) {
  return this.visitChildren(ctx);
};


// Visit a parse tree produced by sparkParser#numericLiteral.
sparkVisitor.prototype.visitNumericLiteral = function(ctx) {
  return this.visitChildren(ctx);
};


// Visit a parse tree produced by sparkParser#booleanLiteral.
sparkVisitor.prototype.visitBooleanLiteral = function(ctx) {
  return this.visitChildren(ctx);
};


// Visit a parse tree produced by sparkParser#stringLiteral.
sparkVisitor.prototype.visitStringLiteral = function(ctx) {
  return this.visitChildren(ctx);
};


// Visit a parse tree produced by sparkParser#comparisonOperator.
sparkVisitor.prototype.visitComparisonOperator = function(ctx) {
  return this.visitChildren(ctx);
};


// Visit a parse tree produced by sparkParser#arithmeticOperator.
sparkVisitor.prototype.visitArithmeticOperator = function(ctx) {
  return this.visitChildren(ctx);
};


// Visit a parse tree produced by sparkParser#predicateOperator.
sparkVisitor.prototype.visitPredicateOperator = function(ctx) {
  return this.visitChildren(ctx);
};


// Visit a parse tree produced by sparkParser#booleanValue.
sparkVisitor.prototype.visitBooleanValue = function(ctx) {
  return this.visitChildren(ctx);
};


// Visit a parse tree produced by sparkParser#interval.
sparkVisitor.prototype.visitInterval = function(ctx) {
  return this.visitChildren(ctx);
};


// Visit a parse tree produced by sparkParser#intervalField.
sparkVisitor.prototype.visitIntervalField = function(ctx) {
  return this.visitChildren(ctx);
};


// Visit a parse tree produced by sparkParser#intervalValue.
sparkVisitor.prototype.visitIntervalValue = function(ctx) {
  return this.visitChildren(ctx);
};


// Visit a parse tree produced by sparkParser#colPosition.
sparkVisitor.prototype.visitColPosition = function(ctx) {
  return this.visitChildren(ctx);
};


// Visit a parse tree produced by sparkParser#complexDataType.
sparkVisitor.prototype.visitComplexDataType = function(ctx) {
  return this.visitChildren(ctx);
};


// Visit a parse tree produced by sparkParser#primitiveDataType.
sparkVisitor.prototype.visitPrimitiveDataType = function(ctx) {
  return this.visitChildren(ctx);
};


// Visit a parse tree produced by sparkParser#colTypeList.
sparkVisitor.prototype.visitColTypeList = function(ctx) {
  return this.visitChildren(ctx);
};


// Visit a parse tree produced by sparkParser#colType.
sparkVisitor.prototype.visitColType = function(ctx) {
  return this.visitChildren(ctx);
};


// Visit a parse tree produced by sparkParser#complexColTypeList.
sparkVisitor.prototype.visitComplexColTypeList = function(ctx) {
  return this.visitChildren(ctx);
};


// Visit a parse tree produced by sparkParser#complexColType.
sparkVisitor.prototype.visitComplexColType = function(ctx) {
  return this.visitChildren(ctx);
};


// Visit a parse tree produced by sparkParser#whenClause.
sparkVisitor.prototype.visitWhenClause = function(ctx) {
  return this.visitChildren(ctx);
};


// Visit a parse tree produced by sparkParser#windows.
sparkVisitor.prototype.visitWindows = function(ctx) {
  return this.visitChildren(ctx);
};


// Visit a parse tree produced by sparkParser#namedWindow.
sparkVisitor.prototype.visitNamedWindow = function(ctx) {
  return this.visitChildren(ctx);
};


// Visit a parse tree produced by sparkParser#windowRef.
sparkVisitor.prototype.visitWindowRef = function(ctx) {
  return this.visitChildren(ctx);
};


// Visit a parse tree produced by sparkParser#windowDef.
sparkVisitor.prototype.visitWindowDef = function(ctx) {
  return this.visitChildren(ctx);
};


// Visit a parse tree produced by sparkParser#windowFrame.
sparkVisitor.prototype.visitWindowFrame = function(ctx) {
  return this.visitChildren(ctx);
};


// Visit a parse tree produced by sparkParser#frameBound.
sparkVisitor.prototype.visitFrameBound = function(ctx) {
  return this.visitChildren(ctx);
};


// Visit a parse tree produced by sparkParser#qualifiedName.
sparkVisitor.prototype.visitQualifiedName = function(ctx) {
  return this.visitChildren(ctx);
};


// Visit a parse tree produced by sparkParser#identifier.
sparkVisitor.prototype.visitIdentifier = function(ctx) {
  return this.visitChildren(ctx);
};


// Visit a parse tree produced by sparkParser#unquotedIdentifier.
sparkVisitor.prototype.visitUnquotedIdentifier = function(ctx) {
  return this.visitChildren(ctx);
};


// Visit a parse tree produced by sparkParser#quotedIdentifierAlternative.
sparkVisitor.prototype.visitQuotedIdentifierAlternative = function(ctx) {
  return this.visitChildren(ctx);
};


// Visit a parse tree produced by sparkParser#quotedIdentifier.
sparkVisitor.prototype.visitQuotedIdentifier = function(ctx) {
  return this.visitChildren(ctx);
};


// Visit a parse tree produced by sparkParser#decimalLiteral.
sparkVisitor.prototype.visitDecimalLiteral = function(ctx) {
  return this.visitChildren(ctx);
};


// Visit a parse tree produced by sparkParser#integerLiteral.
sparkVisitor.prototype.visitIntegerLiteral = function(ctx) {
  return this.visitChildren(ctx);
};


// Visit a parse tree produced by sparkParser#bigIntLiteral.
sparkVisitor.prototype.visitBigIntLiteral = function(ctx) {
  return this.visitChildren(ctx);
};


// Visit a parse tree produced by sparkParser#smallIntLiteral.
sparkVisitor.prototype.visitSmallIntLiteral = function(ctx) {
  return this.visitChildren(ctx);
};


// Visit a parse tree produced by sparkParser#tinyIntLiteral.
sparkVisitor.prototype.visitTinyIntLiteral = function(ctx) {
  return this.visitChildren(ctx);
};


// Visit a parse tree produced by sparkParser#doubleLiteral.
sparkVisitor.prototype.visitDoubleLiteral = function(ctx) {
  return this.visitChildren(ctx);
};


// Visit a parse tree produced by sparkParser#bigDecimalLiteral.
sparkVisitor.prototype.visitBigDecimalLiteral = function(ctx) {
  return this.visitChildren(ctx);
};


// Visit a parse tree produced by sparkParser#nonReserved.
sparkVisitor.prototype.visitNonReserved = function(ctx) {
  return this.visitChildren(ctx);
};



exports.sparkVisitor = sparkVisitor;