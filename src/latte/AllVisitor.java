package latte;

/** BNFC-Generated All Visitor */

public interface AllVisitor<R,A> extends
    latte.Absyn.Prog.Visitor<R, A>,
    latte.Absyn.IdentP.Visitor<R, A>,
    latte.Absyn.Funct.Visitor<R, A>,
    latte.Absyn.TopDef.Visitor<R, A>,
    latte.Absyn.Arg.Visitor<R, A>,
    latte.Absyn.ClsBlock.Visitor<R, A>,
    latte.Absyn.ClsDef.Visitor<R, A>,
    latte.Absyn.ClsMethod.Visitor<R, A>,
    latte.Absyn.ClsAttr.Visitor<R, A>,
    latte.Absyn.Block.Visitor<R, A>,
    latte.Absyn.Stmt.Visitor<R, A>,
    latte.Absyn.Item.Visitor<R, A>,
  latte.Absyn.PrimitiveType.Visitor<R,A>,
  latte.Absyn.ClassType.Visitor<R,A>,
  latte.Absyn.Type.Visitor<R,A>,
  latte.Absyn.Expr.Visitor<R,A>,
  latte.Absyn.AddOp.Visitor<R,A>,
  latte.Absyn.MulOp.Visitor<R,A>,
  latte.Absyn.RelOp.Visitor<R,A>
{}
