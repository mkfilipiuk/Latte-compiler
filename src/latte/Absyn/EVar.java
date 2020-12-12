package latte.Absyn; // Java Package generated by the BNF Converter.

public class EVar  extends Expr {
  public final IdentP identp_;
    public int line_num, col_num, offset;

    public EVar(IdentP p1) {
        identp_ = p1;
    }

  public <R,A> R accept(latte.Absyn.Expr.Visitor<R,A> v, A arg) { return v.visit(this, arg); }

  public boolean equals(java.lang.Object o) {
    if (this == o) return true;
    if (o instanceof latte.Absyn.EVar) {
      latte.Absyn.EVar x = (latte.Absyn.EVar)o;
        return this.identp_.equals(x.identp_);
    }
    return false;
  }

  public int hashCode() {
      return this.identp_.hashCode();
  }


}
