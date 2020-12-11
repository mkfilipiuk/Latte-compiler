package latte.Absyn; // Java Package generated by the BNF Converter.

public class CondElse  extends Stmt {
  public final Expr expr_;
  public final Stmt stmt_1, stmt_2;
  public int line_num, col_num, offset;
  public CondElse(Expr p1, Stmt p2, Stmt p3) { expr_ = p1; stmt_1 = p2; stmt_2 = p3; }

  public <R,A> R accept(latte.Absyn.Stmt.Visitor<R,A> v, A arg) { return v.visit(this, arg); }

  public boolean equals(java.lang.Object o) {
    if (this == o) return true;
    if (o instanceof latte.Absyn.CondElse) {
      latte.Absyn.CondElse x = (latte.Absyn.CondElse)o;
      return this.expr_.equals(x.expr_) && this.stmt_1.equals(x.stmt_1) && this.stmt_2.equals(x.stmt_2);
    }
    return false;
  }

  public int hashCode() {
    return 37*(37*(this.expr_.hashCode())+this.stmt_1.hashCode())+this.stmt_2.hashCode();
  }


}
