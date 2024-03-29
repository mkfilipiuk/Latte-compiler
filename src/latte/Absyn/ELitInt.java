package latte.Absyn; // Java Package generated by the BNF Converter.

public class ELitInt  extends Expr {
  public final Integer integer_;
  public int line_num, col_num, offset;
  public ELitInt(Integer p1) {
      integer_ = p1;
      type = new Primitive(new Int());
  }

    public <R, A> R accept(latte.Absyn.Expr.Visitor<R, A> v, A arg) {
        return v.visit(this, arg);
    }

  public boolean equals(java.lang.Object o) {
    if (this == o) return true;
    if (o instanceof latte.Absyn.ELitInt) {
      latte.Absyn.ELitInt x = (latte.Absyn.ELitInt)o;
      return this.integer_.equals(x.integer_);
    }
    return false;
  }

  public int hashCode() {
    return this.integer_.hashCode();
  }


}
