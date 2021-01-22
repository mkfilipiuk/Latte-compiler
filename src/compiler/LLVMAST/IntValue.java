package compiler.LLVMAST;

import latte.Absyn.Int;
import latte.Absyn.Primitive;
import latte.Absyn.Type;

public class IntValue implements Value {

    public int value;

    public IntValue(int value) {
        this.value = value;
    }

    @Override
    public Type getType() {
        return new Primitive(new Int());
    }

    @Override
    public String toString() {
        return Integer.toString(value);
    }
}
