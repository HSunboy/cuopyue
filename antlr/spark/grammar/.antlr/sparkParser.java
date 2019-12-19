// Generated from /Users/xuexiaokang/Documents/github/cuopyue/antlr/spark/grammar/spark.g4 by ANTLR 4.7.1
import org.antlr.v4.runtime.atn.*;
import org.antlr.v4.runtime.dfa.DFA;
import org.antlr.v4.runtime.*;
import org.antlr.v4.runtime.misc.*;
import org.antlr.v4.runtime.tree.*;
import java.util.List;
import java.util.Iterator;
import java.util.ArrayList;

@SuppressWarnings({"all", "warnings", "unchecked", "unused", "cast"})
public class sparkParser extends Parser {
	static { RuntimeMetaData.checkVersion("4.7.1", RuntimeMetaData.VERSION); }

	protected static final DFA[] _decisionToDFA;
	protected static final PredictionContextCache _sharedContextCache =
		new PredictionContextCache();
	public static final int
		T__0=1, T__1=2, T__2=3, T__3=4, T__4=5, T__5=6, T__6=7, T__7=8, T__8=9, 
		T__9=10, SELECT=11, FROM=12, ADD=13, AS=14, ALL=15, ANY=16, DISTINCT=17, 
		WHERE=18, GROUP=19, BY=20, GROUPING=21, SETS=22, CUBE=23, ROLLUP=24, ORDER=25, 
		HAVING=26, LIMIT=27, AT=28, OR=29, AND=30, IN=31, NOT=32, NO=33, EXISTS=34, 
		BETWEEN=35, LIKE=36, RLIKE=37, IS=38, NULL=39, TRUE=40, FALSE=41, NULLS=42, 
		ASC=43, DESC=44, FOR=45, INTERVAL=46, CASE=47, WHEN=48, THEN=49, ELSE=50, 
		END=51, JOIN=52, CROSS=53, OUTER=54, INNER=55, LEFT=56, SEMI=57, RIGHT=58, 
		FULL=59, NATURAL=60, ON=61, PIVOT=62, LATERAL=63, WINDOW=64, OVER=65, 
		PARTITION=66, RANGE=67, ROWS=68, UNBOUNDED=69, PRECEDING=70, FOLLOWING=71, 
		CURRENT=72, FIRST=73, AFTER=74, LAST=75, ROW=76, WITH=77, VALUES=78, CREATE=79, 
		TABLE=80, DIRECTORY=81, VIEW=82, REPLACE=83, INSERT=84, DELETE=85, INTO=86, 
		DESCRIBE=87, EXPLAIN=88, FORMAT=89, LOGICAL=90, CODEGEN=91, COST=92, CAST=93, 
		SHOW=94, TABLES=95, COLUMNS=96, COLUMN=97, USE=98, PARTITIONS=99, FUNCTIONS=100, 
		DROP=101, UNION=102, EXCEPT=103, SETMINUS=104, INTERSECT=105, TO=106, 
		TABLESAMPLE=107, STRATIFY=108, ALTER=109, RENAME=110, ARRAY=111, MAP=112, 
		STRUCT=113, COMMENT=114, SET=115, RESET=116, DATA=117, START=118, TRANSACTION=119, 
		COMMIT=120, ROLLBACK=121, MACRO=122, IGNORE=123, BOTH=124, LEADING=125, 
		TRAILING=126, IF=127, POSITION=128, EXTRACT=129, EQ=130, NSEQ=131, NEQ=132, 
		NEQJ=133, LT=134, LTE=135, GT=136, GTE=137, PLUS=138, MINUS=139, ASTERISK=140, 
		SLASH=141, PERCENT=142, DIV=143, TILDE=144, AMPERSAND=145, PIPE=146, CONCAT_PIPE=147, 
		HAT=148, PERCENTLIT=149, BUCKET=150, OUT=151, OF=152, SORT=153, CLUSTER=154, 
		DISTRIBUTE=155, OVERWRITE=156, TRANSFORM=157, REDUCE=158, USING=159, SERDE=160, 
		SERDEPROPERTIES=161, RECORDREADER=162, RECORDWRITER=163, DELIMITED=164, 
		FIELDS=165, TERMINATED=166, COLLECTION=167, ITEMS=168, KEYS=169, ESCAPED=170, 
		LINES=171, SEPARATED=172, FUNCTION=173, EXTENDED=174, REFRESH=175, CLEAR=176, 
		CACHE=177, UNCACHE=178, LAZY=179, FORMATTED=180, GLOBAL=181, TEMPORARY=182, 
		OPTIONS=183, UNSET=184, TBLPROPERTIES=185, DBPROPERTIES=186, BUCKETS=187, 
		SKEWED=188, STORED=189, DIRECTORIES=190, LOCATION=191, EXCHANGE=192, ARCHIVE=193, 
		UNARCHIVE=194, FILEFORMAT=195, TOUCH=196, COMPACT=197, CONCATENATE=198, 
		CHANGE=199, CASCADE=200, RESTRICT=201, CLUSTERED=202, SORTED=203, PURGE=204, 
		INPUTFORMAT=205, OUTPUTFORMAT=206, DATABASE=207, DATABASES=208, DFS=209, 
		TRUNCATE=210, ANALYZE=211, COMPUTE=212, LIST=213, STATISTICS=214, PARTITIONED=215, 
		EXTERNAL=216, DEFINED=217, REVOKE=218, GRANT=219, LOCK=220, UNLOCK=221, 
		MSCK=222, REPAIR=223, RECOVER=224, EXPORT=225, IMPORT=226, LOAD=227, ROLE=228, 
		ROLES=229, COMPACTIONS=230, PRINCIPALS=231, TRANSACTIONS=232, INDEX=233, 
		INDEXES=234, LOCKS=235, OPTION=236, ANTI=237, LOCAL=238, INPATH=239, STRING=240, 
		BIGINT_LITERAL=241, SMALLINT_LITERAL=242, TINYINT_LITERAL=243, INTEGER_VALUE=244, 
		DECIMAL_VALUE=245, DOUBLE_LITERAL=246, BIGDECIMAL_LITERAL=247, IDENTIFIER=248, 
		BACKQUOTED_IDENTIFIER=249, SIMPLE_COMMENT=250, BRACKETED_EMPTY_COMMENT=251, 
		BRACKETED_COMMENT=252, WS=253, UNRECOGNIZED=254;
	public static final int
		RULE_singleStatement = 0, RULE_singleExpression = 1, RULE_singleTableIdentifier = 2, 
		RULE_singleFunctionIdentifier = 3, RULE_singleDataType = 4, RULE_singleTableSchema = 5, 
		RULE_statement = 6, RULE_unsupportedHiveNativeCommands = 7, RULE_createTableHeader = 8, 
		RULE_bucketSpec = 9, RULE_skewSpec = 10, RULE_locationSpec = 11, RULE_query = 12, 
		RULE_insertInto = 13, RULE_partitionSpecLocation = 14, RULE_partitionSpec = 15, 
		RULE_partitionVal = 16, RULE_describeFuncName = 17, RULE_describeColName = 18, 
		RULE_ctes = 19, RULE_namedQuery = 20, RULE_tableProvider = 21, RULE_tablePropertyList = 22, 
		RULE_tableProperty = 23, RULE_tablePropertyKey = 24, RULE_tablePropertyValue = 25, 
		RULE_constantList = 26, RULE_nestedConstantList = 27, RULE_createFileFormat = 28, 
		RULE_fileFormat = 29, RULE_storageHandler = 30, RULE_resource = 31, RULE_queryNoWith = 32, 
		RULE_queryOrganization = 33, RULE_multiInsertQueryBody = 34, RULE_queryTerm = 35, 
		RULE_queryPrimary = 36, RULE_sortItem = 37, RULE_querySpecification = 38, 
		RULE_hint = 39, RULE_hintStatement = 40, RULE_fromClause = 41, RULE_aggregation = 42, 
		RULE_groupingSet = 43, RULE_pivotClause = 44, RULE_pivotColumn = 45, RULE_pivotValue = 46, 
		RULE_lateralView = 47, RULE_setQuantifier = 48, RULE_relation = 49, RULE_joinRelation = 50, 
		RULE_joinType = 51, RULE_joinCriteria = 52, RULE_sample = 53, RULE_sampleMethod = 54, 
		RULE_identifierList = 55, RULE_identifierSeq = 56, RULE_orderedIdentifierList = 57, 
		RULE_orderedIdentifier = 58, RULE_identifierCommentList = 59, RULE_identifierComment = 60, 
		RULE_relationPrimary = 61, RULE_inlineTable = 62, RULE_functionTable = 63, 
		RULE_tableAlias = 64, RULE_rowFormat = 65, RULE_tableIdentifier = 66, 
		RULE_functionIdentifier = 67, RULE_namedExpression = 68, RULE_namedExpressionSeq = 69, 
		RULE_expression = 70, RULE_booleanExpression = 71, RULE_predicate = 72, 
		RULE_valueExpression = 73, RULE_primaryExpression = 74, RULE_constant = 75, 
		RULE_comparisonOperator = 76, RULE_arithmeticOperator = 77, RULE_predicateOperator = 78, 
		RULE_booleanValue = 79, RULE_interval = 80, RULE_intervalField = 81, RULE_intervalValue = 82, 
		RULE_colPosition = 83, RULE_dataType = 84, RULE_colTypeList = 85, RULE_colType = 86, 
		RULE_complexColTypeList = 87, RULE_complexColType = 88, RULE_whenClause = 89, 
		RULE_windows = 90, RULE_namedWindow = 91, RULE_windowSpec = 92, RULE_windowFrame = 93, 
		RULE_frameBound = 94, RULE_qualifiedName = 95, RULE_identifier = 96, RULE_strictIdentifier = 97, 
		RULE_quotedIdentifier = 98, RULE_number = 99, RULE_nonReserved = 100;
	public static final String[] ruleNames = {
		"singleStatement", "singleExpression", "singleTableIdentifier", "singleFunctionIdentifier", 
		"singleDataType", "singleTableSchema", "statement", "unsupportedHiveNativeCommands", 
		"createTableHeader", "bucketSpec", "skewSpec", "locationSpec", "query", 
		"insertInto", "partitionSpecLocation", "partitionSpec", "partitionVal", 
		"describeFuncName", "describeColName", "ctes", "namedQuery", "tableProvider", 
		"tablePropertyList", "tableProperty", "tablePropertyKey", "tablePropertyValue", 
		"constantList", "nestedConstantList", "createFileFormat", "fileFormat", 
		"storageHandler", "resource", "queryNoWith", "queryOrganization", "multiInsertQueryBody", 
		"queryTerm", "queryPrimary", "sortItem", "querySpecification", "hint", 
		"hintStatement", "fromClause", "aggregation", "groupingSet", "pivotClause", 
		"pivotColumn", "pivotValue", "lateralView", "setQuantifier", "relation", 
		"joinRelation", "joinType", "joinCriteria", "sample", "sampleMethod", 
		"identifierList", "identifierSeq", "orderedIdentifierList", "orderedIdentifier", 
		"identifierCommentList", "identifierComment", "relationPrimary", "inlineTable", 
		"functionTable", "tableAlias", "rowFormat", "tableIdentifier", "functionIdentifier", 
		"namedExpression", "namedExpressionSeq", "expression", "booleanExpression", 
		"predicate", "valueExpression", "primaryExpression", "constant", "comparisonOperator", 
		"arithmeticOperator", "predicateOperator", "booleanValue", "interval", 
		"intervalField", "intervalValue", "colPosition", "dataType", "colTypeList", 
		"colType", "complexColTypeList", "complexColType", "whenClause", "windows", 
		"namedWindow", "windowSpec", "windowFrame", "frameBound", "qualifiedName", 
		"identifier", "strictIdentifier", "quotedIdentifier", "number", "nonReserved"
	};

	private static final String[] _LITERAL_NAMES = {
		null, "'('", "')'", "','", "'.'", "'/*+'", "'*/'", "'->'", "'['", "']'", 
		"':'", "'SELECT'", "'FROM'", "'ADD'", "'AS'", "'ALL'", "'ANY'", "'DISTINCT'", 
		"'WHERE'", "'GROUP'", "'BY'", "'GROUPING'", "'SETS'", "'CUBE'", "'ROLLUP'", 
		"'ORDER'", "'HAVING'", "'LIMIT'", "'AT'", "'OR'", "'AND'", "'IN'", null, 
		"'NO'", "'EXISTS'", "'BETWEEN'", "'LIKE'", null, "'IS'", "'NULL'", "'TRUE'", 
		"'FALSE'", "'NULLS'", "'ASC'", "'DESC'", "'FOR'", "'INTERVAL'", "'CASE'", 
		"'WHEN'", "'THEN'", "'ELSE'", "'END'", "'JOIN'", "'CROSS'", "'OUTER'", 
		"'INNER'", "'LEFT'", "'SEMI'", "'RIGHT'", "'FULL'", "'NATURAL'", "'ON'", 
		"'PIVOT'", "'LATERAL'", "'WINDOW'", "'OVER'", "'PARTITION'", "'RANGE'", 
		"'ROWS'", "'UNBOUNDED'", "'PRECEDING'", "'FOLLOWING'", "'CURRENT'", "'FIRST'", 
		"'AFTER'", "'LAST'", "'ROW'", "'WITH'", "'VALUES'", "'CREATE'", "'TABLE'", 
		"'DIRECTORY'", "'VIEW'", "'REPLACE'", "'INSERT'", "'DELETE'", "'INTO'", 
		"'DESCRIBE'", "'EXPLAIN'", "'FORMAT'", "'LOGICAL'", "'CODEGEN'", "'COST'", 
		"'CAST'", "'SHOW'", "'TABLES'", "'COLUMNS'", "'COLUMN'", "'USE'", "'PARTITIONS'", 
		"'FUNCTIONS'", "'DROP'", "'UNION'", "'EXCEPT'", "'MINUS'", "'INTERSECT'", 
		"'TO'", "'TABLESAMPLE'", "'STRATIFY'", "'ALTER'", "'RENAME'", "'ARRAY'", 
		"'MAP'", "'STRUCT'", "'COMMENT'", "'SET'", "'RESET'", "'DATA'", "'START'", 
		"'TRANSACTION'", "'COMMIT'", "'ROLLBACK'", "'MACRO'", "'IGNORE'", "'BOTH'", 
		"'LEADING'", "'TRAILING'", "'IF'", "'POSITION'", "'EXTRACT'", null, "'<=>'", 
		"'<>'", "'!='", "'<'", null, "'>'", null, "'+'", "'-'", "'*'", "'/'", 
		"'%'", "'DIV'", "'~'", "'&'", "'|'", "'||'", "'^'", "'PERCENT'", "'BUCKET'", 
		"'OUT'", "'OF'", "'SORT'", "'CLUSTER'", "'DISTRIBUTE'", "'OVERWRITE'", 
		"'TRANSFORM'", "'REDUCE'", "'USING'", "'SERDE'", "'SERDEPROPERTIES'", 
		"'RECORDREADER'", "'RECORDWRITER'", "'DELIMITED'", "'FIELDS'", "'TERMINATED'", 
		"'COLLECTION'", "'ITEMS'", "'KEYS'", "'ESCAPED'", "'LINES'", "'SEPARATED'", 
		"'FUNCTION'", "'EXTENDED'", "'REFRESH'", "'CLEAR'", "'CACHE'", "'UNCACHE'", 
		"'LAZY'", "'FORMATTED'", "'GLOBAL'", null, "'OPTIONS'", "'UNSET'", "'TBLPROPERTIES'", 
		"'DBPROPERTIES'", "'BUCKETS'", "'SKEWED'", "'STORED'", "'DIRECTORIES'", 
		"'LOCATION'", "'EXCHANGE'", "'ARCHIVE'", "'UNARCHIVE'", "'FILEFORMAT'", 
		"'TOUCH'", "'COMPACT'", "'CONCATENATE'", "'CHANGE'", "'CASCADE'", "'RESTRICT'", 
		"'CLUSTERED'", "'SORTED'", "'PURGE'", "'INPUTFORMAT'", "'OUTPUTFORMAT'", 
		null, null, "'DFS'", "'TRUNCATE'", "'ANALYZE'", "'COMPUTE'", "'LIST'", 
		"'STATISTICS'", "'PARTITIONED'", "'EXTERNAL'", "'DEFINED'", "'REVOKE'", 
		"'GRANT'", "'LOCK'", "'UNLOCK'", "'MSCK'", "'REPAIR'", "'RECOVER'", "'EXPORT'", 
		"'IMPORT'", "'LOAD'", "'ROLE'", "'ROLES'", "'COMPACTIONS'", "'PRINCIPALS'", 
		"'TRANSACTIONS'", "'INDEX'", "'INDEXES'", "'LOCKS'", "'OPTION'", "'ANTI'", 
		"'LOCAL'", "'INPATH'", null, null, null, null, null, null, null, null, 
		null, null, null, "'/**/'"
	};
	private static final String[] _SYMBOLIC_NAMES = {
		null, null, null, null, null, null, null, null, null, null, null, "SELECT", 
		"FROM", "ADD", "AS", "ALL", "ANY", "DISTINCT", "WHERE", "GROUP", "BY", 
		"GROUPING", "SETS", "CUBE", "ROLLUP", "ORDER", "HAVING", "LIMIT", "AT", 
		"OR", "AND", "IN", "NOT", "NO", "EXISTS", "BETWEEN", "LIKE", "RLIKE", 
		"IS", "NULL", "TRUE", "FALSE", "NULLS", "ASC", "DESC", "FOR", "INTERVAL", 
		"CASE", "WHEN", "THEN", "ELSE", "END", "JOIN", "CROSS", "OUTER", "INNER", 
		"LEFT", "SEMI", "RIGHT", "FULL", "NATURAL", "ON", "PIVOT", "LATERAL", 
		"WINDOW", "OVER", "PARTITION", "RANGE", "ROWS", "UNBOUNDED", "PRECEDING", 
		"FOLLOWING", "CURRENT", "FIRST", "AFTER", "LAST", "ROW", "WITH", "VALUES", 
		"CREATE", "TABLE", "DIRECTORY", "VIEW", "REPLACE", "INSERT", "DELETE", 
		"INTO", "DESCRIBE", "EXPLAIN", "FORMAT", "LOGICAL", "CODEGEN", "COST", 
		"CAST", "SHOW", "TABLES", "COLUMNS", "COLUMN", "USE", "PARTITIONS", "FUNCTIONS", 
		"DROP", "UNION", "EXCEPT", "SETMINUS", "INTERSECT", "TO", "TABLESAMPLE", 
		"STRATIFY", "ALTER", "RENAME", "ARRAY", "MAP", "STRUCT", "COMMENT", "SET", 
		"RESET", "DATA", "START", "TRANSACTION", "COMMIT", "ROLLBACK", "MACRO", 
		"IGNORE", "BOTH", "LEADING", "TRAILING", "IF", "POSITION", "EXTRACT", 
		"EQ", "NSEQ", "NEQ", "NEQJ", "LT", "LTE", "GT", "GTE", "PLUS", "MINUS", 
		"ASTERISK", "SLASH", "PERCENT", "DIV", "TILDE", "AMPERSAND", "PIPE", "CONCAT_PIPE", 
		"HAT", "PERCENTLIT", "BUCKET", "OUT", "OF", "SORT", "CLUSTER", "DISTRIBUTE", 
		"OVERWRITE", "TRANSFORM", "REDUCE", "USING", "SERDE", "SERDEPROPERTIES", 
		"RECORDREADER", "RECORDWRITER", "DELIMITED", "FIELDS", "TERMINATED", "COLLECTION", 
		"ITEMS", "KEYS", "ESCAPED", "LINES", "SEPARATED", "FUNCTION", "EXTENDED", 
		"REFRESH", "CLEAR", "CACHE", "UNCACHE", "LAZY", "FORMATTED", "GLOBAL", 
		"TEMPORARY", "OPTIONS", "UNSET", "TBLPROPERTIES", "DBPROPERTIES", "BUCKETS", 
		"SKEWED", "STORED", "DIRECTORIES", "LOCATION", "EXCHANGE", "ARCHIVE", 
		"UNARCHIVE", "FILEFORMAT", "TOUCH", "COMPACT", "CONCATENATE", "CHANGE", 
		"CASCADE", "RESTRICT", "CLUSTERED", "SORTED", "PURGE", "INPUTFORMAT", 
		"OUTPUTFORMAT", "DATABASE", "DATABASES", "DFS", "TRUNCATE", "ANALYZE", 
		"COMPUTE", "LIST", "STATISTICS", "PARTITIONED", "EXTERNAL", "DEFINED", 
		"REVOKE", "GRANT", "LOCK", "UNLOCK", "MSCK", "REPAIR", "RECOVER", "EXPORT", 
		"IMPORT", "LOAD", "ROLE", "ROLES", "COMPACTIONS", "PRINCIPALS", "TRANSACTIONS", 
		"INDEX", "INDEXES", "LOCKS", "OPTION", "ANTI", "LOCAL", "INPATH", "STRING", 
		"BIGINT_LITERAL", "SMALLINT_LITERAL", "TINYINT_LITERAL", "INTEGER_VALUE", 
		"DECIMAL_VALUE", "DOUBLE_LITERAL", "BIGDECIMAL_LITERAL", "IDENTIFIER", 
		"BACKQUOTED_IDENTIFIER", "SIMPLE_COMMENT", "BRACKETED_EMPTY_COMMENT", 
		"BRACKETED_COMMENT", "WS", "UNRECOGNIZED"
	};
	public static final Vocabulary VOCABULARY = new VocabularyImpl(_LITERAL_NAMES, _SYMBOLIC_NAMES);

	/**
	 * @deprecated Use {@link #VOCABULARY} instead.
	 */
	@Deprecated
	public static final String[] tokenNames;
	static {
		tokenNames = new String[_SYMBOLIC_NAMES.length];
		for (int i = 0; i < tokenNames.length; i++) {
			tokenNames[i] = VOCABULARY.getLiteralName(i);
			if (tokenNames[i] == null) {
				tokenNames[i] = VOCABULARY.getSymbolicName(i);
			}

			if (tokenNames[i] == null) {
				tokenNames[i] = "<INVALID>";
			}
		}
	}

	@Override
	@Deprecated
	public String[] getTokenNames() {
		return tokenNames;
	}

	@Override

	public Vocabulary getVocabulary() {
		return VOCABULARY;
	}

	@Override
	public String getGrammarFileName() { return "spark.g4"; }

	@Override
	public String[] getRuleNames() { return ruleNames; }

	@Override
	public String getSerializedATN() { return _serializedATN; }

	@Override
	public ATN getATN() { return _ATN; }

	public sparkParser(TokenStream input) {
		super(input);
		_interp = new ParserATNSimulator(this,_ATN,_decisionToDFA,_sharedContextCache);
	}
	public static class SingleStatementContext extends ParserRuleContext {
		public StatementContext statement() {
			return getRuleContext(StatementContext.class,0);
		}
		public TerminalNode EOF() { return getToken(sparkParser.EOF, 0); }
		public SingleStatementContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_singleStatement; }
	}

	public final SingleStatementContext singleStatement() throws RecognitionException {
		SingleStatementContext _localctx = new SingleStatementContext(_ctx, getState());
		enterRule(_localctx, 0, RULE_singleStatement);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(202);
			statement();
			setState(203);
			match(EOF);
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static class SingleExpressionContext extends ParserRuleContext {
		public NamedExpressionContext namedExpression() {
			return getRuleContext(NamedExpressionContext.class,0);
		}
		public TerminalNode EOF() { return getToken(sparkParser.EOF, 0); }
		public SingleExpressionContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_singleExpression; }
	}

	public final SingleExpressionContext singleExpression() throws RecognitionException {
		SingleExpressionContext _localctx = new SingleExpressionContext(_ctx, getState());
		enterRule(_localctx, 2, RULE_singleExpression);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(205);
			namedExpression();
			setState(206);
			match(EOF);
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static class SingleTableIdentifierContext extends ParserRuleContext {
		public TableIdentifierContext tableIdentifier() {
			return getRuleContext(TableIdentifierContext.class,0);
		}
		public TerminalNode EOF() { return getToken(sparkParser.EOF, 0); }
		public SingleTableIdentifierContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_singleTableIdentifier; }
	}

	public final SingleTableIdentifierContext singleTableIdentifier() throws RecognitionException {
		SingleTableIdentifierContext _localctx = new SingleTableIdentifierContext(_ctx, getState());
		enterRule(_localctx, 4, RULE_singleTableIdentifier);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(208);
			tableIdentifier();
			setState(209);
			match(EOF);
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static class SingleFunctionIdentifierContext extends ParserRuleContext {
		public FunctionIdentifierContext functionIdentifier() {
			return getRuleContext(FunctionIdentifierContext.class,0);
		}
		public TerminalNode EOF() { return getToken(sparkParser.EOF, 0); }
		public SingleFunctionIdentifierContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_singleFunctionIdentifier; }
	}

	public final SingleFunctionIdentifierContext singleFunctionIdentifier() throws RecognitionException {
		SingleFunctionIdentifierContext _localctx = new SingleFunctionIdentifierContext(_ctx, getState());
		enterRule(_localctx, 6, RULE_singleFunctionIdentifier);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(211);
			functionIdentifier();
			setState(212);
			match(EOF);
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static class SingleDataTypeContext extends ParserRuleContext {
		public DataTypeContext dataType() {
			return getRuleContext(DataTypeContext.class,0);
		}
		public TerminalNode EOF() { return getToken(sparkParser.EOF, 0); }
		public SingleDataTypeContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_singleDataType; }
	}

	public final SingleDataTypeContext singleDataType() throws RecognitionException {
		SingleDataTypeContext _localctx = new SingleDataTypeContext(_ctx, getState());
		enterRule(_localctx, 8, RULE_singleDataType);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(214);
			dataType();
			setState(215);
			match(EOF);
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static class SingleTableSchemaContext extends ParserRuleContext {
		public ColTypeListContext colTypeList() {
			return getRuleContext(ColTypeListContext.class,0);
		}
		public TerminalNode EOF() { return getToken(sparkParser.EOF, 0); }
		public SingleTableSchemaContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_singleTableSchema; }
	}

	public final SingleTableSchemaContext singleTableSchema() throws RecognitionException {
		SingleTableSchemaContext _localctx = new SingleTableSchemaContext(_ctx, getState());
		enterRule(_localctx, 10, RULE_singleTableSchema);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(217);
			colTypeList();
			setState(218);
			match(EOF);
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static class StatementContext extends ParserRuleContext {
		public StatementContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_statement; }
	 
		public StatementContext() { }
		public void copyFrom(StatementContext ctx) {
			super.copyFrom(ctx);
		}
	}
	public static class ExplainContext extends StatementContext {
		public TerminalNode EXPLAIN() { return getToken(sparkParser.EXPLAIN, 0); }
		public StatementContext statement() {
			return getRuleContext(StatementContext.class,0);
		}
		public TerminalNode LOGICAL() { return getToken(sparkParser.LOGICAL, 0); }
		public TerminalNode FORMATTED() { return getToken(sparkParser.FORMATTED, 0); }
		public TerminalNode EXTENDED() { return getToken(sparkParser.EXTENDED, 0); }
		public TerminalNode CODEGEN() { return getToken(sparkParser.CODEGEN, 0); }
		public TerminalNode COST() { return getToken(sparkParser.COST, 0); }
		public ExplainContext(StatementContext ctx) { copyFrom(ctx); }
	}
	public static class DropDatabaseContext extends StatementContext {
		public TerminalNode DROP() { return getToken(sparkParser.DROP, 0); }
		public TerminalNode DATABASE() { return getToken(sparkParser.DATABASE, 0); }
		public IdentifierContext identifier() {
			return getRuleContext(IdentifierContext.class,0);
		}
		public TerminalNode IF() { return getToken(sparkParser.IF, 0); }
		public TerminalNode EXISTS() { return getToken(sparkParser.EXISTS, 0); }
		public TerminalNode RESTRICT() { return getToken(sparkParser.RESTRICT, 0); }
		public TerminalNode CASCADE() { return getToken(sparkParser.CASCADE, 0); }
		public DropDatabaseContext(StatementContext ctx) { copyFrom(ctx); }
	}
	public static class ResetConfigurationContext extends StatementContext {
		public TerminalNode RESET() { return getToken(sparkParser.RESET, 0); }
		public ResetConfigurationContext(StatementContext ctx) { copyFrom(ctx); }
	}
	public static class DescribeDatabaseContext extends StatementContext {
		public TerminalNode DATABASE() { return getToken(sparkParser.DATABASE, 0); }
		public IdentifierContext identifier() {
			return getRuleContext(IdentifierContext.class,0);
		}
		public TerminalNode DESC() { return getToken(sparkParser.DESC, 0); }
		public TerminalNode DESCRIBE() { return getToken(sparkParser.DESCRIBE, 0); }
		public TerminalNode EXTENDED() { return getToken(sparkParser.EXTENDED, 0); }
		public DescribeDatabaseContext(StatementContext ctx) { copyFrom(ctx); }
	}
	public static class AlterViewQueryContext extends StatementContext {
		public TerminalNode ALTER() { return getToken(sparkParser.ALTER, 0); }
		public TerminalNode VIEW() { return getToken(sparkParser.VIEW, 0); }
		public TableIdentifierContext tableIdentifier() {
			return getRuleContext(TableIdentifierContext.class,0);
		}
		public QueryContext query() {
			return getRuleContext(QueryContext.class,0);
		}
		public TerminalNode AS() { return getToken(sparkParser.AS, 0); }
		public AlterViewQueryContext(StatementContext ctx) { copyFrom(ctx); }
	}
	public static class UseContext extends StatementContext {
		public IdentifierContext db;
		public TerminalNode USE() { return getToken(sparkParser.USE, 0); }
		public IdentifierContext identifier() {
			return getRuleContext(IdentifierContext.class,0);
		}
		public UseContext(StatementContext ctx) { copyFrom(ctx); }
	}
	public static class CreateTempViewUsingContext extends StatementContext {
		public TerminalNode CREATE() { return getToken(sparkParser.CREATE, 0); }
		public TerminalNode TEMPORARY() { return getToken(sparkParser.TEMPORARY, 0); }
		public TerminalNode VIEW() { return getToken(sparkParser.VIEW, 0); }
		public TableIdentifierContext tableIdentifier() {
			return getRuleContext(TableIdentifierContext.class,0);
		}
		public TableProviderContext tableProvider() {
			return getRuleContext(TableProviderContext.class,0);
		}
		public TerminalNode OR() { return getToken(sparkParser.OR, 0); }
		public TerminalNode REPLACE() { return getToken(sparkParser.REPLACE, 0); }
		public TerminalNode GLOBAL() { return getToken(sparkParser.GLOBAL, 0); }
		public ColTypeListContext colTypeList() {
			return getRuleContext(ColTypeListContext.class,0);
		}
		public TerminalNode OPTIONS() { return getToken(sparkParser.OPTIONS, 0); }
		public TablePropertyListContext tablePropertyList() {
			return getRuleContext(TablePropertyListContext.class,0);
		}
		public CreateTempViewUsingContext(StatementContext ctx) { copyFrom(ctx); }
	}
	public static class RenameTableContext extends StatementContext {
		public TableIdentifierContext from;
		public TableIdentifierContext to;
		public TerminalNode ALTER() { return getToken(sparkParser.ALTER, 0); }
		public TerminalNode RENAME() { return getToken(sparkParser.RENAME, 0); }
		public TerminalNode TO() { return getToken(sparkParser.TO, 0); }
		public TerminalNode TABLE() { return getToken(sparkParser.TABLE, 0); }
		public TerminalNode VIEW() { return getToken(sparkParser.VIEW, 0); }
		public List<TableIdentifierContext> tableIdentifier() {
			return getRuleContexts(TableIdentifierContext.class);
		}
		public TableIdentifierContext tableIdentifier(int i) {
			return getRuleContext(TableIdentifierContext.class,i);
		}
		public RenameTableContext(StatementContext ctx) { copyFrom(ctx); }
	}
	public static class FailNativeCommandContext extends StatementContext {
		public TerminalNode SET() { return getToken(sparkParser.SET, 0); }
		public TerminalNode ROLE() { return getToken(sparkParser.ROLE, 0); }
		public UnsupportedHiveNativeCommandsContext unsupportedHiveNativeCommands() {
			return getRuleContext(UnsupportedHiveNativeCommandsContext.class,0);
		}
		public FailNativeCommandContext(StatementContext ctx) { copyFrom(ctx); }
	}
	public static class ClearCacheContext extends StatementContext {
		public TerminalNode CLEAR() { return getToken(sparkParser.CLEAR, 0); }
		public TerminalNode CACHE() { return getToken(sparkParser.CACHE, 0); }
		public ClearCacheContext(StatementContext ctx) { copyFrom(ctx); }
	}
	public static class ShowTablesContext extends StatementContext {
		public IdentifierContext db;
		public Token pattern;
		public TerminalNode SHOW() { return getToken(sparkParser.SHOW, 0); }
		public TerminalNode TABLES() { return getToken(sparkParser.TABLES, 0); }
		public TerminalNode FROM() { return getToken(sparkParser.FROM, 0); }
		public TerminalNode IN() { return getToken(sparkParser.IN, 0); }
		public IdentifierContext identifier() {
			return getRuleContext(IdentifierContext.class,0);
		}
		public TerminalNode STRING() { return getToken(sparkParser.STRING, 0); }
		public TerminalNode LIKE() { return getToken(sparkParser.LIKE, 0); }
		public ShowTablesContext(StatementContext ctx) { copyFrom(ctx); }
	}
	public static class RecoverPartitionsContext extends StatementContext {
		public TerminalNode ALTER() { return getToken(sparkParser.ALTER, 0); }
		public TerminalNode TABLE() { return getToken(sparkParser.TABLE, 0); }
		public TableIdentifierContext tableIdentifier() {
			return getRuleContext(TableIdentifierContext.class,0);
		}
		public TerminalNode RECOVER() { return getToken(sparkParser.RECOVER, 0); }
		public TerminalNode PARTITIONS() { return getToken(sparkParser.PARTITIONS, 0); }
		public RecoverPartitionsContext(StatementContext ctx) { copyFrom(ctx); }
	}
	public static class RenameTablePartitionContext extends StatementContext {
		public PartitionSpecContext from;
		public PartitionSpecContext to;
		public TerminalNode ALTER() { return getToken(sparkParser.ALTER, 0); }
		public TerminalNode TABLE() { return getToken(sparkParser.TABLE, 0); }
		public TableIdentifierContext tableIdentifier() {
			return getRuleContext(TableIdentifierContext.class,0);
		}
		public TerminalNode RENAME() { return getToken(sparkParser.RENAME, 0); }
		public TerminalNode TO() { return getToken(sparkParser.TO, 0); }
		public List<PartitionSpecContext> partitionSpec() {
			return getRuleContexts(PartitionSpecContext.class);
		}
		public PartitionSpecContext partitionSpec(int i) {
			return getRuleContext(PartitionSpecContext.class,i);
		}
		public RenameTablePartitionContext(StatementContext ctx) { copyFrom(ctx); }
	}
	public static class RepairTableContext extends StatementContext {
		public TerminalNode MSCK() { return getToken(sparkParser.MSCK, 0); }
		public TerminalNode REPAIR() { return getToken(sparkParser.REPAIR, 0); }
		public TerminalNode TABLE() { return getToken(sparkParser.TABLE, 0); }
		public TableIdentifierContext tableIdentifier() {
			return getRuleContext(TableIdentifierContext.class,0);
		}
		public RepairTableContext(StatementContext ctx) { copyFrom(ctx); }
	}
	public static class RefreshResourceContext extends StatementContext {
		public TerminalNode REFRESH() { return getToken(sparkParser.REFRESH, 0); }
		public TerminalNode STRING() { return getToken(sparkParser.STRING, 0); }
		public RefreshResourceContext(StatementContext ctx) { copyFrom(ctx); }
	}
	public static class ShowCreateTableContext extends StatementContext {
		public TerminalNode SHOW() { return getToken(sparkParser.SHOW, 0); }
		public TerminalNode CREATE() { return getToken(sparkParser.CREATE, 0); }
		public TerminalNode TABLE() { return getToken(sparkParser.TABLE, 0); }
		public TableIdentifierContext tableIdentifier() {
			return getRuleContext(TableIdentifierContext.class,0);
		}
		public ShowCreateTableContext(StatementContext ctx) { copyFrom(ctx); }
	}
	public static class ShowColumnsContext extends StatementContext {
		public IdentifierContext db;
		public TerminalNode SHOW() { return getToken(sparkParser.SHOW, 0); }
		public TerminalNode COLUMNS() { return getToken(sparkParser.COLUMNS, 0); }
		public TableIdentifierContext tableIdentifier() {
			return getRuleContext(TableIdentifierContext.class,0);
		}
		public List<TerminalNode> FROM() { return getTokens(sparkParser.FROM); }
		public TerminalNode FROM(int i) {
			return getToken(sparkParser.FROM, i);
		}
		public List<TerminalNode> IN() { return getTokens(sparkParser.IN); }
		public TerminalNode IN(int i) {
			return getToken(sparkParser.IN, i);
		}
		public IdentifierContext identifier() {
			return getRuleContext(IdentifierContext.class,0);
		}
		public ShowColumnsContext(StatementContext ctx) { copyFrom(ctx); }
	}
	public static class AddTablePartitionContext extends StatementContext {
		public TerminalNode ALTER() { return getToken(sparkParser.ALTER, 0); }
		public TerminalNode TABLE() { return getToken(sparkParser.TABLE, 0); }
		public TableIdentifierContext tableIdentifier() {
			return getRuleContext(TableIdentifierContext.class,0);
		}
		public TerminalNode ADD() { return getToken(sparkParser.ADD, 0); }
		public TerminalNode IF() { return getToken(sparkParser.IF, 0); }
		public TerminalNode NOT() { return getToken(sparkParser.NOT, 0); }
		public TerminalNode EXISTS() { return getToken(sparkParser.EXISTS, 0); }
		public List<PartitionSpecLocationContext> partitionSpecLocation() {
			return getRuleContexts(PartitionSpecLocationContext.class);
		}
		public PartitionSpecLocationContext partitionSpecLocation(int i) {
			return getRuleContext(PartitionSpecLocationContext.class,i);
		}
		public TerminalNode VIEW() { return getToken(sparkParser.VIEW, 0); }
		public List<PartitionSpecContext> partitionSpec() {
			return getRuleContexts(PartitionSpecContext.class);
		}
		public PartitionSpecContext partitionSpec(int i) {
			return getRuleContext(PartitionSpecContext.class,i);
		}
		public AddTablePartitionContext(StatementContext ctx) { copyFrom(ctx); }
	}
	public static class RefreshTableContext extends StatementContext {
		public TerminalNode REFRESH() { return getToken(sparkParser.REFRESH, 0); }
		public TerminalNode TABLE() { return getToken(sparkParser.TABLE, 0); }
		public TableIdentifierContext tableIdentifier() {
			return getRuleContext(TableIdentifierContext.class,0);
		}
		public RefreshTableContext(StatementContext ctx) { copyFrom(ctx); }
	}
	public static class ManageResourceContext extends StatementContext {
		public Token op;
		public IdentifierContext identifier() {
			return getRuleContext(IdentifierContext.class,0);
		}
		public TerminalNode ADD() { return getToken(sparkParser.ADD, 0); }
		public TerminalNode LIST() { return getToken(sparkParser.LIST, 0); }
		public ManageResourceContext(StatementContext ctx) { copyFrom(ctx); }
	}
	public static class CreateDatabaseContext extends StatementContext {
		public Token comment;
		public TerminalNode CREATE() { return getToken(sparkParser.CREATE, 0); }
		public TerminalNode DATABASE() { return getToken(sparkParser.DATABASE, 0); }
		public IdentifierContext identifier() {
			return getRuleContext(IdentifierContext.class,0);
		}
		public TerminalNode IF() { return getToken(sparkParser.IF, 0); }
		public TerminalNode NOT() { return getToken(sparkParser.NOT, 0); }
		public TerminalNode EXISTS() { return getToken(sparkParser.EXISTS, 0); }
		public TerminalNode COMMENT() { return getToken(sparkParser.COMMENT, 0); }
		public LocationSpecContext locationSpec() {
			return getRuleContext(LocationSpecContext.class,0);
		}
		public TerminalNode WITH() { return getToken(sparkParser.WITH, 0); }
		public TerminalNode DBPROPERTIES() { return getToken(sparkParser.DBPROPERTIES, 0); }
		public TablePropertyListContext tablePropertyList() {
			return getRuleContext(TablePropertyListContext.class,0);
		}
		public TerminalNode STRING() { return getToken(sparkParser.STRING, 0); }
		public CreateDatabaseContext(StatementContext ctx) { copyFrom(ctx); }
	}
	public static class AnalyzeContext extends StatementContext {
		public TerminalNode ANALYZE() { return getToken(sparkParser.ANALYZE, 0); }
		public TerminalNode TABLE() { return getToken(sparkParser.TABLE, 0); }
		public TableIdentifierContext tableIdentifier() {
			return getRuleContext(TableIdentifierContext.class,0);
		}
		public TerminalNode COMPUTE() { return getToken(sparkParser.COMPUTE, 0); }
		public TerminalNode STATISTICS() { return getToken(sparkParser.STATISTICS, 0); }
		public PartitionSpecContext partitionSpec() {
			return getRuleContext(PartitionSpecContext.class,0);
		}
		public IdentifierContext identifier() {
			return getRuleContext(IdentifierContext.class,0);
		}
		public TerminalNode FOR() { return getToken(sparkParser.FOR, 0); }
		public TerminalNode COLUMNS() { return getToken(sparkParser.COLUMNS, 0); }
		public IdentifierSeqContext identifierSeq() {
			return getRuleContext(IdentifierSeqContext.class,0);
		}
		public TerminalNode ALL() { return getToken(sparkParser.ALL, 0); }
		public AnalyzeContext(StatementContext ctx) { copyFrom(ctx); }
	}
	public static class CreateHiveTableContext extends StatementContext {
		public ColTypeListContext columns;
		public Token comment;
		public ColTypeListContext partitionColumns;
		public TablePropertyListContext tableProps;
		public CreateTableHeaderContext createTableHeader() {
			return getRuleContext(CreateTableHeaderContext.class,0);
		}
		public List<BucketSpecContext> bucketSpec() {
			return getRuleContexts(BucketSpecContext.class);
		}
		public BucketSpecContext bucketSpec(int i) {
			return getRuleContext(BucketSpecContext.class,i);
		}
		public List<SkewSpecContext> skewSpec() {
			return getRuleContexts(SkewSpecContext.class);
		}
		public SkewSpecContext skewSpec(int i) {
			return getRuleContext(SkewSpecContext.class,i);
		}
		public List<RowFormatContext> rowFormat() {
			return getRuleContexts(RowFormatContext.class);
		}
		public RowFormatContext rowFormat(int i) {
			return getRuleContext(RowFormatContext.class,i);
		}
		public List<CreateFileFormatContext> createFileFormat() {
			return getRuleContexts(CreateFileFormatContext.class);
		}
		public CreateFileFormatContext createFileFormat(int i) {
			return getRuleContext(CreateFileFormatContext.class,i);
		}
		public List<LocationSpecContext> locationSpec() {
			return getRuleContexts(LocationSpecContext.class);
		}
		public LocationSpecContext locationSpec(int i) {
			return getRuleContext(LocationSpecContext.class,i);
		}
		public QueryContext query() {
			return getRuleContext(QueryContext.class,0);
		}
		public List<ColTypeListContext> colTypeList() {
			return getRuleContexts(ColTypeListContext.class);
		}
		public ColTypeListContext colTypeList(int i) {
			return getRuleContext(ColTypeListContext.class,i);
		}
		public List<TerminalNode> COMMENT() { return getTokens(sparkParser.COMMENT); }
		public TerminalNode COMMENT(int i) {
			return getToken(sparkParser.COMMENT, i);
		}
		public List<TerminalNode> PARTITIONED() { return getTokens(sparkParser.PARTITIONED); }
		public TerminalNode PARTITIONED(int i) {
			return getToken(sparkParser.PARTITIONED, i);
		}
		public List<TerminalNode> BY() { return getTokens(sparkParser.BY); }
		public TerminalNode BY(int i) {
			return getToken(sparkParser.BY, i);
		}
		public List<TerminalNode> TBLPROPERTIES() { return getTokens(sparkParser.TBLPROPERTIES); }
		public TerminalNode TBLPROPERTIES(int i) {
			return getToken(sparkParser.TBLPROPERTIES, i);
		}
		public List<TerminalNode> STRING() { return getTokens(sparkParser.STRING); }
		public TerminalNode STRING(int i) {
			return getToken(sparkParser.STRING, i);
		}
		public List<TablePropertyListContext> tablePropertyList() {
			return getRuleContexts(TablePropertyListContext.class);
		}
		public TablePropertyListContext tablePropertyList(int i) {
			return getRuleContext(TablePropertyListContext.class,i);
		}
		public TerminalNode AS() { return getToken(sparkParser.AS, 0); }
		public CreateHiveTableContext(StatementContext ctx) { copyFrom(ctx); }
	}
	public static class CreateFunctionContext extends StatementContext {
		public Token className;
		public TerminalNode CREATE() { return getToken(sparkParser.CREATE, 0); }
		public TerminalNode FUNCTION() { return getToken(sparkParser.FUNCTION, 0); }
		public QualifiedNameContext qualifiedName() {
			return getRuleContext(QualifiedNameContext.class,0);
		}
		public TerminalNode AS() { return getToken(sparkParser.AS, 0); }
		public TerminalNode STRING() { return getToken(sparkParser.STRING, 0); }
		public TerminalNode OR() { return getToken(sparkParser.OR, 0); }
		public TerminalNode REPLACE() { return getToken(sparkParser.REPLACE, 0); }
		public TerminalNode TEMPORARY() { return getToken(sparkParser.TEMPORARY, 0); }
		public TerminalNode IF() { return getToken(sparkParser.IF, 0); }
		public TerminalNode NOT() { return getToken(sparkParser.NOT, 0); }
		public TerminalNode EXISTS() { return getToken(sparkParser.EXISTS, 0); }
		public TerminalNode USING() { return getToken(sparkParser.USING, 0); }
		public List<ResourceContext> resource() {
			return getRuleContexts(ResourceContext.class);
		}
		public ResourceContext resource(int i) {
			return getRuleContext(ResourceContext.class,i);
		}
		public CreateFunctionContext(StatementContext ctx) { copyFrom(ctx); }
	}
	public static class ShowTableContext extends StatementContext {
		public IdentifierContext db;
		public Token pattern;
		public TerminalNode SHOW() { return getToken(sparkParser.SHOW, 0); }
		public TerminalNode TABLE() { return getToken(sparkParser.TABLE, 0); }
		public TerminalNode EXTENDED() { return getToken(sparkParser.EXTENDED, 0); }
		public TerminalNode LIKE() { return getToken(sparkParser.LIKE, 0); }
		public TerminalNode STRING() { return getToken(sparkParser.STRING, 0); }
		public PartitionSpecContext partitionSpec() {
			return getRuleContext(PartitionSpecContext.class,0);
		}
		public TerminalNode FROM() { return getToken(sparkParser.FROM, 0); }
		public TerminalNode IN() { return getToken(sparkParser.IN, 0); }
		public IdentifierContext identifier() {
			return getRuleContext(IdentifierContext.class,0);
		}
		public ShowTableContext(StatementContext ctx) { copyFrom(ctx); }
	}
	public static class SetDatabasePropertiesContext extends StatementContext {
		public TerminalNode ALTER() { return getToken(sparkParser.ALTER, 0); }
		public TerminalNode DATABASE() { return getToken(sparkParser.DATABASE, 0); }
		public IdentifierContext identifier() {
			return getRuleContext(IdentifierContext.class,0);
		}
		public TerminalNode SET() { return getToken(sparkParser.SET, 0); }
		public TerminalNode DBPROPERTIES() { return getToken(sparkParser.DBPROPERTIES, 0); }
		public TablePropertyListContext tablePropertyList() {
			return getRuleContext(TablePropertyListContext.class,0);
		}
		public SetDatabasePropertiesContext(StatementContext ctx) { copyFrom(ctx); }
	}
	public static class CreateTableContext extends StatementContext {
		public TablePropertyListContext options;
		public IdentifierListContext partitionColumnNames;
		public Token comment;
		public TablePropertyListContext tableProps;
		public CreateTableHeaderContext createTableHeader() {
			return getRuleContext(CreateTableHeaderContext.class,0);
		}
		public TableProviderContext tableProvider() {
			return getRuleContext(TableProviderContext.class,0);
		}
		public ColTypeListContext colTypeList() {
			return getRuleContext(ColTypeListContext.class,0);
		}
		public List<BucketSpecContext> bucketSpec() {
			return getRuleContexts(BucketSpecContext.class);
		}
		public BucketSpecContext bucketSpec(int i) {
			return getRuleContext(BucketSpecContext.class,i);
		}
		public List<LocationSpecContext> locationSpec() {
			return getRuleContexts(LocationSpecContext.class);
		}
		public LocationSpecContext locationSpec(int i) {
			return getRuleContext(LocationSpecContext.class,i);
		}
		public QueryContext query() {
			return getRuleContext(QueryContext.class,0);
		}
		public List<TerminalNode> OPTIONS() { return getTokens(sparkParser.OPTIONS); }
		public TerminalNode OPTIONS(int i) {
			return getToken(sparkParser.OPTIONS, i);
		}
		public List<TerminalNode> PARTITIONED() { return getTokens(sparkParser.PARTITIONED); }
		public TerminalNode PARTITIONED(int i) {
			return getToken(sparkParser.PARTITIONED, i);
		}
		public List<TerminalNode> BY() { return getTokens(sparkParser.BY); }
		public TerminalNode BY(int i) {
			return getToken(sparkParser.BY, i);
		}
		public List<TerminalNode> COMMENT() { return getTokens(sparkParser.COMMENT); }
		public TerminalNode COMMENT(int i) {
			return getToken(sparkParser.COMMENT, i);
		}
		public List<TerminalNode> TBLPROPERTIES() { return getTokens(sparkParser.TBLPROPERTIES); }
		public TerminalNode TBLPROPERTIES(int i) {
			return getToken(sparkParser.TBLPROPERTIES, i);
		}
		public List<TablePropertyListContext> tablePropertyList() {
			return getRuleContexts(TablePropertyListContext.class);
		}
		public TablePropertyListContext tablePropertyList(int i) {
			return getRuleContext(TablePropertyListContext.class,i);
		}
		public List<IdentifierListContext> identifierList() {
			return getRuleContexts(IdentifierListContext.class);
		}
		public IdentifierListContext identifierList(int i) {
			return getRuleContext(IdentifierListContext.class,i);
		}
		public List<TerminalNode> STRING() { return getTokens(sparkParser.STRING); }
		public TerminalNode STRING(int i) {
			return getToken(sparkParser.STRING, i);
		}
		public TerminalNode AS() { return getToken(sparkParser.AS, 0); }
		public CreateTableContext(StatementContext ctx) { copyFrom(ctx); }
	}
	public static class DescribeTableContext extends StatementContext {
		public Token option;
		public TableIdentifierContext tableIdentifier() {
			return getRuleContext(TableIdentifierContext.class,0);
		}
		public TerminalNode DESC() { return getToken(sparkParser.DESC, 0); }
		public TerminalNode DESCRIBE() { return getToken(sparkParser.DESCRIBE, 0); }
		public TerminalNode TABLE() { return getToken(sparkParser.TABLE, 0); }
		public PartitionSpecContext partitionSpec() {
			return getRuleContext(PartitionSpecContext.class,0);
		}
		public DescribeColNameContext describeColName() {
			return getRuleContext(DescribeColNameContext.class,0);
		}
		public TerminalNode EXTENDED() { return getToken(sparkParser.EXTENDED, 0); }
		public TerminalNode FORMATTED() { return getToken(sparkParser.FORMATTED, 0); }
		public DescribeTableContext(StatementContext ctx) { copyFrom(ctx); }
	}
	public static class CreateTableLikeContext extends StatementContext {
		public TableIdentifierContext target;
		public TableIdentifierContext source;
		public TerminalNode CREATE() { return getToken(sparkParser.CREATE, 0); }
		public TerminalNode TABLE() { return getToken(sparkParser.TABLE, 0); }
		public TerminalNode LIKE() { return getToken(sparkParser.LIKE, 0); }
		public List<TableIdentifierContext> tableIdentifier() {
			return getRuleContexts(TableIdentifierContext.class);
		}
		public TableIdentifierContext tableIdentifier(int i) {
			return getRuleContext(TableIdentifierContext.class,i);
		}
		public TerminalNode IF() { return getToken(sparkParser.IF, 0); }
		public TerminalNode NOT() { return getToken(sparkParser.NOT, 0); }
		public TerminalNode EXISTS() { return getToken(sparkParser.EXISTS, 0); }
		public LocationSpecContext locationSpec() {
			return getRuleContext(LocationSpecContext.class,0);
		}
		public CreateTableLikeContext(StatementContext ctx) { copyFrom(ctx); }
	}
	public static class UncacheTableContext extends StatementContext {
		public TerminalNode UNCACHE() { return getToken(sparkParser.UNCACHE, 0); }
		public TerminalNode TABLE() { return getToken(sparkParser.TABLE, 0); }
		public TableIdentifierContext tableIdentifier() {
			return getRuleContext(TableIdentifierContext.class,0);
		}
		public TerminalNode IF() { return getToken(sparkParser.IF, 0); }
		public TerminalNode EXISTS() { return getToken(sparkParser.EXISTS, 0); }
		public UncacheTableContext(StatementContext ctx) { copyFrom(ctx); }
	}
	public static class DropFunctionContext extends StatementContext {
		public TerminalNode DROP() { return getToken(sparkParser.DROP, 0); }
		public TerminalNode FUNCTION() { return getToken(sparkParser.FUNCTION, 0); }
		public QualifiedNameContext qualifiedName() {
			return getRuleContext(QualifiedNameContext.class,0);
		}
		public TerminalNode TEMPORARY() { return getToken(sparkParser.TEMPORARY, 0); }
		public TerminalNode IF() { return getToken(sparkParser.IF, 0); }
		public TerminalNode EXISTS() { return getToken(sparkParser.EXISTS, 0); }
		public DropFunctionContext(StatementContext ctx) { copyFrom(ctx); }
	}
	public static class LoadDataContext extends StatementContext {
		public Token path;
		public TerminalNode LOAD() { return getToken(sparkParser.LOAD, 0); }
		public TerminalNode DATA() { return getToken(sparkParser.DATA, 0); }
		public TerminalNode INPATH() { return getToken(sparkParser.INPATH, 0); }
		public TerminalNode INTO() { return getToken(sparkParser.INTO, 0); }
		public TerminalNode TABLE() { return getToken(sparkParser.TABLE, 0); }
		public TableIdentifierContext tableIdentifier() {
			return getRuleContext(TableIdentifierContext.class,0);
		}
		public TerminalNode STRING() { return getToken(sparkParser.STRING, 0); }
		public TerminalNode LOCAL() { return getToken(sparkParser.LOCAL, 0); }
		public TerminalNode OVERWRITE() { return getToken(sparkParser.OVERWRITE, 0); }
		public PartitionSpecContext partitionSpec() {
			return getRuleContext(PartitionSpecContext.class,0);
		}
		public LoadDataContext(StatementContext ctx) { copyFrom(ctx); }
	}
	public static class ShowPartitionsContext extends StatementContext {
		public TerminalNode SHOW() { return getToken(sparkParser.SHOW, 0); }
		public TerminalNode PARTITIONS() { return getToken(sparkParser.PARTITIONS, 0); }
		public TableIdentifierContext tableIdentifier() {
			return getRuleContext(TableIdentifierContext.class,0);
		}
		public PartitionSpecContext partitionSpec() {
			return getRuleContext(PartitionSpecContext.class,0);
		}
		public ShowPartitionsContext(StatementContext ctx) { copyFrom(ctx); }
	}
	public static class DescribeFunctionContext extends StatementContext {
		public TerminalNode FUNCTION() { return getToken(sparkParser.FUNCTION, 0); }
		public DescribeFuncNameContext describeFuncName() {
			return getRuleContext(DescribeFuncNameContext.class,0);
		}
		public TerminalNode DESC() { return getToken(sparkParser.DESC, 0); }
		public TerminalNode DESCRIBE() { return getToken(sparkParser.DESCRIBE, 0); }
		public TerminalNode EXTENDED() { return getToken(sparkParser.EXTENDED, 0); }
		public DescribeFunctionContext(StatementContext ctx) { copyFrom(ctx); }
	}
	public static class ChangeColumnContext extends StatementContext {
		public TerminalNode ALTER() { return getToken(sparkParser.ALTER, 0); }
		public TerminalNode TABLE() { return getToken(sparkParser.TABLE, 0); }
		public TableIdentifierContext tableIdentifier() {
			return getRuleContext(TableIdentifierContext.class,0);
		}
		public TerminalNode CHANGE() { return getToken(sparkParser.CHANGE, 0); }
		public IdentifierContext identifier() {
			return getRuleContext(IdentifierContext.class,0);
		}
		public ColTypeContext colType() {
			return getRuleContext(ColTypeContext.class,0);
		}
		public PartitionSpecContext partitionSpec() {
			return getRuleContext(PartitionSpecContext.class,0);
		}
		public TerminalNode COLUMN() { return getToken(sparkParser.COLUMN, 0); }
		public ColPositionContext colPosition() {
			return getRuleContext(ColPositionContext.class,0);
		}
		public ChangeColumnContext(StatementContext ctx) { copyFrom(ctx); }
	}
	public static class StatementDefaultContext extends StatementContext {
		public QueryContext query() {
			return getRuleContext(QueryContext.class,0);
		}
		public StatementDefaultContext(StatementContext ctx) { copyFrom(ctx); }
	}
	public static class TruncateTableContext extends StatementContext {
		public TerminalNode TRUNCATE() { return getToken(sparkParser.TRUNCATE, 0); }
		public TerminalNode TABLE() { return getToken(sparkParser.TABLE, 0); }
		public TableIdentifierContext tableIdentifier() {
			return getRuleContext(TableIdentifierContext.class,0);
		}
		public PartitionSpecContext partitionSpec() {
			return getRuleContext(PartitionSpecContext.class,0);
		}
		public TruncateTableContext(StatementContext ctx) { copyFrom(ctx); }
	}
	public static class SetTableSerDeContext extends StatementContext {
		public TerminalNode ALTER() { return getToken(sparkParser.ALTER, 0); }
		public TerminalNode TABLE() { return getToken(sparkParser.TABLE, 0); }
		public TableIdentifierContext tableIdentifier() {
			return getRuleContext(TableIdentifierContext.class,0);
		}
		public TerminalNode SET() { return getToken(sparkParser.SET, 0); }
		public TerminalNode SERDE() { return getToken(sparkParser.SERDE, 0); }
		public TerminalNode STRING() { return getToken(sparkParser.STRING, 0); }
		public PartitionSpecContext partitionSpec() {
			return getRuleContext(PartitionSpecContext.class,0);
		}
		public TerminalNode WITH() { return getToken(sparkParser.WITH, 0); }
		public TerminalNode SERDEPROPERTIES() { return getToken(sparkParser.SERDEPROPERTIES, 0); }
		public TablePropertyListContext tablePropertyList() {
			return getRuleContext(TablePropertyListContext.class,0);
		}
		public SetTableSerDeContext(StatementContext ctx) { copyFrom(ctx); }
	}
	public static class CreateViewContext extends StatementContext {
		public TerminalNode CREATE() { return getToken(sparkParser.CREATE, 0); }
		public TerminalNode VIEW() { return getToken(sparkParser.VIEW, 0); }
		public TableIdentifierContext tableIdentifier() {
			return getRuleContext(TableIdentifierContext.class,0);
		}
		public TerminalNode AS() { return getToken(sparkParser.AS, 0); }
		public QueryContext query() {
			return getRuleContext(QueryContext.class,0);
		}
		public TerminalNode OR() { return getToken(sparkParser.OR, 0); }
		public TerminalNode REPLACE() { return getToken(sparkParser.REPLACE, 0); }
		public TerminalNode TEMPORARY() { return getToken(sparkParser.TEMPORARY, 0); }
		public TerminalNode IF() { return getToken(sparkParser.IF, 0); }
		public TerminalNode NOT() { return getToken(sparkParser.NOT, 0); }
		public TerminalNode EXISTS() { return getToken(sparkParser.EXISTS, 0); }
		public IdentifierCommentListContext identifierCommentList() {
			return getRuleContext(IdentifierCommentListContext.class,0);
		}
		public TerminalNode COMMENT() { return getToken(sparkParser.COMMENT, 0); }
		public TerminalNode STRING() { return getToken(sparkParser.STRING, 0); }
		public TerminalNode PARTITIONED() { return getToken(sparkParser.PARTITIONED, 0); }
		public TerminalNode ON() { return getToken(sparkParser.ON, 0); }
		public IdentifierListContext identifierList() {
			return getRuleContext(IdentifierListContext.class,0);
		}
		public TerminalNode TBLPROPERTIES() { return getToken(sparkParser.TBLPROPERTIES, 0); }
		public TablePropertyListContext tablePropertyList() {
			return getRuleContext(TablePropertyListContext.class,0);
		}
		public TerminalNode GLOBAL() { return getToken(sparkParser.GLOBAL, 0); }
		public CreateViewContext(StatementContext ctx) { copyFrom(ctx); }
	}
	public static class DropTablePartitionsContext extends StatementContext {
		public TerminalNode ALTER() { return getToken(sparkParser.ALTER, 0); }
		public TerminalNode TABLE() { return getToken(sparkParser.TABLE, 0); }
		public TableIdentifierContext tableIdentifier() {
			return getRuleContext(TableIdentifierContext.class,0);
		}
		public TerminalNode DROP() { return getToken(sparkParser.DROP, 0); }
		public List<PartitionSpecContext> partitionSpec() {
			return getRuleContexts(PartitionSpecContext.class);
		}
		public PartitionSpecContext partitionSpec(int i) {
			return getRuleContext(PartitionSpecContext.class,i);
		}
		public TerminalNode IF() { return getToken(sparkParser.IF, 0); }
		public TerminalNode EXISTS() { return getToken(sparkParser.EXISTS, 0); }
		public TerminalNode PURGE() { return getToken(sparkParser.PURGE, 0); }
		public TerminalNode VIEW() { return getToken(sparkParser.VIEW, 0); }
		public DropTablePartitionsContext(StatementContext ctx) { copyFrom(ctx); }
	}
	public static class SetConfigurationContext extends StatementContext {
		public TerminalNode SET() { return getToken(sparkParser.SET, 0); }
		public SetConfigurationContext(StatementContext ctx) { copyFrom(ctx); }
	}
	public static class DropTableContext extends StatementContext {
		public TerminalNode DROP() { return getToken(sparkParser.DROP, 0); }
		public TerminalNode TABLE() { return getToken(sparkParser.TABLE, 0); }
		public TableIdentifierContext tableIdentifier() {
			return getRuleContext(TableIdentifierContext.class,0);
		}
		public TerminalNode IF() { return getToken(sparkParser.IF, 0); }
		public TerminalNode EXISTS() { return getToken(sparkParser.EXISTS, 0); }
		public TerminalNode PURGE() { return getToken(sparkParser.PURGE, 0); }
		public TerminalNode VIEW() { return getToken(sparkParser.VIEW, 0); }
		public DropTableContext(StatementContext ctx) { copyFrom(ctx); }
	}
	public static class ShowDatabasesContext extends StatementContext {
		public Token pattern;
		public TerminalNode SHOW() { return getToken(sparkParser.SHOW, 0); }
		public TerminalNode DATABASES() { return getToken(sparkParser.DATABASES, 0); }
		public TerminalNode STRING() { return getToken(sparkParser.STRING, 0); }
		public TerminalNode LIKE() { return getToken(sparkParser.LIKE, 0); }
		public ShowDatabasesContext(StatementContext ctx) { copyFrom(ctx); }
	}
	public static class ShowTblPropertiesContext extends StatementContext {
		public TableIdentifierContext table;
		public TablePropertyKeyContext key;
		public TerminalNode SHOW() { return getToken(sparkParser.SHOW, 0); }
		public TerminalNode TBLPROPERTIES() { return getToken(sparkParser.TBLPROPERTIES, 0); }
		public TableIdentifierContext tableIdentifier() {
			return getRuleContext(TableIdentifierContext.class,0);
		}
		public TablePropertyKeyContext tablePropertyKey() {
			return getRuleContext(TablePropertyKeyContext.class,0);
		}
		public ShowTblPropertiesContext(StatementContext ctx) { copyFrom(ctx); }
	}
	public static class UnsetTablePropertiesContext extends StatementContext {
		public TerminalNode ALTER() { return getToken(sparkParser.ALTER, 0); }
		public TableIdentifierContext tableIdentifier() {
			return getRuleContext(TableIdentifierContext.class,0);
		}
		public TerminalNode UNSET() { return getToken(sparkParser.UNSET, 0); }
		public TerminalNode TBLPROPERTIES() { return getToken(sparkParser.TBLPROPERTIES, 0); }
		public TablePropertyListContext tablePropertyList() {
			return getRuleContext(TablePropertyListContext.class,0);
		}
		public TerminalNode TABLE() { return getToken(sparkParser.TABLE, 0); }
		public TerminalNode VIEW() { return getToken(sparkParser.VIEW, 0); }
		public TerminalNode IF() { return getToken(sparkParser.IF, 0); }
		public TerminalNode EXISTS() { return getToken(sparkParser.EXISTS, 0); }
		public UnsetTablePropertiesContext(StatementContext ctx) { copyFrom(ctx); }
	}
	public static class SetTableLocationContext extends StatementContext {
		public TerminalNode ALTER() { return getToken(sparkParser.ALTER, 0); }
		public TerminalNode TABLE() { return getToken(sparkParser.TABLE, 0); }
		public TableIdentifierContext tableIdentifier() {
			return getRuleContext(TableIdentifierContext.class,0);
		}
		public TerminalNode SET() { return getToken(sparkParser.SET, 0); }
		public LocationSpecContext locationSpec() {
			return getRuleContext(LocationSpecContext.class,0);
		}
		public PartitionSpecContext partitionSpec() {
			return getRuleContext(PartitionSpecContext.class,0);
		}
		public SetTableLocationContext(StatementContext ctx) { copyFrom(ctx); }
	}
	public static class ShowFunctionsContext extends StatementContext {
		public Token pattern;
		public TerminalNode SHOW() { return getToken(sparkParser.SHOW, 0); }
		public TerminalNode FUNCTIONS() { return getToken(sparkParser.FUNCTIONS, 0); }
		public IdentifierContext identifier() {
			return getRuleContext(IdentifierContext.class,0);
		}
		public QualifiedNameContext qualifiedName() {
			return getRuleContext(QualifiedNameContext.class,0);
		}
		public TerminalNode LIKE() { return getToken(sparkParser.LIKE, 0); }
		public TerminalNode STRING() { return getToken(sparkParser.STRING, 0); }
		public ShowFunctionsContext(StatementContext ctx) { copyFrom(ctx); }
	}
	public static class CacheTableContext extends StatementContext {
		public TablePropertyListContext options;
		public TerminalNode CACHE() { return getToken(sparkParser.CACHE, 0); }
		public TerminalNode TABLE() { return getToken(sparkParser.TABLE, 0); }
		public TableIdentifierContext tableIdentifier() {
			return getRuleContext(TableIdentifierContext.class,0);
		}
		public TerminalNode LAZY() { return getToken(sparkParser.LAZY, 0); }
		public TerminalNode OPTIONS() { return getToken(sparkParser.OPTIONS, 0); }
		public QueryContext query() {
			return getRuleContext(QueryContext.class,0);
		}
		public TablePropertyListContext tablePropertyList() {
			return getRuleContext(TablePropertyListContext.class,0);
		}
		public TerminalNode AS() { return getToken(sparkParser.AS, 0); }
		public CacheTableContext(StatementContext ctx) { copyFrom(ctx); }
	}
	public static class AddTableColumnsContext extends StatementContext {
		public ColTypeListContext columns;
		public TerminalNode ALTER() { return getToken(sparkParser.ALTER, 0); }
		public TerminalNode TABLE() { return getToken(sparkParser.TABLE, 0); }
		public TableIdentifierContext tableIdentifier() {
			return getRuleContext(TableIdentifierContext.class,0);
		}
		public TerminalNode ADD() { return getToken(sparkParser.ADD, 0); }
		public TerminalNode COLUMNS() { return getToken(sparkParser.COLUMNS, 0); }
		public ColTypeListContext colTypeList() {
			return getRuleContext(ColTypeListContext.class,0);
		}
		public AddTableColumnsContext(StatementContext ctx) { copyFrom(ctx); }
	}
	public static class SetTablePropertiesContext extends StatementContext {
		public TerminalNode ALTER() { return getToken(sparkParser.ALTER, 0); }
		public TableIdentifierContext tableIdentifier() {
			return getRuleContext(TableIdentifierContext.class,0);
		}
		public TerminalNode SET() { return getToken(sparkParser.SET, 0); }
		public TerminalNode TBLPROPERTIES() { return getToken(sparkParser.TBLPROPERTIES, 0); }
		public TablePropertyListContext tablePropertyList() {
			return getRuleContext(TablePropertyListContext.class,0);
		}
		public TerminalNode TABLE() { return getToken(sparkParser.TABLE, 0); }
		public TerminalNode VIEW() { return getToken(sparkParser.VIEW, 0); }
		public SetTablePropertiesContext(StatementContext ctx) { copyFrom(ctx); }
	}

	public final StatementContext statement() throws RecognitionException {
		StatementContext _localctx = new StatementContext(_ctx, getState());
		enterRule(_localctx, 12, RULE_statement);
		int _la;
		try {
			int _alt;
			setState(833);
			_errHandler.sync(this);
			switch ( getInterpreter().adaptivePredict(_input,96,_ctx) ) {
			case 1:
				_localctx = new StatementDefaultContext(_localctx);
				enterOuterAlt(_localctx, 1);
				{
				setState(220);
				query();
				}
				break;
			case 2:
				_localctx = new UseContext(_localctx);
				enterOuterAlt(_localctx, 2);
				{
				setState(221);
				match(USE);
				setState(222);
				((UseContext)_localctx).db = identifier();
				}
				break;
			case 3:
				_localctx = new CreateDatabaseContext(_localctx);
				enterOuterAlt(_localctx, 3);
				{
				setState(223);
				match(CREATE);
				setState(224);
				match(DATABASE);
				setState(228);
				_errHandler.sync(this);
				switch ( getInterpreter().adaptivePredict(_input,0,_ctx) ) {
				case 1:
					{
					setState(225);
					match(IF);
					setState(226);
					match(NOT);
					setState(227);
					match(EXISTS);
					}
					break;
				}
				setState(230);
				identifier();
				setState(233);
				_errHandler.sync(this);
				_la = _input.LA(1);
				if (_la==COMMENT) {
					{
					setState(231);
					match(COMMENT);
					setState(232);
					((CreateDatabaseContext)_localctx).comment = match(STRING);
					}
				}

				setState(236);
				_errHandler.sync(this);
				_la = _input.LA(1);
				if (_la==LOCATION) {
					{
					setState(235);
					locationSpec();
					}
				}

				setState(241);
				_errHandler.sync(this);
				_la = _input.LA(1);
				if (_la==WITH) {
					{
					setState(238);
					match(WITH);
					setState(239);
					match(DBPROPERTIES);
					setState(240);
					tablePropertyList();
					}
				}

				}
				break;
			case 4:
				_localctx = new SetDatabasePropertiesContext(_localctx);
				enterOuterAlt(_localctx, 4);
				{
				setState(243);
				match(ALTER);
				setState(244);
				match(DATABASE);
				setState(245);
				identifier();
				setState(246);
				match(SET);
				setState(247);
				match(DBPROPERTIES);
				setState(248);
				tablePropertyList();
				}
				break;
			case 5:
				_localctx = new DropDatabaseContext(_localctx);
				enterOuterAlt(_localctx, 5);
				{
				setState(250);
				match(DROP);
				setState(251);
				match(DATABASE);
				setState(254);
				_errHandler.sync(this);
				switch ( getInterpreter().adaptivePredict(_input,4,_ctx) ) {
				case 1:
					{
					setState(252);
					match(IF);
					setState(253);
					match(EXISTS);
					}
					break;
				}
				setState(256);
				identifier();
				setState(258);
				_errHandler.sync(this);
				_la = _input.LA(1);
				if (_la==CASCADE || _la==RESTRICT) {
					{
					setState(257);
					_la = _input.LA(1);
					if ( !(_la==CASCADE || _la==RESTRICT) ) {
					_errHandler.recoverInline(this);
					}
					else {
						if ( _input.LA(1)==Token.EOF ) matchedEOF = true;
						_errHandler.reportMatch(this);
						consume();
					}
					}
				}

				}
				break;
			case 6:
				_localctx = new CreateTableContext(_localctx);
				enterOuterAlt(_localctx, 6);
				{
				setState(260);
				createTableHeader();
				setState(265);
				_errHandler.sync(this);
				_la = _input.LA(1);
				if (_la==T__0) {
					{
					setState(261);
					match(T__0);
					setState(262);
					colTypeList();
					setState(263);
					match(T__1);
					}
				}

				setState(267);
				tableProvider();
				setState(281);
				_errHandler.sync(this);
				_la = _input.LA(1);
				while (_la==COMMENT || ((((_la - 183)) & ~0x3f) == 0 && ((1L << (_la - 183)) & ((1L << (OPTIONS - 183)) | (1L << (TBLPROPERTIES - 183)) | (1L << (LOCATION - 183)) | (1L << (CLUSTERED - 183)) | (1L << (PARTITIONED - 183)))) != 0)) {
					{
					setState(279);
					_errHandler.sync(this);
					switch (_input.LA(1)) {
					case OPTIONS:
						{
						{
						setState(268);
						match(OPTIONS);
						setState(269);
						((CreateTableContext)_localctx).options = tablePropertyList();
						}
						}
						break;
					case PARTITIONED:
						{
						{
						setState(270);
						match(PARTITIONED);
						setState(271);
						match(BY);
						setState(272);
						((CreateTableContext)_localctx).partitionColumnNames = identifierList();
						}
						}
						break;
					case CLUSTERED:
						{
						setState(273);
						bucketSpec();
						}
						break;
					case LOCATION:
						{
						setState(274);
						locationSpec();
						}
						break;
					case COMMENT:
						{
						{
						setState(275);
						match(COMMENT);
						setState(276);
						((CreateTableContext)_localctx).comment = match(STRING);
						}
						}
						break;
					case TBLPROPERTIES:
						{
						{
						setState(277);
						match(TBLPROPERTIES);
						setState(278);
						((CreateTableContext)_localctx).tableProps = tablePropertyList();
						}
						}
						break;
					default:
						throw new NoViableAltException(this);
					}
					}
					setState(283);
					_errHandler.sync(this);
					_la = _input.LA(1);
				}
				setState(288);
				_errHandler.sync(this);
				_la = _input.LA(1);
				if ((((_la) & ~0x3f) == 0 && ((1L << _la) & ((1L << T__0) | (1L << SELECT) | (1L << FROM) | (1L << AS))) != 0) || ((((_la - 77)) & ~0x3f) == 0 && ((1L << (_la - 77)) & ((1L << (WITH - 77)) | (1L << (VALUES - 77)) | (1L << (TABLE - 77)) | (1L << (INSERT - 77)) | (1L << (MAP - 77)))) != 0) || _la==REDUCE) {
					{
					setState(285);
					_errHandler.sync(this);
					_la = _input.LA(1);
					if (_la==AS) {
						{
						setState(284);
						match(AS);
						}
					}

					setState(287);
					query();
					}
				}

				}
				break;
			case 7:
				_localctx = new CreateHiveTableContext(_localctx);
				enterOuterAlt(_localctx, 7);
				{
				setState(290);
				createTableHeader();
				setState(295);
				_errHandler.sync(this);
				switch ( getInterpreter().adaptivePredict(_input,11,_ctx) ) {
				case 1:
					{
					setState(291);
					match(T__0);
					setState(292);
					((CreateHiveTableContext)_localctx).columns = colTypeList();
					setState(293);
					match(T__1);
					}
					break;
				}
				setState(314);
				_errHandler.sync(this);
				_la = _input.LA(1);
				while (_la==ROW || _la==COMMENT || ((((_la - 185)) & ~0x3f) == 0 && ((1L << (_la - 185)) & ((1L << (TBLPROPERTIES - 185)) | (1L << (SKEWED - 185)) | (1L << (STORED - 185)) | (1L << (LOCATION - 185)) | (1L << (CLUSTERED - 185)) | (1L << (PARTITIONED - 185)))) != 0)) {
					{
					setState(312);
					_errHandler.sync(this);
					switch (_input.LA(1)) {
					case COMMENT:
						{
						{
						setState(297);
						match(COMMENT);
						setState(298);
						((CreateHiveTableContext)_localctx).comment = match(STRING);
						}
						}
						break;
					case PARTITIONED:
						{
						{
						setState(299);
						match(PARTITIONED);
						setState(300);
						match(BY);
						setState(301);
						match(T__0);
						setState(302);
						((CreateHiveTableContext)_localctx).partitionColumns = colTypeList();
						setState(303);
						match(T__1);
						}
						}
						break;
					case CLUSTERED:
						{
						setState(305);
						bucketSpec();
						}
						break;
					case SKEWED:
						{
						setState(306);
						skewSpec();
						}
						break;
					case ROW:
						{
						setState(307);
						rowFormat();
						}
						break;
					case STORED:
						{
						setState(308);
						createFileFormat();
						}
						break;
					case LOCATION:
						{
						setState(309);
						locationSpec();
						}
						break;
					case TBLPROPERTIES:
						{
						{
						setState(310);
						match(TBLPROPERTIES);
						setState(311);
						((CreateHiveTableContext)_localctx).tableProps = tablePropertyList();
						}
						}
						break;
					default:
						throw new NoViableAltException(this);
					}
					}
					setState(316);
					_errHandler.sync(this);
					_la = _input.LA(1);
				}
				setState(321);
				_errHandler.sync(this);
				_la = _input.LA(1);
				if ((((_la) & ~0x3f) == 0 && ((1L << _la) & ((1L << T__0) | (1L << SELECT) | (1L << FROM) | (1L << AS))) != 0) || ((((_la - 77)) & ~0x3f) == 0 && ((1L << (_la - 77)) & ((1L << (WITH - 77)) | (1L << (VALUES - 77)) | (1L << (TABLE - 77)) | (1L << (INSERT - 77)) | (1L << (MAP - 77)))) != 0) || _la==REDUCE) {
					{
					setState(318);
					_errHandler.sync(this);
					_la = _input.LA(1);
					if (_la==AS) {
						{
						setState(317);
						match(AS);
						}
					}

					setState(320);
					query();
					}
				}

				}
				break;
			case 8:
				_localctx = new CreateTableLikeContext(_localctx);
				enterOuterAlt(_localctx, 8);
				{
				setState(323);
				match(CREATE);
				setState(324);
				match(TABLE);
				setState(328);
				_errHandler.sync(this);
				switch ( getInterpreter().adaptivePredict(_input,16,_ctx) ) {
				case 1:
					{
					setState(325);
					match(IF);
					setState(326);
					match(NOT);
					setState(327);
					match(EXISTS);
					}
					break;
				}
				setState(330);
				((CreateTableLikeContext)_localctx).target = tableIdentifier();
				setState(331);
				match(LIKE);
				setState(332);
				((CreateTableLikeContext)_localctx).source = tableIdentifier();
				setState(334);
				_errHandler.sync(this);
				_la = _input.LA(1);
				if (_la==LOCATION) {
					{
					setState(333);
					locationSpec();
					}
				}

				}
				break;
			case 9:
				_localctx = new AnalyzeContext(_localctx);
				enterOuterAlt(_localctx, 9);
				{
				setState(336);
				match(ANALYZE);
				setState(337);
				match(TABLE);
				setState(338);
				tableIdentifier();
				setState(340);
				_errHandler.sync(this);
				_la = _input.LA(1);
				if (_la==PARTITION) {
					{
					setState(339);
					partitionSpec();
					}
				}

				setState(342);
				match(COMPUTE);
				setState(343);
				match(STATISTICS);
				setState(351);
				_errHandler.sync(this);
				switch ( getInterpreter().adaptivePredict(_input,19,_ctx) ) {
				case 1:
					{
					setState(344);
					identifier();
					}
					break;
				case 2:
					{
					setState(345);
					match(FOR);
					setState(346);
					match(COLUMNS);
					setState(347);
					identifierSeq();
					}
					break;
				case 3:
					{
					setState(348);
					match(FOR);
					setState(349);
					match(ALL);
					setState(350);
					match(COLUMNS);
					}
					break;
				}
				}
				break;
			case 10:
				_localctx = new AddTableColumnsContext(_localctx);
				enterOuterAlt(_localctx, 10);
				{
				setState(353);
				match(ALTER);
				setState(354);
				match(TABLE);
				setState(355);
				tableIdentifier();
				setState(356);
				match(ADD);
				setState(357);
				match(COLUMNS);
				setState(358);
				match(T__0);
				setState(359);
				((AddTableColumnsContext)_localctx).columns = colTypeList();
				setState(360);
				match(T__1);
				}
				break;
			case 11:
				_localctx = new RenameTableContext(_localctx);
				enterOuterAlt(_localctx, 11);
				{
				setState(362);
				match(ALTER);
				setState(363);
				_la = _input.LA(1);
				if ( !(_la==TABLE || _la==VIEW) ) {
				_errHandler.recoverInline(this);
				}
				else {
					if ( _input.LA(1)==Token.EOF ) matchedEOF = true;
					_errHandler.reportMatch(this);
					consume();
				}
				setState(364);
				((RenameTableContext)_localctx).from = tableIdentifier();
				setState(365);
				match(RENAME);
				setState(366);
				match(TO);
				setState(367);
				((RenameTableContext)_localctx).to = tableIdentifier();
				}
				break;
			case 12:
				_localctx = new SetTablePropertiesContext(_localctx);
				enterOuterAlt(_localctx, 12);
				{
				setState(369);
				match(ALTER);
				setState(370);
				_la = _input.LA(1);
				if ( !(_la==TABLE || _la==VIEW) ) {
				_errHandler.recoverInline(this);
				}
				else {
					if ( _input.LA(1)==Token.EOF ) matchedEOF = true;
					_errHandler.reportMatch(this);
					consume();
				}
				setState(371);
				tableIdentifier();
				setState(372);
				match(SET);
				setState(373);
				match(TBLPROPERTIES);
				setState(374);
				tablePropertyList();
				}
				break;
			case 13:
				_localctx = new UnsetTablePropertiesContext(_localctx);
				enterOuterAlt(_localctx, 13);
				{
				setState(376);
				match(ALTER);
				setState(377);
				_la = _input.LA(1);
				if ( !(_la==TABLE || _la==VIEW) ) {
				_errHandler.recoverInline(this);
				}
				else {
					if ( _input.LA(1)==Token.EOF ) matchedEOF = true;
					_errHandler.reportMatch(this);
					consume();
				}
				setState(378);
				tableIdentifier();
				setState(379);
				match(UNSET);
				setState(380);
				match(TBLPROPERTIES);
				setState(383);
				_errHandler.sync(this);
				_la = _input.LA(1);
				if (_la==IF) {
					{
					setState(381);
					match(IF);
					setState(382);
					match(EXISTS);
					}
				}

				setState(385);
				tablePropertyList();
				}
				break;
			case 14:
				_localctx = new ChangeColumnContext(_localctx);
				enterOuterAlt(_localctx, 14);
				{
				setState(387);
				match(ALTER);
				setState(388);
				match(TABLE);
				setState(389);
				tableIdentifier();
				setState(391);
				_errHandler.sync(this);
				_la = _input.LA(1);
				if (_la==PARTITION) {
					{
					setState(390);
					partitionSpec();
					}
				}

				setState(393);
				match(CHANGE);
				setState(395);
				_errHandler.sync(this);
				switch ( getInterpreter().adaptivePredict(_input,22,_ctx) ) {
				case 1:
					{
					setState(394);
					match(COLUMN);
					}
					break;
				}
				setState(397);
				identifier();
				setState(398);
				colType();
				setState(400);
				_errHandler.sync(this);
				_la = _input.LA(1);
				if (_la==FIRST || _la==AFTER) {
					{
					setState(399);
					colPosition();
					}
				}

				}
				break;
			case 15:
				_localctx = new SetTableSerDeContext(_localctx);
				enterOuterAlt(_localctx, 15);
				{
				setState(402);
				match(ALTER);
				setState(403);
				match(TABLE);
				setState(404);
				tableIdentifier();
				setState(406);
				_errHandler.sync(this);
				_la = _input.LA(1);
				if (_la==PARTITION) {
					{
					setState(405);
					partitionSpec();
					}
				}

				setState(408);
				match(SET);
				setState(409);
				match(SERDE);
				setState(410);
				match(STRING);
				setState(414);
				_errHandler.sync(this);
				_la = _input.LA(1);
				if (_la==WITH) {
					{
					setState(411);
					match(WITH);
					setState(412);
					match(SERDEPROPERTIES);
					setState(413);
					tablePropertyList();
					}
				}

				}
				break;
			case 16:
				_localctx = new SetTableSerDeContext(_localctx);
				enterOuterAlt(_localctx, 16);
				{
				setState(416);
				match(ALTER);
				setState(417);
				match(TABLE);
				setState(418);
				tableIdentifier();
				setState(420);
				_errHandler.sync(this);
				_la = _input.LA(1);
				if (_la==PARTITION) {
					{
					setState(419);
					partitionSpec();
					}
				}

				setState(422);
				match(SET);
				setState(423);
				match(SERDEPROPERTIES);
				setState(424);
				tablePropertyList();
				}
				break;
			case 17:
				_localctx = new AddTablePartitionContext(_localctx);
				enterOuterAlt(_localctx, 17);
				{
				setState(426);
				match(ALTER);
				setState(427);
				match(TABLE);
				setState(428);
				tableIdentifier();
				setState(429);
				match(ADD);
				setState(433);
				_errHandler.sync(this);
				_la = _input.LA(1);
				if (_la==IF) {
					{
					setState(430);
					match(IF);
					setState(431);
					match(NOT);
					setState(432);
					match(EXISTS);
					}
				}

				setState(436); 
				_errHandler.sync(this);
				_la = _input.LA(1);
				do {
					{
					{
					setState(435);
					partitionSpecLocation();
					}
					}
					setState(438); 
					_errHandler.sync(this);
					_la = _input.LA(1);
				} while ( _la==PARTITION );
				}
				break;
			case 18:
				_localctx = new AddTablePartitionContext(_localctx);
				enterOuterAlt(_localctx, 18);
				{
				setState(440);
				match(ALTER);
				setState(441);
				match(VIEW);
				setState(442);
				tableIdentifier();
				setState(443);
				match(ADD);
				setState(447);
				_errHandler.sync(this);
				_la = _input.LA(1);
				if (_la==IF) {
					{
					setState(444);
					match(IF);
					setState(445);
					match(NOT);
					setState(446);
					match(EXISTS);
					}
				}

				setState(450); 
				_errHandler.sync(this);
				_la = _input.LA(1);
				do {
					{
					{
					setState(449);
					partitionSpec();
					}
					}
					setState(452); 
					_errHandler.sync(this);
					_la = _input.LA(1);
				} while ( _la==PARTITION );
				}
				break;
			case 19:
				_localctx = new RenameTablePartitionContext(_localctx);
				enterOuterAlt(_localctx, 19);
				{
				setState(454);
				match(ALTER);
				setState(455);
				match(TABLE);
				setState(456);
				tableIdentifier();
				setState(457);
				((RenameTablePartitionContext)_localctx).from = partitionSpec();
				setState(458);
				match(RENAME);
				setState(459);
				match(TO);
				setState(460);
				((RenameTablePartitionContext)_localctx).to = partitionSpec();
				}
				break;
			case 20:
				_localctx = new DropTablePartitionsContext(_localctx);
				enterOuterAlt(_localctx, 20);
				{
				setState(462);
				match(ALTER);
				setState(463);
				match(TABLE);
				setState(464);
				tableIdentifier();
				setState(465);
				match(DROP);
				setState(468);
				_errHandler.sync(this);
				_la = _input.LA(1);
				if (_la==IF) {
					{
					setState(466);
					match(IF);
					setState(467);
					match(EXISTS);
					}
				}

				setState(470);
				partitionSpec();
				setState(475);
				_errHandler.sync(this);
				_la = _input.LA(1);
				while (_la==T__2) {
					{
					{
					setState(471);
					match(T__2);
					setState(472);
					partitionSpec();
					}
					}
					setState(477);
					_errHandler.sync(this);
					_la = _input.LA(1);
				}
				setState(479);
				_errHandler.sync(this);
				_la = _input.LA(1);
				if (_la==PURGE) {
					{
					setState(478);
					match(PURGE);
					}
				}

				}
				break;
			case 21:
				_localctx = new DropTablePartitionsContext(_localctx);
				enterOuterAlt(_localctx, 21);
				{
				setState(481);
				match(ALTER);
				setState(482);
				match(VIEW);
				setState(483);
				tableIdentifier();
				setState(484);
				match(DROP);
				setState(487);
				_errHandler.sync(this);
				_la = _input.LA(1);
				if (_la==IF) {
					{
					setState(485);
					match(IF);
					setState(486);
					match(EXISTS);
					}
				}

				setState(489);
				partitionSpec();
				setState(494);
				_errHandler.sync(this);
				_la = _input.LA(1);
				while (_la==T__2) {
					{
					{
					setState(490);
					match(T__2);
					setState(491);
					partitionSpec();
					}
					}
					setState(496);
					_errHandler.sync(this);
					_la = _input.LA(1);
				}
				}
				break;
			case 22:
				_localctx = new SetTableLocationContext(_localctx);
				enterOuterAlt(_localctx, 22);
				{
				setState(497);
				match(ALTER);
				setState(498);
				match(TABLE);
				setState(499);
				tableIdentifier();
				setState(501);
				_errHandler.sync(this);
				_la = _input.LA(1);
				if (_la==PARTITION) {
					{
					setState(500);
					partitionSpec();
					}
				}

				setState(503);
				match(SET);
				setState(504);
				locationSpec();
				}
				break;
			case 23:
				_localctx = new RecoverPartitionsContext(_localctx);
				enterOuterAlt(_localctx, 23);
				{
				setState(506);
				match(ALTER);
				setState(507);
				match(TABLE);
				setState(508);
				tableIdentifier();
				setState(509);
				match(RECOVER);
				setState(510);
				match(PARTITIONS);
				}
				break;
			case 24:
				_localctx = new DropTableContext(_localctx);
				enterOuterAlt(_localctx, 24);
				{
				setState(512);
				match(DROP);
				setState(513);
				match(TABLE);
				setState(516);
				_errHandler.sync(this);
				switch ( getInterpreter().adaptivePredict(_input,37,_ctx) ) {
				case 1:
					{
					setState(514);
					match(IF);
					setState(515);
					match(EXISTS);
					}
					break;
				}
				setState(518);
				tableIdentifier();
				setState(520);
				_errHandler.sync(this);
				_la = _input.LA(1);
				if (_la==PURGE) {
					{
					setState(519);
					match(PURGE);
					}
				}

				}
				break;
			case 25:
				_localctx = new DropTableContext(_localctx);
				enterOuterAlt(_localctx, 25);
				{
				setState(522);
				match(DROP);
				setState(523);
				match(VIEW);
				setState(526);
				_errHandler.sync(this);
				switch ( getInterpreter().adaptivePredict(_input,39,_ctx) ) {
				case 1:
					{
					setState(524);
					match(IF);
					setState(525);
					match(EXISTS);
					}
					break;
				}
				setState(528);
				tableIdentifier();
				}
				break;
			case 26:
				_localctx = new CreateViewContext(_localctx);
				enterOuterAlt(_localctx, 26);
				{
				setState(529);
				match(CREATE);
				setState(532);
				_errHandler.sync(this);
				_la = _input.LA(1);
				if (_la==OR) {
					{
					setState(530);
					match(OR);
					setState(531);
					match(REPLACE);
					}
				}

				setState(538);
				_errHandler.sync(this);
				_la = _input.LA(1);
				if (_la==GLOBAL || _la==TEMPORARY) {
					{
					setState(535);
					_errHandler.sync(this);
					_la = _input.LA(1);
					if (_la==GLOBAL) {
						{
						setState(534);
						match(GLOBAL);
						}
					}

					setState(537);
					match(TEMPORARY);
					}
				}

				setState(540);
				match(VIEW);
				setState(544);
				_errHandler.sync(this);
				switch ( getInterpreter().adaptivePredict(_input,43,_ctx) ) {
				case 1:
					{
					setState(541);
					match(IF);
					setState(542);
					match(NOT);
					setState(543);
					match(EXISTS);
					}
					break;
				}
				setState(546);
				tableIdentifier();
				setState(548);
				_errHandler.sync(this);
				_la = _input.LA(1);
				if (_la==T__0) {
					{
					setState(547);
					identifierCommentList();
					}
				}

				setState(552);
				_errHandler.sync(this);
				_la = _input.LA(1);
				if (_la==COMMENT) {
					{
					setState(550);
					match(COMMENT);
					setState(551);
					match(STRING);
					}
				}

				setState(557);
				_errHandler.sync(this);
				_la = _input.LA(1);
				if (_la==PARTITIONED) {
					{
					setState(554);
					match(PARTITIONED);
					setState(555);
					match(ON);
					setState(556);
					identifierList();
					}
				}

				setState(561);
				_errHandler.sync(this);
				_la = _input.LA(1);
				if (_la==TBLPROPERTIES) {
					{
					setState(559);
					match(TBLPROPERTIES);
					setState(560);
					tablePropertyList();
					}
				}

				setState(563);
				match(AS);
				setState(564);
				query();
				}
				break;
			case 27:
				_localctx = new CreateTempViewUsingContext(_localctx);
				enterOuterAlt(_localctx, 27);
				{
				setState(566);
				match(CREATE);
				setState(569);
				_errHandler.sync(this);
				_la = _input.LA(1);
				if (_la==OR) {
					{
					setState(567);
					match(OR);
					setState(568);
					match(REPLACE);
					}
				}

				setState(572);
				_errHandler.sync(this);
				_la = _input.LA(1);
				if (_la==GLOBAL) {
					{
					setState(571);
					match(GLOBAL);
					}
				}

				setState(574);
				match(TEMPORARY);
				setState(575);
				match(VIEW);
				setState(576);
				tableIdentifier();
				setState(581);
				_errHandler.sync(this);
				_la = _input.LA(1);
				if (_la==T__0) {
					{
					setState(577);
					match(T__0);
					setState(578);
					colTypeList();
					setState(579);
					match(T__1);
					}
				}

				setState(583);
				tableProvider();
				setState(586);
				_errHandler.sync(this);
				_la = _input.LA(1);
				if (_la==OPTIONS) {
					{
					setState(584);
					match(OPTIONS);
					setState(585);
					tablePropertyList();
					}
				}

				}
				break;
			case 28:
				_localctx = new AlterViewQueryContext(_localctx);
				enterOuterAlt(_localctx, 28);
				{
				setState(588);
				match(ALTER);
				setState(589);
				match(VIEW);
				setState(590);
				tableIdentifier();
				setState(592);
				_errHandler.sync(this);
				_la = _input.LA(1);
				if (_la==AS) {
					{
					setState(591);
					match(AS);
					}
				}

				setState(594);
				query();
				}
				break;
			case 29:
				_localctx = new CreateFunctionContext(_localctx);
				enterOuterAlt(_localctx, 29);
				{
				setState(596);
				match(CREATE);
				setState(599);
				_errHandler.sync(this);
				_la = _input.LA(1);
				if (_la==OR) {
					{
					setState(597);
					match(OR);
					setState(598);
					match(REPLACE);
					}
				}

				setState(602);
				_errHandler.sync(this);
				_la = _input.LA(1);
				if (_la==TEMPORARY) {
					{
					setState(601);
					match(TEMPORARY);
					}
				}

				setState(604);
				match(FUNCTION);
				setState(608);
				_errHandler.sync(this);
				switch ( getInterpreter().adaptivePredict(_input,55,_ctx) ) {
				case 1:
					{
					setState(605);
					match(IF);
					setState(606);
					match(NOT);
					setState(607);
					match(EXISTS);
					}
					break;
				}
				setState(610);
				qualifiedName();
				setState(611);
				match(AS);
				setState(612);
				((CreateFunctionContext)_localctx).className = match(STRING);
				setState(622);
				_errHandler.sync(this);
				_la = _input.LA(1);
				if (_la==USING) {
					{
					setState(613);
					match(USING);
					setState(614);
					resource();
					setState(619);
					_errHandler.sync(this);
					_la = _input.LA(1);
					while (_la==T__2) {
						{
						{
						setState(615);
						match(T__2);
						setState(616);
						resource();
						}
						}
						setState(621);
						_errHandler.sync(this);
						_la = _input.LA(1);
					}
					}
				}

				}
				break;
			case 30:
				_localctx = new DropFunctionContext(_localctx);
				enterOuterAlt(_localctx, 30);
				{
				setState(624);
				match(DROP);
				setState(626);
				_errHandler.sync(this);
				_la = _input.LA(1);
				if (_la==TEMPORARY) {
					{
					setState(625);
					match(TEMPORARY);
					}
				}

				setState(628);
				match(FUNCTION);
				setState(631);
				_errHandler.sync(this);
				switch ( getInterpreter().adaptivePredict(_input,59,_ctx) ) {
				case 1:
					{
					setState(629);
					match(IF);
					setState(630);
					match(EXISTS);
					}
					break;
				}
				setState(633);
				qualifiedName();
				}
				break;
			case 31:
				_localctx = new ExplainContext(_localctx);
				enterOuterAlt(_localctx, 31);
				{
				setState(634);
				match(EXPLAIN);
				setState(636);
				_errHandler.sync(this);
				_la = _input.LA(1);
				if (((((_la - 90)) & ~0x3f) == 0 && ((1L << (_la - 90)) & ((1L << (LOGICAL - 90)) | (1L << (CODEGEN - 90)) | (1L << (COST - 90)))) != 0) || _la==EXTENDED || _la==FORMATTED) {
					{
					setState(635);
					_la = _input.LA(1);
					if ( !(((((_la - 90)) & ~0x3f) == 0 && ((1L << (_la - 90)) & ((1L << (LOGICAL - 90)) | (1L << (CODEGEN - 90)) | (1L << (COST - 90)))) != 0) || _la==EXTENDED || _la==FORMATTED) ) {
					_errHandler.recoverInline(this);
					}
					else {
						if ( _input.LA(1)==Token.EOF ) matchedEOF = true;
						_errHandler.reportMatch(this);
						consume();
					}
					}
				}

				setState(638);
				statement();
				}
				break;
			case 32:
				_localctx = new ShowTablesContext(_localctx);
				enterOuterAlt(_localctx, 32);
				{
				setState(639);
				match(SHOW);
				setState(640);
				match(TABLES);
				setState(643);
				_errHandler.sync(this);
				_la = _input.LA(1);
				if (_la==FROM || _la==IN) {
					{
					setState(641);
					_la = _input.LA(1);
					if ( !(_la==FROM || _la==IN) ) {
					_errHandler.recoverInline(this);
					}
					else {
						if ( _input.LA(1)==Token.EOF ) matchedEOF = true;
						_errHandler.reportMatch(this);
						consume();
					}
					setState(642);
					((ShowTablesContext)_localctx).db = identifier();
					}
				}

				setState(649);
				_errHandler.sync(this);
				_la = _input.LA(1);
				if (_la==LIKE || _la==STRING) {
					{
					setState(646);
					_errHandler.sync(this);
					_la = _input.LA(1);
					if (_la==LIKE) {
						{
						setState(645);
						match(LIKE);
						}
					}

					setState(648);
					((ShowTablesContext)_localctx).pattern = match(STRING);
					}
				}

				}
				break;
			case 33:
				_localctx = new ShowTableContext(_localctx);
				enterOuterAlt(_localctx, 33);
				{
				setState(651);
				match(SHOW);
				setState(652);
				match(TABLE);
				setState(653);
				match(EXTENDED);
				setState(656);
				_errHandler.sync(this);
				_la = _input.LA(1);
				if (_la==FROM || _la==IN) {
					{
					setState(654);
					_la = _input.LA(1);
					if ( !(_la==FROM || _la==IN) ) {
					_errHandler.recoverInline(this);
					}
					else {
						if ( _input.LA(1)==Token.EOF ) matchedEOF = true;
						_errHandler.reportMatch(this);
						consume();
					}
					setState(655);
					((ShowTableContext)_localctx).db = identifier();
					}
				}

				setState(658);
				match(LIKE);
				setState(659);
				((ShowTableContext)_localctx).pattern = match(STRING);
				setState(661);
				_errHandler.sync(this);
				_la = _input.LA(1);
				if (_la==PARTITION) {
					{
					setState(660);
					partitionSpec();
					}
				}

				}
				break;
			case 34:
				_localctx = new ShowDatabasesContext(_localctx);
				enterOuterAlt(_localctx, 34);
				{
				setState(663);
				match(SHOW);
				setState(664);
				match(DATABASES);
				setState(669);
				_errHandler.sync(this);
				_la = _input.LA(1);
				if (_la==LIKE || _la==STRING) {
					{
					setState(666);
					_errHandler.sync(this);
					_la = _input.LA(1);
					if (_la==LIKE) {
						{
						setState(665);
						match(LIKE);
						}
					}

					setState(668);
					((ShowDatabasesContext)_localctx).pattern = match(STRING);
					}
				}

				}
				break;
			case 35:
				_localctx = new ShowTblPropertiesContext(_localctx);
				enterOuterAlt(_localctx, 35);
				{
				setState(671);
				match(SHOW);
				setState(672);
				match(TBLPROPERTIES);
				setState(673);
				((ShowTblPropertiesContext)_localctx).table = tableIdentifier();
				setState(678);
				_errHandler.sync(this);
				_la = _input.LA(1);
				if (_la==T__0) {
					{
					setState(674);
					match(T__0);
					setState(675);
					((ShowTblPropertiesContext)_localctx).key = tablePropertyKey();
					setState(676);
					match(T__1);
					}
				}

				}
				break;
			case 36:
				_localctx = new ShowColumnsContext(_localctx);
				enterOuterAlt(_localctx, 36);
				{
				setState(680);
				match(SHOW);
				setState(681);
				match(COLUMNS);
				setState(682);
				_la = _input.LA(1);
				if ( !(_la==FROM || _la==IN) ) {
				_errHandler.recoverInline(this);
				}
				else {
					if ( _input.LA(1)==Token.EOF ) matchedEOF = true;
					_errHandler.reportMatch(this);
					consume();
				}
				setState(683);
				tableIdentifier();
				setState(686);
				_errHandler.sync(this);
				_la = _input.LA(1);
				if (_la==FROM || _la==IN) {
					{
					setState(684);
					_la = _input.LA(1);
					if ( !(_la==FROM || _la==IN) ) {
					_errHandler.recoverInline(this);
					}
					else {
						if ( _input.LA(1)==Token.EOF ) matchedEOF = true;
						_errHandler.reportMatch(this);
						consume();
					}
					setState(685);
					((ShowColumnsContext)_localctx).db = identifier();
					}
				}

				}
				break;
			case 37:
				_localctx = new ShowPartitionsContext(_localctx);
				enterOuterAlt(_localctx, 37);
				{
				setState(688);
				match(SHOW);
				setState(689);
				match(PARTITIONS);
				setState(690);
				tableIdentifier();
				setState(692);
				_errHandler.sync(this);
				_la = _input.LA(1);
				if (_la==PARTITION) {
					{
					setState(691);
					partitionSpec();
					}
				}

				}
				break;
			case 38:
				_localctx = new ShowFunctionsContext(_localctx);
				enterOuterAlt(_localctx, 38);
				{
				setState(694);
				match(SHOW);
				setState(696);
				_errHandler.sync(this);
				switch ( getInterpreter().adaptivePredict(_input,71,_ctx) ) {
				case 1:
					{
					setState(695);
					identifier();
					}
					break;
				}
				setState(698);
				match(FUNCTIONS);
				setState(706);
				_errHandler.sync(this);
				_la = _input.LA(1);
				if ((((_la) & ~0x3f) == 0 && ((1L << _la) & ((1L << SELECT) | (1L << FROM) | (1L << ADD) | (1L << AS) | (1L << ALL) | (1L << ANY) | (1L << DISTINCT) | (1L << WHERE) | (1L << GROUP) | (1L << BY) | (1L << GROUPING) | (1L << SETS) | (1L << CUBE) | (1L << ROLLUP) | (1L << ORDER) | (1L << HAVING) | (1L << LIMIT) | (1L << AT) | (1L << OR) | (1L << AND) | (1L << IN) | (1L << NOT) | (1L << NO) | (1L << EXISTS) | (1L << BETWEEN) | (1L << LIKE) | (1L << RLIKE) | (1L << IS) | (1L << NULL) | (1L << TRUE) | (1L << FALSE) | (1L << NULLS) | (1L << ASC) | (1L << DESC) | (1L << FOR) | (1L << INTERVAL) | (1L << CASE) | (1L << WHEN) | (1L << THEN) | (1L << ELSE) | (1L << END) | (1L << JOIN) | (1L << CROSS) | (1L << OUTER) | (1L << INNER) | (1L << LEFT) | (1L << SEMI) | (1L << RIGHT) | (1L << FULL) | (1L << NATURAL) | (1L << ON) | (1L << PIVOT) | (1L << LATERAL))) != 0) || ((((_la - 64)) & ~0x3f) == 0 && ((1L << (_la - 64)) & ((1L << (WINDOW - 64)) | (1L << (OVER - 64)) | (1L << (PARTITION - 64)) | (1L << (RANGE - 64)) | (1L << (ROWS - 64)) | (1L << (UNBOUNDED - 64)) | (1L << (PRECEDING - 64)) | (1L << (FOLLOWING - 64)) | (1L << (CURRENT - 64)) | (1L << (FIRST - 64)) | (1L << (AFTER - 64)) | (1L << (LAST - 64)) | (1L << (ROW - 64)) | (1L << (WITH - 64)) | (1L << (VALUES - 64)) | (1L << (CREATE - 64)) | (1L << (TABLE - 64)) | (1L << (DIRECTORY - 64)) | (1L << (VIEW - 64)) | (1L << (REPLACE - 64)) | (1L << (INSERT - 64)) | (1L << (DELETE - 64)) | (1L << (INTO - 64)) | (1L << (DESCRIBE - 64)) | (1L << (EXPLAIN - 64)) | (1L << (FORMAT - 64)) | (1L << (LOGICAL - 64)) | (1L << (CODEGEN - 64)) | (1L << (COST - 64)) | (1L << (CAST - 64)) | (1L << (SHOW - 64)) | (1L << (TABLES - 64)) | (1L << (COLUMNS - 64)) | (1L << (COLUMN - 64)) | (1L << (USE - 64)) | (1L << (PARTITIONS - 64)) | (1L << (FUNCTIONS - 64)) | (1L << (DROP - 64)) | (1L << (UNION - 64)) | (1L << (EXCEPT - 64)) | (1L << (SETMINUS - 64)) | (1L << (INTERSECT - 64)) | (1L << (TO - 64)) | (1L << (TABLESAMPLE - 64)) | (1L << (STRATIFY - 64)) | (1L << (ALTER - 64)) | (1L << (RENAME - 64)) | (1L << (ARRAY - 64)) | (1L << (MAP - 64)) | (1L << (STRUCT - 64)) | (1L << (COMMENT - 64)) | (1L << (SET - 64)) | (1L << (RESET - 64)) | (1L << (DATA - 64)) | (1L << (START - 64)) | (1L << (TRANSACTION - 64)) | (1L << (COMMIT - 64)) | (1L << (ROLLBACK - 64)) | (1L << (MACRO - 64)) | (1L << (IGNORE - 64)) | (1L << (BOTH - 64)) | (1L << (LEADING - 64)) | (1L << (TRAILING - 64)) | (1L << (IF - 64)))) != 0) || ((((_la - 128)) & ~0x3f) == 0 && ((1L << (_la - 128)) & ((1L << (POSITION - 128)) | (1L << (EXTRACT - 128)) | (1L << (DIV - 128)) | (1L << (PERCENTLIT - 128)) | (1L << (BUCKET - 128)) | (1L << (OUT - 128)) | (1L << (OF - 128)) | (1L << (SORT - 128)) | (1L << (CLUSTER - 128)) | (1L << (DISTRIBUTE - 128)) | (1L << (OVERWRITE - 128)) | (1L << (TRANSFORM - 128)) | (1L << (REDUCE - 128)) | (1L << (SERDE - 128)) | (1L << (SERDEPROPERTIES - 128)) | (1L << (RECORDREADER - 128)) | (1L << (RECORDWRITER - 128)) | (1L << (DELIMITED - 128)) | (1L << (FIELDS - 128)) | (1L << (TERMINATED - 128)) | (1L << (COLLECTION - 128)) | (1L << (ITEMS - 128)) | (1L << (KEYS - 128)) | (1L << (ESCAPED - 128)) | (1L << (LINES - 128)) | (1L << (SEPARATED - 128)) | (1L << (FUNCTION - 128)) | (1L << (EXTENDED - 128)) | (1L << (REFRESH - 128)) | (1L << (CLEAR - 128)) | (1L << (CACHE - 128)) | (1L << (UNCACHE - 128)) | (1L << (LAZY - 128)) | (1L << (FORMATTED - 128)) | (1L << (GLOBAL - 128)) | (1L << (TEMPORARY - 128)) | (1L << (OPTIONS - 128)) | (1L << (UNSET - 128)) | (1L << (TBLPROPERTIES - 128)) | (1L << (DBPROPERTIES - 128)) | (1L << (BUCKETS - 128)) | (1L << (SKEWED - 128)) | (1L << (STORED - 128)) | (1L << (DIRECTORIES - 128)) | (1L << (LOCATION - 128)))) != 0) || ((((_la - 192)) & ~0x3f) == 0 && ((1L << (_la - 192)) & ((1L << (EXCHANGE - 192)) | (1L << (ARCHIVE - 192)) | (1L << (UNARCHIVE - 192)) | (1L << (FILEFORMAT - 192)) | (1L << (TOUCH - 192)) | (1L << (COMPACT - 192)) | (1L << (CONCATENATE - 192)) | (1L << (CHANGE - 192)) | (1L << (CASCADE - 192)) | (1L << (RESTRICT - 192)) | (1L << (CLUSTERED - 192)) | (1L << (SORTED - 192)) | (1L << (PURGE - 192)) | (1L << (INPUTFORMAT - 192)) | (1L << (OUTPUTFORMAT - 192)) | (1L << (DATABASE - 192)) | (1L << (DATABASES - 192)) | (1L << (DFS - 192)) | (1L << (TRUNCATE - 192)) | (1L << (ANALYZE - 192)) | (1L << (COMPUTE - 192)) | (1L << (LIST - 192)) | (1L << (STATISTICS - 192)) | (1L << (PARTITIONED - 192)) | (1L << (EXTERNAL - 192)) | (1L << (DEFINED - 192)) | (1L << (REVOKE - 192)) | (1L << (GRANT - 192)) | (1L << (LOCK - 192)) | (1L << (UNLOCK - 192)) | (1L << (MSCK - 192)) | (1L << (REPAIR - 192)) | (1L << (RECOVER - 192)) | (1L << (EXPORT - 192)) | (1L << (IMPORT - 192)) | (1L << (LOAD - 192)) | (1L << (ROLE - 192)) | (1L << (ROLES - 192)) | (1L << (COMPACTIONS - 192)) | (1L << (PRINCIPALS - 192)) | (1L << (TRANSACTIONS - 192)) | (1L << (INDEX - 192)) | (1L << (INDEXES - 192)) | (1L << (LOCKS - 192)) | (1L << (OPTION - 192)) | (1L << (ANTI - 192)) | (1L << (LOCAL - 192)) | (1L << (INPATH - 192)) | (1L << (STRING - 192)) | (1L << (IDENTIFIER - 192)) | (1L << (BACKQUOTED_IDENTIFIER - 192)))) != 0)) {
					{
					setState(700);
					_errHandler.sync(this);
					switch ( getInterpreter().adaptivePredict(_input,72,_ctx) ) {
					case 1:
						{
						setState(699);
						match(LIKE);
						}
						break;
					}
					setState(704);
					_errHandler.sync(this);
					switch (_input.LA(1)) {
					case SELECT:
					case FROM:
					case ADD:
					case AS:
					case ALL:
					case ANY:
					case DISTINCT:
					case WHERE:
					case GROUP:
					case BY:
					case GROUPING:
					case SETS:
					case CUBE:
					case ROLLUP:
					case ORDER:
					case HAVING:
					case LIMIT:
					case AT:
					case OR:
					case AND:
					case IN:
					case NOT:
					case NO:
					case EXISTS:
					case BETWEEN:
					case LIKE:
					case RLIKE:
					case IS:
					case NULL:
					case TRUE:
					case FALSE:
					case NULLS:
					case ASC:
					case DESC:
					case FOR:
					case INTERVAL:
					case CASE:
					case WHEN:
					case THEN:
					case ELSE:
					case END:
					case JOIN:
					case CROSS:
					case OUTER:
					case INNER:
					case LEFT:
					case SEMI:
					case RIGHT:
					case FULL:
					case NATURAL:
					case ON:
					case PIVOT:
					case LATERAL:
					case WINDOW:
					case OVER:
					case PARTITION:
					case RANGE:
					case ROWS:
					case UNBOUNDED:
					case PRECEDING:
					case FOLLOWING:
					case CURRENT:
					case FIRST:
					case AFTER:
					case LAST:
					case ROW:
					case WITH:
					case VALUES:
					case CREATE:
					case TABLE:
					case DIRECTORY:
					case VIEW:
					case REPLACE:
					case INSERT:
					case DELETE:
					case INTO:
					case DESCRIBE:
					case EXPLAIN:
					case FORMAT:
					case LOGICAL:
					case CODEGEN:
					case COST:
					case CAST:
					case SHOW:
					case TABLES:
					case COLUMNS:
					case COLUMN:
					case USE:
					case PARTITIONS:
					case FUNCTIONS:
					case DROP:
					case UNION:
					case EXCEPT:
					case SETMINUS:
					case INTERSECT:
					case TO:
					case TABLESAMPLE:
					case STRATIFY:
					case ALTER:
					case RENAME:
					case ARRAY:
					case MAP:
					case STRUCT:
					case COMMENT:
					case SET:
					case RESET:
					case DATA:
					case START:
					case TRANSACTION:
					case COMMIT:
					case ROLLBACK:
					case MACRO:
					case IGNORE:
					case BOTH:
					case LEADING:
					case TRAILING:
					case IF:
					case POSITION:
					case EXTRACT:
					case DIV:
					case PERCENTLIT:
					case BUCKET:
					case OUT:
					case OF:
					case SORT:
					case CLUSTER:
					case DISTRIBUTE:
					case OVERWRITE:
					case TRANSFORM:
					case REDUCE:
					case SERDE:
					case SERDEPROPERTIES:
					case RECORDREADER:
					case RECORDWRITER:
					case DELIMITED:
					case FIELDS:
					case TERMINATED:
					case COLLECTION:
					case ITEMS:
					case KEYS:
					case ESCAPED:
					case LINES:
					case SEPARATED:
					case FUNCTION:
					case EXTENDED:
					case REFRESH:
					case CLEAR:
					case CACHE:
					case UNCACHE:
					case LAZY:
					case FORMATTED:
					case GLOBAL:
					case TEMPORARY:
					case OPTIONS:
					case UNSET:
					case TBLPROPERTIES:
					case DBPROPERTIES:
					case BUCKETS:
					case SKEWED:
					case STORED:
					case DIRECTORIES:
					case LOCATION:
					case EXCHANGE:
					case ARCHIVE:
					case UNARCHIVE:
					case FILEFORMAT:
					case TOUCH:
					case COMPACT:
					case CONCATENATE:
					case CHANGE:
					case CASCADE:
					case RESTRICT:
					case CLUSTERED:
					case SORTED:
					case PURGE:
					case INPUTFORMAT:
					case OUTPUTFORMAT:
					case DATABASE:
					case DATABASES:
					case DFS:
					case TRUNCATE:
					case ANALYZE:
					case COMPUTE:
					case LIST:
					case STATISTICS:
					case PARTITIONED:
					case EXTERNAL:
					case DEFINED:
					case REVOKE:
					case GRANT:
					case LOCK:
					case UNLOCK:
					case MSCK:
					case REPAIR:
					case RECOVER:
					case EXPORT:
					case IMPORT:
					case LOAD:
					case ROLE:
					case ROLES:
					case COMPACTIONS:
					case PRINCIPALS:
					case TRANSACTIONS:
					case INDEX:
					case INDEXES:
					case LOCKS:
					case OPTION:
					case ANTI:
					case LOCAL:
					case INPATH:
					case IDENTIFIER:
					case BACKQUOTED_IDENTIFIER:
						{
						setState(702);
						qualifiedName();
						}
						break;
					case STRING:
						{
						setState(703);
						((ShowFunctionsContext)_localctx).pattern = match(STRING);
						}
						break;
					default:
						throw new NoViableAltException(this);
					}
					}
				}

				}
				break;
			case 39:
				_localctx = new ShowCreateTableContext(_localctx);
				enterOuterAlt(_localctx, 39);
				{
				setState(708);
				match(SHOW);
				setState(709);
				match(CREATE);
				setState(710);
				match(TABLE);
				setState(711);
				tableIdentifier();
				}
				break;
			case 40:
				_localctx = new DescribeFunctionContext(_localctx);
				enterOuterAlt(_localctx, 40);
				{
				setState(712);
				_la = _input.LA(1);
				if ( !(_la==DESC || _la==DESCRIBE) ) {
				_errHandler.recoverInline(this);
				}
				else {
					if ( _input.LA(1)==Token.EOF ) matchedEOF = true;
					_errHandler.reportMatch(this);
					consume();
				}
				setState(713);
				match(FUNCTION);
				setState(715);
				_errHandler.sync(this);
				switch ( getInterpreter().adaptivePredict(_input,75,_ctx) ) {
				case 1:
					{
					setState(714);
					match(EXTENDED);
					}
					break;
				}
				setState(717);
				describeFuncName();
				}
				break;
			case 41:
				_localctx = new DescribeDatabaseContext(_localctx);
				enterOuterAlt(_localctx, 41);
				{
				setState(718);
				_la = _input.LA(1);
				if ( !(_la==DESC || _la==DESCRIBE) ) {
				_errHandler.recoverInline(this);
				}
				else {
					if ( _input.LA(1)==Token.EOF ) matchedEOF = true;
					_errHandler.reportMatch(this);
					consume();
				}
				setState(719);
				match(DATABASE);
				setState(721);
				_errHandler.sync(this);
				switch ( getInterpreter().adaptivePredict(_input,76,_ctx) ) {
				case 1:
					{
					setState(720);
					match(EXTENDED);
					}
					break;
				}
				setState(723);
				identifier();
				}
				break;
			case 42:
				_localctx = new DescribeTableContext(_localctx);
				enterOuterAlt(_localctx, 42);
				{
				setState(724);
				_la = _input.LA(1);
				if ( !(_la==DESC || _la==DESCRIBE) ) {
				_errHandler.recoverInline(this);
				}
				else {
					if ( _input.LA(1)==Token.EOF ) matchedEOF = true;
					_errHandler.reportMatch(this);
					consume();
				}
				setState(726);
				_errHandler.sync(this);
				switch ( getInterpreter().adaptivePredict(_input,77,_ctx) ) {
				case 1:
					{
					setState(725);
					match(TABLE);
					}
					break;
				}
				setState(729);
				_errHandler.sync(this);
				switch ( getInterpreter().adaptivePredict(_input,78,_ctx) ) {
				case 1:
					{
					setState(728);
					((DescribeTableContext)_localctx).option = _input.LT(1);
					_la = _input.LA(1);
					if ( !(_la==EXTENDED || _la==FORMATTED) ) {
						((DescribeTableContext)_localctx).option = (Token)_errHandler.recoverInline(this);
					}
					else {
						if ( _input.LA(1)==Token.EOF ) matchedEOF = true;
						_errHandler.reportMatch(this);
						consume();
					}
					}
					break;
				}
				setState(731);
				tableIdentifier();
				setState(733);
				_errHandler.sync(this);
				switch ( getInterpreter().adaptivePredict(_input,79,_ctx) ) {
				case 1:
					{
					setState(732);
					partitionSpec();
					}
					break;
				}
				setState(736);
				_errHandler.sync(this);
				_la = _input.LA(1);
				if ((((_la) & ~0x3f) == 0 && ((1L << _la) & ((1L << SELECT) | (1L << FROM) | (1L << ADD) | (1L << AS) | (1L << ALL) | (1L << ANY) | (1L << DISTINCT) | (1L << WHERE) | (1L << GROUP) | (1L << BY) | (1L << GROUPING) | (1L << SETS) | (1L << CUBE) | (1L << ROLLUP) | (1L << ORDER) | (1L << HAVING) | (1L << LIMIT) | (1L << AT) | (1L << OR) | (1L << AND) | (1L << IN) | (1L << NOT) | (1L << NO) | (1L << EXISTS) | (1L << BETWEEN) | (1L << LIKE) | (1L << RLIKE) | (1L << IS) | (1L << NULL) | (1L << TRUE) | (1L << FALSE) | (1L << NULLS) | (1L << ASC) | (1L << DESC) | (1L << FOR) | (1L << INTERVAL) | (1L << CASE) | (1L << WHEN) | (1L << THEN) | (1L << ELSE) | (1L << END) | (1L << JOIN) | (1L << CROSS) | (1L << OUTER) | (1L << INNER) | (1L << LEFT) | (1L << SEMI) | (1L << RIGHT) | (1L << FULL) | (1L << NATURAL) | (1L << ON) | (1L << PIVOT) | (1L << LATERAL))) != 0) || ((((_la - 64)) & ~0x3f) == 0 && ((1L << (_la - 64)) & ((1L << (WINDOW - 64)) | (1L << (OVER - 64)) | (1L << (PARTITION - 64)) | (1L << (RANGE - 64)) | (1L << (ROWS - 64)) | (1L << (UNBOUNDED - 64)) | (1L << (PRECEDING - 64)) | (1L << (FOLLOWING - 64)) | (1L << (CURRENT - 64)) | (1L << (FIRST - 64)) | (1L << (AFTER - 64)) | (1L << (LAST - 64)) | (1L << (ROW - 64)) | (1L << (WITH - 64)) | (1L << (VALUES - 64)) | (1L << (CREATE - 64)) | (1L << (TABLE - 64)) | (1L << (DIRECTORY - 64)) | (1L << (VIEW - 64)) | (1L << (REPLACE - 64)) | (1L << (INSERT - 64)) | (1L << (DELETE - 64)) | (1L << (INTO - 64)) | (1L << (DESCRIBE - 64)) | (1L << (EXPLAIN - 64)) | (1L << (FORMAT - 64)) | (1L << (LOGICAL - 64)) | (1L << (CODEGEN - 64)) | (1L << (COST - 64)) | (1L << (CAST - 64)) | (1L << (SHOW - 64)) | (1L << (TABLES - 64)) | (1L << (COLUMNS - 64)) | (1L << (COLUMN - 64)) | (1L << (USE - 64)) | (1L << (PARTITIONS - 64)) | (1L << (FUNCTIONS - 64)) | (1L << (DROP - 64)) | (1L << (UNION - 64)) | (1L << (EXCEPT - 64)) | (1L << (SETMINUS - 64)) | (1L << (INTERSECT - 64)) | (1L << (TO - 64)) | (1L << (TABLESAMPLE - 64)) | (1L << (STRATIFY - 64)) | (1L << (ALTER - 64)) | (1L << (RENAME - 64)) | (1L << (ARRAY - 64)) | (1L << (MAP - 64)) | (1L << (STRUCT - 64)) | (1L << (COMMENT - 64)) | (1L << (SET - 64)) | (1L << (RESET - 64)) | (1L << (DATA - 64)) | (1L << (START - 64)) | (1L << (TRANSACTION - 64)) | (1L << (COMMIT - 64)) | (1L << (ROLLBACK - 64)) | (1L << (MACRO - 64)) | (1L << (IGNORE - 64)) | (1L << (BOTH - 64)) | (1L << (LEADING - 64)) | (1L << (TRAILING - 64)) | (1L << (IF - 64)))) != 0) || ((((_la - 128)) & ~0x3f) == 0 && ((1L << (_la - 128)) & ((1L << (POSITION - 128)) | (1L << (EXTRACT - 128)) | (1L << (DIV - 128)) | (1L << (PERCENTLIT - 128)) | (1L << (BUCKET - 128)) | (1L << (OUT - 128)) | (1L << (OF - 128)) | (1L << (SORT - 128)) | (1L << (CLUSTER - 128)) | (1L << (DISTRIBUTE - 128)) | (1L << (OVERWRITE - 128)) | (1L << (TRANSFORM - 128)) | (1L << (REDUCE - 128)) | (1L << (SERDE - 128)) | (1L << (SERDEPROPERTIES - 128)) | (1L << (RECORDREADER - 128)) | (1L << (RECORDWRITER - 128)) | (1L << (DELIMITED - 128)) | (1L << (FIELDS - 128)) | (1L << (TERMINATED - 128)) | (1L << (COLLECTION - 128)) | (1L << (ITEMS - 128)) | (1L << (KEYS - 128)) | (1L << (ESCAPED - 128)) | (1L << (LINES - 128)) | (1L << (SEPARATED - 128)) | (1L << (FUNCTION - 128)) | (1L << (EXTENDED - 128)) | (1L << (REFRESH - 128)) | (1L << (CLEAR - 128)) | (1L << (CACHE - 128)) | (1L << (UNCACHE - 128)) | (1L << (LAZY - 128)) | (1L << (FORMATTED - 128)) | (1L << (GLOBAL - 128)) | (1L << (TEMPORARY - 128)) | (1L << (OPTIONS - 128)) | (1L << (UNSET - 128)) | (1L << (TBLPROPERTIES - 128)) | (1L << (DBPROPERTIES - 128)) | (1L << (BUCKETS - 128)) | (1L << (SKEWED - 128)) | (1L << (STORED - 128)) | (1L << (DIRECTORIES - 128)) | (1L << (LOCATION - 128)))) != 0) || ((((_la - 192)) & ~0x3f) == 0 && ((1L << (_la - 192)) & ((1L << (EXCHANGE - 192)) | (1L << (ARCHIVE - 192)) | (1L << (UNARCHIVE - 192)) | (1L << (FILEFORMAT - 192)) | (1L << (TOUCH - 192)) | (1L << (COMPACT - 192)) | (1L << (CONCATENATE - 192)) | (1L << (CHANGE - 192)) | (1L << (CASCADE - 192)) | (1L << (RESTRICT - 192)) | (1L << (CLUSTERED - 192)) | (1L << (SORTED - 192)) | (1L << (PURGE - 192)) | (1L << (INPUTFORMAT - 192)) | (1L << (OUTPUTFORMAT - 192)) | (1L << (DATABASE - 192)) | (1L << (DATABASES - 192)) | (1L << (DFS - 192)) | (1L << (TRUNCATE - 192)) | (1L << (ANALYZE - 192)) | (1L << (COMPUTE - 192)) | (1L << (LIST - 192)) | (1L << (STATISTICS - 192)) | (1L << (PARTITIONED - 192)) | (1L << (EXTERNAL - 192)) | (1L << (DEFINED - 192)) | (1L << (REVOKE - 192)) | (1L << (GRANT - 192)) | (1L << (LOCK - 192)) | (1L << (UNLOCK - 192)) | (1L << (MSCK - 192)) | (1L << (REPAIR - 192)) | (1L << (RECOVER - 192)) | (1L << (EXPORT - 192)) | (1L << (IMPORT - 192)) | (1L << (LOAD - 192)) | (1L << (ROLE - 192)) | (1L << (ROLES - 192)) | (1L << (COMPACTIONS - 192)) | (1L << (PRINCIPALS - 192)) | (1L << (TRANSACTIONS - 192)) | (1L << (INDEX - 192)) | (1L << (INDEXES - 192)) | (1L << (LOCKS - 192)) | (1L << (OPTION - 192)) | (1L << (ANTI - 192)) | (1L << (LOCAL - 192)) | (1L << (INPATH - 192)) | (1L << (IDENTIFIER - 192)) | (1L << (BACKQUOTED_IDENTIFIER - 192)))) != 0)) {
					{
					setState(735);
					describeColName();
					}
				}

				}
				break;
			case 43:
				_localctx = new RefreshTableContext(_localctx);
				enterOuterAlt(_localctx, 43);
				{
				setState(738);
				match(REFRESH);
				setState(739);
				match(TABLE);
				setState(740);
				tableIdentifier();
				}
				break;
			case 44:
				_localctx = new RefreshResourceContext(_localctx);
				enterOuterAlt(_localctx, 44);
				{
				setState(741);
				match(REFRESH);
				setState(749);
				_errHandler.sync(this);
				switch ( getInterpreter().adaptivePredict(_input,82,_ctx) ) {
				case 1:
					{
					setState(742);
					match(STRING);
					}
					break;
				case 2:
					{
					setState(746);
					_errHandler.sync(this);
					_alt = getInterpreter().adaptivePredict(_input,81,_ctx);
					while ( _alt!=1 && _alt!=org.antlr.v4.runtime.atn.ATN.INVALID_ALT_NUMBER ) {
						if ( _alt==1+1 ) {
							{
							{
							setState(743);
							matchWildcard();
							}
							} 
						}
						setState(748);
						_errHandler.sync(this);
						_alt = getInterpreter().adaptivePredict(_input,81,_ctx);
					}
					}
					break;
				}
				}
				break;
			case 45:
				_localctx = new CacheTableContext(_localctx);
				enterOuterAlt(_localctx, 45);
				{
				setState(751);
				match(CACHE);
				setState(753);
				_errHandler.sync(this);
				_la = _input.LA(1);
				if (_la==LAZY) {
					{
					setState(752);
					match(LAZY);
					}
				}

				setState(755);
				match(TABLE);
				setState(756);
				tableIdentifier();
				setState(759);
				_errHandler.sync(this);
				_la = _input.LA(1);
				if (_la==OPTIONS) {
					{
					setState(757);
					match(OPTIONS);
					setState(758);
					((CacheTableContext)_localctx).options = tablePropertyList();
					}
				}

				setState(765);
				_errHandler.sync(this);
				_la = _input.LA(1);
				if ((((_la) & ~0x3f) == 0 && ((1L << _la) & ((1L << T__0) | (1L << SELECT) | (1L << FROM) | (1L << AS))) != 0) || ((((_la - 77)) & ~0x3f) == 0 && ((1L << (_la - 77)) & ((1L << (WITH - 77)) | (1L << (VALUES - 77)) | (1L << (TABLE - 77)) | (1L << (INSERT - 77)) | (1L << (MAP - 77)))) != 0) || _la==REDUCE) {
					{
					setState(762);
					_errHandler.sync(this);
					_la = _input.LA(1);
					if (_la==AS) {
						{
						setState(761);
						match(AS);
						}
					}

					setState(764);
					query();
					}
				}

				}
				break;
			case 46:
				_localctx = new UncacheTableContext(_localctx);
				enterOuterAlt(_localctx, 46);
				{
				setState(767);
				match(UNCACHE);
				setState(768);
				match(TABLE);
				setState(771);
				_errHandler.sync(this);
				switch ( getInterpreter().adaptivePredict(_input,87,_ctx) ) {
				case 1:
					{
					setState(769);
					match(IF);
					setState(770);
					match(EXISTS);
					}
					break;
				}
				setState(773);
				tableIdentifier();
				}
				break;
			case 47:
				_localctx = new ClearCacheContext(_localctx);
				enterOuterAlt(_localctx, 47);
				{
				setState(774);
				match(CLEAR);
				setState(775);
				match(CACHE);
				}
				break;
			case 48:
				_localctx = new LoadDataContext(_localctx);
				enterOuterAlt(_localctx, 48);
				{
				setState(776);
				match(LOAD);
				setState(777);
				match(DATA);
				setState(779);
				_errHandler.sync(this);
				_la = _input.LA(1);
				if (_la==LOCAL) {
					{
					setState(778);
					match(LOCAL);
					}
				}

				setState(781);
				match(INPATH);
				setState(782);
				((LoadDataContext)_localctx).path = match(STRING);
				setState(784);
				_errHandler.sync(this);
				_la = _input.LA(1);
				if (_la==OVERWRITE) {
					{
					setState(783);
					match(OVERWRITE);
					}
				}

				setState(786);
				match(INTO);
				setState(787);
				match(TABLE);
				setState(788);
				tableIdentifier();
				setState(790);
				_errHandler.sync(this);
				_la = _input.LA(1);
				if (_la==PARTITION) {
					{
					setState(789);
					partitionSpec();
					}
				}

				}
				break;
			case 49:
				_localctx = new TruncateTableContext(_localctx);
				enterOuterAlt(_localctx, 49);
				{
				setState(792);
				match(TRUNCATE);
				setState(793);
				match(TABLE);
				setState(794);
				tableIdentifier();
				setState(796);
				_errHandler.sync(this);
				_la = _input.LA(1);
				if (_la==PARTITION) {
					{
					setState(795);
					partitionSpec();
					}
				}

				}
				break;
			case 50:
				_localctx = new RepairTableContext(_localctx);
				enterOuterAlt(_localctx, 50);
				{
				setState(798);
				match(MSCK);
				setState(799);
				match(REPAIR);
				setState(800);
				match(TABLE);
				setState(801);
				tableIdentifier();
				}
				break;
			case 51:
				_localctx = new ManageResourceContext(_localctx);
				enterOuterAlt(_localctx, 51);
				{
				setState(802);
				((ManageResourceContext)_localctx).op = _input.LT(1);
				_la = _input.LA(1);
				if ( !(_la==ADD || _la==LIST) ) {
					((ManageResourceContext)_localctx).op = (Token)_errHandler.recoverInline(this);
				}
				else {
					if ( _input.LA(1)==Token.EOF ) matchedEOF = true;
					_errHandler.reportMatch(this);
					consume();
				}
				setState(803);
				identifier();
				setState(807);
				_errHandler.sync(this);
				_alt = getInterpreter().adaptivePredict(_input,92,_ctx);
				while ( _alt!=1 && _alt!=org.antlr.v4.runtime.atn.ATN.INVALID_ALT_NUMBER ) {
					if ( _alt==1+1 ) {
						{
						{
						setState(804);
						matchWildcard();
						}
						} 
					}
					setState(809);
					_errHandler.sync(this);
					_alt = getInterpreter().adaptivePredict(_input,92,_ctx);
				}
				}
				break;
			case 52:
				_localctx = new FailNativeCommandContext(_localctx);
				enterOuterAlt(_localctx, 52);
				{
				setState(810);
				match(SET);
				setState(811);
				match(ROLE);
				setState(815);
				_errHandler.sync(this);
				_alt = getInterpreter().adaptivePredict(_input,93,_ctx);
				while ( _alt!=1 && _alt!=org.antlr.v4.runtime.atn.ATN.INVALID_ALT_NUMBER ) {
					if ( _alt==1+1 ) {
						{
						{
						setState(812);
						matchWildcard();
						}
						} 
					}
					setState(817);
					_errHandler.sync(this);
					_alt = getInterpreter().adaptivePredict(_input,93,_ctx);
				}
				}
				break;
			case 53:
				_localctx = new SetConfigurationContext(_localctx);
				enterOuterAlt(_localctx, 53);
				{
				setState(818);
				match(SET);
				setState(822);
				_errHandler.sync(this);
				_alt = getInterpreter().adaptivePredict(_input,94,_ctx);
				while ( _alt!=1 && _alt!=org.antlr.v4.runtime.atn.ATN.INVALID_ALT_NUMBER ) {
					if ( _alt==1+1 ) {
						{
						{
						setState(819);
						matchWildcard();
						}
						} 
					}
					setState(824);
					_errHandler.sync(this);
					_alt = getInterpreter().adaptivePredict(_input,94,_ctx);
				}
				}
				break;
			case 54:
				_localctx = new ResetConfigurationContext(_localctx);
				enterOuterAlt(_localctx, 54);
				{
				setState(825);
				match(RESET);
				}
				break;
			case 55:
				_localctx = new FailNativeCommandContext(_localctx);
				enterOuterAlt(_localctx, 55);
				{
				setState(826);
				unsupportedHiveNativeCommands();
				setState(830);
				_errHandler.sync(this);
				_alt = getInterpreter().adaptivePredict(_input,95,_ctx);
				while ( _alt!=1 && _alt!=org.antlr.v4.runtime.atn.ATN.INVALID_ALT_NUMBER ) {
					if ( _alt==1+1 ) {
						{
						{
						setState(827);
						matchWildcard();
						}
						} 
					}
					setState(832);
					_errHandler.sync(this);
					_alt = getInterpreter().adaptivePredict(_input,95,_ctx);
				}
				}
				break;
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static class UnsupportedHiveNativeCommandsContext extends ParserRuleContext {
		public Token kw1;
		public Token kw2;
		public Token kw3;
		public Token kw4;
		public Token kw5;
		public Token kw6;
		public TerminalNode CREATE() { return getToken(sparkParser.CREATE, 0); }
		public TerminalNode ROLE() { return getToken(sparkParser.ROLE, 0); }
		public TerminalNode DROP() { return getToken(sparkParser.DROP, 0); }
		public TerminalNode GRANT() { return getToken(sparkParser.GRANT, 0); }
		public TerminalNode REVOKE() { return getToken(sparkParser.REVOKE, 0); }
		public TerminalNode SHOW() { return getToken(sparkParser.SHOW, 0); }
		public TerminalNode PRINCIPALS() { return getToken(sparkParser.PRINCIPALS, 0); }
		public TerminalNode ROLES() { return getToken(sparkParser.ROLES, 0); }
		public TerminalNode CURRENT() { return getToken(sparkParser.CURRENT, 0); }
		public TerminalNode EXPORT() { return getToken(sparkParser.EXPORT, 0); }
		public TerminalNode TABLE() { return getToken(sparkParser.TABLE, 0); }
		public TerminalNode IMPORT() { return getToken(sparkParser.IMPORT, 0); }
		public TerminalNode COMPACTIONS() { return getToken(sparkParser.COMPACTIONS, 0); }
		public TerminalNode TRANSACTIONS() { return getToken(sparkParser.TRANSACTIONS, 0); }
		public TerminalNode INDEXES() { return getToken(sparkParser.INDEXES, 0); }
		public TerminalNode LOCKS() { return getToken(sparkParser.LOCKS, 0); }
		public TerminalNode INDEX() { return getToken(sparkParser.INDEX, 0); }
		public TerminalNode ALTER() { return getToken(sparkParser.ALTER, 0); }
		public TerminalNode LOCK() { return getToken(sparkParser.LOCK, 0); }
		public TerminalNode DATABASE() { return getToken(sparkParser.DATABASE, 0); }
		public TerminalNode UNLOCK() { return getToken(sparkParser.UNLOCK, 0); }
		public TerminalNode TEMPORARY() { return getToken(sparkParser.TEMPORARY, 0); }
		public TerminalNode MACRO() { return getToken(sparkParser.MACRO, 0); }
		public TableIdentifierContext tableIdentifier() {
			return getRuleContext(TableIdentifierContext.class,0);
		}
		public TerminalNode NOT() { return getToken(sparkParser.NOT, 0); }
		public TerminalNode CLUSTERED() { return getToken(sparkParser.CLUSTERED, 0); }
		public TerminalNode BY() { return getToken(sparkParser.BY, 0); }
		public TerminalNode SORTED() { return getToken(sparkParser.SORTED, 0); }
		public TerminalNode SKEWED() { return getToken(sparkParser.SKEWED, 0); }
		public TerminalNode STORED() { return getToken(sparkParser.STORED, 0); }
		public TerminalNode AS() { return getToken(sparkParser.AS, 0); }
		public TerminalNode DIRECTORIES() { return getToken(sparkParser.DIRECTORIES, 0); }
		public TerminalNode SET() { return getToken(sparkParser.SET, 0); }
		public TerminalNode LOCATION() { return getToken(sparkParser.LOCATION, 0); }
		public TerminalNode EXCHANGE() { return getToken(sparkParser.EXCHANGE, 0); }
		public TerminalNode PARTITION() { return getToken(sparkParser.PARTITION, 0); }
		public TerminalNode ARCHIVE() { return getToken(sparkParser.ARCHIVE, 0); }
		public TerminalNode UNARCHIVE() { return getToken(sparkParser.UNARCHIVE, 0); }
		public TerminalNode TOUCH() { return getToken(sparkParser.TOUCH, 0); }
		public TerminalNode COMPACT() { return getToken(sparkParser.COMPACT, 0); }
		public PartitionSpecContext partitionSpec() {
			return getRuleContext(PartitionSpecContext.class,0);
		}
		public TerminalNode CONCATENATE() { return getToken(sparkParser.CONCATENATE, 0); }
		public TerminalNode FILEFORMAT() { return getToken(sparkParser.FILEFORMAT, 0); }
		public TerminalNode REPLACE() { return getToken(sparkParser.REPLACE, 0); }
		public TerminalNode COLUMNS() { return getToken(sparkParser.COLUMNS, 0); }
		public TerminalNode START() { return getToken(sparkParser.START, 0); }
		public TerminalNode TRANSACTION() { return getToken(sparkParser.TRANSACTION, 0); }
		public TerminalNode COMMIT() { return getToken(sparkParser.COMMIT, 0); }
		public TerminalNode ROLLBACK() { return getToken(sparkParser.ROLLBACK, 0); }
		public TerminalNode DFS() { return getToken(sparkParser.DFS, 0); }
		public TerminalNode DELETE() { return getToken(sparkParser.DELETE, 0); }
		public TerminalNode FROM() { return getToken(sparkParser.FROM, 0); }
		public UnsupportedHiveNativeCommandsContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_unsupportedHiveNativeCommands; }
	}

	public final UnsupportedHiveNativeCommandsContext unsupportedHiveNativeCommands() throws RecognitionException {
		UnsupportedHiveNativeCommandsContext _localctx = new UnsupportedHiveNativeCommandsContext(_ctx, getState());
		enterRule(_localctx, 14, RULE_unsupportedHiveNativeCommands);
		int _la;
		try {
			setState(1005);
			_errHandler.sync(this);
			switch ( getInterpreter().adaptivePredict(_input,104,_ctx) ) {
			case 1:
				enterOuterAlt(_localctx, 1);
				{
				setState(835);
				((UnsupportedHiveNativeCommandsContext)_localctx).kw1 = match(CREATE);
				setState(836);
				((UnsupportedHiveNativeCommandsContext)_localctx).kw2 = match(ROLE);
				}
				break;
			case 2:
				enterOuterAlt(_localctx, 2);
				{
				setState(837);
				((UnsupportedHiveNativeCommandsContext)_localctx).kw1 = match(DROP);
				setState(838);
				((UnsupportedHiveNativeCommandsContext)_localctx).kw2 = match(ROLE);
				}
				break;
			case 3:
				enterOuterAlt(_localctx, 3);
				{
				setState(839);
				((UnsupportedHiveNativeCommandsContext)_localctx).kw1 = match(GRANT);
				setState(841);
				_errHandler.sync(this);
				switch ( getInterpreter().adaptivePredict(_input,97,_ctx) ) {
				case 1:
					{
					setState(840);
					((UnsupportedHiveNativeCommandsContext)_localctx).kw2 = match(ROLE);
					}
					break;
				}
				}
				break;
			case 4:
				enterOuterAlt(_localctx, 4);
				{
				setState(843);
				((UnsupportedHiveNativeCommandsContext)_localctx).kw1 = match(REVOKE);
				setState(845);
				_errHandler.sync(this);
				switch ( getInterpreter().adaptivePredict(_input,98,_ctx) ) {
				case 1:
					{
					setState(844);
					((UnsupportedHiveNativeCommandsContext)_localctx).kw2 = match(ROLE);
					}
					break;
				}
				}
				break;
			case 5:
				enterOuterAlt(_localctx, 5);
				{
				setState(847);
				((UnsupportedHiveNativeCommandsContext)_localctx).kw1 = match(SHOW);
				setState(848);
				((UnsupportedHiveNativeCommandsContext)_localctx).kw2 = match(GRANT);
				}
				break;
			case 6:
				enterOuterAlt(_localctx, 6);
				{
				setState(849);
				((UnsupportedHiveNativeCommandsContext)_localctx).kw1 = match(SHOW);
				setState(850);
				((UnsupportedHiveNativeCommandsContext)_localctx).kw2 = match(ROLE);
				setState(852);
				_errHandler.sync(this);
				switch ( getInterpreter().adaptivePredict(_input,99,_ctx) ) {
				case 1:
					{
					setState(851);
					((UnsupportedHiveNativeCommandsContext)_localctx).kw3 = match(GRANT);
					}
					break;
				}
				}
				break;
			case 7:
				enterOuterAlt(_localctx, 7);
				{
				setState(854);
				((UnsupportedHiveNativeCommandsContext)_localctx).kw1 = match(SHOW);
				setState(855);
				((UnsupportedHiveNativeCommandsContext)_localctx).kw2 = match(PRINCIPALS);
				}
				break;
			case 8:
				enterOuterAlt(_localctx, 8);
				{
				setState(856);
				((UnsupportedHiveNativeCommandsContext)_localctx).kw1 = match(SHOW);
				setState(857);
				((UnsupportedHiveNativeCommandsContext)_localctx).kw2 = match(ROLES);
				}
				break;
			case 9:
				enterOuterAlt(_localctx, 9);
				{
				setState(858);
				((UnsupportedHiveNativeCommandsContext)_localctx).kw1 = match(SHOW);
				setState(859);
				((UnsupportedHiveNativeCommandsContext)_localctx).kw2 = match(CURRENT);
				setState(860);
				((UnsupportedHiveNativeCommandsContext)_localctx).kw3 = match(ROLES);
				}
				break;
			case 10:
				enterOuterAlt(_localctx, 10);
				{
				setState(861);
				((UnsupportedHiveNativeCommandsContext)_localctx).kw1 = match(EXPORT);
				setState(862);
				((UnsupportedHiveNativeCommandsContext)_localctx).kw2 = match(TABLE);
				}
				break;
			case 11:
				enterOuterAlt(_localctx, 11);
				{
				setState(863);
				((UnsupportedHiveNativeCommandsContext)_localctx).kw1 = match(IMPORT);
				setState(864);
				((UnsupportedHiveNativeCommandsContext)_localctx).kw2 = match(TABLE);
				}
				break;
			case 12:
				enterOuterAlt(_localctx, 12);
				{
				setState(865);
				((UnsupportedHiveNativeCommandsContext)_localctx).kw1 = match(SHOW);
				setState(866);
				((UnsupportedHiveNativeCommandsContext)_localctx).kw2 = match(COMPACTIONS);
				}
				break;
			case 13:
				enterOuterAlt(_localctx, 13);
				{
				setState(867);
				((UnsupportedHiveNativeCommandsContext)_localctx).kw1 = match(SHOW);
				setState(868);
				((UnsupportedHiveNativeCommandsContext)_localctx).kw2 = match(CREATE);
				setState(869);
				((UnsupportedHiveNativeCommandsContext)_localctx).kw3 = match(TABLE);
				}
				break;
			case 14:
				enterOuterAlt(_localctx, 14);
				{
				setState(870);
				((UnsupportedHiveNativeCommandsContext)_localctx).kw1 = match(SHOW);
				setState(871);
				((UnsupportedHiveNativeCommandsContext)_localctx).kw2 = match(TRANSACTIONS);
				}
				break;
			case 15:
				enterOuterAlt(_localctx, 15);
				{
				setState(872);
				((UnsupportedHiveNativeCommandsContext)_localctx).kw1 = match(SHOW);
				setState(873);
				((UnsupportedHiveNativeCommandsContext)_localctx).kw2 = match(INDEXES);
				}
				break;
			case 16:
				enterOuterAlt(_localctx, 16);
				{
				setState(874);
				((UnsupportedHiveNativeCommandsContext)_localctx).kw1 = match(SHOW);
				setState(875);
				((UnsupportedHiveNativeCommandsContext)_localctx).kw2 = match(LOCKS);
				}
				break;
			case 17:
				enterOuterAlt(_localctx, 17);
				{
				setState(876);
				((UnsupportedHiveNativeCommandsContext)_localctx).kw1 = match(CREATE);
				setState(877);
				((UnsupportedHiveNativeCommandsContext)_localctx).kw2 = match(INDEX);
				}
				break;
			case 18:
				enterOuterAlt(_localctx, 18);
				{
				setState(878);
				((UnsupportedHiveNativeCommandsContext)_localctx).kw1 = match(DROP);
				setState(879);
				((UnsupportedHiveNativeCommandsContext)_localctx).kw2 = match(INDEX);
				}
				break;
			case 19:
				enterOuterAlt(_localctx, 19);
				{
				setState(880);
				((UnsupportedHiveNativeCommandsContext)_localctx).kw1 = match(ALTER);
				setState(881);
				((UnsupportedHiveNativeCommandsContext)_localctx).kw2 = match(INDEX);
				}
				break;
			case 20:
				enterOuterAlt(_localctx, 20);
				{
				setState(882);
				((UnsupportedHiveNativeCommandsContext)_localctx).kw1 = match(LOCK);
				setState(883);
				((UnsupportedHiveNativeCommandsContext)_localctx).kw2 = match(TABLE);
				}
				break;
			case 21:
				enterOuterAlt(_localctx, 21);
				{
				setState(884);
				((UnsupportedHiveNativeCommandsContext)_localctx).kw1 = match(LOCK);
				setState(885);
				((UnsupportedHiveNativeCommandsContext)_localctx).kw2 = match(DATABASE);
				}
				break;
			case 22:
				enterOuterAlt(_localctx, 22);
				{
				setState(886);
				((UnsupportedHiveNativeCommandsContext)_localctx).kw1 = match(UNLOCK);
				setState(887);
				((UnsupportedHiveNativeCommandsContext)_localctx).kw2 = match(TABLE);
				}
				break;
			case 23:
				enterOuterAlt(_localctx, 23);
				{
				setState(888);
				((UnsupportedHiveNativeCommandsContext)_localctx).kw1 = match(UNLOCK);
				setState(889);
				((UnsupportedHiveNativeCommandsContext)_localctx).kw2 = match(DATABASE);
				}
				break;
			case 24:
				enterOuterAlt(_localctx, 24);
				{
				setState(890);
				((UnsupportedHiveNativeCommandsContext)_localctx).kw1 = match(CREATE);
				setState(891);
				((UnsupportedHiveNativeCommandsContext)_localctx).kw2 = match(TEMPORARY);
				setState(892);
				((UnsupportedHiveNativeCommandsContext)_localctx).kw3 = match(MACRO);
				}
				break;
			case 25:
				enterOuterAlt(_localctx, 25);
				{
				setState(893);
				((UnsupportedHiveNativeCommandsContext)_localctx).kw1 = match(DROP);
				setState(894);
				((UnsupportedHiveNativeCommandsContext)_localctx).kw2 = match(TEMPORARY);
				setState(895);
				((UnsupportedHiveNativeCommandsContext)_localctx).kw3 = match(MACRO);
				}
				break;
			case 26:
				enterOuterAlt(_localctx, 26);
				{
				setState(896);
				((UnsupportedHiveNativeCommandsContext)_localctx).kw1 = match(ALTER);
				setState(897);
				((UnsupportedHiveNativeCommandsContext)_localctx).kw2 = match(TABLE);
				setState(898);
				tableIdentifier();
				setState(899);
				((UnsupportedHiveNativeCommandsContext)_localctx).kw3 = match(NOT);
				setState(900);
				((UnsupportedHiveNativeCommandsContext)_localctx).kw4 = match(CLUSTERED);
				}
				break;
			case 27:
				enterOuterAlt(_localctx, 27);
				{
				setState(902);
				((UnsupportedHiveNativeCommandsContext)_localctx).kw1 = match(ALTER);
				setState(903);
				((UnsupportedHiveNativeCommandsContext)_localctx).kw2 = match(TABLE);
				setState(904);
				tableIdentifier();
				setState(905);
				((UnsupportedHiveNativeCommandsContext)_localctx).kw3 = match(CLUSTERED);
				setState(906);
				((UnsupportedHiveNativeCommandsContext)_localctx).kw4 = match(BY);
				}
				break;
			case 28:
				enterOuterAlt(_localctx, 28);
				{
				setState(908);
				((UnsupportedHiveNativeCommandsContext)_localctx).kw1 = match(ALTER);
				setState(909);
				((UnsupportedHiveNativeCommandsContext)_localctx).kw2 = match(TABLE);
				setState(910);
				tableIdentifier();
				setState(911);
				((UnsupportedHiveNativeCommandsContext)_localctx).kw3 = match(NOT);
				setState(912);
				((UnsupportedHiveNativeCommandsContext)_localctx).kw4 = match(SORTED);
				}
				break;
			case 29:
				enterOuterAlt(_localctx, 29);
				{
				setState(914);
				((UnsupportedHiveNativeCommandsContext)_localctx).kw1 = match(ALTER);
				setState(915);
				((UnsupportedHiveNativeCommandsContext)_localctx).kw2 = match(TABLE);
				setState(916);
				tableIdentifier();
				setState(917);
				((UnsupportedHiveNativeCommandsContext)_localctx).kw3 = match(SKEWED);
				setState(918);
				((UnsupportedHiveNativeCommandsContext)_localctx).kw4 = match(BY);
				}
				break;
			case 30:
				enterOuterAlt(_localctx, 30);
				{
				setState(920);
				((UnsupportedHiveNativeCommandsContext)_localctx).kw1 = match(ALTER);
				setState(921);
				((UnsupportedHiveNativeCommandsContext)_localctx).kw2 = match(TABLE);
				setState(922);
				tableIdentifier();
				setState(923);
				((UnsupportedHiveNativeCommandsContext)_localctx).kw3 = match(NOT);
				setState(924);
				((UnsupportedHiveNativeCommandsContext)_localctx).kw4 = match(SKEWED);
				}
				break;
			case 31:
				enterOuterAlt(_localctx, 31);
				{
				setState(926);
				((UnsupportedHiveNativeCommandsContext)_localctx).kw1 = match(ALTER);
				setState(927);
				((UnsupportedHiveNativeCommandsContext)_localctx).kw2 = match(TABLE);
				setState(928);
				tableIdentifier();
				setState(929);
				((UnsupportedHiveNativeCommandsContext)_localctx).kw3 = match(NOT);
				setState(930);
				((UnsupportedHiveNativeCommandsContext)_localctx).kw4 = match(STORED);
				setState(931);
				((UnsupportedHiveNativeCommandsContext)_localctx).kw5 = match(AS);
				setState(932);
				((UnsupportedHiveNativeCommandsContext)_localctx).kw6 = match(DIRECTORIES);
				}
				break;
			case 32:
				enterOuterAlt(_localctx, 32);
				{
				setState(934);
				((UnsupportedHiveNativeCommandsContext)_localctx).kw1 = match(ALTER);
				setState(935);
				((UnsupportedHiveNativeCommandsContext)_localctx).kw2 = match(TABLE);
				setState(936);
				tableIdentifier();
				setState(937);
				((UnsupportedHiveNativeCommandsContext)_localctx).kw3 = match(SET);
				setState(938);
				((UnsupportedHiveNativeCommandsContext)_localctx).kw4 = match(SKEWED);
				setState(939);
				((UnsupportedHiveNativeCommandsContext)_localctx).kw5 = match(LOCATION);
				}
				break;
			case 33:
				enterOuterAlt(_localctx, 33);
				{
				setState(941);
				((UnsupportedHiveNativeCommandsContext)_localctx).kw1 = match(ALTER);
				setState(942);
				((UnsupportedHiveNativeCommandsContext)_localctx).kw2 = match(TABLE);
				setState(943);
				tableIdentifier();
				setState(944);
				((UnsupportedHiveNativeCommandsContext)_localctx).kw3 = match(EXCHANGE);
				setState(945);
				((UnsupportedHiveNativeCommandsContext)_localctx).kw4 = match(PARTITION);
				}
				break;
			case 34:
				enterOuterAlt(_localctx, 34);
				{
				setState(947);
				((UnsupportedHiveNativeCommandsContext)_localctx).kw1 = match(ALTER);
				setState(948);
				((UnsupportedHiveNativeCommandsContext)_localctx).kw2 = match(TABLE);
				setState(949);
				tableIdentifier();
				setState(950);
				((UnsupportedHiveNativeCommandsContext)_localctx).kw3 = match(ARCHIVE);
				setState(951);
				((UnsupportedHiveNativeCommandsContext)_localctx).kw4 = match(PARTITION);
				}
				break;
			case 35:
				enterOuterAlt(_localctx, 35);
				{
				setState(953);
				((UnsupportedHiveNativeCommandsContext)_localctx).kw1 = match(ALTER);
				setState(954);
				((UnsupportedHiveNativeCommandsContext)_localctx).kw2 = match(TABLE);
				setState(955);
				tableIdentifier();
				setState(956);
				((UnsupportedHiveNativeCommandsContext)_localctx).kw3 = match(UNARCHIVE);
				setState(957);
				((UnsupportedHiveNativeCommandsContext)_localctx).kw4 = match(PARTITION);
				}
				break;
			case 36:
				enterOuterAlt(_localctx, 36);
				{
				setState(959);
				((UnsupportedHiveNativeCommandsContext)_localctx).kw1 = match(ALTER);
				setState(960);
				((UnsupportedHiveNativeCommandsContext)_localctx).kw2 = match(TABLE);
				setState(961);
				tableIdentifier();
				setState(962);
				((UnsupportedHiveNativeCommandsContext)_localctx).kw3 = match(TOUCH);
				}
				break;
			case 37:
				enterOuterAlt(_localctx, 37);
				{
				setState(964);
				((UnsupportedHiveNativeCommandsContext)_localctx).kw1 = match(ALTER);
				setState(965);
				((UnsupportedHiveNativeCommandsContext)_localctx).kw2 = match(TABLE);
				setState(966);
				tableIdentifier();
				setState(968);
				_errHandler.sync(this);
				_la = _input.LA(1);
				if (_la==PARTITION) {
					{
					setState(967);
					partitionSpec();
					}
				}

				setState(970);
				((UnsupportedHiveNativeCommandsContext)_localctx).kw3 = match(COMPACT);
				}
				break;
			case 38:
				enterOuterAlt(_localctx, 38);
				{
				setState(972);
				((UnsupportedHiveNativeCommandsContext)_localctx).kw1 = match(ALTER);
				setState(973);
				((UnsupportedHiveNativeCommandsContext)_localctx).kw2 = match(TABLE);
				setState(974);
				tableIdentifier();
				setState(976);
				_errHandler.sync(this);
				_la = _input.LA(1);
				if (_la==PARTITION) {
					{
					setState(975);
					partitionSpec();
					}
				}

				setState(978);
				((UnsupportedHiveNativeCommandsContext)_localctx).kw3 = match(CONCATENATE);
				}
				break;
			case 39:
				enterOuterAlt(_localctx, 39);
				{
				setState(980);
				((UnsupportedHiveNativeCommandsContext)_localctx).kw1 = match(ALTER);
				setState(981);
				((UnsupportedHiveNativeCommandsContext)_localctx).kw2 = match(TABLE);
				setState(982);
				tableIdentifier();
				setState(984);
				_errHandler.sync(this);
				_la = _input.LA(1);
				if (_la==PARTITION) {
					{
					setState(983);
					partitionSpec();
					}
				}

				setState(986);
				((UnsupportedHiveNativeCommandsContext)_localctx).kw3 = match(SET);
				setState(987);
				((UnsupportedHiveNativeCommandsContext)_localctx).kw4 = match(FILEFORMAT);
				}
				break;
			case 40:
				enterOuterAlt(_localctx, 40);
				{
				setState(989);
				((UnsupportedHiveNativeCommandsContext)_localctx).kw1 = match(ALTER);
				setState(990);
				((UnsupportedHiveNativeCommandsContext)_localctx).kw2 = match(TABLE);
				setState(991);
				tableIdentifier();
				setState(993);
				_errHandler.sync(this);
				_la = _input.LA(1);
				if (_la==PARTITION) {
					{
					setState(992);
					partitionSpec();
					}
				}

				setState(995);
				((UnsupportedHiveNativeCommandsContext)_localctx).kw3 = match(REPLACE);
				setState(996);
				((UnsupportedHiveNativeCommandsContext)_localctx).kw4 = match(COLUMNS);
				}
				break;
			case 41:
				enterOuterAlt(_localctx, 41);
				{
				setState(998);
				((UnsupportedHiveNativeCommandsContext)_localctx).kw1 = match(START);
				setState(999);
				((UnsupportedHiveNativeCommandsContext)_localctx).kw2 = match(TRANSACTION);
				}
				break;
			case 42:
				enterOuterAlt(_localctx, 42);
				{
				setState(1000);
				((UnsupportedHiveNativeCommandsContext)_localctx).kw1 = match(COMMIT);
				}
				break;
			case 43:
				enterOuterAlt(_localctx, 43);
				{
				setState(1001);
				((UnsupportedHiveNativeCommandsContext)_localctx).kw1 = match(ROLLBACK);
				}
				break;
			case 44:
				enterOuterAlt(_localctx, 44);
				{
				setState(1002);
				((UnsupportedHiveNativeCommandsContext)_localctx).kw1 = match(DFS);
				}
				break;
			case 45:
				enterOuterAlt(_localctx, 45);
				{
				setState(1003);
				((UnsupportedHiveNativeCommandsContext)_localctx).kw1 = match(DELETE);
				setState(1004);
				((UnsupportedHiveNativeCommandsContext)_localctx).kw2 = match(FROM);
				}
				break;
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static class CreateTableHeaderContext extends ParserRuleContext {
		public TerminalNode CREATE() { return getToken(sparkParser.CREATE, 0); }
		public TerminalNode TABLE() { return getToken(sparkParser.TABLE, 0); }
		public TableIdentifierContext tableIdentifier() {
			return getRuleContext(TableIdentifierContext.class,0);
		}
		public TerminalNode TEMPORARY() { return getToken(sparkParser.TEMPORARY, 0); }
		public TerminalNode EXTERNAL() { return getToken(sparkParser.EXTERNAL, 0); }
		public TerminalNode IF() { return getToken(sparkParser.IF, 0); }
		public TerminalNode NOT() { return getToken(sparkParser.NOT, 0); }
		public TerminalNode EXISTS() { return getToken(sparkParser.EXISTS, 0); }
		public CreateTableHeaderContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_createTableHeader; }
	}

	public final CreateTableHeaderContext createTableHeader() throws RecognitionException {
		CreateTableHeaderContext _localctx = new CreateTableHeaderContext(_ctx, getState());
		enterRule(_localctx, 16, RULE_createTableHeader);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(1007);
			match(CREATE);
			setState(1009);
			_errHandler.sync(this);
			_la = _input.LA(1);
			if (_la==TEMPORARY) {
				{
				setState(1008);
				match(TEMPORARY);
				}
			}

			setState(1012);
			_errHandler.sync(this);
			_la = _input.LA(1);
			if (_la==EXTERNAL) {
				{
				setState(1011);
				match(EXTERNAL);
				}
			}

			setState(1014);
			match(TABLE);
			setState(1018);
			_errHandler.sync(this);
			switch ( getInterpreter().adaptivePredict(_input,107,_ctx) ) {
			case 1:
				{
				setState(1015);
				match(IF);
				setState(1016);
				match(NOT);
				setState(1017);
				match(EXISTS);
				}
				break;
			}
			setState(1020);
			tableIdentifier();
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static class BucketSpecContext extends ParserRuleContext {
		public TerminalNode CLUSTERED() { return getToken(sparkParser.CLUSTERED, 0); }
		public List<TerminalNode> BY() { return getTokens(sparkParser.BY); }
		public TerminalNode BY(int i) {
			return getToken(sparkParser.BY, i);
		}
		public IdentifierListContext identifierList() {
			return getRuleContext(IdentifierListContext.class,0);
		}
		public TerminalNode INTO() { return getToken(sparkParser.INTO, 0); }
		public TerminalNode INTEGER_VALUE() { return getToken(sparkParser.INTEGER_VALUE, 0); }
		public TerminalNode BUCKETS() { return getToken(sparkParser.BUCKETS, 0); }
		public TerminalNode SORTED() { return getToken(sparkParser.SORTED, 0); }
		public OrderedIdentifierListContext orderedIdentifierList() {
			return getRuleContext(OrderedIdentifierListContext.class,0);
		}
		public BucketSpecContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_bucketSpec; }
	}

	public final BucketSpecContext bucketSpec() throws RecognitionException {
		BucketSpecContext _localctx = new BucketSpecContext(_ctx, getState());
		enterRule(_localctx, 18, RULE_bucketSpec);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(1022);
			match(CLUSTERED);
			setState(1023);
			match(BY);
			setState(1024);
			identifierList();
			setState(1028);
			_errHandler.sync(this);
			_la = _input.LA(1);
			if (_la==SORTED) {
				{
				setState(1025);
				match(SORTED);
				setState(1026);
				match(BY);
				setState(1027);
				orderedIdentifierList();
				}
			}

			setState(1030);
			match(INTO);
			setState(1031);
			match(INTEGER_VALUE);
			setState(1032);
			match(BUCKETS);
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static class SkewSpecContext extends ParserRuleContext {
		public TerminalNode SKEWED() { return getToken(sparkParser.SKEWED, 0); }
		public TerminalNode BY() { return getToken(sparkParser.BY, 0); }
		public IdentifierListContext identifierList() {
			return getRuleContext(IdentifierListContext.class,0);
		}
		public TerminalNode ON() { return getToken(sparkParser.ON, 0); }
		public ConstantListContext constantList() {
			return getRuleContext(ConstantListContext.class,0);
		}
		public NestedConstantListContext nestedConstantList() {
			return getRuleContext(NestedConstantListContext.class,0);
		}
		public TerminalNode STORED() { return getToken(sparkParser.STORED, 0); }
		public TerminalNode AS() { return getToken(sparkParser.AS, 0); }
		public TerminalNode DIRECTORIES() { return getToken(sparkParser.DIRECTORIES, 0); }
		public SkewSpecContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_skewSpec; }
	}

	public final SkewSpecContext skewSpec() throws RecognitionException {
		SkewSpecContext _localctx = new SkewSpecContext(_ctx, getState());
		enterRule(_localctx, 20, RULE_skewSpec);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(1034);
			match(SKEWED);
			setState(1035);
			match(BY);
			setState(1036);
			identifierList();
			setState(1037);
			match(ON);
			setState(1040);
			_errHandler.sync(this);
			switch ( getInterpreter().adaptivePredict(_input,109,_ctx) ) {
			case 1:
				{
				setState(1038);
				constantList();
				}
				break;
			case 2:
				{
				setState(1039);
				nestedConstantList();
				}
				break;
			}
			setState(1045);
			_errHandler.sync(this);
			switch ( getInterpreter().adaptivePredict(_input,110,_ctx) ) {
			case 1:
				{
				setState(1042);
				match(STORED);
				setState(1043);
				match(AS);
				setState(1044);
				match(DIRECTORIES);
				}
				break;
			}
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static class LocationSpecContext extends ParserRuleContext {
		public TerminalNode LOCATION() { return getToken(sparkParser.LOCATION, 0); }
		public TerminalNode STRING() { return getToken(sparkParser.STRING, 0); }
		public LocationSpecContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_locationSpec; }
	}

	public final LocationSpecContext locationSpec() throws RecognitionException {
		LocationSpecContext _localctx = new LocationSpecContext(_ctx, getState());
		enterRule(_localctx, 22, RULE_locationSpec);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(1047);
			match(LOCATION);
			setState(1048);
			match(STRING);
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static class QueryContext extends ParserRuleContext {
		public QueryNoWithContext queryNoWith() {
			return getRuleContext(QueryNoWithContext.class,0);
		}
		public CtesContext ctes() {
			return getRuleContext(CtesContext.class,0);
		}
		public QueryContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_query; }
	}

	public final QueryContext query() throws RecognitionException {
		QueryContext _localctx = new QueryContext(_ctx, getState());
		enterRule(_localctx, 24, RULE_query);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(1051);
			_errHandler.sync(this);
			_la = _input.LA(1);
			if (_la==WITH) {
				{
				setState(1050);
				ctes();
				}
			}

			setState(1053);
			queryNoWith();
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static class InsertIntoContext extends ParserRuleContext {
		public InsertIntoContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_insertInto; }
	 
		public InsertIntoContext() { }
		public void copyFrom(InsertIntoContext ctx) {
			super.copyFrom(ctx);
		}
	}
	public static class InsertOverwriteHiveDirContext extends InsertIntoContext {
		public Token path;
		public TerminalNode INSERT() { return getToken(sparkParser.INSERT, 0); }
		public TerminalNode OVERWRITE() { return getToken(sparkParser.OVERWRITE, 0); }
		public TerminalNode DIRECTORY() { return getToken(sparkParser.DIRECTORY, 0); }
		public TerminalNode STRING() { return getToken(sparkParser.STRING, 0); }
		public TerminalNode LOCAL() { return getToken(sparkParser.LOCAL, 0); }
		public RowFormatContext rowFormat() {
			return getRuleContext(RowFormatContext.class,0);
		}
		public CreateFileFormatContext createFileFormat() {
			return getRuleContext(CreateFileFormatContext.class,0);
		}
		public InsertOverwriteHiveDirContext(InsertIntoContext ctx) { copyFrom(ctx); }
	}
	public static class InsertOverwriteDirContext extends InsertIntoContext {
		public Token path;
		public TablePropertyListContext options;
		public TerminalNode INSERT() { return getToken(sparkParser.INSERT, 0); }
		public TerminalNode OVERWRITE() { return getToken(sparkParser.OVERWRITE, 0); }
		public TerminalNode DIRECTORY() { return getToken(sparkParser.DIRECTORY, 0); }
		public TableProviderContext tableProvider() {
			return getRuleContext(TableProviderContext.class,0);
		}
		public TerminalNode LOCAL() { return getToken(sparkParser.LOCAL, 0); }
		public TerminalNode OPTIONS() { return getToken(sparkParser.OPTIONS, 0); }
		public TerminalNode STRING() { return getToken(sparkParser.STRING, 0); }
		public TablePropertyListContext tablePropertyList() {
			return getRuleContext(TablePropertyListContext.class,0);
		}
		public InsertOverwriteDirContext(InsertIntoContext ctx) { copyFrom(ctx); }
	}
	public static class InsertOverwriteTableContext extends InsertIntoContext {
		public TerminalNode INSERT() { return getToken(sparkParser.INSERT, 0); }
		public TerminalNode OVERWRITE() { return getToken(sparkParser.OVERWRITE, 0); }
		public TerminalNode TABLE() { return getToken(sparkParser.TABLE, 0); }
		public TableIdentifierContext tableIdentifier() {
			return getRuleContext(TableIdentifierContext.class,0);
		}
		public PartitionSpecContext partitionSpec() {
			return getRuleContext(PartitionSpecContext.class,0);
		}
		public TerminalNode IF() { return getToken(sparkParser.IF, 0); }
		public TerminalNode NOT() { return getToken(sparkParser.NOT, 0); }
		public TerminalNode EXISTS() { return getToken(sparkParser.EXISTS, 0); }
		public InsertOverwriteTableContext(InsertIntoContext ctx) { copyFrom(ctx); }
	}
	public static class InsertIntoTableContext extends InsertIntoContext {
		public TerminalNode INSERT() { return getToken(sparkParser.INSERT, 0); }
		public TerminalNode INTO() { return getToken(sparkParser.INTO, 0); }
		public TableIdentifierContext tableIdentifier() {
			return getRuleContext(TableIdentifierContext.class,0);
		}
		public TerminalNode TABLE() { return getToken(sparkParser.TABLE, 0); }
		public PartitionSpecContext partitionSpec() {
			return getRuleContext(PartitionSpecContext.class,0);
		}
		public InsertIntoTableContext(InsertIntoContext ctx) { copyFrom(ctx); }
	}

	public final InsertIntoContext insertInto() throws RecognitionException {
		InsertIntoContext _localctx = new InsertIntoContext(_ctx, getState());
		enterRule(_localctx, 26, RULE_insertInto);
		int _la;
		try {
			setState(1103);
			_errHandler.sync(this);
			switch ( getInterpreter().adaptivePredict(_input,122,_ctx) ) {
			case 1:
				_localctx = new InsertOverwriteTableContext(_localctx);
				enterOuterAlt(_localctx, 1);
				{
				setState(1055);
				match(INSERT);
				setState(1056);
				match(OVERWRITE);
				setState(1057);
				match(TABLE);
				setState(1058);
				tableIdentifier();
				setState(1065);
				_errHandler.sync(this);
				_la = _input.LA(1);
				if (_la==PARTITION) {
					{
					setState(1059);
					partitionSpec();
					setState(1063);
					_errHandler.sync(this);
					_la = _input.LA(1);
					if (_la==IF) {
						{
						setState(1060);
						match(IF);
						setState(1061);
						match(NOT);
						setState(1062);
						match(EXISTS);
						}
					}

					}
				}

				}
				break;
			case 2:
				_localctx = new InsertIntoTableContext(_localctx);
				enterOuterAlt(_localctx, 2);
				{
				setState(1067);
				match(INSERT);
				setState(1068);
				match(INTO);
				setState(1070);
				_errHandler.sync(this);
				switch ( getInterpreter().adaptivePredict(_input,114,_ctx) ) {
				case 1:
					{
					setState(1069);
					match(TABLE);
					}
					break;
				}
				setState(1072);
				tableIdentifier();
				setState(1074);
				_errHandler.sync(this);
				_la = _input.LA(1);
				if (_la==PARTITION) {
					{
					setState(1073);
					partitionSpec();
					}
				}

				}
				break;
			case 3:
				_localctx = new InsertOverwriteHiveDirContext(_localctx);
				enterOuterAlt(_localctx, 3);
				{
				setState(1076);
				match(INSERT);
				setState(1077);
				match(OVERWRITE);
				setState(1079);
				_errHandler.sync(this);
				_la = _input.LA(1);
				if (_la==LOCAL) {
					{
					setState(1078);
					match(LOCAL);
					}
				}

				setState(1081);
				match(DIRECTORY);
				setState(1082);
				((InsertOverwriteHiveDirContext)_localctx).path = match(STRING);
				setState(1084);
				_errHandler.sync(this);
				_la = _input.LA(1);
				if (_la==ROW) {
					{
					setState(1083);
					rowFormat();
					}
				}

				setState(1087);
				_errHandler.sync(this);
				_la = _input.LA(1);
				if (_la==STORED) {
					{
					setState(1086);
					createFileFormat();
					}
				}

				}
				break;
			case 4:
				_localctx = new InsertOverwriteDirContext(_localctx);
				enterOuterAlt(_localctx, 4);
				{
				setState(1089);
				match(INSERT);
				setState(1090);
				match(OVERWRITE);
				setState(1092);
				_errHandler.sync(this);
				_la = _input.LA(1);
				if (_la==LOCAL) {
					{
					setState(1091);
					match(LOCAL);
					}
				}

				setState(1094);
				match(DIRECTORY);
				setState(1096);
				_errHandler.sync(this);
				_la = _input.LA(1);
				if (_la==STRING) {
					{
					setState(1095);
					((InsertOverwriteDirContext)_localctx).path = match(STRING);
					}
				}

				setState(1098);
				tableProvider();
				setState(1101);
				_errHandler.sync(this);
				_la = _input.LA(1);
				if (_la==OPTIONS) {
					{
					setState(1099);
					match(OPTIONS);
					setState(1100);
					((InsertOverwriteDirContext)_localctx).options = tablePropertyList();
					}
				}

				}
				break;
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static class PartitionSpecLocationContext extends ParserRuleContext {
		public PartitionSpecContext partitionSpec() {
			return getRuleContext(PartitionSpecContext.class,0);
		}
		public LocationSpecContext locationSpec() {
			return getRuleContext(LocationSpecContext.class,0);
		}
		public PartitionSpecLocationContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_partitionSpecLocation; }
	}

	public final PartitionSpecLocationContext partitionSpecLocation() throws RecognitionException {
		PartitionSpecLocationContext _localctx = new PartitionSpecLocationContext(_ctx, getState());
		enterRule(_localctx, 28, RULE_partitionSpecLocation);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(1105);
			partitionSpec();
			setState(1107);
			_errHandler.sync(this);
			_la = _input.LA(1);
			if (_la==LOCATION) {
				{
				setState(1106);
				locationSpec();
				}
			}

			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static class PartitionSpecContext extends ParserRuleContext {
		public TerminalNode PARTITION() { return getToken(sparkParser.PARTITION, 0); }
		public List<PartitionValContext> partitionVal() {
			return getRuleContexts(PartitionValContext.class);
		}
		public PartitionValContext partitionVal(int i) {
			return getRuleContext(PartitionValContext.class,i);
		}
		public PartitionSpecContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_partitionSpec; }
	}

	public final PartitionSpecContext partitionSpec() throws RecognitionException {
		PartitionSpecContext _localctx = new PartitionSpecContext(_ctx, getState());
		enterRule(_localctx, 30, RULE_partitionSpec);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(1109);
			match(PARTITION);
			setState(1110);
			match(T__0);
			setState(1111);
			partitionVal();
			setState(1116);
			_errHandler.sync(this);
			_la = _input.LA(1);
			while (_la==T__2) {
				{
				{
				setState(1112);
				match(T__2);
				setState(1113);
				partitionVal();
				}
				}
				setState(1118);
				_errHandler.sync(this);
				_la = _input.LA(1);
			}
			setState(1119);
			match(T__1);
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static class PartitionValContext extends ParserRuleContext {
		public IdentifierContext identifier() {
			return getRuleContext(IdentifierContext.class,0);
		}
		public TerminalNode EQ() { return getToken(sparkParser.EQ, 0); }
		public ConstantContext constant() {
			return getRuleContext(ConstantContext.class,0);
		}
		public PartitionValContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_partitionVal; }
	}

	public final PartitionValContext partitionVal() throws RecognitionException {
		PartitionValContext _localctx = new PartitionValContext(_ctx, getState());
		enterRule(_localctx, 32, RULE_partitionVal);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(1121);
			identifier();
			setState(1124);
			_errHandler.sync(this);
			_la = _input.LA(1);
			if (_la==EQ) {
				{
				setState(1122);
				match(EQ);
				setState(1123);
				constant();
				}
			}

			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static class DescribeFuncNameContext extends ParserRuleContext {
		public QualifiedNameContext qualifiedName() {
			return getRuleContext(QualifiedNameContext.class,0);
		}
		public TerminalNode STRING() { return getToken(sparkParser.STRING, 0); }
		public ComparisonOperatorContext comparisonOperator() {
			return getRuleContext(ComparisonOperatorContext.class,0);
		}
		public ArithmeticOperatorContext arithmeticOperator() {
			return getRuleContext(ArithmeticOperatorContext.class,0);
		}
		public PredicateOperatorContext predicateOperator() {
			return getRuleContext(PredicateOperatorContext.class,0);
		}
		public DescribeFuncNameContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_describeFuncName; }
	}

	public final DescribeFuncNameContext describeFuncName() throws RecognitionException {
		DescribeFuncNameContext _localctx = new DescribeFuncNameContext(_ctx, getState());
		enterRule(_localctx, 34, RULE_describeFuncName);
		try {
			setState(1131);
			_errHandler.sync(this);
			switch ( getInterpreter().adaptivePredict(_input,126,_ctx) ) {
			case 1:
				enterOuterAlt(_localctx, 1);
				{
				setState(1126);
				qualifiedName();
				}
				break;
			case 2:
				enterOuterAlt(_localctx, 2);
				{
				setState(1127);
				match(STRING);
				}
				break;
			case 3:
				enterOuterAlt(_localctx, 3);
				{
				setState(1128);
				comparisonOperator();
				}
				break;
			case 4:
				enterOuterAlt(_localctx, 4);
				{
				setState(1129);
				arithmeticOperator();
				}
				break;
			case 5:
				enterOuterAlt(_localctx, 5);
				{
				setState(1130);
				predicateOperator();
				}
				break;
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static class DescribeColNameContext extends ParserRuleContext {
		public IdentifierContext identifier;
		public List<IdentifierContext> nameParts = new ArrayList<IdentifierContext>();
		public List<IdentifierContext> identifier() {
			return getRuleContexts(IdentifierContext.class);
		}
		public IdentifierContext identifier(int i) {
			return getRuleContext(IdentifierContext.class,i);
		}
		public DescribeColNameContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_describeColName; }
	}

	public final DescribeColNameContext describeColName() throws RecognitionException {
		DescribeColNameContext _localctx = new DescribeColNameContext(_ctx, getState());
		enterRule(_localctx, 36, RULE_describeColName);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(1133);
			((DescribeColNameContext)_localctx).identifier = identifier();
			((DescribeColNameContext)_localctx).nameParts.add(((DescribeColNameContext)_localctx).identifier);
			setState(1138);
			_errHandler.sync(this);
			_la = _input.LA(1);
			while (_la==T__3) {
				{
				{
				setState(1134);
				match(T__3);
				setState(1135);
				((DescribeColNameContext)_localctx).identifier = identifier();
				((DescribeColNameContext)_localctx).nameParts.add(((DescribeColNameContext)_localctx).identifier);
				}
				}
				setState(1140);
				_errHandler.sync(this);
				_la = _input.LA(1);
			}
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static class CtesContext extends ParserRuleContext {
		public TerminalNode WITH() { return getToken(sparkParser.WITH, 0); }
		public List<NamedQueryContext> namedQuery() {
			return getRuleContexts(NamedQueryContext.class);
		}
		public NamedQueryContext namedQuery(int i) {
			return getRuleContext(NamedQueryContext.class,i);
		}
		public CtesContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_ctes; }
	}

	public final CtesContext ctes() throws RecognitionException {
		CtesContext _localctx = new CtesContext(_ctx, getState());
		enterRule(_localctx, 38, RULE_ctes);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(1141);
			match(WITH);
			setState(1142);
			namedQuery();
			setState(1147);
			_errHandler.sync(this);
			_la = _input.LA(1);
			while (_la==T__2) {
				{
				{
				setState(1143);
				match(T__2);
				setState(1144);
				namedQuery();
				}
				}
				setState(1149);
				_errHandler.sync(this);
				_la = _input.LA(1);
			}
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static class NamedQueryContext extends ParserRuleContext {
		public IdentifierContext name;
		public QueryContext query() {
			return getRuleContext(QueryContext.class,0);
		}
		public IdentifierContext identifier() {
			return getRuleContext(IdentifierContext.class,0);
		}
		public TerminalNode AS() { return getToken(sparkParser.AS, 0); }
		public NamedQueryContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_namedQuery; }
	}

	public final NamedQueryContext namedQuery() throws RecognitionException {
		NamedQueryContext _localctx = new NamedQueryContext(_ctx, getState());
		enterRule(_localctx, 40, RULE_namedQuery);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(1150);
			((NamedQueryContext)_localctx).name = identifier();
			setState(1152);
			_errHandler.sync(this);
			_la = _input.LA(1);
			if (_la==AS) {
				{
				setState(1151);
				match(AS);
				}
			}

			setState(1154);
			match(T__0);
			setState(1155);
			query();
			setState(1156);
			match(T__1);
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static class TableProviderContext extends ParserRuleContext {
		public TerminalNode USING() { return getToken(sparkParser.USING, 0); }
		public QualifiedNameContext qualifiedName() {
			return getRuleContext(QualifiedNameContext.class,0);
		}
		public TableProviderContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_tableProvider; }
	}

	public final TableProviderContext tableProvider() throws RecognitionException {
		TableProviderContext _localctx = new TableProviderContext(_ctx, getState());
		enterRule(_localctx, 42, RULE_tableProvider);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(1158);
			match(USING);
			setState(1159);
			qualifiedName();
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static class TablePropertyListContext extends ParserRuleContext {
		public List<TablePropertyContext> tableProperty() {
			return getRuleContexts(TablePropertyContext.class);
		}
		public TablePropertyContext tableProperty(int i) {
			return getRuleContext(TablePropertyContext.class,i);
		}
		public TablePropertyListContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_tablePropertyList; }
	}

	public final TablePropertyListContext tablePropertyList() throws RecognitionException {
		TablePropertyListContext _localctx = new TablePropertyListContext(_ctx, getState());
		enterRule(_localctx, 44, RULE_tablePropertyList);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(1161);
			match(T__0);
			setState(1162);
			tableProperty();
			setState(1167);
			_errHandler.sync(this);
			_la = _input.LA(1);
			while (_la==T__2) {
				{
				{
				setState(1163);
				match(T__2);
				setState(1164);
				tableProperty();
				}
				}
				setState(1169);
				_errHandler.sync(this);
				_la = _input.LA(1);
			}
			setState(1170);
			match(T__1);
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static class TablePropertyContext extends ParserRuleContext {
		public TablePropertyKeyContext key;
		public TablePropertyValueContext value;
		public TablePropertyKeyContext tablePropertyKey() {
			return getRuleContext(TablePropertyKeyContext.class,0);
		}
		public TablePropertyValueContext tablePropertyValue() {
			return getRuleContext(TablePropertyValueContext.class,0);
		}
		public TerminalNode EQ() { return getToken(sparkParser.EQ, 0); }
		public TablePropertyContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_tableProperty; }
	}

	public final TablePropertyContext tableProperty() throws RecognitionException {
		TablePropertyContext _localctx = new TablePropertyContext(_ctx, getState());
		enterRule(_localctx, 46, RULE_tableProperty);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(1172);
			((TablePropertyContext)_localctx).key = tablePropertyKey();
			setState(1177);
			_errHandler.sync(this);
			_la = _input.LA(1);
			if (_la==TRUE || _la==FALSE || _la==EQ || ((((_la - 240)) & ~0x3f) == 0 && ((1L << (_la - 240)) & ((1L << (STRING - 240)) | (1L << (INTEGER_VALUE - 240)) | (1L << (DECIMAL_VALUE - 240)))) != 0)) {
				{
				setState(1174);
				_errHandler.sync(this);
				_la = _input.LA(1);
				if (_la==EQ) {
					{
					setState(1173);
					match(EQ);
					}
				}

				setState(1176);
				((TablePropertyContext)_localctx).value = tablePropertyValue();
				}
			}

			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static class TablePropertyKeyContext extends ParserRuleContext {
		public List<IdentifierContext> identifier() {
			return getRuleContexts(IdentifierContext.class);
		}
		public IdentifierContext identifier(int i) {
			return getRuleContext(IdentifierContext.class,i);
		}
		public TerminalNode STRING() { return getToken(sparkParser.STRING, 0); }
		public TablePropertyKeyContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_tablePropertyKey; }
	}

	public final TablePropertyKeyContext tablePropertyKey() throws RecognitionException {
		TablePropertyKeyContext _localctx = new TablePropertyKeyContext(_ctx, getState());
		enterRule(_localctx, 48, RULE_tablePropertyKey);
		int _la;
		try {
			setState(1188);
			_errHandler.sync(this);
			switch (_input.LA(1)) {
			case SELECT:
			case FROM:
			case ADD:
			case AS:
			case ALL:
			case ANY:
			case DISTINCT:
			case WHERE:
			case GROUP:
			case BY:
			case GROUPING:
			case SETS:
			case CUBE:
			case ROLLUP:
			case ORDER:
			case HAVING:
			case LIMIT:
			case AT:
			case OR:
			case AND:
			case IN:
			case NOT:
			case NO:
			case EXISTS:
			case BETWEEN:
			case LIKE:
			case RLIKE:
			case IS:
			case NULL:
			case TRUE:
			case FALSE:
			case NULLS:
			case ASC:
			case DESC:
			case FOR:
			case INTERVAL:
			case CASE:
			case WHEN:
			case THEN:
			case ELSE:
			case END:
			case JOIN:
			case CROSS:
			case OUTER:
			case INNER:
			case LEFT:
			case SEMI:
			case RIGHT:
			case FULL:
			case NATURAL:
			case ON:
			case PIVOT:
			case LATERAL:
			case WINDOW:
			case OVER:
			case PARTITION:
			case RANGE:
			case ROWS:
			case UNBOUNDED:
			case PRECEDING:
			case FOLLOWING:
			case CURRENT:
			case FIRST:
			case AFTER:
			case LAST:
			case ROW:
			case WITH:
			case VALUES:
			case CREATE:
			case TABLE:
			case DIRECTORY:
			case VIEW:
			case REPLACE:
			case INSERT:
			case DELETE:
			case INTO:
			case DESCRIBE:
			case EXPLAIN:
			case FORMAT:
			case LOGICAL:
			case CODEGEN:
			case COST:
			case CAST:
			case SHOW:
			case TABLES:
			case COLUMNS:
			case COLUMN:
			case USE:
			case PARTITIONS:
			case FUNCTIONS:
			case DROP:
			case UNION:
			case EXCEPT:
			case SETMINUS:
			case INTERSECT:
			case TO:
			case TABLESAMPLE:
			case STRATIFY:
			case ALTER:
			case RENAME:
			case ARRAY:
			case MAP:
			case STRUCT:
			case COMMENT:
			case SET:
			case RESET:
			case DATA:
			case START:
			case TRANSACTION:
			case COMMIT:
			case ROLLBACK:
			case MACRO:
			case IGNORE:
			case BOTH:
			case LEADING:
			case TRAILING:
			case IF:
			case POSITION:
			case EXTRACT:
			case DIV:
			case PERCENTLIT:
			case BUCKET:
			case OUT:
			case OF:
			case SORT:
			case CLUSTER:
			case DISTRIBUTE:
			case OVERWRITE:
			case TRANSFORM:
			case REDUCE:
			case SERDE:
			case SERDEPROPERTIES:
			case RECORDREADER:
			case RECORDWRITER:
			case DELIMITED:
			case FIELDS:
			case TERMINATED:
			case COLLECTION:
			case ITEMS:
			case KEYS:
			case ESCAPED:
			case LINES:
			case SEPARATED:
			case FUNCTION:
			case EXTENDED:
			case REFRESH:
			case CLEAR:
			case CACHE:
			case UNCACHE:
			case LAZY:
			case FORMATTED:
			case GLOBAL:
			case TEMPORARY:
			case OPTIONS:
			case UNSET:
			case TBLPROPERTIES:
			case DBPROPERTIES:
			case BUCKETS:
			case SKEWED:
			case STORED:
			case DIRECTORIES:
			case LOCATION:
			case EXCHANGE:
			case ARCHIVE:
			case UNARCHIVE:
			case FILEFORMAT:
			case TOUCH:
			case COMPACT:
			case CONCATENATE:
			case CHANGE:
			case CASCADE:
			case RESTRICT:
			case CLUSTERED:
			case SORTED:
			case PURGE:
			case INPUTFORMAT:
			case OUTPUTFORMAT:
			case DATABASE:
			case DATABASES:
			case DFS:
			case TRUNCATE:
			case ANALYZE:
			case COMPUTE:
			case LIST:
			case STATISTICS:
			case PARTITIONED:
			case EXTERNAL:
			case DEFINED:
			case REVOKE:
			case GRANT:
			case LOCK:
			case UNLOCK:
			case MSCK:
			case REPAIR:
			case RECOVER:
			case EXPORT:
			case IMPORT:
			case LOAD:
			case ROLE:
			case ROLES:
			case COMPACTIONS:
			case PRINCIPALS:
			case TRANSACTIONS:
			case INDEX:
			case INDEXES:
			case LOCKS:
			case OPTION:
			case ANTI:
			case LOCAL:
			case INPATH:
			case IDENTIFIER:
			case BACKQUOTED_IDENTIFIER:
				enterOuterAlt(_localctx, 1);
				{
				setState(1179);
				identifier();
				setState(1184);
				_errHandler.sync(this);
				_la = _input.LA(1);
				while (_la==T__3) {
					{
					{
					setState(1180);
					match(T__3);
					setState(1181);
					identifier();
					}
					}
					setState(1186);
					_errHandler.sync(this);
					_la = _input.LA(1);
				}
				}
				break;
			case STRING:
				enterOuterAlt(_localctx, 2);
				{
				setState(1187);
				match(STRING);
				}
				break;
			default:
				throw new NoViableAltException(this);
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static class TablePropertyValueContext extends ParserRuleContext {
		public TerminalNode INTEGER_VALUE() { return getToken(sparkParser.INTEGER_VALUE, 0); }
		public TerminalNode DECIMAL_VALUE() { return getToken(sparkParser.DECIMAL_VALUE, 0); }
		public BooleanValueContext booleanValue() {
			return getRuleContext(BooleanValueContext.class,0);
		}
		public TerminalNode STRING() { return getToken(sparkParser.STRING, 0); }
		public TablePropertyValueContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_tablePropertyValue; }
	}

	public final TablePropertyValueContext tablePropertyValue() throws RecognitionException {
		TablePropertyValueContext _localctx = new TablePropertyValueContext(_ctx, getState());
		enterRule(_localctx, 50, RULE_tablePropertyValue);
		try {
			setState(1194);
			_errHandler.sync(this);
			switch (_input.LA(1)) {
			case INTEGER_VALUE:
				enterOuterAlt(_localctx, 1);
				{
				setState(1190);
				match(INTEGER_VALUE);
				}
				break;
			case DECIMAL_VALUE:
				enterOuterAlt(_localctx, 2);
				{
				setState(1191);
				match(DECIMAL_VALUE);
				}
				break;
			case TRUE:
			case FALSE:
				enterOuterAlt(_localctx, 3);
				{
				setState(1192);
				booleanValue();
				}
				break;
			case STRING:
				enterOuterAlt(_localctx, 4);
				{
				setState(1193);
				match(STRING);
				}
				break;
			default:
				throw new NoViableAltException(this);
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static class ConstantListContext extends ParserRuleContext {
		public List<ConstantContext> constant() {
			return getRuleContexts(ConstantContext.class);
		}
		public ConstantContext constant(int i) {
			return getRuleContext(ConstantContext.class,i);
		}
		public ConstantListContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_constantList; }
	}

	public final ConstantListContext constantList() throws RecognitionException {
		ConstantListContext _localctx = new ConstantListContext(_ctx, getState());
		enterRule(_localctx, 52, RULE_constantList);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(1196);
			match(T__0);
			setState(1197);
			constant();
			setState(1202);
			_errHandler.sync(this);
			_la = _input.LA(1);
			while (_la==T__2) {
				{
				{
				setState(1198);
				match(T__2);
				setState(1199);
				constant();
				}
				}
				setState(1204);
				_errHandler.sync(this);
				_la = _input.LA(1);
			}
			setState(1205);
			match(T__1);
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static class NestedConstantListContext extends ParserRuleContext {
		public List<ConstantListContext> constantList() {
			return getRuleContexts(ConstantListContext.class);
		}
		public ConstantListContext constantList(int i) {
			return getRuleContext(ConstantListContext.class,i);
		}
		public NestedConstantListContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_nestedConstantList; }
	}

	public final NestedConstantListContext nestedConstantList() throws RecognitionException {
		NestedConstantListContext _localctx = new NestedConstantListContext(_ctx, getState());
		enterRule(_localctx, 54, RULE_nestedConstantList);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(1207);
			match(T__0);
			setState(1208);
			constantList();
			setState(1213);
			_errHandler.sync(this);
			_la = _input.LA(1);
			while (_la==T__2) {
				{
				{
				setState(1209);
				match(T__2);
				setState(1210);
				constantList();
				}
				}
				setState(1215);
				_errHandler.sync(this);
				_la = _input.LA(1);
			}
			setState(1216);
			match(T__1);
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static class CreateFileFormatContext extends ParserRuleContext {
		public TerminalNode STORED() { return getToken(sparkParser.STORED, 0); }
		public TerminalNode AS() { return getToken(sparkParser.AS, 0); }
		public FileFormatContext fileFormat() {
			return getRuleContext(FileFormatContext.class,0);
		}
		public TerminalNode BY() { return getToken(sparkParser.BY, 0); }
		public StorageHandlerContext storageHandler() {
			return getRuleContext(StorageHandlerContext.class,0);
		}
		public CreateFileFormatContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_createFileFormat; }
	}

	public final CreateFileFormatContext createFileFormat() throws RecognitionException {
		CreateFileFormatContext _localctx = new CreateFileFormatContext(_ctx, getState());
		enterRule(_localctx, 56, RULE_createFileFormat);
		try {
			setState(1224);
			_errHandler.sync(this);
			switch ( getInterpreter().adaptivePredict(_input,138,_ctx) ) {
			case 1:
				enterOuterAlt(_localctx, 1);
				{
				setState(1218);
				match(STORED);
				setState(1219);
				match(AS);
				setState(1220);
				fileFormat();
				}
				break;
			case 2:
				enterOuterAlt(_localctx, 2);
				{
				setState(1221);
				match(STORED);
				setState(1222);
				match(BY);
				setState(1223);
				storageHandler();
				}
				break;
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static class FileFormatContext extends ParserRuleContext {
		public FileFormatContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_fileFormat; }
	 
		public FileFormatContext() { }
		public void copyFrom(FileFormatContext ctx) {
			super.copyFrom(ctx);
		}
	}
	public static class TableFileFormatContext extends FileFormatContext {
		public Token inFmt;
		public Token outFmt;
		public TerminalNode INPUTFORMAT() { return getToken(sparkParser.INPUTFORMAT, 0); }
		public TerminalNode OUTPUTFORMAT() { return getToken(sparkParser.OUTPUTFORMAT, 0); }
		public List<TerminalNode> STRING() { return getTokens(sparkParser.STRING); }
		public TerminalNode STRING(int i) {
			return getToken(sparkParser.STRING, i);
		}
		public TableFileFormatContext(FileFormatContext ctx) { copyFrom(ctx); }
	}
	public static class GenericFileFormatContext extends FileFormatContext {
		public IdentifierContext identifier() {
			return getRuleContext(IdentifierContext.class,0);
		}
		public GenericFileFormatContext(FileFormatContext ctx) { copyFrom(ctx); }
	}

	public final FileFormatContext fileFormat() throws RecognitionException {
		FileFormatContext _localctx = new FileFormatContext(_ctx, getState());
		enterRule(_localctx, 58, RULE_fileFormat);
		try {
			setState(1231);
			_errHandler.sync(this);
			switch ( getInterpreter().adaptivePredict(_input,139,_ctx) ) {
			case 1:
				_localctx = new TableFileFormatContext(_localctx);
				enterOuterAlt(_localctx, 1);
				{
				setState(1226);
				match(INPUTFORMAT);
				setState(1227);
				((TableFileFormatContext)_localctx).inFmt = match(STRING);
				setState(1228);
				match(OUTPUTFORMAT);
				setState(1229);
				((TableFileFormatContext)_localctx).outFmt = match(STRING);
				}
				break;
			case 2:
				_localctx = new GenericFileFormatContext(_localctx);
				enterOuterAlt(_localctx, 2);
				{
				setState(1230);
				identifier();
				}
				break;
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static class StorageHandlerContext extends ParserRuleContext {
		public TerminalNode STRING() { return getToken(sparkParser.STRING, 0); }
		public TerminalNode WITH() { return getToken(sparkParser.WITH, 0); }
		public TerminalNode SERDEPROPERTIES() { return getToken(sparkParser.SERDEPROPERTIES, 0); }
		public TablePropertyListContext tablePropertyList() {
			return getRuleContext(TablePropertyListContext.class,0);
		}
		public StorageHandlerContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_storageHandler; }
	}

	public final StorageHandlerContext storageHandler() throws RecognitionException {
		StorageHandlerContext _localctx = new StorageHandlerContext(_ctx, getState());
		enterRule(_localctx, 60, RULE_storageHandler);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(1233);
			match(STRING);
			setState(1237);
			_errHandler.sync(this);
			switch ( getInterpreter().adaptivePredict(_input,140,_ctx) ) {
			case 1:
				{
				setState(1234);
				match(WITH);
				setState(1235);
				match(SERDEPROPERTIES);
				setState(1236);
				tablePropertyList();
				}
				break;
			}
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static class ResourceContext extends ParserRuleContext {
		public IdentifierContext identifier() {
			return getRuleContext(IdentifierContext.class,0);
		}
		public TerminalNode STRING() { return getToken(sparkParser.STRING, 0); }
		public ResourceContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_resource; }
	}

	public final ResourceContext resource() throws RecognitionException {
		ResourceContext _localctx = new ResourceContext(_ctx, getState());
		enterRule(_localctx, 62, RULE_resource);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(1239);
			identifier();
			setState(1240);
			match(STRING);
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static class QueryNoWithContext extends ParserRuleContext {
		public QueryNoWithContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_queryNoWith; }
	 
		public QueryNoWithContext() { }
		public void copyFrom(QueryNoWithContext ctx) {
			super.copyFrom(ctx);
		}
	}
	public static class SingleInsertQueryContext extends QueryNoWithContext {
		public QueryTermContext queryTerm() {
			return getRuleContext(QueryTermContext.class,0);
		}
		public QueryOrganizationContext queryOrganization() {
			return getRuleContext(QueryOrganizationContext.class,0);
		}
		public InsertIntoContext insertInto() {
			return getRuleContext(InsertIntoContext.class,0);
		}
		public SingleInsertQueryContext(QueryNoWithContext ctx) { copyFrom(ctx); }
	}
	public static class MultiInsertQueryContext extends QueryNoWithContext {
		public FromClauseContext fromClause() {
			return getRuleContext(FromClauseContext.class,0);
		}
		public List<MultiInsertQueryBodyContext> multiInsertQueryBody() {
			return getRuleContexts(MultiInsertQueryBodyContext.class);
		}
		public MultiInsertQueryBodyContext multiInsertQueryBody(int i) {
			return getRuleContext(MultiInsertQueryBodyContext.class,i);
		}
		public MultiInsertQueryContext(QueryNoWithContext ctx) { copyFrom(ctx); }
	}

	public final QueryNoWithContext queryNoWith() throws RecognitionException {
		QueryNoWithContext _localctx = new QueryNoWithContext(_ctx, getState());
		enterRule(_localctx, 64, RULE_queryNoWith);
		int _la;
		try {
			setState(1254);
			_errHandler.sync(this);
			switch ( getInterpreter().adaptivePredict(_input,143,_ctx) ) {
			case 1:
				_localctx = new SingleInsertQueryContext(_localctx);
				enterOuterAlt(_localctx, 1);
				{
				setState(1243);
				_errHandler.sync(this);
				_la = _input.LA(1);
				if (_la==INSERT) {
					{
					setState(1242);
					insertInto();
					}
				}

				setState(1245);
				queryTerm(0);
				setState(1246);
				queryOrganization();
				}
				break;
			case 2:
				_localctx = new MultiInsertQueryContext(_localctx);
				enterOuterAlt(_localctx, 2);
				{
				setState(1248);
				fromClause();
				setState(1250); 
				_errHandler.sync(this);
				_la = _input.LA(1);
				do {
					{
					{
					setState(1249);
					multiInsertQueryBody();
					}
					}
					setState(1252); 
					_errHandler.sync(this);
					_la = _input.LA(1);
				} while ( _la==SELECT || _la==FROM || _la==INSERT || _la==MAP || _la==REDUCE );
				}
				break;
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static class QueryOrganizationContext extends ParserRuleContext {
		public SortItemContext sortItem;
		public List<SortItemContext> order = new ArrayList<SortItemContext>();
		public ExpressionContext expression;
		public List<ExpressionContext> clusterBy = new ArrayList<ExpressionContext>();
		public List<ExpressionContext> distributeBy = new ArrayList<ExpressionContext>();
		public List<SortItemContext> sort = new ArrayList<SortItemContext>();
		public ExpressionContext limit;
		public TerminalNode ORDER() { return getToken(sparkParser.ORDER, 0); }
		public List<TerminalNode> BY() { return getTokens(sparkParser.BY); }
		public TerminalNode BY(int i) {
			return getToken(sparkParser.BY, i);
		}
		public TerminalNode CLUSTER() { return getToken(sparkParser.CLUSTER, 0); }
		public TerminalNode DISTRIBUTE() { return getToken(sparkParser.DISTRIBUTE, 0); }
		public TerminalNode SORT() { return getToken(sparkParser.SORT, 0); }
		public WindowsContext windows() {
			return getRuleContext(WindowsContext.class,0);
		}
		public TerminalNode LIMIT() { return getToken(sparkParser.LIMIT, 0); }
		public List<SortItemContext> sortItem() {
			return getRuleContexts(SortItemContext.class);
		}
		public SortItemContext sortItem(int i) {
			return getRuleContext(SortItemContext.class,i);
		}
		public List<ExpressionContext> expression() {
			return getRuleContexts(ExpressionContext.class);
		}
		public ExpressionContext expression(int i) {
			return getRuleContext(ExpressionContext.class,i);
		}
		public TerminalNode ALL() { return getToken(sparkParser.ALL, 0); }
		public QueryOrganizationContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_queryOrganization; }
	}

	public final QueryOrganizationContext queryOrganization() throws RecognitionException {
		QueryOrganizationContext _localctx = new QueryOrganizationContext(_ctx, getState());
		enterRule(_localctx, 66, RULE_queryOrganization);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(1266);
			_errHandler.sync(this);
			_la = _input.LA(1);
			if (_la==ORDER) {
				{
				setState(1256);
				match(ORDER);
				setState(1257);
				match(BY);
				setState(1258);
				((QueryOrganizationContext)_localctx).sortItem = sortItem();
				((QueryOrganizationContext)_localctx).order.add(((QueryOrganizationContext)_localctx).sortItem);
				setState(1263);
				_errHandler.sync(this);
				_la = _input.LA(1);
				while (_la==T__2) {
					{
					{
					setState(1259);
					match(T__2);
					setState(1260);
					((QueryOrganizationContext)_localctx).sortItem = sortItem();
					((QueryOrganizationContext)_localctx).order.add(((QueryOrganizationContext)_localctx).sortItem);
					}
					}
					setState(1265);
					_errHandler.sync(this);
					_la = _input.LA(1);
				}
				}
			}

			setState(1278);
			_errHandler.sync(this);
			_la = _input.LA(1);
			if (_la==CLUSTER) {
				{
				setState(1268);
				match(CLUSTER);
				setState(1269);
				match(BY);
				setState(1270);
				((QueryOrganizationContext)_localctx).expression = expression();
				((QueryOrganizationContext)_localctx).clusterBy.add(((QueryOrganizationContext)_localctx).expression);
				setState(1275);
				_errHandler.sync(this);
				_la = _input.LA(1);
				while (_la==T__2) {
					{
					{
					setState(1271);
					match(T__2);
					setState(1272);
					((QueryOrganizationContext)_localctx).expression = expression();
					((QueryOrganizationContext)_localctx).clusterBy.add(((QueryOrganizationContext)_localctx).expression);
					}
					}
					setState(1277);
					_errHandler.sync(this);
					_la = _input.LA(1);
				}
				}
			}

			setState(1290);
			_errHandler.sync(this);
			_la = _input.LA(1);
			if (_la==DISTRIBUTE) {
				{
				setState(1280);
				match(DISTRIBUTE);
				setState(1281);
				match(BY);
				setState(1282);
				((QueryOrganizationContext)_localctx).expression = expression();
				((QueryOrganizationContext)_localctx).distributeBy.add(((QueryOrganizationContext)_localctx).expression);
				setState(1287);
				_errHandler.sync(this);
				_la = _input.LA(1);
				while (_la==T__2) {
					{
					{
					setState(1283);
					match(T__2);
					setState(1284);
					((QueryOrganizationContext)_localctx).expression = expression();
					((QueryOrganizationContext)_localctx).distributeBy.add(((QueryOrganizationContext)_localctx).expression);
					}
					}
					setState(1289);
					_errHandler.sync(this);
					_la = _input.LA(1);
				}
				}
			}

			setState(1302);
			_errHandler.sync(this);
			_la = _input.LA(1);
			if (_la==SORT) {
				{
				setState(1292);
				match(SORT);
				setState(1293);
				match(BY);
				setState(1294);
				((QueryOrganizationContext)_localctx).sortItem = sortItem();
				((QueryOrganizationContext)_localctx).sort.add(((QueryOrganizationContext)_localctx).sortItem);
				setState(1299);
				_errHandler.sync(this);
				_la = _input.LA(1);
				while (_la==T__2) {
					{
					{
					setState(1295);
					match(T__2);
					setState(1296);
					((QueryOrganizationContext)_localctx).sortItem = sortItem();
					((QueryOrganizationContext)_localctx).sort.add(((QueryOrganizationContext)_localctx).sortItem);
					}
					}
					setState(1301);
					_errHandler.sync(this);
					_la = _input.LA(1);
				}
				}
			}

			setState(1305);
			_errHandler.sync(this);
			_la = _input.LA(1);
			if (_la==WINDOW) {
				{
				setState(1304);
				windows();
				}
			}

			setState(1312);
			_errHandler.sync(this);
			_la = _input.LA(1);
			if (_la==LIMIT) {
				{
				setState(1307);
				match(LIMIT);
				setState(1310);
				_errHandler.sync(this);
				switch ( getInterpreter().adaptivePredict(_input,153,_ctx) ) {
				case 1:
					{
					setState(1308);
					match(ALL);
					}
					break;
				case 2:
					{
					setState(1309);
					((QueryOrganizationContext)_localctx).limit = expression();
					}
					break;
				}
				}
			}

			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static class MultiInsertQueryBodyContext extends ParserRuleContext {
		public QuerySpecificationContext querySpecification() {
			return getRuleContext(QuerySpecificationContext.class,0);
		}
		public QueryOrganizationContext queryOrganization() {
			return getRuleContext(QueryOrganizationContext.class,0);
		}
		public InsertIntoContext insertInto() {
			return getRuleContext(InsertIntoContext.class,0);
		}
		public MultiInsertQueryBodyContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_multiInsertQueryBody; }
	}

	public final MultiInsertQueryBodyContext multiInsertQueryBody() throws RecognitionException {
		MultiInsertQueryBodyContext _localctx = new MultiInsertQueryBodyContext(_ctx, getState());
		enterRule(_localctx, 68, RULE_multiInsertQueryBody);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(1315);
			_errHandler.sync(this);
			_la = _input.LA(1);
			if (_la==INSERT) {
				{
				setState(1314);
				insertInto();
				}
			}

			setState(1317);
			querySpecification();
			setState(1318);
			queryOrganization();
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static class QueryTermContext extends ParserRuleContext {
		public QueryTermContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_queryTerm; }
	 
		public QueryTermContext() { }
		public void copyFrom(QueryTermContext ctx) {
			super.copyFrom(ctx);
		}
	}
	public static class QueryTermDefaultContext extends QueryTermContext {
		public QueryPrimaryContext queryPrimary() {
			return getRuleContext(QueryPrimaryContext.class,0);
		}
		public QueryTermDefaultContext(QueryTermContext ctx) { copyFrom(ctx); }
	}
	public static class SetOperationContext extends QueryTermContext {
		public QueryTermContext left;
		public Token operator;
		public QueryTermContext right;
		public List<QueryTermContext> queryTerm() {
			return getRuleContexts(QueryTermContext.class);
		}
		public QueryTermContext queryTerm(int i) {
			return getRuleContext(QueryTermContext.class,i);
		}
		public TerminalNode INTERSECT() { return getToken(sparkParser.INTERSECT, 0); }
		public TerminalNode UNION() { return getToken(sparkParser.UNION, 0); }
		public TerminalNode EXCEPT() { return getToken(sparkParser.EXCEPT, 0); }
		public TerminalNode SETMINUS() { return getToken(sparkParser.SETMINUS, 0); }
		public SetQuantifierContext setQuantifier() {
			return getRuleContext(SetQuantifierContext.class,0);
		}
		public SetOperationContext(QueryTermContext ctx) { copyFrom(ctx); }
	}

	public final QueryTermContext queryTerm() throws RecognitionException {
		return queryTerm(0);
	}

	private QueryTermContext queryTerm(int _p) throws RecognitionException {
		ParserRuleContext _parentctx = _ctx;
		int _parentState = getState();
		QueryTermContext _localctx = new QueryTermContext(_ctx, _parentState);
		QueryTermContext _prevctx = _localctx;
		int _startState = 70;
		enterRecursionRule(_localctx, 70, RULE_queryTerm, _p);
		int _la;
		try {
			int _alt;
			enterOuterAlt(_localctx, 1);
			{
			{
			_localctx = new QueryTermDefaultContext(_localctx);
			_ctx = _localctx;
			_prevctx = _localctx;

			setState(1321);
			queryPrimary();
			}
			_ctx.stop = _input.LT(-1);
			setState(1346);
			_errHandler.sync(this);
			_alt = getInterpreter().adaptivePredict(_input,160,_ctx);
			while ( _alt!=2 && _alt!=org.antlr.v4.runtime.atn.ATN.INVALID_ALT_NUMBER ) {
				if ( _alt==1 ) {
					if ( _parseListeners!=null ) triggerExitRuleEvent();
					_prevctx = _localctx;
					{
					setState(1344);
					_errHandler.sync(this);
					switch ( getInterpreter().adaptivePredict(_input,159,_ctx) ) {
					case 1:
						{
						_localctx = new SetOperationContext(new QueryTermContext(_parentctx, _parentState));
						((SetOperationContext)_localctx).left = _prevctx;
						pushNewRecursionContext(_localctx, _startState, RULE_queryTerm);
						setState(1323);
						if (!(precpred(_ctx, 3))) throw new FailedPredicateException(this, "precpred(_ctx, 3)");
						setState(1324);
						if (!(this.legacy_setops_precedence_enbled)) throw new FailedPredicateException(this, "this.legacy_setops_precedence_enbled");
						setState(1325);
						((SetOperationContext)_localctx).operator = _input.LT(1);
						_la = _input.LA(1);
						if ( !(((((_la - 102)) & ~0x3f) == 0 && ((1L << (_la - 102)) & ((1L << (UNION - 102)) | (1L << (EXCEPT - 102)) | (1L << (SETMINUS - 102)) | (1L << (INTERSECT - 102)))) != 0)) ) {
							((SetOperationContext)_localctx).operator = (Token)_errHandler.recoverInline(this);
						}
						else {
							if ( _input.LA(1)==Token.EOF ) matchedEOF = true;
							_errHandler.reportMatch(this);
							consume();
						}
						setState(1327);
						_errHandler.sync(this);
						_la = _input.LA(1);
						if (_la==ALL || _la==DISTINCT) {
							{
							setState(1326);
							setQuantifier();
							}
						}

						setState(1329);
						((SetOperationContext)_localctx).right = queryTerm(4);
						}
						break;
					case 2:
						{
						_localctx = new SetOperationContext(new QueryTermContext(_parentctx, _parentState));
						((SetOperationContext)_localctx).left = _prevctx;
						pushNewRecursionContext(_localctx, _startState, RULE_queryTerm);
						setState(1330);
						if (!(precpred(_ctx, 2))) throw new FailedPredicateException(this, "precpred(_ctx, 2)");
						setState(1331);
						if (!(!this.legacy_setops_precedence_enbled)) throw new FailedPredicateException(this, "!this.legacy_setops_precedence_enbled");
						setState(1332);
						((SetOperationContext)_localctx).operator = match(INTERSECT);
						setState(1334);
						_errHandler.sync(this);
						_la = _input.LA(1);
						if (_la==ALL || _la==DISTINCT) {
							{
							setState(1333);
							setQuantifier();
							}
						}

						setState(1336);
						((SetOperationContext)_localctx).right = queryTerm(3);
						}
						break;
					case 3:
						{
						_localctx = new SetOperationContext(new QueryTermContext(_parentctx, _parentState));
						((SetOperationContext)_localctx).left = _prevctx;
						pushNewRecursionContext(_localctx, _startState, RULE_queryTerm);
						setState(1337);
						if (!(precpred(_ctx, 1))) throw new FailedPredicateException(this, "precpred(_ctx, 1)");
						setState(1338);
						if (!(!this.legacy_setops_precedence_enbled)) throw new FailedPredicateException(this, "!this.legacy_setops_precedence_enbled");
						setState(1339);
						((SetOperationContext)_localctx).operator = _input.LT(1);
						_la = _input.LA(1);
						if ( !(((((_la - 102)) & ~0x3f) == 0 && ((1L << (_la - 102)) & ((1L << (UNION - 102)) | (1L << (EXCEPT - 102)) | (1L << (SETMINUS - 102)))) != 0)) ) {
							((SetOperationContext)_localctx).operator = (Token)_errHandler.recoverInline(this);
						}
						else {
							if ( _input.LA(1)==Token.EOF ) matchedEOF = true;
							_errHandler.reportMatch(this);
							consume();
						}
						setState(1341);
						_errHandler.sync(this);
						_la = _input.LA(1);
						if (_la==ALL || _la==DISTINCT) {
							{
							setState(1340);
							setQuantifier();
							}
						}

						setState(1343);
						((SetOperationContext)_localctx).right = queryTerm(2);
						}
						break;
					}
					} 
				}
				setState(1348);
				_errHandler.sync(this);
				_alt = getInterpreter().adaptivePredict(_input,160,_ctx);
			}
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			unrollRecursionContexts(_parentctx);
		}
		return _localctx;
	}

	public static class QueryPrimaryContext extends ParserRuleContext {
		public QueryPrimaryContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_queryPrimary; }
	 
		public QueryPrimaryContext() { }
		public void copyFrom(QueryPrimaryContext ctx) {
			super.copyFrom(ctx);
		}
	}
	public static class SubqueryContext extends QueryPrimaryContext {
		public QueryNoWithContext queryNoWith() {
			return getRuleContext(QueryNoWithContext.class,0);
		}
		public SubqueryContext(QueryPrimaryContext ctx) { copyFrom(ctx); }
	}
	public static class QueryPrimaryDefaultContext extends QueryPrimaryContext {
		public QuerySpecificationContext querySpecification() {
			return getRuleContext(QuerySpecificationContext.class,0);
		}
		public QueryPrimaryDefaultContext(QueryPrimaryContext ctx) { copyFrom(ctx); }
	}
	public static class InlineTableDefault1Context extends QueryPrimaryContext {
		public InlineTableContext inlineTable() {
			return getRuleContext(InlineTableContext.class,0);
		}
		public InlineTableDefault1Context(QueryPrimaryContext ctx) { copyFrom(ctx); }
	}
	public static class TableContext extends QueryPrimaryContext {
		public TerminalNode TABLE() { return getToken(sparkParser.TABLE, 0); }
		public TableIdentifierContext tableIdentifier() {
			return getRuleContext(TableIdentifierContext.class,0);
		}
		public TableContext(QueryPrimaryContext ctx) { copyFrom(ctx); }
	}

	public final QueryPrimaryContext queryPrimary() throws RecognitionException {
		QueryPrimaryContext _localctx = new QueryPrimaryContext(_ctx, getState());
		enterRule(_localctx, 72, RULE_queryPrimary);
		try {
			setState(1357);
			_errHandler.sync(this);
			switch (_input.LA(1)) {
			case SELECT:
			case FROM:
			case MAP:
			case REDUCE:
				_localctx = new QueryPrimaryDefaultContext(_localctx);
				enterOuterAlt(_localctx, 1);
				{
				setState(1349);
				querySpecification();
				}
				break;
			case TABLE:
				_localctx = new TableContext(_localctx);
				enterOuterAlt(_localctx, 2);
				{
				setState(1350);
				match(TABLE);
				setState(1351);
				tableIdentifier();
				}
				break;
			case VALUES:
				_localctx = new InlineTableDefault1Context(_localctx);
				enterOuterAlt(_localctx, 3);
				{
				setState(1352);
				inlineTable();
				}
				break;
			case T__0:
				_localctx = new SubqueryContext(_localctx);
				enterOuterAlt(_localctx, 4);
				{
				setState(1353);
				match(T__0);
				setState(1354);
				queryNoWith();
				setState(1355);
				match(T__1);
				}
				break;
			default:
				throw new NoViableAltException(this);
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static class SortItemContext extends ParserRuleContext {
		public Token ordering;
		public Token nullOrder;
		public ExpressionContext expression() {
			return getRuleContext(ExpressionContext.class,0);
		}
		public TerminalNode NULLS() { return getToken(sparkParser.NULLS, 0); }
		public TerminalNode ASC() { return getToken(sparkParser.ASC, 0); }
		public TerminalNode DESC() { return getToken(sparkParser.DESC, 0); }
		public TerminalNode LAST() { return getToken(sparkParser.LAST, 0); }
		public TerminalNode FIRST() { return getToken(sparkParser.FIRST, 0); }
		public SortItemContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_sortItem; }
	}

	public final SortItemContext sortItem() throws RecognitionException {
		SortItemContext _localctx = new SortItemContext(_ctx, getState());
		enterRule(_localctx, 74, RULE_sortItem);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(1359);
			expression();
			setState(1361);
			_errHandler.sync(this);
			_la = _input.LA(1);
			if (_la==ASC || _la==DESC) {
				{
				setState(1360);
				((SortItemContext)_localctx).ordering = _input.LT(1);
				_la = _input.LA(1);
				if ( !(_la==ASC || _la==DESC) ) {
					((SortItemContext)_localctx).ordering = (Token)_errHandler.recoverInline(this);
				}
				else {
					if ( _input.LA(1)==Token.EOF ) matchedEOF = true;
					_errHandler.reportMatch(this);
					consume();
				}
				}
			}

			setState(1365);
			_errHandler.sync(this);
			_la = _input.LA(1);
			if (_la==NULLS) {
				{
				setState(1363);
				match(NULLS);
				setState(1364);
				((SortItemContext)_localctx).nullOrder = _input.LT(1);
				_la = _input.LA(1);
				if ( !(_la==FIRST || _la==LAST) ) {
					((SortItemContext)_localctx).nullOrder = (Token)_errHandler.recoverInline(this);
				}
				else {
					if ( _input.LA(1)==Token.EOF ) matchedEOF = true;
					_errHandler.reportMatch(this);
					consume();
				}
				}
			}

			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static class QuerySpecificationContext extends ParserRuleContext {
		public Token kind;
		public RowFormatContext inRowFormat;
		public Token recordWriter;
		public Token script;
		public RowFormatContext outRowFormat;
		public Token recordReader;
		public BooleanExpressionContext where;
		public HintContext hint;
		public List<HintContext> hints = new ArrayList<HintContext>();
		public BooleanExpressionContext having;
		public TerminalNode USING() { return getToken(sparkParser.USING, 0); }
		public List<TerminalNode> STRING() { return getTokens(sparkParser.STRING); }
		public TerminalNode STRING(int i) {
			return getToken(sparkParser.STRING, i);
		}
		public TerminalNode RECORDWRITER() { return getToken(sparkParser.RECORDWRITER, 0); }
		public TerminalNode AS() { return getToken(sparkParser.AS, 0); }
		public TerminalNode RECORDREADER() { return getToken(sparkParser.RECORDREADER, 0); }
		public FromClauseContext fromClause() {
			return getRuleContext(FromClauseContext.class,0);
		}
		public TerminalNode WHERE() { return getToken(sparkParser.WHERE, 0); }
		public TerminalNode SELECT() { return getToken(sparkParser.SELECT, 0); }
		public NamedExpressionSeqContext namedExpressionSeq() {
			return getRuleContext(NamedExpressionSeqContext.class,0);
		}
		public List<RowFormatContext> rowFormat() {
			return getRuleContexts(RowFormatContext.class);
		}
		public RowFormatContext rowFormat(int i) {
			return getRuleContext(RowFormatContext.class,i);
		}
		public List<BooleanExpressionContext> booleanExpression() {
			return getRuleContexts(BooleanExpressionContext.class);
		}
		public BooleanExpressionContext booleanExpression(int i) {
			return getRuleContext(BooleanExpressionContext.class,i);
		}
		public TerminalNode TRANSFORM() { return getToken(sparkParser.TRANSFORM, 0); }
		public TerminalNode MAP() { return getToken(sparkParser.MAP, 0); }
		public TerminalNode REDUCE() { return getToken(sparkParser.REDUCE, 0); }
		public IdentifierSeqContext identifierSeq() {
			return getRuleContext(IdentifierSeqContext.class,0);
		}
		public ColTypeListContext colTypeList() {
			return getRuleContext(ColTypeListContext.class,0);
		}
		public List<LateralViewContext> lateralView() {
			return getRuleContexts(LateralViewContext.class);
		}
		public LateralViewContext lateralView(int i) {
			return getRuleContext(LateralViewContext.class,i);
		}
		public AggregationContext aggregation() {
			return getRuleContext(AggregationContext.class,0);
		}
		public TerminalNode HAVING() { return getToken(sparkParser.HAVING, 0); }
		public WindowsContext windows() {
			return getRuleContext(WindowsContext.class,0);
		}
		public SetQuantifierContext setQuantifier() {
			return getRuleContext(SetQuantifierContext.class,0);
		}
		public List<HintContext> hint() {
			return getRuleContexts(HintContext.class);
		}
		public HintContext hint(int i) {
			return getRuleContext(HintContext.class,i);
		}
		public QuerySpecificationContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_querySpecification; }
	}

	public final QuerySpecificationContext querySpecification() throws RecognitionException {
		QuerySpecificationContext _localctx = new QuerySpecificationContext(_ctx, getState());
		enterRule(_localctx, 76, RULE_querySpecification);
		int _la;
		try {
			int _alt;
			setState(1460);
			_errHandler.sync(this);
			switch ( getInterpreter().adaptivePredict(_input,185,_ctx) ) {
			case 1:
				enterOuterAlt(_localctx, 1);
				{
				{
				{
				setState(1377);
				_errHandler.sync(this);
				switch (_input.LA(1)) {
				case SELECT:
					{
					setState(1367);
					match(SELECT);
					setState(1368);
					((QuerySpecificationContext)_localctx).kind = match(TRANSFORM);
					setState(1369);
					match(T__0);
					setState(1370);
					namedExpressionSeq();
					setState(1371);
					match(T__1);
					}
					break;
				case MAP:
					{
					setState(1373);
					((QuerySpecificationContext)_localctx).kind = match(MAP);
					setState(1374);
					namedExpressionSeq();
					}
					break;
				case REDUCE:
					{
					setState(1375);
					((QuerySpecificationContext)_localctx).kind = match(REDUCE);
					setState(1376);
					namedExpressionSeq();
					}
					break;
				default:
					throw new NoViableAltException(this);
				}
				}
				setState(1380);
				_errHandler.sync(this);
				_la = _input.LA(1);
				if (_la==ROW) {
					{
					setState(1379);
					((QuerySpecificationContext)_localctx).inRowFormat = rowFormat();
					}
				}

				setState(1384);
				_errHandler.sync(this);
				_la = _input.LA(1);
				if (_la==RECORDWRITER) {
					{
					setState(1382);
					match(RECORDWRITER);
					setState(1383);
					((QuerySpecificationContext)_localctx).recordWriter = match(STRING);
					}
				}

				setState(1386);
				match(USING);
				setState(1387);
				((QuerySpecificationContext)_localctx).script = match(STRING);
				setState(1400);
				_errHandler.sync(this);
				switch ( getInterpreter().adaptivePredict(_input,169,_ctx) ) {
				case 1:
					{
					setState(1388);
					match(AS);
					setState(1398);
					_errHandler.sync(this);
					switch ( getInterpreter().adaptivePredict(_input,168,_ctx) ) {
					case 1:
						{
						setState(1389);
						identifierSeq();
						}
						break;
					case 2:
						{
						setState(1390);
						colTypeList();
						}
						break;
					case 3:
						{
						{
						setState(1391);
						match(T__0);
						setState(1394);
						_errHandler.sync(this);
						switch ( getInterpreter().adaptivePredict(_input,167,_ctx) ) {
						case 1:
							{
							setState(1392);
							identifierSeq();
							}
							break;
						case 2:
							{
							setState(1393);
							colTypeList();
							}
							break;
						}
						setState(1396);
						match(T__1);
						}
						}
						break;
					}
					}
					break;
				}
				setState(1403);
				_errHandler.sync(this);
				switch ( getInterpreter().adaptivePredict(_input,170,_ctx) ) {
				case 1:
					{
					setState(1402);
					((QuerySpecificationContext)_localctx).outRowFormat = rowFormat();
					}
					break;
				}
				setState(1407);
				_errHandler.sync(this);
				switch ( getInterpreter().adaptivePredict(_input,171,_ctx) ) {
				case 1:
					{
					setState(1405);
					match(RECORDREADER);
					setState(1406);
					((QuerySpecificationContext)_localctx).recordReader = match(STRING);
					}
					break;
				}
				setState(1410);
				_errHandler.sync(this);
				switch ( getInterpreter().adaptivePredict(_input,172,_ctx) ) {
				case 1:
					{
					setState(1409);
					fromClause();
					}
					break;
				}
				setState(1414);
				_errHandler.sync(this);
				switch ( getInterpreter().adaptivePredict(_input,173,_ctx) ) {
				case 1:
					{
					setState(1412);
					match(WHERE);
					setState(1413);
					((QuerySpecificationContext)_localctx).where = booleanExpression(0);
					}
					break;
				}
				}
				}
				break;
			case 2:
				enterOuterAlt(_localctx, 2);
				{
				{
				setState(1438);
				_errHandler.sync(this);
				switch (_input.LA(1)) {
				case SELECT:
					{
					setState(1416);
					((QuerySpecificationContext)_localctx).kind = match(SELECT);
					setState(1420);
					_errHandler.sync(this);
					_la = _input.LA(1);
					while (_la==T__4) {
						{
						{
						setState(1417);
						((QuerySpecificationContext)_localctx).hint = hint();
						((QuerySpecificationContext)_localctx).hints.add(((QuerySpecificationContext)_localctx).hint);
						}
						}
						setState(1422);
						_errHandler.sync(this);
						_la = _input.LA(1);
					}
					setState(1424);
					_errHandler.sync(this);
					switch ( getInterpreter().adaptivePredict(_input,175,_ctx) ) {
					case 1:
						{
						setState(1423);
						setQuantifier();
						}
						break;
					}
					setState(1426);
					namedExpressionSeq();
					setState(1428);
					_errHandler.sync(this);
					switch ( getInterpreter().adaptivePredict(_input,176,_ctx) ) {
					case 1:
						{
						setState(1427);
						fromClause();
						}
						break;
					}
					}
					break;
				case FROM:
					{
					setState(1430);
					fromClause();
					setState(1436);
					_errHandler.sync(this);
					switch ( getInterpreter().adaptivePredict(_input,178,_ctx) ) {
					case 1:
						{
						setState(1431);
						((QuerySpecificationContext)_localctx).kind = match(SELECT);
						setState(1433);
						_errHandler.sync(this);
						switch ( getInterpreter().adaptivePredict(_input,177,_ctx) ) {
						case 1:
							{
							setState(1432);
							setQuantifier();
							}
							break;
						}
						setState(1435);
						namedExpressionSeq();
						}
						break;
					}
					}
					break;
				default:
					throw new NoViableAltException(this);
				}
				setState(1443);
				_errHandler.sync(this);
				_alt = getInterpreter().adaptivePredict(_input,180,_ctx);
				while ( _alt!=2 && _alt!=org.antlr.v4.runtime.atn.ATN.INVALID_ALT_NUMBER ) {
					if ( _alt==1 ) {
						{
						{
						setState(1440);
						lateralView();
						}
						} 
					}
					setState(1445);
					_errHandler.sync(this);
					_alt = getInterpreter().adaptivePredict(_input,180,_ctx);
				}
				setState(1448);
				_errHandler.sync(this);
				switch ( getInterpreter().adaptivePredict(_input,181,_ctx) ) {
				case 1:
					{
					setState(1446);
					match(WHERE);
					setState(1447);
					((QuerySpecificationContext)_localctx).where = booleanExpression(0);
					}
					break;
				}
				setState(1451);
				_errHandler.sync(this);
				switch ( getInterpreter().adaptivePredict(_input,182,_ctx) ) {
				case 1:
					{
					setState(1450);
					aggregation();
					}
					break;
				}
				setState(1455);
				_errHandler.sync(this);
				switch ( getInterpreter().adaptivePredict(_input,183,_ctx) ) {
				case 1:
					{
					setState(1453);
					match(HAVING);
					setState(1454);
					((QuerySpecificationContext)_localctx).having = booleanExpression(0);
					}
					break;
				}
				setState(1458);
				_errHandler.sync(this);
				switch ( getInterpreter().adaptivePredict(_input,184,_ctx) ) {
				case 1:
					{
					setState(1457);
					windows();
					}
					break;
				}
				}
				}
				break;
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static class HintContext extends ParserRuleContext {
		public HintStatementContext hintStatement;
		public List<HintStatementContext> hintStatements = new ArrayList<HintStatementContext>();
		public List<HintStatementContext> hintStatement() {
			return getRuleContexts(HintStatementContext.class);
		}
		public HintStatementContext hintStatement(int i) {
			return getRuleContext(HintStatementContext.class,i);
		}
		public HintContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_hint; }
	}

	public final HintContext hint() throws RecognitionException {
		HintContext _localctx = new HintContext(_ctx, getState());
		enterRule(_localctx, 78, RULE_hint);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(1462);
			match(T__4);
			setState(1463);
			((HintContext)_localctx).hintStatement = hintStatement();
			((HintContext)_localctx).hintStatements.add(((HintContext)_localctx).hintStatement);
			setState(1470);
			_errHandler.sync(this);
			_la = _input.LA(1);
			while ((((_la) & ~0x3f) == 0 && ((1L << _la) & ((1L << T__2) | (1L << SELECT) | (1L << FROM) | (1L << ADD) | (1L << AS) | (1L << ALL) | (1L << ANY) | (1L << DISTINCT) | (1L << WHERE) | (1L << GROUP) | (1L << BY) | (1L << GROUPING) | (1L << SETS) | (1L << CUBE) | (1L << ROLLUP) | (1L << ORDER) | (1L << HAVING) | (1L << LIMIT) | (1L << AT) | (1L << OR) | (1L << AND) | (1L << IN) | (1L << NOT) | (1L << NO) | (1L << EXISTS) | (1L << BETWEEN) | (1L << LIKE) | (1L << RLIKE) | (1L << IS) | (1L << NULL) | (1L << TRUE) | (1L << FALSE) | (1L << NULLS) | (1L << ASC) | (1L << DESC) | (1L << FOR) | (1L << INTERVAL) | (1L << CASE) | (1L << WHEN) | (1L << THEN) | (1L << ELSE) | (1L << END) | (1L << JOIN) | (1L << CROSS) | (1L << OUTER) | (1L << INNER) | (1L << LEFT) | (1L << SEMI) | (1L << RIGHT) | (1L << FULL) | (1L << NATURAL) | (1L << ON) | (1L << PIVOT) | (1L << LATERAL))) != 0) || ((((_la - 64)) & ~0x3f) == 0 && ((1L << (_la - 64)) & ((1L << (WINDOW - 64)) | (1L << (OVER - 64)) | (1L << (PARTITION - 64)) | (1L << (RANGE - 64)) | (1L << (ROWS - 64)) | (1L << (UNBOUNDED - 64)) | (1L << (PRECEDING - 64)) | (1L << (FOLLOWING - 64)) | (1L << (CURRENT - 64)) | (1L << (FIRST - 64)) | (1L << (AFTER - 64)) | (1L << (LAST - 64)) | (1L << (ROW - 64)) | (1L << (WITH - 64)) | (1L << (VALUES - 64)) | (1L << (CREATE - 64)) | (1L << (TABLE - 64)) | (1L << (DIRECTORY - 64)) | (1L << (VIEW - 64)) | (1L << (REPLACE - 64)) | (1L << (INSERT - 64)) | (1L << (DELETE - 64)) | (1L << (INTO - 64)) | (1L << (DESCRIBE - 64)) | (1L << (EXPLAIN - 64)) | (1L << (FORMAT - 64)) | (1L << (LOGICAL - 64)) | (1L << (CODEGEN - 64)) | (1L << (COST - 64)) | (1L << (CAST - 64)) | (1L << (SHOW - 64)) | (1L << (TABLES - 64)) | (1L << (COLUMNS - 64)) | (1L << (COLUMN - 64)) | (1L << (USE - 64)) | (1L << (PARTITIONS - 64)) | (1L << (FUNCTIONS - 64)) | (1L << (DROP - 64)) | (1L << (UNION - 64)) | (1L << (EXCEPT - 64)) | (1L << (SETMINUS - 64)) | (1L << (INTERSECT - 64)) | (1L << (TO - 64)) | (1L << (TABLESAMPLE - 64)) | (1L << (STRATIFY - 64)) | (1L << (ALTER - 64)) | (1L << (RENAME - 64)) | (1L << (ARRAY - 64)) | (1L << (MAP - 64)) | (1L << (STRUCT - 64)) | (1L << (COMMENT - 64)) | (1L << (SET - 64)) | (1L << (RESET - 64)) | (1L << (DATA - 64)) | (1L << (START - 64)) | (1L << (TRANSACTION - 64)) | (1L << (COMMIT - 64)) | (1L << (ROLLBACK - 64)) | (1L << (MACRO - 64)) | (1L << (IGNORE - 64)) | (1L << (BOTH - 64)) | (1L << (LEADING - 64)) | (1L << (TRAILING - 64)) | (1L << (IF - 64)))) != 0) || ((((_la - 128)) & ~0x3f) == 0 && ((1L << (_la - 128)) & ((1L << (POSITION - 128)) | (1L << (EXTRACT - 128)) | (1L << (DIV - 128)) | (1L << (PERCENTLIT - 128)) | (1L << (BUCKET - 128)) | (1L << (OUT - 128)) | (1L << (OF - 128)) | (1L << (SORT - 128)) | (1L << (CLUSTER - 128)) | (1L << (DISTRIBUTE - 128)) | (1L << (OVERWRITE - 128)) | (1L << (TRANSFORM - 128)) | (1L << (REDUCE - 128)) | (1L << (SERDE - 128)) | (1L << (SERDEPROPERTIES - 128)) | (1L << (RECORDREADER - 128)) | (1L << (RECORDWRITER - 128)) | (1L << (DELIMITED - 128)) | (1L << (FIELDS - 128)) | (1L << (TERMINATED - 128)) | (1L << (COLLECTION - 128)) | (1L << (ITEMS - 128)) | (1L << (KEYS - 128)) | (1L << (ESCAPED - 128)) | (1L << (LINES - 128)) | (1L << (SEPARATED - 128)) | (1L << (FUNCTION - 128)) | (1L << (EXTENDED - 128)) | (1L << (REFRESH - 128)) | (1L << (CLEAR - 128)) | (1L << (CACHE - 128)) | (1L << (UNCACHE - 128)) | (1L << (LAZY - 128)) | (1L << (FORMATTED - 128)) | (1L << (GLOBAL - 128)) | (1L << (TEMPORARY - 128)) | (1L << (OPTIONS - 128)) | (1L << (UNSET - 128)) | (1L << (TBLPROPERTIES - 128)) | (1L << (DBPROPERTIES - 128)) | (1L << (BUCKETS - 128)) | (1L << (SKEWED - 128)) | (1L << (STORED - 128)) | (1L << (DIRECTORIES - 128)) | (1L << (LOCATION - 128)))) != 0) || ((((_la - 192)) & ~0x3f) == 0 && ((1L << (_la - 192)) & ((1L << (EXCHANGE - 192)) | (1L << (ARCHIVE - 192)) | (1L << (UNARCHIVE - 192)) | (1L << (FILEFORMAT - 192)) | (1L << (TOUCH - 192)) | (1L << (COMPACT - 192)) | (1L << (CONCATENATE - 192)) | (1L << (CHANGE - 192)) | (1L << (CASCADE - 192)) | (1L << (RESTRICT - 192)) | (1L << (CLUSTERED - 192)) | (1L << (SORTED - 192)) | (1L << (PURGE - 192)) | (1L << (INPUTFORMAT - 192)) | (1L << (OUTPUTFORMAT - 192)) | (1L << (DATABASE - 192)) | (1L << (DATABASES - 192)) | (1L << (DFS - 192)) | (1L << (TRUNCATE - 192)) | (1L << (ANALYZE - 192)) | (1L << (COMPUTE - 192)) | (1L << (LIST - 192)) | (1L << (STATISTICS - 192)) | (1L << (PARTITIONED - 192)) | (1L << (EXTERNAL - 192)) | (1L << (DEFINED - 192)) | (1L << (REVOKE - 192)) | (1L << (GRANT - 192)) | (1L << (LOCK - 192)) | (1L << (UNLOCK - 192)) | (1L << (MSCK - 192)) | (1L << (REPAIR - 192)) | (1L << (RECOVER - 192)) | (1L << (EXPORT - 192)) | (1L << (IMPORT - 192)) | (1L << (LOAD - 192)) | (1L << (ROLE - 192)) | (1L << (ROLES - 192)) | (1L << (COMPACTIONS - 192)) | (1L << (PRINCIPALS - 192)) | (1L << (TRANSACTIONS - 192)) | (1L << (INDEX - 192)) | (1L << (INDEXES - 192)) | (1L << (LOCKS - 192)) | (1L << (OPTION - 192)) | (1L << (ANTI - 192)) | (1L << (LOCAL - 192)) | (1L << (INPATH - 192)) | (1L << (IDENTIFIER - 192)) | (1L << (BACKQUOTED_IDENTIFIER - 192)))) != 0)) {
				{
				{
				setState(1465);
				_errHandler.sync(this);
				_la = _input.LA(1);
				if (_la==T__2) {
					{
					setState(1464);
					match(T__2);
					}
				}

				setState(1467);
				((HintContext)_localctx).hintStatement = hintStatement();
				((HintContext)_localctx).hintStatements.add(((HintContext)_localctx).hintStatement);
				}
				}
				setState(1472);
				_errHandler.sync(this);
				_la = _input.LA(1);
			}
			setState(1473);
			match(T__5);
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static class HintStatementContext extends ParserRuleContext {
		public IdentifierContext hintName;
		public PrimaryExpressionContext primaryExpression;
		public List<PrimaryExpressionContext> parameters = new ArrayList<PrimaryExpressionContext>();
		public IdentifierContext identifier() {
			return getRuleContext(IdentifierContext.class,0);
		}
		public List<PrimaryExpressionContext> primaryExpression() {
			return getRuleContexts(PrimaryExpressionContext.class);
		}
		public PrimaryExpressionContext primaryExpression(int i) {
			return getRuleContext(PrimaryExpressionContext.class,i);
		}
		public HintStatementContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_hintStatement; }
	}

	public final HintStatementContext hintStatement() throws RecognitionException {
		HintStatementContext _localctx = new HintStatementContext(_ctx, getState());
		enterRule(_localctx, 80, RULE_hintStatement);
		int _la;
		try {
			setState(1488);
			_errHandler.sync(this);
			switch ( getInterpreter().adaptivePredict(_input,189,_ctx) ) {
			case 1:
				enterOuterAlt(_localctx, 1);
				{
				setState(1475);
				((HintStatementContext)_localctx).hintName = identifier();
				}
				break;
			case 2:
				enterOuterAlt(_localctx, 2);
				{
				setState(1476);
				((HintStatementContext)_localctx).hintName = identifier();
				setState(1477);
				match(T__0);
				setState(1478);
				((HintStatementContext)_localctx).primaryExpression = primaryExpression(0);
				((HintStatementContext)_localctx).parameters.add(((HintStatementContext)_localctx).primaryExpression);
				setState(1483);
				_errHandler.sync(this);
				_la = _input.LA(1);
				while (_la==T__2) {
					{
					{
					setState(1479);
					match(T__2);
					setState(1480);
					((HintStatementContext)_localctx).primaryExpression = primaryExpression(0);
					((HintStatementContext)_localctx).parameters.add(((HintStatementContext)_localctx).primaryExpression);
					}
					}
					setState(1485);
					_errHandler.sync(this);
					_la = _input.LA(1);
				}
				setState(1486);
				match(T__1);
				}
				break;
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static class FromClauseContext extends ParserRuleContext {
		public TerminalNode FROM() { return getToken(sparkParser.FROM, 0); }
		public List<RelationContext> relation() {
			return getRuleContexts(RelationContext.class);
		}
		public RelationContext relation(int i) {
			return getRuleContext(RelationContext.class,i);
		}
		public List<LateralViewContext> lateralView() {
			return getRuleContexts(LateralViewContext.class);
		}
		public LateralViewContext lateralView(int i) {
			return getRuleContext(LateralViewContext.class,i);
		}
		public PivotClauseContext pivotClause() {
			return getRuleContext(PivotClauseContext.class,0);
		}
		public FromClauseContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_fromClause; }
	}

	public final FromClauseContext fromClause() throws RecognitionException {
		FromClauseContext _localctx = new FromClauseContext(_ctx, getState());
		enterRule(_localctx, 82, RULE_fromClause);
		try {
			int _alt;
			enterOuterAlt(_localctx, 1);
			{
			setState(1490);
			match(FROM);
			setState(1491);
			relation();
			setState(1496);
			_errHandler.sync(this);
			_alt = getInterpreter().adaptivePredict(_input,190,_ctx);
			while ( _alt!=2 && _alt!=org.antlr.v4.runtime.atn.ATN.INVALID_ALT_NUMBER ) {
				if ( _alt==1 ) {
					{
					{
					setState(1492);
					match(T__2);
					setState(1493);
					relation();
					}
					} 
				}
				setState(1498);
				_errHandler.sync(this);
				_alt = getInterpreter().adaptivePredict(_input,190,_ctx);
			}
			setState(1502);
			_errHandler.sync(this);
			_alt = getInterpreter().adaptivePredict(_input,191,_ctx);
			while ( _alt!=2 && _alt!=org.antlr.v4.runtime.atn.ATN.INVALID_ALT_NUMBER ) {
				if ( _alt==1 ) {
					{
					{
					setState(1499);
					lateralView();
					}
					} 
				}
				setState(1504);
				_errHandler.sync(this);
				_alt = getInterpreter().adaptivePredict(_input,191,_ctx);
			}
			setState(1506);
			_errHandler.sync(this);
			switch ( getInterpreter().adaptivePredict(_input,192,_ctx) ) {
			case 1:
				{
				setState(1505);
				pivotClause();
				}
				break;
			}
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static class AggregationContext extends ParserRuleContext {
		public ExpressionContext expression;
		public List<ExpressionContext> groupingExpressions = new ArrayList<ExpressionContext>();
		public Token kind;
		public TerminalNode GROUP() { return getToken(sparkParser.GROUP, 0); }
		public TerminalNode BY() { return getToken(sparkParser.BY, 0); }
		public List<ExpressionContext> expression() {
			return getRuleContexts(ExpressionContext.class);
		}
		public ExpressionContext expression(int i) {
			return getRuleContext(ExpressionContext.class,i);
		}
		public TerminalNode WITH() { return getToken(sparkParser.WITH, 0); }
		public TerminalNode SETS() { return getToken(sparkParser.SETS, 0); }
		public List<GroupingSetContext> groupingSet() {
			return getRuleContexts(GroupingSetContext.class);
		}
		public GroupingSetContext groupingSet(int i) {
			return getRuleContext(GroupingSetContext.class,i);
		}
		public TerminalNode ROLLUP() { return getToken(sparkParser.ROLLUP, 0); }
		public TerminalNode CUBE() { return getToken(sparkParser.CUBE, 0); }
		public TerminalNode GROUPING() { return getToken(sparkParser.GROUPING, 0); }
		public AggregationContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_aggregation; }
	}

	public final AggregationContext aggregation() throws RecognitionException {
		AggregationContext _localctx = new AggregationContext(_ctx, getState());
		enterRule(_localctx, 84, RULE_aggregation);
		int _la;
		try {
			int _alt;
			setState(1552);
			_errHandler.sync(this);
			switch ( getInterpreter().adaptivePredict(_input,197,_ctx) ) {
			case 1:
				enterOuterAlt(_localctx, 1);
				{
				setState(1508);
				match(GROUP);
				setState(1509);
				match(BY);
				setState(1510);
				((AggregationContext)_localctx).expression = expression();
				((AggregationContext)_localctx).groupingExpressions.add(((AggregationContext)_localctx).expression);
				setState(1515);
				_errHandler.sync(this);
				_alt = getInterpreter().adaptivePredict(_input,193,_ctx);
				while ( _alt!=2 && _alt!=org.antlr.v4.runtime.atn.ATN.INVALID_ALT_NUMBER ) {
					if ( _alt==1 ) {
						{
						{
						setState(1511);
						match(T__2);
						setState(1512);
						((AggregationContext)_localctx).expression = expression();
						((AggregationContext)_localctx).groupingExpressions.add(((AggregationContext)_localctx).expression);
						}
						} 
					}
					setState(1517);
					_errHandler.sync(this);
					_alt = getInterpreter().adaptivePredict(_input,193,_ctx);
				}
				setState(1535);
				_errHandler.sync(this);
				switch ( getInterpreter().adaptivePredict(_input,195,_ctx) ) {
				case 1:
					{
					setState(1518);
					match(WITH);
					setState(1519);
					((AggregationContext)_localctx).kind = match(ROLLUP);
					}
					break;
				case 2:
					{
					setState(1520);
					match(WITH);
					setState(1521);
					((AggregationContext)_localctx).kind = match(CUBE);
					}
					break;
				case 3:
					{
					setState(1522);
					((AggregationContext)_localctx).kind = match(GROUPING);
					setState(1523);
					match(SETS);
					setState(1524);
					match(T__0);
					setState(1525);
					groupingSet();
					setState(1530);
					_errHandler.sync(this);
					_la = _input.LA(1);
					while (_la==T__2) {
						{
						{
						setState(1526);
						match(T__2);
						setState(1527);
						groupingSet();
						}
						}
						setState(1532);
						_errHandler.sync(this);
						_la = _input.LA(1);
					}
					setState(1533);
					match(T__1);
					}
					break;
				}
				}
				break;
			case 2:
				enterOuterAlt(_localctx, 2);
				{
				setState(1537);
				match(GROUP);
				setState(1538);
				match(BY);
				setState(1539);
				((AggregationContext)_localctx).kind = match(GROUPING);
				setState(1540);
				match(SETS);
				setState(1541);
				match(T__0);
				setState(1542);
				groupingSet();
				setState(1547);
				_errHandler.sync(this);
				_la = _input.LA(1);
				while (_la==T__2) {
					{
					{
					setState(1543);
					match(T__2);
					setState(1544);
					groupingSet();
					}
					}
					setState(1549);
					_errHandler.sync(this);
					_la = _input.LA(1);
				}
				setState(1550);
				match(T__1);
				}
				break;
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static class GroupingSetContext extends ParserRuleContext {
		public List<ExpressionContext> expression() {
			return getRuleContexts(ExpressionContext.class);
		}
		public ExpressionContext expression(int i) {
			return getRuleContext(ExpressionContext.class,i);
		}
		public GroupingSetContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_groupingSet; }
	}

	public final GroupingSetContext groupingSet() throws RecognitionException {
		GroupingSetContext _localctx = new GroupingSetContext(_ctx, getState());
		enterRule(_localctx, 86, RULE_groupingSet);
		int _la;
		try {
			setState(1567);
			_errHandler.sync(this);
			switch ( getInterpreter().adaptivePredict(_input,200,_ctx) ) {
			case 1:
				enterOuterAlt(_localctx, 1);
				{
				setState(1554);
				match(T__0);
				setState(1563);
				_errHandler.sync(this);
				_la = _input.LA(1);
				if ((((_la) & ~0x3f) == 0 && ((1L << _la) & ((1L << T__0) | (1L << SELECT) | (1L << FROM) | (1L << ADD) | (1L << AS) | (1L << ALL) | (1L << ANY) | (1L << DISTINCT) | (1L << WHERE) | (1L << GROUP) | (1L << BY) | (1L << GROUPING) | (1L << SETS) | (1L << CUBE) | (1L << ROLLUP) | (1L << ORDER) | (1L << HAVING) | (1L << LIMIT) | (1L << AT) | (1L << OR) | (1L << AND) | (1L << IN) | (1L << NOT) | (1L << NO) | (1L << EXISTS) | (1L << BETWEEN) | (1L << LIKE) | (1L << RLIKE) | (1L << IS) | (1L << NULL) | (1L << TRUE) | (1L << FALSE) | (1L << NULLS) | (1L << ASC) | (1L << DESC) | (1L << FOR) | (1L << INTERVAL) | (1L << CASE) | (1L << WHEN) | (1L << THEN) | (1L << ELSE) | (1L << END) | (1L << JOIN) | (1L << CROSS) | (1L << OUTER) | (1L << INNER) | (1L << LEFT) | (1L << SEMI) | (1L << RIGHT) | (1L << FULL) | (1L << NATURAL) | (1L << ON) | (1L << PIVOT) | (1L << LATERAL))) != 0) || ((((_la - 64)) & ~0x3f) == 0 && ((1L << (_la - 64)) & ((1L << (WINDOW - 64)) | (1L << (OVER - 64)) | (1L << (PARTITION - 64)) | (1L << (RANGE - 64)) | (1L << (ROWS - 64)) | (1L << (UNBOUNDED - 64)) | (1L << (PRECEDING - 64)) | (1L << (FOLLOWING - 64)) | (1L << (CURRENT - 64)) | (1L << (FIRST - 64)) | (1L << (AFTER - 64)) | (1L << (LAST - 64)) | (1L << (ROW - 64)) | (1L << (WITH - 64)) | (1L << (VALUES - 64)) | (1L << (CREATE - 64)) | (1L << (TABLE - 64)) | (1L << (DIRECTORY - 64)) | (1L << (VIEW - 64)) | (1L << (REPLACE - 64)) | (1L << (INSERT - 64)) | (1L << (DELETE - 64)) | (1L << (INTO - 64)) | (1L << (DESCRIBE - 64)) | (1L << (EXPLAIN - 64)) | (1L << (FORMAT - 64)) | (1L << (LOGICAL - 64)) | (1L << (CODEGEN - 64)) | (1L << (COST - 64)) | (1L << (CAST - 64)) | (1L << (SHOW - 64)) | (1L << (TABLES - 64)) | (1L << (COLUMNS - 64)) | (1L << (COLUMN - 64)) | (1L << (USE - 64)) | (1L << (PARTITIONS - 64)) | (1L << (FUNCTIONS - 64)) | (1L << (DROP - 64)) | (1L << (UNION - 64)) | (1L << (EXCEPT - 64)) | (1L << (SETMINUS - 64)) | (1L << (INTERSECT - 64)) | (1L << (TO - 64)) | (1L << (TABLESAMPLE - 64)) | (1L << (STRATIFY - 64)) | (1L << (ALTER - 64)) | (1L << (RENAME - 64)) | (1L << (ARRAY - 64)) | (1L << (MAP - 64)) | (1L << (STRUCT - 64)) | (1L << (COMMENT - 64)) | (1L << (SET - 64)) | (1L << (RESET - 64)) | (1L << (DATA - 64)) | (1L << (START - 64)) | (1L << (TRANSACTION - 64)) | (1L << (COMMIT - 64)) | (1L << (ROLLBACK - 64)) | (1L << (MACRO - 64)) | (1L << (IGNORE - 64)) | (1L << (BOTH - 64)) | (1L << (LEADING - 64)) | (1L << (TRAILING - 64)) | (1L << (IF - 64)))) != 0) || ((((_la - 128)) & ~0x3f) == 0 && ((1L << (_la - 128)) & ((1L << (POSITION - 128)) | (1L << (EXTRACT - 128)) | (1L << (PLUS - 128)) | (1L << (MINUS - 128)) | (1L << (ASTERISK - 128)) | (1L << (DIV - 128)) | (1L << (TILDE - 128)) | (1L << (PERCENTLIT - 128)) | (1L << (BUCKET - 128)) | (1L << (OUT - 128)) | (1L << (OF - 128)) | (1L << (SORT - 128)) | (1L << (CLUSTER - 128)) | (1L << (DISTRIBUTE - 128)) | (1L << (OVERWRITE - 128)) | (1L << (TRANSFORM - 128)) | (1L << (REDUCE - 128)) | (1L << (SERDE - 128)) | (1L << (SERDEPROPERTIES - 128)) | (1L << (RECORDREADER - 128)) | (1L << (RECORDWRITER - 128)) | (1L << (DELIMITED - 128)) | (1L << (FIELDS - 128)) | (1L << (TERMINATED - 128)) | (1L << (COLLECTION - 128)) | (1L << (ITEMS - 128)) | (1L << (KEYS - 128)) | (1L << (ESCAPED - 128)) | (1L << (LINES - 128)) | (1L << (SEPARATED - 128)) | (1L << (FUNCTION - 128)) | (1L << (EXTENDED - 128)) | (1L << (REFRESH - 128)) | (1L << (CLEAR - 128)) | (1L << (CACHE - 128)) | (1L << (UNCACHE - 128)) | (1L << (LAZY - 128)) | (1L << (FORMATTED - 128)) | (1L << (GLOBAL - 128)) | (1L << (TEMPORARY - 128)) | (1L << (OPTIONS - 128)) | (1L << (UNSET - 128)) | (1L << (TBLPROPERTIES - 128)) | (1L << (DBPROPERTIES - 128)) | (1L << (BUCKETS - 128)) | (1L << (SKEWED - 128)) | (1L << (STORED - 128)) | (1L << (DIRECTORIES - 128)) | (1L << (LOCATION - 128)))) != 0) || ((((_la - 192)) & ~0x3f) == 0 && ((1L << (_la - 192)) & ((1L << (EXCHANGE - 192)) | (1L << (ARCHIVE - 192)) | (1L << (UNARCHIVE - 192)) | (1L << (FILEFORMAT - 192)) | (1L << (TOUCH - 192)) | (1L << (COMPACT - 192)) | (1L << (CONCATENATE - 192)) | (1L << (CHANGE - 192)) | (1L << (CASCADE - 192)) | (1L << (RESTRICT - 192)) | (1L << (CLUSTERED - 192)) | (1L << (SORTED - 192)) | (1L << (PURGE - 192)) | (1L << (INPUTFORMAT - 192)) | (1L << (OUTPUTFORMAT - 192)) | (1L << (DATABASE - 192)) | (1L << (DATABASES - 192)) | (1L << (DFS - 192)) | (1L << (TRUNCATE - 192)) | (1L << (ANALYZE - 192)) | (1L << (COMPUTE - 192)) | (1L << (LIST - 192)) | (1L << (STATISTICS - 192)) | (1L << (PARTITIONED - 192)) | (1L << (EXTERNAL - 192)) | (1L << (DEFINED - 192)) | (1L << (REVOKE - 192)) | (1L << (GRANT - 192)) | (1L << (LOCK - 192)) | (1L << (UNLOCK - 192)) | (1L << (MSCK - 192)) | (1L << (REPAIR - 192)) | (1L << (RECOVER - 192)) | (1L << (EXPORT - 192)) | (1L << (IMPORT - 192)) | (1L << (LOAD - 192)) | (1L << (ROLE - 192)) | (1L << (ROLES - 192)) | (1L << (COMPACTIONS - 192)) | (1L << (PRINCIPALS - 192)) | (1L << (TRANSACTIONS - 192)) | (1L << (INDEX - 192)) | (1L << (INDEXES - 192)) | (1L << (LOCKS - 192)) | (1L << (OPTION - 192)) | (1L << (ANTI - 192)) | (1L << (LOCAL - 192)) | (1L << (INPATH - 192)) | (1L << (STRING - 192)) | (1L << (BIGINT_LITERAL - 192)) | (1L << (SMALLINT_LITERAL - 192)) | (1L << (TINYINT_LITERAL - 192)) | (1L << (INTEGER_VALUE - 192)) | (1L << (DECIMAL_VALUE - 192)) | (1L << (DOUBLE_LITERAL - 192)) | (1L << (BIGDECIMAL_LITERAL - 192)) | (1L << (IDENTIFIER - 192)) | (1L << (BACKQUOTED_IDENTIFIER - 192)))) != 0)) {
					{
					setState(1555);
					expression();
					setState(1560);
					_errHandler.sync(this);
					_la = _input.LA(1);
					while (_la==T__2) {
						{
						{
						setState(1556);
						match(T__2);
						setState(1557);
						expression();
						}
						}
						setState(1562);
						_errHandler.sync(this);
						_la = _input.LA(1);
					}
					}
				}

				setState(1565);
				match(T__1);
				}
				break;
			case 2:
				enterOuterAlt(_localctx, 2);
				{
				setState(1566);
				expression();
				}
				break;
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static class PivotClauseContext extends ParserRuleContext {
		public NamedExpressionSeqContext aggregates;
		public PivotValueContext pivotValue;
		public List<PivotValueContext> pivotValues = new ArrayList<PivotValueContext>();
		public TerminalNode PIVOT() { return getToken(sparkParser.PIVOT, 0); }
		public TerminalNode FOR() { return getToken(sparkParser.FOR, 0); }
		public PivotColumnContext pivotColumn() {
			return getRuleContext(PivotColumnContext.class,0);
		}
		public TerminalNode IN() { return getToken(sparkParser.IN, 0); }
		public NamedExpressionSeqContext namedExpressionSeq() {
			return getRuleContext(NamedExpressionSeqContext.class,0);
		}
		public List<PivotValueContext> pivotValue() {
			return getRuleContexts(PivotValueContext.class);
		}
		public PivotValueContext pivotValue(int i) {
			return getRuleContext(PivotValueContext.class,i);
		}
		public PivotClauseContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_pivotClause; }
	}

	public final PivotClauseContext pivotClause() throws RecognitionException {
		PivotClauseContext _localctx = new PivotClauseContext(_ctx, getState());
		enterRule(_localctx, 88, RULE_pivotClause);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(1569);
			match(PIVOT);
			setState(1570);
			match(T__0);
			setState(1571);
			((PivotClauseContext)_localctx).aggregates = namedExpressionSeq();
			setState(1572);
			match(FOR);
			setState(1573);
			pivotColumn();
			setState(1574);
			match(IN);
			setState(1575);
			match(T__0);
			setState(1576);
			((PivotClauseContext)_localctx).pivotValue = pivotValue();
			((PivotClauseContext)_localctx).pivotValues.add(((PivotClauseContext)_localctx).pivotValue);
			setState(1581);
			_errHandler.sync(this);
			_la = _input.LA(1);
			while (_la==T__2) {
				{
				{
				setState(1577);
				match(T__2);
				setState(1578);
				((PivotClauseContext)_localctx).pivotValue = pivotValue();
				((PivotClauseContext)_localctx).pivotValues.add(((PivotClauseContext)_localctx).pivotValue);
				}
				}
				setState(1583);
				_errHandler.sync(this);
				_la = _input.LA(1);
			}
			setState(1584);
			match(T__1);
			setState(1585);
			match(T__1);
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static class PivotColumnContext extends ParserRuleContext {
		public IdentifierContext identifier;
		public List<IdentifierContext> identifiers = new ArrayList<IdentifierContext>();
		public List<IdentifierContext> identifier() {
			return getRuleContexts(IdentifierContext.class);
		}
		public IdentifierContext identifier(int i) {
			return getRuleContext(IdentifierContext.class,i);
		}
		public PivotColumnContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_pivotColumn; }
	}

	public final PivotColumnContext pivotColumn() throws RecognitionException {
		PivotColumnContext _localctx = new PivotColumnContext(_ctx, getState());
		enterRule(_localctx, 90, RULE_pivotColumn);
		int _la;
		try {
			setState(1599);
			_errHandler.sync(this);
			switch (_input.LA(1)) {
			case SELECT:
			case FROM:
			case ADD:
			case AS:
			case ALL:
			case ANY:
			case DISTINCT:
			case WHERE:
			case GROUP:
			case BY:
			case GROUPING:
			case SETS:
			case CUBE:
			case ROLLUP:
			case ORDER:
			case HAVING:
			case LIMIT:
			case AT:
			case OR:
			case AND:
			case IN:
			case NOT:
			case NO:
			case EXISTS:
			case BETWEEN:
			case LIKE:
			case RLIKE:
			case IS:
			case NULL:
			case TRUE:
			case FALSE:
			case NULLS:
			case ASC:
			case DESC:
			case FOR:
			case INTERVAL:
			case CASE:
			case WHEN:
			case THEN:
			case ELSE:
			case END:
			case JOIN:
			case CROSS:
			case OUTER:
			case INNER:
			case LEFT:
			case SEMI:
			case RIGHT:
			case FULL:
			case NATURAL:
			case ON:
			case PIVOT:
			case LATERAL:
			case WINDOW:
			case OVER:
			case PARTITION:
			case RANGE:
			case ROWS:
			case UNBOUNDED:
			case PRECEDING:
			case FOLLOWING:
			case CURRENT:
			case FIRST:
			case AFTER:
			case LAST:
			case ROW:
			case WITH:
			case VALUES:
			case CREATE:
			case TABLE:
			case DIRECTORY:
			case VIEW:
			case REPLACE:
			case INSERT:
			case DELETE:
			case INTO:
			case DESCRIBE:
			case EXPLAIN:
			case FORMAT:
			case LOGICAL:
			case CODEGEN:
			case COST:
			case CAST:
			case SHOW:
			case TABLES:
			case COLUMNS:
			case COLUMN:
			case USE:
			case PARTITIONS:
			case FUNCTIONS:
			case DROP:
			case UNION:
			case EXCEPT:
			case SETMINUS:
			case INTERSECT:
			case TO:
			case TABLESAMPLE:
			case STRATIFY:
			case ALTER:
			case RENAME:
			case ARRAY:
			case MAP:
			case STRUCT:
			case COMMENT:
			case SET:
			case RESET:
			case DATA:
			case START:
			case TRANSACTION:
			case COMMIT:
			case ROLLBACK:
			case MACRO:
			case IGNORE:
			case BOTH:
			case LEADING:
			case TRAILING:
			case IF:
			case POSITION:
			case EXTRACT:
			case DIV:
			case PERCENTLIT:
			case BUCKET:
			case OUT:
			case OF:
			case SORT:
			case CLUSTER:
			case DISTRIBUTE:
			case OVERWRITE:
			case TRANSFORM:
			case REDUCE:
			case SERDE:
			case SERDEPROPERTIES:
			case RECORDREADER:
			case RECORDWRITER:
			case DELIMITED:
			case FIELDS:
			case TERMINATED:
			case COLLECTION:
			case ITEMS:
			case KEYS:
			case ESCAPED:
			case LINES:
			case SEPARATED:
			case FUNCTION:
			case EXTENDED:
			case REFRESH:
			case CLEAR:
			case CACHE:
			case UNCACHE:
			case LAZY:
			case FORMATTED:
			case GLOBAL:
			case TEMPORARY:
			case OPTIONS:
			case UNSET:
			case TBLPROPERTIES:
			case DBPROPERTIES:
			case BUCKETS:
			case SKEWED:
			case STORED:
			case DIRECTORIES:
			case LOCATION:
			case EXCHANGE:
			case ARCHIVE:
			case UNARCHIVE:
			case FILEFORMAT:
			case TOUCH:
			case COMPACT:
			case CONCATENATE:
			case CHANGE:
			case CASCADE:
			case RESTRICT:
			case CLUSTERED:
			case SORTED:
			case PURGE:
			case INPUTFORMAT:
			case OUTPUTFORMAT:
			case DATABASE:
			case DATABASES:
			case DFS:
			case TRUNCATE:
			case ANALYZE:
			case COMPUTE:
			case LIST:
			case STATISTICS:
			case PARTITIONED:
			case EXTERNAL:
			case DEFINED:
			case REVOKE:
			case GRANT:
			case LOCK:
			case UNLOCK:
			case MSCK:
			case REPAIR:
			case RECOVER:
			case EXPORT:
			case IMPORT:
			case LOAD:
			case ROLE:
			case ROLES:
			case COMPACTIONS:
			case PRINCIPALS:
			case TRANSACTIONS:
			case INDEX:
			case INDEXES:
			case LOCKS:
			case OPTION:
			case ANTI:
			case LOCAL:
			case INPATH:
			case IDENTIFIER:
			case BACKQUOTED_IDENTIFIER:
				enterOuterAlt(_localctx, 1);
				{
				setState(1587);
				((PivotColumnContext)_localctx).identifier = identifier();
				((PivotColumnContext)_localctx).identifiers.add(((PivotColumnContext)_localctx).identifier);
				}
				break;
			case T__0:
				enterOuterAlt(_localctx, 2);
				{
				setState(1588);
				match(T__0);
				setState(1589);
				((PivotColumnContext)_localctx).identifier = identifier();
				((PivotColumnContext)_localctx).identifiers.add(((PivotColumnContext)_localctx).identifier);
				setState(1594);
				_errHandler.sync(this);
				_la = _input.LA(1);
				while (_la==T__2) {
					{
					{
					setState(1590);
					match(T__2);
					setState(1591);
					((PivotColumnContext)_localctx).identifier = identifier();
					((PivotColumnContext)_localctx).identifiers.add(((PivotColumnContext)_localctx).identifier);
					}
					}
					setState(1596);
					_errHandler.sync(this);
					_la = _input.LA(1);
				}
				setState(1597);
				match(T__1);
				}
				break;
			default:
				throw new NoViableAltException(this);
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static class PivotValueContext extends ParserRuleContext {
		public ExpressionContext expression() {
			return getRuleContext(ExpressionContext.class,0);
		}
		public IdentifierContext identifier() {
			return getRuleContext(IdentifierContext.class,0);
		}
		public TerminalNode AS() { return getToken(sparkParser.AS, 0); }
		public PivotValueContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_pivotValue; }
	}

	public final PivotValueContext pivotValue() throws RecognitionException {
		PivotValueContext _localctx = new PivotValueContext(_ctx, getState());
		enterRule(_localctx, 92, RULE_pivotValue);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(1601);
			expression();
			setState(1606);
			_errHandler.sync(this);
			_la = _input.LA(1);
			if ((((_la) & ~0x3f) == 0 && ((1L << _la) & ((1L << SELECT) | (1L << FROM) | (1L << ADD) | (1L << AS) | (1L << ALL) | (1L << ANY) | (1L << DISTINCT) | (1L << WHERE) | (1L << GROUP) | (1L << BY) | (1L << GROUPING) | (1L << SETS) | (1L << CUBE) | (1L << ROLLUP) | (1L << ORDER) | (1L << HAVING) | (1L << LIMIT) | (1L << AT) | (1L << OR) | (1L << AND) | (1L << IN) | (1L << NOT) | (1L << NO) | (1L << EXISTS) | (1L << BETWEEN) | (1L << LIKE) | (1L << RLIKE) | (1L << IS) | (1L << NULL) | (1L << TRUE) | (1L << FALSE) | (1L << NULLS) | (1L << ASC) | (1L << DESC) | (1L << FOR) | (1L << INTERVAL) | (1L << CASE) | (1L << WHEN) | (1L << THEN) | (1L << ELSE) | (1L << END) | (1L << JOIN) | (1L << CROSS) | (1L << OUTER) | (1L << INNER) | (1L << LEFT) | (1L << SEMI) | (1L << RIGHT) | (1L << FULL) | (1L << NATURAL) | (1L << ON) | (1L << PIVOT) | (1L << LATERAL))) != 0) || ((((_la - 64)) & ~0x3f) == 0 && ((1L << (_la - 64)) & ((1L << (WINDOW - 64)) | (1L << (OVER - 64)) | (1L << (PARTITION - 64)) | (1L << (RANGE - 64)) | (1L << (ROWS - 64)) | (1L << (UNBOUNDED - 64)) | (1L << (PRECEDING - 64)) | (1L << (FOLLOWING - 64)) | (1L << (CURRENT - 64)) | (1L << (FIRST - 64)) | (1L << (AFTER - 64)) | (1L << (LAST - 64)) | (1L << (ROW - 64)) | (1L << (WITH - 64)) | (1L << (VALUES - 64)) | (1L << (CREATE - 64)) | (1L << (TABLE - 64)) | (1L << (DIRECTORY - 64)) | (1L << (VIEW - 64)) | (1L << (REPLACE - 64)) | (1L << (INSERT - 64)) | (1L << (DELETE - 64)) | (1L << (INTO - 64)) | (1L << (DESCRIBE - 64)) | (1L << (EXPLAIN - 64)) | (1L << (FORMAT - 64)) | (1L << (LOGICAL - 64)) | (1L << (CODEGEN - 64)) | (1L << (COST - 64)) | (1L << (CAST - 64)) | (1L << (SHOW - 64)) | (1L << (TABLES - 64)) | (1L << (COLUMNS - 64)) | (1L << (COLUMN - 64)) | (1L << (USE - 64)) | (1L << (PARTITIONS - 64)) | (1L << (FUNCTIONS - 64)) | (1L << (DROP - 64)) | (1L << (UNION - 64)) | (1L << (EXCEPT - 64)) | (1L << (SETMINUS - 64)) | (1L << (INTERSECT - 64)) | (1L << (TO - 64)) | (1L << (TABLESAMPLE - 64)) | (1L << (STRATIFY - 64)) | (1L << (ALTER - 64)) | (1L << (RENAME - 64)) | (1L << (ARRAY - 64)) | (1L << (MAP - 64)) | (1L << (STRUCT - 64)) | (1L << (COMMENT - 64)) | (1L << (SET - 64)) | (1L << (RESET - 64)) | (1L << (DATA - 64)) | (1L << (START - 64)) | (1L << (TRANSACTION - 64)) | (1L << (COMMIT - 64)) | (1L << (ROLLBACK - 64)) | (1L << (MACRO - 64)) | (1L << (IGNORE - 64)) | (1L << (BOTH - 64)) | (1L << (LEADING - 64)) | (1L << (TRAILING - 64)) | (1L << (IF - 64)))) != 0) || ((((_la - 128)) & ~0x3f) == 0 && ((1L << (_la - 128)) & ((1L << (POSITION - 128)) | (1L << (EXTRACT - 128)) | (1L << (DIV - 128)) | (1L << (PERCENTLIT - 128)) | (1L << (BUCKET - 128)) | (1L << (OUT - 128)) | (1L << (OF - 128)) | (1L << (SORT - 128)) | (1L << (CLUSTER - 128)) | (1L << (DISTRIBUTE - 128)) | (1L << (OVERWRITE - 128)) | (1L << (TRANSFORM - 128)) | (1L << (REDUCE - 128)) | (1L << (SERDE - 128)) | (1L << (SERDEPROPERTIES - 128)) | (1L << (RECORDREADER - 128)) | (1L << (RECORDWRITER - 128)) | (1L << (DELIMITED - 128)) | (1L << (FIELDS - 128)) | (1L << (TERMINATED - 128)) | (1L << (COLLECTION - 128)) | (1L << (ITEMS - 128)) | (1L << (KEYS - 128)) | (1L << (ESCAPED - 128)) | (1L << (LINES - 128)) | (1L << (SEPARATED - 128)) | (1L << (FUNCTION - 128)) | (1L << (EXTENDED - 128)) | (1L << (REFRESH - 128)) | (1L << (CLEAR - 128)) | (1L << (CACHE - 128)) | (1L << (UNCACHE - 128)) | (1L << (LAZY - 128)) | (1L << (FORMATTED - 128)) | (1L << (GLOBAL - 128)) | (1L << (TEMPORARY - 128)) | (1L << (OPTIONS - 128)) | (1L << (UNSET - 128)) | (1L << (TBLPROPERTIES - 128)) | (1L << (DBPROPERTIES - 128)) | (1L << (BUCKETS - 128)) | (1L << (SKEWED - 128)) | (1L << (STORED - 128)) | (1L << (DIRECTORIES - 128)) | (1L << (LOCATION - 128)))) != 0) || ((((_la - 192)) & ~0x3f) == 0 && ((1L << (_la - 192)) & ((1L << (EXCHANGE - 192)) | (1L << (ARCHIVE - 192)) | (1L << (UNARCHIVE - 192)) | (1L << (FILEFORMAT - 192)) | (1L << (TOUCH - 192)) | (1L << (COMPACT - 192)) | (1L << (CONCATENATE - 192)) | (1L << (CHANGE - 192)) | (1L << (CASCADE - 192)) | (1L << (RESTRICT - 192)) | (1L << (CLUSTERED - 192)) | (1L << (SORTED - 192)) | (1L << (PURGE - 192)) | (1L << (INPUTFORMAT - 192)) | (1L << (OUTPUTFORMAT - 192)) | (1L << (DATABASE - 192)) | (1L << (DATABASES - 192)) | (1L << (DFS - 192)) | (1L << (TRUNCATE - 192)) | (1L << (ANALYZE - 192)) | (1L << (COMPUTE - 192)) | (1L << (LIST - 192)) | (1L << (STATISTICS - 192)) | (1L << (PARTITIONED - 192)) | (1L << (EXTERNAL - 192)) | (1L << (DEFINED - 192)) | (1L << (REVOKE - 192)) | (1L << (GRANT - 192)) | (1L << (LOCK - 192)) | (1L << (UNLOCK - 192)) | (1L << (MSCK - 192)) | (1L << (REPAIR - 192)) | (1L << (RECOVER - 192)) | (1L << (EXPORT - 192)) | (1L << (IMPORT - 192)) | (1L << (LOAD - 192)) | (1L << (ROLE - 192)) | (1L << (ROLES - 192)) | (1L << (COMPACTIONS - 192)) | (1L << (PRINCIPALS - 192)) | (1L << (TRANSACTIONS - 192)) | (1L << (INDEX - 192)) | (1L << (INDEXES - 192)) | (1L << (LOCKS - 192)) | (1L << (OPTION - 192)) | (1L << (ANTI - 192)) | (1L << (LOCAL - 192)) | (1L << (INPATH - 192)) | (1L << (IDENTIFIER - 192)) | (1L << (BACKQUOTED_IDENTIFIER - 192)))) != 0)) {
				{
				setState(1603);
				_errHandler.sync(this);
				switch ( getInterpreter().adaptivePredict(_input,204,_ctx) ) {
				case 1:
					{
					setState(1602);
					match(AS);
					}
					break;
				}
				setState(1605);
				identifier();
				}
			}

			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static class LateralViewContext extends ParserRuleContext {
		public IdentifierContext tblName;
		public IdentifierContext identifier;
		public List<IdentifierContext> colName = new ArrayList<IdentifierContext>();
		public TerminalNode LATERAL() { return getToken(sparkParser.LATERAL, 0); }
		public TerminalNode VIEW() { return getToken(sparkParser.VIEW, 0); }
		public QualifiedNameContext qualifiedName() {
			return getRuleContext(QualifiedNameContext.class,0);
		}
		public List<IdentifierContext> identifier() {
			return getRuleContexts(IdentifierContext.class);
		}
		public IdentifierContext identifier(int i) {
			return getRuleContext(IdentifierContext.class,i);
		}
		public TerminalNode OUTER() { return getToken(sparkParser.OUTER, 0); }
		public List<ExpressionContext> expression() {
			return getRuleContexts(ExpressionContext.class);
		}
		public ExpressionContext expression(int i) {
			return getRuleContext(ExpressionContext.class,i);
		}
		public TerminalNode AS() { return getToken(sparkParser.AS, 0); }
		public LateralViewContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_lateralView; }
	}

	public final LateralViewContext lateralView() throws RecognitionException {
		LateralViewContext _localctx = new LateralViewContext(_ctx, getState());
		enterRule(_localctx, 94, RULE_lateralView);
		int _la;
		try {
			int _alt;
			enterOuterAlt(_localctx, 1);
			{
			setState(1608);
			match(LATERAL);
			setState(1609);
			match(VIEW);
			setState(1611);
			_errHandler.sync(this);
			switch ( getInterpreter().adaptivePredict(_input,206,_ctx) ) {
			case 1:
				{
				setState(1610);
				match(OUTER);
				}
				break;
			}
			setState(1613);
			qualifiedName();
			setState(1614);
			match(T__0);
			setState(1623);
			_errHandler.sync(this);
			_la = _input.LA(1);
			if ((((_la) & ~0x3f) == 0 && ((1L << _la) & ((1L << T__0) | (1L << SELECT) | (1L << FROM) | (1L << ADD) | (1L << AS) | (1L << ALL) | (1L << ANY) | (1L << DISTINCT) | (1L << WHERE) | (1L << GROUP) | (1L << BY) | (1L << GROUPING) | (1L << SETS) | (1L << CUBE) | (1L << ROLLUP) | (1L << ORDER) | (1L << HAVING) | (1L << LIMIT) | (1L << AT) | (1L << OR) | (1L << AND) | (1L << IN) | (1L << NOT) | (1L << NO) | (1L << EXISTS) | (1L << BETWEEN) | (1L << LIKE) | (1L << RLIKE) | (1L << IS) | (1L << NULL) | (1L << TRUE) | (1L << FALSE) | (1L << NULLS) | (1L << ASC) | (1L << DESC) | (1L << FOR) | (1L << INTERVAL) | (1L << CASE) | (1L << WHEN) | (1L << THEN) | (1L << ELSE) | (1L << END) | (1L << JOIN) | (1L << CROSS) | (1L << OUTER) | (1L << INNER) | (1L << LEFT) | (1L << SEMI) | (1L << RIGHT) | (1L << FULL) | (1L << NATURAL) | (1L << ON) | (1L << PIVOT) | (1L << LATERAL))) != 0) || ((((_la - 64)) & ~0x3f) == 0 && ((1L << (_la - 64)) & ((1L << (WINDOW - 64)) | (1L << (OVER - 64)) | (1L << (PARTITION - 64)) | (1L << (RANGE - 64)) | (1L << (ROWS - 64)) | (1L << (UNBOUNDED - 64)) | (1L << (PRECEDING - 64)) | (1L << (FOLLOWING - 64)) | (1L << (CURRENT - 64)) | (1L << (FIRST - 64)) | (1L << (AFTER - 64)) | (1L << (LAST - 64)) | (1L << (ROW - 64)) | (1L << (WITH - 64)) | (1L << (VALUES - 64)) | (1L << (CREATE - 64)) | (1L << (TABLE - 64)) | (1L << (DIRECTORY - 64)) | (1L << (VIEW - 64)) | (1L << (REPLACE - 64)) | (1L << (INSERT - 64)) | (1L << (DELETE - 64)) | (1L << (INTO - 64)) | (1L << (DESCRIBE - 64)) | (1L << (EXPLAIN - 64)) | (1L << (FORMAT - 64)) | (1L << (LOGICAL - 64)) | (1L << (CODEGEN - 64)) | (1L << (COST - 64)) | (1L << (CAST - 64)) | (1L << (SHOW - 64)) | (1L << (TABLES - 64)) | (1L << (COLUMNS - 64)) | (1L << (COLUMN - 64)) | (1L << (USE - 64)) | (1L << (PARTITIONS - 64)) | (1L << (FUNCTIONS - 64)) | (1L << (DROP - 64)) | (1L << (UNION - 64)) | (1L << (EXCEPT - 64)) | (1L << (SETMINUS - 64)) | (1L << (INTERSECT - 64)) | (1L << (TO - 64)) | (1L << (TABLESAMPLE - 64)) | (1L << (STRATIFY - 64)) | (1L << (ALTER - 64)) | (1L << (RENAME - 64)) | (1L << (ARRAY - 64)) | (1L << (MAP - 64)) | (1L << (STRUCT - 64)) | (1L << (COMMENT - 64)) | (1L << (SET - 64)) | (1L << (RESET - 64)) | (1L << (DATA - 64)) | (1L << (START - 64)) | (1L << (TRANSACTION - 64)) | (1L << (COMMIT - 64)) | (1L << (ROLLBACK - 64)) | (1L << (MACRO - 64)) | (1L << (IGNORE - 64)) | (1L << (BOTH - 64)) | (1L << (LEADING - 64)) | (1L << (TRAILING - 64)) | (1L << (IF - 64)))) != 0) || ((((_la - 128)) & ~0x3f) == 0 && ((1L << (_la - 128)) & ((1L << (POSITION - 128)) | (1L << (EXTRACT - 128)) | (1L << (PLUS - 128)) | (1L << (MINUS - 128)) | (1L << (ASTERISK - 128)) | (1L << (DIV - 128)) | (1L << (TILDE - 128)) | (1L << (PERCENTLIT - 128)) | (1L << (BUCKET - 128)) | (1L << (OUT - 128)) | (1L << (OF - 128)) | (1L << (SORT - 128)) | (1L << (CLUSTER - 128)) | (1L << (DISTRIBUTE - 128)) | (1L << (OVERWRITE - 128)) | (1L << (TRANSFORM - 128)) | (1L << (REDUCE - 128)) | (1L << (SERDE - 128)) | (1L << (SERDEPROPERTIES - 128)) | (1L << (RECORDREADER - 128)) | (1L << (RECORDWRITER - 128)) | (1L << (DELIMITED - 128)) | (1L << (FIELDS - 128)) | (1L << (TERMINATED - 128)) | (1L << (COLLECTION - 128)) | (1L << (ITEMS - 128)) | (1L << (KEYS - 128)) | (1L << (ESCAPED - 128)) | (1L << (LINES - 128)) | (1L << (SEPARATED - 128)) | (1L << (FUNCTION - 128)) | (1L << (EXTENDED - 128)) | (1L << (REFRESH - 128)) | (1L << (CLEAR - 128)) | (1L << (CACHE - 128)) | (1L << (UNCACHE - 128)) | (1L << (LAZY - 128)) | (1L << (FORMATTED - 128)) | (1L << (GLOBAL - 128)) | (1L << (TEMPORARY - 128)) | (1L << (OPTIONS - 128)) | (1L << (UNSET - 128)) | (1L << (TBLPROPERTIES - 128)) | (1L << (DBPROPERTIES - 128)) | (1L << (BUCKETS - 128)) | (1L << (SKEWED - 128)) | (1L << (STORED - 128)) | (1L << (DIRECTORIES - 128)) | (1L << (LOCATION - 128)))) != 0) || ((((_la - 192)) & ~0x3f) == 0 && ((1L << (_la - 192)) & ((1L << (EXCHANGE - 192)) | (1L << (ARCHIVE - 192)) | (1L << (UNARCHIVE - 192)) | (1L << (FILEFORMAT - 192)) | (1L << (TOUCH - 192)) | (1L << (COMPACT - 192)) | (1L << (CONCATENATE - 192)) | (1L << (CHANGE - 192)) | (1L << (CASCADE - 192)) | (1L << (RESTRICT - 192)) | (1L << (CLUSTERED - 192)) | (1L << (SORTED - 192)) | (1L << (PURGE - 192)) | (1L << (INPUTFORMAT - 192)) | (1L << (OUTPUTFORMAT - 192)) | (1L << (DATABASE - 192)) | (1L << (DATABASES - 192)) | (1L << (DFS - 192)) | (1L << (TRUNCATE - 192)) | (1L << (ANALYZE - 192)) | (1L << (COMPUTE - 192)) | (1L << (LIST - 192)) | (1L << (STATISTICS - 192)) | (1L << (PARTITIONED - 192)) | (1L << (EXTERNAL - 192)) | (1L << (DEFINED - 192)) | (1L << (REVOKE - 192)) | (1L << (GRANT - 192)) | (1L << (LOCK - 192)) | (1L << (UNLOCK - 192)) | (1L << (MSCK - 192)) | (1L << (REPAIR - 192)) | (1L << (RECOVER - 192)) | (1L << (EXPORT - 192)) | (1L << (IMPORT - 192)) | (1L << (LOAD - 192)) | (1L << (ROLE - 192)) | (1L << (ROLES - 192)) | (1L << (COMPACTIONS - 192)) | (1L << (PRINCIPALS - 192)) | (1L << (TRANSACTIONS - 192)) | (1L << (INDEX - 192)) | (1L << (INDEXES - 192)) | (1L << (LOCKS - 192)) | (1L << (OPTION - 192)) | (1L << (ANTI - 192)) | (1L << (LOCAL - 192)) | (1L << (INPATH - 192)) | (1L << (STRING - 192)) | (1L << (BIGINT_LITERAL - 192)) | (1L << (SMALLINT_LITERAL - 192)) | (1L << (TINYINT_LITERAL - 192)) | (1L << (INTEGER_VALUE - 192)) | (1L << (DECIMAL_VALUE - 192)) | (1L << (DOUBLE_LITERAL - 192)) | (1L << (BIGDECIMAL_LITERAL - 192)) | (1L << (IDENTIFIER - 192)) | (1L << (BACKQUOTED_IDENTIFIER - 192)))) != 0)) {
				{
				setState(1615);
				expression();
				setState(1620);
				_errHandler.sync(this);
				_la = _input.LA(1);
				while (_la==T__2) {
					{
					{
					setState(1616);
					match(T__2);
					setState(1617);
					expression();
					}
					}
					setState(1622);
					_errHandler.sync(this);
					_la = _input.LA(1);
				}
				}
			}

			setState(1625);
			match(T__1);
			setState(1626);
			((LateralViewContext)_localctx).tblName = identifier();
			setState(1638);
			_errHandler.sync(this);
			switch ( getInterpreter().adaptivePredict(_input,211,_ctx) ) {
			case 1:
				{
				setState(1628);
				_errHandler.sync(this);
				switch ( getInterpreter().adaptivePredict(_input,209,_ctx) ) {
				case 1:
					{
					setState(1627);
					match(AS);
					}
					break;
				}
				setState(1630);
				((LateralViewContext)_localctx).identifier = identifier();
				((LateralViewContext)_localctx).colName.add(((LateralViewContext)_localctx).identifier);
				setState(1635);
				_errHandler.sync(this);
				_alt = getInterpreter().adaptivePredict(_input,210,_ctx);
				while ( _alt!=2 && _alt!=org.antlr.v4.runtime.atn.ATN.INVALID_ALT_NUMBER ) {
					if ( _alt==1 ) {
						{
						{
						setState(1631);
						match(T__2);
						setState(1632);
						((LateralViewContext)_localctx).identifier = identifier();
						((LateralViewContext)_localctx).colName.add(((LateralViewContext)_localctx).identifier);
						}
						} 
					}
					setState(1637);
					_errHandler.sync(this);
					_alt = getInterpreter().adaptivePredict(_input,210,_ctx);
				}
				}
				break;
			}
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static class SetQuantifierContext extends ParserRuleContext {
		public TerminalNode DISTINCT() { return getToken(sparkParser.DISTINCT, 0); }
		public TerminalNode ALL() { return getToken(sparkParser.ALL, 0); }
		public SetQuantifierContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_setQuantifier; }
	}

	public final SetQuantifierContext setQuantifier() throws RecognitionException {
		SetQuantifierContext _localctx = new SetQuantifierContext(_ctx, getState());
		enterRule(_localctx, 96, RULE_setQuantifier);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(1640);
			_la = _input.LA(1);
			if ( !(_la==ALL || _la==DISTINCT) ) {
			_errHandler.recoverInline(this);
			}
			else {
				if ( _input.LA(1)==Token.EOF ) matchedEOF = true;
				_errHandler.reportMatch(this);
				consume();
			}
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static class RelationContext extends ParserRuleContext {
		public RelationPrimaryContext relationPrimary() {
			return getRuleContext(RelationPrimaryContext.class,0);
		}
		public List<JoinRelationContext> joinRelation() {
			return getRuleContexts(JoinRelationContext.class);
		}
		public JoinRelationContext joinRelation(int i) {
			return getRuleContext(JoinRelationContext.class,i);
		}
		public RelationContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_relation; }
	}

	public final RelationContext relation() throws RecognitionException {
		RelationContext _localctx = new RelationContext(_ctx, getState());
		enterRule(_localctx, 98, RULE_relation);
		try {
			int _alt;
			enterOuterAlt(_localctx, 1);
			{
			setState(1642);
			relationPrimary();
			setState(1646);
			_errHandler.sync(this);
			_alt = getInterpreter().adaptivePredict(_input,212,_ctx);
			while ( _alt!=2 && _alt!=org.antlr.v4.runtime.atn.ATN.INVALID_ALT_NUMBER ) {
				if ( _alt==1 ) {
					{
					{
					setState(1643);
					joinRelation();
					}
					} 
				}
				setState(1648);
				_errHandler.sync(this);
				_alt = getInterpreter().adaptivePredict(_input,212,_ctx);
			}
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static class JoinRelationContext extends ParserRuleContext {
		public RelationPrimaryContext right;
		public TerminalNode JOIN() { return getToken(sparkParser.JOIN, 0); }
		public RelationPrimaryContext relationPrimary() {
			return getRuleContext(RelationPrimaryContext.class,0);
		}
		public JoinTypeContext joinType() {
			return getRuleContext(JoinTypeContext.class,0);
		}
		public JoinCriteriaContext joinCriteria() {
			return getRuleContext(JoinCriteriaContext.class,0);
		}
		public TerminalNode NATURAL() { return getToken(sparkParser.NATURAL, 0); }
		public JoinRelationContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_joinRelation; }
	}

	public final JoinRelationContext joinRelation() throws RecognitionException {
		JoinRelationContext _localctx = new JoinRelationContext(_ctx, getState());
		enterRule(_localctx, 100, RULE_joinRelation);
		try {
			setState(1660);
			_errHandler.sync(this);
			switch (_input.LA(1)) {
			case JOIN:
			case CROSS:
			case INNER:
			case LEFT:
			case RIGHT:
			case FULL:
			case ANTI:
				enterOuterAlt(_localctx, 1);
				{
				{
				setState(1649);
				joinType();
				}
				setState(1650);
				match(JOIN);
				setState(1651);
				((JoinRelationContext)_localctx).right = relationPrimary();
				setState(1653);
				_errHandler.sync(this);
				switch ( getInterpreter().adaptivePredict(_input,213,_ctx) ) {
				case 1:
					{
					setState(1652);
					joinCriteria();
					}
					break;
				}
				}
				break;
			case NATURAL:
				enterOuterAlt(_localctx, 2);
				{
				setState(1655);
				match(NATURAL);
				setState(1656);
				joinType();
				setState(1657);
				match(JOIN);
				setState(1658);
				((JoinRelationContext)_localctx).right = relationPrimary();
				}
				break;
			default:
				throw new NoViableAltException(this);
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static class JoinTypeContext extends ParserRuleContext {
		public TerminalNode INNER() { return getToken(sparkParser.INNER, 0); }
		public TerminalNode CROSS() { return getToken(sparkParser.CROSS, 0); }
		public TerminalNode LEFT() { return getToken(sparkParser.LEFT, 0); }
		public TerminalNode OUTER() { return getToken(sparkParser.OUTER, 0); }
		public TerminalNode SEMI() { return getToken(sparkParser.SEMI, 0); }
		public TerminalNode RIGHT() { return getToken(sparkParser.RIGHT, 0); }
		public TerminalNode FULL() { return getToken(sparkParser.FULL, 0); }
		public TerminalNode ANTI() { return getToken(sparkParser.ANTI, 0); }
		public JoinTypeContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_joinType; }
	}

	public final JoinTypeContext joinType() throws RecognitionException {
		JoinTypeContext _localctx = new JoinTypeContext(_ctx, getState());
		enterRule(_localctx, 102, RULE_joinType);
		int _la;
		try {
			setState(1684);
			_errHandler.sync(this);
			switch ( getInterpreter().adaptivePredict(_input,220,_ctx) ) {
			case 1:
				enterOuterAlt(_localctx, 1);
				{
				setState(1663);
				_errHandler.sync(this);
				_la = _input.LA(1);
				if (_la==INNER) {
					{
					setState(1662);
					match(INNER);
					}
				}

				}
				break;
			case 2:
				enterOuterAlt(_localctx, 2);
				{
				setState(1665);
				match(CROSS);
				}
				break;
			case 3:
				enterOuterAlt(_localctx, 3);
				{
				setState(1666);
				match(LEFT);
				setState(1668);
				_errHandler.sync(this);
				_la = _input.LA(1);
				if (_la==OUTER) {
					{
					setState(1667);
					match(OUTER);
					}
				}

				}
				break;
			case 4:
				enterOuterAlt(_localctx, 4);
				{
				setState(1670);
				match(LEFT);
				setState(1671);
				match(SEMI);
				}
				break;
			case 5:
				enterOuterAlt(_localctx, 5);
				{
				setState(1672);
				match(RIGHT);
				setState(1674);
				_errHandler.sync(this);
				_la = _input.LA(1);
				if (_la==OUTER) {
					{
					setState(1673);
					match(OUTER);
					}
				}

				}
				break;
			case 6:
				enterOuterAlt(_localctx, 6);
				{
				setState(1676);
				match(FULL);
				setState(1678);
				_errHandler.sync(this);
				_la = _input.LA(1);
				if (_la==OUTER) {
					{
					setState(1677);
					match(OUTER);
					}
				}

				}
				break;
			case 7:
				enterOuterAlt(_localctx, 7);
				{
				setState(1681);
				_errHandler.sync(this);
				_la = _input.LA(1);
				if (_la==LEFT) {
					{
					setState(1680);
					match(LEFT);
					}
				}

				setState(1683);
				match(ANTI);
				}
				break;
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static class JoinCriteriaContext extends ParserRuleContext {
		public TerminalNode ON() { return getToken(sparkParser.ON, 0); }
		public BooleanExpressionContext booleanExpression() {
			return getRuleContext(BooleanExpressionContext.class,0);
		}
		public TerminalNode USING() { return getToken(sparkParser.USING, 0); }
		public IdentifierListContext identifierList() {
			return getRuleContext(IdentifierListContext.class,0);
		}
		public JoinCriteriaContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_joinCriteria; }
	}

	public final JoinCriteriaContext joinCriteria() throws RecognitionException {
		JoinCriteriaContext _localctx = new JoinCriteriaContext(_ctx, getState());
		enterRule(_localctx, 104, RULE_joinCriteria);
		try {
			setState(1690);
			_errHandler.sync(this);
			switch (_input.LA(1)) {
			case ON:
				enterOuterAlt(_localctx, 1);
				{
				setState(1686);
				match(ON);
				setState(1687);
				booleanExpression(0);
				}
				break;
			case USING:
				enterOuterAlt(_localctx, 2);
				{
				setState(1688);
				match(USING);
				setState(1689);
				identifierList();
				}
				break;
			default:
				throw new NoViableAltException(this);
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static class SampleContext extends ParserRuleContext {
		public TerminalNode TABLESAMPLE() { return getToken(sparkParser.TABLESAMPLE, 0); }
		public SampleMethodContext sampleMethod() {
			return getRuleContext(SampleMethodContext.class,0);
		}
		public SampleContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_sample; }
	}

	public final SampleContext sample() throws RecognitionException {
		SampleContext _localctx = new SampleContext(_ctx, getState());
		enterRule(_localctx, 106, RULE_sample);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(1692);
			match(TABLESAMPLE);
			setState(1693);
			match(T__0);
			setState(1695);
			_errHandler.sync(this);
			_la = _input.LA(1);
			if ((((_la) & ~0x3f) == 0 && ((1L << _la) & ((1L << T__0) | (1L << SELECT) | (1L << FROM) | (1L << ADD) | (1L << AS) | (1L << ALL) | (1L << ANY) | (1L << DISTINCT) | (1L << WHERE) | (1L << GROUP) | (1L << BY) | (1L << GROUPING) | (1L << SETS) | (1L << CUBE) | (1L << ROLLUP) | (1L << ORDER) | (1L << HAVING) | (1L << LIMIT) | (1L << AT) | (1L << OR) | (1L << AND) | (1L << IN) | (1L << NOT) | (1L << NO) | (1L << EXISTS) | (1L << BETWEEN) | (1L << LIKE) | (1L << RLIKE) | (1L << IS) | (1L << NULL) | (1L << TRUE) | (1L << FALSE) | (1L << NULLS) | (1L << ASC) | (1L << DESC) | (1L << FOR) | (1L << INTERVAL) | (1L << CASE) | (1L << WHEN) | (1L << THEN) | (1L << ELSE) | (1L << END) | (1L << JOIN) | (1L << CROSS) | (1L << OUTER) | (1L << INNER) | (1L << LEFT) | (1L << SEMI) | (1L << RIGHT) | (1L << FULL) | (1L << NATURAL) | (1L << ON) | (1L << PIVOT) | (1L << LATERAL))) != 0) || ((((_la - 64)) & ~0x3f) == 0 && ((1L << (_la - 64)) & ((1L << (WINDOW - 64)) | (1L << (OVER - 64)) | (1L << (PARTITION - 64)) | (1L << (RANGE - 64)) | (1L << (ROWS - 64)) | (1L << (UNBOUNDED - 64)) | (1L << (PRECEDING - 64)) | (1L << (FOLLOWING - 64)) | (1L << (CURRENT - 64)) | (1L << (FIRST - 64)) | (1L << (AFTER - 64)) | (1L << (LAST - 64)) | (1L << (ROW - 64)) | (1L << (WITH - 64)) | (1L << (VALUES - 64)) | (1L << (CREATE - 64)) | (1L << (TABLE - 64)) | (1L << (DIRECTORY - 64)) | (1L << (VIEW - 64)) | (1L << (REPLACE - 64)) | (1L << (INSERT - 64)) | (1L << (DELETE - 64)) | (1L << (INTO - 64)) | (1L << (DESCRIBE - 64)) | (1L << (EXPLAIN - 64)) | (1L << (FORMAT - 64)) | (1L << (LOGICAL - 64)) | (1L << (CODEGEN - 64)) | (1L << (COST - 64)) | (1L << (CAST - 64)) | (1L << (SHOW - 64)) | (1L << (TABLES - 64)) | (1L << (COLUMNS - 64)) | (1L << (COLUMN - 64)) | (1L << (USE - 64)) | (1L << (PARTITIONS - 64)) | (1L << (FUNCTIONS - 64)) | (1L << (DROP - 64)) | (1L << (UNION - 64)) | (1L << (EXCEPT - 64)) | (1L << (SETMINUS - 64)) | (1L << (INTERSECT - 64)) | (1L << (TO - 64)) | (1L << (TABLESAMPLE - 64)) | (1L << (STRATIFY - 64)) | (1L << (ALTER - 64)) | (1L << (RENAME - 64)) | (1L << (ARRAY - 64)) | (1L << (MAP - 64)) | (1L << (STRUCT - 64)) | (1L << (COMMENT - 64)) | (1L << (SET - 64)) | (1L << (RESET - 64)) | (1L << (DATA - 64)) | (1L << (START - 64)) | (1L << (TRANSACTION - 64)) | (1L << (COMMIT - 64)) | (1L << (ROLLBACK - 64)) | (1L << (MACRO - 64)) | (1L << (IGNORE - 64)) | (1L << (BOTH - 64)) | (1L << (LEADING - 64)) | (1L << (TRAILING - 64)) | (1L << (IF - 64)))) != 0) || ((((_la - 128)) & ~0x3f) == 0 && ((1L << (_la - 128)) & ((1L << (POSITION - 128)) | (1L << (EXTRACT - 128)) | (1L << (PLUS - 128)) | (1L << (MINUS - 128)) | (1L << (ASTERISK - 128)) | (1L << (DIV - 128)) | (1L << (TILDE - 128)) | (1L << (PERCENTLIT - 128)) | (1L << (BUCKET - 128)) | (1L << (OUT - 128)) | (1L << (OF - 128)) | (1L << (SORT - 128)) | (1L << (CLUSTER - 128)) | (1L << (DISTRIBUTE - 128)) | (1L << (OVERWRITE - 128)) | (1L << (TRANSFORM - 128)) | (1L << (REDUCE - 128)) | (1L << (SERDE - 128)) | (1L << (SERDEPROPERTIES - 128)) | (1L << (RECORDREADER - 128)) | (1L << (RECORDWRITER - 128)) | (1L << (DELIMITED - 128)) | (1L << (FIELDS - 128)) | (1L << (TERMINATED - 128)) | (1L << (COLLECTION - 128)) | (1L << (ITEMS - 128)) | (1L << (KEYS - 128)) | (1L << (ESCAPED - 128)) | (1L << (LINES - 128)) | (1L << (SEPARATED - 128)) | (1L << (FUNCTION - 128)) | (1L << (EXTENDED - 128)) | (1L << (REFRESH - 128)) | (1L << (CLEAR - 128)) | (1L << (CACHE - 128)) | (1L << (UNCACHE - 128)) | (1L << (LAZY - 128)) | (1L << (FORMATTED - 128)) | (1L << (GLOBAL - 128)) | (1L << (TEMPORARY - 128)) | (1L << (OPTIONS - 128)) | (1L << (UNSET - 128)) | (1L << (TBLPROPERTIES - 128)) | (1L << (DBPROPERTIES - 128)) | (1L << (BUCKETS - 128)) | (1L << (SKEWED - 128)) | (1L << (STORED - 128)) | (1L << (DIRECTORIES - 128)) | (1L << (LOCATION - 128)))) != 0) || ((((_la - 192)) & ~0x3f) == 0 && ((1L << (_la - 192)) & ((1L << (EXCHANGE - 192)) | (1L << (ARCHIVE - 192)) | (1L << (UNARCHIVE - 192)) | (1L << (FILEFORMAT - 192)) | (1L << (TOUCH - 192)) | (1L << (COMPACT - 192)) | (1L << (CONCATENATE - 192)) | (1L << (CHANGE - 192)) | (1L << (CASCADE - 192)) | (1L << (RESTRICT - 192)) | (1L << (CLUSTERED - 192)) | (1L << (SORTED - 192)) | (1L << (PURGE - 192)) | (1L << (INPUTFORMAT - 192)) | (1L << (OUTPUTFORMAT - 192)) | (1L << (DATABASE - 192)) | (1L << (DATABASES - 192)) | (1L << (DFS - 192)) | (1L << (TRUNCATE - 192)) | (1L << (ANALYZE - 192)) | (1L << (COMPUTE - 192)) | (1L << (LIST - 192)) | (1L << (STATISTICS - 192)) | (1L << (PARTITIONED - 192)) | (1L << (EXTERNAL - 192)) | (1L << (DEFINED - 192)) | (1L << (REVOKE - 192)) | (1L << (GRANT - 192)) | (1L << (LOCK - 192)) | (1L << (UNLOCK - 192)) | (1L << (MSCK - 192)) | (1L << (REPAIR - 192)) | (1L << (RECOVER - 192)) | (1L << (EXPORT - 192)) | (1L << (IMPORT - 192)) | (1L << (LOAD - 192)) | (1L << (ROLE - 192)) | (1L << (ROLES - 192)) | (1L << (COMPACTIONS - 192)) | (1L << (PRINCIPALS - 192)) | (1L << (TRANSACTIONS - 192)) | (1L << (INDEX - 192)) | (1L << (INDEXES - 192)) | (1L << (LOCKS - 192)) | (1L << (OPTION - 192)) | (1L << (ANTI - 192)) | (1L << (LOCAL - 192)) | (1L << (INPATH - 192)) | (1L << (STRING - 192)) | (1L << (BIGINT_LITERAL - 192)) | (1L << (SMALLINT_LITERAL - 192)) | (1L << (TINYINT_LITERAL - 192)) | (1L << (INTEGER_VALUE - 192)) | (1L << (DECIMAL_VALUE - 192)) | (1L << (DOUBLE_LITERAL - 192)) | (1L << (BIGDECIMAL_LITERAL - 192)) | (1L << (IDENTIFIER - 192)) | (1L << (BACKQUOTED_IDENTIFIER - 192)))) != 0)) {
				{
				setState(1694);
				sampleMethod();
				}
			}

			setState(1697);
			match(T__1);
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static class SampleMethodContext extends ParserRuleContext {
		public SampleMethodContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_sampleMethod; }
	 
		public SampleMethodContext() { }
		public void copyFrom(SampleMethodContext ctx) {
			super.copyFrom(ctx);
		}
	}
	public static class SampleByRowsContext extends SampleMethodContext {
		public ExpressionContext expression() {
			return getRuleContext(ExpressionContext.class,0);
		}
		public TerminalNode ROWS() { return getToken(sparkParser.ROWS, 0); }
		public SampleByRowsContext(SampleMethodContext ctx) { copyFrom(ctx); }
	}
	public static class SampleByPercentileContext extends SampleMethodContext {
		public Token negativeSign;
		public Token percentage;
		public TerminalNode PERCENTLIT() { return getToken(sparkParser.PERCENTLIT, 0); }
		public TerminalNode INTEGER_VALUE() { return getToken(sparkParser.INTEGER_VALUE, 0); }
		public TerminalNode DECIMAL_VALUE() { return getToken(sparkParser.DECIMAL_VALUE, 0); }
		public TerminalNode MINUS() { return getToken(sparkParser.MINUS, 0); }
		public SampleByPercentileContext(SampleMethodContext ctx) { copyFrom(ctx); }
	}
	public static class SampleByBucketContext extends SampleMethodContext {
		public Token sampleType;
		public Token numerator;
		public Token denominator;
		public TerminalNode OUT() { return getToken(sparkParser.OUT, 0); }
		public TerminalNode OF() { return getToken(sparkParser.OF, 0); }
		public TerminalNode BUCKET() { return getToken(sparkParser.BUCKET, 0); }
		public List<TerminalNode> INTEGER_VALUE() { return getTokens(sparkParser.INTEGER_VALUE); }
		public TerminalNode INTEGER_VALUE(int i) {
			return getToken(sparkParser.INTEGER_VALUE, i);
		}
		public TerminalNode ON() { return getToken(sparkParser.ON, 0); }
		public IdentifierContext identifier() {
			return getRuleContext(IdentifierContext.class,0);
		}
		public QualifiedNameContext qualifiedName() {
			return getRuleContext(QualifiedNameContext.class,0);
		}
		public SampleByBucketContext(SampleMethodContext ctx) { copyFrom(ctx); }
	}
	public static class SampleByBytesContext extends SampleMethodContext {
		public ExpressionContext bytes;
		public ExpressionContext expression() {
			return getRuleContext(ExpressionContext.class,0);
		}
		public SampleByBytesContext(SampleMethodContext ctx) { copyFrom(ctx); }
	}

	public final SampleMethodContext sampleMethod() throws RecognitionException {
		SampleMethodContext _localctx = new SampleMethodContext(_ctx, getState());
		enterRule(_localctx, 108, RULE_sampleMethod);
		int _la;
		try {
			setState(1723);
			_errHandler.sync(this);
			switch ( getInterpreter().adaptivePredict(_input,226,_ctx) ) {
			case 1:
				_localctx = new SampleByPercentileContext(_localctx);
				enterOuterAlt(_localctx, 1);
				{
				setState(1700);
				_errHandler.sync(this);
				_la = _input.LA(1);
				if (_la==MINUS) {
					{
					setState(1699);
					((SampleByPercentileContext)_localctx).negativeSign = match(MINUS);
					}
				}

				setState(1702);
				((SampleByPercentileContext)_localctx).percentage = _input.LT(1);
				_la = _input.LA(1);
				if ( !(_la==INTEGER_VALUE || _la==DECIMAL_VALUE) ) {
					((SampleByPercentileContext)_localctx).percentage = (Token)_errHandler.recoverInline(this);
				}
				else {
					if ( _input.LA(1)==Token.EOF ) matchedEOF = true;
					_errHandler.reportMatch(this);
					consume();
				}
				setState(1703);
				match(PERCENTLIT);
				}
				break;
			case 2:
				_localctx = new SampleByRowsContext(_localctx);
				enterOuterAlt(_localctx, 2);
				{
				setState(1704);
				expression();
				setState(1705);
				match(ROWS);
				}
				break;
			case 3:
				_localctx = new SampleByBucketContext(_localctx);
				enterOuterAlt(_localctx, 3);
				{
				setState(1707);
				((SampleByBucketContext)_localctx).sampleType = match(BUCKET);
				setState(1708);
				((SampleByBucketContext)_localctx).numerator = match(INTEGER_VALUE);
				setState(1709);
				match(OUT);
				setState(1710);
				match(OF);
				setState(1711);
				((SampleByBucketContext)_localctx).denominator = match(INTEGER_VALUE);
				setState(1720);
				_errHandler.sync(this);
				_la = _input.LA(1);
				if (_la==ON) {
					{
					setState(1712);
					match(ON);
					setState(1718);
					_errHandler.sync(this);
					switch ( getInterpreter().adaptivePredict(_input,224,_ctx) ) {
					case 1:
						{
						setState(1713);
						identifier();
						}
						break;
					case 2:
						{
						setState(1714);
						qualifiedName();
						setState(1715);
						match(T__0);
						setState(1716);
						match(T__1);
						}
						break;
					}
					}
				}

				}
				break;
			case 4:
				_localctx = new SampleByBytesContext(_localctx);
				enterOuterAlt(_localctx, 4);
				{
				setState(1722);
				((SampleByBytesContext)_localctx).bytes = expression();
				}
				break;
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static class IdentifierListContext extends ParserRuleContext {
		public IdentifierSeqContext identifierSeq() {
			return getRuleContext(IdentifierSeqContext.class,0);
		}
		public IdentifierListContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_identifierList; }
	}

	public final IdentifierListContext identifierList() throws RecognitionException {
		IdentifierListContext _localctx = new IdentifierListContext(_ctx, getState());
		enterRule(_localctx, 110, RULE_identifierList);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(1725);
			match(T__0);
			setState(1726);
			identifierSeq();
			setState(1727);
			match(T__1);
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static class IdentifierSeqContext extends ParserRuleContext {
		public List<IdentifierContext> identifier() {
			return getRuleContexts(IdentifierContext.class);
		}
		public IdentifierContext identifier(int i) {
			return getRuleContext(IdentifierContext.class,i);
		}
		public IdentifierSeqContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_identifierSeq; }
	}

	public final IdentifierSeqContext identifierSeq() throws RecognitionException {
		IdentifierSeqContext _localctx = new IdentifierSeqContext(_ctx, getState());
		enterRule(_localctx, 112, RULE_identifierSeq);
		try {
			int _alt;
			enterOuterAlt(_localctx, 1);
			{
			setState(1729);
			identifier();
			setState(1734);
			_errHandler.sync(this);
			_alt = getInterpreter().adaptivePredict(_input,227,_ctx);
			while ( _alt!=2 && _alt!=org.antlr.v4.runtime.atn.ATN.INVALID_ALT_NUMBER ) {
				if ( _alt==1 ) {
					{
					{
					setState(1730);
					match(T__2);
					setState(1731);
					identifier();
					}
					} 
				}
				setState(1736);
				_errHandler.sync(this);
				_alt = getInterpreter().adaptivePredict(_input,227,_ctx);
			}
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static class OrderedIdentifierListContext extends ParserRuleContext {
		public List<OrderedIdentifierContext> orderedIdentifier() {
			return getRuleContexts(OrderedIdentifierContext.class);
		}
		public OrderedIdentifierContext orderedIdentifier(int i) {
			return getRuleContext(OrderedIdentifierContext.class,i);
		}
		public OrderedIdentifierListContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_orderedIdentifierList; }
	}

	public final OrderedIdentifierListContext orderedIdentifierList() throws RecognitionException {
		OrderedIdentifierListContext _localctx = new OrderedIdentifierListContext(_ctx, getState());
		enterRule(_localctx, 114, RULE_orderedIdentifierList);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(1737);
			match(T__0);
			setState(1738);
			orderedIdentifier();
			setState(1743);
			_errHandler.sync(this);
			_la = _input.LA(1);
			while (_la==T__2) {
				{
				{
				setState(1739);
				match(T__2);
				setState(1740);
				orderedIdentifier();
				}
				}
				setState(1745);
				_errHandler.sync(this);
				_la = _input.LA(1);
			}
			setState(1746);
			match(T__1);
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static class OrderedIdentifierContext extends ParserRuleContext {
		public Token ordering;
		public IdentifierContext identifier() {
			return getRuleContext(IdentifierContext.class,0);
		}
		public TerminalNode ASC() { return getToken(sparkParser.ASC, 0); }
		public TerminalNode DESC() { return getToken(sparkParser.DESC, 0); }
		public OrderedIdentifierContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_orderedIdentifier; }
	}

	public final OrderedIdentifierContext orderedIdentifier() throws RecognitionException {
		OrderedIdentifierContext _localctx = new OrderedIdentifierContext(_ctx, getState());
		enterRule(_localctx, 116, RULE_orderedIdentifier);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(1748);
			identifier();
			setState(1750);
			_errHandler.sync(this);
			_la = _input.LA(1);
			if (_la==ASC || _la==DESC) {
				{
				setState(1749);
				((OrderedIdentifierContext)_localctx).ordering = _input.LT(1);
				_la = _input.LA(1);
				if ( !(_la==ASC || _la==DESC) ) {
					((OrderedIdentifierContext)_localctx).ordering = (Token)_errHandler.recoverInline(this);
				}
				else {
					if ( _input.LA(1)==Token.EOF ) matchedEOF = true;
					_errHandler.reportMatch(this);
					consume();
				}
				}
			}

			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static class IdentifierCommentListContext extends ParserRuleContext {
		public List<IdentifierCommentContext> identifierComment() {
			return getRuleContexts(IdentifierCommentContext.class);
		}
		public IdentifierCommentContext identifierComment(int i) {
			return getRuleContext(IdentifierCommentContext.class,i);
		}
		public IdentifierCommentListContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_identifierCommentList; }
	}

	public final IdentifierCommentListContext identifierCommentList() throws RecognitionException {
		IdentifierCommentListContext _localctx = new IdentifierCommentListContext(_ctx, getState());
		enterRule(_localctx, 118, RULE_identifierCommentList);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(1752);
			match(T__0);
			setState(1753);
			identifierComment();
			setState(1758);
			_errHandler.sync(this);
			_la = _input.LA(1);
			while (_la==T__2) {
				{
				{
				setState(1754);
				match(T__2);
				setState(1755);
				identifierComment();
				}
				}
				setState(1760);
				_errHandler.sync(this);
				_la = _input.LA(1);
			}
			setState(1761);
			match(T__1);
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static class IdentifierCommentContext extends ParserRuleContext {
		public IdentifierContext identifier() {
			return getRuleContext(IdentifierContext.class,0);
		}
		public TerminalNode COMMENT() { return getToken(sparkParser.COMMENT, 0); }
		public TerminalNode STRING() { return getToken(sparkParser.STRING, 0); }
		public IdentifierCommentContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_identifierComment; }
	}

	public final IdentifierCommentContext identifierComment() throws RecognitionException {
		IdentifierCommentContext _localctx = new IdentifierCommentContext(_ctx, getState());
		enterRule(_localctx, 120, RULE_identifierComment);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(1763);
			identifier();
			setState(1766);
			_errHandler.sync(this);
			_la = _input.LA(1);
			if (_la==COMMENT) {
				{
				setState(1764);
				match(COMMENT);
				setState(1765);
				match(STRING);
				}
			}

			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static class RelationPrimaryContext extends ParserRuleContext {
		public RelationPrimaryContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_relationPrimary; }
	 
		public RelationPrimaryContext() { }
		public void copyFrom(RelationPrimaryContext ctx) {
			super.copyFrom(ctx);
		}
	}
	public static class TableValuedFunctionContext extends RelationPrimaryContext {
		public FunctionTableContext functionTable() {
			return getRuleContext(FunctionTableContext.class,0);
		}
		public TableValuedFunctionContext(RelationPrimaryContext ctx) { copyFrom(ctx); }
	}
	public static class InlineTableDefault2Context extends RelationPrimaryContext {
		public InlineTableContext inlineTable() {
			return getRuleContext(InlineTableContext.class,0);
		}
		public InlineTableDefault2Context(RelationPrimaryContext ctx) { copyFrom(ctx); }
	}
	public static class AliasedRelationContext extends RelationPrimaryContext {
		public RelationContext relation() {
			return getRuleContext(RelationContext.class,0);
		}
		public TableAliasContext tableAlias() {
			return getRuleContext(TableAliasContext.class,0);
		}
		public SampleContext sample() {
			return getRuleContext(SampleContext.class,0);
		}
		public AliasedRelationContext(RelationPrimaryContext ctx) { copyFrom(ctx); }
	}
	public static class AliasedQueryContext extends RelationPrimaryContext {
		public QueryNoWithContext queryNoWith() {
			return getRuleContext(QueryNoWithContext.class,0);
		}
		public TableAliasContext tableAlias() {
			return getRuleContext(TableAliasContext.class,0);
		}
		public SampleContext sample() {
			return getRuleContext(SampleContext.class,0);
		}
		public AliasedQueryContext(RelationPrimaryContext ctx) { copyFrom(ctx); }
	}
	public static class TableNameContext extends RelationPrimaryContext {
		public TableIdentifierContext tableIdentifier() {
			return getRuleContext(TableIdentifierContext.class,0);
		}
		public TableAliasContext tableAlias() {
			return getRuleContext(TableAliasContext.class,0);
		}
		public SampleContext sample() {
			return getRuleContext(SampleContext.class,0);
		}
		public TableNameContext(RelationPrimaryContext ctx) { copyFrom(ctx); }
	}

	public final RelationPrimaryContext relationPrimary() throws RecognitionException {
		RelationPrimaryContext _localctx = new RelationPrimaryContext(_ctx, getState());
		enterRule(_localctx, 122, RULE_relationPrimary);
		try {
			setState(1792);
			_errHandler.sync(this);
			switch ( getInterpreter().adaptivePredict(_input,235,_ctx) ) {
			case 1:
				_localctx = new TableNameContext(_localctx);
				enterOuterAlt(_localctx, 1);
				{
				setState(1768);
				tableIdentifier();
				setState(1770);
				_errHandler.sync(this);
				switch ( getInterpreter().adaptivePredict(_input,232,_ctx) ) {
				case 1:
					{
					setState(1769);
					sample();
					}
					break;
				}
				setState(1772);
				tableAlias();
				}
				break;
			case 2:
				_localctx = new AliasedQueryContext(_localctx);
				enterOuterAlt(_localctx, 2);
				{
				setState(1774);
				match(T__0);
				setState(1775);
				queryNoWith();
				setState(1776);
				match(T__1);
				setState(1778);
				_errHandler.sync(this);
				switch ( getInterpreter().adaptivePredict(_input,233,_ctx) ) {
				case 1:
					{
					setState(1777);
					sample();
					}
					break;
				}
				setState(1780);
				tableAlias();
				}
				break;
			case 3:
				_localctx = new AliasedRelationContext(_localctx);
				enterOuterAlt(_localctx, 3);
				{
				setState(1782);
				match(T__0);
				setState(1783);
				relation();
				setState(1784);
				match(T__1);
				setState(1786);
				_errHandler.sync(this);
				switch ( getInterpreter().adaptivePredict(_input,234,_ctx) ) {
				case 1:
					{
					setState(1785);
					sample();
					}
					break;
				}
				setState(1788);
				tableAlias();
				}
				break;
			case 4:
				_localctx = new InlineTableDefault2Context(_localctx);
				enterOuterAlt(_localctx, 4);
				{
				setState(1790);
				inlineTable();
				}
				break;
			case 5:
				_localctx = new TableValuedFunctionContext(_localctx);
				enterOuterAlt(_localctx, 5);
				{
				setState(1791);
				functionTable();
				}
				break;
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static class InlineTableContext extends ParserRuleContext {
		public TerminalNode VALUES() { return getToken(sparkParser.VALUES, 0); }
		public List<ExpressionContext> expression() {
			return getRuleContexts(ExpressionContext.class);
		}
		public ExpressionContext expression(int i) {
			return getRuleContext(ExpressionContext.class,i);
		}
		public TableAliasContext tableAlias() {
			return getRuleContext(TableAliasContext.class,0);
		}
		public InlineTableContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_inlineTable; }
	}

	public final InlineTableContext inlineTable() throws RecognitionException {
		InlineTableContext _localctx = new InlineTableContext(_ctx, getState());
		enterRule(_localctx, 124, RULE_inlineTable);
		try {
			int _alt;
			enterOuterAlt(_localctx, 1);
			{
			setState(1794);
			match(VALUES);
			setState(1795);
			expression();
			setState(1800);
			_errHandler.sync(this);
			_alt = getInterpreter().adaptivePredict(_input,236,_ctx);
			while ( _alt!=2 && _alt!=org.antlr.v4.runtime.atn.ATN.INVALID_ALT_NUMBER ) {
				if ( _alt==1 ) {
					{
					{
					setState(1796);
					match(T__2);
					setState(1797);
					expression();
					}
					} 
				}
				setState(1802);
				_errHandler.sync(this);
				_alt = getInterpreter().adaptivePredict(_input,236,_ctx);
			}
			setState(1803);
			tableAlias();
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static class FunctionTableContext extends ParserRuleContext {
		public IdentifierContext identifier() {
			return getRuleContext(IdentifierContext.class,0);
		}
		public TableAliasContext tableAlias() {
			return getRuleContext(TableAliasContext.class,0);
		}
		public List<ExpressionContext> expression() {
			return getRuleContexts(ExpressionContext.class);
		}
		public ExpressionContext expression(int i) {
			return getRuleContext(ExpressionContext.class,i);
		}
		public FunctionTableContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_functionTable; }
	}

	public final FunctionTableContext functionTable() throws RecognitionException {
		FunctionTableContext _localctx = new FunctionTableContext(_ctx, getState());
		enterRule(_localctx, 126, RULE_functionTable);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(1805);
			identifier();
			setState(1806);
			match(T__0);
			setState(1815);
			_errHandler.sync(this);
			_la = _input.LA(1);
			if ((((_la) & ~0x3f) == 0 && ((1L << _la) & ((1L << T__0) | (1L << SELECT) | (1L << FROM) | (1L << ADD) | (1L << AS) | (1L << ALL) | (1L << ANY) | (1L << DISTINCT) | (1L << WHERE) | (1L << GROUP) | (1L << BY) | (1L << GROUPING) | (1L << SETS) | (1L << CUBE) | (1L << ROLLUP) | (1L << ORDER) | (1L << HAVING) | (1L << LIMIT) | (1L << AT) | (1L << OR) | (1L << AND) | (1L << IN) | (1L << NOT) | (1L << NO) | (1L << EXISTS) | (1L << BETWEEN) | (1L << LIKE) | (1L << RLIKE) | (1L << IS) | (1L << NULL) | (1L << TRUE) | (1L << FALSE) | (1L << NULLS) | (1L << ASC) | (1L << DESC) | (1L << FOR) | (1L << INTERVAL) | (1L << CASE) | (1L << WHEN) | (1L << THEN) | (1L << ELSE) | (1L << END) | (1L << JOIN) | (1L << CROSS) | (1L << OUTER) | (1L << INNER) | (1L << LEFT) | (1L << SEMI) | (1L << RIGHT) | (1L << FULL) | (1L << NATURAL) | (1L << ON) | (1L << PIVOT) | (1L << LATERAL))) != 0) || ((((_la - 64)) & ~0x3f) == 0 && ((1L << (_la - 64)) & ((1L << (WINDOW - 64)) | (1L << (OVER - 64)) | (1L << (PARTITION - 64)) | (1L << (RANGE - 64)) | (1L << (ROWS - 64)) | (1L << (UNBOUNDED - 64)) | (1L << (PRECEDING - 64)) | (1L << (FOLLOWING - 64)) | (1L << (CURRENT - 64)) | (1L << (FIRST - 64)) | (1L << (AFTER - 64)) | (1L << (LAST - 64)) | (1L << (ROW - 64)) | (1L << (WITH - 64)) | (1L << (VALUES - 64)) | (1L << (CREATE - 64)) | (1L << (TABLE - 64)) | (1L << (DIRECTORY - 64)) | (1L << (VIEW - 64)) | (1L << (REPLACE - 64)) | (1L << (INSERT - 64)) | (1L << (DELETE - 64)) | (1L << (INTO - 64)) | (1L << (DESCRIBE - 64)) | (1L << (EXPLAIN - 64)) | (1L << (FORMAT - 64)) | (1L << (LOGICAL - 64)) | (1L << (CODEGEN - 64)) | (1L << (COST - 64)) | (1L << (CAST - 64)) | (1L << (SHOW - 64)) | (1L << (TABLES - 64)) | (1L << (COLUMNS - 64)) | (1L << (COLUMN - 64)) | (1L << (USE - 64)) | (1L << (PARTITIONS - 64)) | (1L << (FUNCTIONS - 64)) | (1L << (DROP - 64)) | (1L << (UNION - 64)) | (1L << (EXCEPT - 64)) | (1L << (SETMINUS - 64)) | (1L << (INTERSECT - 64)) | (1L << (TO - 64)) | (1L << (TABLESAMPLE - 64)) | (1L << (STRATIFY - 64)) | (1L << (ALTER - 64)) | (1L << (RENAME - 64)) | (1L << (ARRAY - 64)) | (1L << (MAP - 64)) | (1L << (STRUCT - 64)) | (1L << (COMMENT - 64)) | (1L << (SET - 64)) | (1L << (RESET - 64)) | (1L << (DATA - 64)) | (1L << (START - 64)) | (1L << (TRANSACTION - 64)) | (1L << (COMMIT - 64)) | (1L << (ROLLBACK - 64)) | (1L << (MACRO - 64)) | (1L << (IGNORE - 64)) | (1L << (BOTH - 64)) | (1L << (LEADING - 64)) | (1L << (TRAILING - 64)) | (1L << (IF - 64)))) != 0) || ((((_la - 128)) & ~0x3f) == 0 && ((1L << (_la - 128)) & ((1L << (POSITION - 128)) | (1L << (EXTRACT - 128)) | (1L << (PLUS - 128)) | (1L << (MINUS - 128)) | (1L << (ASTERISK - 128)) | (1L << (DIV - 128)) | (1L << (TILDE - 128)) | (1L << (PERCENTLIT - 128)) | (1L << (BUCKET - 128)) | (1L << (OUT - 128)) | (1L << (OF - 128)) | (1L << (SORT - 128)) | (1L << (CLUSTER - 128)) | (1L << (DISTRIBUTE - 128)) | (1L << (OVERWRITE - 128)) | (1L << (TRANSFORM - 128)) | (1L << (REDUCE - 128)) | (1L << (SERDE - 128)) | (1L << (SERDEPROPERTIES - 128)) | (1L << (RECORDREADER - 128)) | (1L << (RECORDWRITER - 128)) | (1L << (DELIMITED - 128)) | (1L << (FIELDS - 128)) | (1L << (TERMINATED - 128)) | (1L << (COLLECTION - 128)) | (1L << (ITEMS - 128)) | (1L << (KEYS - 128)) | (1L << (ESCAPED - 128)) | (1L << (LINES - 128)) | (1L << (SEPARATED - 128)) | (1L << (FUNCTION - 128)) | (1L << (EXTENDED - 128)) | (1L << (REFRESH - 128)) | (1L << (CLEAR - 128)) | (1L << (CACHE - 128)) | (1L << (UNCACHE - 128)) | (1L << (LAZY - 128)) | (1L << (FORMATTED - 128)) | (1L << (GLOBAL - 128)) | (1L << (TEMPORARY - 128)) | (1L << (OPTIONS - 128)) | (1L << (UNSET - 128)) | (1L << (TBLPROPERTIES - 128)) | (1L << (DBPROPERTIES - 128)) | (1L << (BUCKETS - 128)) | (1L << (SKEWED - 128)) | (1L << (STORED - 128)) | (1L << (DIRECTORIES - 128)) | (1L << (LOCATION - 128)))) != 0) || ((((_la - 192)) & ~0x3f) == 0 && ((1L << (_la - 192)) & ((1L << (EXCHANGE - 192)) | (1L << (ARCHIVE - 192)) | (1L << (UNARCHIVE - 192)) | (1L << (FILEFORMAT - 192)) | (1L << (TOUCH - 192)) | (1L << (COMPACT - 192)) | (1L << (CONCATENATE - 192)) | (1L << (CHANGE - 192)) | (1L << (CASCADE - 192)) | (1L << (RESTRICT - 192)) | (1L << (CLUSTERED - 192)) | (1L << (SORTED - 192)) | (1L << (PURGE - 192)) | (1L << (INPUTFORMAT - 192)) | (1L << (OUTPUTFORMAT - 192)) | (1L << (DATABASE - 192)) | (1L << (DATABASES - 192)) | (1L << (DFS - 192)) | (1L << (TRUNCATE - 192)) | (1L << (ANALYZE - 192)) | (1L << (COMPUTE - 192)) | (1L << (LIST - 192)) | (1L << (STATISTICS - 192)) | (1L << (PARTITIONED - 192)) | (1L << (EXTERNAL - 192)) | (1L << (DEFINED - 192)) | (1L << (REVOKE - 192)) | (1L << (GRANT - 192)) | (1L << (LOCK - 192)) | (1L << (UNLOCK - 192)) | (1L << (MSCK - 192)) | (1L << (REPAIR - 192)) | (1L << (RECOVER - 192)) | (1L << (EXPORT - 192)) | (1L << (IMPORT - 192)) | (1L << (LOAD - 192)) | (1L << (ROLE - 192)) | (1L << (ROLES - 192)) | (1L << (COMPACTIONS - 192)) | (1L << (PRINCIPALS - 192)) | (1L << (TRANSACTIONS - 192)) | (1L << (INDEX - 192)) | (1L << (INDEXES - 192)) | (1L << (LOCKS - 192)) | (1L << (OPTION - 192)) | (1L << (ANTI - 192)) | (1L << (LOCAL - 192)) | (1L << (INPATH - 192)) | (1L << (STRING - 192)) | (1L << (BIGINT_LITERAL - 192)) | (1L << (SMALLINT_LITERAL - 192)) | (1L << (TINYINT_LITERAL - 192)) | (1L << (INTEGER_VALUE - 192)) | (1L << (DECIMAL_VALUE - 192)) | (1L << (DOUBLE_LITERAL - 192)) | (1L << (BIGDECIMAL_LITERAL - 192)) | (1L << (IDENTIFIER - 192)) | (1L << (BACKQUOTED_IDENTIFIER - 192)))) != 0)) {
				{
				setState(1807);
				expression();
				setState(1812);
				_errHandler.sync(this);
				_la = _input.LA(1);
				while (_la==T__2) {
					{
					{
					setState(1808);
					match(T__2);
					setState(1809);
					expression();
					}
					}
					setState(1814);
					_errHandler.sync(this);
					_la = _input.LA(1);
				}
				}
			}

			setState(1817);
			match(T__1);
			setState(1818);
			tableAlias();
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static class TableAliasContext extends ParserRuleContext {
		public StrictIdentifierContext strictIdentifier() {
			return getRuleContext(StrictIdentifierContext.class,0);
		}
		public TerminalNode AS() { return getToken(sparkParser.AS, 0); }
		public IdentifierListContext identifierList() {
			return getRuleContext(IdentifierListContext.class,0);
		}
		public TableAliasContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_tableAlias; }
	}

	public final TableAliasContext tableAlias() throws RecognitionException {
		TableAliasContext _localctx = new TableAliasContext(_ctx, getState());
		enterRule(_localctx, 128, RULE_tableAlias);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(1827);
			_errHandler.sync(this);
			switch ( getInterpreter().adaptivePredict(_input,241,_ctx) ) {
			case 1:
				{
				setState(1821);
				_errHandler.sync(this);
				switch ( getInterpreter().adaptivePredict(_input,239,_ctx) ) {
				case 1:
					{
					setState(1820);
					match(AS);
					}
					break;
				}
				setState(1823);
				strictIdentifier();
				setState(1825);
				_errHandler.sync(this);
				switch ( getInterpreter().adaptivePredict(_input,240,_ctx) ) {
				case 1:
					{
					setState(1824);
					identifierList();
					}
					break;
				}
				}
				break;
			}
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static class RowFormatContext extends ParserRuleContext {
		public RowFormatContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_rowFormat; }
	 
		public RowFormatContext() { }
		public void copyFrom(RowFormatContext ctx) {
			super.copyFrom(ctx);
		}
	}
	public static class RowFormatSerdeContext extends RowFormatContext {
		public Token name;
		public TablePropertyListContext props;
		public TerminalNode ROW() { return getToken(sparkParser.ROW, 0); }
		public TerminalNode FORMAT() { return getToken(sparkParser.FORMAT, 0); }
		public TerminalNode SERDE() { return getToken(sparkParser.SERDE, 0); }
		public TerminalNode STRING() { return getToken(sparkParser.STRING, 0); }
		public TerminalNode WITH() { return getToken(sparkParser.WITH, 0); }
		public TerminalNode SERDEPROPERTIES() { return getToken(sparkParser.SERDEPROPERTIES, 0); }
		public TablePropertyListContext tablePropertyList() {
			return getRuleContext(TablePropertyListContext.class,0);
		}
		public RowFormatSerdeContext(RowFormatContext ctx) { copyFrom(ctx); }
	}
	public static class RowFormatDelimitedContext extends RowFormatContext {
		public Token fieldsTerminatedBy;
		public Token escapedBy;
		public Token collectionItemsTerminatedBy;
		public Token keysTerminatedBy;
		public Token linesSeparatedBy;
		public Token nullDefinedAs;
		public TerminalNode ROW() { return getToken(sparkParser.ROW, 0); }
		public TerminalNode FORMAT() { return getToken(sparkParser.FORMAT, 0); }
		public TerminalNode DELIMITED() { return getToken(sparkParser.DELIMITED, 0); }
		public TerminalNode FIELDS() { return getToken(sparkParser.FIELDS, 0); }
		public List<TerminalNode> TERMINATED() { return getTokens(sparkParser.TERMINATED); }
		public TerminalNode TERMINATED(int i) {
			return getToken(sparkParser.TERMINATED, i);
		}
		public List<TerminalNode> BY() { return getTokens(sparkParser.BY); }
		public TerminalNode BY(int i) {
			return getToken(sparkParser.BY, i);
		}
		public TerminalNode COLLECTION() { return getToken(sparkParser.COLLECTION, 0); }
		public TerminalNode ITEMS() { return getToken(sparkParser.ITEMS, 0); }
		public TerminalNode MAP() { return getToken(sparkParser.MAP, 0); }
		public TerminalNode KEYS() { return getToken(sparkParser.KEYS, 0); }
		public TerminalNode LINES() { return getToken(sparkParser.LINES, 0); }
		public TerminalNode NULL() { return getToken(sparkParser.NULL, 0); }
		public TerminalNode DEFINED() { return getToken(sparkParser.DEFINED, 0); }
		public TerminalNode AS() { return getToken(sparkParser.AS, 0); }
		public List<TerminalNode> STRING() { return getTokens(sparkParser.STRING); }
		public TerminalNode STRING(int i) {
			return getToken(sparkParser.STRING, i);
		}
		public TerminalNode ESCAPED() { return getToken(sparkParser.ESCAPED, 0); }
		public RowFormatDelimitedContext(RowFormatContext ctx) { copyFrom(ctx); }
	}

	public final RowFormatContext rowFormat() throws RecognitionException {
		RowFormatContext _localctx = new RowFormatContext(_ctx, getState());
		enterRule(_localctx, 130, RULE_rowFormat);
		try {
			setState(1878);
			_errHandler.sync(this);
			switch ( getInterpreter().adaptivePredict(_input,249,_ctx) ) {
			case 1:
				_localctx = new RowFormatSerdeContext(_localctx);
				enterOuterAlt(_localctx, 1);
				{
				setState(1829);
				match(ROW);
				setState(1830);
				match(FORMAT);
				setState(1831);
				match(SERDE);
				setState(1832);
				((RowFormatSerdeContext)_localctx).name = match(STRING);
				setState(1836);
				_errHandler.sync(this);
				switch ( getInterpreter().adaptivePredict(_input,242,_ctx) ) {
				case 1:
					{
					setState(1833);
					match(WITH);
					setState(1834);
					match(SERDEPROPERTIES);
					setState(1835);
					((RowFormatSerdeContext)_localctx).props = tablePropertyList();
					}
					break;
				}
				}
				break;
			case 2:
				_localctx = new RowFormatDelimitedContext(_localctx);
				enterOuterAlt(_localctx, 2);
				{
				setState(1838);
				match(ROW);
				setState(1839);
				match(FORMAT);
				setState(1840);
				match(DELIMITED);
				setState(1850);
				_errHandler.sync(this);
				switch ( getInterpreter().adaptivePredict(_input,244,_ctx) ) {
				case 1:
					{
					setState(1841);
					match(FIELDS);
					setState(1842);
					match(TERMINATED);
					setState(1843);
					match(BY);
					setState(1844);
					((RowFormatDelimitedContext)_localctx).fieldsTerminatedBy = match(STRING);
					setState(1848);
					_errHandler.sync(this);
					switch ( getInterpreter().adaptivePredict(_input,243,_ctx) ) {
					case 1:
						{
						setState(1845);
						match(ESCAPED);
						setState(1846);
						match(BY);
						setState(1847);
						((RowFormatDelimitedContext)_localctx).escapedBy = match(STRING);
						}
						break;
					}
					}
					break;
				}
				setState(1857);
				_errHandler.sync(this);
				switch ( getInterpreter().adaptivePredict(_input,245,_ctx) ) {
				case 1:
					{
					setState(1852);
					match(COLLECTION);
					setState(1853);
					match(ITEMS);
					setState(1854);
					match(TERMINATED);
					setState(1855);
					match(BY);
					setState(1856);
					((RowFormatDelimitedContext)_localctx).collectionItemsTerminatedBy = match(STRING);
					}
					break;
				}
				setState(1864);
				_errHandler.sync(this);
				switch ( getInterpreter().adaptivePredict(_input,246,_ctx) ) {
				case 1:
					{
					setState(1859);
					match(MAP);
					setState(1860);
					match(KEYS);
					setState(1861);
					match(TERMINATED);
					setState(1862);
					match(BY);
					setState(1863);
					((RowFormatDelimitedContext)_localctx).keysTerminatedBy = match(STRING);
					}
					break;
				}
				setState(1870);
				_errHandler.sync(this);
				switch ( getInterpreter().adaptivePredict(_input,247,_ctx) ) {
				case 1:
					{
					setState(1866);
					match(LINES);
					setState(1867);
					match(TERMINATED);
					setState(1868);
					match(BY);
					setState(1869);
					((RowFormatDelimitedContext)_localctx).linesSeparatedBy = match(STRING);
					}
					break;
				}
				setState(1876);
				_errHandler.sync(this);
				switch ( getInterpreter().adaptivePredict(_input,248,_ctx) ) {
				case 1:
					{
					setState(1872);
					match(NULL);
					setState(1873);
					match(DEFINED);
					setState(1874);
					match(AS);
					setState(1875);
					((RowFormatDelimitedContext)_localctx).nullDefinedAs = match(STRING);
					}
					break;
				}
				}
				break;
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static class TableIdentifierContext extends ParserRuleContext {
		public IdentifierContext db;
		public IdentifierContext table;
		public List<IdentifierContext> identifier() {
			return getRuleContexts(IdentifierContext.class);
		}
		public IdentifierContext identifier(int i) {
			return getRuleContext(IdentifierContext.class,i);
		}
		public TableIdentifierContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_tableIdentifier; }
	}

	public final TableIdentifierContext tableIdentifier() throws RecognitionException {
		TableIdentifierContext _localctx = new TableIdentifierContext(_ctx, getState());
		enterRule(_localctx, 132, RULE_tableIdentifier);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(1883);
			_errHandler.sync(this);
			switch ( getInterpreter().adaptivePredict(_input,250,_ctx) ) {
			case 1:
				{
				setState(1880);
				((TableIdentifierContext)_localctx).db = identifier();
				setState(1881);
				match(T__3);
				}
				break;
			}
			setState(1885);
			((TableIdentifierContext)_localctx).table = identifier();
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static class FunctionIdentifierContext extends ParserRuleContext {
		public IdentifierContext db;
		public IdentifierContext j_function;
		public List<IdentifierContext> identifier() {
			return getRuleContexts(IdentifierContext.class);
		}
		public IdentifierContext identifier(int i) {
			return getRuleContext(IdentifierContext.class,i);
		}
		public FunctionIdentifierContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_functionIdentifier; }
	}

	public final FunctionIdentifierContext functionIdentifier() throws RecognitionException {
		FunctionIdentifierContext _localctx = new FunctionIdentifierContext(_ctx, getState());
		enterRule(_localctx, 134, RULE_functionIdentifier);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(1890);
			_errHandler.sync(this);
			switch ( getInterpreter().adaptivePredict(_input,251,_ctx) ) {
			case 1:
				{
				setState(1887);
				((FunctionIdentifierContext)_localctx).db = identifier();
				setState(1888);
				match(T__3);
				}
				break;
			}
			setState(1892);
			((FunctionIdentifierContext)_localctx).j_function = identifier();
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static class NamedExpressionContext extends ParserRuleContext {
		public ExpressionContext expression() {
			return getRuleContext(ExpressionContext.class,0);
		}
		public IdentifierContext identifier() {
			return getRuleContext(IdentifierContext.class,0);
		}
		public IdentifierListContext identifierList() {
			return getRuleContext(IdentifierListContext.class,0);
		}
		public TerminalNode AS() { return getToken(sparkParser.AS, 0); }
		public NamedExpressionContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_namedExpression; }
	}

	public final NamedExpressionContext namedExpression() throws RecognitionException {
		NamedExpressionContext _localctx = new NamedExpressionContext(_ctx, getState());
		enterRule(_localctx, 136, RULE_namedExpression);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(1894);
			expression();
			setState(1902);
			_errHandler.sync(this);
			switch ( getInterpreter().adaptivePredict(_input,254,_ctx) ) {
			case 1:
				{
				setState(1896);
				_errHandler.sync(this);
				switch ( getInterpreter().adaptivePredict(_input,252,_ctx) ) {
				case 1:
					{
					setState(1895);
					match(AS);
					}
					break;
				}
				setState(1900);
				_errHandler.sync(this);
				switch (_input.LA(1)) {
				case SELECT:
				case FROM:
				case ADD:
				case AS:
				case ALL:
				case ANY:
				case DISTINCT:
				case WHERE:
				case GROUP:
				case BY:
				case GROUPING:
				case SETS:
				case CUBE:
				case ROLLUP:
				case ORDER:
				case HAVING:
				case LIMIT:
				case AT:
				case OR:
				case AND:
				case IN:
				case NOT:
				case NO:
				case EXISTS:
				case BETWEEN:
				case LIKE:
				case RLIKE:
				case IS:
				case NULL:
				case TRUE:
				case FALSE:
				case NULLS:
				case ASC:
				case DESC:
				case FOR:
				case INTERVAL:
				case CASE:
				case WHEN:
				case THEN:
				case ELSE:
				case END:
				case JOIN:
				case CROSS:
				case OUTER:
				case INNER:
				case LEFT:
				case SEMI:
				case RIGHT:
				case FULL:
				case NATURAL:
				case ON:
				case PIVOT:
				case LATERAL:
				case WINDOW:
				case OVER:
				case PARTITION:
				case RANGE:
				case ROWS:
				case UNBOUNDED:
				case PRECEDING:
				case FOLLOWING:
				case CURRENT:
				case FIRST:
				case AFTER:
				case LAST:
				case ROW:
				case WITH:
				case VALUES:
				case CREATE:
				case TABLE:
				case DIRECTORY:
				case VIEW:
				case REPLACE:
				case INSERT:
				case DELETE:
				case INTO:
				case DESCRIBE:
				case EXPLAIN:
				case FORMAT:
				case LOGICAL:
				case CODEGEN:
				case COST:
				case CAST:
				case SHOW:
				case TABLES:
				case COLUMNS:
				case COLUMN:
				case USE:
				case PARTITIONS:
				case FUNCTIONS:
				case DROP:
				case UNION:
				case EXCEPT:
				case SETMINUS:
				case INTERSECT:
				case TO:
				case TABLESAMPLE:
				case STRATIFY:
				case ALTER:
				case RENAME:
				case ARRAY:
				case MAP:
				case STRUCT:
				case COMMENT:
				case SET:
				case RESET:
				case DATA:
				case START:
				case TRANSACTION:
				case COMMIT:
				case ROLLBACK:
				case MACRO:
				case IGNORE:
				case BOTH:
				case LEADING:
				case TRAILING:
				case IF:
				case POSITION:
				case EXTRACT:
				case DIV:
				case PERCENTLIT:
				case BUCKET:
				case OUT:
				case OF:
				case SORT:
				case CLUSTER:
				case DISTRIBUTE:
				case OVERWRITE:
				case TRANSFORM:
				case REDUCE:
				case SERDE:
				case SERDEPROPERTIES:
				case RECORDREADER:
				case RECORDWRITER:
				case DELIMITED:
				case FIELDS:
				case TERMINATED:
				case COLLECTION:
				case ITEMS:
				case KEYS:
				case ESCAPED:
				case LINES:
				case SEPARATED:
				case FUNCTION:
				case EXTENDED:
				case REFRESH:
				case CLEAR:
				case CACHE:
				case UNCACHE:
				case LAZY:
				case FORMATTED:
				case GLOBAL:
				case TEMPORARY:
				case OPTIONS:
				case UNSET:
				case TBLPROPERTIES:
				case DBPROPERTIES:
				case BUCKETS:
				case SKEWED:
				case STORED:
				case DIRECTORIES:
				case LOCATION:
				case EXCHANGE:
				case ARCHIVE:
				case UNARCHIVE:
				case FILEFORMAT:
				case TOUCH:
				case COMPACT:
				case CONCATENATE:
				case CHANGE:
				case CASCADE:
				case RESTRICT:
				case CLUSTERED:
				case SORTED:
				case PURGE:
				case INPUTFORMAT:
				case OUTPUTFORMAT:
				case DATABASE:
				case DATABASES:
				case DFS:
				case TRUNCATE:
				case ANALYZE:
				case COMPUTE:
				case LIST:
				case STATISTICS:
				case PARTITIONED:
				case EXTERNAL:
				case DEFINED:
				case REVOKE:
				case GRANT:
				case LOCK:
				case UNLOCK:
				case MSCK:
				case REPAIR:
				case RECOVER:
				case EXPORT:
				case IMPORT:
				case LOAD:
				case ROLE:
				case ROLES:
				case COMPACTIONS:
				case PRINCIPALS:
				case TRANSACTIONS:
				case INDEX:
				case INDEXES:
				case LOCKS:
				case OPTION:
				case ANTI:
				case LOCAL:
				case INPATH:
				case IDENTIFIER:
				case BACKQUOTED_IDENTIFIER:
					{
					setState(1898);
					identifier();
					}
					break;
				case T__0:
					{
					setState(1899);
					identifierList();
					}
					break;
				default:
					throw new NoViableAltException(this);
				}
				}
				break;
			}
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static class NamedExpressionSeqContext extends ParserRuleContext {
		public List<NamedExpressionContext> namedExpression() {
			return getRuleContexts(NamedExpressionContext.class);
		}
		public NamedExpressionContext namedExpression(int i) {
			return getRuleContext(NamedExpressionContext.class,i);
		}
		public NamedExpressionSeqContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_namedExpressionSeq; }
	}

	public final NamedExpressionSeqContext namedExpressionSeq() throws RecognitionException {
		NamedExpressionSeqContext _localctx = new NamedExpressionSeqContext(_ctx, getState());
		enterRule(_localctx, 138, RULE_namedExpressionSeq);
		try {
			int _alt;
			enterOuterAlt(_localctx, 1);
			{
			setState(1904);
			namedExpression();
			setState(1909);
			_errHandler.sync(this);
			_alt = getInterpreter().adaptivePredict(_input,255,_ctx);
			while ( _alt!=2 && _alt!=org.antlr.v4.runtime.atn.ATN.INVALID_ALT_NUMBER ) {
				if ( _alt==1 ) {
					{
					{
					setState(1905);
					match(T__2);
					setState(1906);
					namedExpression();
					}
					} 
				}
				setState(1911);
				_errHandler.sync(this);
				_alt = getInterpreter().adaptivePredict(_input,255,_ctx);
			}
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static class ExpressionContext extends ParserRuleContext {
		public BooleanExpressionContext booleanExpression() {
			return getRuleContext(BooleanExpressionContext.class,0);
		}
		public ExpressionContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_expression; }
	}

	public final ExpressionContext expression() throws RecognitionException {
		ExpressionContext _localctx = new ExpressionContext(_ctx, getState());
		enterRule(_localctx, 140, RULE_expression);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(1912);
			booleanExpression(0);
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static class BooleanExpressionContext extends ParserRuleContext {
		public BooleanExpressionContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_booleanExpression; }
	 
		public BooleanExpressionContext() { }
		public void copyFrom(BooleanExpressionContext ctx) {
			super.copyFrom(ctx);
		}
	}
	public static class LogicalNotContext extends BooleanExpressionContext {
		public TerminalNode NOT() { return getToken(sparkParser.NOT, 0); }
		public BooleanExpressionContext booleanExpression() {
			return getRuleContext(BooleanExpressionContext.class,0);
		}
		public LogicalNotContext(BooleanExpressionContext ctx) { copyFrom(ctx); }
	}
	public static class PredicatedContext extends BooleanExpressionContext {
		public ValueExpressionContext valueExpression() {
			return getRuleContext(ValueExpressionContext.class,0);
		}
		public PredicateContext predicate() {
			return getRuleContext(PredicateContext.class,0);
		}
		public PredicatedContext(BooleanExpressionContext ctx) { copyFrom(ctx); }
	}
	public static class ExistsContext extends BooleanExpressionContext {
		public TerminalNode EXISTS() { return getToken(sparkParser.EXISTS, 0); }
		public QueryContext query() {
			return getRuleContext(QueryContext.class,0);
		}
		public ExistsContext(BooleanExpressionContext ctx) { copyFrom(ctx); }
	}
	public static class LogicalBinaryContext extends BooleanExpressionContext {
		public BooleanExpressionContext left;
		public Token operator;
		public BooleanExpressionContext right;
		public List<BooleanExpressionContext> booleanExpression() {
			return getRuleContexts(BooleanExpressionContext.class);
		}
		public BooleanExpressionContext booleanExpression(int i) {
			return getRuleContext(BooleanExpressionContext.class,i);
		}
		public TerminalNode AND() { return getToken(sparkParser.AND, 0); }
		public TerminalNode OR() { return getToken(sparkParser.OR, 0); }
		public LogicalBinaryContext(BooleanExpressionContext ctx) { copyFrom(ctx); }
	}

	public final BooleanExpressionContext booleanExpression() throws RecognitionException {
		return booleanExpression(0);
	}

	private BooleanExpressionContext booleanExpression(int _p) throws RecognitionException {
		ParserRuleContext _parentctx = _ctx;
		int _parentState = getState();
		BooleanExpressionContext _localctx = new BooleanExpressionContext(_ctx, _parentState);
		BooleanExpressionContext _prevctx = _localctx;
		int _startState = 142;
		enterRecursionRule(_localctx, 142, RULE_booleanExpression, _p);
		try {
			int _alt;
			enterOuterAlt(_localctx, 1);
			{
			setState(1926);
			_errHandler.sync(this);
			switch ( getInterpreter().adaptivePredict(_input,257,_ctx) ) {
			case 1:
				{
				_localctx = new LogicalNotContext(_localctx);
				_ctx = _localctx;
				_prevctx = _localctx;

				setState(1915);
				match(NOT);
				setState(1916);
				booleanExpression(5);
				}
				break;
			case 2:
				{
				_localctx = new ExistsContext(_localctx);
				_ctx = _localctx;
				_prevctx = _localctx;
				setState(1917);
				match(EXISTS);
				setState(1918);
				match(T__0);
				setState(1919);
				query();
				setState(1920);
				match(T__1);
				}
				break;
			case 3:
				{
				_localctx = new PredicatedContext(_localctx);
				_ctx = _localctx;
				_prevctx = _localctx;
				setState(1922);
				valueExpression(0);
				setState(1924);
				_errHandler.sync(this);
				switch ( getInterpreter().adaptivePredict(_input,256,_ctx) ) {
				case 1:
					{
					setState(1923);
					predicate();
					}
					break;
				}
				}
				break;
			}
			_ctx.stop = _input.LT(-1);
			setState(1936);
			_errHandler.sync(this);
			_alt = getInterpreter().adaptivePredict(_input,259,_ctx);
			while ( _alt!=2 && _alt!=org.antlr.v4.runtime.atn.ATN.INVALID_ALT_NUMBER ) {
				if ( _alt==1 ) {
					if ( _parseListeners!=null ) triggerExitRuleEvent();
					_prevctx = _localctx;
					{
					setState(1934);
					_errHandler.sync(this);
					switch ( getInterpreter().adaptivePredict(_input,258,_ctx) ) {
					case 1:
						{
						_localctx = new LogicalBinaryContext(new BooleanExpressionContext(_parentctx, _parentState));
						((LogicalBinaryContext)_localctx).left = _prevctx;
						pushNewRecursionContext(_localctx, _startState, RULE_booleanExpression);
						setState(1928);
						if (!(precpred(_ctx, 2))) throw new FailedPredicateException(this, "precpred(_ctx, 2)");
						setState(1929);
						((LogicalBinaryContext)_localctx).operator = match(AND);
						setState(1930);
						((LogicalBinaryContext)_localctx).right = booleanExpression(3);
						}
						break;
					case 2:
						{
						_localctx = new LogicalBinaryContext(new BooleanExpressionContext(_parentctx, _parentState));
						((LogicalBinaryContext)_localctx).left = _prevctx;
						pushNewRecursionContext(_localctx, _startState, RULE_booleanExpression);
						setState(1931);
						if (!(precpred(_ctx, 1))) throw new FailedPredicateException(this, "precpred(_ctx, 1)");
						setState(1932);
						((LogicalBinaryContext)_localctx).operator = match(OR);
						setState(1933);
						((LogicalBinaryContext)_localctx).right = booleanExpression(2);
						}
						break;
					}
					} 
				}
				setState(1938);
				_errHandler.sync(this);
				_alt = getInterpreter().adaptivePredict(_input,259,_ctx);
			}
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			unrollRecursionContexts(_parentctx);
		}
		return _localctx;
	}

	public static class PredicateContext extends ParserRuleContext {
		public Token kind;
		public ValueExpressionContext lower;
		public ValueExpressionContext upper;
		public ValueExpressionContext pattern;
		public ValueExpressionContext right;
		public TerminalNode AND() { return getToken(sparkParser.AND, 0); }
		public TerminalNode BETWEEN() { return getToken(sparkParser.BETWEEN, 0); }
		public List<ValueExpressionContext> valueExpression() {
			return getRuleContexts(ValueExpressionContext.class);
		}
		public ValueExpressionContext valueExpression(int i) {
			return getRuleContext(ValueExpressionContext.class,i);
		}
		public TerminalNode NOT() { return getToken(sparkParser.NOT, 0); }
		public List<ExpressionContext> expression() {
			return getRuleContexts(ExpressionContext.class);
		}
		public ExpressionContext expression(int i) {
			return getRuleContext(ExpressionContext.class,i);
		}
		public TerminalNode IN() { return getToken(sparkParser.IN, 0); }
		public QueryContext query() {
			return getRuleContext(QueryContext.class,0);
		}
		public TerminalNode RLIKE() { return getToken(sparkParser.RLIKE, 0); }
		public TerminalNode LIKE() { return getToken(sparkParser.LIKE, 0); }
		public TerminalNode IS() { return getToken(sparkParser.IS, 0); }
		public TerminalNode NULL() { return getToken(sparkParser.NULL, 0); }
		public TerminalNode FROM() { return getToken(sparkParser.FROM, 0); }
		public TerminalNode DISTINCT() { return getToken(sparkParser.DISTINCT, 0); }
		public PredicateContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_predicate; }
	}

	public final PredicateContext predicate() throws RecognitionException {
		PredicateContext _localctx = new PredicateContext(_ctx, getState());
		enterRule(_localctx, 144, RULE_predicate);
		int _la;
		try {
			setState(1987);
			_errHandler.sync(this);
			switch ( getInterpreter().adaptivePredict(_input,267,_ctx) ) {
			case 1:
				enterOuterAlt(_localctx, 1);
				{
				setState(1940);
				_errHandler.sync(this);
				_la = _input.LA(1);
				if (_la==NOT) {
					{
					setState(1939);
					match(NOT);
					}
				}

				setState(1942);
				((PredicateContext)_localctx).kind = match(BETWEEN);
				setState(1943);
				((PredicateContext)_localctx).lower = valueExpression(0);
				setState(1944);
				match(AND);
				setState(1945);
				((PredicateContext)_localctx).upper = valueExpression(0);
				}
				break;
			case 2:
				enterOuterAlt(_localctx, 2);
				{
				setState(1948);
				_errHandler.sync(this);
				_la = _input.LA(1);
				if (_la==NOT) {
					{
					setState(1947);
					match(NOT);
					}
				}

				setState(1950);
				((PredicateContext)_localctx).kind = match(IN);
				setState(1951);
				match(T__0);
				setState(1952);
				expression();
				setState(1957);
				_errHandler.sync(this);
				_la = _input.LA(1);
				while (_la==T__2) {
					{
					{
					setState(1953);
					match(T__2);
					setState(1954);
					expression();
					}
					}
					setState(1959);
					_errHandler.sync(this);
					_la = _input.LA(1);
				}
				setState(1960);
				match(T__1);
				}
				break;
			case 3:
				enterOuterAlt(_localctx, 3);
				{
				setState(1963);
				_errHandler.sync(this);
				_la = _input.LA(1);
				if (_la==NOT) {
					{
					setState(1962);
					match(NOT);
					}
				}

				setState(1965);
				((PredicateContext)_localctx).kind = match(IN);
				setState(1966);
				match(T__0);
				setState(1967);
				query();
				setState(1968);
				match(T__1);
				}
				break;
			case 4:
				enterOuterAlt(_localctx, 4);
				{
				setState(1971);
				_errHandler.sync(this);
				_la = _input.LA(1);
				if (_la==NOT) {
					{
					setState(1970);
					match(NOT);
					}
				}

				setState(1973);
				((PredicateContext)_localctx).kind = _input.LT(1);
				_la = _input.LA(1);
				if ( !(_la==LIKE || _la==RLIKE) ) {
					((PredicateContext)_localctx).kind = (Token)_errHandler.recoverInline(this);
				}
				else {
					if ( _input.LA(1)==Token.EOF ) matchedEOF = true;
					_errHandler.reportMatch(this);
					consume();
				}
				setState(1974);
				((PredicateContext)_localctx).pattern = valueExpression(0);
				}
				break;
			case 5:
				enterOuterAlt(_localctx, 5);
				{
				setState(1975);
				match(IS);
				setState(1977);
				_errHandler.sync(this);
				_la = _input.LA(1);
				if (_la==NOT) {
					{
					setState(1976);
					match(NOT);
					}
				}

				setState(1979);
				((PredicateContext)_localctx).kind = match(NULL);
				}
				break;
			case 6:
				enterOuterAlt(_localctx, 6);
				{
				setState(1980);
				match(IS);
				setState(1982);
				_errHandler.sync(this);
				_la = _input.LA(1);
				if (_la==NOT) {
					{
					setState(1981);
					match(NOT);
					}
				}

				setState(1984);
				((PredicateContext)_localctx).kind = match(DISTINCT);
				setState(1985);
				match(FROM);
				setState(1986);
				((PredicateContext)_localctx).right = valueExpression(0);
				}
				break;
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static class ValueExpressionContext extends ParserRuleContext {
		public ValueExpressionContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_valueExpression; }
	 
		public ValueExpressionContext() { }
		public void copyFrom(ValueExpressionContext ctx) {
			super.copyFrom(ctx);
		}
	}
	public static class ValueExpressionDefaultContext extends ValueExpressionContext {
		public PrimaryExpressionContext primaryExpression() {
			return getRuleContext(PrimaryExpressionContext.class,0);
		}
		public ValueExpressionDefaultContext(ValueExpressionContext ctx) { copyFrom(ctx); }
	}
	public static class ComparisonContext extends ValueExpressionContext {
		public ValueExpressionContext left;
		public ValueExpressionContext right;
		public ComparisonOperatorContext comparisonOperator() {
			return getRuleContext(ComparisonOperatorContext.class,0);
		}
		public List<ValueExpressionContext> valueExpression() {
			return getRuleContexts(ValueExpressionContext.class);
		}
		public ValueExpressionContext valueExpression(int i) {
			return getRuleContext(ValueExpressionContext.class,i);
		}
		public ComparisonContext(ValueExpressionContext ctx) { copyFrom(ctx); }
	}
	public static class ArithmeticBinaryContext extends ValueExpressionContext {
		public ValueExpressionContext left;
		public Token operator;
		public ValueExpressionContext right;
		public List<ValueExpressionContext> valueExpression() {
			return getRuleContexts(ValueExpressionContext.class);
		}
		public ValueExpressionContext valueExpression(int i) {
			return getRuleContext(ValueExpressionContext.class,i);
		}
		public TerminalNode ASTERISK() { return getToken(sparkParser.ASTERISK, 0); }
		public TerminalNode SLASH() { return getToken(sparkParser.SLASH, 0); }
		public TerminalNode PERCENT() { return getToken(sparkParser.PERCENT, 0); }
		public TerminalNode DIV() { return getToken(sparkParser.DIV, 0); }
		public TerminalNode PLUS() { return getToken(sparkParser.PLUS, 0); }
		public TerminalNode MINUS() { return getToken(sparkParser.MINUS, 0); }
		public TerminalNode CONCAT_PIPE() { return getToken(sparkParser.CONCAT_PIPE, 0); }
		public TerminalNode AMPERSAND() { return getToken(sparkParser.AMPERSAND, 0); }
		public TerminalNode HAT() { return getToken(sparkParser.HAT, 0); }
		public TerminalNode PIPE() { return getToken(sparkParser.PIPE, 0); }
		public ArithmeticBinaryContext(ValueExpressionContext ctx) { copyFrom(ctx); }
	}
	public static class ArithmeticUnaryContext extends ValueExpressionContext {
		public Token operator;
		public ValueExpressionContext valueExpression() {
			return getRuleContext(ValueExpressionContext.class,0);
		}
		public TerminalNode MINUS() { return getToken(sparkParser.MINUS, 0); }
		public TerminalNode PLUS() { return getToken(sparkParser.PLUS, 0); }
		public TerminalNode TILDE() { return getToken(sparkParser.TILDE, 0); }
		public ArithmeticUnaryContext(ValueExpressionContext ctx) { copyFrom(ctx); }
	}

	public final ValueExpressionContext valueExpression() throws RecognitionException {
		return valueExpression(0);
	}

	private ValueExpressionContext valueExpression(int _p) throws RecognitionException {
		ParserRuleContext _parentctx = _ctx;
		int _parentState = getState();
		ValueExpressionContext _localctx = new ValueExpressionContext(_ctx, _parentState);
		ValueExpressionContext _prevctx = _localctx;
		int _startState = 146;
		enterRecursionRule(_localctx, 146, RULE_valueExpression, _p);
		int _la;
		try {
			int _alt;
			enterOuterAlt(_localctx, 1);
			{
			setState(1993);
			_errHandler.sync(this);
			switch ( getInterpreter().adaptivePredict(_input,268,_ctx) ) {
			case 1:
				{
				_localctx = new ValueExpressionDefaultContext(_localctx);
				_ctx = _localctx;
				_prevctx = _localctx;

				setState(1990);
				primaryExpression(0);
				}
				break;
			case 2:
				{
				_localctx = new ArithmeticUnaryContext(_localctx);
				_ctx = _localctx;
				_prevctx = _localctx;
				setState(1991);
				((ArithmeticUnaryContext)_localctx).operator = _input.LT(1);
				_la = _input.LA(1);
				if ( !(((((_la - 138)) & ~0x3f) == 0 && ((1L << (_la - 138)) & ((1L << (PLUS - 138)) | (1L << (MINUS - 138)) | (1L << (TILDE - 138)))) != 0)) ) {
					((ArithmeticUnaryContext)_localctx).operator = (Token)_errHandler.recoverInline(this);
				}
				else {
					if ( _input.LA(1)==Token.EOF ) matchedEOF = true;
					_errHandler.reportMatch(this);
					consume();
				}
				setState(1992);
				valueExpression(7);
				}
				break;
			}
			_ctx.stop = _input.LT(-1);
			setState(2016);
			_errHandler.sync(this);
			_alt = getInterpreter().adaptivePredict(_input,270,_ctx);
			while ( _alt!=2 && _alt!=org.antlr.v4.runtime.atn.ATN.INVALID_ALT_NUMBER ) {
				if ( _alt==1 ) {
					if ( _parseListeners!=null ) triggerExitRuleEvent();
					_prevctx = _localctx;
					{
					setState(2014);
					_errHandler.sync(this);
					switch ( getInterpreter().adaptivePredict(_input,269,_ctx) ) {
					case 1:
						{
						_localctx = new ArithmeticBinaryContext(new ValueExpressionContext(_parentctx, _parentState));
						((ArithmeticBinaryContext)_localctx).left = _prevctx;
						pushNewRecursionContext(_localctx, _startState, RULE_valueExpression);
						setState(1995);
						if (!(precpred(_ctx, 6))) throw new FailedPredicateException(this, "precpred(_ctx, 6)");
						setState(1996);
						((ArithmeticBinaryContext)_localctx).operator = _input.LT(1);
						_la = _input.LA(1);
						if ( !(((((_la - 140)) & ~0x3f) == 0 && ((1L << (_la - 140)) & ((1L << (ASTERISK - 140)) | (1L << (SLASH - 140)) | (1L << (PERCENT - 140)) | (1L << (DIV - 140)))) != 0)) ) {
							((ArithmeticBinaryContext)_localctx).operator = (Token)_errHandler.recoverInline(this);
						}
						else {
							if ( _input.LA(1)==Token.EOF ) matchedEOF = true;
							_errHandler.reportMatch(this);
							consume();
						}
						setState(1997);
						((ArithmeticBinaryContext)_localctx).right = valueExpression(7);
						}
						break;
					case 2:
						{
						_localctx = new ArithmeticBinaryContext(new ValueExpressionContext(_parentctx, _parentState));
						((ArithmeticBinaryContext)_localctx).left = _prevctx;
						pushNewRecursionContext(_localctx, _startState, RULE_valueExpression);
						setState(1998);
						if (!(precpred(_ctx, 5))) throw new FailedPredicateException(this, "precpred(_ctx, 5)");
						setState(1999);
						((ArithmeticBinaryContext)_localctx).operator = _input.LT(1);
						_la = _input.LA(1);
						if ( !(((((_la - 138)) & ~0x3f) == 0 && ((1L << (_la - 138)) & ((1L << (PLUS - 138)) | (1L << (MINUS - 138)) | (1L << (CONCAT_PIPE - 138)))) != 0)) ) {
							((ArithmeticBinaryContext)_localctx).operator = (Token)_errHandler.recoverInline(this);
						}
						else {
							if ( _input.LA(1)==Token.EOF ) matchedEOF = true;
							_errHandler.reportMatch(this);
							consume();
						}
						setState(2000);
						((ArithmeticBinaryContext)_localctx).right = valueExpression(6);
						}
						break;
					case 3:
						{
						_localctx = new ArithmeticBinaryContext(new ValueExpressionContext(_parentctx, _parentState));
						((ArithmeticBinaryContext)_localctx).left = _prevctx;
						pushNewRecursionContext(_localctx, _startState, RULE_valueExpression);
						setState(2001);
						if (!(precpred(_ctx, 4))) throw new FailedPredicateException(this, "precpred(_ctx, 4)");
						setState(2002);
						((ArithmeticBinaryContext)_localctx).operator = match(AMPERSAND);
						setState(2003);
						((ArithmeticBinaryContext)_localctx).right = valueExpression(5);
						}
						break;
					case 4:
						{
						_localctx = new ArithmeticBinaryContext(new ValueExpressionContext(_parentctx, _parentState));
						((ArithmeticBinaryContext)_localctx).left = _prevctx;
						pushNewRecursionContext(_localctx, _startState, RULE_valueExpression);
						setState(2004);
						if (!(precpred(_ctx, 3))) throw new FailedPredicateException(this, "precpred(_ctx, 3)");
						setState(2005);
						((ArithmeticBinaryContext)_localctx).operator = match(HAT);
						setState(2006);
						((ArithmeticBinaryContext)_localctx).right = valueExpression(4);
						}
						break;
					case 5:
						{
						_localctx = new ArithmeticBinaryContext(new ValueExpressionContext(_parentctx, _parentState));
						((ArithmeticBinaryContext)_localctx).left = _prevctx;
						pushNewRecursionContext(_localctx, _startState, RULE_valueExpression);
						setState(2007);
						if (!(precpred(_ctx, 2))) throw new FailedPredicateException(this, "precpred(_ctx, 2)");
						setState(2008);
						((ArithmeticBinaryContext)_localctx).operator = match(PIPE);
						setState(2009);
						((ArithmeticBinaryContext)_localctx).right = valueExpression(3);
						}
						break;
					case 6:
						{
						_localctx = new ComparisonContext(new ValueExpressionContext(_parentctx, _parentState));
						((ComparisonContext)_localctx).left = _prevctx;
						pushNewRecursionContext(_localctx, _startState, RULE_valueExpression);
						setState(2010);
						if (!(precpred(_ctx, 1))) throw new FailedPredicateException(this, "precpred(_ctx, 1)");
						setState(2011);
						comparisonOperator();
						setState(2012);
						((ComparisonContext)_localctx).right = valueExpression(2);
						}
						break;
					}
					} 
				}
				setState(2018);
				_errHandler.sync(this);
				_alt = getInterpreter().adaptivePredict(_input,270,_ctx);
			}
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			unrollRecursionContexts(_parentctx);
		}
		return _localctx;
	}

	public static class PrimaryExpressionContext extends ParserRuleContext {
		public PrimaryExpressionContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_primaryExpression; }
	 
		public PrimaryExpressionContext() { }
		public void copyFrom(PrimaryExpressionContext ctx) {
			super.copyFrom(ctx);
		}
	}
	public static class StructContext extends PrimaryExpressionContext {
		public NamedExpressionContext namedExpression;
		public List<NamedExpressionContext> argument = new ArrayList<NamedExpressionContext>();
		public TerminalNode STRUCT() { return getToken(sparkParser.STRUCT, 0); }
		public List<NamedExpressionContext> namedExpression() {
			return getRuleContexts(NamedExpressionContext.class);
		}
		public NamedExpressionContext namedExpression(int i) {
			return getRuleContext(NamedExpressionContext.class,i);
		}
		public StructContext(PrimaryExpressionContext ctx) { copyFrom(ctx); }
	}
	public static class DereferenceContext extends PrimaryExpressionContext {
		public PrimaryExpressionContext base;
		public IdentifierContext fieldName;
		public PrimaryExpressionContext primaryExpression() {
			return getRuleContext(PrimaryExpressionContext.class,0);
		}
		public IdentifierContext identifier() {
			return getRuleContext(IdentifierContext.class,0);
		}
		public DereferenceContext(PrimaryExpressionContext ctx) { copyFrom(ctx); }
	}
	public static class SimpleCaseContext extends PrimaryExpressionContext {
		public ExpressionContext value;
		public ExpressionContext elseExpression;
		public TerminalNode CASE() { return getToken(sparkParser.CASE, 0); }
		public TerminalNode END() { return getToken(sparkParser.END, 0); }
		public List<ExpressionContext> expression() {
			return getRuleContexts(ExpressionContext.class);
		}
		public ExpressionContext expression(int i) {
			return getRuleContext(ExpressionContext.class,i);
		}
		public List<WhenClauseContext> whenClause() {
			return getRuleContexts(WhenClauseContext.class);
		}
		public WhenClauseContext whenClause(int i) {
			return getRuleContext(WhenClauseContext.class,i);
		}
		public TerminalNode ELSE() { return getToken(sparkParser.ELSE, 0); }
		public SimpleCaseContext(PrimaryExpressionContext ctx) { copyFrom(ctx); }
	}
	public static class ColumnReferenceContext extends PrimaryExpressionContext {
		public IdentifierContext identifier() {
			return getRuleContext(IdentifierContext.class,0);
		}
		public ColumnReferenceContext(PrimaryExpressionContext ctx) { copyFrom(ctx); }
	}
	public static class RowConstructorContext extends PrimaryExpressionContext {
		public List<NamedExpressionContext> namedExpression() {
			return getRuleContexts(NamedExpressionContext.class);
		}
		public NamedExpressionContext namedExpression(int i) {
			return getRuleContext(NamedExpressionContext.class,i);
		}
		public RowConstructorContext(PrimaryExpressionContext ctx) { copyFrom(ctx); }
	}
	public static class LastContext extends PrimaryExpressionContext {
		public TerminalNode LAST() { return getToken(sparkParser.LAST, 0); }
		public ExpressionContext expression() {
			return getRuleContext(ExpressionContext.class,0);
		}
		public TerminalNode IGNORE() { return getToken(sparkParser.IGNORE, 0); }
		public TerminalNode NULLS() { return getToken(sparkParser.NULLS, 0); }
		public LastContext(PrimaryExpressionContext ctx) { copyFrom(ctx); }
	}
	public static class StarContext extends PrimaryExpressionContext {
		public TerminalNode ASTERISK() { return getToken(sparkParser.ASTERISK, 0); }
		public QualifiedNameContext qualifiedName() {
			return getRuleContext(QualifiedNameContext.class,0);
		}
		public StarContext(PrimaryExpressionContext ctx) { copyFrom(ctx); }
	}
	public static class SubscriptContext extends PrimaryExpressionContext {
		public PrimaryExpressionContext value;
		public ValueExpressionContext index;
		public PrimaryExpressionContext primaryExpression() {
			return getRuleContext(PrimaryExpressionContext.class,0);
		}
		public ValueExpressionContext valueExpression() {
			return getRuleContext(ValueExpressionContext.class,0);
		}
		public SubscriptContext(PrimaryExpressionContext ctx) { copyFrom(ctx); }
	}
	public static class SubqueryExpressionContext extends PrimaryExpressionContext {
		public QueryContext query() {
			return getRuleContext(QueryContext.class,0);
		}
		public SubqueryExpressionContext(PrimaryExpressionContext ctx) { copyFrom(ctx); }
	}
	public static class CastContext extends PrimaryExpressionContext {
		public TerminalNode CAST() { return getToken(sparkParser.CAST, 0); }
		public ExpressionContext expression() {
			return getRuleContext(ExpressionContext.class,0);
		}
		public TerminalNode AS() { return getToken(sparkParser.AS, 0); }
		public DataTypeContext dataType() {
			return getRuleContext(DataTypeContext.class,0);
		}
		public CastContext(PrimaryExpressionContext ctx) { copyFrom(ctx); }
	}
	public static class ConstantDefaultContext extends PrimaryExpressionContext {
		public ConstantContext constant() {
			return getRuleContext(ConstantContext.class,0);
		}
		public ConstantDefaultContext(PrimaryExpressionContext ctx) { copyFrom(ctx); }
	}
	public static class LambdaContext extends PrimaryExpressionContext {
		public List<TerminalNode> IDENTIFIER() { return getTokens(sparkParser.IDENTIFIER); }
		public TerminalNode IDENTIFIER(int i) {
			return getToken(sparkParser.IDENTIFIER, i);
		}
		public ExpressionContext expression() {
			return getRuleContext(ExpressionContext.class,0);
		}
		public LambdaContext(PrimaryExpressionContext ctx) { copyFrom(ctx); }
	}
	public static class ParenthesizedExpressionContext extends PrimaryExpressionContext {
		public ExpressionContext expression() {
			return getRuleContext(ExpressionContext.class,0);
		}
		public ParenthesizedExpressionContext(PrimaryExpressionContext ctx) { copyFrom(ctx); }
	}
	public static class ExtractContext extends PrimaryExpressionContext {
		public IdentifierContext field;
		public ValueExpressionContext source;
		public TerminalNode EXTRACT() { return getToken(sparkParser.EXTRACT, 0); }
		public TerminalNode FROM() { return getToken(sparkParser.FROM, 0); }
		public IdentifierContext identifier() {
			return getRuleContext(IdentifierContext.class,0);
		}
		public ValueExpressionContext valueExpression() {
			return getRuleContext(ValueExpressionContext.class,0);
		}
		public ExtractContext(PrimaryExpressionContext ctx) { copyFrom(ctx); }
	}
	public static class FunctionCallContext extends PrimaryExpressionContext {
		public ExpressionContext expression;
		public List<ExpressionContext> argument = new ArrayList<ExpressionContext>();
		public Token trimOption;
		public QualifiedNameContext qualifiedName() {
			return getRuleContext(QualifiedNameContext.class,0);
		}
		public TerminalNode OVER() { return getToken(sparkParser.OVER, 0); }
		public WindowSpecContext windowSpec() {
			return getRuleContext(WindowSpecContext.class,0);
		}
		public List<ExpressionContext> expression() {
			return getRuleContexts(ExpressionContext.class);
		}
		public ExpressionContext expression(int i) {
			return getRuleContext(ExpressionContext.class,i);
		}
		public SetQuantifierContext setQuantifier() {
			return getRuleContext(SetQuantifierContext.class,0);
		}
		public TerminalNode FROM() { return getToken(sparkParser.FROM, 0); }
		public TerminalNode BOTH() { return getToken(sparkParser.BOTH, 0); }
		public TerminalNode LEADING() { return getToken(sparkParser.LEADING, 0); }
		public TerminalNode TRAILING() { return getToken(sparkParser.TRAILING, 0); }
		public FunctionCallContext(PrimaryExpressionContext ctx) { copyFrom(ctx); }
	}
	public static class SearchedCaseContext extends PrimaryExpressionContext {
		public ExpressionContext elseExpression;
		public TerminalNode CASE() { return getToken(sparkParser.CASE, 0); }
		public TerminalNode END() { return getToken(sparkParser.END, 0); }
		public List<WhenClauseContext> whenClause() {
			return getRuleContexts(WhenClauseContext.class);
		}
		public WhenClauseContext whenClause(int i) {
			return getRuleContext(WhenClauseContext.class,i);
		}
		public TerminalNode ELSE() { return getToken(sparkParser.ELSE, 0); }
		public ExpressionContext expression() {
			return getRuleContext(ExpressionContext.class,0);
		}
		public SearchedCaseContext(PrimaryExpressionContext ctx) { copyFrom(ctx); }
	}
	public static class PositionContext extends PrimaryExpressionContext {
		public ValueExpressionContext substr;
		public ValueExpressionContext str;
		public TerminalNode POSITION() { return getToken(sparkParser.POSITION, 0); }
		public TerminalNode IN() { return getToken(sparkParser.IN, 0); }
		public List<ValueExpressionContext> valueExpression() {
			return getRuleContexts(ValueExpressionContext.class);
		}
		public ValueExpressionContext valueExpression(int i) {
			return getRuleContext(ValueExpressionContext.class,i);
		}
		public PositionContext(PrimaryExpressionContext ctx) { copyFrom(ctx); }
	}
	public static class FirstContext extends PrimaryExpressionContext {
		public TerminalNode FIRST() { return getToken(sparkParser.FIRST, 0); }
		public ExpressionContext expression() {
			return getRuleContext(ExpressionContext.class,0);
		}
		public TerminalNode IGNORE() { return getToken(sparkParser.IGNORE, 0); }
		public TerminalNode NULLS() { return getToken(sparkParser.NULLS, 0); }
		public FirstContext(PrimaryExpressionContext ctx) { copyFrom(ctx); }
	}

	public final PrimaryExpressionContext primaryExpression() throws RecognitionException {
		return primaryExpression(0);
	}

	private PrimaryExpressionContext primaryExpression(int _p) throws RecognitionException {
		ParserRuleContext _parentctx = _ctx;
		int _parentState = getState();
		PrimaryExpressionContext _localctx = new PrimaryExpressionContext(_ctx, _parentState);
		PrimaryExpressionContext _prevctx = _localctx;
		int _startState = 148;
		enterRecursionRule(_localctx, 148, RULE_primaryExpression, _p);
		int _la;
		try {
			int _alt;
			enterOuterAlt(_localctx, 1);
			{
			setState(2164);
			_errHandler.sync(this);
			switch ( getInterpreter().adaptivePredict(_input,285,_ctx) ) {
			case 1:
				{
				_localctx = new SearchedCaseContext(_localctx);
				_ctx = _localctx;
				_prevctx = _localctx;

				setState(2020);
				match(CASE);
				setState(2022); 
				_errHandler.sync(this);
				_la = _input.LA(1);
				do {
					{
					{
					setState(2021);
					whenClause();
					}
					}
					setState(2024); 
					_errHandler.sync(this);
					_la = _input.LA(1);
				} while ( _la==WHEN );
				setState(2028);
				_errHandler.sync(this);
				_la = _input.LA(1);
				if (_la==ELSE) {
					{
					setState(2026);
					match(ELSE);
					setState(2027);
					((SearchedCaseContext)_localctx).elseExpression = expression();
					}
				}

				setState(2030);
				match(END);
				}
				break;
			case 2:
				{
				_localctx = new SimpleCaseContext(_localctx);
				_ctx = _localctx;
				_prevctx = _localctx;
				setState(2032);
				match(CASE);
				setState(2033);
				((SimpleCaseContext)_localctx).value = expression();
				setState(2035); 
				_errHandler.sync(this);
				_la = _input.LA(1);
				do {
					{
					{
					setState(2034);
					whenClause();
					}
					}
					setState(2037); 
					_errHandler.sync(this);
					_la = _input.LA(1);
				} while ( _la==WHEN );
				setState(2041);
				_errHandler.sync(this);
				_la = _input.LA(1);
				if (_la==ELSE) {
					{
					setState(2039);
					match(ELSE);
					setState(2040);
					((SimpleCaseContext)_localctx).elseExpression = expression();
					}
				}

				setState(2043);
				match(END);
				}
				break;
			case 3:
				{
				_localctx = new CastContext(_localctx);
				_ctx = _localctx;
				_prevctx = _localctx;
				setState(2045);
				match(CAST);
				setState(2046);
				match(T__0);
				setState(2047);
				expression();
				setState(2048);
				match(AS);
				setState(2049);
				dataType();
				setState(2050);
				match(T__1);
				}
				break;
			case 4:
				{
				_localctx = new StructContext(_localctx);
				_ctx = _localctx;
				_prevctx = _localctx;
				setState(2052);
				match(STRUCT);
				setState(2053);
				match(T__0);
				setState(2062);
				_errHandler.sync(this);
				_la = _input.LA(1);
				if ((((_la) & ~0x3f) == 0 && ((1L << _la) & ((1L << T__0) | (1L << SELECT) | (1L << FROM) | (1L << ADD) | (1L << AS) | (1L << ALL) | (1L << ANY) | (1L << DISTINCT) | (1L << WHERE) | (1L << GROUP) | (1L << BY) | (1L << GROUPING) | (1L << SETS) | (1L << CUBE) | (1L << ROLLUP) | (1L << ORDER) | (1L << HAVING) | (1L << LIMIT) | (1L << AT) | (1L << OR) | (1L << AND) | (1L << IN) | (1L << NOT) | (1L << NO) | (1L << EXISTS) | (1L << BETWEEN) | (1L << LIKE) | (1L << RLIKE) | (1L << IS) | (1L << NULL) | (1L << TRUE) | (1L << FALSE) | (1L << NULLS) | (1L << ASC) | (1L << DESC) | (1L << FOR) | (1L << INTERVAL) | (1L << CASE) | (1L << WHEN) | (1L << THEN) | (1L << ELSE) | (1L << END) | (1L << JOIN) | (1L << CROSS) | (1L << OUTER) | (1L << INNER) | (1L << LEFT) | (1L << SEMI) | (1L << RIGHT) | (1L << FULL) | (1L << NATURAL) | (1L << ON) | (1L << PIVOT) | (1L << LATERAL))) != 0) || ((((_la - 64)) & ~0x3f) == 0 && ((1L << (_la - 64)) & ((1L << (WINDOW - 64)) | (1L << (OVER - 64)) | (1L << (PARTITION - 64)) | (1L << (RANGE - 64)) | (1L << (ROWS - 64)) | (1L << (UNBOUNDED - 64)) | (1L << (PRECEDING - 64)) | (1L << (FOLLOWING - 64)) | (1L << (CURRENT - 64)) | (1L << (FIRST - 64)) | (1L << (AFTER - 64)) | (1L << (LAST - 64)) | (1L << (ROW - 64)) | (1L << (WITH - 64)) | (1L << (VALUES - 64)) | (1L << (CREATE - 64)) | (1L << (TABLE - 64)) | (1L << (DIRECTORY - 64)) | (1L << (VIEW - 64)) | (1L << (REPLACE - 64)) | (1L << (INSERT - 64)) | (1L << (DELETE - 64)) | (1L << (INTO - 64)) | (1L << (DESCRIBE - 64)) | (1L << (EXPLAIN - 64)) | (1L << (FORMAT - 64)) | (1L << (LOGICAL - 64)) | (1L << (CODEGEN - 64)) | (1L << (COST - 64)) | (1L << (CAST - 64)) | (1L << (SHOW - 64)) | (1L << (TABLES - 64)) | (1L << (COLUMNS - 64)) | (1L << (COLUMN - 64)) | (1L << (USE - 64)) | (1L << (PARTITIONS - 64)) | (1L << (FUNCTIONS - 64)) | (1L << (DROP - 64)) | (1L << (UNION - 64)) | (1L << (EXCEPT - 64)) | (1L << (SETMINUS - 64)) | (1L << (INTERSECT - 64)) | (1L << (TO - 64)) | (1L << (TABLESAMPLE - 64)) | (1L << (STRATIFY - 64)) | (1L << (ALTER - 64)) | (1L << (RENAME - 64)) | (1L << (ARRAY - 64)) | (1L << (MAP - 64)) | (1L << (STRUCT - 64)) | (1L << (COMMENT - 64)) | (1L << (SET - 64)) | (1L << (RESET - 64)) | (1L << (DATA - 64)) | (1L << (START - 64)) | (1L << (TRANSACTION - 64)) | (1L << (COMMIT - 64)) | (1L << (ROLLBACK - 64)) | (1L << (MACRO - 64)) | (1L << (IGNORE - 64)) | (1L << (BOTH - 64)) | (1L << (LEADING - 64)) | (1L << (TRAILING - 64)) | (1L << (IF - 64)))) != 0) || ((((_la - 128)) & ~0x3f) == 0 && ((1L << (_la - 128)) & ((1L << (POSITION - 128)) | (1L << (EXTRACT - 128)) | (1L << (PLUS - 128)) | (1L << (MINUS - 128)) | (1L << (ASTERISK - 128)) | (1L << (DIV - 128)) | (1L << (TILDE - 128)) | (1L << (PERCENTLIT - 128)) | (1L << (BUCKET - 128)) | (1L << (OUT - 128)) | (1L << (OF - 128)) | (1L << (SORT - 128)) | (1L << (CLUSTER - 128)) | (1L << (DISTRIBUTE - 128)) | (1L << (OVERWRITE - 128)) | (1L << (TRANSFORM - 128)) | (1L << (REDUCE - 128)) | (1L << (SERDE - 128)) | (1L << (SERDEPROPERTIES - 128)) | (1L << (RECORDREADER - 128)) | (1L << (RECORDWRITER - 128)) | (1L << (DELIMITED - 128)) | (1L << (FIELDS - 128)) | (1L << (TERMINATED - 128)) | (1L << (COLLECTION - 128)) | (1L << (ITEMS - 128)) | (1L << (KEYS - 128)) | (1L << (ESCAPED - 128)) | (1L << (LINES - 128)) | (1L << (SEPARATED - 128)) | (1L << (FUNCTION - 128)) | (1L << (EXTENDED - 128)) | (1L << (REFRESH - 128)) | (1L << (CLEAR - 128)) | (1L << (CACHE - 128)) | (1L << (UNCACHE - 128)) | (1L << (LAZY - 128)) | (1L << (FORMATTED - 128)) | (1L << (GLOBAL - 128)) | (1L << (TEMPORARY - 128)) | (1L << (OPTIONS - 128)) | (1L << (UNSET - 128)) | (1L << (TBLPROPERTIES - 128)) | (1L << (DBPROPERTIES - 128)) | (1L << (BUCKETS - 128)) | (1L << (SKEWED - 128)) | (1L << (STORED - 128)) | (1L << (DIRECTORIES - 128)) | (1L << (LOCATION - 128)))) != 0) || ((((_la - 192)) & ~0x3f) == 0 && ((1L << (_la - 192)) & ((1L << (EXCHANGE - 192)) | (1L << (ARCHIVE - 192)) | (1L << (UNARCHIVE - 192)) | (1L << (FILEFORMAT - 192)) | (1L << (TOUCH - 192)) | (1L << (COMPACT - 192)) | (1L << (CONCATENATE - 192)) | (1L << (CHANGE - 192)) | (1L << (CASCADE - 192)) | (1L << (RESTRICT - 192)) | (1L << (CLUSTERED - 192)) | (1L << (SORTED - 192)) | (1L << (PURGE - 192)) | (1L << (INPUTFORMAT - 192)) | (1L << (OUTPUTFORMAT - 192)) | (1L << (DATABASE - 192)) | (1L << (DATABASES - 192)) | (1L << (DFS - 192)) | (1L << (TRUNCATE - 192)) | (1L << (ANALYZE - 192)) | (1L << (COMPUTE - 192)) | (1L << (LIST - 192)) | (1L << (STATISTICS - 192)) | (1L << (PARTITIONED - 192)) | (1L << (EXTERNAL - 192)) | (1L << (DEFINED - 192)) | (1L << (REVOKE - 192)) | (1L << (GRANT - 192)) | (1L << (LOCK - 192)) | (1L << (UNLOCK - 192)) | (1L << (MSCK - 192)) | (1L << (REPAIR - 192)) | (1L << (RECOVER - 192)) | (1L << (EXPORT - 192)) | (1L << (IMPORT - 192)) | (1L << (LOAD - 192)) | (1L << (ROLE - 192)) | (1L << (ROLES - 192)) | (1L << (COMPACTIONS - 192)) | (1L << (PRINCIPALS - 192)) | (1L << (TRANSACTIONS - 192)) | (1L << (INDEX - 192)) | (1L << (INDEXES - 192)) | (1L << (LOCKS - 192)) | (1L << (OPTION - 192)) | (1L << (ANTI - 192)) | (1L << (LOCAL - 192)) | (1L << (INPATH - 192)) | (1L << (STRING - 192)) | (1L << (BIGINT_LITERAL - 192)) | (1L << (SMALLINT_LITERAL - 192)) | (1L << (TINYINT_LITERAL - 192)) | (1L << (INTEGER_VALUE - 192)) | (1L << (DECIMAL_VALUE - 192)) | (1L << (DOUBLE_LITERAL - 192)) | (1L << (BIGDECIMAL_LITERAL - 192)) | (1L << (IDENTIFIER - 192)) | (1L << (BACKQUOTED_IDENTIFIER - 192)))) != 0)) {
					{
					setState(2054);
					((StructContext)_localctx).namedExpression = namedExpression();
					((StructContext)_localctx).argument.add(((StructContext)_localctx).namedExpression);
					setState(2059);
					_errHandler.sync(this);
					_la = _input.LA(1);
					while (_la==T__2) {
						{
						{
						setState(2055);
						match(T__2);
						setState(2056);
						((StructContext)_localctx).namedExpression = namedExpression();
						((StructContext)_localctx).argument.add(((StructContext)_localctx).namedExpression);
						}
						}
						setState(2061);
						_errHandler.sync(this);
						_la = _input.LA(1);
					}
					}
				}

				setState(2064);
				match(T__1);
				}
				break;
			case 5:
				{
				_localctx = new FirstContext(_localctx);
				_ctx = _localctx;
				_prevctx = _localctx;
				setState(2065);
				match(FIRST);
				setState(2066);
				match(T__0);
				setState(2067);
				expression();
				setState(2070);
				_errHandler.sync(this);
				_la = _input.LA(1);
				if (_la==IGNORE) {
					{
					setState(2068);
					match(IGNORE);
					setState(2069);
					match(NULLS);
					}
				}

				setState(2072);
				match(T__1);
				}
				break;
			case 6:
				{
				_localctx = new LastContext(_localctx);
				_ctx = _localctx;
				_prevctx = _localctx;
				setState(2074);
				match(LAST);
				setState(2075);
				match(T__0);
				setState(2076);
				expression();
				setState(2079);
				_errHandler.sync(this);
				_la = _input.LA(1);
				if (_la==IGNORE) {
					{
					setState(2077);
					match(IGNORE);
					setState(2078);
					match(NULLS);
					}
				}

				setState(2081);
				match(T__1);
				}
				break;
			case 7:
				{
				_localctx = new PositionContext(_localctx);
				_ctx = _localctx;
				_prevctx = _localctx;
				setState(2083);
				match(POSITION);
				setState(2084);
				match(T__0);
				setState(2085);
				((PositionContext)_localctx).substr = valueExpression(0);
				setState(2086);
				match(IN);
				setState(2087);
				((PositionContext)_localctx).str = valueExpression(0);
				setState(2088);
				match(T__1);
				}
				break;
			case 8:
				{
				_localctx = new ConstantDefaultContext(_localctx);
				_ctx = _localctx;
				_prevctx = _localctx;
				setState(2090);
				constant();
				}
				break;
			case 9:
				{
				_localctx = new StarContext(_localctx);
				_ctx = _localctx;
				_prevctx = _localctx;
				setState(2091);
				match(ASTERISK);
				}
				break;
			case 10:
				{
				_localctx = new StarContext(_localctx);
				_ctx = _localctx;
				_prevctx = _localctx;
				setState(2092);
				qualifiedName();
				setState(2093);
				match(T__3);
				setState(2094);
				match(ASTERISK);
				}
				break;
			case 11:
				{
				_localctx = new RowConstructorContext(_localctx);
				_ctx = _localctx;
				_prevctx = _localctx;
				setState(2096);
				match(T__0);
				setState(2097);
				namedExpression();
				setState(2100); 
				_errHandler.sync(this);
				_la = _input.LA(1);
				do {
					{
					{
					setState(2098);
					match(T__2);
					setState(2099);
					namedExpression();
					}
					}
					setState(2102); 
					_errHandler.sync(this);
					_la = _input.LA(1);
				} while ( _la==T__2 );
				setState(2104);
				match(T__1);
				}
				break;
			case 12:
				{
				_localctx = new SubqueryExpressionContext(_localctx);
				_ctx = _localctx;
				_prevctx = _localctx;
				setState(2106);
				match(T__0);
				setState(2107);
				query();
				setState(2108);
				match(T__1);
				}
				break;
			case 13:
				{
				_localctx = new FunctionCallContext(_localctx);
				_ctx = _localctx;
				_prevctx = _localctx;
				setState(2110);
				qualifiedName();
				setState(2111);
				match(T__0);
				setState(2123);
				_errHandler.sync(this);
				_la = _input.LA(1);
				if ((((_la) & ~0x3f) == 0 && ((1L << _la) & ((1L << T__0) | (1L << SELECT) | (1L << FROM) | (1L << ADD) | (1L << AS) | (1L << ALL) | (1L << ANY) | (1L << DISTINCT) | (1L << WHERE) | (1L << GROUP) | (1L << BY) | (1L << GROUPING) | (1L << SETS) | (1L << CUBE) | (1L << ROLLUP) | (1L << ORDER) | (1L << HAVING) | (1L << LIMIT) | (1L << AT) | (1L << OR) | (1L << AND) | (1L << IN) | (1L << NOT) | (1L << NO) | (1L << EXISTS) | (1L << BETWEEN) | (1L << LIKE) | (1L << RLIKE) | (1L << IS) | (1L << NULL) | (1L << TRUE) | (1L << FALSE) | (1L << NULLS) | (1L << ASC) | (1L << DESC) | (1L << FOR) | (1L << INTERVAL) | (1L << CASE) | (1L << WHEN) | (1L << THEN) | (1L << ELSE) | (1L << END) | (1L << JOIN) | (1L << CROSS) | (1L << OUTER) | (1L << INNER) | (1L << LEFT) | (1L << SEMI) | (1L << RIGHT) | (1L << FULL) | (1L << NATURAL) | (1L << ON) | (1L << PIVOT) | (1L << LATERAL))) != 0) || ((((_la - 64)) & ~0x3f) == 0 && ((1L << (_la - 64)) & ((1L << (WINDOW - 64)) | (1L << (OVER - 64)) | (1L << (PARTITION - 64)) | (1L << (RANGE - 64)) | (1L << (ROWS - 64)) | (1L << (UNBOUNDED - 64)) | (1L << (PRECEDING - 64)) | (1L << (FOLLOWING - 64)) | (1L << (CURRENT - 64)) | (1L << (FIRST - 64)) | (1L << (AFTER - 64)) | (1L << (LAST - 64)) | (1L << (ROW - 64)) | (1L << (WITH - 64)) | (1L << (VALUES - 64)) | (1L << (CREATE - 64)) | (1L << (TABLE - 64)) | (1L << (DIRECTORY - 64)) | (1L << (VIEW - 64)) | (1L << (REPLACE - 64)) | (1L << (INSERT - 64)) | (1L << (DELETE - 64)) | (1L << (INTO - 64)) | (1L << (DESCRIBE - 64)) | (1L << (EXPLAIN - 64)) | (1L << (FORMAT - 64)) | (1L << (LOGICAL - 64)) | (1L << (CODEGEN - 64)) | (1L << (COST - 64)) | (1L << (CAST - 64)) | (1L << (SHOW - 64)) | (1L << (TABLES - 64)) | (1L << (COLUMNS - 64)) | (1L << (COLUMN - 64)) | (1L << (USE - 64)) | (1L << (PARTITIONS - 64)) | (1L << (FUNCTIONS - 64)) | (1L << (DROP - 64)) | (1L << (UNION - 64)) | (1L << (EXCEPT - 64)) | (1L << (SETMINUS - 64)) | (1L << (INTERSECT - 64)) | (1L << (TO - 64)) | (1L << (TABLESAMPLE - 64)) | (1L << (STRATIFY - 64)) | (1L << (ALTER - 64)) | (1L << (RENAME - 64)) | (1L << (ARRAY - 64)) | (1L << (MAP - 64)) | (1L << (STRUCT - 64)) | (1L << (COMMENT - 64)) | (1L << (SET - 64)) | (1L << (RESET - 64)) | (1L << (DATA - 64)) | (1L << (START - 64)) | (1L << (TRANSACTION - 64)) | (1L << (COMMIT - 64)) | (1L << (ROLLBACK - 64)) | (1L << (MACRO - 64)) | (1L << (IGNORE - 64)) | (1L << (BOTH - 64)) | (1L << (LEADING - 64)) | (1L << (TRAILING - 64)) | (1L << (IF - 64)))) != 0) || ((((_la - 128)) & ~0x3f) == 0 && ((1L << (_la - 128)) & ((1L << (POSITION - 128)) | (1L << (EXTRACT - 128)) | (1L << (PLUS - 128)) | (1L << (MINUS - 128)) | (1L << (ASTERISK - 128)) | (1L << (DIV - 128)) | (1L << (TILDE - 128)) | (1L << (PERCENTLIT - 128)) | (1L << (BUCKET - 128)) | (1L << (OUT - 128)) | (1L << (OF - 128)) | (1L << (SORT - 128)) | (1L << (CLUSTER - 128)) | (1L << (DISTRIBUTE - 128)) | (1L << (OVERWRITE - 128)) | (1L << (TRANSFORM - 128)) | (1L << (REDUCE - 128)) | (1L << (SERDE - 128)) | (1L << (SERDEPROPERTIES - 128)) | (1L << (RECORDREADER - 128)) | (1L << (RECORDWRITER - 128)) | (1L << (DELIMITED - 128)) | (1L << (FIELDS - 128)) | (1L << (TERMINATED - 128)) | (1L << (COLLECTION - 128)) | (1L << (ITEMS - 128)) | (1L << (KEYS - 128)) | (1L << (ESCAPED - 128)) | (1L << (LINES - 128)) | (1L << (SEPARATED - 128)) | (1L << (FUNCTION - 128)) | (1L << (EXTENDED - 128)) | (1L << (REFRESH - 128)) | (1L << (CLEAR - 128)) | (1L << (CACHE - 128)) | (1L << (UNCACHE - 128)) | (1L << (LAZY - 128)) | (1L << (FORMATTED - 128)) | (1L << (GLOBAL - 128)) | (1L << (TEMPORARY - 128)) | (1L << (OPTIONS - 128)) | (1L << (UNSET - 128)) | (1L << (TBLPROPERTIES - 128)) | (1L << (DBPROPERTIES - 128)) | (1L << (BUCKETS - 128)) | (1L << (SKEWED - 128)) | (1L << (STORED - 128)) | (1L << (DIRECTORIES - 128)) | (1L << (LOCATION - 128)))) != 0) || ((((_la - 192)) & ~0x3f) == 0 && ((1L << (_la - 192)) & ((1L << (EXCHANGE - 192)) | (1L << (ARCHIVE - 192)) | (1L << (UNARCHIVE - 192)) | (1L << (FILEFORMAT - 192)) | (1L << (TOUCH - 192)) | (1L << (COMPACT - 192)) | (1L << (CONCATENATE - 192)) | (1L << (CHANGE - 192)) | (1L << (CASCADE - 192)) | (1L << (RESTRICT - 192)) | (1L << (CLUSTERED - 192)) | (1L << (SORTED - 192)) | (1L << (PURGE - 192)) | (1L << (INPUTFORMAT - 192)) | (1L << (OUTPUTFORMAT - 192)) | (1L << (DATABASE - 192)) | (1L << (DATABASES - 192)) | (1L << (DFS - 192)) | (1L << (TRUNCATE - 192)) | (1L << (ANALYZE - 192)) | (1L << (COMPUTE - 192)) | (1L << (LIST - 192)) | (1L << (STATISTICS - 192)) | (1L << (PARTITIONED - 192)) | (1L << (EXTERNAL - 192)) | (1L << (DEFINED - 192)) | (1L << (REVOKE - 192)) | (1L << (GRANT - 192)) | (1L << (LOCK - 192)) | (1L << (UNLOCK - 192)) | (1L << (MSCK - 192)) | (1L << (REPAIR - 192)) | (1L << (RECOVER - 192)) | (1L << (EXPORT - 192)) | (1L << (IMPORT - 192)) | (1L << (LOAD - 192)) | (1L << (ROLE - 192)) | (1L << (ROLES - 192)) | (1L << (COMPACTIONS - 192)) | (1L << (PRINCIPALS - 192)) | (1L << (TRANSACTIONS - 192)) | (1L << (INDEX - 192)) | (1L << (INDEXES - 192)) | (1L << (LOCKS - 192)) | (1L << (OPTION - 192)) | (1L << (ANTI - 192)) | (1L << (LOCAL - 192)) | (1L << (INPATH - 192)) | (1L << (STRING - 192)) | (1L << (BIGINT_LITERAL - 192)) | (1L << (SMALLINT_LITERAL - 192)) | (1L << (TINYINT_LITERAL - 192)) | (1L << (INTEGER_VALUE - 192)) | (1L << (DECIMAL_VALUE - 192)) | (1L << (DOUBLE_LITERAL - 192)) | (1L << (BIGDECIMAL_LITERAL - 192)) | (1L << (IDENTIFIER - 192)) | (1L << (BACKQUOTED_IDENTIFIER - 192)))) != 0)) {
					{
					setState(2113);
					_errHandler.sync(this);
					switch ( getInterpreter().adaptivePredict(_input,280,_ctx) ) {
					case 1:
						{
						setState(2112);
						setQuantifier();
						}
						break;
					}
					setState(2115);
					((FunctionCallContext)_localctx).expression = expression();
					((FunctionCallContext)_localctx).argument.add(((FunctionCallContext)_localctx).expression);
					setState(2120);
					_errHandler.sync(this);
					_la = _input.LA(1);
					while (_la==T__2) {
						{
						{
						setState(2116);
						match(T__2);
						setState(2117);
						((FunctionCallContext)_localctx).expression = expression();
						((FunctionCallContext)_localctx).argument.add(((FunctionCallContext)_localctx).expression);
						}
						}
						setState(2122);
						_errHandler.sync(this);
						_la = _input.LA(1);
					}
					}
				}

				setState(2125);
				match(T__1);
				setState(2128);
				_errHandler.sync(this);
				switch ( getInterpreter().adaptivePredict(_input,283,_ctx) ) {
				case 1:
					{
					setState(2126);
					match(OVER);
					setState(2127);
					windowSpec();
					}
					break;
				}
				}
				break;
			case 14:
				{
				_localctx = new FunctionCallContext(_localctx);
				_ctx = _localctx;
				_prevctx = _localctx;
				setState(2130);
				qualifiedName();
				setState(2131);
				match(T__0);
				setState(2132);
				((FunctionCallContext)_localctx).trimOption = _input.LT(1);
				_la = _input.LA(1);
				if ( !(((((_la - 124)) & ~0x3f) == 0 && ((1L << (_la - 124)) & ((1L << (BOTH - 124)) | (1L << (LEADING - 124)) | (1L << (TRAILING - 124)))) != 0)) ) {
					((FunctionCallContext)_localctx).trimOption = (Token)_errHandler.recoverInline(this);
				}
				else {
					if ( _input.LA(1)==Token.EOF ) matchedEOF = true;
					_errHandler.reportMatch(this);
					consume();
				}
				setState(2133);
				((FunctionCallContext)_localctx).expression = expression();
				((FunctionCallContext)_localctx).argument.add(((FunctionCallContext)_localctx).expression);
				setState(2134);
				match(FROM);
				setState(2135);
				((FunctionCallContext)_localctx).expression = expression();
				((FunctionCallContext)_localctx).argument.add(((FunctionCallContext)_localctx).expression);
				setState(2136);
				match(T__1);
				}
				break;
			case 15:
				{
				_localctx = new LambdaContext(_localctx);
				_ctx = _localctx;
				_prevctx = _localctx;
				setState(2138);
				match(IDENTIFIER);
				setState(2139);
				match(T__6);
				setState(2140);
				expression();
				}
				break;
			case 16:
				{
				_localctx = new LambdaContext(_localctx);
				_ctx = _localctx;
				_prevctx = _localctx;
				setState(2141);
				match(T__0);
				setState(2142);
				match(IDENTIFIER);
				setState(2145); 
				_errHandler.sync(this);
				_la = _input.LA(1);
				do {
					{
					{
					setState(2143);
					match(T__2);
					setState(2144);
					match(IDENTIFIER);
					}
					}
					setState(2147); 
					_errHandler.sync(this);
					_la = _input.LA(1);
				} while ( _la==T__2 );
				setState(2149);
				match(T__1);
				setState(2150);
				match(T__6);
				setState(2151);
				expression();
				}
				break;
			case 17:
				{
				_localctx = new ColumnReferenceContext(_localctx);
				_ctx = _localctx;
				_prevctx = _localctx;
				setState(2152);
				identifier();
				}
				break;
			case 18:
				{
				_localctx = new ParenthesizedExpressionContext(_localctx);
				_ctx = _localctx;
				_prevctx = _localctx;
				setState(2153);
				match(T__0);
				setState(2154);
				expression();
				setState(2155);
				match(T__1);
				}
				break;
			case 19:
				{
				_localctx = new ExtractContext(_localctx);
				_ctx = _localctx;
				_prevctx = _localctx;
				setState(2157);
				match(EXTRACT);
				setState(2158);
				match(T__0);
				setState(2159);
				((ExtractContext)_localctx).field = identifier();
				setState(2160);
				match(FROM);
				setState(2161);
				((ExtractContext)_localctx).source = valueExpression(0);
				setState(2162);
				match(T__1);
				}
				break;
			}
			_ctx.stop = _input.LT(-1);
			setState(2176);
			_errHandler.sync(this);
			_alt = getInterpreter().adaptivePredict(_input,287,_ctx);
			while ( _alt!=2 && _alt!=org.antlr.v4.runtime.atn.ATN.INVALID_ALT_NUMBER ) {
				if ( _alt==1 ) {
					if ( _parseListeners!=null ) triggerExitRuleEvent();
					_prevctx = _localctx;
					{
					setState(2174);
					_errHandler.sync(this);
					switch ( getInterpreter().adaptivePredict(_input,286,_ctx) ) {
					case 1:
						{
						_localctx = new SubscriptContext(new PrimaryExpressionContext(_parentctx, _parentState));
						((SubscriptContext)_localctx).value = _prevctx;
						pushNewRecursionContext(_localctx, _startState, RULE_primaryExpression);
						setState(2166);
						if (!(precpred(_ctx, 5))) throw new FailedPredicateException(this, "precpred(_ctx, 5)");
						setState(2167);
						match(T__7);
						setState(2168);
						((SubscriptContext)_localctx).index = valueExpression(0);
						setState(2169);
						match(T__8);
						}
						break;
					case 2:
						{
						_localctx = new DereferenceContext(new PrimaryExpressionContext(_parentctx, _parentState));
						((DereferenceContext)_localctx).base = _prevctx;
						pushNewRecursionContext(_localctx, _startState, RULE_primaryExpression);
						setState(2171);
						if (!(precpred(_ctx, 3))) throw new FailedPredicateException(this, "precpred(_ctx, 3)");
						setState(2172);
						match(T__3);
						setState(2173);
						((DereferenceContext)_localctx).fieldName = identifier();
						}
						break;
					}
					} 
				}
				setState(2178);
				_errHandler.sync(this);
				_alt = getInterpreter().adaptivePredict(_input,287,_ctx);
			}
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			unrollRecursionContexts(_parentctx);
		}
		return _localctx;
	}

	public static class ConstantContext extends ParserRuleContext {
		public ConstantContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_constant; }
	 
		public ConstantContext() { }
		public void copyFrom(ConstantContext ctx) {
			super.copyFrom(ctx);
		}
	}
	public static class NullLiteralContext extends ConstantContext {
		public TerminalNode NULL() { return getToken(sparkParser.NULL, 0); }
		public NullLiteralContext(ConstantContext ctx) { copyFrom(ctx); }
	}
	public static class StringLiteralContext extends ConstantContext {
		public List<TerminalNode> STRING() { return getTokens(sparkParser.STRING); }
		public TerminalNode STRING(int i) {
			return getToken(sparkParser.STRING, i);
		}
		public StringLiteralContext(ConstantContext ctx) { copyFrom(ctx); }
	}
	public static class TypeConstructorContext extends ConstantContext {
		public IdentifierContext identifier() {
			return getRuleContext(IdentifierContext.class,0);
		}
		public TerminalNode STRING() { return getToken(sparkParser.STRING, 0); }
		public TypeConstructorContext(ConstantContext ctx) { copyFrom(ctx); }
	}
	public static class IntervalLiteralContext extends ConstantContext {
		public IntervalContext interval() {
			return getRuleContext(IntervalContext.class,0);
		}
		public IntervalLiteralContext(ConstantContext ctx) { copyFrom(ctx); }
	}
	public static class NumericLiteralContext extends ConstantContext {
		public NumberContext number() {
			return getRuleContext(NumberContext.class,0);
		}
		public NumericLiteralContext(ConstantContext ctx) { copyFrom(ctx); }
	}
	public static class BooleanLiteralContext extends ConstantContext {
		public BooleanValueContext booleanValue() {
			return getRuleContext(BooleanValueContext.class,0);
		}
		public BooleanLiteralContext(ConstantContext ctx) { copyFrom(ctx); }
	}

	public final ConstantContext constant() throws RecognitionException {
		ConstantContext _localctx = new ConstantContext(_ctx, getState());
		enterRule(_localctx, 150, RULE_constant);
		try {
			int _alt;
			setState(2191);
			_errHandler.sync(this);
			switch ( getInterpreter().adaptivePredict(_input,289,_ctx) ) {
			case 1:
				_localctx = new NullLiteralContext(_localctx);
				enterOuterAlt(_localctx, 1);
				{
				setState(2179);
				match(NULL);
				}
				break;
			case 2:
				_localctx = new IntervalLiteralContext(_localctx);
				enterOuterAlt(_localctx, 2);
				{
				setState(2180);
				interval();
				}
				break;
			case 3:
				_localctx = new TypeConstructorContext(_localctx);
				enterOuterAlt(_localctx, 3);
				{
				setState(2181);
				identifier();
				setState(2182);
				match(STRING);
				}
				break;
			case 4:
				_localctx = new NumericLiteralContext(_localctx);
				enterOuterAlt(_localctx, 4);
				{
				setState(2184);
				number();
				}
				break;
			case 5:
				_localctx = new BooleanLiteralContext(_localctx);
				enterOuterAlt(_localctx, 5);
				{
				setState(2185);
				booleanValue();
				}
				break;
			case 6:
				_localctx = new StringLiteralContext(_localctx);
				enterOuterAlt(_localctx, 6);
				{
				setState(2187); 
				_errHandler.sync(this);
				_alt = 1;
				do {
					switch (_alt) {
					case 1:
						{
						{
						setState(2186);
						match(STRING);
						}
						}
						break;
					default:
						throw new NoViableAltException(this);
					}
					setState(2189); 
					_errHandler.sync(this);
					_alt = getInterpreter().adaptivePredict(_input,288,_ctx);
				} while ( _alt!=2 && _alt!=org.antlr.v4.runtime.atn.ATN.INVALID_ALT_NUMBER );
				}
				break;
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static class ComparisonOperatorContext extends ParserRuleContext {
		public TerminalNode EQ() { return getToken(sparkParser.EQ, 0); }
		public TerminalNode NEQ() { return getToken(sparkParser.NEQ, 0); }
		public TerminalNode NEQJ() { return getToken(sparkParser.NEQJ, 0); }
		public TerminalNode LT() { return getToken(sparkParser.LT, 0); }
		public TerminalNode LTE() { return getToken(sparkParser.LTE, 0); }
		public TerminalNode GT() { return getToken(sparkParser.GT, 0); }
		public TerminalNode GTE() { return getToken(sparkParser.GTE, 0); }
		public TerminalNode NSEQ() { return getToken(sparkParser.NSEQ, 0); }
		public ComparisonOperatorContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_comparisonOperator; }
	}

	public final ComparisonOperatorContext comparisonOperator() throws RecognitionException {
		ComparisonOperatorContext _localctx = new ComparisonOperatorContext(_ctx, getState());
		enterRule(_localctx, 152, RULE_comparisonOperator);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(2193);
			_la = _input.LA(1);
			if ( !(((((_la - 130)) & ~0x3f) == 0 && ((1L << (_la - 130)) & ((1L << (EQ - 130)) | (1L << (NSEQ - 130)) | (1L << (NEQ - 130)) | (1L << (NEQJ - 130)) | (1L << (LT - 130)) | (1L << (LTE - 130)) | (1L << (GT - 130)) | (1L << (GTE - 130)))) != 0)) ) {
			_errHandler.recoverInline(this);
			}
			else {
				if ( _input.LA(1)==Token.EOF ) matchedEOF = true;
				_errHandler.reportMatch(this);
				consume();
			}
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static class ArithmeticOperatorContext extends ParserRuleContext {
		public TerminalNode PLUS() { return getToken(sparkParser.PLUS, 0); }
		public TerminalNode MINUS() { return getToken(sparkParser.MINUS, 0); }
		public TerminalNode ASTERISK() { return getToken(sparkParser.ASTERISK, 0); }
		public TerminalNode SLASH() { return getToken(sparkParser.SLASH, 0); }
		public TerminalNode PERCENT() { return getToken(sparkParser.PERCENT, 0); }
		public TerminalNode DIV() { return getToken(sparkParser.DIV, 0); }
		public TerminalNode TILDE() { return getToken(sparkParser.TILDE, 0); }
		public TerminalNode AMPERSAND() { return getToken(sparkParser.AMPERSAND, 0); }
		public TerminalNode PIPE() { return getToken(sparkParser.PIPE, 0); }
		public TerminalNode CONCAT_PIPE() { return getToken(sparkParser.CONCAT_PIPE, 0); }
		public TerminalNode HAT() { return getToken(sparkParser.HAT, 0); }
		public ArithmeticOperatorContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_arithmeticOperator; }
	}

	public final ArithmeticOperatorContext arithmeticOperator() throws RecognitionException {
		ArithmeticOperatorContext _localctx = new ArithmeticOperatorContext(_ctx, getState());
		enterRule(_localctx, 154, RULE_arithmeticOperator);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(2195);
			_la = _input.LA(1);
			if ( !(((((_la - 138)) & ~0x3f) == 0 && ((1L << (_la - 138)) & ((1L << (PLUS - 138)) | (1L << (MINUS - 138)) | (1L << (ASTERISK - 138)) | (1L << (SLASH - 138)) | (1L << (PERCENT - 138)) | (1L << (DIV - 138)) | (1L << (TILDE - 138)) | (1L << (AMPERSAND - 138)) | (1L << (PIPE - 138)) | (1L << (CONCAT_PIPE - 138)) | (1L << (HAT - 138)))) != 0)) ) {
			_errHandler.recoverInline(this);
			}
			else {
				if ( _input.LA(1)==Token.EOF ) matchedEOF = true;
				_errHandler.reportMatch(this);
				consume();
			}
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static class PredicateOperatorContext extends ParserRuleContext {
		public TerminalNode OR() { return getToken(sparkParser.OR, 0); }
		public TerminalNode AND() { return getToken(sparkParser.AND, 0); }
		public TerminalNode IN() { return getToken(sparkParser.IN, 0); }
		public TerminalNode NOT() { return getToken(sparkParser.NOT, 0); }
		public PredicateOperatorContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_predicateOperator; }
	}

	public final PredicateOperatorContext predicateOperator() throws RecognitionException {
		PredicateOperatorContext _localctx = new PredicateOperatorContext(_ctx, getState());
		enterRule(_localctx, 156, RULE_predicateOperator);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(2197);
			_la = _input.LA(1);
			if ( !((((_la) & ~0x3f) == 0 && ((1L << _la) & ((1L << OR) | (1L << AND) | (1L << IN) | (1L << NOT))) != 0)) ) {
			_errHandler.recoverInline(this);
			}
			else {
				if ( _input.LA(1)==Token.EOF ) matchedEOF = true;
				_errHandler.reportMatch(this);
				consume();
			}
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static class BooleanValueContext extends ParserRuleContext {
		public TerminalNode TRUE() { return getToken(sparkParser.TRUE, 0); }
		public TerminalNode FALSE() { return getToken(sparkParser.FALSE, 0); }
		public BooleanValueContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_booleanValue; }
	}

	public final BooleanValueContext booleanValue() throws RecognitionException {
		BooleanValueContext _localctx = new BooleanValueContext(_ctx, getState());
		enterRule(_localctx, 158, RULE_booleanValue);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(2199);
			_la = _input.LA(1);
			if ( !(_la==TRUE || _la==FALSE) ) {
			_errHandler.recoverInline(this);
			}
			else {
				if ( _input.LA(1)==Token.EOF ) matchedEOF = true;
				_errHandler.reportMatch(this);
				consume();
			}
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static class IntervalContext extends ParserRuleContext {
		public TerminalNode INTERVAL() { return getToken(sparkParser.INTERVAL, 0); }
		public List<IntervalFieldContext> intervalField() {
			return getRuleContexts(IntervalFieldContext.class);
		}
		public IntervalFieldContext intervalField(int i) {
			return getRuleContext(IntervalFieldContext.class,i);
		}
		public IntervalContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_interval; }
	}

	public final IntervalContext interval() throws RecognitionException {
		IntervalContext _localctx = new IntervalContext(_ctx, getState());
		enterRule(_localctx, 160, RULE_interval);
		try {
			int _alt;
			enterOuterAlt(_localctx, 1);
			{
			setState(2201);
			match(INTERVAL);
			setState(2205);
			_errHandler.sync(this);
			_alt = getInterpreter().adaptivePredict(_input,290,_ctx);
			while ( _alt!=2 && _alt!=org.antlr.v4.runtime.atn.ATN.INVALID_ALT_NUMBER ) {
				if ( _alt==1 ) {
					{
					{
					setState(2202);
					intervalField();
					}
					} 
				}
				setState(2207);
				_errHandler.sync(this);
				_alt = getInterpreter().adaptivePredict(_input,290,_ctx);
			}
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static class IntervalFieldContext extends ParserRuleContext {
		public IntervalValueContext value;
		public IdentifierContext unit;
		public IdentifierContext to;
		public IntervalValueContext intervalValue() {
			return getRuleContext(IntervalValueContext.class,0);
		}
		public List<IdentifierContext> identifier() {
			return getRuleContexts(IdentifierContext.class);
		}
		public IdentifierContext identifier(int i) {
			return getRuleContext(IdentifierContext.class,i);
		}
		public TerminalNode TO() { return getToken(sparkParser.TO, 0); }
		public IntervalFieldContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_intervalField; }
	}

	public final IntervalFieldContext intervalField() throws RecognitionException {
		IntervalFieldContext _localctx = new IntervalFieldContext(_ctx, getState());
		enterRule(_localctx, 162, RULE_intervalField);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(2208);
			((IntervalFieldContext)_localctx).value = intervalValue();
			setState(2209);
			((IntervalFieldContext)_localctx).unit = identifier();
			setState(2212);
			_errHandler.sync(this);
			switch ( getInterpreter().adaptivePredict(_input,291,_ctx) ) {
			case 1:
				{
				setState(2210);
				match(TO);
				setState(2211);
				((IntervalFieldContext)_localctx).to = identifier();
				}
				break;
			}
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static class IntervalValueContext extends ParserRuleContext {
		public TerminalNode INTEGER_VALUE() { return getToken(sparkParser.INTEGER_VALUE, 0); }
		public TerminalNode DECIMAL_VALUE() { return getToken(sparkParser.DECIMAL_VALUE, 0); }
		public TerminalNode PLUS() { return getToken(sparkParser.PLUS, 0); }
		public TerminalNode MINUS() { return getToken(sparkParser.MINUS, 0); }
		public TerminalNode STRING() { return getToken(sparkParser.STRING, 0); }
		public IntervalValueContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_intervalValue; }
	}

	public final IntervalValueContext intervalValue() throws RecognitionException {
		IntervalValueContext _localctx = new IntervalValueContext(_ctx, getState());
		enterRule(_localctx, 164, RULE_intervalValue);
		int _la;
		try {
			setState(2219);
			_errHandler.sync(this);
			switch (_input.LA(1)) {
			case PLUS:
			case MINUS:
			case INTEGER_VALUE:
			case DECIMAL_VALUE:
				enterOuterAlt(_localctx, 1);
				{
				setState(2215);
				_errHandler.sync(this);
				_la = _input.LA(1);
				if (_la==PLUS || _la==MINUS) {
					{
					setState(2214);
					_la = _input.LA(1);
					if ( !(_la==PLUS || _la==MINUS) ) {
					_errHandler.recoverInline(this);
					}
					else {
						if ( _input.LA(1)==Token.EOF ) matchedEOF = true;
						_errHandler.reportMatch(this);
						consume();
					}
					}
				}

				setState(2217);
				_la = _input.LA(1);
				if ( !(_la==INTEGER_VALUE || _la==DECIMAL_VALUE) ) {
				_errHandler.recoverInline(this);
				}
				else {
					if ( _input.LA(1)==Token.EOF ) matchedEOF = true;
					_errHandler.reportMatch(this);
					consume();
				}
				}
				break;
			case STRING:
				enterOuterAlt(_localctx, 2);
				{
				setState(2218);
				match(STRING);
				}
				break;
			default:
				throw new NoViableAltException(this);
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static class ColPositionContext extends ParserRuleContext {
		public TerminalNode FIRST() { return getToken(sparkParser.FIRST, 0); }
		public TerminalNode AFTER() { return getToken(sparkParser.AFTER, 0); }
		public IdentifierContext identifier() {
			return getRuleContext(IdentifierContext.class,0);
		}
		public ColPositionContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_colPosition; }
	}

	public final ColPositionContext colPosition() throws RecognitionException {
		ColPositionContext _localctx = new ColPositionContext(_ctx, getState());
		enterRule(_localctx, 166, RULE_colPosition);
		try {
			setState(2224);
			_errHandler.sync(this);
			switch (_input.LA(1)) {
			case FIRST:
				enterOuterAlt(_localctx, 1);
				{
				setState(2221);
				match(FIRST);
				}
				break;
			case AFTER:
				enterOuterAlt(_localctx, 2);
				{
				setState(2222);
				match(AFTER);
				setState(2223);
				identifier();
				}
				break;
			default:
				throw new NoViableAltException(this);
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static class DataTypeContext extends ParserRuleContext {
		public DataTypeContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_dataType; }
	 
		public DataTypeContext() { }
		public void copyFrom(DataTypeContext ctx) {
			super.copyFrom(ctx);
		}
	}
	public static class ComplexDataTypeContext extends DataTypeContext {
		public Token complex;
		public List<DataTypeContext> dataType() {
			return getRuleContexts(DataTypeContext.class);
		}
		public DataTypeContext dataType(int i) {
			return getRuleContext(DataTypeContext.class,i);
		}
		public TerminalNode ARRAY() { return getToken(sparkParser.ARRAY, 0); }
		public TerminalNode MAP() { return getToken(sparkParser.MAP, 0); }
		public TerminalNode STRUCT() { return getToken(sparkParser.STRUCT, 0); }
		public TerminalNode NEQ() { return getToken(sparkParser.NEQ, 0); }
		public ComplexColTypeListContext complexColTypeList() {
			return getRuleContext(ComplexColTypeListContext.class,0);
		}
		public ComplexDataTypeContext(DataTypeContext ctx) { copyFrom(ctx); }
	}
	public static class PrimitiveDataTypeContext extends DataTypeContext {
		public IdentifierContext identifier() {
			return getRuleContext(IdentifierContext.class,0);
		}
		public List<TerminalNode> INTEGER_VALUE() { return getTokens(sparkParser.INTEGER_VALUE); }
		public TerminalNode INTEGER_VALUE(int i) {
			return getToken(sparkParser.INTEGER_VALUE, i);
		}
		public PrimitiveDataTypeContext(DataTypeContext ctx) { copyFrom(ctx); }
	}

	public final DataTypeContext dataType() throws RecognitionException {
		DataTypeContext _localctx = new DataTypeContext(_ctx, getState());
		enterRule(_localctx, 168, RULE_dataType);
		int _la;
		try {
			setState(2260);
			_errHandler.sync(this);
			switch ( getInterpreter().adaptivePredict(_input,299,_ctx) ) {
			case 1:
				_localctx = new ComplexDataTypeContext(_localctx);
				enterOuterAlt(_localctx, 1);
				{
				setState(2226);
				((ComplexDataTypeContext)_localctx).complex = match(ARRAY);
				setState(2227);
				match(LT);
				setState(2228);
				dataType();
				setState(2229);
				match(GT);
				}
				break;
			case 2:
				_localctx = new ComplexDataTypeContext(_localctx);
				enterOuterAlt(_localctx, 2);
				{
				setState(2231);
				((ComplexDataTypeContext)_localctx).complex = match(MAP);
				setState(2232);
				match(LT);
				setState(2233);
				dataType();
				setState(2234);
				match(T__2);
				setState(2235);
				dataType();
				setState(2236);
				match(GT);
				}
				break;
			case 3:
				_localctx = new ComplexDataTypeContext(_localctx);
				enterOuterAlt(_localctx, 3);
				{
				setState(2238);
				((ComplexDataTypeContext)_localctx).complex = match(STRUCT);
				setState(2245);
				_errHandler.sync(this);
				switch (_input.LA(1)) {
				case LT:
					{
					setState(2239);
					match(LT);
					setState(2241);
					_errHandler.sync(this);
					_la = _input.LA(1);
					if ((((_la) & ~0x3f) == 0 && ((1L << _la) & ((1L << SELECT) | (1L << FROM) | (1L << ADD) | (1L << AS) | (1L << ALL) | (1L << ANY) | (1L << DISTINCT) | (1L << WHERE) | (1L << GROUP) | (1L << BY) | (1L << GROUPING) | (1L << SETS) | (1L << CUBE) | (1L << ROLLUP) | (1L << ORDER) | (1L << HAVING) | (1L << LIMIT) | (1L << AT) | (1L << OR) | (1L << AND) | (1L << IN) | (1L << NOT) | (1L << NO) | (1L << EXISTS) | (1L << BETWEEN) | (1L << LIKE) | (1L << RLIKE) | (1L << IS) | (1L << NULL) | (1L << TRUE) | (1L << FALSE) | (1L << NULLS) | (1L << ASC) | (1L << DESC) | (1L << FOR) | (1L << INTERVAL) | (1L << CASE) | (1L << WHEN) | (1L << THEN) | (1L << ELSE) | (1L << END) | (1L << JOIN) | (1L << CROSS) | (1L << OUTER) | (1L << INNER) | (1L << LEFT) | (1L << SEMI) | (1L << RIGHT) | (1L << FULL) | (1L << NATURAL) | (1L << ON) | (1L << PIVOT) | (1L << LATERAL))) != 0) || ((((_la - 64)) & ~0x3f) == 0 && ((1L << (_la - 64)) & ((1L << (WINDOW - 64)) | (1L << (OVER - 64)) | (1L << (PARTITION - 64)) | (1L << (RANGE - 64)) | (1L << (ROWS - 64)) | (1L << (UNBOUNDED - 64)) | (1L << (PRECEDING - 64)) | (1L << (FOLLOWING - 64)) | (1L << (CURRENT - 64)) | (1L << (FIRST - 64)) | (1L << (AFTER - 64)) | (1L << (LAST - 64)) | (1L << (ROW - 64)) | (1L << (WITH - 64)) | (1L << (VALUES - 64)) | (1L << (CREATE - 64)) | (1L << (TABLE - 64)) | (1L << (DIRECTORY - 64)) | (1L << (VIEW - 64)) | (1L << (REPLACE - 64)) | (1L << (INSERT - 64)) | (1L << (DELETE - 64)) | (1L << (INTO - 64)) | (1L << (DESCRIBE - 64)) | (1L << (EXPLAIN - 64)) | (1L << (FORMAT - 64)) | (1L << (LOGICAL - 64)) | (1L << (CODEGEN - 64)) | (1L << (COST - 64)) | (1L << (CAST - 64)) | (1L << (SHOW - 64)) | (1L << (TABLES - 64)) | (1L << (COLUMNS - 64)) | (1L << (COLUMN - 64)) | (1L << (USE - 64)) | (1L << (PARTITIONS - 64)) | (1L << (FUNCTIONS - 64)) | (1L << (DROP - 64)) | (1L << (UNION - 64)) | (1L << (EXCEPT - 64)) | (1L << (SETMINUS - 64)) | (1L << (INTERSECT - 64)) | (1L << (TO - 64)) | (1L << (TABLESAMPLE - 64)) | (1L << (STRATIFY - 64)) | (1L << (ALTER - 64)) | (1L << (RENAME - 64)) | (1L << (ARRAY - 64)) | (1L << (MAP - 64)) | (1L << (STRUCT - 64)) | (1L << (COMMENT - 64)) | (1L << (SET - 64)) | (1L << (RESET - 64)) | (1L << (DATA - 64)) | (1L << (START - 64)) | (1L << (TRANSACTION - 64)) | (1L << (COMMIT - 64)) | (1L << (ROLLBACK - 64)) | (1L << (MACRO - 64)) | (1L << (IGNORE - 64)) | (1L << (BOTH - 64)) | (1L << (LEADING - 64)) | (1L << (TRAILING - 64)) | (1L << (IF - 64)))) != 0) || ((((_la - 128)) & ~0x3f) == 0 && ((1L << (_la - 128)) & ((1L << (POSITION - 128)) | (1L << (EXTRACT - 128)) | (1L << (DIV - 128)) | (1L << (PERCENTLIT - 128)) | (1L << (BUCKET - 128)) | (1L << (OUT - 128)) | (1L << (OF - 128)) | (1L << (SORT - 128)) | (1L << (CLUSTER - 128)) | (1L << (DISTRIBUTE - 128)) | (1L << (OVERWRITE - 128)) | (1L << (TRANSFORM - 128)) | (1L << (REDUCE - 128)) | (1L << (SERDE - 128)) | (1L << (SERDEPROPERTIES - 128)) | (1L << (RECORDREADER - 128)) | (1L << (RECORDWRITER - 128)) | (1L << (DELIMITED - 128)) | (1L << (FIELDS - 128)) | (1L << (TERMINATED - 128)) | (1L << (COLLECTION - 128)) | (1L << (ITEMS - 128)) | (1L << (KEYS - 128)) | (1L << (ESCAPED - 128)) | (1L << (LINES - 128)) | (1L << (SEPARATED - 128)) | (1L << (FUNCTION - 128)) | (1L << (EXTENDED - 128)) | (1L << (REFRESH - 128)) | (1L << (CLEAR - 128)) | (1L << (CACHE - 128)) | (1L << (UNCACHE - 128)) | (1L << (LAZY - 128)) | (1L << (FORMATTED - 128)) | (1L << (GLOBAL - 128)) | (1L << (TEMPORARY - 128)) | (1L << (OPTIONS - 128)) | (1L << (UNSET - 128)) | (1L << (TBLPROPERTIES - 128)) | (1L << (DBPROPERTIES - 128)) | (1L << (BUCKETS - 128)) | (1L << (SKEWED - 128)) | (1L << (STORED - 128)) | (1L << (DIRECTORIES - 128)) | (1L << (LOCATION - 128)))) != 0) || ((((_la - 192)) & ~0x3f) == 0 && ((1L << (_la - 192)) & ((1L << (EXCHANGE - 192)) | (1L << (ARCHIVE - 192)) | (1L << (UNARCHIVE - 192)) | (1L << (FILEFORMAT - 192)) | (1L << (TOUCH - 192)) | (1L << (COMPACT - 192)) | (1L << (CONCATENATE - 192)) | (1L << (CHANGE - 192)) | (1L << (CASCADE - 192)) | (1L << (RESTRICT - 192)) | (1L << (CLUSTERED - 192)) | (1L << (SORTED - 192)) | (1L << (PURGE - 192)) | (1L << (INPUTFORMAT - 192)) | (1L << (OUTPUTFORMAT - 192)) | (1L << (DATABASE - 192)) | (1L << (DATABASES - 192)) | (1L << (DFS - 192)) | (1L << (TRUNCATE - 192)) | (1L << (ANALYZE - 192)) | (1L << (COMPUTE - 192)) | (1L << (LIST - 192)) | (1L << (STATISTICS - 192)) | (1L << (PARTITIONED - 192)) | (1L << (EXTERNAL - 192)) | (1L << (DEFINED - 192)) | (1L << (REVOKE - 192)) | (1L << (GRANT - 192)) | (1L << (LOCK - 192)) | (1L << (UNLOCK - 192)) | (1L << (MSCK - 192)) | (1L << (REPAIR - 192)) | (1L << (RECOVER - 192)) | (1L << (EXPORT - 192)) | (1L << (IMPORT - 192)) | (1L << (LOAD - 192)) | (1L << (ROLE - 192)) | (1L << (ROLES - 192)) | (1L << (COMPACTIONS - 192)) | (1L << (PRINCIPALS - 192)) | (1L << (TRANSACTIONS - 192)) | (1L << (INDEX - 192)) | (1L << (INDEXES - 192)) | (1L << (LOCKS - 192)) | (1L << (OPTION - 192)) | (1L << (ANTI - 192)) | (1L << (LOCAL - 192)) | (1L << (INPATH - 192)) | (1L << (IDENTIFIER - 192)) | (1L << (BACKQUOTED_IDENTIFIER - 192)))) != 0)) {
						{
						setState(2240);
						complexColTypeList();
						}
					}

					setState(2243);
					match(GT);
					}
					break;
				case NEQ:
					{
					setState(2244);
					match(NEQ);
					}
					break;
				default:
					throw new NoViableAltException(this);
				}
				}
				break;
			case 4:
				_localctx = new PrimitiveDataTypeContext(_localctx);
				enterOuterAlt(_localctx, 4);
				{
				setState(2247);
				identifier();
				setState(2258);
				_errHandler.sync(this);
				switch ( getInterpreter().adaptivePredict(_input,298,_ctx) ) {
				case 1:
					{
					setState(2248);
					match(T__0);
					setState(2249);
					match(INTEGER_VALUE);
					setState(2254);
					_errHandler.sync(this);
					_la = _input.LA(1);
					while (_la==T__2) {
						{
						{
						setState(2250);
						match(T__2);
						setState(2251);
						match(INTEGER_VALUE);
						}
						}
						setState(2256);
						_errHandler.sync(this);
						_la = _input.LA(1);
					}
					setState(2257);
					match(T__1);
					}
					break;
				}
				}
				break;
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static class ColTypeListContext extends ParserRuleContext {
		public List<ColTypeContext> colType() {
			return getRuleContexts(ColTypeContext.class);
		}
		public ColTypeContext colType(int i) {
			return getRuleContext(ColTypeContext.class,i);
		}
		public ColTypeListContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_colTypeList; }
	}

	public final ColTypeListContext colTypeList() throws RecognitionException {
		ColTypeListContext _localctx = new ColTypeListContext(_ctx, getState());
		enterRule(_localctx, 170, RULE_colTypeList);
		try {
			int _alt;
			enterOuterAlt(_localctx, 1);
			{
			setState(2262);
			colType();
			setState(2267);
			_errHandler.sync(this);
			_alt = getInterpreter().adaptivePredict(_input,300,_ctx);
			while ( _alt!=2 && _alt!=org.antlr.v4.runtime.atn.ATN.INVALID_ALT_NUMBER ) {
				if ( _alt==1 ) {
					{
					{
					setState(2263);
					match(T__2);
					setState(2264);
					colType();
					}
					} 
				}
				setState(2269);
				_errHandler.sync(this);
				_alt = getInterpreter().adaptivePredict(_input,300,_ctx);
			}
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static class ColTypeContext extends ParserRuleContext {
		public IdentifierContext identifier() {
			return getRuleContext(IdentifierContext.class,0);
		}
		public DataTypeContext dataType() {
			return getRuleContext(DataTypeContext.class,0);
		}
		public TerminalNode COMMENT() { return getToken(sparkParser.COMMENT, 0); }
		public TerminalNode STRING() { return getToken(sparkParser.STRING, 0); }
		public ColTypeContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_colType; }
	}

	public final ColTypeContext colType() throws RecognitionException {
		ColTypeContext _localctx = new ColTypeContext(_ctx, getState());
		enterRule(_localctx, 172, RULE_colType);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(2270);
			identifier();
			setState(2271);
			dataType();
			setState(2274);
			_errHandler.sync(this);
			switch ( getInterpreter().adaptivePredict(_input,301,_ctx) ) {
			case 1:
				{
				setState(2272);
				match(COMMENT);
				setState(2273);
				match(STRING);
				}
				break;
			}
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static class ComplexColTypeListContext extends ParserRuleContext {
		public List<ComplexColTypeContext> complexColType() {
			return getRuleContexts(ComplexColTypeContext.class);
		}
		public ComplexColTypeContext complexColType(int i) {
			return getRuleContext(ComplexColTypeContext.class,i);
		}
		public ComplexColTypeListContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_complexColTypeList; }
	}

	public final ComplexColTypeListContext complexColTypeList() throws RecognitionException {
		ComplexColTypeListContext _localctx = new ComplexColTypeListContext(_ctx, getState());
		enterRule(_localctx, 174, RULE_complexColTypeList);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(2276);
			complexColType();
			setState(2281);
			_errHandler.sync(this);
			_la = _input.LA(1);
			while (_la==T__2) {
				{
				{
				setState(2277);
				match(T__2);
				setState(2278);
				complexColType();
				}
				}
				setState(2283);
				_errHandler.sync(this);
				_la = _input.LA(1);
			}
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static class ComplexColTypeContext extends ParserRuleContext {
		public IdentifierContext identifier() {
			return getRuleContext(IdentifierContext.class,0);
		}
		public DataTypeContext dataType() {
			return getRuleContext(DataTypeContext.class,0);
		}
		public TerminalNode COMMENT() { return getToken(sparkParser.COMMENT, 0); }
		public TerminalNode STRING() { return getToken(sparkParser.STRING, 0); }
		public ComplexColTypeContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_complexColType; }
	}

	public final ComplexColTypeContext complexColType() throws RecognitionException {
		ComplexColTypeContext _localctx = new ComplexColTypeContext(_ctx, getState());
		enterRule(_localctx, 176, RULE_complexColType);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(2284);
			identifier();
			setState(2285);
			match(T__9);
			setState(2286);
			dataType();
			setState(2289);
			_errHandler.sync(this);
			_la = _input.LA(1);
			if (_la==COMMENT) {
				{
				setState(2287);
				match(COMMENT);
				setState(2288);
				match(STRING);
				}
			}

			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static class WhenClauseContext extends ParserRuleContext {
		public ExpressionContext condition;
		public ExpressionContext result;
		public TerminalNode WHEN() { return getToken(sparkParser.WHEN, 0); }
		public TerminalNode THEN() { return getToken(sparkParser.THEN, 0); }
		public List<ExpressionContext> expression() {
			return getRuleContexts(ExpressionContext.class);
		}
		public ExpressionContext expression(int i) {
			return getRuleContext(ExpressionContext.class,i);
		}
		public WhenClauseContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_whenClause; }
	}

	public final WhenClauseContext whenClause() throws RecognitionException {
		WhenClauseContext _localctx = new WhenClauseContext(_ctx, getState());
		enterRule(_localctx, 178, RULE_whenClause);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(2291);
			match(WHEN);
			setState(2292);
			((WhenClauseContext)_localctx).condition = expression();
			setState(2293);
			match(THEN);
			setState(2294);
			((WhenClauseContext)_localctx).result = expression();
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static class WindowsContext extends ParserRuleContext {
		public TerminalNode WINDOW() { return getToken(sparkParser.WINDOW, 0); }
		public List<NamedWindowContext> namedWindow() {
			return getRuleContexts(NamedWindowContext.class);
		}
		public NamedWindowContext namedWindow(int i) {
			return getRuleContext(NamedWindowContext.class,i);
		}
		public WindowsContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_windows; }
	}

	public final WindowsContext windows() throws RecognitionException {
		WindowsContext _localctx = new WindowsContext(_ctx, getState());
		enterRule(_localctx, 180, RULE_windows);
		try {
			int _alt;
			enterOuterAlt(_localctx, 1);
			{
			setState(2296);
			match(WINDOW);
			setState(2297);
			namedWindow();
			setState(2302);
			_errHandler.sync(this);
			_alt = getInterpreter().adaptivePredict(_input,304,_ctx);
			while ( _alt!=2 && _alt!=org.antlr.v4.runtime.atn.ATN.INVALID_ALT_NUMBER ) {
				if ( _alt==1 ) {
					{
					{
					setState(2298);
					match(T__2);
					setState(2299);
					namedWindow();
					}
					} 
				}
				setState(2304);
				_errHandler.sync(this);
				_alt = getInterpreter().adaptivePredict(_input,304,_ctx);
			}
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static class NamedWindowContext extends ParserRuleContext {
		public IdentifierContext identifier() {
			return getRuleContext(IdentifierContext.class,0);
		}
		public TerminalNode AS() { return getToken(sparkParser.AS, 0); }
		public WindowSpecContext windowSpec() {
			return getRuleContext(WindowSpecContext.class,0);
		}
		public NamedWindowContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_namedWindow; }
	}

	public final NamedWindowContext namedWindow() throws RecognitionException {
		NamedWindowContext _localctx = new NamedWindowContext(_ctx, getState());
		enterRule(_localctx, 182, RULE_namedWindow);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(2305);
			identifier();
			setState(2306);
			match(AS);
			setState(2307);
			windowSpec();
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static class WindowSpecContext extends ParserRuleContext {
		public WindowSpecContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_windowSpec; }
	 
		public WindowSpecContext() { }
		public void copyFrom(WindowSpecContext ctx) {
			super.copyFrom(ctx);
		}
	}
	public static class WindowRefContext extends WindowSpecContext {
		public IdentifierContext name;
		public IdentifierContext identifier() {
			return getRuleContext(IdentifierContext.class,0);
		}
		public WindowRefContext(WindowSpecContext ctx) { copyFrom(ctx); }
	}
	public static class WindowDefContext extends WindowSpecContext {
		public ExpressionContext expression;
		public List<ExpressionContext> partition = new ArrayList<ExpressionContext>();
		public TerminalNode CLUSTER() { return getToken(sparkParser.CLUSTER, 0); }
		public List<TerminalNode> BY() { return getTokens(sparkParser.BY); }
		public TerminalNode BY(int i) {
			return getToken(sparkParser.BY, i);
		}
		public List<ExpressionContext> expression() {
			return getRuleContexts(ExpressionContext.class);
		}
		public ExpressionContext expression(int i) {
			return getRuleContext(ExpressionContext.class,i);
		}
		public WindowFrameContext windowFrame() {
			return getRuleContext(WindowFrameContext.class,0);
		}
		public List<SortItemContext> sortItem() {
			return getRuleContexts(SortItemContext.class);
		}
		public SortItemContext sortItem(int i) {
			return getRuleContext(SortItemContext.class,i);
		}
		public TerminalNode PARTITION() { return getToken(sparkParser.PARTITION, 0); }
		public TerminalNode DISTRIBUTE() { return getToken(sparkParser.DISTRIBUTE, 0); }
		public TerminalNode ORDER() { return getToken(sparkParser.ORDER, 0); }
		public TerminalNode SORT() { return getToken(sparkParser.SORT, 0); }
		public WindowDefContext(WindowSpecContext ctx) { copyFrom(ctx); }
	}

	public final WindowSpecContext windowSpec() throws RecognitionException {
		WindowSpecContext _localctx = new WindowSpecContext(_ctx, getState());
		enterRule(_localctx, 184, RULE_windowSpec);
		int _la;
		try {
			setState(2351);
			_errHandler.sync(this);
			switch (_input.LA(1)) {
			case SELECT:
			case FROM:
			case ADD:
			case AS:
			case ALL:
			case ANY:
			case DISTINCT:
			case WHERE:
			case GROUP:
			case BY:
			case GROUPING:
			case SETS:
			case CUBE:
			case ROLLUP:
			case ORDER:
			case HAVING:
			case LIMIT:
			case AT:
			case OR:
			case AND:
			case IN:
			case NOT:
			case NO:
			case EXISTS:
			case BETWEEN:
			case LIKE:
			case RLIKE:
			case IS:
			case NULL:
			case TRUE:
			case FALSE:
			case NULLS:
			case ASC:
			case DESC:
			case FOR:
			case INTERVAL:
			case CASE:
			case WHEN:
			case THEN:
			case ELSE:
			case END:
			case JOIN:
			case CROSS:
			case OUTER:
			case INNER:
			case LEFT:
			case SEMI:
			case RIGHT:
			case FULL:
			case NATURAL:
			case ON:
			case PIVOT:
			case LATERAL:
			case WINDOW:
			case OVER:
			case PARTITION:
			case RANGE:
			case ROWS:
			case UNBOUNDED:
			case PRECEDING:
			case FOLLOWING:
			case CURRENT:
			case FIRST:
			case AFTER:
			case LAST:
			case ROW:
			case WITH:
			case VALUES:
			case CREATE:
			case TABLE:
			case DIRECTORY:
			case VIEW:
			case REPLACE:
			case INSERT:
			case DELETE:
			case INTO:
			case DESCRIBE:
			case EXPLAIN:
			case FORMAT:
			case LOGICAL:
			case CODEGEN:
			case COST:
			case CAST:
			case SHOW:
			case TABLES:
			case COLUMNS:
			case COLUMN:
			case USE:
			case PARTITIONS:
			case FUNCTIONS:
			case DROP:
			case UNION:
			case EXCEPT:
			case SETMINUS:
			case INTERSECT:
			case TO:
			case TABLESAMPLE:
			case STRATIFY:
			case ALTER:
			case RENAME:
			case ARRAY:
			case MAP:
			case STRUCT:
			case COMMENT:
			case SET:
			case RESET:
			case DATA:
			case START:
			case TRANSACTION:
			case COMMIT:
			case ROLLBACK:
			case MACRO:
			case IGNORE:
			case BOTH:
			case LEADING:
			case TRAILING:
			case IF:
			case POSITION:
			case EXTRACT:
			case DIV:
			case PERCENTLIT:
			case BUCKET:
			case OUT:
			case OF:
			case SORT:
			case CLUSTER:
			case DISTRIBUTE:
			case OVERWRITE:
			case TRANSFORM:
			case REDUCE:
			case SERDE:
			case SERDEPROPERTIES:
			case RECORDREADER:
			case RECORDWRITER:
			case DELIMITED:
			case FIELDS:
			case TERMINATED:
			case COLLECTION:
			case ITEMS:
			case KEYS:
			case ESCAPED:
			case LINES:
			case SEPARATED:
			case FUNCTION:
			case EXTENDED:
			case REFRESH:
			case CLEAR:
			case CACHE:
			case UNCACHE:
			case LAZY:
			case FORMATTED:
			case GLOBAL:
			case TEMPORARY:
			case OPTIONS:
			case UNSET:
			case TBLPROPERTIES:
			case DBPROPERTIES:
			case BUCKETS:
			case SKEWED:
			case STORED:
			case DIRECTORIES:
			case LOCATION:
			case EXCHANGE:
			case ARCHIVE:
			case UNARCHIVE:
			case FILEFORMAT:
			case TOUCH:
			case COMPACT:
			case CONCATENATE:
			case CHANGE:
			case CASCADE:
			case RESTRICT:
			case CLUSTERED:
			case SORTED:
			case PURGE:
			case INPUTFORMAT:
			case OUTPUTFORMAT:
			case DATABASE:
			case DATABASES:
			case DFS:
			case TRUNCATE:
			case ANALYZE:
			case COMPUTE:
			case LIST:
			case STATISTICS:
			case PARTITIONED:
			case EXTERNAL:
			case DEFINED:
			case REVOKE:
			case GRANT:
			case LOCK:
			case UNLOCK:
			case MSCK:
			case REPAIR:
			case RECOVER:
			case EXPORT:
			case IMPORT:
			case LOAD:
			case ROLE:
			case ROLES:
			case COMPACTIONS:
			case PRINCIPALS:
			case TRANSACTIONS:
			case INDEX:
			case INDEXES:
			case LOCKS:
			case OPTION:
			case ANTI:
			case LOCAL:
			case INPATH:
			case IDENTIFIER:
			case BACKQUOTED_IDENTIFIER:
				_localctx = new WindowRefContext(_localctx);
				enterOuterAlt(_localctx, 1);
				{
				setState(2309);
				((WindowRefContext)_localctx).name = identifier();
				}
				break;
			case T__0:
				_localctx = new WindowDefContext(_localctx);
				enterOuterAlt(_localctx, 2);
				{
				setState(2310);
				match(T__0);
				setState(2345);
				_errHandler.sync(this);
				switch (_input.LA(1)) {
				case CLUSTER:
					{
					setState(2311);
					match(CLUSTER);
					setState(2312);
					match(BY);
					setState(2313);
					((WindowDefContext)_localctx).expression = expression();
					((WindowDefContext)_localctx).partition.add(((WindowDefContext)_localctx).expression);
					setState(2318);
					_errHandler.sync(this);
					_la = _input.LA(1);
					while (_la==T__2) {
						{
						{
						setState(2314);
						match(T__2);
						setState(2315);
						((WindowDefContext)_localctx).expression = expression();
						((WindowDefContext)_localctx).partition.add(((WindowDefContext)_localctx).expression);
						}
						}
						setState(2320);
						_errHandler.sync(this);
						_la = _input.LA(1);
					}
					}
					break;
				case T__1:
				case ORDER:
				case PARTITION:
				case RANGE:
				case ROWS:
				case SORT:
				case DISTRIBUTE:
					{
					setState(2331);
					_errHandler.sync(this);
					_la = _input.LA(1);
					if (_la==PARTITION || _la==DISTRIBUTE) {
						{
						setState(2321);
						_la = _input.LA(1);
						if ( !(_la==PARTITION || _la==DISTRIBUTE) ) {
						_errHandler.recoverInline(this);
						}
						else {
							if ( _input.LA(1)==Token.EOF ) matchedEOF = true;
							_errHandler.reportMatch(this);
							consume();
						}
						setState(2322);
						match(BY);
						setState(2323);
						((WindowDefContext)_localctx).expression = expression();
						((WindowDefContext)_localctx).partition.add(((WindowDefContext)_localctx).expression);
						setState(2328);
						_errHandler.sync(this);
						_la = _input.LA(1);
						while (_la==T__2) {
							{
							{
							setState(2324);
							match(T__2);
							setState(2325);
							((WindowDefContext)_localctx).expression = expression();
							((WindowDefContext)_localctx).partition.add(((WindowDefContext)_localctx).expression);
							}
							}
							setState(2330);
							_errHandler.sync(this);
							_la = _input.LA(1);
						}
						}
					}

					setState(2343);
					_errHandler.sync(this);
					_la = _input.LA(1);
					if (_la==ORDER || _la==SORT) {
						{
						setState(2333);
						_la = _input.LA(1);
						if ( !(_la==ORDER || _la==SORT) ) {
						_errHandler.recoverInline(this);
						}
						else {
							if ( _input.LA(1)==Token.EOF ) matchedEOF = true;
							_errHandler.reportMatch(this);
							consume();
						}
						setState(2334);
						match(BY);
						setState(2335);
						sortItem();
						setState(2340);
						_errHandler.sync(this);
						_la = _input.LA(1);
						while (_la==T__2) {
							{
							{
							setState(2336);
							match(T__2);
							setState(2337);
							sortItem();
							}
							}
							setState(2342);
							_errHandler.sync(this);
							_la = _input.LA(1);
						}
						}
					}

					}
					break;
				default:
					throw new NoViableAltException(this);
				}
				setState(2348);
				_errHandler.sync(this);
				_la = _input.LA(1);
				if (_la==RANGE || _la==ROWS) {
					{
					setState(2347);
					windowFrame();
					}
				}

				setState(2350);
				match(T__1);
				}
				break;
			default:
				throw new NoViableAltException(this);
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static class WindowFrameContext extends ParserRuleContext {
		public Token frameType;
		public FrameBoundContext start;
		public FrameBoundContext end;
		public TerminalNode RANGE() { return getToken(sparkParser.RANGE, 0); }
		public List<FrameBoundContext> frameBound() {
			return getRuleContexts(FrameBoundContext.class);
		}
		public FrameBoundContext frameBound(int i) {
			return getRuleContext(FrameBoundContext.class,i);
		}
		public TerminalNode ROWS() { return getToken(sparkParser.ROWS, 0); }
		public TerminalNode BETWEEN() { return getToken(sparkParser.BETWEEN, 0); }
		public TerminalNode AND() { return getToken(sparkParser.AND, 0); }
		public WindowFrameContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_windowFrame; }
	}

	public final WindowFrameContext windowFrame() throws RecognitionException {
		WindowFrameContext _localctx = new WindowFrameContext(_ctx, getState());
		enterRule(_localctx, 186, RULE_windowFrame);
		try {
			setState(2369);
			_errHandler.sync(this);
			switch ( getInterpreter().adaptivePredict(_input,313,_ctx) ) {
			case 1:
				enterOuterAlt(_localctx, 1);
				{
				setState(2353);
				((WindowFrameContext)_localctx).frameType = match(RANGE);
				setState(2354);
				((WindowFrameContext)_localctx).start = frameBound();
				}
				break;
			case 2:
				enterOuterAlt(_localctx, 2);
				{
				setState(2355);
				((WindowFrameContext)_localctx).frameType = match(ROWS);
				setState(2356);
				((WindowFrameContext)_localctx).start = frameBound();
				}
				break;
			case 3:
				enterOuterAlt(_localctx, 3);
				{
				setState(2357);
				((WindowFrameContext)_localctx).frameType = match(RANGE);
				setState(2358);
				match(BETWEEN);
				setState(2359);
				((WindowFrameContext)_localctx).start = frameBound();
				setState(2360);
				match(AND);
				setState(2361);
				((WindowFrameContext)_localctx).end = frameBound();
				}
				break;
			case 4:
				enterOuterAlt(_localctx, 4);
				{
				setState(2363);
				((WindowFrameContext)_localctx).frameType = match(ROWS);
				setState(2364);
				match(BETWEEN);
				setState(2365);
				((WindowFrameContext)_localctx).start = frameBound();
				setState(2366);
				match(AND);
				setState(2367);
				((WindowFrameContext)_localctx).end = frameBound();
				}
				break;
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static class FrameBoundContext extends ParserRuleContext {
		public Token boundType;
		public TerminalNode UNBOUNDED() { return getToken(sparkParser.UNBOUNDED, 0); }
		public TerminalNode PRECEDING() { return getToken(sparkParser.PRECEDING, 0); }
		public TerminalNode FOLLOWING() { return getToken(sparkParser.FOLLOWING, 0); }
		public TerminalNode ROW() { return getToken(sparkParser.ROW, 0); }
		public TerminalNode CURRENT() { return getToken(sparkParser.CURRENT, 0); }
		public ExpressionContext expression() {
			return getRuleContext(ExpressionContext.class,0);
		}
		public FrameBoundContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_frameBound; }
	}

	public final FrameBoundContext frameBound() throws RecognitionException {
		FrameBoundContext _localctx = new FrameBoundContext(_ctx, getState());
		enterRule(_localctx, 188, RULE_frameBound);
		int _la;
		try {
			setState(2378);
			_errHandler.sync(this);
			switch ( getInterpreter().adaptivePredict(_input,314,_ctx) ) {
			case 1:
				enterOuterAlt(_localctx, 1);
				{
				setState(2371);
				match(UNBOUNDED);
				setState(2372);
				((FrameBoundContext)_localctx).boundType = _input.LT(1);
				_la = _input.LA(1);
				if ( !(_la==PRECEDING || _la==FOLLOWING) ) {
					((FrameBoundContext)_localctx).boundType = (Token)_errHandler.recoverInline(this);
				}
				else {
					if ( _input.LA(1)==Token.EOF ) matchedEOF = true;
					_errHandler.reportMatch(this);
					consume();
				}
				}
				break;
			case 2:
				enterOuterAlt(_localctx, 2);
				{
				setState(2373);
				((FrameBoundContext)_localctx).boundType = match(CURRENT);
				setState(2374);
				match(ROW);
				}
				break;
			case 3:
				enterOuterAlt(_localctx, 3);
				{
				setState(2375);
				expression();
				setState(2376);
				((FrameBoundContext)_localctx).boundType = _input.LT(1);
				_la = _input.LA(1);
				if ( !(_la==PRECEDING || _la==FOLLOWING) ) {
					((FrameBoundContext)_localctx).boundType = (Token)_errHandler.recoverInline(this);
				}
				else {
					if ( _input.LA(1)==Token.EOF ) matchedEOF = true;
					_errHandler.reportMatch(this);
					consume();
				}
				}
				break;
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static class QualifiedNameContext extends ParserRuleContext {
		public List<IdentifierContext> identifier() {
			return getRuleContexts(IdentifierContext.class);
		}
		public IdentifierContext identifier(int i) {
			return getRuleContext(IdentifierContext.class,i);
		}
		public QualifiedNameContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_qualifiedName; }
	}

	public final QualifiedNameContext qualifiedName() throws RecognitionException {
		QualifiedNameContext _localctx = new QualifiedNameContext(_ctx, getState());
		enterRule(_localctx, 190, RULE_qualifiedName);
		try {
			int _alt;
			enterOuterAlt(_localctx, 1);
			{
			setState(2380);
			identifier();
			setState(2385);
			_errHandler.sync(this);
			_alt = getInterpreter().adaptivePredict(_input,315,_ctx);
			while ( _alt!=2 && _alt!=org.antlr.v4.runtime.atn.ATN.INVALID_ALT_NUMBER ) {
				if ( _alt==1 ) {
					{
					{
					setState(2381);
					match(T__3);
					setState(2382);
					identifier();
					}
					} 
				}
				setState(2387);
				_errHandler.sync(this);
				_alt = getInterpreter().adaptivePredict(_input,315,_ctx);
			}
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static class IdentifierContext extends ParserRuleContext {
		public StrictIdentifierContext strictIdentifier() {
			return getRuleContext(StrictIdentifierContext.class,0);
		}
		public TerminalNode ANTI() { return getToken(sparkParser.ANTI, 0); }
		public TerminalNode FULL() { return getToken(sparkParser.FULL, 0); }
		public TerminalNode INNER() { return getToken(sparkParser.INNER, 0); }
		public TerminalNode LEFT() { return getToken(sparkParser.LEFT, 0); }
		public TerminalNode SEMI() { return getToken(sparkParser.SEMI, 0); }
		public TerminalNode RIGHT() { return getToken(sparkParser.RIGHT, 0); }
		public TerminalNode NATURAL() { return getToken(sparkParser.NATURAL, 0); }
		public TerminalNode JOIN() { return getToken(sparkParser.JOIN, 0); }
		public TerminalNode CROSS() { return getToken(sparkParser.CROSS, 0); }
		public TerminalNode ON() { return getToken(sparkParser.ON, 0); }
		public TerminalNode UNION() { return getToken(sparkParser.UNION, 0); }
		public TerminalNode INTERSECT() { return getToken(sparkParser.INTERSECT, 0); }
		public TerminalNode EXCEPT() { return getToken(sparkParser.EXCEPT, 0); }
		public TerminalNode SETMINUS() { return getToken(sparkParser.SETMINUS, 0); }
		public IdentifierContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_identifier; }
	}

	public final IdentifierContext identifier() throws RecognitionException {
		IdentifierContext _localctx = new IdentifierContext(_ctx, getState());
		enterRule(_localctx, 192, RULE_identifier);
		try {
			setState(2403);
			_errHandler.sync(this);
			switch (_input.LA(1)) {
			case SELECT:
			case FROM:
			case ADD:
			case AS:
			case ALL:
			case ANY:
			case DISTINCT:
			case WHERE:
			case GROUP:
			case BY:
			case GROUPING:
			case SETS:
			case CUBE:
			case ROLLUP:
			case ORDER:
			case HAVING:
			case LIMIT:
			case AT:
			case OR:
			case AND:
			case IN:
			case NOT:
			case NO:
			case EXISTS:
			case BETWEEN:
			case LIKE:
			case RLIKE:
			case IS:
			case NULL:
			case TRUE:
			case FALSE:
			case NULLS:
			case ASC:
			case DESC:
			case FOR:
			case INTERVAL:
			case CASE:
			case WHEN:
			case THEN:
			case ELSE:
			case END:
			case OUTER:
			case PIVOT:
			case LATERAL:
			case WINDOW:
			case OVER:
			case PARTITION:
			case RANGE:
			case ROWS:
			case UNBOUNDED:
			case PRECEDING:
			case FOLLOWING:
			case CURRENT:
			case FIRST:
			case AFTER:
			case LAST:
			case ROW:
			case WITH:
			case VALUES:
			case CREATE:
			case TABLE:
			case DIRECTORY:
			case VIEW:
			case REPLACE:
			case INSERT:
			case DELETE:
			case INTO:
			case DESCRIBE:
			case EXPLAIN:
			case FORMAT:
			case LOGICAL:
			case CODEGEN:
			case COST:
			case CAST:
			case SHOW:
			case TABLES:
			case COLUMNS:
			case COLUMN:
			case USE:
			case PARTITIONS:
			case FUNCTIONS:
			case DROP:
			case TO:
			case TABLESAMPLE:
			case STRATIFY:
			case ALTER:
			case RENAME:
			case ARRAY:
			case MAP:
			case STRUCT:
			case COMMENT:
			case SET:
			case RESET:
			case DATA:
			case START:
			case TRANSACTION:
			case COMMIT:
			case ROLLBACK:
			case MACRO:
			case IGNORE:
			case BOTH:
			case LEADING:
			case TRAILING:
			case IF:
			case POSITION:
			case EXTRACT:
			case DIV:
			case PERCENTLIT:
			case BUCKET:
			case OUT:
			case OF:
			case SORT:
			case CLUSTER:
			case DISTRIBUTE:
			case OVERWRITE:
			case TRANSFORM:
			case REDUCE:
			case SERDE:
			case SERDEPROPERTIES:
			case RECORDREADER:
			case RECORDWRITER:
			case DELIMITED:
			case FIELDS:
			case TERMINATED:
			case COLLECTION:
			case ITEMS:
			case KEYS:
			case ESCAPED:
			case LINES:
			case SEPARATED:
			case FUNCTION:
			case EXTENDED:
			case REFRESH:
			case CLEAR:
			case CACHE:
			case UNCACHE:
			case LAZY:
			case FORMATTED:
			case GLOBAL:
			case TEMPORARY:
			case OPTIONS:
			case UNSET:
			case TBLPROPERTIES:
			case DBPROPERTIES:
			case BUCKETS:
			case SKEWED:
			case STORED:
			case DIRECTORIES:
			case LOCATION:
			case EXCHANGE:
			case ARCHIVE:
			case UNARCHIVE:
			case FILEFORMAT:
			case TOUCH:
			case COMPACT:
			case CONCATENATE:
			case CHANGE:
			case CASCADE:
			case RESTRICT:
			case CLUSTERED:
			case SORTED:
			case PURGE:
			case INPUTFORMAT:
			case OUTPUTFORMAT:
			case DATABASE:
			case DATABASES:
			case DFS:
			case TRUNCATE:
			case ANALYZE:
			case COMPUTE:
			case LIST:
			case STATISTICS:
			case PARTITIONED:
			case EXTERNAL:
			case DEFINED:
			case REVOKE:
			case GRANT:
			case LOCK:
			case UNLOCK:
			case MSCK:
			case REPAIR:
			case RECOVER:
			case EXPORT:
			case IMPORT:
			case LOAD:
			case ROLE:
			case ROLES:
			case COMPACTIONS:
			case PRINCIPALS:
			case TRANSACTIONS:
			case INDEX:
			case INDEXES:
			case LOCKS:
			case OPTION:
			case LOCAL:
			case INPATH:
			case IDENTIFIER:
			case BACKQUOTED_IDENTIFIER:
				enterOuterAlt(_localctx, 1);
				{
				setState(2388);
				strictIdentifier();
				}
				break;
			case ANTI:
				enterOuterAlt(_localctx, 2);
				{
				setState(2389);
				match(ANTI);
				}
				break;
			case FULL:
				enterOuterAlt(_localctx, 3);
				{
				setState(2390);
				match(FULL);
				}
				break;
			case INNER:
				enterOuterAlt(_localctx, 4);
				{
				setState(2391);
				match(INNER);
				}
				break;
			case LEFT:
				enterOuterAlt(_localctx, 5);
				{
				setState(2392);
				match(LEFT);
				}
				break;
			case SEMI:
				enterOuterAlt(_localctx, 6);
				{
				setState(2393);
				match(SEMI);
				}
				break;
			case RIGHT:
				enterOuterAlt(_localctx, 7);
				{
				setState(2394);
				match(RIGHT);
				}
				break;
			case NATURAL:
				enterOuterAlt(_localctx, 8);
				{
				setState(2395);
				match(NATURAL);
				}
				break;
			case JOIN:
				enterOuterAlt(_localctx, 9);
				{
				setState(2396);
				match(JOIN);
				}
				break;
			case CROSS:
				enterOuterAlt(_localctx, 10);
				{
				setState(2397);
				match(CROSS);
				}
				break;
			case ON:
				enterOuterAlt(_localctx, 11);
				{
				setState(2398);
				match(ON);
				}
				break;
			case UNION:
				enterOuterAlt(_localctx, 12);
				{
				setState(2399);
				match(UNION);
				}
				break;
			case INTERSECT:
				enterOuterAlt(_localctx, 13);
				{
				setState(2400);
				match(INTERSECT);
				}
				break;
			case EXCEPT:
				enterOuterAlt(_localctx, 14);
				{
				setState(2401);
				match(EXCEPT);
				}
				break;
			case SETMINUS:
				enterOuterAlt(_localctx, 15);
				{
				setState(2402);
				match(SETMINUS);
				}
				break;
			default:
				throw new NoViableAltException(this);
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static class StrictIdentifierContext extends ParserRuleContext {
		public StrictIdentifierContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_strictIdentifier; }
	 
		public StrictIdentifierContext() { }
		public void copyFrom(StrictIdentifierContext ctx) {
			super.copyFrom(ctx);
		}
	}
	public static class QuotedIdentifierAlternativeContext extends StrictIdentifierContext {
		public QuotedIdentifierContext quotedIdentifier() {
			return getRuleContext(QuotedIdentifierContext.class,0);
		}
		public QuotedIdentifierAlternativeContext(StrictIdentifierContext ctx) { copyFrom(ctx); }
	}
	public static class UnquotedIdentifierContext extends StrictIdentifierContext {
		public TerminalNode IDENTIFIER() { return getToken(sparkParser.IDENTIFIER, 0); }
		public NonReservedContext nonReserved() {
			return getRuleContext(NonReservedContext.class,0);
		}
		public UnquotedIdentifierContext(StrictIdentifierContext ctx) { copyFrom(ctx); }
	}

	public final StrictIdentifierContext strictIdentifier() throws RecognitionException {
		StrictIdentifierContext _localctx = new StrictIdentifierContext(_ctx, getState());
		enterRule(_localctx, 194, RULE_strictIdentifier);
		try {
			setState(2408);
			_errHandler.sync(this);
			switch (_input.LA(1)) {
			case IDENTIFIER:
				_localctx = new UnquotedIdentifierContext(_localctx);
				enterOuterAlt(_localctx, 1);
				{
				setState(2405);
				match(IDENTIFIER);
				}
				break;
			case BACKQUOTED_IDENTIFIER:
				_localctx = new QuotedIdentifierAlternativeContext(_localctx);
				enterOuterAlt(_localctx, 2);
				{
				setState(2406);
				quotedIdentifier();
				}
				break;
			case SELECT:
			case FROM:
			case ADD:
			case AS:
			case ALL:
			case ANY:
			case DISTINCT:
			case WHERE:
			case GROUP:
			case BY:
			case GROUPING:
			case SETS:
			case CUBE:
			case ROLLUP:
			case ORDER:
			case HAVING:
			case LIMIT:
			case AT:
			case OR:
			case AND:
			case IN:
			case NOT:
			case NO:
			case EXISTS:
			case BETWEEN:
			case LIKE:
			case RLIKE:
			case IS:
			case NULL:
			case TRUE:
			case FALSE:
			case NULLS:
			case ASC:
			case DESC:
			case FOR:
			case INTERVAL:
			case CASE:
			case WHEN:
			case THEN:
			case ELSE:
			case END:
			case OUTER:
			case PIVOT:
			case LATERAL:
			case WINDOW:
			case OVER:
			case PARTITION:
			case RANGE:
			case ROWS:
			case UNBOUNDED:
			case PRECEDING:
			case FOLLOWING:
			case CURRENT:
			case FIRST:
			case AFTER:
			case LAST:
			case ROW:
			case WITH:
			case VALUES:
			case CREATE:
			case TABLE:
			case DIRECTORY:
			case VIEW:
			case REPLACE:
			case INSERT:
			case DELETE:
			case INTO:
			case DESCRIBE:
			case EXPLAIN:
			case FORMAT:
			case LOGICAL:
			case CODEGEN:
			case COST:
			case CAST:
			case SHOW:
			case TABLES:
			case COLUMNS:
			case COLUMN:
			case USE:
			case PARTITIONS:
			case FUNCTIONS:
			case DROP:
			case TO:
			case TABLESAMPLE:
			case STRATIFY:
			case ALTER:
			case RENAME:
			case ARRAY:
			case MAP:
			case STRUCT:
			case COMMENT:
			case SET:
			case RESET:
			case DATA:
			case START:
			case TRANSACTION:
			case COMMIT:
			case ROLLBACK:
			case MACRO:
			case IGNORE:
			case BOTH:
			case LEADING:
			case TRAILING:
			case IF:
			case POSITION:
			case EXTRACT:
			case DIV:
			case PERCENTLIT:
			case BUCKET:
			case OUT:
			case OF:
			case SORT:
			case CLUSTER:
			case DISTRIBUTE:
			case OVERWRITE:
			case TRANSFORM:
			case REDUCE:
			case SERDE:
			case SERDEPROPERTIES:
			case RECORDREADER:
			case RECORDWRITER:
			case DELIMITED:
			case FIELDS:
			case TERMINATED:
			case COLLECTION:
			case ITEMS:
			case KEYS:
			case ESCAPED:
			case LINES:
			case SEPARATED:
			case FUNCTION:
			case EXTENDED:
			case REFRESH:
			case CLEAR:
			case CACHE:
			case UNCACHE:
			case LAZY:
			case FORMATTED:
			case GLOBAL:
			case TEMPORARY:
			case OPTIONS:
			case UNSET:
			case TBLPROPERTIES:
			case DBPROPERTIES:
			case BUCKETS:
			case SKEWED:
			case STORED:
			case DIRECTORIES:
			case LOCATION:
			case EXCHANGE:
			case ARCHIVE:
			case UNARCHIVE:
			case FILEFORMAT:
			case TOUCH:
			case COMPACT:
			case CONCATENATE:
			case CHANGE:
			case CASCADE:
			case RESTRICT:
			case CLUSTERED:
			case SORTED:
			case PURGE:
			case INPUTFORMAT:
			case OUTPUTFORMAT:
			case DATABASE:
			case DATABASES:
			case DFS:
			case TRUNCATE:
			case ANALYZE:
			case COMPUTE:
			case LIST:
			case STATISTICS:
			case PARTITIONED:
			case EXTERNAL:
			case DEFINED:
			case REVOKE:
			case GRANT:
			case LOCK:
			case UNLOCK:
			case MSCK:
			case REPAIR:
			case RECOVER:
			case EXPORT:
			case IMPORT:
			case LOAD:
			case ROLE:
			case ROLES:
			case COMPACTIONS:
			case PRINCIPALS:
			case TRANSACTIONS:
			case INDEX:
			case INDEXES:
			case LOCKS:
			case OPTION:
			case LOCAL:
			case INPATH:
				_localctx = new UnquotedIdentifierContext(_localctx);
				enterOuterAlt(_localctx, 3);
				{
				setState(2407);
				nonReserved();
				}
				break;
			default:
				throw new NoViableAltException(this);
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static class QuotedIdentifierContext extends ParserRuleContext {
		public TerminalNode BACKQUOTED_IDENTIFIER() { return getToken(sparkParser.BACKQUOTED_IDENTIFIER, 0); }
		public QuotedIdentifierContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_quotedIdentifier; }
	}

	public final QuotedIdentifierContext quotedIdentifier() throws RecognitionException {
		QuotedIdentifierContext _localctx = new QuotedIdentifierContext(_ctx, getState());
		enterRule(_localctx, 196, RULE_quotedIdentifier);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(2410);
			match(BACKQUOTED_IDENTIFIER);
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static class NumberContext extends ParserRuleContext {
		public NumberContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_number; }
	 
		public NumberContext() { }
		public void copyFrom(NumberContext ctx) {
			super.copyFrom(ctx);
		}
	}
	public static class DecimalLiteralContext extends NumberContext {
		public TerminalNode DECIMAL_VALUE() { return getToken(sparkParser.DECIMAL_VALUE, 0); }
		public TerminalNode MINUS() { return getToken(sparkParser.MINUS, 0); }
		public DecimalLiteralContext(NumberContext ctx) { copyFrom(ctx); }
	}
	public static class BigIntLiteralContext extends NumberContext {
		public TerminalNode BIGINT_LITERAL() { return getToken(sparkParser.BIGINT_LITERAL, 0); }
		public TerminalNode MINUS() { return getToken(sparkParser.MINUS, 0); }
		public BigIntLiteralContext(NumberContext ctx) { copyFrom(ctx); }
	}
	public static class TinyIntLiteralContext extends NumberContext {
		public TerminalNode TINYINT_LITERAL() { return getToken(sparkParser.TINYINT_LITERAL, 0); }
		public TerminalNode MINUS() { return getToken(sparkParser.MINUS, 0); }
		public TinyIntLiteralContext(NumberContext ctx) { copyFrom(ctx); }
	}
	public static class BigDecimalLiteralContext extends NumberContext {
		public TerminalNode BIGDECIMAL_LITERAL() { return getToken(sparkParser.BIGDECIMAL_LITERAL, 0); }
		public TerminalNode MINUS() { return getToken(sparkParser.MINUS, 0); }
		public BigDecimalLiteralContext(NumberContext ctx) { copyFrom(ctx); }
	}
	public static class DoubleLiteralContext extends NumberContext {
		public TerminalNode DOUBLE_LITERAL() { return getToken(sparkParser.DOUBLE_LITERAL, 0); }
		public TerminalNode MINUS() { return getToken(sparkParser.MINUS, 0); }
		public DoubleLiteralContext(NumberContext ctx) { copyFrom(ctx); }
	}
	public static class IntegerLiteralContext extends NumberContext {
		public TerminalNode INTEGER_VALUE() { return getToken(sparkParser.INTEGER_VALUE, 0); }
		public TerminalNode MINUS() { return getToken(sparkParser.MINUS, 0); }
		public IntegerLiteralContext(NumberContext ctx) { copyFrom(ctx); }
	}
	public static class SmallIntLiteralContext extends NumberContext {
		public TerminalNode SMALLINT_LITERAL() { return getToken(sparkParser.SMALLINT_LITERAL, 0); }
		public TerminalNode MINUS() { return getToken(sparkParser.MINUS, 0); }
		public SmallIntLiteralContext(NumberContext ctx) { copyFrom(ctx); }
	}

	public final NumberContext number() throws RecognitionException {
		NumberContext _localctx = new NumberContext(_ctx, getState());
		enterRule(_localctx, 198, RULE_number);
		int _la;
		try {
			setState(2440);
			_errHandler.sync(this);
			switch ( getInterpreter().adaptivePredict(_input,325,_ctx) ) {
			case 1:
				_localctx = new DecimalLiteralContext(_localctx);
				enterOuterAlt(_localctx, 1);
				{
				setState(2413);
				_errHandler.sync(this);
				_la = _input.LA(1);
				if (_la==MINUS) {
					{
					setState(2412);
					match(MINUS);
					}
				}

				setState(2415);
				match(DECIMAL_VALUE);
				}
				break;
			case 2:
				_localctx = new IntegerLiteralContext(_localctx);
				enterOuterAlt(_localctx, 2);
				{
				setState(2417);
				_errHandler.sync(this);
				_la = _input.LA(1);
				if (_la==MINUS) {
					{
					setState(2416);
					match(MINUS);
					}
				}

				setState(2419);
				match(INTEGER_VALUE);
				}
				break;
			case 3:
				_localctx = new BigIntLiteralContext(_localctx);
				enterOuterAlt(_localctx, 3);
				{
				setState(2421);
				_errHandler.sync(this);
				_la = _input.LA(1);
				if (_la==MINUS) {
					{
					setState(2420);
					match(MINUS);
					}
				}

				setState(2423);
				match(BIGINT_LITERAL);
				}
				break;
			case 4:
				_localctx = new SmallIntLiteralContext(_localctx);
				enterOuterAlt(_localctx, 4);
				{
				setState(2425);
				_errHandler.sync(this);
				_la = _input.LA(1);
				if (_la==MINUS) {
					{
					setState(2424);
					match(MINUS);
					}
				}

				setState(2427);
				match(SMALLINT_LITERAL);
				}
				break;
			case 5:
				_localctx = new TinyIntLiteralContext(_localctx);
				enterOuterAlt(_localctx, 5);
				{
				setState(2429);
				_errHandler.sync(this);
				_la = _input.LA(1);
				if (_la==MINUS) {
					{
					setState(2428);
					match(MINUS);
					}
				}

				setState(2431);
				match(TINYINT_LITERAL);
				}
				break;
			case 6:
				_localctx = new DoubleLiteralContext(_localctx);
				enterOuterAlt(_localctx, 6);
				{
				setState(2433);
				_errHandler.sync(this);
				_la = _input.LA(1);
				if (_la==MINUS) {
					{
					setState(2432);
					match(MINUS);
					}
				}

				setState(2435);
				match(DOUBLE_LITERAL);
				}
				break;
			case 7:
				_localctx = new BigDecimalLiteralContext(_localctx);
				enterOuterAlt(_localctx, 7);
				{
				setState(2437);
				_errHandler.sync(this);
				_la = _input.LA(1);
				if (_la==MINUS) {
					{
					setState(2436);
					match(MINUS);
					}
				}

				setState(2439);
				match(BIGDECIMAL_LITERAL);
				}
				break;
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static class NonReservedContext extends ParserRuleContext {
		public TerminalNode SHOW() { return getToken(sparkParser.SHOW, 0); }
		public TerminalNode TABLES() { return getToken(sparkParser.TABLES, 0); }
		public TerminalNode COLUMNS() { return getToken(sparkParser.COLUMNS, 0); }
		public TerminalNode COLUMN() { return getToken(sparkParser.COLUMN, 0); }
		public TerminalNode PARTITIONS() { return getToken(sparkParser.PARTITIONS, 0); }
		public TerminalNode FUNCTIONS() { return getToken(sparkParser.FUNCTIONS, 0); }
		public TerminalNode DATABASES() { return getToken(sparkParser.DATABASES, 0); }
		public TerminalNode ADD() { return getToken(sparkParser.ADD, 0); }
		public TerminalNode OVER() { return getToken(sparkParser.OVER, 0); }
		public TerminalNode PARTITION() { return getToken(sparkParser.PARTITION, 0); }
		public TerminalNode RANGE() { return getToken(sparkParser.RANGE, 0); }
		public TerminalNode ROWS() { return getToken(sparkParser.ROWS, 0); }
		public TerminalNode PRECEDING() { return getToken(sparkParser.PRECEDING, 0); }
		public TerminalNode FOLLOWING() { return getToken(sparkParser.FOLLOWING, 0); }
		public TerminalNode CURRENT() { return getToken(sparkParser.CURRENT, 0); }
		public TerminalNode ROW() { return getToken(sparkParser.ROW, 0); }
		public TerminalNode LAST() { return getToken(sparkParser.LAST, 0); }
		public TerminalNode FIRST() { return getToken(sparkParser.FIRST, 0); }
		public TerminalNode AFTER() { return getToken(sparkParser.AFTER, 0); }
		public TerminalNode MAP() { return getToken(sparkParser.MAP, 0); }
		public TerminalNode ARRAY() { return getToken(sparkParser.ARRAY, 0); }
		public TerminalNode STRUCT() { return getToken(sparkParser.STRUCT, 0); }
		public TerminalNode PIVOT() { return getToken(sparkParser.PIVOT, 0); }
		public TerminalNode LATERAL() { return getToken(sparkParser.LATERAL, 0); }
		public TerminalNode WINDOW() { return getToken(sparkParser.WINDOW, 0); }
		public TerminalNode REDUCE() { return getToken(sparkParser.REDUCE, 0); }
		public TerminalNode TRANSFORM() { return getToken(sparkParser.TRANSFORM, 0); }
		public TerminalNode SERDE() { return getToken(sparkParser.SERDE, 0); }
		public TerminalNode SERDEPROPERTIES() { return getToken(sparkParser.SERDEPROPERTIES, 0); }
		public TerminalNode RECORDREADER() { return getToken(sparkParser.RECORDREADER, 0); }
		public TerminalNode DELIMITED() { return getToken(sparkParser.DELIMITED, 0); }
		public TerminalNode FIELDS() { return getToken(sparkParser.FIELDS, 0); }
		public TerminalNode TERMINATED() { return getToken(sparkParser.TERMINATED, 0); }
		public TerminalNode COLLECTION() { return getToken(sparkParser.COLLECTION, 0); }
		public TerminalNode ITEMS() { return getToken(sparkParser.ITEMS, 0); }
		public TerminalNode KEYS() { return getToken(sparkParser.KEYS, 0); }
		public TerminalNode ESCAPED() { return getToken(sparkParser.ESCAPED, 0); }
		public TerminalNode LINES() { return getToken(sparkParser.LINES, 0); }
		public TerminalNode SEPARATED() { return getToken(sparkParser.SEPARATED, 0); }
		public TerminalNode EXTENDED() { return getToken(sparkParser.EXTENDED, 0); }
		public TerminalNode REFRESH() { return getToken(sparkParser.REFRESH, 0); }
		public TerminalNode CLEAR() { return getToken(sparkParser.CLEAR, 0); }
		public TerminalNode CACHE() { return getToken(sparkParser.CACHE, 0); }
		public TerminalNode UNCACHE() { return getToken(sparkParser.UNCACHE, 0); }
		public TerminalNode LAZY() { return getToken(sparkParser.LAZY, 0); }
		public TerminalNode GLOBAL() { return getToken(sparkParser.GLOBAL, 0); }
		public TerminalNode TEMPORARY() { return getToken(sparkParser.TEMPORARY, 0); }
		public TerminalNode OPTIONS() { return getToken(sparkParser.OPTIONS, 0); }
		public TerminalNode GROUPING() { return getToken(sparkParser.GROUPING, 0); }
		public TerminalNode CUBE() { return getToken(sparkParser.CUBE, 0); }
		public TerminalNode ROLLUP() { return getToken(sparkParser.ROLLUP, 0); }
		public TerminalNode EXPLAIN() { return getToken(sparkParser.EXPLAIN, 0); }
		public TerminalNode FORMAT() { return getToken(sparkParser.FORMAT, 0); }
		public TerminalNode LOGICAL() { return getToken(sparkParser.LOGICAL, 0); }
		public TerminalNode FORMATTED() { return getToken(sparkParser.FORMATTED, 0); }
		public TerminalNode CODEGEN() { return getToken(sparkParser.CODEGEN, 0); }
		public TerminalNode COST() { return getToken(sparkParser.COST, 0); }
		public TerminalNode TABLESAMPLE() { return getToken(sparkParser.TABLESAMPLE, 0); }
		public TerminalNode USE() { return getToken(sparkParser.USE, 0); }
		public TerminalNode TO() { return getToken(sparkParser.TO, 0); }
		public TerminalNode BUCKET() { return getToken(sparkParser.BUCKET, 0); }
		public TerminalNode PERCENTLIT() { return getToken(sparkParser.PERCENTLIT, 0); }
		public TerminalNode OUT() { return getToken(sparkParser.OUT, 0); }
		public TerminalNode OF() { return getToken(sparkParser.OF, 0); }
		public TerminalNode SET() { return getToken(sparkParser.SET, 0); }
		public TerminalNode RESET() { return getToken(sparkParser.RESET, 0); }
		public TerminalNode VIEW() { return getToken(sparkParser.VIEW, 0); }
		public TerminalNode REPLACE() { return getToken(sparkParser.REPLACE, 0); }
		public TerminalNode IF() { return getToken(sparkParser.IF, 0); }
		public TerminalNode POSITION() { return getToken(sparkParser.POSITION, 0); }
		public TerminalNode EXTRACT() { return getToken(sparkParser.EXTRACT, 0); }
		public TerminalNode NO() { return getToken(sparkParser.NO, 0); }
		public TerminalNode DATA() { return getToken(sparkParser.DATA, 0); }
		public TerminalNode START() { return getToken(sparkParser.START, 0); }
		public TerminalNode TRANSACTION() { return getToken(sparkParser.TRANSACTION, 0); }
		public TerminalNode COMMIT() { return getToken(sparkParser.COMMIT, 0); }
		public TerminalNode ROLLBACK() { return getToken(sparkParser.ROLLBACK, 0); }
		public TerminalNode IGNORE() { return getToken(sparkParser.IGNORE, 0); }
		public TerminalNode SORT() { return getToken(sparkParser.SORT, 0); }
		public TerminalNode CLUSTER() { return getToken(sparkParser.CLUSTER, 0); }
		public TerminalNode DISTRIBUTE() { return getToken(sparkParser.DISTRIBUTE, 0); }
		public TerminalNode UNSET() { return getToken(sparkParser.UNSET, 0); }
		public TerminalNode TBLPROPERTIES() { return getToken(sparkParser.TBLPROPERTIES, 0); }
		public TerminalNode SKEWED() { return getToken(sparkParser.SKEWED, 0); }
		public TerminalNode STORED() { return getToken(sparkParser.STORED, 0); }
		public TerminalNode DIRECTORIES() { return getToken(sparkParser.DIRECTORIES, 0); }
		public TerminalNode LOCATION() { return getToken(sparkParser.LOCATION, 0); }
		public TerminalNode EXCHANGE() { return getToken(sparkParser.EXCHANGE, 0); }
		public TerminalNode ARCHIVE() { return getToken(sparkParser.ARCHIVE, 0); }
		public TerminalNode UNARCHIVE() { return getToken(sparkParser.UNARCHIVE, 0); }
		public TerminalNode FILEFORMAT() { return getToken(sparkParser.FILEFORMAT, 0); }
		public TerminalNode TOUCH() { return getToken(sparkParser.TOUCH, 0); }
		public TerminalNode COMPACT() { return getToken(sparkParser.COMPACT, 0); }
		public TerminalNode CONCATENATE() { return getToken(sparkParser.CONCATENATE, 0); }
		public TerminalNode CHANGE() { return getToken(sparkParser.CHANGE, 0); }
		public TerminalNode CASCADE() { return getToken(sparkParser.CASCADE, 0); }
		public TerminalNode RESTRICT() { return getToken(sparkParser.RESTRICT, 0); }
		public TerminalNode BUCKETS() { return getToken(sparkParser.BUCKETS, 0); }
		public TerminalNode CLUSTERED() { return getToken(sparkParser.CLUSTERED, 0); }
		public TerminalNode SORTED() { return getToken(sparkParser.SORTED, 0); }
		public TerminalNode PURGE() { return getToken(sparkParser.PURGE, 0); }
		public TerminalNode INPUTFORMAT() { return getToken(sparkParser.INPUTFORMAT, 0); }
		public TerminalNode OUTPUTFORMAT() { return getToken(sparkParser.OUTPUTFORMAT, 0); }
		public TerminalNode DBPROPERTIES() { return getToken(sparkParser.DBPROPERTIES, 0); }
		public TerminalNode DFS() { return getToken(sparkParser.DFS, 0); }
		public TerminalNode TRUNCATE() { return getToken(sparkParser.TRUNCATE, 0); }
		public TerminalNode COMPUTE() { return getToken(sparkParser.COMPUTE, 0); }
		public TerminalNode LIST() { return getToken(sparkParser.LIST, 0); }
		public TerminalNode STATISTICS() { return getToken(sparkParser.STATISTICS, 0); }
		public TerminalNode ANALYZE() { return getToken(sparkParser.ANALYZE, 0); }
		public TerminalNode PARTITIONED() { return getToken(sparkParser.PARTITIONED, 0); }
		public TerminalNode EXTERNAL() { return getToken(sparkParser.EXTERNAL, 0); }
		public TerminalNode DEFINED() { return getToken(sparkParser.DEFINED, 0); }
		public TerminalNode RECORDWRITER() { return getToken(sparkParser.RECORDWRITER, 0); }
		public TerminalNode REVOKE() { return getToken(sparkParser.REVOKE, 0); }
		public TerminalNode GRANT() { return getToken(sparkParser.GRANT, 0); }
		public TerminalNode LOCK() { return getToken(sparkParser.LOCK, 0); }
		public TerminalNode UNLOCK() { return getToken(sparkParser.UNLOCK, 0); }
		public TerminalNode MSCK() { return getToken(sparkParser.MSCK, 0); }
		public TerminalNode REPAIR() { return getToken(sparkParser.REPAIR, 0); }
		public TerminalNode RECOVER() { return getToken(sparkParser.RECOVER, 0); }
		public TerminalNode EXPORT() { return getToken(sparkParser.EXPORT, 0); }
		public TerminalNode IMPORT() { return getToken(sparkParser.IMPORT, 0); }
		public TerminalNode LOAD() { return getToken(sparkParser.LOAD, 0); }
		public TerminalNode VALUES() { return getToken(sparkParser.VALUES, 0); }
		public TerminalNode COMMENT() { return getToken(sparkParser.COMMENT, 0); }
		public TerminalNode ROLE() { return getToken(sparkParser.ROLE, 0); }
		public TerminalNode ROLES() { return getToken(sparkParser.ROLES, 0); }
		public TerminalNode COMPACTIONS() { return getToken(sparkParser.COMPACTIONS, 0); }
		public TerminalNode PRINCIPALS() { return getToken(sparkParser.PRINCIPALS, 0); }
		public TerminalNode TRANSACTIONS() { return getToken(sparkParser.TRANSACTIONS, 0); }
		public TerminalNode INDEX() { return getToken(sparkParser.INDEX, 0); }
		public TerminalNode INDEXES() { return getToken(sparkParser.INDEXES, 0); }
		public TerminalNode LOCKS() { return getToken(sparkParser.LOCKS, 0); }
		public TerminalNode OPTION() { return getToken(sparkParser.OPTION, 0); }
		public TerminalNode LOCAL() { return getToken(sparkParser.LOCAL, 0); }
		public TerminalNode INPATH() { return getToken(sparkParser.INPATH, 0); }
		public TerminalNode ASC() { return getToken(sparkParser.ASC, 0); }
		public TerminalNode DESC() { return getToken(sparkParser.DESC, 0); }
		public TerminalNode LIMIT() { return getToken(sparkParser.LIMIT, 0); }
		public TerminalNode RENAME() { return getToken(sparkParser.RENAME, 0); }
		public TerminalNode SETS() { return getToken(sparkParser.SETS, 0); }
		public TerminalNode AT() { return getToken(sparkParser.AT, 0); }
		public TerminalNode NULLS() { return getToken(sparkParser.NULLS, 0); }
		public TerminalNode OVERWRITE() { return getToken(sparkParser.OVERWRITE, 0); }
		public TerminalNode ALL() { return getToken(sparkParser.ALL, 0); }
		public TerminalNode ANY() { return getToken(sparkParser.ANY, 0); }
		public TerminalNode ALTER() { return getToken(sparkParser.ALTER, 0); }
		public TerminalNode AS() { return getToken(sparkParser.AS, 0); }
		public TerminalNode BETWEEN() { return getToken(sparkParser.BETWEEN, 0); }
		public TerminalNode BY() { return getToken(sparkParser.BY, 0); }
		public TerminalNode CREATE() { return getToken(sparkParser.CREATE, 0); }
		public TerminalNode DELETE() { return getToken(sparkParser.DELETE, 0); }
		public TerminalNode DESCRIBE() { return getToken(sparkParser.DESCRIBE, 0); }
		public TerminalNode DROP() { return getToken(sparkParser.DROP, 0); }
		public TerminalNode EXISTS() { return getToken(sparkParser.EXISTS, 0); }
		public TerminalNode FALSE() { return getToken(sparkParser.FALSE, 0); }
		public TerminalNode FOR() { return getToken(sparkParser.FOR, 0); }
		public TerminalNode GROUP() { return getToken(sparkParser.GROUP, 0); }
		public TerminalNode IN() { return getToken(sparkParser.IN, 0); }
		public TerminalNode INSERT() { return getToken(sparkParser.INSERT, 0); }
		public TerminalNode INTO() { return getToken(sparkParser.INTO, 0); }
		public TerminalNode IS() { return getToken(sparkParser.IS, 0); }
		public TerminalNode LIKE() { return getToken(sparkParser.LIKE, 0); }
		public TerminalNode NULL() { return getToken(sparkParser.NULL, 0); }
		public TerminalNode ORDER() { return getToken(sparkParser.ORDER, 0); }
		public TerminalNode OUTER() { return getToken(sparkParser.OUTER, 0); }
		public TerminalNode TABLE() { return getToken(sparkParser.TABLE, 0); }
		public TerminalNode TRUE() { return getToken(sparkParser.TRUE, 0); }
		public TerminalNode WITH() { return getToken(sparkParser.WITH, 0); }
		public TerminalNode RLIKE() { return getToken(sparkParser.RLIKE, 0); }
		public TerminalNode AND() { return getToken(sparkParser.AND, 0); }
		public TerminalNode CASE() { return getToken(sparkParser.CASE, 0); }
		public TerminalNode CAST() { return getToken(sparkParser.CAST, 0); }
		public TerminalNode DISTINCT() { return getToken(sparkParser.DISTINCT, 0); }
		public TerminalNode DIV() { return getToken(sparkParser.DIV, 0); }
		public TerminalNode ELSE() { return getToken(sparkParser.ELSE, 0); }
		public TerminalNode END() { return getToken(sparkParser.END, 0); }
		public TerminalNode FUNCTION() { return getToken(sparkParser.FUNCTION, 0); }
		public TerminalNode INTERVAL() { return getToken(sparkParser.INTERVAL, 0); }
		public TerminalNode MACRO() { return getToken(sparkParser.MACRO, 0); }
		public TerminalNode OR() { return getToken(sparkParser.OR, 0); }
		public TerminalNode STRATIFY() { return getToken(sparkParser.STRATIFY, 0); }
		public TerminalNode THEN() { return getToken(sparkParser.THEN, 0); }
		public TerminalNode UNBOUNDED() { return getToken(sparkParser.UNBOUNDED, 0); }
		public TerminalNode WHEN() { return getToken(sparkParser.WHEN, 0); }
		public TerminalNode DATABASE() { return getToken(sparkParser.DATABASE, 0); }
		public TerminalNode SELECT() { return getToken(sparkParser.SELECT, 0); }
		public TerminalNode FROM() { return getToken(sparkParser.FROM, 0); }
		public TerminalNode WHERE() { return getToken(sparkParser.WHERE, 0); }
		public TerminalNode HAVING() { return getToken(sparkParser.HAVING, 0); }
		public TerminalNode NOT() { return getToken(sparkParser.NOT, 0); }
		public TerminalNode DIRECTORY() { return getToken(sparkParser.DIRECTORY, 0); }
		public TerminalNode BOTH() { return getToken(sparkParser.BOTH, 0); }
		public TerminalNode LEADING() { return getToken(sparkParser.LEADING, 0); }
		public TerminalNode TRAILING() { return getToken(sparkParser.TRAILING, 0); }
		public NonReservedContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_nonReserved; }
	}

	public final NonReservedContext nonReserved() throws RecognitionException {
		NonReservedContext _localctx = new NonReservedContext(_ctx, getState());
		enterRule(_localctx, 200, RULE_nonReserved);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(2442);
			_la = _input.LA(1);
			if ( !((((_la) & ~0x3f) == 0 && ((1L << _la) & ((1L << SELECT) | (1L << FROM) | (1L << ADD) | (1L << AS) | (1L << ALL) | (1L << ANY) | (1L << DISTINCT) | (1L << WHERE) | (1L << GROUP) | (1L << BY) | (1L << GROUPING) | (1L << SETS) | (1L << CUBE) | (1L << ROLLUP) | (1L << ORDER) | (1L << HAVING) | (1L << LIMIT) | (1L << AT) | (1L << OR) | (1L << AND) | (1L << IN) | (1L << NOT) | (1L << NO) | (1L << EXISTS) | (1L << BETWEEN) | (1L << LIKE) | (1L << RLIKE) | (1L << IS) | (1L << NULL) | (1L << TRUE) | (1L << FALSE) | (1L << NULLS) | (1L << ASC) | (1L << DESC) | (1L << FOR) | (1L << INTERVAL) | (1L << CASE) | (1L << WHEN) | (1L << THEN) | (1L << ELSE) | (1L << END) | (1L << OUTER) | (1L << PIVOT) | (1L << LATERAL))) != 0) || ((((_la - 64)) & ~0x3f) == 0 && ((1L << (_la - 64)) & ((1L << (WINDOW - 64)) | (1L << (OVER - 64)) | (1L << (PARTITION - 64)) | (1L << (RANGE - 64)) | (1L << (ROWS - 64)) | (1L << (UNBOUNDED - 64)) | (1L << (PRECEDING - 64)) | (1L << (FOLLOWING - 64)) | (1L << (CURRENT - 64)) | (1L << (FIRST - 64)) | (1L << (AFTER - 64)) | (1L << (LAST - 64)) | (1L << (ROW - 64)) | (1L << (WITH - 64)) | (1L << (VALUES - 64)) | (1L << (CREATE - 64)) | (1L << (TABLE - 64)) | (1L << (DIRECTORY - 64)) | (1L << (VIEW - 64)) | (1L << (REPLACE - 64)) | (1L << (INSERT - 64)) | (1L << (DELETE - 64)) | (1L << (INTO - 64)) | (1L << (DESCRIBE - 64)) | (1L << (EXPLAIN - 64)) | (1L << (FORMAT - 64)) | (1L << (LOGICAL - 64)) | (1L << (CODEGEN - 64)) | (1L << (COST - 64)) | (1L << (CAST - 64)) | (1L << (SHOW - 64)) | (1L << (TABLES - 64)) | (1L << (COLUMNS - 64)) | (1L << (COLUMN - 64)) | (1L << (USE - 64)) | (1L << (PARTITIONS - 64)) | (1L << (FUNCTIONS - 64)) | (1L << (DROP - 64)) | (1L << (TO - 64)) | (1L << (TABLESAMPLE - 64)) | (1L << (STRATIFY - 64)) | (1L << (ALTER - 64)) | (1L << (RENAME - 64)) | (1L << (ARRAY - 64)) | (1L << (MAP - 64)) | (1L << (STRUCT - 64)) | (1L << (COMMENT - 64)) | (1L << (SET - 64)) | (1L << (RESET - 64)) | (1L << (DATA - 64)) | (1L << (START - 64)) | (1L << (TRANSACTION - 64)) | (1L << (COMMIT - 64)) | (1L << (ROLLBACK - 64)) | (1L << (MACRO - 64)) | (1L << (IGNORE - 64)) | (1L << (BOTH - 64)) | (1L << (LEADING - 64)) | (1L << (TRAILING - 64)) | (1L << (IF - 64)))) != 0) || ((((_la - 128)) & ~0x3f) == 0 && ((1L << (_la - 128)) & ((1L << (POSITION - 128)) | (1L << (EXTRACT - 128)) | (1L << (DIV - 128)) | (1L << (PERCENTLIT - 128)) | (1L << (BUCKET - 128)) | (1L << (OUT - 128)) | (1L << (OF - 128)) | (1L << (SORT - 128)) | (1L << (CLUSTER - 128)) | (1L << (DISTRIBUTE - 128)) | (1L << (OVERWRITE - 128)) | (1L << (TRANSFORM - 128)) | (1L << (REDUCE - 128)) | (1L << (SERDE - 128)) | (1L << (SERDEPROPERTIES - 128)) | (1L << (RECORDREADER - 128)) | (1L << (RECORDWRITER - 128)) | (1L << (DELIMITED - 128)) | (1L << (FIELDS - 128)) | (1L << (TERMINATED - 128)) | (1L << (COLLECTION - 128)) | (1L << (ITEMS - 128)) | (1L << (KEYS - 128)) | (1L << (ESCAPED - 128)) | (1L << (LINES - 128)) | (1L << (SEPARATED - 128)) | (1L << (FUNCTION - 128)) | (1L << (EXTENDED - 128)) | (1L << (REFRESH - 128)) | (1L << (CLEAR - 128)) | (1L << (CACHE - 128)) | (1L << (UNCACHE - 128)) | (1L << (LAZY - 128)) | (1L << (FORMATTED - 128)) | (1L << (GLOBAL - 128)) | (1L << (TEMPORARY - 128)) | (1L << (OPTIONS - 128)) | (1L << (UNSET - 128)) | (1L << (TBLPROPERTIES - 128)) | (1L << (DBPROPERTIES - 128)) | (1L << (BUCKETS - 128)) | (1L << (SKEWED - 128)) | (1L << (STORED - 128)) | (1L << (DIRECTORIES - 128)) | (1L << (LOCATION - 128)))) != 0) || ((((_la - 192)) & ~0x3f) == 0 && ((1L << (_la - 192)) & ((1L << (EXCHANGE - 192)) | (1L << (ARCHIVE - 192)) | (1L << (UNARCHIVE - 192)) | (1L << (FILEFORMAT - 192)) | (1L << (TOUCH - 192)) | (1L << (COMPACT - 192)) | (1L << (CONCATENATE - 192)) | (1L << (CHANGE - 192)) | (1L << (CASCADE - 192)) | (1L << (RESTRICT - 192)) | (1L << (CLUSTERED - 192)) | (1L << (SORTED - 192)) | (1L << (PURGE - 192)) | (1L << (INPUTFORMAT - 192)) | (1L << (OUTPUTFORMAT - 192)) | (1L << (DATABASE - 192)) | (1L << (DATABASES - 192)) | (1L << (DFS - 192)) | (1L << (TRUNCATE - 192)) | (1L << (ANALYZE - 192)) | (1L << (COMPUTE - 192)) | (1L << (LIST - 192)) | (1L << (STATISTICS - 192)) | (1L << (PARTITIONED - 192)) | (1L << (EXTERNAL - 192)) | (1L << (DEFINED - 192)) | (1L << (REVOKE - 192)) | (1L << (GRANT - 192)) | (1L << (LOCK - 192)) | (1L << (UNLOCK - 192)) | (1L << (MSCK - 192)) | (1L << (REPAIR - 192)) | (1L << (RECOVER - 192)) | (1L << (EXPORT - 192)) | (1L << (IMPORT - 192)) | (1L << (LOAD - 192)) | (1L << (ROLE - 192)) | (1L << (ROLES - 192)) | (1L << (COMPACTIONS - 192)) | (1L << (PRINCIPALS - 192)) | (1L << (TRANSACTIONS - 192)) | (1L << (INDEX - 192)) | (1L << (INDEXES - 192)) | (1L << (LOCKS - 192)) | (1L << (OPTION - 192)) | (1L << (LOCAL - 192)) | (1L << (INPATH - 192)))) != 0)) ) {
			_errHandler.recoverInline(this);
			}
			else {
				if ( _input.LA(1)==Token.EOF ) matchedEOF = true;
				_errHandler.reportMatch(this);
				consume();
			}
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public boolean sempred(RuleContext _localctx, int ruleIndex, int predIndex) {
		switch (ruleIndex) {
		case 35:
			return queryTerm_sempred((QueryTermContext)_localctx, predIndex);
		case 71:
			return booleanExpression_sempred((BooleanExpressionContext)_localctx, predIndex);
		case 73:
			return valueExpression_sempred((ValueExpressionContext)_localctx, predIndex);
		case 74:
			return primaryExpression_sempred((PrimaryExpressionContext)_localctx, predIndex);
		}
		return true;
	}
	private boolean queryTerm_sempred(QueryTermContext _localctx, int predIndex) {
		switch (predIndex) {
		case 0:
			return precpred(_ctx, 3);
		case 1:
			return this.legacy_setops_precedence_enbled;
		case 2:
			return precpred(_ctx, 2);
		case 3:
			return !this.legacy_setops_precedence_enbled;
		case 4:
			return precpred(_ctx, 1);
		case 5:
			return !this.legacy_setops_precedence_enbled;
		}
		return true;
	}
	private boolean booleanExpression_sempred(BooleanExpressionContext _localctx, int predIndex) {
		switch (predIndex) {
		case 6:
			return precpred(_ctx, 2);
		case 7:
			return precpred(_ctx, 1);
		}
		return true;
	}
	private boolean valueExpression_sempred(ValueExpressionContext _localctx, int predIndex) {
		switch (predIndex) {
		case 8:
			return precpred(_ctx, 6);
		case 9:
			return precpred(_ctx, 5);
		case 10:
			return precpred(_ctx, 4);
		case 11:
			return precpred(_ctx, 3);
		case 12:
			return precpred(_ctx, 2);
		case 13:
			return precpred(_ctx, 1);
		}
		return true;
	}
	private boolean primaryExpression_sempred(PrimaryExpressionContext _localctx, int predIndex) {
		switch (predIndex) {
		case 14:
			return precpred(_ctx, 5);
		case 15:
			return precpred(_ctx, 3);
		}
		return true;
	}

	private static final int _serializedATNSegments = 2;
	private static final String _serializedATNSegment0 =
		"\3\u608b\ua72a\u8133\ub9ed\u417c\u3be7\u7786\u5964\3\u0100\u098f\4\2\t"+
		"\2\4\3\t\3\4\4\t\4\4\5\t\5\4\6\t\6\4\7\t\7\4\b\t\b\4\t\t\t\4\n\t\n\4\13"+
		"\t\13\4\f\t\f\4\r\t\r\4\16\t\16\4\17\t\17\4\20\t\20\4\21\t\21\4\22\t\22"+
		"\4\23\t\23\4\24\t\24\4\25\t\25\4\26\t\26\4\27\t\27\4\30\t\30\4\31\t\31"+
		"\4\32\t\32\4\33\t\33\4\34\t\34\4\35\t\35\4\36\t\36\4\37\t\37\4 \t \4!"+
		"\t!\4\"\t\"\4#\t#\4$\t$\4%\t%\4&\t&\4\'\t\'\4(\t(\4)\t)\4*\t*\4+\t+\4"+
		",\t,\4-\t-\4.\t.\4/\t/\4\60\t\60\4\61\t\61\4\62\t\62\4\63\t\63\4\64\t"+
		"\64\4\65\t\65\4\66\t\66\4\67\t\67\48\t8\49\t9\4:\t:\4;\t;\4<\t<\4=\t="+
		"\4>\t>\4?\t?\4@\t@\4A\tA\4B\tB\4C\tC\4D\tD\4E\tE\4F\tF\4G\tG\4H\tH\4I"+
		"\tI\4J\tJ\4K\tK\4L\tL\4M\tM\4N\tN\4O\tO\4P\tP\4Q\tQ\4R\tR\4S\tS\4T\tT"+
		"\4U\tU\4V\tV\4W\tW\4X\tX\4Y\tY\4Z\tZ\4[\t[\4\\\t\\\4]\t]\4^\t^\4_\t_\4"+
		"`\t`\4a\ta\4b\tb\4c\tc\4d\td\4e\te\4f\tf\3\2\3\2\3\2\3\3\3\3\3\3\3\4\3"+
		"\4\3\4\3\5\3\5\3\5\3\6\3\6\3\6\3\7\3\7\3\7\3\b\3\b\3\b\3\b\3\b\3\b\3\b"+
		"\3\b\5\b\u00e7\n\b\3\b\3\b\3\b\5\b\u00ec\n\b\3\b\5\b\u00ef\n\b\3\b\3\b"+
		"\3\b\5\b\u00f4\n\b\3\b\3\b\3\b\3\b\3\b\3\b\3\b\3\b\3\b\3\b\3\b\5\b\u0101"+
		"\n\b\3\b\3\b\5\b\u0105\n\b\3\b\3\b\3\b\3\b\3\b\5\b\u010c\n\b\3\b\3\b\3"+
		"\b\3\b\3\b\3\b\3\b\3\b\3\b\3\b\3\b\3\b\7\b\u011a\n\b\f\b\16\b\u011d\13"+
		"\b\3\b\5\b\u0120\n\b\3\b\5\b\u0123\n\b\3\b\3\b\3\b\3\b\3\b\5\b\u012a\n"+
		"\b\3\b\3\b\3\b\3\b\3\b\3\b\3\b\3\b\3\b\3\b\3\b\3\b\3\b\3\b\3\b\7\b\u013b"+
		"\n\b\f\b\16\b\u013e\13\b\3\b\5\b\u0141\n\b\3\b\5\b\u0144\n\b\3\b\3\b\3"+
		"\b\3\b\3\b\5\b\u014b\n\b\3\b\3\b\3\b\3\b\5\b\u0151\n\b\3\b\3\b\3\b\3\b"+
		"\5\b\u0157\n\b\3\b\3\b\3\b\3\b\3\b\3\b\3\b\3\b\3\b\5\b\u0162\n\b\3\b\3"+
		"\b\3\b\3\b\3\b\3\b\3\b\3\b\3\b\3\b\3\b\3\b\3\b\3\b\3\b\3\b\3\b\3\b\3\b"+
		"\3\b\3\b\3\b\3\b\3\b\3\b\3\b\3\b\3\b\3\b\3\b\5\b\u0182\n\b\3\b\3\b\3\b"+
		"\3\b\3\b\3\b\5\b\u018a\n\b\3\b\3\b\5\b\u018e\n\b\3\b\3\b\3\b\5\b\u0193"+
		"\n\b\3\b\3\b\3\b\3\b\5\b\u0199\n\b\3\b\3\b\3\b\3\b\3\b\3\b\5\b\u01a1\n"+
		"\b\3\b\3\b\3\b\3\b\5\b\u01a7\n\b\3\b\3\b\3\b\3\b\3\b\3\b\3\b\3\b\3\b\3"+
		"\b\3\b\5\b\u01b4\n\b\3\b\6\b\u01b7\n\b\r\b\16\b\u01b8\3\b\3\b\3\b\3\b"+
		"\3\b\3\b\3\b\5\b\u01c2\n\b\3\b\6\b\u01c5\n\b\r\b\16\b\u01c6\3\b\3\b\3"+
		"\b\3\b\3\b\3\b\3\b\3\b\3\b\3\b\3\b\3\b\3\b\3\b\5\b\u01d7\n\b\3\b\3\b\3"+
		"\b\7\b\u01dc\n\b\f\b\16\b\u01df\13\b\3\b\5\b\u01e2\n\b\3\b\3\b\3\b\3\b"+
		"\3\b\3\b\5\b\u01ea\n\b\3\b\3\b\3\b\7\b\u01ef\n\b\f\b\16\b\u01f2\13\b\3"+
		"\b\3\b\3\b\3\b\5\b\u01f8\n\b\3\b\3\b\3\b\3\b\3\b\3\b\3\b\3\b\3\b\3\b\3"+
		"\b\3\b\3\b\5\b\u0207\n\b\3\b\3\b\5\b\u020b\n\b\3\b\3\b\3\b\3\b\5\b\u0211"+
		"\n\b\3\b\3\b\3\b\3\b\5\b\u0217\n\b\3\b\5\b\u021a\n\b\3\b\5\b\u021d\n\b"+
		"\3\b\3\b\3\b\3\b\5\b\u0223\n\b\3\b\3\b\5\b\u0227\n\b\3\b\3\b\5\b\u022b"+
		"\n\b\3\b\3\b\3\b\5\b\u0230\n\b\3\b\3\b\5\b\u0234\n\b\3\b\3\b\3\b\3\b\3"+
		"\b\3\b\5\b\u023c\n\b\3\b\5\b\u023f\n\b\3\b\3\b\3\b\3\b\3\b\3\b\3\b\5\b"+
		"\u0248\n\b\3\b\3\b\3\b\5\b\u024d\n\b\3\b\3\b\3\b\3\b\5\b\u0253\n\b\3\b"+
		"\3\b\3\b\3\b\3\b\5\b\u025a\n\b\3\b\5\b\u025d\n\b\3\b\3\b\3\b\3\b\5\b\u0263"+
		"\n\b\3\b\3\b\3\b\3\b\3\b\3\b\3\b\7\b\u026c\n\b\f\b\16\b\u026f\13\b\5\b"+
		"\u0271\n\b\3\b\3\b\5\b\u0275\n\b\3\b\3\b\3\b\5\b\u027a\n\b\3\b\3\b\3\b"+
		"\5\b\u027f\n\b\3\b\3\b\3\b\3\b\3\b\5\b\u0286\n\b\3\b\5\b\u0289\n\b\3\b"+
		"\5\b\u028c\n\b\3\b\3\b\3\b\3\b\3\b\5\b\u0293\n\b\3\b\3\b\3\b\5\b\u0298"+
		"\n\b\3\b\3\b\3\b\5\b\u029d\n\b\3\b\5\b\u02a0\n\b\3\b\3\b\3\b\3\b\3\b\3"+
		"\b\3\b\5\b\u02a9\n\b\3\b\3\b\3\b\3\b\3\b\3\b\5\b\u02b1\n\b\3\b\3\b\3\b"+
		"\3\b\5\b\u02b7\n\b\3\b\3\b\5\b\u02bb\n\b\3\b\3\b\5\b\u02bf\n\b\3\b\3\b"+
		"\5\b\u02c3\n\b\5\b\u02c5\n\b\3\b\3\b\3\b\3\b\3\b\3\b\3\b\5\b\u02ce\n\b"+
		"\3\b\3\b\3\b\3\b\5\b\u02d4\n\b\3\b\3\b\3\b\5\b\u02d9\n\b\3\b\5\b\u02dc"+
		"\n\b\3\b\3\b\5\b\u02e0\n\b\3\b\5\b\u02e3\n\b\3\b\3\b\3\b\3\b\3\b\3\b\7"+
		"\b\u02eb\n\b\f\b\16\b\u02ee\13\b\5\b\u02f0\n\b\3\b\3\b\5\b\u02f4\n\b\3"+
		"\b\3\b\3\b\3\b\5\b\u02fa\n\b\3\b\5\b\u02fd\n\b\3\b\5\b\u0300\n\b\3\b\3"+
		"\b\3\b\3\b\5\b\u0306\n\b\3\b\3\b\3\b\3\b\3\b\3\b\5\b\u030e\n\b\3\b\3\b"+
		"\3\b\5\b\u0313\n\b\3\b\3\b\3\b\3\b\5\b\u0319\n\b\3\b\3\b\3\b\3\b\5\b\u031f"+
		"\n\b\3\b\3\b\3\b\3\b\3\b\3\b\3\b\7\b\u0328\n\b\f\b\16\b\u032b\13\b\3\b"+
		"\3\b\3\b\7\b\u0330\n\b\f\b\16\b\u0333\13\b\3\b\3\b\7\b\u0337\n\b\f\b\16"+
		"\b\u033a\13\b\3\b\3\b\3\b\7\b\u033f\n\b\f\b\16\b\u0342\13\b\5\b\u0344"+
		"\n\b\3\t\3\t\3\t\3\t\3\t\3\t\5\t\u034c\n\t\3\t\3\t\5\t\u0350\n\t\3\t\3"+
		"\t\3\t\3\t\3\t\5\t\u0357\n\t\3\t\3\t\3\t\3\t\3\t\3\t\3\t\3\t\3\t\3\t\3"+
		"\t\3\t\3\t\3\t\3\t\3\t\3\t\3\t\3\t\3\t\3\t\3\t\3\t\3\t\3\t\3\t\3\t\3\t"+
		"\3\t\3\t\3\t\3\t\3\t\3\t\3\t\3\t\3\t\3\t\3\t\3\t\3\t\3\t\3\t\3\t\3\t\3"+
		"\t\3\t\3\t\3\t\3\t\3\t\3\t\3\t\3\t\3\t\3\t\3\t\3\t\3\t\3\t\3\t\3\t\3\t"+
		"\3\t\3\t\3\t\3\t\3\t\3\t\3\t\3\t\3\t\3\t\3\t\3\t\3\t\3\t\3\t\3\t\3\t\3"+
		"\t\3\t\3\t\3\t\3\t\3\t\3\t\3\t\3\t\3\t\3\t\3\t\3\t\3\t\3\t\3\t\3\t\3\t"+
		"\3\t\3\t\3\t\3\t\3\t\3\t\3\t\3\t\3\t\3\t\3\t\3\t\3\t\3\t\3\t\3\t\5\t\u03cb"+
		"\n\t\3\t\3\t\3\t\3\t\3\t\3\t\5\t\u03d3\n\t\3\t\3\t\3\t\3\t\3\t\3\t\5\t"+
		"\u03db\n\t\3\t\3\t\3\t\3\t\3\t\3\t\3\t\5\t\u03e4\n\t\3\t\3\t\3\t\3\t\3"+
		"\t\3\t\3\t\3\t\3\t\3\t\5\t\u03f0\n\t\3\n\3\n\5\n\u03f4\n\n\3\n\5\n\u03f7"+
		"\n\n\3\n\3\n\3\n\3\n\5\n\u03fd\n\n\3\n\3\n\3\13\3\13\3\13\3\13\3\13\3"+
		"\13\5\13\u0407\n\13\3\13\3\13\3\13\3\13\3\f\3\f\3\f\3\f\3\f\3\f\5\f\u0413"+
		"\n\f\3\f\3\f\3\f\5\f\u0418\n\f\3\r\3\r\3\r\3\16\5\16\u041e\n\16\3\16\3"+
		"\16\3\17\3\17\3\17\3\17\3\17\3\17\3\17\3\17\5\17\u042a\n\17\5\17\u042c"+
		"\n\17\3\17\3\17\3\17\5\17\u0431\n\17\3\17\3\17\5\17\u0435\n\17\3\17\3"+
		"\17\3\17\5\17\u043a\n\17\3\17\3\17\3\17\5\17\u043f\n\17\3\17\5\17\u0442"+
		"\n\17\3\17\3\17\3\17\5\17\u0447\n\17\3\17\3\17\5\17\u044b\n\17\3\17\3"+
		"\17\3\17\5\17\u0450\n\17\5\17\u0452\n\17\3\20\3\20\5\20\u0456\n\20\3\21"+
		"\3\21\3\21\3\21\3\21\7\21\u045d\n\21\f\21\16\21\u0460\13\21\3\21\3\21"+
		"\3\22\3\22\3\22\5\22\u0467\n\22\3\23\3\23\3\23\3\23\3\23\5\23\u046e\n"+
		"\23\3\24\3\24\3\24\7\24\u0473\n\24\f\24\16\24\u0476\13\24\3\25\3\25\3"+
		"\25\3\25\7\25\u047c\n\25\f\25\16\25\u047f\13\25\3\26\3\26\5\26\u0483\n"+
		"\26\3\26\3\26\3\26\3\26\3\27\3\27\3\27\3\30\3\30\3\30\3\30\7\30\u0490"+
		"\n\30\f\30\16\30\u0493\13\30\3\30\3\30\3\31\3\31\5\31\u0499\n\31\3\31"+
		"\5\31\u049c\n\31\3\32\3\32\3\32\7\32\u04a1\n\32\f\32\16\32\u04a4\13\32"+
		"\3\32\5\32\u04a7\n\32\3\33\3\33\3\33\3\33\5\33\u04ad\n\33\3\34\3\34\3"+
		"\34\3\34\7\34\u04b3\n\34\f\34\16\34\u04b6\13\34\3\34\3\34\3\35\3\35\3"+
		"\35\3\35\7\35\u04be\n\35\f\35\16\35\u04c1\13\35\3\35\3\35\3\36\3\36\3"+
		"\36\3\36\3\36\3\36\5\36\u04cb\n\36\3\37\3\37\3\37\3\37\3\37\5\37\u04d2"+
		"\n\37\3 \3 \3 \3 \5 \u04d8\n \3!\3!\3!\3\"\5\"\u04de\n\"\3\"\3\"\3\"\3"+
		"\"\3\"\6\"\u04e5\n\"\r\"\16\"\u04e6\5\"\u04e9\n\"\3#\3#\3#\3#\3#\7#\u04f0"+
		"\n#\f#\16#\u04f3\13#\5#\u04f5\n#\3#\3#\3#\3#\3#\7#\u04fc\n#\f#\16#\u04ff"+
		"\13#\5#\u0501\n#\3#\3#\3#\3#\3#\7#\u0508\n#\f#\16#\u050b\13#\5#\u050d"+
		"\n#\3#\3#\3#\3#\3#\7#\u0514\n#\f#\16#\u0517\13#\5#\u0519\n#\3#\5#\u051c"+
		"\n#\3#\3#\3#\5#\u0521\n#\5#\u0523\n#\3$\5$\u0526\n$\3$\3$\3$\3%\3%\3%"+
		"\3%\3%\3%\3%\5%\u0532\n%\3%\3%\3%\3%\3%\5%\u0539\n%\3%\3%\3%\3%\3%\5%"+
		"\u0540\n%\3%\7%\u0543\n%\f%\16%\u0546\13%\3&\3&\3&\3&\3&\3&\3&\3&\5&\u0550"+
		"\n&\3\'\3\'\5\'\u0554\n\'\3\'\3\'\5\'\u0558\n\'\3(\3(\3(\3(\3(\3(\3(\3"+
		"(\3(\3(\5(\u0564\n(\3(\5(\u0567\n(\3(\3(\5(\u056b\n(\3(\3(\3(\3(\3(\3"+
		"(\3(\3(\5(\u0575\n(\3(\3(\5(\u0579\n(\5(\u057b\n(\3(\5(\u057e\n(\3(\3"+
		"(\5(\u0582\n(\3(\5(\u0585\n(\3(\3(\5(\u0589\n(\3(\3(\7(\u058d\n(\f(\16"+
		"(\u0590\13(\3(\5(\u0593\n(\3(\3(\5(\u0597\n(\3(\3(\3(\5(\u059c\n(\3(\5"+
		"(\u059f\n(\5(\u05a1\n(\3(\7(\u05a4\n(\f(\16(\u05a7\13(\3(\3(\5(\u05ab"+
		"\n(\3(\5(\u05ae\n(\3(\3(\5(\u05b2\n(\3(\5(\u05b5\n(\5(\u05b7\n(\3)\3)"+
		"\3)\5)\u05bc\n)\3)\7)\u05bf\n)\f)\16)\u05c2\13)\3)\3)\3*\3*\3*\3*\3*\3"+
		"*\7*\u05cc\n*\f*\16*\u05cf\13*\3*\3*\5*\u05d3\n*\3+\3+\3+\3+\7+\u05d9"+
		"\n+\f+\16+\u05dc\13+\3+\7+\u05df\n+\f+\16+\u05e2\13+\3+\5+\u05e5\n+\3"+
		",\3,\3,\3,\3,\7,\u05ec\n,\f,\16,\u05ef\13,\3,\3,\3,\3,\3,\3,\3,\3,\3,"+
		"\3,\7,\u05fb\n,\f,\16,\u05fe\13,\3,\3,\5,\u0602\n,\3,\3,\3,\3,\3,\3,\3"+
		",\3,\7,\u060c\n,\f,\16,\u060f\13,\3,\3,\5,\u0613\n,\3-\3-\3-\3-\7-\u0619"+
		"\n-\f-\16-\u061c\13-\5-\u061e\n-\3-\3-\5-\u0622\n-\3.\3.\3.\3.\3.\3.\3"+
		".\3.\3.\3.\7.\u062e\n.\f.\16.\u0631\13.\3.\3.\3.\3/\3/\3/\3/\3/\7/\u063b"+
		"\n/\f/\16/\u063e\13/\3/\3/\5/\u0642\n/\3\60\3\60\5\60\u0646\n\60\3\60"+
		"\5\60\u0649\n\60\3\61\3\61\3\61\5\61\u064e\n\61\3\61\3\61\3\61\3\61\3"+
		"\61\7\61\u0655\n\61\f\61\16\61\u0658\13\61\5\61\u065a\n\61\3\61\3\61\3"+
		"\61\5\61\u065f\n\61\3\61\3\61\3\61\7\61\u0664\n\61\f\61\16\61\u0667\13"+
		"\61\5\61\u0669\n\61\3\62\3\62\3\63\3\63\7\63\u066f\n\63\f\63\16\63\u0672"+
		"\13\63\3\64\3\64\3\64\3\64\5\64\u0678\n\64\3\64\3\64\3\64\3\64\3\64\5"+
		"\64\u067f\n\64\3\65\5\65\u0682\n\65\3\65\3\65\3\65\5\65\u0687\n\65\3\65"+
		"\3\65\3\65\3\65\5\65\u068d\n\65\3\65\3\65\5\65\u0691\n\65\3\65\5\65\u0694"+
		"\n\65\3\65\5\65\u0697\n\65\3\66\3\66\3\66\3\66\5\66\u069d\n\66\3\67\3"+
		"\67\3\67\5\67\u06a2\n\67\3\67\3\67\38\58\u06a7\n8\38\38\38\38\38\38\3"+
		"8\38\38\38\38\38\38\38\38\38\58\u06b9\n8\58\u06bb\n8\38\58\u06be\n8\3"+
		"9\39\39\39\3:\3:\3:\7:\u06c7\n:\f:\16:\u06ca\13:\3;\3;\3;\3;\7;\u06d0"+
		"\n;\f;\16;\u06d3\13;\3;\3;\3<\3<\5<\u06d9\n<\3=\3=\3=\3=\7=\u06df\n=\f"+
		"=\16=\u06e2\13=\3=\3=\3>\3>\3>\5>\u06e9\n>\3?\3?\5?\u06ed\n?\3?\3?\3?"+
		"\3?\3?\3?\5?\u06f5\n?\3?\3?\3?\3?\3?\3?\5?\u06fd\n?\3?\3?\3?\3?\5?\u0703"+
		"\n?\3@\3@\3@\3@\7@\u0709\n@\f@\16@\u070c\13@\3@\3@\3A\3A\3A\3A\3A\7A\u0715"+
		"\nA\fA\16A\u0718\13A\5A\u071a\nA\3A\3A\3A\3B\5B\u0720\nB\3B\3B\5B\u0724"+
		"\nB\5B\u0726\nB\3C\3C\3C\3C\3C\3C\3C\5C\u072f\nC\3C\3C\3C\3C\3C\3C\3C"+
		"\3C\3C\3C\5C\u073b\nC\5C\u073d\nC\3C\3C\3C\3C\3C\5C\u0744\nC\3C\3C\3C"+
		"\3C\3C\5C\u074b\nC\3C\3C\3C\3C\5C\u0751\nC\3C\3C\3C\3C\5C\u0757\nC\5C"+
		"\u0759\nC\3D\3D\3D\5D\u075e\nD\3D\3D\3E\3E\3E\5E\u0765\nE\3E\3E\3F\3F"+
		"\5F\u076b\nF\3F\3F\5F\u076f\nF\5F\u0771\nF\3G\3G\3G\7G\u0776\nG\fG\16"+
		"G\u0779\13G\3H\3H\3I\3I\3I\3I\3I\3I\3I\3I\3I\3I\5I\u0787\nI\5I\u0789\n"+
		"I\3I\3I\3I\3I\3I\3I\7I\u0791\nI\fI\16I\u0794\13I\3J\5J\u0797\nJ\3J\3J"+
		"\3J\3J\3J\3J\5J\u079f\nJ\3J\3J\3J\3J\3J\7J\u07a6\nJ\fJ\16J\u07a9\13J\3"+
		"J\3J\3J\5J\u07ae\nJ\3J\3J\3J\3J\3J\3J\5J\u07b6\nJ\3J\3J\3J\3J\5J\u07bc"+
		"\nJ\3J\3J\3J\5J\u07c1\nJ\3J\3J\3J\5J\u07c6\nJ\3K\3K\3K\3K\5K\u07cc\nK"+
		"\3K\3K\3K\3K\3K\3K\3K\3K\3K\3K\3K\3K\3K\3K\3K\3K\3K\3K\3K\7K\u07e1\nK"+
		"\fK\16K\u07e4\13K\3L\3L\3L\6L\u07e9\nL\rL\16L\u07ea\3L\3L\5L\u07ef\nL"+
		"\3L\3L\3L\3L\3L\6L\u07f6\nL\rL\16L\u07f7\3L\3L\5L\u07fc\nL\3L\3L\3L\3"+
		"L\3L\3L\3L\3L\3L\3L\3L\3L\3L\3L\7L\u080c\nL\fL\16L\u080f\13L\5L\u0811"+
		"\nL\3L\3L\3L\3L\3L\3L\5L\u0819\nL\3L\3L\3L\3L\3L\3L\3L\5L\u0822\nL\3L"+
		"\3L\3L\3L\3L\3L\3L\3L\3L\3L\3L\3L\3L\3L\3L\3L\3L\3L\3L\6L\u0837\nL\rL"+
		"\16L\u0838\3L\3L\3L\3L\3L\3L\3L\3L\3L\5L\u0844\nL\3L\3L\3L\7L\u0849\n"+
		"L\fL\16L\u084c\13L\5L\u084e\nL\3L\3L\3L\5L\u0853\nL\3L\3L\3L\3L\3L\3L"+
		"\3L\3L\3L\3L\3L\3L\3L\3L\3L\6L\u0864\nL\rL\16L\u0865\3L\3L\3L\3L\3L\3"+
		"L\3L\3L\3L\3L\3L\3L\3L\3L\3L\5L\u0877\nL\3L\3L\3L\3L\3L\3L\3L\3L\7L\u0881"+
		"\nL\fL\16L\u0884\13L\3M\3M\3M\3M\3M\3M\3M\3M\6M\u088e\nM\rM\16M\u088f"+
		"\5M\u0892\nM\3N\3N\3O\3O\3P\3P\3Q\3Q\3R\3R\7R\u089e\nR\fR\16R\u08a1\13"+
		"R\3S\3S\3S\3S\5S\u08a7\nS\3T\5T\u08aa\nT\3T\3T\5T\u08ae\nT\3U\3U\3U\5"+
		"U\u08b3\nU\3V\3V\3V\3V\3V\3V\3V\3V\3V\3V\3V\3V\3V\3V\3V\5V\u08c4\nV\3"+
		"V\3V\5V\u08c8\nV\3V\3V\3V\3V\3V\7V\u08cf\nV\fV\16V\u08d2\13V\3V\5V\u08d5"+
		"\nV\5V\u08d7\nV\3W\3W\3W\7W\u08dc\nW\fW\16W\u08df\13W\3X\3X\3X\3X\5X\u08e5"+
		"\nX\3Y\3Y\3Y\7Y\u08ea\nY\fY\16Y\u08ed\13Y\3Z\3Z\3Z\3Z\3Z\5Z\u08f4\nZ\3"+
		"[\3[\3[\3[\3[\3\\\3\\\3\\\3\\\7\\\u08ff\n\\\f\\\16\\\u0902\13\\\3]\3]"+
		"\3]\3]\3^\3^\3^\3^\3^\3^\3^\7^\u090f\n^\f^\16^\u0912\13^\3^\3^\3^\3^\3"+
		"^\7^\u0919\n^\f^\16^\u091c\13^\5^\u091e\n^\3^\3^\3^\3^\3^\7^\u0925\n^"+
		"\f^\16^\u0928\13^\5^\u092a\n^\5^\u092c\n^\3^\5^\u092f\n^\3^\5^\u0932\n"+
		"^\3_\3_\3_\3_\3_\3_\3_\3_\3_\3_\3_\3_\3_\3_\3_\3_\5_\u0944\n_\3`\3`\3"+
		"`\3`\3`\3`\3`\5`\u094d\n`\3a\3a\3a\7a\u0952\na\fa\16a\u0955\13a\3b\3b"+
		"\3b\3b\3b\3b\3b\3b\3b\3b\3b\3b\3b\3b\3b\5b\u0966\nb\3c\3c\3c\5c\u096b"+
		"\nc\3d\3d\3e\5e\u0970\ne\3e\3e\5e\u0974\ne\3e\3e\5e\u0978\ne\3e\3e\5e"+
		"\u097c\ne\3e\3e\5e\u0980\ne\3e\3e\5e\u0984\ne\3e\3e\5e\u0988\ne\3e\5e"+
		"\u098b\ne\3f\3f\3f\7\u02ec\u0329\u0331\u0338\u0340\6H\u0090\u0094\u0096"+
		"g\2\4\6\b\n\f\16\20\22\24\26\30\32\34\36 \"$&(*,.\60\62\64\668:<>@BDF"+
		"HJLNPRTVXZ\\^`bdfhjlnprtvxz|~\u0080\u0082\u0084\u0086\u0088\u008a\u008c"+
		"\u008e\u0090\u0092\u0094\u0096\u0098\u009a\u009c\u009e\u00a0\u00a2\u00a4"+
		"\u00a6\u00a8\u00aa\u00ac\u00ae\u00b0\u00b2\u00b4\u00b6\u00b8\u00ba\u00bc"+
		"\u00be\u00c0\u00c2\u00c4\u00c6\u00c8\u00ca\2\35\3\2\u00ca\u00cb\4\2RR"+
		"TT\5\2\\^\u00b0\u00b0\u00b6\u00b6\4\2\16\16!!\4\2..YY\4\2\u00b0\u00b0"+
		"\u00b6\u00b6\4\2\17\17\u00d7\u00d7\3\2hk\3\2hj\3\2-.\4\2KKMM\4\2\21\21"+
		"\23\23\3\2\u00f6\u00f7\3\2&\'\4\2\u008c\u008d\u0092\u0092\3\2\u008e\u0091"+
		"\4\2\u008c\u008d\u0095\u0095\3\2~\u0080\3\2\u0084\u008b\3\2\u008c\u0096"+
		"\3\2\37\"\3\2*+\3\2\u008c\u008d\4\2DD\u009d\u009d\4\2\33\33\u009b\u009b"+
		"\3\2HI\n\2\r\6588@gl\u0083\u0091\u0091\u0097\u00a0\u00a2\u00ee\u00f0\u00f1"+
		"\2\u0b29\2\u00cc\3\2\2\2\4\u00cf\3\2\2\2\6\u00d2\3\2\2\2\b\u00d5\3\2\2"+
		"\2\n\u00d8\3\2\2\2\f\u00db\3\2\2\2\16\u0343\3\2\2\2\20\u03ef\3\2\2\2\22"+
		"\u03f1\3\2\2\2\24\u0400\3\2\2\2\26\u040c\3\2\2\2\30\u0419\3\2\2\2\32\u041d"+
		"\3\2\2\2\34\u0451\3\2\2\2\36\u0453\3\2\2\2 \u0457\3\2\2\2\"\u0463\3\2"+
		"\2\2$\u046d\3\2\2\2&\u046f\3\2\2\2(\u0477\3\2\2\2*\u0480\3\2\2\2,\u0488"+
		"\3\2\2\2.\u048b\3\2\2\2\60\u0496\3\2\2\2\62\u04a6\3\2\2\2\64\u04ac\3\2"+
		"\2\2\66\u04ae\3\2\2\28\u04b9\3\2\2\2:\u04ca\3\2\2\2<\u04d1\3\2\2\2>\u04d3"+
		"\3\2\2\2@\u04d9\3\2\2\2B\u04e8\3\2\2\2D\u04f4\3\2\2\2F\u0525\3\2\2\2H"+
		"\u052a\3\2\2\2J\u054f\3\2\2\2L\u0551\3\2\2\2N\u05b6\3\2\2\2P\u05b8\3\2"+
		"\2\2R\u05d2\3\2\2\2T\u05d4\3\2\2\2V\u0612\3\2\2\2X\u0621\3\2\2\2Z\u0623"+
		"\3\2\2\2\\\u0641\3\2\2\2^\u0643\3\2\2\2`\u064a\3\2\2\2b\u066a\3\2\2\2"+
		"d\u066c\3\2\2\2f\u067e\3\2\2\2h\u0696\3\2\2\2j\u069c\3\2\2\2l\u069e\3"+
		"\2\2\2n\u06bd\3\2\2\2p\u06bf\3\2\2\2r\u06c3\3\2\2\2t\u06cb\3\2\2\2v\u06d6"+
		"\3\2\2\2x\u06da\3\2\2\2z\u06e5\3\2\2\2|\u0702\3\2\2\2~\u0704\3\2\2\2\u0080"+
		"\u070f\3\2\2\2\u0082\u0725\3\2\2\2\u0084\u0758\3\2\2\2\u0086\u075d\3\2"+
		"\2\2\u0088\u0764\3\2\2\2\u008a\u0768\3\2\2\2\u008c\u0772\3\2\2\2\u008e"+
		"\u077a\3\2\2\2\u0090\u0788\3\2\2\2\u0092\u07c5\3\2\2\2\u0094\u07cb\3\2"+
		"\2\2\u0096\u0876\3\2\2\2\u0098\u0891\3\2\2\2\u009a\u0893\3\2\2\2\u009c"+
		"\u0895\3\2\2\2\u009e\u0897\3\2\2\2\u00a0\u0899\3\2\2\2\u00a2\u089b\3\2"+
		"\2\2\u00a4\u08a2\3\2\2\2\u00a6\u08ad\3\2\2\2\u00a8\u08b2\3\2\2\2\u00aa"+
		"\u08d6\3\2\2\2\u00ac\u08d8\3\2\2\2\u00ae\u08e0\3\2\2\2\u00b0\u08e6\3\2"+
		"\2\2\u00b2\u08ee\3\2\2\2\u00b4\u08f5\3\2\2\2\u00b6\u08fa\3\2\2\2\u00b8"+
		"\u0903\3\2\2\2\u00ba\u0931\3\2\2\2\u00bc\u0943\3\2\2\2\u00be\u094c\3\2"+
		"\2\2\u00c0\u094e\3\2\2\2\u00c2\u0965\3\2\2\2\u00c4\u096a\3\2\2\2\u00c6"+
		"\u096c\3\2\2\2\u00c8\u098a\3\2\2\2\u00ca\u098c\3\2\2\2\u00cc\u00cd\5\16"+
		"\b\2\u00cd\u00ce\7\2\2\3\u00ce\3\3\2\2\2\u00cf\u00d0\5\u008aF\2\u00d0"+
		"\u00d1\7\2\2\3\u00d1\5\3\2\2\2\u00d2\u00d3\5\u0086D\2\u00d3\u00d4\7\2"+
		"\2\3\u00d4\7\3\2\2\2\u00d5\u00d6\5\u0088E\2\u00d6\u00d7\7\2\2\3\u00d7"+
		"\t\3\2\2\2\u00d8\u00d9\5\u00aaV\2\u00d9\u00da\7\2\2\3\u00da\13\3\2\2\2"+
		"\u00db\u00dc\5\u00acW\2\u00dc\u00dd\7\2\2\3\u00dd\r\3\2\2\2\u00de\u0344"+
		"\5\32\16\2\u00df\u00e0\7d\2\2\u00e0\u0344\5\u00c2b\2\u00e1\u00e2\7Q\2"+
		"\2\u00e2\u00e6\7\u00d1\2\2\u00e3\u00e4\7\u0081\2\2\u00e4\u00e5\7\"\2\2"+
		"\u00e5\u00e7\7$\2\2\u00e6\u00e3\3\2\2\2\u00e6\u00e7\3\2\2\2\u00e7\u00e8"+
		"\3\2\2\2\u00e8\u00eb\5\u00c2b\2\u00e9\u00ea\7t\2\2\u00ea\u00ec\7\u00f2"+
		"\2\2\u00eb\u00e9\3\2\2\2\u00eb\u00ec\3\2\2\2\u00ec\u00ee\3\2\2\2\u00ed"+
		"\u00ef\5\30\r\2\u00ee\u00ed\3\2\2\2\u00ee\u00ef\3\2\2\2\u00ef\u00f3\3"+
		"\2\2\2\u00f0\u00f1\7O\2\2\u00f1\u00f2\7\u00bc\2\2\u00f2\u00f4\5.\30\2"+
		"\u00f3\u00f0\3\2\2\2\u00f3\u00f4\3\2\2\2\u00f4\u0344\3\2\2\2\u00f5\u00f6"+
		"\7o\2\2\u00f6\u00f7\7\u00d1\2\2\u00f7\u00f8\5\u00c2b\2\u00f8\u00f9\7u"+
		"\2\2\u00f9\u00fa\7\u00bc\2\2\u00fa\u00fb\5.\30\2\u00fb\u0344\3\2\2\2\u00fc"+
		"\u00fd\7g\2\2\u00fd\u0100\7\u00d1\2\2\u00fe\u00ff\7\u0081\2\2\u00ff\u0101"+
		"\7$\2\2\u0100\u00fe\3\2\2\2\u0100\u0101\3\2\2\2\u0101\u0102\3\2\2\2\u0102"+
		"\u0104\5\u00c2b\2\u0103\u0105\t\2\2\2\u0104\u0103\3\2\2\2\u0104\u0105"+
		"\3\2\2\2\u0105\u0344\3\2\2\2\u0106\u010b\5\22\n\2\u0107\u0108\7\3\2\2"+
		"\u0108\u0109\5\u00acW\2\u0109\u010a\7\4\2\2\u010a\u010c\3\2\2\2\u010b"+
		"\u0107\3\2\2\2\u010b\u010c\3\2\2\2\u010c\u010d\3\2\2\2\u010d\u011b\5,"+
		"\27\2\u010e\u010f\7\u00b9\2\2\u010f\u011a\5.\30\2\u0110\u0111\7\u00d9"+
		"\2\2\u0111\u0112\7\26\2\2\u0112\u011a\5p9\2\u0113\u011a\5\24\13\2\u0114"+
		"\u011a\5\30\r\2\u0115\u0116\7t\2\2\u0116\u011a\7\u00f2\2\2\u0117\u0118"+
		"\7\u00bb\2\2\u0118\u011a\5.\30\2\u0119\u010e\3\2\2\2\u0119\u0110\3\2\2"+
		"\2\u0119\u0113\3\2\2\2\u0119\u0114\3\2\2\2\u0119\u0115\3\2\2\2\u0119\u0117"+
		"\3\2\2\2\u011a\u011d\3\2\2\2\u011b\u0119\3\2\2\2\u011b\u011c\3\2\2\2\u011c"+
		"\u0122\3\2\2\2\u011d\u011b\3\2\2\2\u011e\u0120\7\20\2\2\u011f\u011e\3"+
		"\2\2\2\u011f\u0120\3\2\2\2\u0120\u0121\3\2\2\2\u0121\u0123\5\32\16\2\u0122"+
		"\u011f\3\2\2\2\u0122\u0123\3\2\2\2\u0123\u0344\3\2\2\2\u0124\u0129\5\22"+
		"\n\2\u0125\u0126\7\3\2\2\u0126\u0127\5\u00acW\2\u0127\u0128\7\4\2\2\u0128"+
		"\u012a\3\2\2\2\u0129\u0125\3\2\2\2\u0129\u012a\3\2\2\2\u012a\u013c\3\2"+
		"\2\2\u012b\u012c\7t\2\2\u012c\u013b\7\u00f2\2\2\u012d\u012e\7\u00d9\2"+
		"\2\u012e\u012f\7\26\2\2\u012f\u0130\7\3\2\2\u0130\u0131\5\u00acW\2\u0131"+
		"\u0132\7\4\2\2\u0132\u013b\3\2\2\2\u0133\u013b\5\24\13\2\u0134\u013b\5"+
		"\26\f\2\u0135\u013b\5\u0084C\2\u0136\u013b\5:\36\2\u0137\u013b\5\30\r"+
		"\2\u0138\u0139\7\u00bb\2\2\u0139\u013b\5.\30\2\u013a\u012b\3\2\2\2\u013a"+
		"\u012d\3\2\2\2\u013a\u0133\3\2\2\2\u013a\u0134\3\2\2\2\u013a\u0135\3\2"+
		"\2\2\u013a\u0136\3\2\2\2\u013a\u0137\3\2\2\2\u013a\u0138\3\2\2\2\u013b"+
		"\u013e\3\2\2\2\u013c\u013a\3\2\2\2\u013c\u013d\3\2\2\2\u013d\u0143\3\2"+
		"\2\2\u013e\u013c\3\2\2\2\u013f\u0141\7\20\2\2\u0140\u013f\3\2\2\2\u0140"+
		"\u0141\3\2\2\2\u0141\u0142\3\2\2\2\u0142\u0144\5\32\16\2\u0143\u0140\3"+
		"\2\2\2\u0143\u0144\3\2\2\2\u0144\u0344\3\2\2\2\u0145\u0146\7Q\2\2\u0146"+
		"\u014a\7R\2\2\u0147\u0148\7\u0081\2\2\u0148\u0149\7\"\2\2\u0149\u014b"+
		"\7$\2\2\u014a\u0147\3\2\2\2\u014a\u014b\3\2\2\2\u014b\u014c\3\2\2\2\u014c"+
		"\u014d\5\u0086D\2\u014d\u014e\7&\2\2\u014e\u0150\5\u0086D\2\u014f\u0151"+
		"\5\30\r\2\u0150\u014f\3\2\2\2\u0150\u0151\3\2\2\2\u0151\u0344\3\2\2\2"+
		"\u0152\u0153\7\u00d5\2\2\u0153\u0154\7R\2\2\u0154\u0156\5\u0086D\2\u0155"+
		"\u0157\5 \21\2\u0156\u0155\3\2\2\2\u0156\u0157\3\2\2\2\u0157\u0158\3\2"+
		"\2\2\u0158\u0159\7\u00d6\2\2\u0159\u0161\7\u00d8\2\2\u015a\u0162\5\u00c2"+
		"b\2\u015b\u015c\7/\2\2\u015c\u015d\7b\2\2\u015d\u0162\5r:\2\u015e\u015f"+
		"\7/\2\2\u015f\u0160\7\21\2\2\u0160\u0162\7b\2\2\u0161\u015a\3\2\2\2\u0161"+
		"\u015b\3\2\2\2\u0161\u015e\3\2\2\2\u0161\u0162\3\2\2\2\u0162\u0344\3\2"+
		"\2\2\u0163\u0164\7o\2\2\u0164\u0165\7R\2\2\u0165\u0166\5\u0086D\2\u0166"+
		"\u0167\7\17\2\2\u0167\u0168\7b\2\2\u0168\u0169\7\3\2\2\u0169\u016a\5\u00ac"+
		"W\2\u016a\u016b\7\4\2\2\u016b\u0344\3\2\2\2\u016c\u016d\7o\2\2\u016d\u016e"+
		"\t\3\2\2\u016e\u016f\5\u0086D\2\u016f\u0170\7p\2\2\u0170\u0171\7l\2\2"+
		"\u0171\u0172\5\u0086D\2\u0172\u0344\3\2\2\2\u0173\u0174\7o\2\2\u0174\u0175"+
		"\t\3\2\2\u0175\u0176\5\u0086D\2\u0176\u0177\7u\2\2\u0177\u0178\7\u00bb"+
		"\2\2\u0178\u0179\5.\30\2\u0179\u0344\3\2\2\2\u017a\u017b\7o\2\2\u017b"+
		"\u017c\t\3\2\2\u017c\u017d\5\u0086D\2\u017d\u017e\7\u00ba\2\2\u017e\u0181"+
		"\7\u00bb\2\2\u017f\u0180\7\u0081\2\2\u0180\u0182\7$\2\2\u0181\u017f\3"+
		"\2\2\2\u0181\u0182\3\2\2\2\u0182\u0183\3\2\2\2\u0183\u0184\5.\30\2\u0184"+
		"\u0344\3\2\2\2\u0185\u0186\7o\2\2\u0186\u0187\7R\2\2\u0187\u0189\5\u0086"+
		"D\2\u0188\u018a\5 \21\2\u0189\u0188\3\2\2\2\u0189\u018a\3\2\2\2\u018a"+
		"\u018b\3\2\2\2\u018b\u018d\7\u00c9\2\2\u018c\u018e\7c\2\2\u018d\u018c"+
		"\3\2\2\2\u018d\u018e\3\2\2\2\u018e\u018f\3\2\2\2\u018f\u0190\5\u00c2b"+
		"\2\u0190\u0192\5\u00aeX\2\u0191\u0193\5\u00a8U\2\u0192\u0191\3\2\2\2\u0192"+
		"\u0193\3\2\2\2\u0193\u0344\3\2\2\2\u0194\u0195\7o\2\2\u0195\u0196\7R\2"+
		"\2\u0196\u0198\5\u0086D\2\u0197\u0199\5 \21\2\u0198\u0197\3\2\2\2\u0198"+
		"\u0199\3\2\2\2\u0199\u019a\3\2\2\2\u019a\u019b\7u\2\2\u019b\u019c\7\u00a2"+
		"\2\2\u019c\u01a0\7\u00f2\2\2\u019d\u019e\7O\2\2\u019e\u019f\7\u00a3\2"+
		"\2\u019f\u01a1\5.\30\2\u01a0\u019d\3\2\2\2\u01a0\u01a1\3\2\2\2\u01a1\u0344"+
		"\3\2\2\2\u01a2\u01a3\7o\2\2\u01a3\u01a4\7R\2\2\u01a4\u01a6\5\u0086D\2"+
		"\u01a5\u01a7\5 \21\2\u01a6\u01a5\3\2\2\2\u01a6\u01a7\3\2\2\2\u01a7\u01a8"+
		"\3\2\2\2\u01a8\u01a9\7u\2\2\u01a9\u01aa\7\u00a3\2\2\u01aa\u01ab\5.\30"+
		"\2\u01ab\u0344\3\2\2\2\u01ac\u01ad\7o\2\2\u01ad\u01ae\7R\2\2\u01ae\u01af"+
		"\5\u0086D\2\u01af\u01b3\7\17\2\2\u01b0\u01b1\7\u0081\2\2\u01b1\u01b2\7"+
		"\"\2\2\u01b2\u01b4\7$\2\2\u01b3\u01b0\3\2\2\2\u01b3\u01b4\3\2\2\2\u01b4"+
		"\u01b6\3\2\2\2\u01b5\u01b7\5\36\20\2\u01b6\u01b5\3\2\2\2\u01b7\u01b8\3"+
		"\2\2\2\u01b8\u01b6\3\2\2\2\u01b8\u01b9\3\2\2\2\u01b9\u0344\3\2\2\2\u01ba"+
		"\u01bb\7o\2\2\u01bb\u01bc\7T\2\2\u01bc\u01bd\5\u0086D\2\u01bd\u01c1\7"+
		"\17\2\2\u01be\u01bf\7\u0081\2\2\u01bf\u01c0\7\"\2\2\u01c0\u01c2\7$\2\2"+
		"\u01c1\u01be\3\2\2\2\u01c1\u01c2\3\2\2\2\u01c2\u01c4\3\2\2\2\u01c3\u01c5"+
		"\5 \21\2\u01c4\u01c3\3\2\2\2\u01c5\u01c6\3\2\2\2\u01c6\u01c4\3\2\2\2\u01c6"+
		"\u01c7\3\2\2\2\u01c7\u0344\3\2\2\2\u01c8\u01c9\7o\2\2\u01c9\u01ca\7R\2"+
		"\2\u01ca\u01cb\5\u0086D\2\u01cb\u01cc\5 \21\2\u01cc\u01cd\7p\2\2\u01cd"+
		"\u01ce\7l\2\2\u01ce\u01cf\5 \21\2\u01cf\u0344\3\2\2\2\u01d0\u01d1\7o\2"+
		"\2\u01d1\u01d2\7R\2\2\u01d2\u01d3\5\u0086D\2\u01d3\u01d6\7g\2\2\u01d4"+
		"\u01d5\7\u0081\2\2\u01d5\u01d7\7$\2\2\u01d6\u01d4\3\2\2\2\u01d6\u01d7"+
		"\3\2\2\2\u01d7\u01d8\3\2\2\2\u01d8\u01dd\5 \21\2\u01d9\u01da\7\5\2\2\u01da"+
		"\u01dc\5 \21\2\u01db\u01d9\3\2\2\2\u01dc\u01df\3\2\2\2\u01dd\u01db\3\2"+
		"\2\2\u01dd\u01de\3\2\2\2\u01de\u01e1\3\2\2\2\u01df\u01dd\3\2\2\2\u01e0"+
		"\u01e2\7\u00ce\2\2\u01e1\u01e0\3\2\2\2\u01e1\u01e2\3\2\2\2\u01e2\u0344"+
		"\3\2\2\2\u01e3\u01e4\7o\2\2\u01e4\u01e5\7T\2\2\u01e5\u01e6\5\u0086D\2"+
		"\u01e6\u01e9\7g\2\2\u01e7\u01e8\7\u0081\2\2\u01e8\u01ea\7$\2\2\u01e9\u01e7"+
		"\3\2\2\2\u01e9\u01ea\3\2\2\2\u01ea\u01eb\3\2\2\2\u01eb\u01f0\5 \21\2\u01ec"+
		"\u01ed\7\5\2\2\u01ed\u01ef\5 \21\2\u01ee\u01ec\3\2\2\2\u01ef\u01f2\3\2"+
		"\2\2\u01f0\u01ee\3\2\2\2\u01f0\u01f1\3\2\2\2\u01f1\u0344\3\2\2\2\u01f2"+
		"\u01f0\3\2\2\2\u01f3\u01f4\7o\2\2\u01f4\u01f5\7R\2\2\u01f5\u01f7\5\u0086"+
		"D\2\u01f6\u01f8\5 \21\2\u01f7\u01f6\3\2\2\2\u01f7\u01f8\3\2\2\2\u01f8"+
		"\u01f9\3\2\2\2\u01f9\u01fa\7u\2\2\u01fa\u01fb\5\30\r\2\u01fb\u0344\3\2"+
		"\2\2\u01fc\u01fd\7o\2\2\u01fd\u01fe\7R\2\2\u01fe\u01ff\5\u0086D\2\u01ff"+
		"\u0200\7\u00e2\2\2\u0200\u0201\7e\2\2\u0201\u0344\3\2\2\2\u0202\u0203"+
		"\7g\2\2\u0203\u0206\7R\2\2\u0204\u0205\7\u0081\2\2\u0205\u0207\7$\2\2"+
		"\u0206\u0204\3\2\2\2\u0206\u0207\3\2\2\2\u0207\u0208\3\2\2\2\u0208\u020a"+
		"\5\u0086D\2\u0209\u020b\7\u00ce\2\2\u020a\u0209\3\2\2\2\u020a\u020b\3"+
		"\2\2\2\u020b\u0344\3\2\2\2\u020c\u020d\7g\2\2\u020d\u0210\7T\2\2\u020e"+
		"\u020f\7\u0081\2\2\u020f\u0211\7$\2\2\u0210\u020e\3\2\2\2\u0210\u0211"+
		"\3\2\2\2\u0211\u0212\3\2\2\2\u0212\u0344\5\u0086D\2\u0213\u0216\7Q\2\2"+
		"\u0214\u0215\7\37\2\2\u0215\u0217\7U\2\2\u0216\u0214\3\2\2\2\u0216\u0217"+
		"\3\2\2\2\u0217\u021c\3\2\2\2\u0218\u021a\7\u00b7\2\2\u0219\u0218\3\2\2"+
		"\2\u0219\u021a\3\2\2\2\u021a\u021b\3\2\2\2\u021b\u021d\7\u00b8\2\2\u021c"+
		"\u0219\3\2\2\2\u021c\u021d\3\2\2\2\u021d\u021e\3\2\2\2\u021e\u0222\7T"+
		"\2\2\u021f\u0220\7\u0081\2\2\u0220\u0221\7\"\2\2\u0221\u0223\7$\2\2\u0222"+
		"\u021f\3\2\2\2\u0222\u0223\3\2\2\2\u0223\u0224\3\2\2\2\u0224\u0226\5\u0086"+
		"D\2\u0225\u0227\5x=\2\u0226\u0225\3\2\2\2\u0226\u0227\3\2\2\2\u0227\u022a"+
		"\3\2\2\2\u0228\u0229\7t\2\2\u0229\u022b\7\u00f2\2\2\u022a\u0228\3\2\2"+
		"\2\u022a\u022b\3\2\2\2\u022b\u022f\3\2\2\2\u022c\u022d\7\u00d9\2\2\u022d"+
		"\u022e\7?\2\2\u022e\u0230\5p9\2\u022f\u022c\3\2\2\2\u022f\u0230\3\2\2"+
		"\2\u0230\u0233\3\2\2\2\u0231\u0232\7\u00bb\2\2\u0232\u0234\5.\30\2\u0233"+
		"\u0231\3\2\2\2\u0233\u0234\3\2\2\2\u0234\u0235\3\2\2\2\u0235\u0236\7\20"+
		"\2\2\u0236\u0237\5\32\16\2\u0237\u0344\3\2\2\2\u0238\u023b\7Q\2\2\u0239"+
		"\u023a\7\37\2\2\u023a\u023c\7U\2\2\u023b\u0239\3\2\2\2\u023b\u023c\3\2"+
		"\2\2\u023c\u023e\3\2\2\2\u023d\u023f\7\u00b7\2\2\u023e\u023d\3\2\2\2\u023e"+
		"\u023f\3\2\2\2\u023f\u0240\3\2\2\2\u0240\u0241\7\u00b8\2\2\u0241\u0242"+
		"\7T\2\2\u0242\u0247\5\u0086D\2\u0243\u0244\7\3\2\2\u0244\u0245\5\u00ac"+
		"W\2\u0245\u0246\7\4\2\2\u0246\u0248\3\2\2\2\u0247\u0243\3\2\2\2\u0247"+
		"\u0248\3\2\2\2\u0248\u0249\3\2\2\2\u0249\u024c\5,\27\2\u024a\u024b\7\u00b9"+
		"\2\2\u024b\u024d\5.\30\2\u024c\u024a\3\2\2\2\u024c\u024d\3\2\2\2\u024d"+
		"\u0344\3\2\2\2\u024e\u024f\7o\2\2\u024f\u0250\7T\2\2\u0250\u0252\5\u0086"+
		"D\2\u0251\u0253\7\20\2\2\u0252\u0251\3\2\2\2\u0252\u0253\3\2\2\2\u0253"+
		"\u0254\3\2\2\2\u0254\u0255\5\32\16\2\u0255\u0344\3\2\2\2\u0256\u0259\7"+
		"Q\2\2\u0257\u0258\7\37\2\2\u0258\u025a\7U\2\2\u0259\u0257\3\2\2\2\u0259"+
		"\u025a\3\2\2\2\u025a\u025c\3\2\2\2\u025b\u025d\7\u00b8\2\2\u025c\u025b"+
		"\3\2\2\2\u025c\u025d\3\2\2\2\u025d\u025e\3\2\2\2\u025e\u0262\7\u00af\2"+
		"\2\u025f\u0260\7\u0081\2\2\u0260\u0261\7\"\2\2\u0261\u0263\7$\2\2\u0262"+
		"\u025f\3\2\2\2\u0262\u0263\3\2\2\2\u0263\u0264\3\2\2\2\u0264\u0265\5\u00c0"+
		"a\2\u0265\u0266\7\20\2\2\u0266\u0270\7\u00f2\2\2\u0267\u0268\7\u00a1\2"+
		"\2\u0268\u026d\5@!\2\u0269\u026a\7\5\2\2\u026a\u026c\5@!\2\u026b\u0269"+
		"\3\2\2\2\u026c\u026f\3\2\2\2\u026d\u026b\3\2\2\2\u026d\u026e\3\2\2\2\u026e"+
		"\u0271\3\2\2\2\u026f\u026d\3\2\2\2\u0270\u0267\3\2\2\2\u0270\u0271\3\2"+
		"\2\2\u0271\u0344\3\2\2\2\u0272\u0274\7g\2\2\u0273\u0275\7\u00b8\2\2\u0274"+
		"\u0273\3\2\2\2\u0274\u0275\3\2\2\2\u0275\u0276\3\2\2\2\u0276\u0279\7\u00af"+
		"\2\2\u0277\u0278\7\u0081\2\2\u0278\u027a\7$\2\2\u0279\u0277\3\2\2\2\u0279"+
		"\u027a\3\2\2\2\u027a\u027b\3\2\2\2\u027b\u0344\5\u00c0a\2\u027c\u027e"+
		"\7Z\2\2\u027d\u027f\t\4\2\2\u027e\u027d\3\2\2\2\u027e\u027f\3\2\2\2\u027f"+
		"\u0280\3\2\2\2\u0280\u0344\5\16\b\2\u0281\u0282\7`\2\2\u0282\u0285\7a"+
		"\2\2\u0283\u0284\t\5\2\2\u0284\u0286\5\u00c2b\2\u0285\u0283\3\2\2\2\u0285"+
		"\u0286\3\2\2\2\u0286\u028b\3\2\2\2\u0287\u0289\7&\2\2\u0288\u0287\3\2"+
		"\2\2\u0288\u0289\3\2\2\2\u0289\u028a\3\2\2\2\u028a\u028c\7\u00f2\2\2\u028b"+
		"\u0288\3\2\2\2\u028b\u028c\3\2\2\2\u028c\u0344\3\2\2\2\u028d\u028e\7`"+
		"\2\2\u028e\u028f\7R\2\2\u028f\u0292\7\u00b0\2\2\u0290\u0291\t\5\2\2\u0291"+
		"\u0293\5\u00c2b\2\u0292\u0290\3\2\2\2\u0292\u0293\3\2\2\2\u0293\u0294"+
		"\3\2\2\2\u0294\u0295\7&\2\2\u0295\u0297\7\u00f2\2\2\u0296\u0298\5 \21"+
		"\2\u0297\u0296\3\2\2\2\u0297\u0298\3\2\2\2\u0298\u0344\3\2\2\2\u0299\u029a"+
		"\7`\2\2\u029a\u029f\7\u00d2\2\2\u029b\u029d\7&\2\2\u029c\u029b\3\2\2\2"+
		"\u029c\u029d\3\2\2\2\u029d\u029e\3\2\2\2\u029e\u02a0\7\u00f2\2\2\u029f"+
		"\u029c\3\2\2\2\u029f\u02a0\3\2\2\2\u02a0\u0344\3\2\2\2\u02a1\u02a2\7`"+
		"\2\2\u02a2\u02a3\7\u00bb\2\2\u02a3\u02a8\5\u0086D\2\u02a4\u02a5\7\3\2"+
		"\2\u02a5\u02a6\5\62\32\2\u02a6\u02a7\7\4\2\2\u02a7\u02a9\3\2\2\2\u02a8"+
		"\u02a4\3\2\2\2\u02a8\u02a9\3\2\2\2\u02a9\u0344\3\2\2\2\u02aa\u02ab\7`"+
		"\2\2\u02ab\u02ac\7b\2\2\u02ac\u02ad\t\5\2\2\u02ad\u02b0\5\u0086D\2\u02ae"+
		"\u02af\t\5\2\2\u02af\u02b1\5\u00c2b\2\u02b0\u02ae\3\2\2\2\u02b0\u02b1"+
		"\3\2\2\2\u02b1\u0344\3\2\2\2\u02b2\u02b3\7`\2\2\u02b3\u02b4\7e\2\2\u02b4"+
		"\u02b6\5\u0086D\2\u02b5\u02b7\5 \21\2\u02b6\u02b5\3\2\2\2\u02b6\u02b7"+
		"\3\2\2\2\u02b7\u0344\3\2\2\2\u02b8\u02ba\7`\2\2\u02b9\u02bb\5\u00c2b\2"+
		"\u02ba\u02b9\3\2\2\2\u02ba\u02bb\3\2\2\2\u02bb\u02bc\3\2\2\2\u02bc\u02c4"+
		"\7f\2\2\u02bd\u02bf\7&\2\2\u02be\u02bd\3\2\2\2\u02be\u02bf\3\2\2\2\u02bf"+
		"\u02c2\3\2\2\2\u02c0\u02c3\5\u00c0a\2\u02c1\u02c3\7\u00f2\2\2\u02c2\u02c0"+
		"\3\2\2\2\u02c2\u02c1\3\2\2\2\u02c3\u02c5\3\2\2\2\u02c4\u02be\3\2\2\2\u02c4"+
		"\u02c5\3\2\2\2\u02c5\u0344\3\2\2\2\u02c6\u02c7\7`\2\2\u02c7\u02c8\7Q\2"+
		"\2\u02c8\u02c9\7R\2\2\u02c9\u0344\5\u0086D\2\u02ca\u02cb\t\6\2\2\u02cb"+
		"\u02cd\7\u00af\2\2\u02cc\u02ce\7\u00b0\2\2\u02cd\u02cc\3\2\2\2\u02cd\u02ce"+
		"\3\2\2\2\u02ce\u02cf\3\2\2\2\u02cf\u0344\5$\23\2\u02d0\u02d1\t\6\2\2\u02d1"+
		"\u02d3\7\u00d1\2\2\u02d2\u02d4\7\u00b0\2\2\u02d3\u02d2\3\2\2\2\u02d3\u02d4"+
		"\3\2\2\2\u02d4\u02d5\3\2\2\2\u02d5\u0344\5\u00c2b\2\u02d6\u02d8\t\6\2"+
		"\2\u02d7\u02d9\7R\2\2\u02d8\u02d7\3\2\2\2\u02d8\u02d9\3\2\2\2\u02d9\u02db"+
		"\3\2\2\2\u02da\u02dc\t\7\2\2\u02db\u02da\3\2\2\2\u02db\u02dc\3\2\2\2\u02dc"+
		"\u02dd\3\2\2\2\u02dd\u02df\5\u0086D\2\u02de\u02e0\5 \21\2\u02df\u02de"+
		"\3\2\2\2\u02df\u02e0\3\2\2\2\u02e0\u02e2\3\2\2\2\u02e1\u02e3\5&\24\2\u02e2"+
		"\u02e1\3\2\2\2\u02e2\u02e3\3\2\2\2\u02e3\u0344\3\2\2\2\u02e4\u02e5\7\u00b1"+
		"\2\2\u02e5\u02e6\7R\2\2\u02e6\u0344\5\u0086D\2\u02e7\u02ef\7\u00b1\2\2"+
		"\u02e8\u02f0\7\u00f2\2\2\u02e9\u02eb\13\2\2\2\u02ea\u02e9\3\2\2\2\u02eb"+
		"\u02ee\3\2\2\2\u02ec\u02ed\3\2\2\2\u02ec\u02ea\3\2\2\2\u02ed\u02f0\3\2"+
		"\2\2\u02ee\u02ec\3\2\2\2\u02ef\u02e8\3\2\2\2\u02ef\u02ec\3\2\2\2\u02f0"+
		"\u0344\3\2\2\2\u02f1\u02f3\7\u00b3\2\2\u02f2\u02f4\7\u00b5\2\2\u02f3\u02f2"+
		"\3\2\2\2\u02f3\u02f4\3\2\2\2\u02f4\u02f5\3\2\2\2\u02f5\u02f6\7R\2\2\u02f6"+
		"\u02f9\5\u0086D\2\u02f7\u02f8\7\u00b9\2\2\u02f8\u02fa\5.\30\2\u02f9\u02f7"+
		"\3\2\2\2\u02f9\u02fa\3\2\2\2\u02fa\u02ff\3\2\2\2\u02fb\u02fd\7\20\2\2"+
		"\u02fc\u02fb\3\2\2\2\u02fc\u02fd\3\2\2\2\u02fd\u02fe\3\2\2\2\u02fe\u0300"+
		"\5\32\16\2\u02ff\u02fc\3\2\2\2\u02ff\u0300\3\2\2\2\u0300\u0344\3\2\2\2"+
		"\u0301\u0302\7\u00b4\2\2\u0302\u0305\7R\2\2\u0303\u0304\7\u0081\2\2\u0304"+
		"\u0306\7$\2\2\u0305\u0303\3\2\2\2\u0305\u0306\3\2\2\2\u0306\u0307\3\2"+
		"\2\2\u0307\u0344\5\u0086D\2\u0308\u0309\7\u00b2\2\2\u0309\u0344\7\u00b3"+
		"\2\2\u030a\u030b\7\u00e5\2\2\u030b\u030d\7w\2\2\u030c\u030e\7\u00f0\2"+
		"\2\u030d\u030c\3\2\2\2\u030d\u030e\3\2\2\2\u030e\u030f\3\2\2\2\u030f\u0310"+
		"\7\u00f1\2\2\u0310\u0312\7\u00f2\2\2\u0311\u0313\7\u009e\2\2\u0312\u0311"+
		"\3\2\2\2\u0312\u0313\3\2\2\2\u0313\u0314\3\2\2\2\u0314\u0315\7X\2\2\u0315"+
		"\u0316\7R\2\2\u0316\u0318\5\u0086D\2\u0317\u0319\5 \21\2\u0318\u0317\3"+
		"\2\2\2\u0318\u0319\3\2\2\2\u0319\u0344\3\2\2\2\u031a\u031b\7\u00d4\2\2"+
		"\u031b\u031c\7R\2\2\u031c\u031e\5\u0086D\2\u031d\u031f\5 \21\2\u031e\u031d"+
		"\3\2\2\2\u031e\u031f\3\2\2\2\u031f\u0344\3\2\2\2\u0320\u0321\7\u00e0\2"+
		"\2\u0321\u0322\7\u00e1\2\2\u0322\u0323\7R\2\2\u0323\u0344\5\u0086D\2\u0324"+
		"\u0325\t\b\2\2\u0325\u0329\5\u00c2b\2\u0326\u0328\13\2\2\2\u0327\u0326"+
		"\3\2\2\2\u0328\u032b\3\2\2\2\u0329\u032a\3\2\2\2\u0329\u0327\3\2\2\2\u032a"+
		"\u0344\3\2\2\2\u032b\u0329\3\2\2\2\u032c\u032d\7u\2\2\u032d\u0331\7\u00e6"+
		"\2\2\u032e\u0330\13\2\2\2\u032f\u032e\3\2\2\2\u0330\u0333\3\2\2\2\u0331"+
		"\u0332\3\2\2\2\u0331\u032f\3\2\2\2\u0332\u0344\3\2\2\2\u0333\u0331\3\2"+
		"\2\2\u0334\u0338\7u\2\2\u0335\u0337\13\2\2\2\u0336\u0335\3\2\2\2\u0337"+
		"\u033a\3\2\2\2\u0338\u0339\3\2\2\2\u0338\u0336\3\2\2\2\u0339\u0344\3\2"+
		"\2\2\u033a\u0338\3\2\2\2\u033b\u0344\7v\2\2\u033c\u0340\5\20\t\2\u033d"+
		"\u033f\13\2\2\2\u033e\u033d\3\2\2\2\u033f\u0342\3\2\2\2\u0340\u0341\3"+
		"\2\2\2\u0340\u033e\3\2\2\2\u0341\u0344\3\2\2\2\u0342\u0340\3\2\2\2\u0343"+
		"\u00de\3\2\2\2\u0343\u00df\3\2\2\2\u0343\u00e1\3\2\2\2\u0343\u00f5\3\2"+
		"\2\2\u0343\u00fc\3\2\2\2\u0343\u0106\3\2\2\2\u0343\u0124\3\2\2\2\u0343"+
		"\u0145\3\2\2\2\u0343\u0152\3\2\2\2\u0343\u0163\3\2\2\2\u0343\u016c\3\2"+
		"\2\2\u0343\u0173\3\2\2\2\u0343\u017a\3\2\2\2\u0343\u0185\3\2\2\2\u0343"+
		"\u0194\3\2\2\2\u0343\u01a2\3\2\2\2\u0343\u01ac\3\2\2\2\u0343\u01ba\3\2"+
		"\2\2\u0343\u01c8\3\2\2\2\u0343\u01d0\3\2\2\2\u0343\u01e3\3\2\2\2\u0343"+
		"\u01f3\3\2\2\2\u0343\u01fc\3\2\2\2\u0343\u0202\3\2\2\2\u0343\u020c\3\2"+
		"\2\2\u0343\u0213\3\2\2\2\u0343\u0238\3\2\2\2\u0343\u024e\3\2\2\2\u0343"+
		"\u0256\3\2\2\2\u0343\u0272\3\2\2\2\u0343\u027c\3\2\2\2\u0343\u0281\3\2"+
		"\2\2\u0343\u028d\3\2\2\2\u0343\u0299\3\2\2\2\u0343\u02a1\3\2\2\2\u0343"+
		"\u02aa\3\2\2\2\u0343\u02b2\3\2\2\2\u0343\u02b8\3\2\2\2\u0343\u02c6\3\2"+
		"\2\2\u0343\u02ca\3\2\2\2\u0343\u02d0\3\2\2\2\u0343\u02d6\3\2\2\2\u0343"+
		"\u02e4\3\2\2\2\u0343\u02e7\3\2\2\2\u0343\u02f1\3\2\2\2\u0343\u0301\3\2"+
		"\2\2\u0343\u0308\3\2\2\2\u0343\u030a\3\2\2\2\u0343\u031a\3\2\2\2\u0343"+
		"\u0320\3\2\2\2\u0343\u0324\3\2\2\2\u0343\u032c\3\2\2\2\u0343\u0334\3\2"+
		"\2\2\u0343\u033b\3\2\2\2\u0343\u033c\3\2\2\2\u0344\17\3\2\2\2\u0345\u0346"+
		"\7Q\2\2\u0346\u03f0\7\u00e6\2\2\u0347\u0348\7g\2\2\u0348\u03f0\7\u00e6"+
		"\2\2\u0349\u034b\7\u00dd\2\2\u034a\u034c\7\u00e6\2\2\u034b\u034a\3\2\2"+
		"\2\u034b\u034c\3\2\2\2\u034c\u03f0\3\2\2\2\u034d\u034f\7\u00dc\2\2\u034e"+
		"\u0350\7\u00e6\2\2\u034f\u034e\3\2\2\2\u034f\u0350\3\2\2\2\u0350\u03f0"+
		"\3\2\2\2\u0351\u0352\7`\2\2\u0352\u03f0\7\u00dd\2\2\u0353\u0354\7`\2\2"+
		"\u0354\u0356\7\u00e6\2\2\u0355\u0357\7\u00dd\2\2\u0356\u0355\3\2\2\2\u0356"+
		"\u0357\3\2\2\2\u0357\u03f0\3\2\2\2\u0358\u0359\7`\2\2\u0359\u03f0\7\u00e9"+
		"\2\2\u035a\u035b\7`\2\2\u035b\u03f0\7\u00e7\2\2\u035c\u035d\7`\2\2\u035d"+
		"\u035e\7J\2\2\u035e\u03f0\7\u00e7\2\2\u035f\u0360\7\u00e3\2\2\u0360\u03f0"+
		"\7R\2\2\u0361\u0362\7\u00e4\2\2\u0362\u03f0\7R\2\2\u0363\u0364\7`\2\2"+
		"\u0364\u03f0\7\u00e8\2\2\u0365\u0366\7`\2\2\u0366\u0367\7Q\2\2\u0367\u03f0"+
		"\7R\2\2\u0368\u0369\7`\2\2\u0369\u03f0\7\u00ea\2\2\u036a\u036b\7`\2\2"+
		"\u036b\u03f0\7\u00ec\2\2\u036c\u036d\7`\2\2\u036d\u03f0\7\u00ed\2\2\u036e"+
		"\u036f\7Q\2\2\u036f\u03f0\7\u00eb\2\2\u0370\u0371\7g\2\2\u0371\u03f0\7"+
		"\u00eb\2\2\u0372\u0373\7o\2\2\u0373\u03f0\7\u00eb\2\2\u0374\u0375\7\u00de"+
		"\2\2\u0375\u03f0\7R\2\2\u0376\u0377\7\u00de\2\2\u0377\u03f0\7\u00d1\2"+
		"\2\u0378\u0379\7\u00df\2\2\u0379\u03f0\7R\2\2\u037a\u037b\7\u00df\2\2"+
		"\u037b\u03f0\7\u00d1\2\2\u037c\u037d\7Q\2\2\u037d\u037e\7\u00b8\2\2\u037e"+
		"\u03f0\7|\2\2\u037f\u0380\7g\2\2\u0380\u0381\7\u00b8\2\2\u0381\u03f0\7"+
		"|\2\2\u0382\u0383\7o\2\2\u0383\u0384\7R\2\2\u0384\u0385\5\u0086D\2\u0385"+
		"\u0386\7\"\2\2\u0386\u0387\7\u00cc\2\2\u0387\u03f0\3\2\2\2\u0388\u0389"+
		"\7o\2\2\u0389\u038a\7R\2\2\u038a\u038b\5\u0086D\2\u038b\u038c\7\u00cc"+
		"\2\2\u038c\u038d\7\26\2\2\u038d\u03f0\3\2\2\2\u038e\u038f\7o\2\2\u038f"+
		"\u0390\7R\2\2\u0390\u0391\5\u0086D\2\u0391\u0392\7\"\2\2\u0392\u0393\7"+
		"\u00cd\2\2\u0393\u03f0\3\2\2\2\u0394\u0395\7o\2\2\u0395\u0396\7R\2\2\u0396"+
		"\u0397\5\u0086D\2\u0397\u0398\7\u00be\2\2\u0398\u0399\7\26\2\2\u0399\u03f0"+
		"\3\2\2\2\u039a\u039b\7o\2\2\u039b\u039c\7R\2\2\u039c\u039d\5\u0086D\2"+
		"\u039d\u039e\7\"\2\2\u039e\u039f\7\u00be\2\2\u039f\u03f0\3\2\2\2\u03a0"+
		"\u03a1\7o\2\2\u03a1\u03a2\7R\2\2\u03a2\u03a3\5\u0086D\2\u03a3\u03a4\7"+
		"\"\2\2\u03a4\u03a5\7\u00bf\2\2\u03a5\u03a6\7\20\2\2\u03a6\u03a7\7\u00c0"+
		"\2\2\u03a7\u03f0\3\2\2\2\u03a8\u03a9\7o\2\2\u03a9\u03aa\7R\2\2\u03aa\u03ab"+
		"\5\u0086D\2\u03ab\u03ac\7u\2\2\u03ac\u03ad\7\u00be\2\2\u03ad\u03ae\7\u00c1"+
		"\2\2\u03ae\u03f0\3\2\2\2\u03af\u03b0\7o\2\2\u03b0\u03b1\7R\2\2\u03b1\u03b2"+
		"\5\u0086D\2\u03b2\u03b3\7\u00c2\2\2\u03b3\u03b4\7D\2\2\u03b4\u03f0\3\2"+
		"\2\2\u03b5\u03b6\7o\2\2\u03b6\u03b7\7R\2\2\u03b7\u03b8\5\u0086D\2\u03b8"+
		"\u03b9\7\u00c3\2\2\u03b9\u03ba\7D\2\2\u03ba\u03f0\3\2\2\2\u03bb\u03bc"+
		"\7o\2\2\u03bc\u03bd\7R\2\2\u03bd\u03be\5\u0086D\2\u03be\u03bf\7\u00c4"+
		"\2\2\u03bf\u03c0\7D\2\2\u03c0\u03f0\3\2\2\2\u03c1\u03c2\7o\2\2\u03c2\u03c3"+
		"\7R\2\2\u03c3\u03c4\5\u0086D\2\u03c4\u03c5\7\u00c6\2\2\u03c5\u03f0\3\2"+
		"\2\2\u03c6\u03c7\7o\2\2\u03c7\u03c8\7R\2\2\u03c8\u03ca\5\u0086D\2\u03c9"+
		"\u03cb\5 \21\2\u03ca\u03c9\3\2\2\2\u03ca\u03cb\3\2\2\2\u03cb\u03cc\3\2"+
		"\2\2\u03cc\u03cd\7\u00c7\2\2\u03cd\u03f0\3\2\2\2\u03ce\u03cf\7o\2\2\u03cf"+
		"\u03d0\7R\2\2\u03d0\u03d2\5\u0086D\2\u03d1\u03d3\5 \21\2\u03d2\u03d1\3"+
		"\2\2\2\u03d2\u03d3\3\2\2\2\u03d3\u03d4\3\2\2\2\u03d4\u03d5\7\u00c8\2\2"+
		"\u03d5\u03f0\3\2\2\2\u03d6\u03d7\7o\2\2\u03d7\u03d8\7R\2\2\u03d8\u03da"+
		"\5\u0086D\2\u03d9\u03db\5 \21\2\u03da\u03d9\3\2\2\2\u03da\u03db\3\2\2"+
		"\2\u03db\u03dc\3\2\2\2\u03dc\u03dd\7u\2\2\u03dd\u03de\7\u00c5\2\2\u03de"+
		"\u03f0\3\2\2\2\u03df\u03e0\7o\2\2\u03e0\u03e1\7R\2\2\u03e1\u03e3\5\u0086"+
		"D\2\u03e2\u03e4\5 \21\2\u03e3\u03e2\3\2\2\2\u03e3\u03e4\3\2\2\2\u03e4"+
		"\u03e5\3\2\2\2\u03e5\u03e6\7U\2\2\u03e6\u03e7\7b\2\2\u03e7\u03f0\3\2\2"+
		"\2\u03e8\u03e9\7x\2\2\u03e9\u03f0\7y\2\2\u03ea\u03f0\7z\2\2\u03eb\u03f0"+
		"\7{\2\2\u03ec\u03f0\7\u00d3\2\2\u03ed\u03ee\7W\2\2\u03ee\u03f0\7\16\2"+
		"\2\u03ef\u0345\3\2\2\2\u03ef\u0347\3\2\2\2\u03ef\u0349\3\2\2\2\u03ef\u034d"+
		"\3\2\2\2\u03ef\u0351\3\2\2\2\u03ef\u0353\3\2\2\2\u03ef\u0358\3\2\2\2\u03ef"+
		"\u035a\3\2\2\2\u03ef\u035c\3\2\2\2\u03ef\u035f\3\2\2\2\u03ef\u0361\3\2"+
		"\2\2\u03ef\u0363\3\2\2\2\u03ef\u0365\3\2\2\2\u03ef\u0368\3\2\2\2\u03ef"+
		"\u036a\3\2\2\2\u03ef\u036c\3\2\2\2\u03ef\u036e\3\2\2\2\u03ef\u0370\3\2"+
		"\2\2\u03ef\u0372\3\2\2\2\u03ef\u0374\3\2\2\2\u03ef\u0376\3\2\2\2\u03ef"+
		"\u0378\3\2\2\2\u03ef\u037a\3\2\2\2\u03ef\u037c\3\2\2\2\u03ef\u037f\3\2"+
		"\2\2\u03ef\u0382\3\2\2\2\u03ef\u0388\3\2\2\2\u03ef\u038e\3\2\2\2\u03ef"+
		"\u0394\3\2\2\2\u03ef\u039a\3\2\2\2\u03ef\u03a0\3\2\2\2\u03ef\u03a8\3\2"+
		"\2\2\u03ef\u03af\3\2\2\2\u03ef\u03b5\3\2\2\2\u03ef\u03bb\3\2\2\2\u03ef"+
		"\u03c1\3\2\2\2\u03ef\u03c6\3\2\2\2\u03ef\u03ce\3\2\2\2\u03ef\u03d6\3\2"+
		"\2\2\u03ef\u03df\3\2\2\2\u03ef\u03e8\3\2\2\2\u03ef\u03ea\3\2\2\2\u03ef"+
		"\u03eb\3\2\2\2\u03ef\u03ec\3\2\2\2\u03ef\u03ed\3\2\2\2\u03f0\21\3\2\2"+
		"\2\u03f1\u03f3\7Q\2\2\u03f2\u03f4\7\u00b8\2\2\u03f3\u03f2\3\2\2\2\u03f3"+
		"\u03f4\3\2\2\2\u03f4\u03f6\3\2\2\2\u03f5\u03f7\7\u00da\2\2\u03f6\u03f5"+
		"\3\2\2\2\u03f6\u03f7\3\2\2\2\u03f7\u03f8\3\2\2\2\u03f8\u03fc\7R\2\2\u03f9"+
		"\u03fa\7\u0081\2\2\u03fa\u03fb\7\"\2\2\u03fb\u03fd\7$\2\2\u03fc\u03f9"+
		"\3\2\2\2\u03fc\u03fd\3\2\2\2\u03fd\u03fe\3\2\2\2\u03fe\u03ff\5\u0086D"+
		"\2\u03ff\23\3\2\2\2\u0400\u0401\7\u00cc\2\2\u0401\u0402\7\26\2\2\u0402"+
		"\u0406\5p9\2\u0403\u0404\7\u00cd\2\2\u0404\u0405\7\26\2\2\u0405\u0407"+
		"\5t;\2\u0406\u0403\3\2\2\2\u0406\u0407\3\2\2\2\u0407\u0408\3\2\2\2\u0408"+
		"\u0409\7X\2\2\u0409\u040a\7\u00f6\2\2\u040a\u040b\7\u00bd\2\2\u040b\25"+
		"\3\2\2\2\u040c\u040d\7\u00be\2\2\u040d\u040e\7\26\2\2\u040e\u040f\5p9"+
		"\2\u040f\u0412\7?\2\2\u0410\u0413\5\66\34\2\u0411\u0413\58\35\2\u0412"+
		"\u0410\3\2\2\2\u0412\u0411\3\2\2\2\u0413\u0417\3\2\2\2\u0414\u0415\7\u00bf"+
		"\2\2\u0415\u0416\7\20\2\2\u0416\u0418\7\u00c0\2\2\u0417\u0414\3\2\2\2"+
		"\u0417\u0418\3\2\2\2\u0418\27\3\2\2\2\u0419\u041a\7\u00c1\2\2\u041a\u041b"+
		"\7\u00f2\2\2\u041b\31\3\2\2\2\u041c\u041e\5(\25\2\u041d\u041c\3\2\2\2"+
		"\u041d\u041e\3\2\2\2\u041e\u041f\3\2\2\2\u041f\u0420\5B\"\2\u0420\33\3"+
		"\2\2\2\u0421\u0422\7V\2\2\u0422\u0423\7\u009e\2\2\u0423\u0424\7R\2\2\u0424"+
		"\u042b\5\u0086D\2\u0425\u0429\5 \21\2\u0426\u0427\7\u0081\2\2\u0427\u0428"+
		"\7\"\2\2\u0428\u042a\7$\2\2\u0429\u0426\3\2\2\2\u0429\u042a\3\2\2\2\u042a"+
		"\u042c\3\2\2\2\u042b\u0425\3\2\2\2\u042b\u042c\3\2\2\2\u042c\u0452\3\2"+
		"\2\2\u042d\u042e\7V\2\2\u042e\u0430\7X\2\2\u042f\u0431\7R\2\2\u0430\u042f"+
		"\3\2\2\2\u0430\u0431\3\2\2\2\u0431\u0432\3\2\2\2\u0432\u0434\5\u0086D"+
		"\2\u0433\u0435\5 \21\2\u0434\u0433\3\2\2\2\u0434\u0435\3\2\2\2\u0435\u0452"+
		"\3\2\2\2\u0436\u0437\7V\2\2\u0437\u0439\7\u009e\2\2\u0438\u043a\7\u00f0"+
		"\2\2\u0439\u0438\3\2\2\2\u0439\u043a\3\2\2\2\u043a\u043b\3\2\2\2\u043b"+
		"\u043c\7S\2\2\u043c\u043e\7\u00f2\2\2\u043d\u043f\5\u0084C\2\u043e\u043d"+
		"\3\2\2\2\u043e\u043f\3\2\2\2\u043f\u0441\3\2\2\2\u0440\u0442\5:\36\2\u0441"+
		"\u0440\3\2\2\2\u0441\u0442\3\2\2\2\u0442\u0452\3\2\2\2\u0443\u0444\7V"+
		"\2\2\u0444\u0446\7\u009e\2\2\u0445\u0447\7\u00f0\2\2\u0446\u0445\3\2\2"+
		"\2\u0446\u0447\3\2\2\2\u0447\u0448\3\2\2\2\u0448\u044a\7S\2\2\u0449\u044b"+
		"\7\u00f2\2\2\u044a\u0449\3\2\2\2\u044a\u044b\3\2\2\2\u044b\u044c\3\2\2"+
		"\2\u044c\u044f\5,\27\2\u044d\u044e\7\u00b9\2\2\u044e\u0450\5.\30\2\u044f"+
		"\u044d\3\2\2\2\u044f\u0450\3\2\2\2\u0450\u0452\3\2\2\2\u0451\u0421\3\2"+
		"\2\2\u0451\u042d\3\2\2\2\u0451\u0436\3\2\2\2\u0451\u0443\3\2\2\2\u0452"+
		"\35\3\2\2\2\u0453\u0455\5 \21\2\u0454\u0456\5\30\r\2\u0455\u0454\3\2\2"+
		"\2\u0455\u0456\3\2\2\2\u0456\37\3\2\2\2\u0457\u0458\7D\2\2\u0458\u0459"+
		"\7\3\2\2\u0459\u045e\5\"\22\2\u045a\u045b\7\5\2\2\u045b\u045d\5\"\22\2"+
		"\u045c\u045a\3\2\2\2\u045d\u0460\3\2\2\2\u045e\u045c\3\2\2\2\u045e\u045f"+
		"\3\2\2\2\u045f\u0461\3\2\2\2\u0460\u045e\3\2\2\2\u0461\u0462\7\4\2\2\u0462"+
		"!\3\2\2\2\u0463\u0466\5\u00c2b\2\u0464\u0465\7\u0084\2\2\u0465\u0467\5"+
		"\u0098M\2\u0466\u0464\3\2\2\2\u0466\u0467\3\2\2\2\u0467#\3\2\2\2\u0468"+
		"\u046e\5\u00c0a\2\u0469\u046e\7\u00f2\2\2\u046a\u046e\5\u009aN\2\u046b"+
		"\u046e\5\u009cO\2\u046c\u046e\5\u009eP\2\u046d\u0468\3\2\2\2\u046d\u0469"+
		"\3\2\2\2\u046d\u046a\3\2\2\2\u046d\u046b\3\2\2\2\u046d\u046c\3\2\2\2\u046e"+
		"%\3\2\2\2\u046f\u0474\5\u00c2b\2\u0470\u0471\7\6\2\2\u0471\u0473\5\u00c2"+
		"b\2\u0472\u0470\3\2\2\2\u0473\u0476\3\2\2\2\u0474\u0472\3\2\2\2\u0474"+
		"\u0475\3\2\2\2\u0475\'\3\2\2\2\u0476\u0474\3\2\2\2\u0477\u0478\7O\2\2"+
		"\u0478\u047d\5*\26\2\u0479\u047a\7\5\2\2\u047a\u047c\5*\26\2\u047b\u0479"+
		"\3\2\2\2\u047c\u047f\3\2\2\2\u047d\u047b\3\2\2\2\u047d\u047e\3\2\2\2\u047e"+
		")\3\2\2\2\u047f\u047d\3\2\2\2\u0480\u0482\5\u00c2b\2\u0481\u0483\7\20"+
		"\2\2\u0482\u0481\3\2\2\2\u0482\u0483\3\2\2\2\u0483\u0484\3\2\2\2\u0484"+
		"\u0485\7\3\2\2\u0485\u0486\5\32\16\2\u0486\u0487\7\4\2\2\u0487+\3\2\2"+
		"\2\u0488\u0489\7\u00a1\2\2\u0489\u048a\5\u00c0a\2\u048a-\3\2\2\2\u048b"+
		"\u048c\7\3\2\2\u048c\u0491\5\60\31\2\u048d\u048e\7\5\2\2\u048e\u0490\5"+
		"\60\31\2\u048f\u048d\3\2\2\2\u0490\u0493\3\2\2\2\u0491\u048f\3\2\2\2\u0491"+
		"\u0492\3\2\2\2\u0492\u0494\3\2\2\2\u0493\u0491\3\2\2\2\u0494\u0495\7\4"+
		"\2\2\u0495/\3\2\2\2\u0496\u049b\5\62\32\2\u0497\u0499\7\u0084\2\2\u0498"+
		"\u0497\3\2\2\2\u0498\u0499\3\2\2\2\u0499\u049a\3\2\2\2\u049a\u049c\5\64"+
		"\33\2\u049b\u0498\3\2\2\2\u049b\u049c\3\2\2\2\u049c\61\3\2\2\2\u049d\u04a2"+
		"\5\u00c2b\2\u049e\u049f\7\6\2\2\u049f\u04a1\5\u00c2b\2\u04a0\u049e\3\2"+
		"\2\2\u04a1\u04a4\3\2\2\2\u04a2\u04a0\3\2\2\2\u04a2\u04a3\3\2\2\2\u04a3"+
		"\u04a7\3\2\2\2\u04a4\u04a2\3\2\2\2\u04a5\u04a7\7\u00f2\2\2\u04a6\u049d"+
		"\3\2\2\2\u04a6\u04a5\3\2\2\2\u04a7\63\3\2\2\2\u04a8\u04ad\7\u00f6\2\2"+
		"\u04a9\u04ad\7\u00f7\2\2\u04aa\u04ad\5\u00a0Q\2\u04ab\u04ad\7\u00f2\2"+
		"\2\u04ac\u04a8\3\2\2\2\u04ac\u04a9\3\2\2\2\u04ac\u04aa\3\2\2\2\u04ac\u04ab"+
		"\3\2\2\2\u04ad\65\3\2\2\2\u04ae\u04af\7\3\2\2\u04af\u04b4\5\u0098M\2\u04b0"+
		"\u04b1\7\5\2\2\u04b1\u04b3\5\u0098M\2\u04b2\u04b0\3\2\2\2\u04b3\u04b6"+
		"\3\2\2\2\u04b4\u04b2\3\2\2\2\u04b4\u04b5\3\2\2\2\u04b5\u04b7\3\2\2\2\u04b6"+
		"\u04b4\3\2\2\2\u04b7\u04b8\7\4\2\2\u04b8\67\3\2\2\2\u04b9\u04ba\7\3\2"+
		"\2\u04ba\u04bf\5\66\34\2\u04bb\u04bc\7\5\2\2\u04bc\u04be\5\66\34\2\u04bd"+
		"\u04bb\3\2\2\2\u04be\u04c1\3\2\2\2\u04bf\u04bd\3\2\2\2\u04bf\u04c0\3\2"+
		"\2\2\u04c0\u04c2\3\2\2\2\u04c1\u04bf\3\2\2\2\u04c2\u04c3\7\4\2\2\u04c3"+
		"9\3\2\2\2\u04c4\u04c5\7\u00bf\2\2\u04c5\u04c6\7\20\2\2\u04c6\u04cb\5<"+
		"\37\2\u04c7\u04c8\7\u00bf\2\2\u04c8\u04c9\7\26\2\2\u04c9\u04cb\5> \2\u04ca"+
		"\u04c4\3\2\2\2\u04ca\u04c7\3\2\2\2\u04cb;\3\2\2\2\u04cc\u04cd\7\u00cf"+
		"\2\2\u04cd\u04ce\7\u00f2\2\2\u04ce\u04cf\7\u00d0\2\2\u04cf\u04d2\7\u00f2"+
		"\2\2\u04d0\u04d2\5\u00c2b\2\u04d1\u04cc\3\2\2\2\u04d1\u04d0\3\2\2\2\u04d2"+
		"=\3\2\2\2\u04d3\u04d7\7\u00f2\2\2\u04d4\u04d5\7O\2\2\u04d5\u04d6\7\u00a3"+
		"\2\2\u04d6\u04d8\5.\30\2\u04d7\u04d4\3\2\2\2\u04d7\u04d8\3\2\2\2\u04d8"+
		"?\3\2\2\2\u04d9\u04da\5\u00c2b\2\u04da\u04db\7\u00f2\2\2\u04dbA\3\2\2"+
		"\2\u04dc\u04de\5\34\17\2\u04dd\u04dc\3\2\2\2\u04dd\u04de\3\2\2\2\u04de"+
		"\u04df\3\2\2\2\u04df\u04e0\5H%\2\u04e0\u04e1\5D#\2\u04e1\u04e9\3\2\2\2"+
		"\u04e2\u04e4\5T+\2\u04e3\u04e5\5F$\2\u04e4\u04e3\3\2\2\2\u04e5\u04e6\3"+
		"\2\2\2\u04e6\u04e4\3\2\2\2\u04e6\u04e7\3\2\2\2\u04e7\u04e9\3\2\2\2\u04e8"+
		"\u04dd\3\2\2\2\u04e8\u04e2\3\2\2\2\u04e9C\3\2\2\2\u04ea\u04eb\7\33\2\2"+
		"\u04eb\u04ec\7\26\2\2\u04ec\u04f1\5L\'\2\u04ed\u04ee\7\5\2\2\u04ee\u04f0"+
		"\5L\'\2\u04ef\u04ed\3\2\2\2\u04f0\u04f3\3\2\2\2\u04f1\u04ef\3\2\2\2\u04f1"+
		"\u04f2\3\2\2\2\u04f2\u04f5\3\2\2\2\u04f3\u04f1\3\2\2\2\u04f4\u04ea\3\2"+
		"\2\2\u04f4\u04f5\3\2\2\2\u04f5\u0500\3\2\2\2\u04f6\u04f7\7\u009c\2\2\u04f7"+
		"\u04f8\7\26\2\2\u04f8\u04fd\5\u008eH\2\u04f9\u04fa\7\5\2\2\u04fa\u04fc"+
		"\5\u008eH\2\u04fb\u04f9\3\2\2\2\u04fc\u04ff\3\2\2\2\u04fd\u04fb\3\2\2"+
		"\2\u04fd\u04fe\3\2\2\2\u04fe\u0501\3\2\2\2\u04ff\u04fd\3\2\2\2\u0500\u04f6"+
		"\3\2\2\2\u0500\u0501\3\2\2\2\u0501\u050c\3\2\2\2\u0502\u0503\7\u009d\2"+
		"\2\u0503\u0504\7\26\2\2\u0504\u0509\5\u008eH\2\u0505\u0506\7\5\2\2\u0506"+
		"\u0508\5\u008eH\2\u0507\u0505\3\2\2\2\u0508\u050b\3\2\2\2\u0509\u0507"+
		"\3\2\2\2\u0509\u050a\3\2\2\2\u050a\u050d\3\2\2\2\u050b\u0509\3\2\2\2\u050c"+
		"\u0502\3\2\2\2\u050c\u050d\3\2\2\2\u050d\u0518\3\2\2\2\u050e\u050f\7\u009b"+
		"\2\2\u050f\u0510\7\26\2\2\u0510\u0515\5L\'\2\u0511\u0512\7\5\2\2\u0512"+
		"\u0514\5L\'\2\u0513\u0511\3\2\2\2\u0514\u0517\3\2\2\2\u0515\u0513\3\2"+
		"\2\2\u0515\u0516\3\2\2\2\u0516\u0519\3\2\2\2\u0517\u0515\3\2\2\2\u0518"+
		"\u050e\3\2\2\2\u0518\u0519\3\2\2\2\u0519\u051b\3\2\2\2\u051a\u051c\5\u00b6"+
		"\\\2\u051b\u051a\3\2\2\2\u051b\u051c\3\2\2\2\u051c\u0522\3\2\2\2\u051d"+
		"\u0520\7\35\2\2\u051e\u0521\7\21\2\2\u051f\u0521\5\u008eH\2\u0520\u051e"+
		"\3\2\2\2\u0520\u051f\3\2\2\2\u0521\u0523\3\2\2\2\u0522\u051d\3\2\2\2\u0522"+
		"\u0523\3\2\2\2\u0523E\3\2\2\2\u0524\u0526\5\34\17\2\u0525\u0524\3\2\2"+
		"\2\u0525\u0526\3\2\2\2\u0526\u0527\3\2\2\2\u0527\u0528\5N(\2\u0528\u0529"+
		"\5D#\2\u0529G\3\2\2\2\u052a\u052b\b%\1\2\u052b\u052c\5J&\2\u052c\u0544"+
		"\3\2\2\2\u052d\u052e\f\5\2\2\u052e\u052f\6%\3\2\u052f\u0531\t\t\2\2\u0530"+
		"\u0532\5b\62\2\u0531\u0530\3\2\2\2\u0531\u0532\3\2\2\2\u0532\u0533\3\2"+
		"\2\2\u0533\u0543\5H%\6\u0534\u0535\f\4\2\2\u0535\u0536\6%\5\2\u0536\u0538"+
		"\7k\2\2\u0537\u0539\5b\62\2\u0538\u0537\3\2\2\2\u0538\u0539\3\2\2\2\u0539"+
		"\u053a\3\2\2\2\u053a\u0543\5H%\5\u053b\u053c\f\3\2\2\u053c\u053d\6%\7"+
		"\2\u053d\u053f\t\n\2\2\u053e\u0540\5b\62\2\u053f\u053e\3\2\2\2\u053f\u0540"+
		"\3\2\2\2\u0540\u0541\3\2\2\2\u0541\u0543\5H%\4\u0542\u052d\3\2\2\2\u0542"+
		"\u0534\3\2\2\2\u0542\u053b\3\2\2\2\u0543\u0546\3\2\2\2\u0544\u0542\3\2"+
		"\2\2\u0544\u0545\3\2\2\2\u0545I\3\2\2\2\u0546\u0544\3\2\2\2\u0547\u0550"+
		"\5N(\2\u0548\u0549\7R\2\2\u0549\u0550\5\u0086D\2\u054a\u0550\5~@\2\u054b"+
		"\u054c\7\3\2\2\u054c\u054d\5B\"\2\u054d\u054e\7\4\2\2\u054e\u0550\3\2"+
		"\2\2\u054f\u0547\3\2\2\2\u054f\u0548\3\2\2\2\u054f\u054a\3\2\2\2\u054f"+
		"\u054b\3\2\2\2\u0550K\3\2\2\2\u0551\u0553\5\u008eH\2\u0552\u0554\t\13"+
		"\2\2\u0553\u0552\3\2\2\2\u0553\u0554\3\2\2\2\u0554\u0557\3\2\2\2\u0555"+
		"\u0556\7,\2\2\u0556\u0558\t\f\2\2\u0557\u0555\3\2\2\2\u0557\u0558\3\2"+
		"\2\2\u0558M\3\2\2\2\u0559\u055a\7\r\2\2\u055a\u055b\7\u009f\2\2\u055b"+
		"\u055c\7\3\2\2\u055c\u055d\5\u008cG\2\u055d\u055e\7\4\2\2\u055e\u0564"+
		"\3\2\2\2\u055f\u0560\7r\2\2\u0560\u0564\5\u008cG\2\u0561\u0562\7\u00a0"+
		"\2\2\u0562\u0564\5\u008cG\2\u0563\u0559\3\2\2\2\u0563\u055f\3\2\2\2\u0563"+
		"\u0561\3\2\2\2\u0564\u0566\3\2\2\2\u0565\u0567\5\u0084C\2\u0566\u0565"+
		"\3\2\2\2\u0566\u0567\3\2\2\2\u0567\u056a\3\2\2\2\u0568\u0569\7\u00a5\2"+
		"\2\u0569\u056b\7\u00f2\2\2\u056a\u0568\3\2\2\2\u056a\u056b\3\2\2\2\u056b"+
		"\u056c\3\2\2\2\u056c\u056d\7\u00a1\2\2\u056d\u057a\7\u00f2\2\2\u056e\u0578"+
		"\7\20\2\2\u056f\u0579\5r:\2\u0570\u0579\5\u00acW\2\u0571\u0574\7\3\2\2"+
		"\u0572\u0575\5r:\2\u0573\u0575\5\u00acW\2\u0574\u0572\3\2\2\2\u0574\u0573"+
		"\3\2\2\2\u0575\u0576\3\2\2\2\u0576\u0577\7\4\2\2\u0577\u0579\3\2\2\2\u0578"+
		"\u056f\3\2\2\2\u0578\u0570\3\2\2\2\u0578\u0571\3\2\2\2\u0579\u057b\3\2"+
		"\2\2\u057a\u056e\3\2\2\2\u057a\u057b\3\2\2\2\u057b\u057d\3\2\2\2\u057c"+
		"\u057e\5\u0084C\2\u057d\u057c\3\2\2\2\u057d\u057e\3\2\2\2\u057e\u0581"+
		"\3\2\2\2\u057f\u0580\7\u00a4\2\2\u0580\u0582\7\u00f2\2\2\u0581\u057f\3"+
		"\2\2\2\u0581\u0582\3\2\2\2\u0582\u0584\3\2\2\2\u0583\u0585\5T+\2\u0584"+
		"\u0583\3\2\2\2\u0584\u0585\3\2\2\2\u0585\u0588\3\2\2\2\u0586\u0587\7\24"+
		"\2\2\u0587\u0589\5\u0090I\2\u0588\u0586\3\2\2\2\u0588\u0589\3\2\2\2\u0589"+
		"\u05b7\3\2\2\2\u058a\u058e\7\r\2\2\u058b\u058d\5P)\2\u058c\u058b\3\2\2"+
		"\2\u058d\u0590\3\2\2\2\u058e\u058c\3\2\2\2\u058e\u058f\3\2\2\2\u058f\u0592"+
		"\3\2\2\2\u0590\u058e\3\2\2\2\u0591\u0593\5b\62\2\u0592\u0591\3\2\2\2\u0592"+
		"\u0593\3\2\2\2\u0593\u0594\3\2\2\2\u0594\u0596\5\u008cG\2\u0595\u0597"+
		"\5T+\2\u0596\u0595\3\2\2\2\u0596\u0597\3\2\2\2\u0597\u05a1\3\2\2\2\u0598"+
		"\u059e\5T+\2\u0599\u059b\7\r\2\2\u059a\u059c\5b\62\2\u059b\u059a\3\2\2"+
		"\2\u059b\u059c\3\2\2\2\u059c\u059d\3\2\2\2\u059d\u059f\5\u008cG\2\u059e"+
		"\u0599\3\2\2\2\u059e\u059f\3\2\2\2\u059f\u05a1\3\2\2\2\u05a0\u058a\3\2"+
		"\2\2\u05a0\u0598\3\2\2\2\u05a1\u05a5\3\2\2\2\u05a2\u05a4\5`\61\2\u05a3"+
		"\u05a2\3\2\2\2\u05a4\u05a7\3\2\2\2\u05a5\u05a3\3\2\2\2\u05a5\u05a6\3\2"+
		"\2\2\u05a6\u05aa\3\2\2\2\u05a7\u05a5\3\2\2\2\u05a8\u05a9\7\24\2\2\u05a9"+
		"\u05ab\5\u0090I\2\u05aa\u05a8\3\2\2\2\u05aa\u05ab\3\2\2\2\u05ab\u05ad"+
		"\3\2\2\2\u05ac\u05ae\5V,\2\u05ad\u05ac\3\2\2\2\u05ad\u05ae\3\2\2\2\u05ae"+
		"\u05b1\3\2\2\2\u05af\u05b0\7\34\2\2\u05b0\u05b2\5\u0090I\2\u05b1\u05af"+
		"\3\2\2\2\u05b1\u05b2\3\2\2\2\u05b2\u05b4\3\2\2\2\u05b3\u05b5\5\u00b6\\"+
		"\2\u05b4\u05b3\3\2\2\2\u05b4\u05b5\3\2\2\2\u05b5\u05b7\3\2\2\2\u05b6\u0563"+
		"\3\2\2\2\u05b6\u05a0\3\2\2\2\u05b7O\3\2\2\2\u05b8\u05b9\7\7\2\2\u05b9"+
		"\u05c0\5R*\2\u05ba\u05bc\7\5\2\2\u05bb\u05ba\3\2\2\2\u05bb\u05bc\3\2\2"+
		"\2\u05bc\u05bd\3\2\2\2\u05bd\u05bf\5R*\2\u05be\u05bb\3\2\2\2\u05bf\u05c2"+
		"\3\2\2\2\u05c0\u05be\3\2\2\2\u05c0\u05c1\3\2\2\2\u05c1\u05c3\3\2\2\2\u05c2"+
		"\u05c0\3\2\2\2\u05c3\u05c4\7\b\2\2\u05c4Q\3\2\2\2\u05c5\u05d3\5\u00c2"+
		"b\2\u05c6\u05c7\5\u00c2b\2\u05c7\u05c8\7\3\2\2\u05c8\u05cd\5\u0096L\2"+
		"\u05c9\u05ca\7\5\2\2\u05ca\u05cc\5\u0096L\2\u05cb\u05c9\3\2\2\2\u05cc"+
		"\u05cf\3\2\2\2\u05cd\u05cb\3\2\2\2\u05cd\u05ce\3\2\2\2\u05ce\u05d0\3\2"+
		"\2\2\u05cf\u05cd\3\2\2\2\u05d0\u05d1\7\4\2\2\u05d1\u05d3\3\2\2\2\u05d2"+
		"\u05c5\3\2\2\2\u05d2\u05c6\3\2\2\2\u05d3S\3\2\2\2\u05d4\u05d5\7\16\2\2"+
		"\u05d5\u05da\5d\63\2\u05d6\u05d7\7\5\2\2\u05d7\u05d9\5d\63\2\u05d8\u05d6"+
		"\3\2\2\2\u05d9\u05dc\3\2\2\2\u05da\u05d8\3\2\2\2\u05da\u05db\3\2\2\2\u05db"+
		"\u05e0\3\2\2\2\u05dc\u05da\3\2\2\2\u05dd\u05df\5`\61\2\u05de\u05dd\3\2"+
		"\2\2\u05df\u05e2\3\2\2\2\u05e0\u05de\3\2\2\2\u05e0\u05e1\3\2\2\2\u05e1"+
		"\u05e4\3\2\2\2\u05e2\u05e0\3\2\2\2\u05e3\u05e5\5Z.\2\u05e4\u05e3\3\2\2"+
		"\2\u05e4\u05e5\3\2\2\2\u05e5U\3\2\2\2\u05e6\u05e7\7\25\2\2\u05e7\u05e8"+
		"\7\26\2\2\u05e8\u05ed\5\u008eH\2\u05e9\u05ea\7\5\2\2\u05ea\u05ec\5\u008e"+
		"H\2\u05eb\u05e9\3\2\2\2\u05ec\u05ef\3\2\2\2\u05ed\u05eb\3\2\2\2\u05ed"+
		"\u05ee\3\2\2\2\u05ee\u0601\3\2\2\2\u05ef\u05ed\3\2\2\2\u05f0\u05f1\7O"+
		"\2\2\u05f1\u0602\7\32\2\2\u05f2\u05f3\7O\2\2\u05f3\u0602\7\31\2\2\u05f4"+
		"\u05f5\7\27\2\2\u05f5\u05f6\7\30\2\2\u05f6\u05f7\7\3\2\2\u05f7\u05fc\5"+
		"X-\2\u05f8\u05f9\7\5\2\2\u05f9\u05fb\5X-\2\u05fa\u05f8\3\2\2\2\u05fb\u05fe"+
		"\3\2\2\2\u05fc\u05fa\3\2\2\2\u05fc\u05fd\3\2\2\2\u05fd\u05ff\3\2\2\2\u05fe"+
		"\u05fc\3\2\2\2\u05ff\u0600\7\4\2\2\u0600\u0602\3\2\2\2\u0601\u05f0\3\2"+
		"\2\2\u0601\u05f2\3\2\2\2\u0601\u05f4\3\2\2\2\u0601\u0602\3\2\2\2\u0602"+
		"\u0613\3\2\2\2\u0603\u0604\7\25\2\2\u0604\u0605\7\26\2\2\u0605\u0606\7"+
		"\27\2\2\u0606\u0607\7\30\2\2\u0607\u0608\7\3\2\2\u0608\u060d\5X-\2\u0609"+
		"\u060a\7\5\2\2\u060a\u060c\5X-\2\u060b\u0609\3\2\2\2\u060c\u060f\3\2\2"+
		"\2\u060d\u060b\3\2\2\2\u060d\u060e\3\2\2\2\u060e\u0610\3\2\2\2\u060f\u060d"+
		"\3\2\2\2\u0610\u0611\7\4\2\2\u0611\u0613\3\2\2\2\u0612\u05e6\3\2\2\2\u0612"+
		"\u0603\3\2\2\2\u0613W\3\2\2\2\u0614\u061d\7\3\2\2\u0615\u061a\5\u008e"+
		"H\2\u0616\u0617\7\5\2\2\u0617\u0619\5\u008eH\2\u0618\u0616\3\2\2\2\u0619"+
		"\u061c\3\2\2\2\u061a\u0618\3\2\2\2\u061a\u061b\3\2\2\2\u061b\u061e\3\2"+
		"\2\2\u061c\u061a\3\2\2\2\u061d\u0615\3\2\2\2\u061d\u061e\3\2\2\2\u061e"+
		"\u061f\3\2\2\2\u061f\u0622\7\4\2\2\u0620\u0622\5\u008eH\2\u0621\u0614"+
		"\3\2\2\2\u0621\u0620\3\2\2\2\u0622Y\3\2\2\2\u0623\u0624\7@\2\2\u0624\u0625"+
		"\7\3\2\2\u0625\u0626\5\u008cG\2\u0626\u0627\7/\2\2\u0627\u0628\5\\/\2"+
		"\u0628\u0629\7!\2\2\u0629\u062a\7\3\2\2\u062a\u062f\5^\60\2\u062b\u062c"+
		"\7\5\2\2\u062c\u062e\5^\60\2\u062d\u062b\3\2\2\2\u062e\u0631\3\2\2\2\u062f"+
		"\u062d\3\2\2\2\u062f\u0630\3\2\2\2\u0630\u0632\3\2\2\2\u0631\u062f\3\2"+
		"\2\2\u0632\u0633\7\4\2\2\u0633\u0634\7\4\2\2\u0634[\3\2\2\2\u0635\u0642"+
		"\5\u00c2b\2\u0636\u0637\7\3\2\2\u0637\u063c\5\u00c2b\2\u0638\u0639\7\5"+
		"\2\2\u0639\u063b\5\u00c2b\2\u063a\u0638\3\2\2\2\u063b\u063e\3\2\2\2\u063c"+
		"\u063a\3\2\2\2\u063c\u063d\3\2\2\2\u063d\u063f\3\2\2\2\u063e\u063c\3\2"+
		"\2\2\u063f\u0640\7\4\2\2\u0640\u0642\3\2\2\2\u0641\u0635\3\2\2\2\u0641"+
		"\u0636\3\2\2\2\u0642]\3\2\2\2\u0643\u0648\5\u008eH\2\u0644\u0646\7\20"+
		"\2\2\u0645\u0644\3\2\2\2\u0645\u0646\3\2\2\2\u0646\u0647\3\2\2\2\u0647"+
		"\u0649\5\u00c2b\2\u0648\u0645\3\2\2\2\u0648\u0649\3\2\2\2\u0649_\3\2\2"+
		"\2\u064a\u064b\7A\2\2\u064b\u064d\7T\2\2\u064c\u064e\78\2\2\u064d\u064c"+
		"\3\2\2\2\u064d\u064e\3\2\2\2\u064e\u064f\3\2\2\2\u064f\u0650\5\u00c0a"+
		"\2\u0650\u0659\7\3\2\2\u0651\u0656\5\u008eH\2\u0652\u0653\7\5\2\2\u0653"+
		"\u0655\5\u008eH\2\u0654\u0652\3\2\2\2\u0655\u0658\3\2\2\2\u0656\u0654"+
		"\3\2\2\2\u0656\u0657\3\2\2\2\u0657\u065a\3\2\2\2\u0658\u0656\3\2\2\2\u0659"+
		"\u0651\3\2\2\2\u0659\u065a\3\2\2\2\u065a\u065b\3\2\2\2\u065b\u065c\7\4"+
		"\2\2\u065c\u0668\5\u00c2b\2\u065d\u065f\7\20\2\2\u065e\u065d\3\2\2\2\u065e"+
		"\u065f\3\2\2\2\u065f\u0660\3\2\2\2\u0660\u0665\5\u00c2b\2\u0661\u0662"+
		"\7\5\2\2\u0662\u0664\5\u00c2b\2\u0663\u0661\3\2\2\2\u0664\u0667\3\2\2"+
		"\2\u0665\u0663\3\2\2\2\u0665\u0666\3\2\2\2\u0666\u0669\3\2\2\2\u0667\u0665"+
		"\3\2\2\2\u0668\u065e\3\2\2\2\u0668\u0669\3\2\2\2\u0669a\3\2\2\2\u066a"+
		"\u066b\t\r\2\2\u066bc\3\2\2\2\u066c\u0670\5|?\2\u066d\u066f\5f\64\2\u066e"+
		"\u066d\3\2\2\2\u066f\u0672\3\2\2\2\u0670\u066e\3\2\2\2\u0670\u0671\3\2"+
		"\2\2\u0671e\3\2\2\2\u0672\u0670\3\2\2\2\u0673\u0674\5h\65\2\u0674\u0675"+
		"\7\66\2\2\u0675\u0677\5|?\2\u0676\u0678\5j\66\2\u0677\u0676\3\2\2\2\u0677"+
		"\u0678\3\2\2\2\u0678\u067f\3\2\2\2\u0679\u067a\7>\2\2\u067a\u067b\5h\65"+
		"\2\u067b\u067c\7\66\2\2\u067c\u067d\5|?\2\u067d\u067f\3\2\2\2\u067e\u0673"+
		"\3\2\2\2\u067e\u0679\3\2\2\2\u067fg\3\2\2\2\u0680\u0682\79\2\2\u0681\u0680"+
		"\3\2\2\2\u0681\u0682\3\2\2\2\u0682\u0697\3\2\2\2\u0683\u0697\7\67\2\2"+
		"\u0684\u0686\7:\2\2\u0685\u0687\78\2\2\u0686\u0685\3\2\2\2\u0686\u0687"+
		"\3\2\2\2\u0687\u0697\3\2\2\2\u0688\u0689\7:\2\2\u0689\u0697\7;\2\2\u068a"+
		"\u068c\7<\2\2\u068b\u068d\78\2\2\u068c\u068b\3\2\2\2\u068c\u068d\3\2\2"+
		"\2\u068d\u0697\3\2\2\2\u068e\u0690\7=\2\2\u068f\u0691\78\2\2\u0690\u068f"+
		"\3\2\2\2\u0690\u0691\3\2\2\2\u0691\u0697\3\2\2\2\u0692\u0694\7:\2\2\u0693"+
		"\u0692\3\2\2\2\u0693\u0694\3\2\2\2\u0694\u0695\3\2\2\2\u0695\u0697\7\u00ef"+
		"\2\2\u0696\u0681\3\2\2\2\u0696\u0683\3\2\2\2\u0696\u0684\3\2\2\2\u0696"+
		"\u0688\3\2\2\2\u0696\u068a\3\2\2\2\u0696\u068e\3\2\2\2\u0696\u0693\3\2"+
		"\2\2\u0697i\3\2\2\2\u0698\u0699\7?\2\2\u0699\u069d\5\u0090I\2\u069a\u069b"+
		"\7\u00a1\2\2\u069b\u069d\5p9\2\u069c\u0698\3\2\2\2\u069c\u069a\3\2\2\2"+
		"\u069dk\3\2\2\2\u069e\u069f\7m\2\2\u069f\u06a1\7\3\2\2\u06a0\u06a2\5n"+
		"8\2\u06a1\u06a0\3\2\2\2\u06a1\u06a2\3\2\2\2\u06a2\u06a3\3\2\2\2\u06a3"+
		"\u06a4\7\4\2\2\u06a4m\3\2\2\2\u06a5\u06a7\7\u008d\2\2\u06a6\u06a5\3\2"+
		"\2\2\u06a6\u06a7\3\2\2\2\u06a7\u06a8\3\2\2\2\u06a8\u06a9\t\16\2\2\u06a9"+
		"\u06be\7\u0097\2\2\u06aa\u06ab\5\u008eH\2\u06ab\u06ac\7F\2\2\u06ac\u06be"+
		"\3\2\2\2\u06ad\u06ae\7\u0098\2\2\u06ae\u06af\7\u00f6\2\2\u06af\u06b0\7"+
		"\u0099\2\2\u06b0\u06b1\7\u009a\2\2\u06b1\u06ba\7\u00f6\2\2\u06b2\u06b8"+
		"\7?\2\2\u06b3\u06b9\5\u00c2b\2\u06b4\u06b5\5\u00c0a\2\u06b5\u06b6\7\3"+
		"\2\2\u06b6\u06b7\7\4\2\2\u06b7\u06b9\3\2\2\2\u06b8\u06b3\3\2\2\2\u06b8"+
		"\u06b4\3\2\2\2\u06b9\u06bb\3\2\2\2\u06ba\u06b2\3\2\2\2\u06ba\u06bb\3\2"+
		"\2\2\u06bb\u06be\3\2\2\2\u06bc\u06be\5\u008eH\2\u06bd\u06a6\3\2\2\2\u06bd"+
		"\u06aa\3\2\2\2\u06bd\u06ad\3\2\2\2\u06bd\u06bc\3\2\2\2\u06beo\3\2\2\2"+
		"\u06bf\u06c0\7\3\2\2\u06c0\u06c1\5r:\2\u06c1\u06c2\7\4\2\2\u06c2q\3\2"+
		"\2\2\u06c3\u06c8\5\u00c2b\2\u06c4\u06c5\7\5\2\2\u06c5\u06c7\5\u00c2b\2"+
		"\u06c6\u06c4\3\2\2\2\u06c7\u06ca\3\2\2\2\u06c8\u06c6\3\2\2\2\u06c8\u06c9"+
		"\3\2\2\2\u06c9s\3\2\2\2\u06ca\u06c8\3\2\2\2\u06cb\u06cc\7\3\2\2\u06cc"+
		"\u06d1\5v<\2\u06cd\u06ce\7\5\2\2\u06ce\u06d0\5v<\2\u06cf\u06cd\3\2\2\2"+
		"\u06d0\u06d3\3\2\2\2\u06d1\u06cf\3\2\2\2\u06d1\u06d2\3\2\2\2\u06d2\u06d4"+
		"\3\2\2\2\u06d3\u06d1\3\2\2\2\u06d4\u06d5\7\4\2\2\u06d5u\3\2\2\2\u06d6"+
		"\u06d8\5\u00c2b\2\u06d7\u06d9\t\13\2\2\u06d8\u06d7\3\2\2\2\u06d8\u06d9"+
		"\3\2\2\2\u06d9w\3\2\2\2\u06da\u06db\7\3\2\2\u06db\u06e0\5z>\2\u06dc\u06dd"+
		"\7\5\2\2\u06dd\u06df\5z>\2\u06de\u06dc\3\2\2\2\u06df\u06e2\3\2\2\2\u06e0"+
		"\u06de\3\2\2\2\u06e0\u06e1\3\2\2\2\u06e1\u06e3\3\2\2\2\u06e2\u06e0\3\2"+
		"\2\2\u06e3\u06e4\7\4\2\2\u06e4y\3\2\2\2\u06e5\u06e8\5\u00c2b\2\u06e6\u06e7"+
		"\7t\2\2\u06e7\u06e9\7\u00f2\2\2\u06e8\u06e6\3\2\2\2\u06e8\u06e9\3\2\2"+
		"\2\u06e9{\3\2\2\2\u06ea\u06ec\5\u0086D\2\u06eb\u06ed\5l\67\2\u06ec\u06eb"+
		"\3\2\2\2\u06ec\u06ed\3\2\2\2\u06ed\u06ee\3\2\2\2\u06ee\u06ef\5\u0082B"+
		"\2\u06ef\u0703\3\2\2\2\u06f0\u06f1\7\3\2\2\u06f1\u06f2\5B\"\2\u06f2\u06f4"+
		"\7\4\2\2\u06f3\u06f5\5l\67\2\u06f4\u06f3\3\2\2\2\u06f4\u06f5\3\2\2\2\u06f5"+
		"\u06f6\3\2\2\2\u06f6\u06f7\5\u0082B\2\u06f7\u0703\3\2\2\2\u06f8\u06f9"+
		"\7\3\2\2\u06f9\u06fa\5d\63\2\u06fa\u06fc\7\4\2\2\u06fb\u06fd\5l\67\2\u06fc"+
		"\u06fb\3\2\2\2\u06fc\u06fd\3\2\2\2\u06fd\u06fe\3\2\2\2\u06fe\u06ff\5\u0082"+
		"B\2\u06ff\u0703\3\2\2\2\u0700\u0703\5~@\2\u0701\u0703\5\u0080A\2\u0702"+
		"\u06ea\3\2\2\2\u0702\u06f0\3\2\2\2\u0702\u06f8\3\2\2\2\u0702\u0700\3\2"+
		"\2\2\u0702\u0701\3\2\2\2\u0703}\3\2\2\2\u0704\u0705\7P\2\2\u0705\u070a"+
		"\5\u008eH\2\u0706\u0707\7\5\2\2\u0707\u0709\5\u008eH\2\u0708\u0706\3\2"+
		"\2\2\u0709\u070c\3\2\2\2\u070a\u0708\3\2\2\2\u070a\u070b\3\2\2\2\u070b"+
		"\u070d\3\2\2\2\u070c\u070a\3\2\2\2\u070d\u070e\5\u0082B\2\u070e\177\3"+
		"\2\2\2\u070f\u0710\5\u00c2b\2\u0710\u0719\7\3\2\2\u0711\u0716\5\u008e"+
		"H\2\u0712\u0713\7\5\2\2\u0713\u0715\5\u008eH\2\u0714\u0712\3\2\2\2\u0715"+
		"\u0718\3\2\2\2\u0716\u0714\3\2\2\2\u0716\u0717\3\2\2\2\u0717\u071a\3\2"+
		"\2\2\u0718\u0716\3\2\2\2\u0719\u0711\3\2\2\2\u0719\u071a\3\2\2\2\u071a"+
		"\u071b\3\2\2\2\u071b\u071c\7\4\2\2\u071c\u071d\5\u0082B\2\u071d\u0081"+
		"\3\2\2\2\u071e\u0720\7\20\2\2\u071f\u071e\3\2\2\2\u071f\u0720\3\2\2\2"+
		"\u0720\u0721\3\2\2\2\u0721\u0723\5\u00c4c\2\u0722\u0724\5p9\2\u0723\u0722"+
		"\3\2\2\2\u0723\u0724\3\2\2\2\u0724\u0726\3\2\2\2\u0725\u071f\3\2\2\2\u0725"+
		"\u0726\3\2\2\2\u0726\u0083\3\2\2\2\u0727\u0728\7N\2\2\u0728\u0729\7[\2"+
		"\2\u0729\u072a\7\u00a2\2\2\u072a\u072e\7\u00f2\2\2\u072b\u072c\7O\2\2"+
		"\u072c\u072d\7\u00a3\2\2\u072d\u072f\5.\30\2\u072e\u072b\3\2\2\2\u072e"+
		"\u072f\3\2\2\2\u072f\u0759\3\2\2\2\u0730\u0731\7N\2\2\u0731\u0732\7[\2"+
		"\2\u0732\u073c\7\u00a6\2\2\u0733\u0734\7\u00a7\2\2\u0734\u0735\7\u00a8"+
		"\2\2\u0735\u0736\7\26\2\2\u0736\u073a\7\u00f2\2\2\u0737\u0738\7\u00ac"+
		"\2\2\u0738\u0739\7\26\2\2\u0739\u073b\7\u00f2\2\2\u073a\u0737\3\2\2\2"+
		"\u073a\u073b\3\2\2\2\u073b\u073d\3\2\2\2\u073c\u0733\3\2\2\2\u073c\u073d"+
		"\3\2\2\2\u073d\u0743\3\2\2\2\u073e\u073f\7\u00a9\2\2\u073f\u0740\7\u00aa"+
		"\2\2\u0740\u0741\7\u00a8\2\2\u0741\u0742\7\26\2\2\u0742\u0744\7\u00f2"+
		"\2\2\u0743\u073e\3\2\2\2\u0743\u0744\3\2\2\2\u0744\u074a\3\2\2\2\u0745"+
		"\u0746\7r\2\2\u0746\u0747\7\u00ab\2\2\u0747\u0748\7\u00a8\2\2\u0748\u0749"+
		"\7\26\2\2\u0749\u074b\7\u00f2\2\2\u074a\u0745\3\2\2\2\u074a\u074b\3\2"+
		"\2\2\u074b\u0750\3\2\2\2\u074c\u074d\7\u00ad\2\2\u074d\u074e\7\u00a8\2"+
		"\2\u074e\u074f\7\26\2\2\u074f\u0751\7\u00f2\2\2\u0750\u074c\3\2\2\2\u0750"+
		"\u0751\3\2\2\2\u0751\u0756\3\2\2\2\u0752\u0753\7)\2\2\u0753\u0754\7\u00db"+
		"\2\2\u0754\u0755\7\20\2\2\u0755\u0757\7\u00f2\2\2\u0756\u0752\3\2\2\2"+
		"\u0756\u0757\3\2\2\2\u0757\u0759\3\2\2\2\u0758\u0727\3\2\2\2\u0758\u0730"+
		"\3\2\2\2\u0759\u0085\3\2\2\2\u075a\u075b\5\u00c2b\2\u075b\u075c\7\6\2"+
		"\2\u075c\u075e\3\2\2\2\u075d\u075a\3\2\2\2\u075d\u075e\3\2\2\2\u075e\u075f"+
		"\3\2\2\2\u075f\u0760\5\u00c2b\2\u0760\u0087\3\2\2\2\u0761\u0762\5\u00c2"+
		"b\2\u0762\u0763\7\6\2\2\u0763\u0765\3\2\2\2\u0764\u0761\3\2\2\2\u0764"+
		"\u0765\3\2\2\2\u0765\u0766\3\2\2\2\u0766\u0767\5\u00c2b\2\u0767\u0089"+
		"\3\2\2\2\u0768\u0770\5\u008eH\2\u0769\u076b\7\20\2\2\u076a\u0769\3\2\2"+
		"\2\u076a\u076b\3\2\2\2\u076b\u076e\3\2\2\2\u076c\u076f\5\u00c2b\2\u076d"+
		"\u076f\5p9\2\u076e\u076c\3\2\2\2\u076e\u076d\3\2\2\2\u076f\u0771\3\2\2"+
		"\2\u0770\u076a\3\2\2\2\u0770\u0771\3\2\2\2\u0771\u008b\3\2\2\2\u0772\u0777"+
		"\5\u008aF\2\u0773\u0774\7\5\2\2\u0774\u0776\5\u008aF\2\u0775\u0773\3\2"+
		"\2\2\u0776\u0779\3\2\2\2\u0777\u0775\3\2\2\2\u0777\u0778\3\2\2\2\u0778"+
		"\u008d\3\2\2\2\u0779\u0777\3\2\2\2\u077a\u077b\5\u0090I\2\u077b\u008f"+
		"\3\2\2\2\u077c\u077d\bI\1\2\u077d\u077e\7\"\2\2\u077e\u0789\5\u0090I\7"+
		"\u077f\u0780\7$\2\2\u0780\u0781\7\3\2\2\u0781\u0782\5\32\16\2\u0782\u0783"+
		"\7\4\2\2\u0783\u0789\3\2\2\2\u0784\u0786\5\u0094K\2\u0785\u0787\5\u0092"+
		"J\2\u0786\u0785\3\2\2\2\u0786\u0787\3\2\2\2\u0787\u0789\3\2\2\2\u0788"+
		"\u077c\3\2\2\2\u0788\u077f\3\2\2\2\u0788\u0784\3\2\2\2\u0789\u0792\3\2"+
		"\2\2\u078a\u078b\f\4\2\2\u078b\u078c\7 \2\2\u078c\u0791\5\u0090I\5\u078d"+
		"\u078e\f\3\2\2\u078e\u078f\7\37\2\2\u078f\u0791\5\u0090I\4\u0790\u078a"+
		"\3\2\2\2\u0790\u078d\3\2\2\2\u0791\u0794\3\2\2\2\u0792\u0790\3\2\2\2\u0792"+
		"\u0793\3\2\2\2\u0793\u0091\3\2\2\2\u0794\u0792\3\2\2\2\u0795\u0797\7\""+
		"\2\2\u0796\u0795\3\2\2\2\u0796\u0797\3\2\2\2\u0797\u0798\3\2\2\2\u0798"+
		"\u0799\7%\2\2\u0799\u079a\5\u0094K\2\u079a\u079b\7 \2\2\u079b\u079c\5"+
		"\u0094K\2\u079c\u07c6\3\2\2\2\u079d\u079f\7\"\2\2\u079e\u079d\3\2\2\2"+
		"\u079e\u079f\3\2\2\2\u079f\u07a0\3\2\2\2\u07a0\u07a1\7!\2\2\u07a1\u07a2"+
		"\7\3\2\2\u07a2\u07a7\5\u008eH\2\u07a3\u07a4\7\5\2\2\u07a4\u07a6\5\u008e"+
		"H\2\u07a5\u07a3\3\2\2\2\u07a6\u07a9\3\2\2\2\u07a7\u07a5\3\2\2\2\u07a7"+
		"\u07a8\3\2\2\2\u07a8\u07aa\3\2\2\2\u07a9\u07a7\3\2\2\2\u07aa\u07ab\7\4"+
		"\2\2\u07ab\u07c6\3\2\2\2\u07ac\u07ae\7\"\2\2\u07ad\u07ac\3\2\2\2\u07ad"+
		"\u07ae\3\2\2\2\u07ae\u07af\3\2\2\2\u07af\u07b0\7!\2\2\u07b0\u07b1\7\3"+
		"\2\2\u07b1\u07b2\5\32\16\2\u07b2\u07b3\7\4\2\2\u07b3\u07c6\3\2\2\2\u07b4"+
		"\u07b6\7\"\2\2\u07b5\u07b4\3\2\2\2\u07b5\u07b6\3\2\2\2\u07b6\u07b7\3\2"+
		"\2\2\u07b7\u07b8\t\17\2\2\u07b8\u07c6\5\u0094K\2\u07b9\u07bb\7(\2\2\u07ba"+
		"\u07bc\7\"\2\2\u07bb\u07ba\3\2\2\2\u07bb\u07bc\3\2\2\2\u07bc\u07bd\3\2"+
		"\2\2\u07bd\u07c6\7)\2\2\u07be\u07c0\7(\2\2\u07bf\u07c1\7\"\2\2\u07c0\u07bf"+
		"\3\2\2\2\u07c0\u07c1\3\2\2\2\u07c1\u07c2\3\2\2\2\u07c2\u07c3\7\23\2\2"+
		"\u07c3\u07c4\7\16\2\2\u07c4\u07c6\5\u0094K\2\u07c5\u0796\3\2\2\2\u07c5"+
		"\u079e\3\2\2\2\u07c5\u07ad\3\2\2\2\u07c5\u07b5\3\2\2\2\u07c5\u07b9\3\2"+
		"\2\2\u07c5\u07be\3\2\2\2\u07c6\u0093\3\2\2\2\u07c7\u07c8\bK\1\2\u07c8"+
		"\u07cc\5\u0096L\2\u07c9\u07ca\t\20\2\2\u07ca\u07cc\5\u0094K\t\u07cb\u07c7"+
		"\3\2\2\2\u07cb\u07c9\3\2\2\2\u07cc\u07e2\3\2\2\2\u07cd\u07ce\f\b\2\2\u07ce"+
		"\u07cf\t\21\2\2\u07cf\u07e1\5\u0094K\t\u07d0\u07d1\f\7\2\2\u07d1\u07d2"+
		"\t\22\2\2\u07d2\u07e1\5\u0094K\b\u07d3\u07d4\f\6\2\2\u07d4\u07d5\7\u0093"+
		"\2\2\u07d5\u07e1\5\u0094K\7\u07d6\u07d7\f\5\2\2\u07d7\u07d8\7\u0096\2"+
		"\2\u07d8\u07e1\5\u0094K\6\u07d9\u07da\f\4\2\2\u07da\u07db\7\u0094\2\2"+
		"\u07db\u07e1\5\u0094K\5\u07dc\u07dd\f\3\2\2\u07dd\u07de\5\u009aN\2\u07de"+
		"\u07df\5\u0094K\4\u07df\u07e1\3\2\2\2\u07e0\u07cd\3\2\2\2\u07e0\u07d0"+
		"\3\2\2\2\u07e0\u07d3\3\2\2\2\u07e0\u07d6\3\2\2\2\u07e0\u07d9\3\2\2\2\u07e0"+
		"\u07dc\3\2\2\2\u07e1\u07e4\3\2\2\2\u07e2\u07e0\3\2\2\2\u07e2\u07e3\3\2"+
		"\2\2\u07e3\u0095\3\2\2\2\u07e4\u07e2\3\2\2\2\u07e5\u07e6\bL\1\2\u07e6"+
		"\u07e8\7\61\2\2\u07e7\u07e9\5\u00b4[\2\u07e8\u07e7\3\2\2\2\u07e9\u07ea"+
		"\3\2\2\2\u07ea\u07e8\3\2\2\2\u07ea\u07eb\3\2\2\2\u07eb\u07ee\3\2\2\2\u07ec"+
		"\u07ed\7\64\2\2\u07ed\u07ef\5\u008eH\2\u07ee\u07ec\3\2\2\2\u07ee\u07ef"+
		"\3\2\2\2\u07ef\u07f0\3\2\2\2\u07f0\u07f1\7\65\2\2\u07f1\u0877\3\2\2\2"+
		"\u07f2\u07f3\7\61\2\2\u07f3\u07f5\5\u008eH\2\u07f4\u07f6\5\u00b4[\2\u07f5"+
		"\u07f4\3\2\2\2\u07f6\u07f7\3\2\2\2\u07f7\u07f5\3\2\2\2\u07f7\u07f8\3\2"+
		"\2\2\u07f8\u07fb\3\2\2\2\u07f9\u07fa\7\64\2\2\u07fa\u07fc\5\u008eH\2\u07fb"+
		"\u07f9\3\2\2\2\u07fb\u07fc\3\2\2\2\u07fc\u07fd\3\2\2\2\u07fd\u07fe\7\65"+
		"\2\2\u07fe\u0877\3\2\2\2\u07ff\u0800\7_\2\2\u0800\u0801\7\3\2\2\u0801"+
		"\u0802\5\u008eH\2\u0802\u0803\7\20\2\2\u0803\u0804\5\u00aaV\2\u0804\u0805"+
		"\7\4\2\2\u0805\u0877\3\2\2\2\u0806\u0807\7s\2\2\u0807\u0810\7\3\2\2\u0808"+
		"\u080d\5\u008aF\2\u0809\u080a\7\5\2\2\u080a\u080c\5\u008aF\2\u080b\u0809"+
		"\3\2\2\2\u080c\u080f\3\2\2\2\u080d\u080b\3\2\2\2\u080d\u080e\3\2\2\2\u080e"+
		"\u0811\3\2\2\2\u080f\u080d\3\2\2\2\u0810\u0808\3\2\2\2\u0810\u0811\3\2"+
		"\2\2\u0811\u0812\3\2\2\2\u0812\u0877\7\4\2\2\u0813\u0814\7K\2\2\u0814"+
		"\u0815\7\3\2\2\u0815\u0818\5\u008eH\2\u0816\u0817\7}\2\2\u0817\u0819\7"+
		",\2\2\u0818\u0816\3\2\2\2\u0818\u0819\3\2\2\2\u0819\u081a\3\2\2\2\u081a"+
		"\u081b\7\4\2\2\u081b\u0877\3\2\2\2\u081c\u081d\7M\2\2\u081d\u081e\7\3"+
		"\2\2\u081e\u0821\5\u008eH\2\u081f\u0820\7}\2\2\u0820\u0822\7,\2\2\u0821"+
		"\u081f\3\2\2\2\u0821\u0822\3\2\2\2\u0822\u0823\3\2\2\2\u0823\u0824\7\4"+
		"\2\2\u0824\u0877\3\2\2\2\u0825\u0826\7\u0082\2\2\u0826\u0827\7\3\2\2\u0827"+
		"\u0828\5\u0094K\2\u0828\u0829\7!\2\2\u0829\u082a\5\u0094K\2\u082a\u082b"+
		"\7\4\2\2\u082b\u0877\3\2\2\2\u082c\u0877\5\u0098M\2\u082d\u0877\7\u008e"+
		"\2\2\u082e\u082f\5\u00c0a\2\u082f\u0830\7\6\2\2\u0830\u0831\7\u008e\2"+
		"\2\u0831\u0877\3\2\2\2\u0832\u0833\7\3\2\2\u0833\u0836\5\u008aF\2\u0834"+
		"\u0835\7\5\2\2\u0835\u0837\5\u008aF\2\u0836\u0834\3\2\2\2\u0837\u0838"+
		"\3\2\2\2\u0838\u0836\3\2\2\2\u0838\u0839\3\2\2\2\u0839\u083a\3\2\2\2\u083a"+
		"\u083b\7\4\2\2\u083b\u0877\3\2\2\2\u083c\u083d\7\3\2\2\u083d\u083e\5\32"+
		"\16\2\u083e\u083f\7\4\2\2\u083f\u0877\3\2\2\2\u0840\u0841\5\u00c0a\2\u0841"+
		"\u084d\7\3\2\2\u0842\u0844\5b\62\2\u0843\u0842\3\2\2\2\u0843\u0844\3\2"+
		"\2\2\u0844\u0845\3\2\2\2\u0845\u084a\5\u008eH\2\u0846\u0847\7\5\2\2\u0847"+
		"\u0849\5\u008eH\2\u0848\u0846\3\2\2\2\u0849\u084c\3\2\2\2\u084a\u0848"+
		"\3\2\2\2\u084a\u084b\3\2\2\2\u084b\u084e\3\2\2\2\u084c\u084a\3\2\2\2\u084d"+
		"\u0843\3\2\2\2\u084d\u084e\3\2\2\2\u084e\u084f\3\2\2\2\u084f\u0852\7\4"+
		"\2\2\u0850\u0851\7C\2\2\u0851\u0853\5\u00ba^\2\u0852\u0850\3\2\2\2\u0852"+
		"\u0853\3\2\2\2\u0853\u0877\3\2\2\2\u0854\u0855\5\u00c0a\2\u0855\u0856"+
		"\7\3\2\2\u0856\u0857\t\23\2\2\u0857\u0858\5\u008eH\2\u0858\u0859\7\16"+
		"\2\2\u0859\u085a\5\u008eH\2\u085a\u085b\7\4\2\2\u085b\u0877\3\2\2\2\u085c"+
		"\u085d\7\u00fa\2\2\u085d\u085e\7\t\2\2\u085e\u0877\5\u008eH\2\u085f\u0860"+
		"\7\3\2\2\u0860\u0863\7\u00fa\2\2\u0861\u0862\7\5\2\2\u0862\u0864\7\u00fa"+
		"\2\2\u0863\u0861\3\2\2\2\u0864\u0865\3\2\2\2\u0865\u0863\3\2\2\2\u0865"+
		"\u0866\3\2\2\2\u0866\u0867\3\2\2\2\u0867\u0868\7\4\2\2\u0868\u0869\7\t"+
		"\2\2\u0869\u0877\5\u008eH\2\u086a\u0877\5\u00c2b\2\u086b\u086c\7\3\2\2"+
		"\u086c\u086d\5\u008eH\2\u086d\u086e\7\4\2\2\u086e\u0877\3\2\2\2\u086f"+
		"\u0870\7\u0083\2\2\u0870\u0871\7\3\2\2\u0871\u0872\5\u00c2b\2\u0872\u0873"+
		"\7\16\2\2\u0873\u0874\5\u0094K\2\u0874\u0875\7\4\2\2\u0875\u0877\3\2\2"+
		"\2\u0876\u07e5\3\2\2\2\u0876\u07f2\3\2\2\2\u0876\u07ff\3\2\2\2\u0876\u0806"+
		"\3\2\2\2\u0876\u0813\3\2\2\2\u0876\u081c\3\2\2\2\u0876\u0825\3\2\2\2\u0876"+
		"\u082c\3\2\2\2\u0876\u082d\3\2\2\2\u0876\u082e\3\2\2\2\u0876\u0832\3\2"+
		"\2\2\u0876\u083c\3\2\2\2\u0876\u0840\3\2\2\2\u0876\u0854\3\2\2\2\u0876"+
		"\u085c\3\2\2\2\u0876\u085f\3\2\2\2\u0876\u086a\3\2\2\2\u0876\u086b\3\2"+
		"\2\2\u0876\u086f\3\2\2\2\u0877\u0882\3\2\2\2\u0878\u0879\f\7\2\2\u0879"+
		"\u087a\7\n\2\2\u087a\u087b\5\u0094K\2\u087b\u087c\7\13\2\2\u087c\u0881"+
		"\3\2\2\2\u087d\u087e\f\5\2\2\u087e\u087f\7\6\2\2\u087f\u0881\5\u00c2b"+
		"\2\u0880\u0878\3\2\2\2\u0880\u087d\3\2\2\2\u0881\u0884\3\2\2\2\u0882\u0880"+
		"\3\2\2\2\u0882\u0883\3\2\2\2\u0883\u0097\3\2\2\2\u0884\u0882\3\2\2\2\u0885"+
		"\u0892\7)\2\2\u0886\u0892\5\u00a2R\2\u0887\u0888\5\u00c2b\2\u0888\u0889"+
		"\7\u00f2\2\2\u0889\u0892\3\2\2\2\u088a\u0892\5\u00c8e\2\u088b\u0892\5"+
		"\u00a0Q\2\u088c\u088e\7\u00f2\2\2\u088d\u088c\3\2\2\2\u088e\u088f\3\2"+
		"\2\2\u088f\u088d\3\2\2\2\u088f\u0890\3\2\2\2\u0890\u0892\3\2\2\2\u0891"+
		"\u0885\3\2\2\2\u0891\u0886\3\2\2\2\u0891\u0887\3\2\2\2\u0891\u088a\3\2"+
		"\2\2\u0891\u088b\3\2\2\2\u0891\u088d\3\2\2\2\u0892\u0099\3\2\2\2\u0893"+
		"\u0894\t\24\2\2\u0894\u009b\3\2\2\2\u0895\u0896\t\25\2\2\u0896\u009d\3"+
		"\2\2\2\u0897\u0898\t\26\2\2\u0898\u009f\3\2\2\2\u0899\u089a\t\27\2\2\u089a"+
		"\u00a1\3\2\2\2\u089b\u089f\7\60\2\2\u089c\u089e\5\u00a4S\2\u089d\u089c"+
		"\3\2\2\2\u089e\u08a1\3\2\2\2\u089f\u089d\3\2\2\2\u089f\u08a0\3\2\2\2\u08a0"+
		"\u00a3\3\2\2\2\u08a1\u089f\3\2\2\2\u08a2\u08a3\5\u00a6T\2\u08a3\u08a6"+
		"\5\u00c2b\2\u08a4\u08a5\7l\2\2\u08a5\u08a7\5\u00c2b\2\u08a6\u08a4\3\2"+
		"\2\2\u08a6\u08a7\3\2\2\2\u08a7\u00a5\3\2\2\2\u08a8\u08aa\t\30\2\2\u08a9"+
		"\u08a8\3\2\2\2\u08a9\u08aa\3\2\2\2\u08aa\u08ab\3\2\2\2\u08ab\u08ae\t\16"+
		"\2\2\u08ac\u08ae\7\u00f2\2\2\u08ad\u08a9\3\2\2\2\u08ad\u08ac\3\2\2\2\u08ae"+
		"\u00a7\3\2\2\2\u08af\u08b3\7K\2\2\u08b0\u08b1\7L\2\2\u08b1\u08b3\5\u00c2"+
		"b\2\u08b2\u08af\3\2\2\2\u08b2\u08b0\3\2\2\2\u08b3\u00a9\3\2\2\2\u08b4"+
		"\u08b5\7q\2\2\u08b5\u08b6\7\u0088\2\2\u08b6\u08b7\5\u00aaV\2\u08b7\u08b8"+
		"\7\u008a\2\2\u08b8\u08d7\3\2\2\2\u08b9\u08ba\7r\2\2\u08ba\u08bb\7\u0088"+
		"\2\2\u08bb\u08bc\5\u00aaV\2\u08bc\u08bd\7\5\2\2\u08bd\u08be\5\u00aaV\2"+
		"\u08be\u08bf\7\u008a\2\2\u08bf\u08d7\3\2\2\2\u08c0\u08c7\7s\2\2\u08c1"+
		"\u08c3\7\u0088\2\2\u08c2\u08c4\5\u00b0Y\2\u08c3\u08c2\3\2\2\2\u08c3\u08c4"+
		"\3\2\2\2\u08c4\u08c5\3\2\2\2\u08c5\u08c8\7\u008a\2\2\u08c6\u08c8\7\u0086"+
		"\2\2\u08c7\u08c1\3\2\2\2\u08c7\u08c6\3\2\2\2\u08c8\u08d7\3\2\2\2\u08c9"+
		"\u08d4\5\u00c2b\2\u08ca\u08cb\7\3\2\2\u08cb\u08d0\7\u00f6\2\2\u08cc\u08cd"+
		"\7\5\2\2\u08cd\u08cf\7\u00f6\2\2\u08ce\u08cc\3\2\2\2\u08cf\u08d2\3\2\2"+
		"\2\u08d0\u08ce\3\2\2\2\u08d0\u08d1\3\2\2\2\u08d1\u08d3\3\2\2\2\u08d2\u08d0"+
		"\3\2\2\2\u08d3\u08d5\7\4\2\2\u08d4\u08ca\3\2\2\2\u08d4\u08d5\3\2\2\2\u08d5"+
		"\u08d7\3\2\2\2\u08d6\u08b4\3\2\2\2\u08d6\u08b9\3\2\2\2\u08d6\u08c0\3\2"+
		"\2\2\u08d6\u08c9\3\2\2\2\u08d7\u00ab\3\2\2\2\u08d8\u08dd\5\u00aeX\2\u08d9"+
		"\u08da\7\5\2\2\u08da\u08dc\5\u00aeX\2\u08db\u08d9\3\2\2\2\u08dc\u08df"+
		"\3\2\2\2\u08dd\u08db\3\2\2\2\u08dd\u08de\3\2\2\2\u08de\u00ad\3\2\2\2\u08df"+
		"\u08dd\3\2\2\2\u08e0\u08e1\5\u00c2b\2\u08e1\u08e4\5\u00aaV\2\u08e2\u08e3"+
		"\7t\2\2\u08e3\u08e5\7\u00f2\2\2\u08e4\u08e2\3\2\2\2\u08e4\u08e5\3\2\2"+
		"\2\u08e5\u00af\3\2\2\2\u08e6\u08eb\5\u00b2Z\2\u08e7\u08e8\7\5\2\2\u08e8"+
		"\u08ea\5\u00b2Z\2\u08e9\u08e7\3\2\2\2\u08ea\u08ed\3\2\2\2\u08eb\u08e9"+
		"\3\2\2\2\u08eb\u08ec\3\2\2\2\u08ec\u00b1\3\2\2\2\u08ed\u08eb\3\2\2\2\u08ee"+
		"\u08ef\5\u00c2b\2\u08ef\u08f0\7\f\2\2\u08f0\u08f3\5\u00aaV\2\u08f1\u08f2"+
		"\7t\2\2\u08f2\u08f4\7\u00f2\2\2\u08f3\u08f1\3\2\2\2\u08f3\u08f4\3\2\2"+
		"\2\u08f4\u00b3\3\2\2\2\u08f5\u08f6\7\62\2\2\u08f6\u08f7\5\u008eH\2\u08f7"+
		"\u08f8\7\63\2\2\u08f8\u08f9\5\u008eH\2\u08f9\u00b5\3\2\2\2\u08fa\u08fb"+
		"\7B\2\2\u08fb\u0900\5\u00b8]\2\u08fc\u08fd\7\5\2\2\u08fd\u08ff\5\u00b8"+
		"]\2\u08fe\u08fc\3\2\2\2\u08ff\u0902\3\2\2\2\u0900\u08fe\3\2\2\2\u0900"+
		"\u0901\3\2\2\2\u0901\u00b7\3\2\2\2\u0902\u0900\3\2\2\2\u0903\u0904\5\u00c2"+
		"b\2\u0904\u0905\7\20\2\2\u0905\u0906\5\u00ba^\2\u0906\u00b9\3\2\2\2\u0907"+
		"\u0932\5\u00c2b\2\u0908\u092b\7\3\2\2\u0909\u090a\7\u009c\2\2\u090a\u090b"+
		"\7\26\2\2\u090b\u0910\5\u008eH\2\u090c\u090d\7\5\2\2\u090d\u090f\5\u008e"+
		"H\2\u090e\u090c\3\2\2\2\u090f\u0912\3\2\2\2\u0910\u090e\3\2\2\2\u0910"+
		"\u0911\3\2\2\2\u0911\u092c\3\2\2\2\u0912\u0910\3\2\2\2\u0913\u0914\t\31"+
		"\2\2\u0914\u0915\7\26\2\2\u0915\u091a\5\u008eH\2\u0916\u0917\7\5\2\2\u0917"+
		"\u0919\5\u008eH\2\u0918\u0916\3\2\2\2\u0919\u091c\3\2\2\2\u091a\u0918"+
		"\3\2\2\2\u091a\u091b\3\2\2\2\u091b\u091e\3\2\2\2\u091c\u091a\3\2\2\2\u091d"+
		"\u0913\3\2\2\2\u091d\u091e\3\2\2\2\u091e\u0929\3\2\2\2\u091f\u0920\t\32"+
		"\2\2\u0920\u0921\7\26\2\2\u0921\u0926\5L\'\2\u0922\u0923\7\5\2\2\u0923"+
		"\u0925\5L\'\2\u0924\u0922\3\2\2\2\u0925\u0928\3\2\2\2\u0926\u0924\3\2"+
		"\2\2\u0926\u0927\3\2\2\2\u0927\u092a\3\2\2\2\u0928\u0926\3\2\2\2\u0929"+
		"\u091f";
	private static final String _serializedATNSegment1 =
		"\3\2\2\2\u0929\u092a\3\2\2\2\u092a\u092c\3\2\2\2\u092b\u0909\3\2\2\2\u092b"+
		"\u091d\3\2\2\2\u092c\u092e\3\2\2\2\u092d\u092f\5\u00bc_\2\u092e\u092d"+
		"\3\2\2\2\u092e\u092f\3\2\2\2\u092f\u0930\3\2\2\2\u0930\u0932\7\4\2\2\u0931"+
		"\u0907\3\2\2\2\u0931\u0908\3\2\2\2\u0932\u00bb\3\2\2\2\u0933\u0934\7E"+
		"\2\2\u0934\u0944\5\u00be`\2\u0935\u0936\7F\2\2\u0936\u0944\5\u00be`\2"+
		"\u0937\u0938\7E\2\2\u0938\u0939\7%\2\2\u0939\u093a\5\u00be`\2\u093a\u093b"+
		"\7 \2\2\u093b\u093c\5\u00be`\2\u093c\u0944\3\2\2\2\u093d\u093e\7F\2\2"+
		"\u093e\u093f\7%\2\2\u093f\u0940\5\u00be`\2\u0940\u0941\7 \2\2\u0941\u0942"+
		"\5\u00be`\2\u0942\u0944\3\2\2\2\u0943\u0933\3\2\2\2\u0943\u0935\3\2\2"+
		"\2\u0943\u0937\3\2\2\2\u0943\u093d\3\2\2\2\u0944\u00bd\3\2\2\2\u0945\u0946"+
		"\7G\2\2\u0946\u094d\t\33\2\2\u0947\u0948\7J\2\2\u0948\u094d\7N\2\2\u0949"+
		"\u094a\5\u008eH\2\u094a\u094b\t\33\2\2\u094b\u094d\3\2\2\2\u094c\u0945"+
		"\3\2\2\2\u094c\u0947\3\2\2\2\u094c\u0949\3\2\2\2\u094d\u00bf\3\2\2\2\u094e"+
		"\u0953\5\u00c2b\2\u094f\u0950\7\6\2\2\u0950\u0952\5\u00c2b\2\u0951\u094f"+
		"\3\2\2\2\u0952\u0955\3\2\2\2\u0953\u0951\3\2\2\2\u0953\u0954\3\2\2\2\u0954"+
		"\u00c1\3\2\2\2\u0955\u0953\3\2\2\2\u0956\u0966\5\u00c4c\2\u0957\u0966"+
		"\7\u00ef\2\2\u0958\u0966\7=\2\2\u0959\u0966\79\2\2\u095a\u0966\7:\2\2"+
		"\u095b\u0966\7;\2\2\u095c\u0966\7<\2\2\u095d\u0966\7>\2\2\u095e\u0966"+
		"\7\66\2\2\u095f\u0966\7\67\2\2\u0960\u0966\7?\2\2\u0961\u0966\7h\2\2\u0962"+
		"\u0966\7k\2\2\u0963\u0966\7i\2\2\u0964\u0966\7j\2\2\u0965\u0956\3\2\2"+
		"\2\u0965\u0957\3\2\2\2\u0965\u0958\3\2\2\2\u0965\u0959\3\2\2\2\u0965\u095a"+
		"\3\2\2\2\u0965\u095b\3\2\2\2\u0965\u095c\3\2\2\2\u0965\u095d\3\2\2\2\u0965"+
		"\u095e\3\2\2\2\u0965\u095f\3\2\2\2\u0965\u0960\3\2\2\2\u0965\u0961\3\2"+
		"\2\2\u0965\u0962\3\2\2\2\u0965\u0963\3\2\2\2\u0965\u0964\3\2\2\2\u0966"+
		"\u00c3\3\2\2\2\u0967\u096b\7\u00fa\2\2\u0968\u096b\5\u00c6d\2\u0969\u096b"+
		"\5\u00caf\2\u096a\u0967\3\2\2\2\u096a\u0968\3\2\2\2\u096a\u0969\3\2\2"+
		"\2\u096b\u00c5\3\2\2\2\u096c\u096d\7\u00fb\2\2\u096d\u00c7\3\2\2\2\u096e"+
		"\u0970\7\u008d\2\2\u096f\u096e\3\2\2\2\u096f\u0970\3\2\2\2\u0970\u0971"+
		"\3\2\2\2\u0971\u098b\7\u00f7\2\2\u0972\u0974\7\u008d\2\2\u0973\u0972\3"+
		"\2\2\2\u0973\u0974\3\2\2\2\u0974\u0975\3\2\2\2\u0975\u098b\7\u00f6\2\2"+
		"\u0976\u0978\7\u008d\2\2\u0977\u0976\3\2\2\2\u0977\u0978\3\2\2\2\u0978"+
		"\u0979\3\2\2\2\u0979\u098b\7\u00f3\2\2\u097a\u097c\7\u008d\2\2\u097b\u097a"+
		"\3\2\2\2\u097b\u097c\3\2\2\2\u097c\u097d\3\2\2\2\u097d\u098b\7\u00f4\2"+
		"\2\u097e\u0980\7\u008d\2\2\u097f\u097e\3\2\2\2\u097f\u0980\3\2\2\2\u0980"+
		"\u0981\3\2\2\2\u0981\u098b\7\u00f5\2\2\u0982\u0984\7\u008d\2\2\u0983\u0982"+
		"\3\2\2\2\u0983\u0984\3\2\2\2\u0984\u0985\3\2\2\2\u0985\u098b\7\u00f8\2"+
		"\2\u0986\u0988\7\u008d\2\2\u0987\u0986\3\2\2\2\u0987\u0988\3\2\2\2\u0988"+
		"\u0989\3\2\2\2\u0989\u098b\7\u00f9\2\2\u098a\u096f\3\2\2\2\u098a\u0973"+
		"\3\2\2\2\u098a\u0977\3\2\2\2\u098a\u097b\3\2\2\2\u098a\u097f\3\2\2\2\u098a"+
		"\u0983\3\2\2\2\u098a\u0987\3\2\2\2\u098b\u00c9\3\2\2\2\u098c\u098d\t\34"+
		"\2\2\u098d\u00cb\3\2\2\2\u0148\u00e6\u00eb\u00ee\u00f3\u0100\u0104\u010b"+
		"\u0119\u011b\u011f\u0122\u0129\u013a\u013c\u0140\u0143\u014a\u0150\u0156"+
		"\u0161\u0181\u0189\u018d\u0192\u0198\u01a0\u01a6\u01b3\u01b8\u01c1\u01c6"+
		"\u01d6\u01dd\u01e1\u01e9\u01f0\u01f7\u0206\u020a\u0210\u0216\u0219\u021c"+
		"\u0222\u0226\u022a\u022f\u0233\u023b\u023e\u0247\u024c\u0252\u0259\u025c"+
		"\u0262\u026d\u0270\u0274\u0279\u027e\u0285\u0288\u028b\u0292\u0297\u029c"+
		"\u029f\u02a8\u02b0\u02b6\u02ba\u02be\u02c2\u02c4\u02cd\u02d3\u02d8\u02db"+
		"\u02df\u02e2\u02ec\u02ef\u02f3\u02f9\u02fc\u02ff\u0305\u030d\u0312\u0318"+
		"\u031e\u0329\u0331\u0338\u0340\u0343\u034b\u034f\u0356\u03ca\u03d2\u03da"+
		"\u03e3\u03ef\u03f3\u03f6\u03fc\u0406\u0412\u0417\u041d\u0429\u042b\u0430"+
		"\u0434\u0439\u043e\u0441\u0446\u044a\u044f\u0451\u0455\u045e\u0466\u046d"+
		"\u0474\u047d\u0482\u0491\u0498\u049b\u04a2\u04a6\u04ac\u04b4\u04bf\u04ca"+
		"\u04d1\u04d7\u04dd\u04e6\u04e8\u04f1\u04f4\u04fd\u0500\u0509\u050c\u0515"+
		"\u0518\u051b\u0520\u0522\u0525\u0531\u0538\u053f\u0542\u0544\u054f\u0553"+
		"\u0557\u0563\u0566\u056a\u0574\u0578\u057a\u057d\u0581\u0584\u0588\u058e"+
		"\u0592\u0596\u059b\u059e\u05a0\u05a5\u05aa\u05ad\u05b1\u05b4\u05b6\u05bb"+
		"\u05c0\u05cd\u05d2\u05da\u05e0\u05e4\u05ed\u05fc\u0601\u060d\u0612\u061a"+
		"\u061d\u0621\u062f\u063c\u0641\u0645\u0648\u064d\u0656\u0659\u065e\u0665"+
		"\u0668\u0670\u0677\u067e\u0681\u0686\u068c\u0690\u0693\u0696\u069c\u06a1"+
		"\u06a6\u06b8\u06ba\u06bd\u06c8\u06d1\u06d8\u06e0\u06e8\u06ec\u06f4\u06fc"+
		"\u0702\u070a\u0716\u0719\u071f\u0723\u0725\u072e\u073a\u073c\u0743\u074a"+
		"\u0750\u0756\u0758\u075d\u0764\u076a\u076e\u0770\u0777\u0786\u0788\u0790"+
		"\u0792\u0796\u079e\u07a7\u07ad\u07b5\u07bb\u07c0\u07c5\u07cb\u07e0\u07e2"+
		"\u07ea\u07ee\u07f7\u07fb\u080d\u0810\u0818\u0821\u0838\u0843\u084a\u084d"+
		"\u0852\u0865\u0876\u0880\u0882\u088f\u0891\u089f\u08a6\u08a9\u08ad\u08b2"+
		"\u08c3\u08c7\u08d0\u08d4\u08d6\u08dd\u08e4\u08eb\u08f3\u0900\u0910\u091a"+
		"\u091d\u0926\u0929\u092b\u092e\u0931\u0943\u094c\u0953\u0965\u096a\u096f"+
		"\u0973\u0977\u097b\u097f\u0983\u0987\u098a";
	public static final String _serializedATN = Utils.join(
		new String[] {
			_serializedATNSegment0,
			_serializedATNSegment1
		},
		""
	);
	public static final ATN _ATN =
		new ATNDeserializer().deserialize(_serializedATN.toCharArray());
	static {
		_decisionToDFA = new DFA[_ATN.getNumberOfDecisions()];
		for (int i = 0; i < _ATN.getNumberOfDecisions(); i++) {
			_decisionToDFA[i] = new DFA(_ATN.getDecisionState(i), i);
		}
	}
}