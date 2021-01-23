package compiler.LLVMAST;

import latte.Absyn.Void;
import latte.Absyn.*;

import java.util.HashMap;
import java.util.HashSet;
import java.util.Map;
import java.util.Set;

public class LLVMContext {
    public static Map<String, String> stringsToBeDeclared = new HashMap<String, String>();
    public static LLVMContextStack contextStack = new LLVMContextStack();
    public static Map<Instruction, Register> currentlyUsedExpressions = new HashMap<>();
    public static int registerCounter = 1;
    public static int stringCounter = 0;
    public static int labelCounter = 0;
    public static Set<String> usedFunctions = new HashSet<>();

    static {
        addVariable(new Fun(new Primitive(new Void()), null), "printString", null);
        addVariable(new Fun(new Primitive(new Void()), null), "printInt", null);
        addVariable(new Fun(new Primitive(new Int()), null), "readInt", null);
        addVariable(new Fun(new Primitive(new Str()), null), "readString", null);
        addVariable(new Fun(new Primitive(new Void()), null), "error", null);
        usedFunctions.add("main");
        stringsToBeDeclared.put("", "empty_string");
    }

    public static void addString(String string_) {
        if (!stringsToBeDeclared.containsKey(string_)) {
            stringsToBeDeclared.put(string_, "_" + stringCounter + "_string");
            stringCounter++;
        }
    }

    public static String generateStrings() {
        StringBuilder sb = new StringBuilder();
        for (String s : stringsToBeDeclared.keySet()) {
            sb.append(String.format("@%s = private unnamed_addr constant [%d x i8] c\"%s\\00\"", stringsToBeDeclared.get(s), s.length() + 1, s));
            sb.append("\n");
        }
        return sb.toString();
    }

    public static Value getVariable(String name) {
        for (var i = contextStack.stack.size() - 1; i >= 0; --i) {
            if (contextStack.stack.get(i).variableToRegister.containsKey(name)) {
                return contextStack.stack.get(i).variableToRegister.get(name);
            }
        }
        throw new RuntimeException("Couldn't find variable " + name);
    }

    public static int getNewVariable() {
        var v = registerCounter;
        ++registerCounter;
        return v;
    }

    public static void addVariable(Type type, String name, Value value) {
        if (type instanceof Fun) {
            contextStack.stack.get(contextStack.stack.size() - 1).variableToRegister.put(name, new FunctionRegister(type.toLLVM(), name));
            contextStack.stack.get(contextStack.stack.size() - 1).variableToType.put(name + "_function", type.toLLVM());
        } else {
            contextStack.stack.get(contextStack.stack.size() - 1).variableToRegister.put(name, value);
            contextStack.stack.get(contextStack.stack.size() - 1).variableToType.put(name, type.toLLVM());
        }
    }

    public static void updateVariable(String name, Value value) {
        for (var i = contextStack.stack.size() - 1; i >= 0; --i) {
            if (contextStack.stack.get(i).variableToRegister.containsKey(name)) {
                contextStack.stack.get(i).variableToRegister.put(name, value);
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
