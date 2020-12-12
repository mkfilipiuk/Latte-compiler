package compiler.frontend;

import latte.Absyn.Type;

import java.util.HashMap;

public class VariableBlockContext {
    public HashMap<String, Type> variableToType;

    public VariableBlockContext() {
        variableToType = new HashMap<String, Type>();
    }
}
