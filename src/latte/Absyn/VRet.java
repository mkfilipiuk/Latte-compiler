package latte.Absyn; // Java Package generated by the BNF Converter.

public class VRet  extends Stmt {
  public int line_num, col_num, offset;
  public VRet() { }

  public <R,A> R accept(latte.Absyn.Stmt.Visitor<R,A> v, A arg) { return v.visit(this, arg); }

  public boolean equals(java.lang.Object o) {
    if (this == o) return true;
    if (o instanceof latte.Absyn.VRet) {
      return true;
    }
    return false;
  }

  public int hashCode() {
    return 37;
  }


}
