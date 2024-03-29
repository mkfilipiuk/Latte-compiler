package latte.Absyn; // Java Package generated by the BNF Converter.

public class While  extends Stmt {
  public final Expr expr_;
  public final Stmt stmt_;
  public int line_num, col_num, offset;
  public While(Expr p1, Stmt p2) { expr_ = p1; stmt_ = p2; }

  public <R,A> R accept(latte.Absyn.Stmt.Visitor<R,A> v, A arg) { return v.visit(this, arg); }

  public boolean equals(java.lang.Object o) {
    if (this == o) return true;
    if (o instanceof latte.Absyn.While) {
      latte.Absyn.While x = (latte.Absyn.While)o;
      return this.expr_.equals(x.expr_) && this.stmt_.equals(x.stmt_);
    }
    return false;
  }

  public int hashCode() {
    return 37*(this.expr_.hashCode())+this.stmt_.hashCode();
  }


}
