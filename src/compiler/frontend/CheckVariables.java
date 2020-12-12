package compiler.frontend;

import compiler.LatteError;
import latte.Absyn.*;

import java.lang.Void;

public class CheckVariables {

    private static final Expr.Visitor<Type, VariableContext> exprVisitor = new Expr.Visitor<Type, VariableContext>() {
        @Override
        public Type visit(ENewArray p, VariableContext arg) {
            return p.expr_.accept(exprVisitor, arg);
        }

        @Override
        public Type visit(ENewObject p, VariableContext arg) {
            //TODO
            return null;
        }

        @Override
        public Type visit(EVar p, VariableContext arg) {
            var varName = getName(p.identp_);
            if (arg.get(varName) == null) {
                throw new LatteError(String.format("The variable %s doesn't exists", varName), p.line_num, p.col_num);
            }
            return arg.get(varName);
        }

        @Override
        public Type visit(EArrayElem p, VariableContext arg) {
            var varName = getName(p.identp_);
            if (arg.get(varName) == null) {
                throw new LatteError(String.format("The variable %s doesn't exists", varName), p.line_num, p.col_num);
            }
            if (!(arg.get(varName) instanceof ArrayT)) {
                throw new LatteError(String.format("The variable %s is not an array", varName), p.line_num, p.col_num);
            }
            p.expr_.accept(exprVisitor, arg);

            return ((ArrayT) arg.get(varName)).type_;
        }

        @Override
        public Type visit(ELitInt p, VariableContext arg) {
            return null;
        }

        @Override
        public Type visit(ELitTrue p, VariableContext arg) {
            return null;
        }

        @Override
        public Type visit(ELitFalse p, VariableContext arg) {
            return null;
        }

        @Override
        public Type visit(EAttr p, VariableContext arg) {
            return null;
        }

        @Override
        public Type visit(EMethod p, VariableContext arg) {
            return null;
        }

        @Override
        public Type visit(EApp p, VariableContext arg) {
            var varName = getName(p.identp_);
            if (arg.get(varName) == null) {
                throw new LatteError(String.format("The Function %s doesn't exists", varName), p.line_num, p.col_num);
            }
            ListType listType = new ListType();
            // TODO check types
//            for(var argument : p.listexpr_){
//                listType.add(argument.accept(new Arg.Visitor<Type, Void>() {
//                    @Override
//                    public Type visit(Argument p, Void arg) {
//                        return p.type_;
//                    }
//                }, null));
//            }
            return null;
        }

        @Override
        public Type visit(ECast p, VariableContext arg) {
            p.expr_.accept(exprVisitor, arg);
            return null;
        }

        @Override
        public Type visit(EString p, VariableContext arg) {
            return null;
        }

        @Override
        public Type visit(Neg p, VariableContext arg) {
            p.expr_.accept(exprVisitor, arg);
            return null;
        }

        @Override
        public Type visit(Not p, VariableContext arg) {
            p.expr_.accept(exprVisitor, arg);
            return null;
        }

        @Override
        public Type visit(EMul p, VariableContext arg) {
            p.expr_1.accept(exprVisitor, arg);
            p.expr_2.accept(exprVisitor, arg);
            return null;
        }

        @Override
        public Type visit(EAdd p, VariableContext arg) {
            p.expr_1.accept(exprVisitor, arg);
            p.expr_2.accept(exprVisitor, arg);
            return null;
        }

        @Override
        public Type visit(ERel p, VariableContext arg) {
            p.expr_1.accept(exprVisitor, arg);
            p.expr_2.accept(exprVisitor, arg);
            return null;
        }

        @Override
        public Type visit(EAnd p, VariableContext arg) {
            p.expr_1.accept(exprVisitor, arg);
            p.expr_2.accept(exprVisitor, arg);
            return null;
        }

        @Override
        public Type visit(EOr p, VariableContext arg) {
            p.expr_1.accept(exprVisitor, arg);
            p.expr_2.accept(exprVisitor, arg);
            return null;
        }
    };
    private static final Block.Visitor<Void, VariableContext> blockVisitor = new Block.Visitor<Void, VariableContext>() {
        @Override
        public Void visit(BlockOfStatements p, VariableContext arg) {
            for (var stmt : p.liststmt_) {
                stmt.accept(new Stmt.Visitor<Void, VariableContext>() {
                    @Override
                    public Void visit(Empty p, VariableContext arg) {
                        return null;
                    }

                    @Override
                    public Void visit(BStmt p, VariableContext arg) {
                        arg.pushNewContext();
                        p.block_.accept(blockVisitor, arg);
                        arg.popContext();
                        return null;
                    }

                    @Override
                    public Void visit(Decl p, VariableContext arg) {
                        for (var v : p.listitem_) {
                            String varName = v.accept(new Item.Visitor<String, VariableContext>() {
                                @Override
                                public String visit(NoInit p, VariableContext arg) {
                                    return getName(p.identp_);
                                }

                                @Override
                                public String visit(Init p, VariableContext arg) {
                                    return getName(p.identp_);
                                }
                            }, arg);
                            if (arg.contains(varName)) {
                                int line = v.accept(new Item.Visitor<Integer, Object>() {
                                    @Override
                                    public Integer visit(NoInit p, Object arg) {
                                        return p.line_num;
                                    }

                                    @Override
                                    public Integer visit(Init p, Object arg) {
                                        return p.line_num;
                                    }
                                }, null);

                                int column = v.accept(new Item.Visitor<Integer, Object>() {
                                    @Override
                                    public Integer visit(NoInit p, Object arg) {
                                        return p.line_num;
                                    }

                                    @Override
                                    public Integer visit(Init p, Object arg) {
                                        return p.col_num;
                                    }
                                }, null);
                                throw new LatteError(String.format("The variable %s already exists", varName), line, column);
                            }
                            arg.add(varName, p.type_);
                        }

                        return null;
                    }

                    @Override
                    public Void visit(Ass p, VariableContext arg) {
                        var varName = getName(p.identp_);
                        if (arg.get(varName) == null) {
                            throw new LatteError(String.format("The variable %s doesn't exists", varName), p.line_num, p.col_num);
                        }
                        return null;
                    }

                    @Override
                    public Void visit(AssArr p, VariableContext arg) {
                        var varName = getName(p.identp_);
                        if (arg.get(varName) == null) {
                            throw new LatteError(String.format("The variable %s doesn't exists", varName), p.line_num, p.col_num);
                        }
                        if (!(arg.get(varName) instanceof ArrayT)) {
                            throw new LatteError(String.format("The variable %s is not an array", varName), p.line_num, p.col_num);
                        }
                        return null;
                    }

                    @Override
                    public Void visit(AssAttr p, VariableContext arg) {
                        return null;
                    }

                    @Override
                    public Void visit(Incr p, VariableContext arg) {
                        var varName = getName(p.identp_);
                        if (arg.get(varName) == null) {
                            throw new LatteError(String.format("The variable %s doesn't exists", varName), p.line_num, p.col_num);
                        }
                        return null;
                    }

                    @Override
                    public Void visit(Decr p, VariableContext arg) {
                        var varName = getName(p.identp_);
                        if (arg.get(varName) == null) {
                            throw new LatteError(String.format("The variable %s doesn't exists", varName), p.line_num, p.col_num);
                        }
                        return null;
                    }

                    @Override
                    public Void visit(Ret p, VariableContext arg) {
                        //TODO
                        return null;
                    }

                    @Override
                    public Void visit(VRet p, VariableContext arg) {
                        return null;
                    }

                    @Override
                    public Void visit(Cond p, VariableContext arg) {
                        return null;
                    }

                    @Override
                    public Void visit(CondElse p, VariableContext arg) {
                        return null;
                    }

                    @Override
                    public Void visit(While p, VariableContext arg) {
                        return null;
                    }

                    @Override
                    public Void visit(For p, VariableContext arg) {
                        return null;
                    }

                    @Override
                    public Void visit(SExp p, VariableContext arg) {
                        p.expr_.accept(exprVisitor, arg);
                        return null;
                    }
                }, arg);
            }
            return null;
        }
    };

    private static String getName(IdentP identP) {
        return identP.accept(new IdentP.Visitor<String, Void>() {
            @Override
            public String visit(IdentPos p, Void arg) {
                return p.ident_;
            }
        }, null);
    }

    private static ListType getListOfTypes(Function f) {
        return f.accept(new Funct.Visitor<ListType, Void>() {
            @Override
            public ListType visit(Function p, Void arg) {
                ListType listType = new ListType();
                for (var argument : p.listarg_) {
                    listType.add(argument.accept(new Arg.Visitor<Type, Void>() {
                        @Override
                        public Type visit(Argument p, Void arg) {
                            return p.type_;
                        }
                    }, null));
                }
                return listType;
            }
        }, null);
    }

    public static void checkVariables(latte.Absyn.Prog AST) {
        var variables = new VariableContext();
        AST.accept(new Prog.Visitor<Void, VariableContext>() {
            @Override
            public Void visit(Program p, VariableContext arg) {
                for (var def : p.listtopdef_) {
                    def.accept(new TopDef.Visitor<Void, VariableContext>() {
                        @Override
                        public Void visit(FnDef p, VariableContext arg) {
                            p.funct_.accept(new Funct.Visitor<Void, VariableContext>() {
                                @Override
                                public Void visit(Function p, VariableContext arg) {
                                    arg.add(getName(p.identp_), new Fun(p.type_, getListOfTypes(p)));
                                    return null;
                                }
                            }, arg);
                            return null;
                        }

                        @Override
                        public Void visit(ClassDef p, VariableContext arg) {
                            // TODO
                            return null;
                        }

                        @Override
                        public Void visit(ClassDefExtend p, VariableContext arg) {
                            // TODO
                            return null;
                        }
                    }, variables);
                }

                for (var def : p.listtopdef_) {
                    def.accept(new TopDef.Visitor<Void, VariableContext>() {
                        @Override
                        public Void visit(FnDef p, VariableContext arg) {
                            p.funct_.accept(new Funct.Visitor<Void, VariableContext>() {
                                @Override
                                public Void visit(Function p, VariableContext arg) {
                                    arg.pushNewContext();
                                    for (var variable : p.listarg_) {
                                        variable.accept(new Arg.Visitor<Void, VariableContext>() {
                                            @Override
                                            public Void visit(Argument p, VariableContext arg) {
                                                if (arg.contains(getName(p.identp_))) {
                                                    throw new LatteError(String.format("The variable %s is already declared", getName(p.identp_)), p.line_num, p.col_num);
                                                }
                                                arg.add(getName(p.identp_), p.type_);
                                                return null;
                                            }
                                        }, arg);
                                    }
                                    p.block_.<Void, VariableContext>accept(blockVisitor, arg);
                                    arg.popContext();
                                    return null;
                                }
                            }, arg);
                            return null;
                        }

                        @Override
                        public Void visit(ClassDef p, VariableContext arg) {
                            return null;
                        }

                        @Override
                        public Void visit(ClassDefExtend p, VariableContext arg) {
                            return null;
                        }
                    }, variables);
                }
                return null;
            }
        }, null);

        if (variables.get("main") == null) {
            throw new LatteError(String.format("The main function doesn't exists"), 0, 0);
        }
    }
}
