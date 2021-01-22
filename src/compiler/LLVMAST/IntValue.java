package compiler.LLVMAST;

import java.util.Objects;

public class IntValue implements Value {

    public int value;

    public IntValue(int value) {
        this.value = value;
    }

    @Override
    public String getType() {
        return "i32";
    }

    @Override
    public String toString() {
        return Integer.toString(value);
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        IntValue intValue = (IntValue) o;
        return value == intValue.value;
    }

    @Override
    public int hashCode() {
        return Objects.hash(value);
    }
}
