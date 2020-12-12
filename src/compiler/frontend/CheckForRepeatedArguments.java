package compiler.frontend;

import compiler.frontend.LatteError;
import latte.Absyn.*;

import java.lang.Void;
import java.util.HashSet;
import java.util.Set;

public class CheckForRepeatedArguments {
    public static void checkForRepeatedArguments(latte.Absyn.Prog AST){
        AST.accept(new Prog.Visitor<Void, Void>() {
            @Override
            public Void visit(Program p, Void arg) {
                for(var def : p.listtopdef_){
                    def.accept(new TopDef.Visitor<Void, Void>() {
                        @Override
                        public Void visit(FnDef p, Void arg) {
                            p.funct_.accept(new Funct.Visitor<Void, Void>() {
                                @Override
                                public Void visit(Function p, Void arg) {
                                    Set<String> argumentNamesSet = new HashSet<>();
                                    for(var argument : p.listarg_) {
                                        var ident  = argument.accept(new Arg.Visitor<String, Void>() {
                                            @Override
                                            public String visit(Argument p, Void arg) {
                                                return p.ident_;
                                            }
                                        }, null);
                                        if (argumentNamesSet.contains(ident)){
                                            throw new LatteError(String.format("Found duplicated function argument %s", ident),
                                                argument.accept(new Arg.Visitor<Integer, Object>() {
                                                    @Override
                                                    public Integer visit(Argument p, Object arg) {
                                                        return p.line_num;
                                                    }
                                                }, null),
                                                argument.accept(new Arg.Visitor<Integer, Object>() {
                                                    @Override
                                                    public Integer visit(Argument p, Object arg) {
                                                        return p.col_num;
                                                    }
                                                }, null)
                                            );
                                        }
                                        argumentNamesSet.add(ident);
                                    }
                                    return null;
                                }
                            }, null);
                            return null;
                        }

                        @Override
                        public Void visit(ClassDef p, Void arg) {
                            return null;
                        }

                        @Override
                        public Void visit(ClassDefExtend p, Void arg) {
                            return null;
                        }
                    }, null);
                }
                return null;
            }
        }, null);
    }
}
