package latte.Absyn; // Java Package generated by the BNF Converter.

public abstract class IdentP implements java.io.Serializable {
    public abstract <R, A> R accept(IdentP.Visitor<R, A> v, A arg);

    public interface Visitor<R, A> {
        R visit(latte.Absyn.IdentPos p, A arg);

    }

}
