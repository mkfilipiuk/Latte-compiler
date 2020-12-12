package latte.Absyn; // Java Package generated by the BNF Converter.

public class Init  extends Item {
  public final IdentP identp_;
    public final Expr expr_;
  public int line_num, col_num, offset;

    public Init(IdentP p1, Expr p2) {
        identp_ = p1;
        expr_ = p2;
    }

  public <R,A> R accept(latte.Absyn.Item.Visitor<R,A> v, A arg) { return v.visit(this, arg); }

  public boolean equals(java.lang.Object o) {
    if (this == o) return true;
    if (o instanceof latte.Absyn.Init) {
      latte.Absyn.Init x = (latte.Absyn.Init)o;
        return this.identp_.equals(x.identp_) && this.expr_.equals(x.expr_);
    }
    return false;
  }

  public int hashCode() {
      return 37 * (this.identp_.hashCode()) + this.expr_.hashCode();
  }


}
