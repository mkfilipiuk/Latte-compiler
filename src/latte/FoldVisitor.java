package latte;

/** BNFC-Generated Fold Visitor */
public abstract class FoldVisitor<R,A> implements AllVisitor<R,A> {
    public abstract R leaf(A arg);
    public abstract R combine(R x, R y, A arg);

/* Prog */
    public R visit(latte.Absyn.Program p, A arg) {
      R r = leaf(arg);
      for (latte.Absyn.TopDef x : p.listtopdef_)
      {
        r = combine(x.accept(this, arg), r, arg);
      }
      return r;
    }

/* Funct */
    public R visit(latte.Absyn.Function p, A arg) {
      R r = leaf(arg);
      r = combine(p.type_.accept(this, arg), r, arg);
      for (latte.Absyn.Arg x : p.listarg_)
      {
        r = combine(x.accept(this, arg), r, arg);
      }
      r = combine(p.block_.accept(this, arg), r, arg);
      return r;
    }

/* TopDef */
    public R visit(latte.Absyn.FnDef p, A arg) {
      R r = leaf(arg);
      r = combine(p.funct_.accept(this, arg), r, arg);
      return r;
    }
    public R visit(latte.Absyn.ClassDef p, A arg) {
      R r = leaf(arg);
      r = combine(p.clsblock_.accept(this, arg), r, arg);
      return r;
    }
    public R visit(latte.Absyn.ClassDefExtend p, A arg) {
      R r = leaf(arg);
      r = combine(p.clsblock_.accept(this, arg), r, arg);
      return r;
    }

/* Arg */
    public R visit(latte.Absyn.Argument p, A arg) {
      R r = leaf(arg);
      r = combine(p.type_.accept(this, arg), r, arg);
      return r;
    }

/* ClsBlock */
    public R visit(latte.Absyn.ClassBlock p, A arg) {
      R r = leaf(arg);
      for (latte.Absyn.ClsDef x : p.listclsdef_)
      {
        r = combine(x.accept(this, arg), r, arg);
      }
      return r;
    }

/* ClsDef */
    public R visit(latte.Absyn.ClassDefAttr p, A arg) {
      R r = leaf(arg);
      r = combine(p.clsattr_.accept(this, arg), r, arg);
      return r;
    }
    public R visit(latte.Absyn.ClassDefMethod p, A arg) {
      R r = leaf(arg);
      r = combine(p.clsmethod_.accept(this, arg), r, arg);
      return r;
    }

/* ClsMethod */
    public R visit(latte.Absyn.ClassMethod p, A arg) {
      R r = leaf(arg);
      r = combine(p.funct_.accept(this, arg), r, arg);
      return r;
    }

/* ClsAttr */
    public R visit(latte.Absyn.ClassAttribute p, A arg) {
      R r = leaf(arg);
      r = combine(p.type_.accept(this, arg), r, arg);
      return r;
    }

/* Block */
    public R visit(latte.Absyn.BlockOfStatements p, A arg) {
      R r = leaf(arg);
      for (latte.Absyn.Stmt x : p.liststmt_)
      {
        r = combine(x.accept(this, arg), r, arg);
      }
      return r;
    }

/* Stmt */
    public R visit(latte.Absyn.Empty p, A arg) {
      R r = leaf(arg);
      return r;
    }
    public R visit(latte.Absyn.BStmt p, A arg) {
      R r = leaf(arg);
      r = combine(p.block_.accept(this, arg), r, arg);
      return r;
    }
    public R visit(latte.Absyn.Decl p, A arg) {
      R r = leaf(arg);
      r = combine(p.type_.accept(this, arg), r, arg);
      for (latte.Absyn.Item x : p.listitem_)
      {
        r = combine(x.accept(this, arg), r, arg);
      }
      return r;
    }
    public R visit(latte.Absyn.Ass p, A arg) {
      R r = leaf(arg);
      r = combine(p.expr_.accept(this, arg), r, arg);
      return r;
    }
    public R visit(latte.Absyn.AssArr p, A arg) {
      R r = leaf(arg);
      r = combine(p.expr_1.accept(this, arg), r, arg);
      r = combine(p.expr_2.accept(this, arg), r, arg);
      return r;
    }
    public R visit(latte.Absyn.AssAttr p, A arg) {
      R r = leaf(arg);
      r = combine(p.expr_1.accept(this, arg), r, arg);
      r = combine(p.expr_2.accept(this, arg), r, arg);
      return r;
    }
    public R visit(latte.Absyn.Incr p, A arg) {
      R r = leaf(arg);
      return r;
    }
    public R visit(latte.Absyn.Decr p, A arg) {
      R r = leaf(arg);
      return r;
    }
    public R visit(latte.Absyn.Ret p, A arg) {
      R r = leaf(arg);
      r = combine(p.expr_.accept(this, arg), r, arg);
      return r;
    }
    public R visit(latte.Absyn.VRet p, A arg) {
      R r = leaf(arg);
      return r;
    }
    public R visit(latte.Absyn.Cond p, A arg) {
      R r = leaf(arg);
      r = combine(p.expr_.accept(this, arg), r, arg);
      r = combine(p.stmt_.accept(this, arg), r, arg);
      return r;
    }
    public R visit(latte.Absyn.CondElse p, A arg) {
      R r = leaf(arg);
      r = combine(p.expr_.accept(this, arg), r, arg);
      r = combine(p.stmt_1.accept(this, arg), r, arg);
      r = combine(p.stmt_2.accept(this, arg), r, arg);
      return r;
    }
    public R visit(latte.Absyn.While p, A arg) {
      R r = leaf(arg);
      r = combine(p.expr_.accept(this, arg), r, arg);
      r = combine(p.stmt_.accept(this, arg), r, arg);
      return r;
    }
    public R visit(latte.Absyn.For p, A arg) {
      R r = leaf(arg);
      r = combine(p.arg_.accept(this, arg), r, arg);
      r = combine(p.expr_.accept(this, arg), r, arg);
      r = combine(p.stmt_.accept(this, arg), r, arg);
      return r;
    }
    public R visit(latte.Absyn.SExp p, A arg) {
      R r = leaf(arg);
      r = combine(p.expr_.accept(this, arg), r, arg);
      return r;
    }

/* Item */
    public R visit(latte.Absyn.NoInit p, A arg) {
      R r = leaf(arg);
      return r;
    }
    public R visit(latte.Absyn.Init p, A arg) {
      R r = leaf(arg);
      r = combine(p.expr_.accept(this, arg), r, arg);
      return r;
    }

/* PrimitiveType */
    public R visit(latte.Absyn.Int p, A arg) {
      R r = leaf(arg);
      return r;
    }
    public R visit(latte.Absyn.Str p, A arg) {
      R r = leaf(arg);
      return r;
    }
    public R visit(latte.Absyn.Bool p, A arg) {
      R r = leaf(arg);
      return r;
    }
    public R visit(latte.Absyn.Void p, A arg) {
      R r = leaf(arg);
      return r;
    }

/* ClassType */
    public R visit(latte.Absyn.ClassT p, A arg) {
      R r = leaf(arg);
      return r;
    }

/* Type */
    public R visit(latte.Absyn.ArrayT p, A arg) {
      R r = leaf(arg);
      r = combine(p.type_.accept(this, arg), r, arg);
      return r;
    }
    public R visit(latte.Absyn.Fun p, A arg) {
      R r = leaf(arg);
      r = combine(p.type_.accept(this, arg), r, arg);
      for (latte.Absyn.Type x : p.listtype_)
      {
        r = combine(x.accept(this, arg), r, arg);
      }
      return r;
    }
    public R visit(latte.Absyn.Primitive p, A arg) {
      R r = leaf(arg);
      r = combine(p.primitivetype_.accept(this, arg), r, arg);
      return r;
    }
    public R visit(latte.Absyn.Class p, A arg) {
      R r = leaf(arg);
      r = combine(p.classtype_.accept(this, arg), r, arg);
      return r;
    }

/* Expr */
    public R visit(latte.Absyn.ENewArray p, A arg) {
      R r = leaf(arg);
      r = combine(p.type_.accept(this, arg), r, arg);
      r = combine(p.expr_.accept(this, arg), r, arg);
      return r;
    }
    public R visit(latte.Absyn.ENewObject p, A arg) {
      R r = leaf(arg);
      return r;
    }
    public R visit(latte.Absyn.EVar p, A arg) {
      R r = leaf(arg);
      return r;
    }
    public R visit(latte.Absyn.EArrayElem p, A arg) {
      R r = leaf(arg);
      r = combine(p.expr_.accept(this, arg), r, arg);
      return r;
    }
    public R visit(latte.Absyn.ELitInt p, A arg) {
      R r = leaf(arg);
      return r;
    }
    public R visit(latte.Absyn.ELitTrue p, A arg) {
      R r = leaf(arg);
      return r;
    }
    public R visit(latte.Absyn.ELitFalse p, A arg) {
      R r = leaf(arg);
      return r;
    }
    public R visit(latte.Absyn.EAttr p, A arg) {
      R r = leaf(arg);
      r = combine(p.expr_.accept(this, arg), r, arg);
      return r;
    }
    public R visit(latte.Absyn.EMethod p, A arg) {
      R r = leaf(arg);
      r = combine(p.expr_.accept(this, arg), r, arg);
      for (latte.Absyn.Expr x : p.listexpr_)
      {
        r = combine(x.accept(this, arg), r, arg);
      }
      return r;
    }
    public R visit(latte.Absyn.EApp p, A arg) {
      R r = leaf(arg);
      for (latte.Absyn.Expr x : p.listexpr_)
      {
        r = combine(x.accept(this, arg), r, arg);
      }
      return r;
    }
    public R visit(latte.Absyn.ECast p, A arg) {
      R r = leaf(arg);
      r = combine(p.type_.accept(this, arg), r, arg);
      r = combine(p.expr_.accept(this, arg), r, arg);
      return r;
    }
    public R visit(latte.Absyn.EString p, A arg) {
      R r = leaf(arg);
      return r;
    }
    public R visit(latte.Absyn.Neg p, A arg) {
      R r = leaf(arg);
      r = combine(p.expr_.accept(this, arg), r, arg);
      return r;
    }
    public R visit(latte.Absyn.Not p, A arg) {
      R r = leaf(arg);
      r = combine(p.expr_.accept(this, arg), r, arg);
      return r;
    }
    public R visit(latte.Absyn.EMul p, A arg) {
      R r = leaf(arg);
      r = combine(p.expr_1.accept(this, arg), r, arg);
      r = combine(p.mulop_.accept(this, arg), r, arg);
      r = combine(p.expr_2.accept(this, arg), r, arg);
      return r;
    }
    public R visit(latte.Absyn.EAdd p, A arg) {
      R r = leaf(arg);
      r = combine(p.expr_1.accept(this, arg), r, arg);
      r = combine(p.addop_.accept(this, arg), r, arg);
      r = combine(p.expr_2.accept(this, arg), r, arg);
      return r;
    }
    public R visit(latte.Absyn.ERel p, A arg) {
      R r = leaf(arg);
      r = combine(p.expr_1.accept(this, arg), r, arg);
      r = combine(p.relop_.accept(this, arg), r, arg);
      r = combine(p.expr_2.accept(this, arg), r, arg);
      return r;
    }
    public R visit(latte.Absyn.EAnd p, A arg) {
      R r = leaf(arg);
      r = combine(p.expr_1.accept(this, arg), r, arg);
      r = combine(p.expr_2.accept(this, arg), r, arg);
      return r;
    }
    public R visit(latte.Absyn.EOr p, A arg) {
      R r = leaf(arg);
      r = combine(p.expr_1.accept(this, arg), r, arg);
      r = combine(p.expr_2.accept(this, arg), r, arg);
      return r;
    }

/* AddOp */
    public R visit(latte.Absyn.Plus p, A arg) {
      R r = leaf(arg);
      return r;
    }
    public R visit(latte.Absyn.Minus p, A arg) {
      R r = leaf(arg);
      return r;
    }

/* MulOp */
    public R visit(latte.Absyn.Times p, A arg) {
      R r = leaf(arg);
      return r;
    }
    public R visit(latte.Absyn.Div p, A arg) {
      R r = leaf(arg);
      return r;
    }
    public R visit(latte.Absyn.Mod p, A arg) {
      R r = leaf(arg);
      return r;
    }

/* RelOp */
    public R visit(latte.Absyn.LTH p, A arg) {
      R r = leaf(arg);
      return r;
    }
    public R visit(latte.Absyn.LE p, A arg) {
      R r = leaf(arg);
      return r;
    }
    public R visit(latte.Absyn.GTH p, A arg) {
      R r = leaf(arg);
      return r;
    }
    public R visit(latte.Absyn.GE p, A arg) {
      R r = leaf(arg);
      return r;
    }
    public R visit(latte.Absyn.EQU p, A arg) {
      R r = leaf(arg);
      return r;
    }
    public R visit(latte.Absyn.NE p, A arg) {
      R r = leaf(arg);
      return r;
    }


}
