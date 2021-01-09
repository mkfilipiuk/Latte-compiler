package compiler;

import compiler.LLVMAST.LLVMAST;
import latte.PrettyPrinter;
import latte.latteLexer;
import latte.latteParser;
import org.antlr.v4.runtime.*;
import org.antlr.v4.runtime.atn.ATNConfigSet;
import org.antlr.v4.runtime.dfa.DFA;

import java.io.FileReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.io.Reader;
import java.util.BitSet;

import static compiler.frontend.SemanticAnalysis.analyse;

class BNFCErrorListener implements ANTLRErrorListener
{
    @Override
    public void syntaxError(Recognizer<?, ?> recognizer, Object o, int i, int i1, String s, RecognitionException e)
    {
        throw new LatteError(s,i,i1);
    }
    @Override
    public void reportAmbiguity(Parser parser, DFA dfa, int i, int i1, boolean b, BitSet bitSet, ATNConfigSet atnConfigSet)
    {
        throw new LatteError("Ambiguity at",i,i1);
    }
    @Override
    public void reportAttemptingFullContext(Parser parser, DFA dfa, int i, int i1, BitSet bitSet, ATNConfigSet atnConfigSet)
    {
    }
    @Override
    public void reportContextSensitivity(Parser parser, DFA dfa, int i, int i1, int i2, ATNConfigSet atnConfigSet)
    {
    }
}

public class Compiler
{
    latteLexer l;
    latteParser p;

    public Compiler(String[] args)
    {
        try
        {
            Reader input;
            if (args.length == 0) input = new InputStreamReader(System.in);
            else input = new FileReader(args[0]);
            l = new latteLexer(new ANTLRInputStream(input));
            l.addErrorListener(new BNFCErrorListener());
        }
        catch(IOException e)
        {
            System.err.println("Error: File not found: " + args[0]);
            System.exit(1);
        }
        p = new latteParser(new CommonTokenStream(l));
        p.addErrorListener(new BNFCErrorListener());
    }

    public static void main(String[] args) throws Exception {
        var t = new Compiler(args);
        latte.Absyn.Prog AST = null;
        try {
            AST = t.parse();
            analyse(AST);
            var LLVMAST = new LLVMAST(AST);
            System.out.println(LLVMAST.toLLVMIR());
        } catch (LatteError e) {
            System.err.println("ERROR");
            System.err.println("At line " + e.line + ":");
            System.err.println("     " + e.getMessage());
            System.exit(1);
        }
        System.err.println("OK");
        System.err.println();
        System.err.println("Parse Succesful!");
        System.err.println();
        System.err.println("[Abstract Syntax]");
        System.err.println();
        System.err.println(PrettyPrinter.show(AST));
        System.err.println();
        System.err.println("[Linearized Tree]");
        System.err.println();
        System.err.println(PrettyPrinter.print(AST));
    }

    public latte.Absyn.Prog parse() throws Exception {
        /* The default parser is the first-defined entry point. */
        latteParser.Start_ProgContext pc = p.start_Prog();
        latte.Absyn.Prog ast = pc.result;

        return ast;
    }
}
