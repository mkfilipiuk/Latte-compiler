package compiler.LLVMAST;

import latte.Absyn.Void;
import latte.Absyn.*;

import java.util.HashMap;
import java.util.Map;

public class LLVMContext {
    public static Map<String, String> stringsToBeDeclared = new HashMap<String, String>();
    public static LLVMContextStack contextStack = new LLVMContextStack();
    public static int registerCounter = 1;
    public static int stringCounter = 0;
    public static int labelCounter = 0;

    static {
        addVariable(new Fun(new Primitive(new Void()), null), "printString");
        addVariable(new Fun(new Primitive(new Void()), null), "printInt");
        addVariable(new Fun(new Primitive(new Int()), null), "readInt");
        addVariable(new Fun(new Primitive(new Str()), null), "readString");
        addVariable(new Fun(new Primitive(new Void()), null), "error");
    }

    public static void addString(String string_) {
        stringsToBeDeclared.put(string_, "_" + stringCounter + "_string");
        stringCounter++;
    }

    public static String generateStrings() {
        StringBuilder sb = new StringBuilder();
        for (String s : stringsToBeDeclared.keySet()) {
            sb.append(String.format("@%s = private unnamed_addr constant [%d x i8] c\"%s\\00\"", stringsToBeDeclared.get(s), s.length() + 1, s));
            sb.append("\n");
        }
        return sb.toString();
    }

    public static String getVariable(String name) {
        for (var i = contextStack.stack.size() - 1; i >= 0; --i) {
            if (contextStack.stack.get(i).variableToRegister.containsKey(name)) {
                return contextStack.stack.get(i).variableToRegister.get(name);
            }
        }
        throw new RuntimeException("Couldn't find variable " + name);
    }

    public static String getNewVariable() {
        var v = "%" + registerCounter;
        ++registerCounter;
        return v;
    }

    public static String addVariable(Type type, String name) {
        if (type instanceof Fun) {
            contextStack.stack.get(contextStack.stack.size() - 1).variableToRegister.put(name, "@" + name + "_function");
            contextStack.stack.get(contextStack.stack.size() - 1).variableToType.put(name + "_function", type.toLLVM());
            return null;
        } else {
            var v = LLVMContext.getNewVariable();
            contextStack.stack.get(contextStack.stack.size() - 1).variableToRegister.put(name, v);
            contextStack.stack.get(contextStack.stack.size() - 1).variableToType.put(name, type.toLLVM());
            return v;
        }
    }

    public static String addVariable(Type type, String name, String register) {
        contextStack.stack.get(contextStack.stack.size() - 1).variableToRegister.put(name, register);
        contextStack.stack.get(contextStack.stack.size() - 1).variableToType.put(name, type.toLLVM());
        return register;
    }

    public static String updateVariable(String name) {
        for (var i = contextStack.stack.size() - 1; i >= 0; --i) {
            if (contextStack.stack.get(i).variableToRegister.containsKey(name)) {
                var v = "%" + registerCounter;
                contextStack.stack.get(i).variableToRegister.put(name, v);
                registerCounter++;
                return v;
            }
        }
        throw new RuntimeException("Couldn't find variable " + name);
    }

    public static void updateVariable(String name, String x) {
        for (var i = contextStack.stack.size() - 1; i >= 0; --i) {
            if (contextStack.stack.get(i).variableToRegister.containsKey(name)) {
                contextStack.stack.get(i).variableToRegister.put(name, x);
                return;
            }
        }
        throw new RuntimeException("Couldn't find variable " + name);
    }

    public static void addNewContext() {
        contextStack.stack.add(new LLVMContextStackElement());
    }

    public static void removeContext() {
        contextStack.stack.remove(contextStack.stack.size() - 1);
    }

    public static String getType(String name) {
        for (var i = contextStack.stack.size() - 1; i >= 0; --i) {
            if (contextStack.stack.get(i).variableToType.containsKey(name)) {
                return contextStack.stack.get(i).variableToType.get(name);
            }
        }
        throw new RuntimeException("Couldn't find variable " + name);
    }

    public static String getNewLabel(String label) {
        ++labelCounter;
        return label + "_" + labelCounter;
    }

    public LLVMContextStack getContextStackClone() {
        return contextStack.clone();
    }
}