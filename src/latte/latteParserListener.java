// Generated from latte/latteParser.g4 by ANTLR 4.9
package latte;

import org.antlr.v4.runtime.tree.ParseTreeListener;

/**
 * This interface defines a complete listener for a parse tree produced by
 * {@link latteParser}.
 */
public interface latteParserListener extends ParseTreeListener {
    /**
     * Enter a parse tree produced by {@link latteParser#start_Prog}.
     *
     * @param ctx the parse tree
     */
    void enterStart_Prog(latteParser.Start_ProgContext ctx);

    /**
     * Exit a parse tree produced by {@link latteParser#start_Prog}.
     *
     * @param ctx the parse tree
     */
    void exitStart_Prog(latteParser.Start_ProgContext ctx);

    /**
     * Enter a parse tree produced by {@link latteParser#prog}.
     *
     * @param ctx the parse tree
     */
    void enterProg(latteParser.ProgContext ctx);

    /**
     * Exit a parse tree produced by {@link latteParser#prog}.
     *
     * @param ctx the parse tree
     */
    void exitProg(latteParser.ProgContext ctx);

    /**
     * Enter a parse tree produced by {@link latteParser#identP}.
     *
     * @param ctx the parse tree
     */
    void enterIdentP(latteParser.IdentPContext ctx);

    /**
     * Exit a parse tree produced by {@link latteParser#identP}.
     *
     * @param ctx the parse tree
     */
    void exitIdentP(latteParser.IdentPContext ctx);

    /**
     * Enter a parse tree produced by {@link latteParser#funct}.
     *
     * @param ctx the parse tree
     */
    void enterFunct(latteParser.FunctContext ctx);

    /**
     * Exit a parse tree produced by {@link latteParser#funct}.
     *
     * @param ctx the parse tree
     */
    void exitFunct(latteParser.FunctContext ctx);

    /**
     * Enter a parse tree produced by {@link latteParser#topDef}.
     *
     * @param ctx the parse tree
     */
    void enterTopDef(latteParser.TopDefContext ctx);

    /**
     * Exit a parse tree produced by {@link latteParser#topDef}.
     *
     * @param ctx the parse tree
     */
    void exitTopDef(latteParser.TopDefContext ctx);

    /**
     * Enter a parse tree produced by {@link latteParser#listTopDef}.
     *
     * @param ctx the parse tree
     */
    void enterListTopDef(latteParser.ListTopDefContext ctx);

    /**
     * Exit a parse tree produced by {@link latteParser#listTopDef}.
     *
     * @param ctx the parse tree
     */
    void exitListTopDef(latteParser.ListTopDefContext ctx);

    /**
     * Enter a parse tree produced by {@link latteParser#arg}.
     *
     * @param ctx the parse tree
     */
    void enterArg(latteParser.ArgContext ctx);

    /**
     * Exit a parse tree produced by {@link latteParser#arg}.
     *
     * @param ctx the parse tree
     */
    void exitArg(latteParser.ArgContext ctx);

    /**
     * Enter a parse tree produced by {@link latteParser#listArg}.
     *
     * @param ctx the parse tree
     */
    void enterListArg(latteParser.ListArgContext ctx);

    /**
     * Exit a parse tree produced by {@link latteParser#listArg}.
     *
     * @param ctx the parse tree
     */
    void exitListArg(latteParser.ListArgContext ctx);

    /**
     * Enter a parse tree produced by {@link latteParser#clsBlock}.
     *
     * @param ctx the parse tree
     */
    void enterClsBlock(latteParser.ClsBlockContext ctx);

    /**
     * Exit a parse tree produced by {@link latteParser#clsBlock}.
     *
     * @param ctx the parse tree
     */
    void exitClsBlock(latteParser.ClsBlockContext ctx);

    /**
     * Enter a parse tree produced by {@link latteParser#listClsDef}.
     *
     * @param ctx the parse tree
     */
    void enterListClsDef(latteParser.ListClsDefContext ctx);

    /**
     * Exit a parse tree produced by {@link latteParser#listClsDef}.
     *
     * @param ctx the parse tree
     */
    void exitListClsDef(latteParser.ListClsDefContext ctx);

    /**
     * Enter a parse tree produced by {@link latteParser#clsDef}.
     *
     * @param ctx the parse tree
     */
    void enterClsDef(latteParser.ClsDefContext ctx);

    /**
     * Exit a parse tree produced by {@link latteParser#clsDef}.
     *
     * @param ctx the parse tree
     */
    void exitClsDef(latteParser.ClsDefContext ctx);

    /**
     * Enter a parse tree produced by {@link latteParser#clsMethod}.
     *
     * @param ctx the parse tree
     */
    void enterClsMethod(latteParser.ClsMethodContext ctx);

    /**
     * Exit a parse tree produced by {@link latteParser#clsMethod}.
     *
     * @param ctx the parse tree
     */
    void exitClsMethod(latteParser.ClsMethodContext ctx);

    /**
     * Enter a parse tree produced by {@link latteParser#clsAttr}.
     *
     * @param ctx the parse tree
     */
    void enterClsAttr(latteParser.ClsAttrContext ctx);

    /**
     * Exit a parse tree produced by {@link latteParser#clsAttr}.
     *
     * @param ctx the parse tree
     */
    void exitClsAttr(latteParser.ClsAttrContext ctx);

    /**
     * Enter a parse tree produced by {@link latteParser#block}.
     *
     * @param ctx the parse tree
     */
    void enterBlock(latteParser.BlockContext ctx);

    /**
     * Exit a parse tree produced by {@link latteParser#block}.
     *
     * @param ctx the parse tree
     */
    void exitBlock(latteParser.BlockContext ctx);

    /**
     * Enter a parse tree produced by {@link latteParser#listStmt}.
     *
     * @param ctx the parse tree
     */
    void enterListStmt(latteParser.ListStmtContext ctx);

    /**
     * Exit a parse tree produced by {@link latteParser#listStmt}.
     *
     * @param ctx the parse tree
     */
    void exitListStmt(latteParser.ListStmtContext ctx);

    /**
     * Enter a parse tree produced by {@link latteParser#stmt}.
     *
     * @param ctx the parse tree
     */
    void enterStmt(latteParser.StmtContext ctx);

    /**
     * Exit a parse tree produced by {@link latteParser#stmt}.
     *
     * @param ctx the parse tree
     */
    void exitStmt(latteParser.StmtContext ctx);

    /**
     * Enter a parse tree produced by {@link latteParser#item}.
     *
     * @param ctx the parse tree
     */
    void enterItem(latteParser.ItemContext ctx);

    /**
     * Exit a parse tree produced by {@link latteParser#item}.
     *
     * @param ctx the parse tree
     */
    void exitItem(latteParser.ItemContext ctx);

    /**
     * Enter a parse tree produced by {@link latteParser#listItem}.
     *
     * @param ctx the parse tree
     */
    void enterListItem(latteParser.ListItemContext ctx);

    /**
     * Exit a parse tree produced by {@link latteParser#listItem}.
     *
     * @param ctx the parse tree
     */
    void exitListItem(latteParser.ListItemContext ctx);

    /**
     * Enter a parse tree produced by {@link latteParser#primitiveType}.
     *
     * @param ctx the parse tree
     */
    void enterPrimitiveType(latteParser.PrimitiveTypeContext ctx);

    /**
     * Exit a parse tree produced by {@link latteParser#primitiveType}.
     *
     * @param ctx the parse tree
     */
    void exitPrimitiveType(latteParser.PrimitiveTypeContext ctx);

    /**
     * Enter a parse tree produced by {@link latteParser#classType}.
     *
     * @param ctx the parse tree
     */
    void enterClassType(latteParser.ClassTypeContext ctx);

    /**
     * Exit a parse tree produced by {@link latteParser#classType}.
     *
     * @param ctx the parse tree
     */
    void exitClassType(latteParser.ClassTypeContext ctx);

    /**
     * Enter a parse tree produced by {@link latteParser#type}.
     *
     * @param ctx the parse tree
     */
    void enterType(latteParser.TypeContext ctx);

    /**
     * Exit a parse tree produced by {@link latteParser#type}.
     *
     * @param ctx the parse tree
     */
    void exitType(latteParser.TypeContext ctx);

    /**
     * Enter a parse tree produced by {@link latteParser#listType}.
     *
     * @param ctx the parse tree
     */
    void enterListType(latteParser.ListTypeContext ctx);

    /**
     * Exit a parse tree produced by {@link latteParser#listType}.
     *
     * @param ctx the parse tree
     */
    void exitListType(latteParser.ListTypeContext ctx);

    /**
     * Enter a parse tree produced by {@link latteParser#expr6}.
     *
     * @param ctx the parse tree
     */
    void enterExpr6(latteParser.Expr6Context ctx);

    /**
     * Exit a parse tree produced by {@link latteParser#expr6}.
     *
     * @param ctx the parse tree
     */
    void exitExpr6(latteParser.Expr6Context ctx);

    /**
     * Enter a parse tree produced by {@link latteParser#expr5}.
     *
     * @param ctx the parse tree
     */
    void enterExpr5(latteParser.Expr5Context ctx);

    /**
     * Exit a parse tree produced by {@link latteParser#expr5}.
     *
     * @param ctx the parse tree
     */
    void exitExpr5(latteParser.Expr5Context ctx);

    /**
     * Enter a parse tree produced by {@link latteParser#expr4}.
     *
     * @param ctx the parse tree
     */
    void enterExpr4(latteParser.Expr4Context ctx);

    /**
     * Exit a parse tree produced by {@link latteParser#expr4}.
     *
     * @param ctx the parse tree
     */
    void exitExpr4(latteParser.Expr4Context ctx);

    /**
     * Enter a parse tree produced by {@link latteParser#expr3}.
     *
     * @param ctx the parse tree
     */
    void enterExpr3(latteParser.Expr3Context ctx);

    /**
     * Exit a parse tree produced by {@link latteParser#expr3}.
     *
     * @param ctx the parse tree
     */
    void exitExpr3(latteParser.Expr3Context ctx);

    /**
     * Enter a parse tree produced by {@link latteParser#expr2}.
     *
     * @param ctx the parse tree
     */
    void enterExpr2(latteParser.Expr2Context ctx);

    /**
     * Exit a parse tree produced by {@link latteParser#expr2}.
     *
     * @param ctx the parse tree
     */
    void exitExpr2(latteParser.Expr2Context ctx);

    /**
     * Enter a parse tree produced by {@link latteParser#expr1}.
     *
     * @param ctx the parse tree
     */
    void enterExpr1(latteParser.Expr1Context ctx);

    /**
     * Exit a parse tree produced by {@link latteParser#expr1}.
     *
     * @param ctx the parse tree
     */
    void exitExpr1(latteParser.Expr1Context ctx);

    /**
     * Enter a parse tree produced by {@link latteParser#expr}.
     *
     * @param ctx the parse tree
     */
    void enterExpr(latteParser.ExprContext ctx);

    /**
     * Exit a parse tree produced by {@link latteParser#expr}.
     *
     * @param ctx the parse tree
     */
    void exitExpr(latteParser.ExprContext ctx);

    /**
     * Enter a parse tree produced by {@link latteParser#listExpr}.
     *
     * @param ctx the parse tree
     */
    void enterListExpr(latteParser.ListExprContext ctx);

    /**
     * Exit a parse tree produced by {@link latteParser#listExpr}.
     *
     * @param ctx the parse tree
     */
    void exitListExpr(latteParser.ListExprContext ctx);

    /**
     * Enter a parse tree produced by {@link latteParser#addOp}.
     *
     * @param ctx the parse tree
     */
    void enterAddOp(latteParser.AddOpContext ctx);

    /**
     * Exit a parse tree produced by {@link latteParser#addOp}.
     *
     * @param ctx the parse tree
     */
    void exitAddOp(latteParser.AddOpContext ctx);

    /**
     * Enter a parse tree produced by {@link latteParser#mulOp}.
     *
     * @param ctx the parse tree
     */
    void enterMulOp(latteParser.MulOpContext ctx);

    /**
     * Exit a parse tree produced by {@link latteParser#mulOp}.
     *
     * @param ctx the parse tree
     */
    void exitMulOp(latteParser.MulOpContext ctx);

    /**
     * Enter a parse tree produced by {@link latteParser#relOp}.
     *
     * @param ctx the parse tree
     */
    void enterRelOp(latteParser.RelOpContext ctx);

    /**
     * Exit a parse tree produced by {@link latteParser#relOp}.
     *
     * @param ctx the parse tree
     */
    void exitRelOp(latteParser.RelOpContext ctx);
}