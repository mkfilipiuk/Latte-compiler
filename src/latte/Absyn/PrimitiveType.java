package latte.Absyn; // Java Package generated by the BNF Converter.

public abstract class PrimitiveType implements java.io.Serializable {
  public abstract <R,A> R accept(PrimitiveType.Visitor<R,A> v, A arg);
  public interface Visitor <R,A> {
    public R visit(latte.Absyn.Int p, A arg);
    public R visit(latte.Absyn.Str p, A arg);
    public R visit(latte.Absyn.Bool p, A arg);
    public R visit(latte.Absyn.Void p, A arg);

  }

}
