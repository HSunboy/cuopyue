import { parser } from '../src';
import { SparkTreeVisitor } from '../src/parser';


describe('complete test', () => {
    describe('spark', () => {
        test('base sql return', () => {
            let sql = 'select id,name from user ';
            let result = parser.parserSparkSql(sql);
            expect(result).toHaveLength(1);
            expect(result).not.toContain(null);
            sql = ' ';
            result = parser.parserSparkSql(sql);
            expect(result).toEqual([null]);
            sql = `select id,name from user; 
            select id,name from user
            `;
            result = parser.parserSparkSql(sql);
            expect(result).toHaveLength(2);
            expect(result).not.toContain(null);
        });
        test('errorlistener', (done) => {
            let sql = 'select id,name fr1om user ';
            let result = parser.parserSparkSql(sql, (recognizer, offendingSymbol, line: number, column: number, msg: string) => {
                expect(line).toBe(1);
                expect(msg).not.toBeNull();
                expect(offendingSymbol.text).toBe('USER');
                done();
            });
        });
        test('visitor', () => {
            let sql = 'select id,name from user as u where id = 1;';
            const vt = jest.fn();
            class V extends SparkTreeVisitor {
                visitTableName (ctx) {
                    vt();
                    expect(ctx.tableIdentifier().getText()).toBe('USER');
                    expect(ctx.tableAlias().strictIdentifier().getText()).toBe('U');
                    super.visitTableName(ctx);
                }
                visitTableAlias (ctx) {
                    vt();
                    super.visitTableAlias(ctx);
                }
            }
            parser.parserSparkSql(sql, null, new V());
            expect(vt).toBeCalledTimes(2);
        });
    })
})
