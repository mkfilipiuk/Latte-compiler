package latte.Absyn; // Java Package generated by the BNF Converter.

public abstract class RelOp implements java.io.Serializable {
    public abstract <R, A> R accept(RelOp.Visitor<R, A> v, A arg);

    public abstract String toLLVMOperator();

    public interface Visitor<R, A> {
        R visit(latte.Absyn.LTH p, A arg);

        R visit(latte.Absyn.LE p, A arg);

        R visit(latte.Absyn.GTH p, A arg);

        R visit(latte.Absyn.GE p, A arg);

        R visit(latte.Absyn.EQU p, A arg);

        R visit(latte.Absyn.NE p, A arg);

    }

}
