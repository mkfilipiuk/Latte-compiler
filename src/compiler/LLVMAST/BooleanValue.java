package compiler.LLVMAST;

import java.util.Objects;

public class BooleanValue implements Value {
    public boolean b;

    public BooleanValue(boolean b) {
        this.b = b;
    }

    @Override
    public String getType() {
        return "i1";
    }

    @Override
    public String toString() {
        return b ? "1" : "0";
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        BooleanValue that = (BooleanValue) o;
        return b == that.b;
    }

    @Override
    public int hashCode() {
        return Objects.hash(b);
    }
}
