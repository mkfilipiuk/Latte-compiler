package latte.Absyn; // Java Package generated by the BNF Converter.

public abstract class AddOp implements java.io.Serializable {
    public abstract <R, A> R accept(AddOp.Visitor<R, A> v, A arg);

    public Type type;

    public interface Visitor<R, A> {
        R visit(latte.Absyn.Plus p, A arg);

        R visit(latte.Absyn.Minus p, A arg);

    }
}
