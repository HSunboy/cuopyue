import { sparkVisitor } from "../../../antlr/spark/output/sparkVisitor";


export interface SparkTreeVisitor {
    visitChildren(ctx: any): void;
}
export class SparkTreeVisitor extends sparkVisitor {
    // visitChildren1 (ctx) {
    //     (this as any).visitChildren(ctx);
    // }
}