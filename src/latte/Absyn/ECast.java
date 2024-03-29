package latte.Absyn; // Java Package generated by the BNF Converter.

public class ECast  extends Expr {
  public final Type type_;
  public final Expr expr_;
  public int line_num, col_num, offset;
  public ECast(Type p1, Expr p2) { type_ = p1; expr_ = p2; }

  public <R,A> R accept(latte.Absyn.Expr.Visitor<R,A> v, A arg) { return v.visit(this, arg); }

  public boolean equals(java.lang.Object o) {
    if (this == o) return true;
    if (o instanceof latte.Absyn.ECast) {
      latte.Absyn.ECast x = (latte.Absyn.ECast)o;
      return this.type_.equals(x.type_) && this.expr_.equals(x.expr_);
    }
    return false;
  }

  public int hashCode() {
    return 37*(this.type_.hashCode())+this.expr_.hashCode();
  }


}
