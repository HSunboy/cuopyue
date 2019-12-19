import { Recognizer, Token } from 'antlr4';

interface errorHandle {
    (recognizer: Recognizer, offendingSymbol: Token, line: number, column: number, msg: string, e: any): void;
}

export interface Parser<V, T> {
    (sql: string, errorListener?: errorHandle, visitor?: V): T
}
export { parser as parserSparkSql } from './spark';
export { SparkTreeVisitor } from './spark';