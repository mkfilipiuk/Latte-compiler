package compiler.frontend;

import latte.Absyn.*;

import java.lang.Void;

public class SemanticAnalysis {
    public static void analyse(latte.Absyn.Prog AST){
        CheckForRepeatedArguments.checkForRepeatedArguments(AST);

    }
}
