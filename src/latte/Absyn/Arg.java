package latte.Absyn; // Java Package generated by the BNF Converter.

public abstract class Arg implements java.io.Serializable {
  public abstract <R,A> R accept(Arg.Visitor<R,A> v, A arg);
  public interface Visitor <R,A> {
    public R visit(latte.Absyn.Argument p, A arg);

  }

}
