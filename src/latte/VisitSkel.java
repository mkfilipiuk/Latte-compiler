package latte;

/*** BNFC-Generated Visitor Design Pattern Skeleton. ***/

/* This implements the common visitor design pattern.
   Tests show it to be slightly less efficient than the
   instanceof method, but easier to use.
   Replace the R and A parameters with the desired return
   and context types.*/

public class VisitSkel
{
    public class ProgVisitor<R, A> implements latte.Absyn.Prog.Visitor<R, A> {
        public R visit(latte.Absyn.Program p, A arg) { /* Code for Program goes here */
            for (latte.Absyn.TopDef x : p.listtopdef_) {
                x.accept(new TopDefVisitor<R, A>(), arg);
            }
            return null;
        }
    }

    public class IdentPVisitor<R, A> implements latte.Absyn.IdentP.Visitor<R, A> {
        public R visit(latte.Absyn.IdentPos p, A arg) { /* Code for IdentPos goes here */
            //p.ident_;
            return null;
        }
    }

    public class FunctVisitor<R, A> implements latte.Absyn.Funct.Visitor<R, A> {
        public R visit(latte.Absyn.Function p, A arg) { /* Code for Function goes here */
            p.type_.accept(new TypeVisitor<R, A>(), arg);
            p.identp_.accept(new IdentPVisitor<R, A>(), arg);
            for (latte.Absyn.Arg x : p.listarg_) {
                x.accept(new ArgVisitor<R, A>(), arg);
            }
            p.block_.accept(new BlockVisitor<R, A>(), arg);
      return null;
    }
  }
  public class TopDefVisitor<R,A> implements latte.Absyn.TopDef.Visitor<R,A>
  {
    public R visit(latte.Absyn.FnDef p, A arg)
    { /* Code for FnDef goes here */
      p.funct_.accept(new FunctVisitor<R,A>(), arg);
      return null;
    }
    public R visit(latte.Absyn.ClassDef p, A arg)
    { /* Code for ClassDef goes here */
        p.identp_.accept(new IdentPVisitor<R, A>(), arg);
        p.clsblock_.accept(new ClsBlockVisitor<R, A>(), arg);
      return null;
    }
    public R visit(latte.Absyn.ClassDefExtend p, A arg) { /* Code for ClassDefExtend goes here */
        p.identp_1.accept(new IdentPVisitor<R, A>(), arg);
        p.identp_2.accept(new IdentPVisitor<R, A>(), arg);
        p.clsblock_.accept(new ClsBlockVisitor<R, A>(), arg);
        return null;
    }
  }
  public class ArgVisitor<R,A> implements latte.Absyn.Arg.Visitor<R,A>
  {
    public R visit(latte.Absyn.Argument p, A arg)
    { /* Code for Argument goes here */
        p.type_.accept(new TypeVisitor<R, A>(), arg);
        p.identp_.accept(new IdentPVisitor<R, A>(), arg);
      return null;
    }
  }
  public class ClsBlockVisitor<R,A> implements latte.Absyn.ClsBlock.Visitor<R,A>
  {
    public R visit(latte.Absyn.ClassBlock p, A arg)
    { /* Code for ClassBlock goes here */
      for (latte.Absyn.ClsDef x: p.listclsdef_) {
        x.accept(new ClsDefVisitor<R,A>(), arg);
      }
      return null;
    }
  }
  public class ClsDefVisitor<R,A> implements latte.Absyn.ClsDef.Visitor<R,A>
  {
    public R visit(latte.Absyn.ClassDefAttr p, A arg)
    { /* Code for ClassDefAttr goes here */
      p.clsattr_.accept(new ClsAttrVisitor<R,A>(), arg);
      return null;
    }
    public R visit(latte.Absyn.ClassDefMethod p, A arg)
    { /* Code for ClassDefMethod goes here */
      p.clsmethod_.accept(new ClsMethodVisitor<R,A>(), arg);
      return null;
    }
  }
  public class ClsMethodVisitor<R,A> implements latte.Absyn.ClsMethod.Visitor<R,A>
  {
    public R visit(latte.Absyn.ClassMethod p, A arg)
    { /* Code for ClassMethod goes here */
      p.funct_.accept(new FunctVisitor<R,A>(), arg);
      return null;
    }
  }
  public class ClsAttrVisitor<R,A> implements latte.Absyn.ClsAttr.Visitor<R,A>
  {
    public R visit(latte.Absyn.ClassAttribute p, A arg)
    { /* Code for ClassAttribute goes here */
        p.type_.accept(new TypeVisitor<R, A>(), arg);
        p.identp_.accept(new IdentPVisitor<R, A>(), arg);
      return null;
    }
  }
  public class BlockVisitor<R,A> implements latte.Absyn.Block.Visitor<R,A>
  {
    public R visit(latte.Absyn.BlockOfStatements p, A arg)
    { /* Code for BlockOfStatements goes here */
      for (latte.Absyn.Stmt x: p.liststmt_) {
        x.accept(new StmtVisitor<R,A>(), arg);
      }
      return null;
    }
  }
  public class StmtVisitor<R,A> implements latte.Absyn.Stmt.Visitor<R,A>
  {
    public R visit(latte.Absyn.Empty p, A arg)
    { /* Code for Empty goes here */
      return null;
    }
    public R visit(latte.Absyn.BStmt p, A arg)
    { /* Code for BStmt goes here */
      p.block_.accept(new BlockVisitor<R,A>(), arg);
      return null;
    }
    public R visit(latte.Absyn.Decl p, A arg)
    { /* Code for Decl goes here */
      p.type_.accept(new TypeVisitor<R,A>(), arg);
      for (latte.Absyn.Item x: p.listitem_) {
        x.accept(new ItemVisitor<R,A>(), arg);
      }
      return null;
    }
    public R visit(latte.Absyn.Ass p, A arg)
    { /* Code for Ass goes here */
        p.identp_.accept(new IdentPVisitor<R, A>(), arg);
        p.expr_.accept(new ExprVisitor<R, A>(), arg);
      return null;
    }
    public R visit(latte.Absyn.AssArr p, A arg)
    { /* Code for AssArr goes here */
        p.identp_.accept(new IdentPVisitor<R, A>(), arg);
        p.expr_1.accept(new ExprVisitor<R, A>(), arg);
      p.expr_2.accept(new ExprVisitor<R,A>(), arg);
      return null;
    }
    public R visit(latte.Absyn.AssAttr p, A arg)
    { /* Code for AssAttr goes here */
        p.expr_1.accept(new ExprVisitor<R, A>(), arg);
        p.identp_.accept(new IdentPVisitor<R, A>(), arg);
        p.expr_2.accept(new ExprVisitor<R, A>(), arg);
      return null;
    }
    public R visit(latte.Absyn.Incr p, A arg)
    { /* Code for Incr goes here */
        p.identp_.accept(new IdentPVisitor<R, A>(), arg);
      return null;
    }
    public R visit(latte.Absyn.Decr p, A arg)
    { /* Code for Decr goes here */
        p.identp_.accept(new IdentPVisitor<R, A>(), arg);
      return null;
    }
    public R visit(latte.Absyn.Ret p, A arg)
    { /* Code for Ret goes here */
      p.expr_.accept(new ExprVisitor<R,A>(), arg);
      return null;
    }
    public R visit(latte.Absyn.VRet p, A arg)
    { /* Code for VRet goes here */
      return null;
    }
    public R visit(latte.Absyn.Cond p, A arg)
    { /* Code for Cond goes here */
      p.expr_.accept(new ExprVisitor<R,A>(), arg);
      p.stmt_.accept(new StmtVisitor<R,A>(), arg);
      return null;
    }
    public R visit(latte.Absyn.CondElse p, A arg)
    { /* Code for CondElse goes here */
      p.expr_.accept(new ExprVisitor<R,A>(), arg);
      p.stmt_1.accept(new StmtVisitor<R,A>(), arg);
      p.stmt_2.accept(new StmtVisitor<R,A>(), arg);
      return null;
    }
    public R visit(latte.Absyn.While p, A arg)
    { /* Code for While goes here */
      p.expr_.accept(new ExprVisitor<R,A>(), arg);
      p.stmt_.accept(new StmtVisitor<R,A>(), arg);
      return null;
    }
    public R visit(latte.Absyn.For p, A arg)
    { /* Code for For goes here */
      p.arg_.accept(new ArgVisitor<R,A>(), arg);
      p.expr_.accept(new ExprVisitor<R,A>(), arg);
      p.stmt_.accept(new StmtVisitor<R,A>(), arg);
      return null;
    }
    public R visit(latte.Absyn.SExp p, A arg)
    { /* Code for SExp goes here */
      p.expr_.accept(new ExprVisitor<R,A>(), arg);
      return null;
    }
  }
  public class ItemVisitor<R,A> implements latte.Absyn.Item.Visitor<R,A>
  {
    public R visit(latte.Absyn.NoInit p, A arg)
    { /* Code for NoInit goes here */
        p.identp_.accept(new IdentPVisitor<R, A>(), arg);
      return null;
    }
    public R visit(latte.Absyn.Init p, A arg)
    { /* Code for Init goes here */
        p.identp_.accept(new IdentPVisitor<R, A>(), arg);
        p.expr_.accept(new ExprVisitor<R, A>(), arg);
      return null;
    }
  }
  public class PrimitiveTypeVisitor<R,A> implements latte.Absyn.PrimitiveType.Visitor<R,A>
  {
    public R visit(latte.Absyn.Int p, A arg)
    { /* Code for Int goes here */
      return null;
    }
    public R visit(latte.Absyn.Str p, A arg)
    { /* Code for Str goes here */
      return null;
    }
    public R visit(latte.Absyn.Bool p, A arg)
    { /* Code for Bool goes here */
      return null;
    }
    public R visit(latte.Absyn.Void p, A arg)
    { /* Code for Void goes here */
      return null;
    }
  }
  public class ClassTypeVisitor<R,A> implements latte.Absyn.ClassType.Visitor<R,A>
  {
    public R visit(latte.Absyn.ClassT p, A arg)
    { /* Code for ClassT goes here */
        p.identp_.accept(new IdentPVisitor<R, A>(), arg);
      return null;
    }
  }
  public class TypeVisitor<R,A> implements latte.Absyn.Type.Visitor<R,A>
  {
    public R visit(latte.Absyn.ArrayT p, A arg)
    { /* Code for ArrayT goes here */
      p.type_.accept(new TypeVisitor<R,A>(), arg);
      return null;
    }
    public R visit(latte.Absyn.Fun p, A arg)
    { /* Code for Fun goes here */
      p.type_.accept(new TypeVisitor<R,A>(), arg);
      for (latte.Absyn.Type x: p.listtype_) {
        x.accept(new TypeVisitor<R,A>(), arg);
      }
      return null;
    }
    public R visit(latte.Absyn.Primitive p, A arg)
    { /* Code for Primitive goes here */
      p.primitivetype_.accept(new PrimitiveTypeVisitor<R,A>(), arg);
      return null;
    }
    public R visit(latte.Absyn.Class p, A arg)
    { /* Code for Class goes here */
      p.classtype_.accept(new ClassTypeVisitor<R,A>(), arg);
      return null;
    }
  }
  public class ExprVisitor<R,A> implements latte.Absyn.Expr.Visitor<R,A>
  {
    public R visit(latte.Absyn.ENewArray p, A arg)
    { /* Code for ENewArray goes here */
      p.type_.accept(new TypeVisitor<R,A>(), arg);
      p.expr_.accept(new ExprVisitor<R,A>(), arg);
      return null;
    }
    public R visit(latte.Absyn.ENewObject p, A arg)
    { /* Code for ENewObject goes here */
        p.identp_.accept(new IdentPVisitor<R, A>(), arg);
      return null;
    }
    public R visit(latte.Absyn.EVar p, A arg)
    { /* Code for EVar goes here */
        p.identp_.accept(new IdentPVisitor<R, A>(), arg);
      return null;
    }
    public R visit(latte.Absyn.EArrayElem p, A arg)
    { /* Code for EArrayElem goes here */
        p.identp_.accept(new IdentPVisitor<R, A>(), arg);
        p.expr_.accept(new ExprVisitor<R, A>(), arg);
      return null;
    }
    public R visit(latte.Absyn.ELitInt p, A arg)
    { /* Code for ELitInt goes here */
      //p.integer_;
      return null;
    }
    public R visit(latte.Absyn.ELitTrue p, A arg)
    { /* Code for ELitTrue goes here */
      return null;
    }
    public R visit(latte.Absyn.ELitFalse p, A arg)
    { /* Code for ELitFalse goes here */
      return null;
    }
    public R visit(latte.Absyn.EAttr p, A arg)
    { /* Code for EAttr goes here */
        p.expr_.accept(new ExprVisitor<R, A>(), arg);
        p.identp_.accept(new IdentPVisitor<R, A>(), arg);
      return null;
    }
    public R visit(latte.Absyn.EMethod p, A arg)
    { /* Code for EMethod goes here */
        p.expr_.accept(new ExprVisitor<R, A>(), arg);
        p.identp_.accept(new IdentPVisitor<R, A>(), arg);
      for (latte.Absyn.Expr x: p.listexpr_) {
        x.accept(new ExprVisitor<R,A>(), arg);
      }
      return null;
    }
    public R visit(latte.Absyn.EApp p, A arg)
    { /* Code for EApp goes here */
        p.identp_.accept(new IdentPVisitor<R, A>(), arg);
      for (latte.Absyn.Expr x: p.listexpr_) {
        x.accept(new ExprVisitor<R,A>(), arg);
      }
      return null;
    }
    public R visit(latte.Absyn.ECast p, A arg)
    { /* Code for ECast goes here */
      p.type_.accept(new TypeVisitor<R,A>(), arg);
      p.expr_.accept(new ExprVisitor<R,A>(), arg);
      return null;
    }
    public R visit(latte.Absyn.EString p, A arg)
    { /* Code for EString goes here */
      //p.string_;
      return null;
    }
    public R visit(latte.Absyn.Neg p, A arg)
    { /* Code for Neg goes here */
      p.expr_.accept(new ExprVisitor<R,A>(), arg);
      return null;
    }
    public R visit(latte.Absyn.Not p, A arg)
    { /* Code for Not goes here */
      p.expr_.accept(new ExprVisitor<R,A>(), arg);
      return null;
    }
    public R visit(latte.Absyn.EMul p, A arg)
    { /* Code for EMul goes here */
      p.expr_1.accept(new ExprVisitor<R,A>(), arg);
      p.mulop_.accept(new MulOpVisitor<R,A>(), arg);
      p.expr_2.accept(new ExprVisitor<R,A>(), arg);
      return null;
    }
    public R visit(latte.Absyn.EAdd p, A arg)
    { /* Code for EAdd goes here */
      p.expr_1.accept(new ExprVisitor<R,A>(), arg);
      p.addop_.accept(new AddOpVisitor<R,A>(), arg);
      p.expr_2.accept(new ExprVisitor<R,A>(), arg);
      return null;
    }
    public R visit(latte.Absyn.ERel p, A arg)
    { /* Code for ERel goes here */
      p.expr_1.accept(new ExprVisitor<R,A>(), arg);
      p.relop_.accept(new RelOpVisitor<R,A>(), arg);
      p.expr_2.accept(new ExprVisitor<R,A>(), arg);
      return null;
    }
    public R visit(latte.Absyn.EAnd p, A arg)
    { /* Code for EAnd goes here */
      p.expr_1.accept(new ExprVisitor<R,A>(), arg);
      p.expr_2.accept(new ExprVisitor<R,A>(), arg);
      return null;
    }
    public R visit(latte.Absyn.EOr p, A arg)
    { /* Code for EOr goes here */
      p.expr_1.accept(new ExprVisitor<R,A>(), arg);
      p.expr_2.accept(new ExprVisitor<R,A>(), arg);
      return null;
    }
  }
  public class AddOpVisitor<R,A> implements latte.Absyn.AddOp.Visitor<R,A>
  {
    public R visit(latte.Absyn.Plus p, A arg)
    { /* Code for Plus goes here */
      return null;
    }
    public R visit(latte.Absyn.Minus p, A arg)
    { /* Code for Minus goes here */
      return null;
    }
  }
  public class MulOpVisitor<R,A> implements latte.Absyn.MulOp.Visitor<R,A>
  {
    public R visit(latte.Absyn.Times p, A arg)
    { /* Code for Times goes here */
      return null;
    }
    public R visit(latte.Absyn.Div p, A arg)
    { /* Code for Div goes here */
      return null;
    }
    public R visit(latte.Absyn.Mod p, A arg)
    { /* Code for Mod goes here */
      return null;
    }
  }
  public class RelOpVisitor<R,A> implements latte.Absyn.RelOp.Visitor<R,A>
  {
    public R visit(latte.Absyn.LTH p, A arg)
    { /* Code for LTH goes here */
      return null;
    }
    public R visit(latte.Absyn.LE p, A arg)
    { /* Code for LE goes here */
      return null;
    }
    public R visit(latte.Absyn.GTH p, A arg)
    { /* Code for GTH goes here */
      return null;
    }
    public R visit(latte.Absyn.GE p, A arg)
    { /* Code for GE goes here */
      return null;
    }
    public R visit(latte.Absyn.EQU p, A arg)
    { /* Code for EQU goes here */
      return null;
    }
    public R visit(latte.Absyn.NE p, A arg)
    { /* Code for NE goes here */
      return null;
    }
  }
}
