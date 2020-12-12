package compiler;

public class LatteError extends RuntimeException {
    public int line;
    public int column;

    public LatteError(String msg, int l, int c) {
        super(msg);
        line = l;
        column = c;
    }
}
