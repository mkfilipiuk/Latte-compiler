package latte;
/** BNFC-Generated Composition Visitor
*/

public class ComposVisitor<A> implements
    latte.Absyn.Prog.Visitor<latte.Absyn.Prog, A>,
    latte.Absyn.IdentP.Visitor<latte.Absyn.IdentP, A>,
    latte.Absyn.Funct.Visitor<latte.Absyn.Funct, A>,
    latte.Absyn.TopDef.Visitor<latte.Absyn.TopDef, A>,
    latte.Absyn.Arg.Visitor<latte.Absyn.Arg, A>,
    latte.Absyn.ClsBlock.Visitor<latte.Absyn.ClsBlock, A>,
    latte.Absyn.ClsDef.Visitor<latte.Absyn.ClsDef, A>,
    latte.Absyn.ClsMethod.Visitor<latte.Absyn.ClsMethod, A>,
    latte.Absyn.ClsAttr.Visitor<latte.Absyn.ClsAttr, A>,
    latte.Absyn.Block.Visitor<latte.Absyn.Block, A>,
    latte.Absyn.Stmt.Visitor<latte.Absyn.Stmt, A>,
    latte.Absyn.Item.Visitor<latte.Absyn.Item, A>,
  latte.Absyn.PrimitiveType.Visitor<latte.Absyn.PrimitiveType,A>,
  latte.Absyn.ClassType.Visitor<latte.Absyn.ClassType,A>,
  latte.Absyn.Type.Visitor<latte.Absyn.Type,A>,
  latte.Absyn.Expr.Visitor<latte.Absyn.Expr,A>,
  latte.Absyn.AddOp.Visitor<latte.Absyn.AddOp,A>,
  latte.Absyn.MulOp.Visitor<latte.Absyn.MulOp,A>,
  latte.Absyn.RelOp.Visitor<latte.Absyn.RelOp,A>
{
    /* Prog */
    public latte.Absyn.Prog visit(latte.Absyn.Program p, A arg) {
        latte.Absyn.ListTopDef listtopdef_ = new latte.Absyn.ListTopDef();
        for (latte.Absyn.TopDef x : p.listtopdef_) {
            listtopdef_.add(x.accept(this, arg));
        }
        return new latte.Absyn.Program(listtopdef_);
    }

    /* IdentP */
    public latte.Absyn.IdentP visit(latte.Absyn.IdentPos p, A arg) {
        String ident_ = p.ident_;
        return new latte.Absyn.IdentPos(ident_);
    }

    /* Funct */
    public latte.Absyn.Funct visit(latte.Absyn.Function p, A arg) {
        latte.Absyn.Type type_ = p.type_.accept(this, arg);
        latte.Absyn.IdentP identp_ = p.identp_.accept(this, arg);
        latte.Absyn.ListArg listarg_ = new latte.Absyn.ListArg();
        for (latte.Absyn.Arg x : p.listarg_) {
            listarg_.add(x.accept(this, arg));
      }
      latte.Absyn.Block block_ = p.block_.accept(this, arg);
        return new latte.Absyn.Function(type_, identp_, listarg_, block_);
    }

    /* TopDef */
    public latte.Absyn.TopDef visit(latte.Absyn.FnDef p, A arg)
    {
      latte.Absyn.Funct funct_ = p.funct_.accept(this, arg);
      return new latte.Absyn.FnDef(funct_);
    }
    public latte.Absyn.TopDef visit(latte.Absyn.ClassDef p, A arg)
    {
        latte.Absyn.IdentP identp_ = p.identp_.accept(this, arg);
        latte.Absyn.ClsBlock clsblock_ = p.clsblock_.accept(this, arg);
        return new latte.Absyn.ClassDef(identp_, clsblock_);
    }
    public latte.Absyn.TopDef visit(latte.Absyn.ClassDefExtend p, A arg) {
        latte.Absyn.IdentP identp_1 = p.identp_1.accept(this, arg);
        latte.Absyn.IdentP identp_2 = p.identp_2.accept(this, arg);
        latte.Absyn.ClsBlock clsblock_ = p.clsblock_.accept(this, arg);
        return new latte.Absyn.ClassDefExtend(identp_1, identp_2, clsblock_);
    }

    /* Arg */
    public latte.Absyn.Arg visit(latte.Absyn.Argument p, A arg) {
        latte.Absyn.Type type_ = p.type_.accept(this, arg);
        latte.Absyn.IdentP identp_ = p.identp_.accept(this, arg);
        return new latte.Absyn.Argument(type_, identp_);
    }

    /* ClsBlock */
    public latte.Absyn.ClsBlock visit(latte.Absyn.ClassBlock p, A arg)
    {
      latte.Absyn.ListClsDef listclsdef_ = new latte.Absyn.ListClsDef();
      for (latte.Absyn.ClsDef x : p.listclsdef_)
      {
        listclsdef_.add(x.accept(this,arg));
      }
      return new latte.Absyn.ClassBlock(listclsdef_);
    }

    /* ClsDef */
    public latte.Absyn.ClsDef visit(latte.Absyn.ClassDefAttr p, A arg)
    {
      latte.Absyn.ClsAttr clsattr_ = p.clsattr_.accept(this, arg);
      return new latte.Absyn.ClassDefAttr(clsattr_);
    }
    public latte.Absyn.ClsDef visit(latte.Absyn.ClassDefMethod p, A arg)
    {
      latte.Absyn.ClsMethod clsmethod_ = p.clsmethod_.accept(this, arg);
      return new latte.Absyn.ClassDefMethod(clsmethod_);
    }

    /* ClsMethod */
    public latte.Absyn.ClsMethod visit(latte.Absyn.ClassMethod p, A arg)
    {
      latte.Absyn.Funct funct_ = p.funct_.accept(this, arg);
      return new latte.Absyn.ClassMethod(funct_);
    }

    /* ClsAttr */
    public latte.Absyn.ClsAttr visit(latte.Absyn.ClassAttribute p, A arg) {
        latte.Absyn.Type type_ = p.type_.accept(this, arg);
        latte.Absyn.IdentP identp_ = p.identp_.accept(this, arg);
        return new latte.Absyn.ClassAttribute(type_, identp_);
    }

    /* Block */
    public latte.Absyn.Block visit(latte.Absyn.BlockOfStatements p, A arg)
    {
      latte.Absyn.ListStmt liststmt_ = new latte.Absyn.ListStmt();
      for (latte.Absyn.Stmt x : p.liststmt_)
      {
        liststmt_.add(x.accept(this,arg));
      }
      return new latte.Absyn.BlockOfStatements(liststmt_);
    }

    /* Stmt */
    public latte.Absyn.Stmt visit(latte.Absyn.Empty p, A arg)
    {
      return new latte.Absyn.Empty();
    }
    public latte.Absyn.Stmt visit(latte.Absyn.BStmt p, A arg)
    {
      latte.Absyn.Block block_ = p.block_.accept(this, arg);
      return new latte.Absyn.BStmt(block_);
    }
    public latte.Absyn.Stmt visit(latte.Absyn.Decl p, A arg)
    {
      latte.Absyn.Type type_ = p.type_.accept(this, arg);
      latte.Absyn.ListItem listitem_ = new latte.Absyn.ListItem();
      for (latte.Absyn.Item x : p.listitem_)
      {
        listitem_.add(x.accept(this,arg));
      }
      return new latte.Absyn.Decl(type_, listitem_);
    }
    public latte.Absyn.Stmt visit(latte.Absyn.Ass p, A arg)
    {
        latte.Absyn.IdentP identp_ = p.identp_.accept(this, arg);
        latte.Absyn.Expr expr_ = p.expr_.accept(this, arg);
        return new latte.Absyn.Ass(identp_, expr_);
    }
    public latte.Absyn.Stmt visit(latte.Absyn.AssArr p, A arg)
    {
        latte.Absyn.IdentP identp_ = p.identp_.accept(this, arg);
        latte.Absyn.Expr expr_1 = p.expr_1.accept(this, arg);
      latte.Absyn.Expr expr_2 = p.expr_2.accept(this, arg);
        return new latte.Absyn.AssArr(identp_, expr_1, expr_2);
    }
    public latte.Absyn.Stmt visit(latte.Absyn.AssAttr p, A arg)
    {
        latte.Absyn.Expr expr_1 = p.expr_1.accept(this, arg);
        latte.Absyn.IdentP identp_ = p.identp_.accept(this, arg);
        latte.Absyn.Expr expr_2 = p.expr_2.accept(this, arg);
        return new latte.Absyn.AssAttr(expr_1, identp_, expr_2);
    }
    public latte.Absyn.Stmt visit(latte.Absyn.Incr p, A arg) {
        latte.Absyn.IdentP identp_ = p.identp_.accept(this, arg);
        return new latte.Absyn.Incr(identp_);
    }
    public latte.Absyn.Stmt visit(latte.Absyn.Decr p, A arg) {
        latte.Absyn.IdentP identp_ = p.identp_.accept(this, arg);
        return new latte.Absyn.Decr(identp_);
    }
    public latte.Absyn.Stmt visit(latte.Absyn.Ret p, A arg)
    {
      latte.Absyn.Expr expr_ = p.expr_.accept(this, arg);
      return new latte.Absyn.Ret(expr_);
    }
    public latte.Absyn.Stmt visit(latte.Absyn.VRet p, A arg)
    {
      return new latte.Absyn.VRet();
    }
    public latte.Absyn.Stmt visit(latte.Absyn.Cond p, A arg)
    {
      latte.Absyn.Expr expr_ = p.expr_.accept(this, arg);
      latte.Absyn.Stmt stmt_ = p.stmt_.accept(this, arg);
      return new latte.Absyn.Cond(expr_, stmt_);
    }
    public latte.Absyn.Stmt visit(latte.Absyn.CondElse p, A arg)
    {
      latte.Absyn.Expr expr_ = p.expr_.accept(this, arg);
      latte.Absyn.Stmt stmt_1 = p.stmt_1.accept(this, arg);
      latte.Absyn.Stmt stmt_2 = p.stmt_2.accept(this, arg);
      return new latte.Absyn.CondElse(expr_, stmt_1, stmt_2);
    }
    public latte.Absyn.Stmt visit(latte.Absyn.While p, A arg)
    {
      latte.Absyn.Expr expr_ = p.expr_.accept(this, arg);
      latte.Absyn.Stmt stmt_ = p.stmt_.accept(this, arg);
      return new latte.Absyn.While(expr_, stmt_);
    }
    public latte.Absyn.Stmt visit(latte.Absyn.For p, A arg)
    {
      latte.Absyn.Arg arg_ = p.arg_.accept(this, arg);
      latte.Absyn.Expr expr_ = p.expr_.accept(this, arg);
      latte.Absyn.Stmt stmt_ = p.stmt_.accept(this, arg);
      return new latte.Absyn.For(arg_, expr_, stmt_);
    }
    public latte.Absyn.Stmt visit(latte.Absyn.SExp p, A arg)
    {
      latte.Absyn.Expr expr_ = p.expr_.accept(this, arg);
      return new latte.Absyn.SExp(expr_);
    }

    /* Item */
    public latte.Absyn.Item visit(latte.Absyn.NoInit p, A arg) {
        latte.Absyn.IdentP identp_ = p.identp_.accept(this, arg);
        return new latte.Absyn.NoInit(identp_);
    }
    public latte.Absyn.Item visit(latte.Absyn.Init p, A arg)
    {
        latte.Absyn.IdentP identp_ = p.identp_.accept(this, arg);
        latte.Absyn.Expr expr_ = p.expr_.accept(this, arg);
        return new latte.Absyn.Init(identp_, expr_);
    }

    /* PrimitiveType */
    public latte.Absyn.PrimitiveType visit(latte.Absyn.Int p, A arg)
    {
      return new latte.Absyn.Int();
    }
    public latte.Absyn.PrimitiveType visit(latte.Absyn.Str p, A arg)
    {
      return new latte.Absyn.Str();
    }
    public latte.Absyn.PrimitiveType visit(latte.Absyn.Bool p, A arg)
    {
      return new latte.Absyn.Bool();
    }
    public latte.Absyn.PrimitiveType visit(latte.Absyn.Void p, A arg)
    {
      return new latte.Absyn.Void();
    }

    /* ClassType */
    public latte.Absyn.ClassType visit(latte.Absyn.ClassT p, A arg) {
        latte.Absyn.IdentP identp_ = p.identp_.accept(this, arg);
        return new latte.Absyn.ClassT(identp_);
    }

    /* Type */
    public latte.Absyn.Type visit(latte.Absyn.ArrayT p, A arg)
    {
      latte.Absyn.Type type_ = p.type_.accept(this, arg);
      return new latte.Absyn.ArrayT(type_);
    }
    public latte.Absyn.Type visit(latte.Absyn.Fun p, A arg)
    {
      latte.Absyn.Type type_ = p.type_.accept(this, arg);
      latte.Absyn.ListType listtype_ = new latte.Absyn.ListType();
      for (latte.Absyn.Type x : p.listtype_)
      {
        listtype_.add(x.accept(this,arg));
      }
      return new latte.Absyn.Fun(type_, listtype_);
    }
    public latte.Absyn.Type visit(latte.Absyn.Primitive p, A arg)
    {
      latte.Absyn.PrimitiveType primitivetype_ = p.primitivetype_.accept(this, arg);
      return new latte.Absyn.Primitive(primitivetype_);
    }
    public latte.Absyn.Type visit(latte.Absyn.Class p, A arg)
    {
      latte.Absyn.ClassType classtype_ = p.classtype_.accept(this, arg);
      return new latte.Absyn.Class(classtype_);
    }

    /* Expr */
    public latte.Absyn.Expr visit(latte.Absyn.ENewArray p, A arg)
    {
      latte.Absyn.Type type_ = p.type_.accept(this, arg);
      latte.Absyn.Expr expr_ = p.expr_.accept(this, arg);
      return new latte.Absyn.ENewArray(type_, expr_);
    }
    public latte.Absyn.Expr visit(latte.Absyn.ENewObject p, A arg) {
        latte.Absyn.IdentP identp_ = p.identp_.accept(this, arg);
        return new latte.Absyn.ENewObject(identp_);
    }
    public latte.Absyn.Expr visit(latte.Absyn.EVar p, A arg) {
        latte.Absyn.IdentP identp_ = p.identp_.accept(this, arg);
        return new latte.Absyn.EVar(identp_);
    }
    public latte.Absyn.Expr visit(latte.Absyn.EArrayElem p, A arg)
    {
        latte.Absyn.IdentP identp_ = p.identp_.accept(this, arg);
        latte.Absyn.Expr expr_ = p.expr_.accept(this, arg);
        return new latte.Absyn.EArrayElem(identp_, expr_);
    }
    public latte.Absyn.Expr visit(latte.Absyn.ELitInt p, A arg)
    {
      Integer integer_ = p.integer_;
      return new latte.Absyn.ELitInt(integer_);
    }
    public latte.Absyn.Expr visit(latte.Absyn.ELitTrue p, A arg)
    {
      return new latte.Absyn.ELitTrue();
    }
    public latte.Absyn.Expr visit(latte.Absyn.ELitFalse p, A arg)
    {
      return new latte.Absyn.ELitFalse();
    }
    public latte.Absyn.Expr visit(latte.Absyn.EAttr p, A arg) {
        latte.Absyn.Expr expr_ = p.expr_.accept(this, arg);
        latte.Absyn.IdentP identp_ = p.identp_.accept(this, arg);
        return new latte.Absyn.EAttr(expr_, identp_);
    }
    public latte.Absyn.Expr visit(latte.Absyn.EMethod p, A arg)
    {
        latte.Absyn.Expr expr_ = p.expr_.accept(this, arg);
        latte.Absyn.IdentP identp_ = p.identp_.accept(this, arg);
        latte.Absyn.ListExpr listexpr_ = new latte.Absyn.ListExpr();
      for (latte.Absyn.Expr x : p.listexpr_)
      {
        listexpr_.add(x.accept(this,arg));
      }
        return new latte.Absyn.EMethod(expr_, identp_, listexpr_);
    }
    public latte.Absyn.Expr visit(latte.Absyn.EApp p, A arg)
    {
        latte.Absyn.IdentP identp_ = p.identp_.accept(this, arg);
        latte.Absyn.ListExpr listexpr_ = new latte.Absyn.ListExpr();
      for (latte.Absyn.Expr x : p.listexpr_)
      {
        listexpr_.add(x.accept(this,arg));
      }
        return new latte.Absyn.EApp(identp_, listexpr_);
    }
    public latte.Absyn.Expr visit(latte.Absyn.ECast p, A arg)
    {
      latte.Absyn.Type type_ = p.type_.accept(this, arg);
      latte.Absyn.Expr expr_ = p.expr_.accept(this, arg);
      return new latte.Absyn.ECast(type_, expr_);
    }
    public latte.Absyn.Expr visit(latte.Absyn.EString p, A arg)
    {
      String string_ = p.string_;
      return new latte.Absyn.EString(string_);
    }
    public latte.Absyn.Expr visit(latte.Absyn.Neg p, A arg)
    {
      latte.Absyn.Expr expr_ = p.expr_.accept(this, arg);
      return new latte.Absyn.Neg(expr_);
    }
    public latte.Absyn.Expr visit(latte.Absyn.Not p, A arg)
    {
      latte.Absyn.Expr expr_ = p.expr_.accept(this, arg);
      return new latte.Absyn.Not(expr_);
    }
    public latte.Absyn.Expr visit(latte.Absyn.EMul p, A arg)
    {
      latte.Absyn.Expr expr_1 = p.expr_1.accept(this, arg);
      latte.Absyn.MulOp mulop_ = p.mulop_.accept(this, arg);
      latte.Absyn.Expr expr_2 = p.expr_2.accept(this, arg);
      return new latte.Absyn.EMul(expr_1, mulop_, expr_2);
    }
    public latte.Absyn.Expr visit(latte.Absyn.EAdd p, A arg)
    {
      latte.Absyn.Expr expr_1 = p.expr_1.accept(this, arg);
      latte.Absyn.AddOp addop_ = p.addop_.accept(this, arg);
      latte.Absyn.Expr expr_2 = p.expr_2.accept(this, arg);
      return new latte.Absyn.EAdd(expr_1, addop_, expr_2);
    }
    public latte.Absyn.Expr visit(latte.Absyn.ERel p, A arg)
    {
      latte.Absyn.Expr expr_1 = p.expr_1.accept(this, arg);
      latte.Absyn.RelOp relop_ = p.relop_.accept(this, arg);
      latte.Absyn.Expr expr_2 = p.expr_2.accept(this, arg);
      return new latte.Absyn.ERel(expr_1, relop_, expr_2);
    }
    public latte.Absyn.Expr visit(latte.Absyn.EAnd p, A arg)
    {
      latte.Absyn.Expr expr_1 = p.expr_1.accept(this, arg);
      latte.Absyn.Expr expr_2 = p.expr_2.accept(this, arg);
      return new latte.Absyn.EAnd(expr_1, expr_2);
    }
    public latte.Absyn.Expr visit(latte.Absyn.EOr p, A arg)
    {
      latte.Absyn.Expr expr_1 = p.expr_1.accept(this, arg);
      latte.Absyn.Expr expr_2 = p.expr_2.accept(this, arg);
      return new latte.Absyn.EOr(expr_1, expr_2);
    }

    /* AddOp */
    public latte.Absyn.AddOp visit(latte.Absyn.Plus p, A arg)
    {
      return new latte.Absyn.Plus();
    }
    public latte.Absyn.AddOp visit(latte.Absyn.Minus p, A arg)
    {
      return new latte.Absyn.Minus();
    }

    /* MulOp */
    public latte.Absyn.MulOp visit(latte.Absyn.Times p, A arg)
    {
      return new latte.Absyn.Times();
    }
    public latte.Absyn.MulOp visit(latte.Absyn.Div p, A arg)
    {
      return new latte.Absyn.Div();
    }
    public latte.Absyn.MulOp visit(latte.Absyn.Mod p, A arg)
    {
      return new latte.Absyn.Mod();
    }

    /* RelOp */
    public latte.Absyn.RelOp visit(latte.Absyn.LTH p, A arg)
    {
      return new latte.Absyn.LTH();
    }
    public latte.Absyn.RelOp visit(latte.Absyn.LE p, A arg)
    {
      return new latte.Absyn.LE();
    }
    public latte.Absyn.RelOp visit(latte.Absyn.GTH p, A arg)
    {
      return new latte.Absyn.GTH();
    }
    public latte.Absyn.RelOp visit(latte.Absyn.GE p, A arg)
    {
      return new latte.Absyn.GE();
    }
    public latte.Absyn.RelOp visit(latte.Absyn.EQU p, A arg)
    {
      return new latte.Absyn.EQU();
    }
    public latte.Absyn.RelOp visit(latte.Absyn.NE p, A arg)
    {
      return new latte.Absyn.NE();
    }
}
