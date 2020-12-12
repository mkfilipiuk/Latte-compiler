package latte;

/**
 * BNFC-Generated Abstract Visitor
 */

public class AbstractVisitor<R, A> implements AllVisitor<R, A> {
    /* Prog */
    public R visit(latte.Absyn.Program p, A arg) {
        return visitDefault(p, arg);
    }

    public R visitDefault(latte.Absyn.Prog p, A arg) {
        throw new IllegalArgumentException(this.getClass().getName() + ": " + p);
    }

    /* IdentP */
    public R visit(latte.Absyn.IdentPos p, A arg) {
        return visitDefault(p, arg);
    }

    public R visitDefault(latte.Absyn.IdentP p, A arg) {
        throw new IllegalArgumentException(this.getClass().getName() + ": " + p);
    }

    /* Funct */
    public R visit(latte.Absyn.Function p, A arg) {
        return visitDefault(p, arg);
    }

    public R visitDefault(latte.Absyn.Funct p, A arg) {
        throw new IllegalArgumentException(this.getClass().getName() + ": " + p);
    }

    /* TopDef */
    public R visit(latte.Absyn.FnDef p, A arg) {
        return visitDefault(p, arg);
    }

    public R visit(latte.Absyn.ClassDef p, A arg) {
        return visitDefault(p, arg);
    }

    public R visit(latte.Absyn.ClassDefExtend p, A arg) {
        return visitDefault(p, arg);
    }

    public R visitDefault(latte.Absyn.TopDef p, A arg) {
      throw new IllegalArgumentException(this.getClass().getName() + ": " + p);
    }
    /* Arg */
    public R visit(latte.Absyn.Argument p, A arg) { return visitDefault(p, arg); }
    public R visitDefault(latte.Absyn.Arg p, A arg) {
      throw new IllegalArgumentException(this.getClass().getName() + ": " + p);
    }
    /* ClsBlock */
    public R visit(latte.Absyn.ClassBlock p, A arg) { return visitDefault(p, arg); }
    public R visitDefault(latte.Absyn.ClsBlock p, A arg) {
      throw new IllegalArgumentException(this.getClass().getName() + ": " + p);
    }
    /* ClsDef */
    public R visit(latte.Absyn.ClassDefAttr p, A arg) { return visitDefault(p, arg); }
    public R visit(latte.Absyn.ClassDefMethod p, A arg) { return visitDefault(p, arg); }
    public R visitDefault(latte.Absyn.ClsDef p, A arg) {
      throw new IllegalArgumentException(this.getClass().getName() + ": " + p);
    }
    /* ClsMethod */
    public R visit(latte.Absyn.ClassMethod p, A arg) { return visitDefault(p, arg); }
    public R visitDefault(latte.Absyn.ClsMethod p, A arg) {
      throw new IllegalArgumentException(this.getClass().getName() + ": " + p);
    }
    /* ClsAttr */
    public R visit(latte.Absyn.ClassAttribute p, A arg) { return visitDefault(p, arg); }
    public R visitDefault(latte.Absyn.ClsAttr p, A arg) {
      throw new IllegalArgumentException(this.getClass().getName() + ": " + p);
    }
    /* Block */
    public R visit(latte.Absyn.BlockOfStatements p, A arg) { return visitDefault(p, arg); }
    public R visitDefault(latte.Absyn.Block p, A arg) {
      throw new IllegalArgumentException(this.getClass().getName() + ": " + p);
    }
    /* Stmt */
    public R visit(latte.Absyn.Empty p, A arg) { return visitDefault(p, arg); }
    public R visit(latte.Absyn.BStmt p, A arg) { return visitDefault(p, arg); }
    public R visit(latte.Absyn.Decl p, A arg) { return visitDefault(p, arg); }
    public R visit(latte.Absyn.Ass p, A arg) { return visitDefault(p, arg); }
    public R visit(latte.Absyn.AssArr p, A arg) { return visitDefault(p, arg); }
    public R visit(latte.Absyn.AssAttr p, A arg) { return visitDefault(p, arg); }
    public R visit(latte.Absyn.Incr p, A arg) { return visitDefault(p, arg); }
    public R visit(latte.Absyn.Decr p, A arg) { return visitDefault(p, arg); }
    public R visit(latte.Absyn.Ret p, A arg) { return visitDefault(p, arg); }
    public R visit(latte.Absyn.VRet p, A arg) { return visitDefault(p, arg); }
    public R visit(latte.Absyn.Cond p, A arg) { return visitDefault(p, arg); }
    public R visit(latte.Absyn.CondElse p, A arg) { return visitDefault(p, arg); }
    public R visit(latte.Absyn.While p, A arg) { return visitDefault(p, arg); }
    public R visit(latte.Absyn.For p, A arg) { return visitDefault(p, arg); }
    public R visit(latte.Absyn.SExp p, A arg) { return visitDefault(p, arg); }
    public R visitDefault(latte.Absyn.Stmt p, A arg) {
      throw new IllegalArgumentException(this.getClass().getName() + ": " + p);
    }
    /* Item */
    public R visit(latte.Absyn.NoInit p, A arg) { return visitDefault(p, arg); }
    public R visit(latte.Absyn.Init p, A arg) { return visitDefault(p, arg); }
    public R visitDefault(latte.Absyn.Item p, A arg) {
      throw new IllegalArgumentException(this.getClass().getName() + ": " + p);
    }
    /* PrimitiveType */
    public R visit(latte.Absyn.Int p, A arg) { return visitDefault(p, arg); }
    public R visit(latte.Absyn.Str p, A arg) { return visitDefault(p, arg); }
    public R visit(latte.Absyn.Bool p, A arg) { return visitDefault(p, arg); }
    public R visit(latte.Absyn.Void p, A arg) { return visitDefault(p, arg); }
    public R visitDefault(latte.Absyn.PrimitiveType p, A arg) {
      throw new IllegalArgumentException(this.getClass().getName() + ": " + p);
    }
    /* ClassType */
    public R visit(latte.Absyn.ClassT p, A arg) { return visitDefault(p, arg); }
    public R visitDefault(latte.Absyn.ClassType p, A arg) {
      throw new IllegalArgumentException(this.getClass().getName() + ": " + p);
    }
    /* Type */
    public R visit(latte.Absyn.ArrayT p, A arg) { return visitDefault(p, arg); }
    public R visit(latte.Absyn.Fun p, A arg) { return visitDefault(p, arg); }
    public R visit(latte.Absyn.Primitive p, A arg) { return visitDefault(p, arg); }
    public R visit(latte.Absyn.Class p, A arg) { return visitDefault(p, arg); }
    public R visitDefault(latte.Absyn.Type p, A arg) {
      throw new IllegalArgumentException(this.getClass().getName() + ": " + p);
    }
    /* Expr */
    public R visit(latte.Absyn.ENewArray p, A arg) { return visitDefault(p, arg); }
    public R visit(latte.Absyn.ENewObject p, A arg) { return visitDefault(p, arg); }
    public R visit(latte.Absyn.EVar p, A arg) { return visitDefault(p, arg); }
    public R visit(latte.Absyn.EArrayElem p, A arg) { return visitDefault(p, arg); }
    public R visit(latte.Absyn.ELitInt p, A arg) { return visitDefault(p, arg); }
    public R visit(latte.Absyn.ELitTrue p, A arg) { return visitDefault(p, arg); }
    public R visit(latte.Absyn.ELitFalse p, A arg) { return visitDefault(p, arg); }
    public R visit(latte.Absyn.EAttr p, A arg) { return visitDefault(p, arg); }
    public R visit(latte.Absyn.EMethod p, A arg) { return visitDefault(p, arg); }
    public R visit(latte.Absyn.EApp p, A arg) { return visitDefault(p, arg); }
    public R visit(latte.Absyn.ECast p, A arg) { return visitDefault(p, arg); }
    public R visit(latte.Absyn.EString p, A arg) { return visitDefault(p, arg); }
    public R visit(latte.Absyn.Neg p, A arg) { return visitDefault(p, arg); }
    public R visit(latte.Absyn.Not p, A arg) { return visitDefault(p, arg); }
    public R visit(latte.Absyn.EMul p, A arg) { return visitDefault(p, arg); }
    public R visit(latte.Absyn.EAdd p, A arg) { return visitDefault(p, arg); }
    public R visit(latte.Absyn.ERel p, A arg) { return visitDefault(p, arg); }
    public R visit(latte.Absyn.EAnd p, A arg) { return visitDefault(p, arg); }
    public R visit(latte.Absyn.EOr p, A arg) { return visitDefault(p, arg); }
    public R visitDefault(latte.Absyn.Expr p, A arg) {
      throw new IllegalArgumentException(this.getClass().getName() + ": " + p);
    }
    /* AddOp */
    public R visit(latte.Absyn.Plus p, A arg) { return visitDefault(p, arg); }
    public R visit(latte.Absyn.Minus p, A arg) { return visitDefault(p, arg); }
    public R visitDefault(latte.Absyn.AddOp p, A arg) {
      throw new IllegalArgumentException(this.getClass().getName() + ": " + p);
    }
    /* MulOp */
    public R visit(latte.Absyn.Times p, A arg) { return visitDefault(p, arg); }
    public R visit(latte.Absyn.Div p, A arg) { return visitDefault(p, arg); }
    public R visit(latte.Absyn.Mod p, A arg) { return visitDefault(p, arg); }
    public R visitDefault(latte.Absyn.MulOp p, A arg) {
      throw new IllegalArgumentException(this.getClass().getName() + ": " + p);
    }
    /* RelOp */
    public R visit(latte.Absyn.LTH p, A arg) { return visitDefault(p, arg); }
    public R visit(latte.Absyn.LE p, A arg) { return visitDefault(p, arg); }
    public R visit(latte.Absyn.GTH p, A arg) { return visitDefault(p, arg); }
    public R visit(latte.Absyn.GE p, A arg) { return visitDefault(p, arg); }
    public R visit(latte.Absyn.EQU p, A arg) { return visitDefault(p, arg); }
    public R visit(latte.Absyn.NE p, A arg) { return visitDefault(p, arg); }
    public R visitDefault(latte.Absyn.RelOp p, A arg) {
      throw new IllegalArgumentException(this.getClass().getName() + ": " + p);
    }

}
