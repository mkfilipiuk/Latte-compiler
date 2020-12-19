package compiler.frontend;

import latte.Absyn.Void;
import latte.Absyn.*;

import java.util.ArrayList;

public class VariableContext {
    public ArrayList<VariableBlockContext> stack;
    public String currentFunction;

    public VariableContext() {
        stack = new ArrayList<>();
        stack.add(new VariableBlockContext());
        var listType = new ListType();
        listType.add(new Primitive(new Int()));
        stack.get(0).variableToType.put("printInt", new Fun(new Primitive(new Void()), listType));
        listType = new ListType();
        listType.add(new Primitive(new Str()));
        stack.get(0).variableToType.put("printString", new Fun(new Primitive(new Void()), listType));
        listType = new ListType();
        stack.get(0).variableToType.put("error", new Fun(new Primitive(new Void()), listType));
        listType = new ListType();
        stack.get(0).variableToType.put("readInt", new Fun(new Primitive(new Int()), listType));
        listType = new ListType();
        stack.get(0).variableToType.put("readString", new Fun(new Primitive(new Str()), listType));
    }

    public VariableContext pushNewContext() {
        stack.add(new VariableBlockContext());
        return this;
    }

    public void popContext() {
        stack.remove(stack.size() - 1);
    }

    public boolean contains(String v) {
        return stack.get(stack.size() - 1).variableToType.containsKey(v);
    }

    public void add(String v, Type t) {
        stack.get(stack.size() - 1).variableToType.put(v, t);
    }

    public Type get(String v) {
        boolean r;
        for (int i = stack.size() - 1; i >= 0; --i) {
            r = stack.get(i).variableToType.containsKey(v);
            if (r) {
                return stack.get(i).variableToType.get(v);
            }
        }
        return null;
    }
}
