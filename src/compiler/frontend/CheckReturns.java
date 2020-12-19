package compiler.frontend;

import compiler.LatteError;
import latte.Absyn.*;

import java.lang.Void;

public class CheckReturns {

    private static final Block.Visitor<Boolean, Void> blockVisitor = new Block.Visitor<Boolean, Void>() {
        @Override
        public Boolean visit(BlockOfStatements p, Void arg) {
            boolean isThereReturn = false;
            for (var stmt : p.liststmt_) {
                var isReturn = stmt.accept(stmtVisitor, null);
                isThereReturn = isReturn || isThereReturn;
            }
            return isThereReturn;
        }
    };
    private static final Stmt.Visitor<Boolean, Void> stmtVisitor = new Stmt.Visitor<Boolean, Void>() {
        @Override
        public Boolean visit(Empty p, Void arg) {
            return false;
        }

        @Override
        public Boolean visit(BStmt p, Void arg) {
            return p.block_.accept(blockVisitor, null);
        }

        @Override
        public Boolean visit(Decl p, Void arg) {
            return false;
        }

        @Override
        public Boolean visit(Ass p, Void arg) {
            return false;
        }

        @Override
        public Boolean visit(AssArr p, Void arg) {
            return false;
        }

        @Override
        public Boolean visit(AssAttr p, Void arg) {
            return false;
        }

        @Override
        public Boolean visit(Incr p, Void arg) {
            return false;
        }

        @Override
        public Boolean visit(Decr p, Void arg) {
            return false;
        }

        @Override
        public Boolean visit(Ret p, Void arg) {
            return true;
        }

        @Override
        public Boolean visit(VRet p, Void arg) {
            return true;
        }

        @Override
        public Boolean visit(Cond p, Void arg) {
            if (isConditionTrue(p.expr_)) {
                return p.stmt_.accept(stmtVisitor, null);
            }
            return false;
        }

        @Override
        public Boolean visit(CondElse p, Void arg) {
            if (isConditionTrue(p.expr_)) {
                return p.stmt_1.accept(stmtVisitor, null);
            }
            if (isConditionFalse(p.expr_)) {
                return p.stmt_2.accept(stmtVisitor, null);
            }
            return p.stmt_1.accept(stmtVisitor, null) && p.stmt_2.accept(stmtVisitor, null);
        }

        @Override
        public Boolean visit(While p, Void arg) {
            return p.stmt_.accept(stmtVisitor, null);
        }

        @Override
        public Boolean visit(For p, Void arg) {
            return false;
        }

        @Override
        public Boolean visit(SExp p, Void arg) {
            return false;
        }
    };
    private static final Funct.Visitor functVisitor = new Funct.Visitor<Boolean, Void>() {
        @Override
        public Boolean visit(Function p, Void arg) {
            return p.type_.equals(new Primitive(new latte.Absyn.Void())) ? true : p.block_.accept(blockVisitor, null);
        }
    };

    private static boolean isConditionTrue(Expr expr_) {
        return expr_.accept(new Expr.Visitor<Boolean, Void>() {
            @Override
            public Boolean visit(ENewArray p, Void arg) {
                return false;
            }

            @Override
            public Boolean visit(ENewObject p, Void arg) {
                return false;
            }

            @Override
            public Boolean visit(EVar p, Void arg) {
                return false;
            }

            @Override
            public Boolean visit(EArrayElem p, Void arg) {
                return false;
            }

            @Override
            public Boolean visit(ELitInt p, Void arg) {
                return false;
            }

            @Override
            public Boolean visit(ELitTrue p, Void arg) {
                return true;
            }

            @Override
            public Boolean visit(ELitFalse p, Void arg) {
                return false;
            }

            @Override
            public Boolean visit(EAttr p, Void arg) {
                return false;
            }

            @Override
            public Boolean visit(EMethod p, Void arg) {
                return false;
            }

            @Override
            public Boolean visit(EApp p, Void arg) {
                return false;
            }

            @Override
            public Boolean visit(ECast p, Void arg) {
                return false;
            }

            @Override
            public Boolean visit(EString p, Void arg) {
                return false;
            }

            @Override
            public Boolean visit(Neg p, Void arg) {
                return false;
            }

            @Override
            public Boolean visit(Not p, Void arg) {
                return false;
            }

            @Override
            public Boolean visit(EMul p, Void arg) {
                return false;
            }

            @Override
            public Boolean visit(EAdd p, Void arg) {
                return false;
            }

            @Override
            public Boolean visit(ERel p, Void arg) {
                return false;
            }

            @Override
            public Boolean visit(EAnd p, Void arg) {
                return false;
            }

            @Override
            public Boolean visit(EOr p, Void arg) {
                return false;
            }
        }, null);
    }

    private static boolean isConditionFalse(Expr expr_) {
        return expr_.accept(new Expr.Visitor<Boolean, Void>() {
            @Override
            public Boolean visit(ENewArray p, Void arg) {
                return false;
            }

            @Override
            public Boolean visit(ENewObject p, Void arg) {
                return false;
            }

            @Override
            public Boolean visit(EVar p, Void arg) {
                return false;
            }

            @Override
            public Boolean visit(EArrayElem p, Void arg) {
                return false;
            }

            @Override
            public Boolean visit(ELitInt p, Void arg) {
                return false;
            }

            @Override
            public Boolean visit(ELitTrue p, Void arg) {
                return false;
            }

            @Override
            public Boolean visit(ELitFalse p, Void arg) {
                return true;
            }

            @Override
            public Boolean visit(EAttr p, Void arg) {
                return false;
            }

            @Override
            public Boolean visit(EMethod p, Void arg) {
                return false;
            }

            @Override
            public Boolean visit(EApp p, Void arg) {
                return false;
            }

            @Override
            public Boolean visit(ECast p, Void arg) {
                return false;
            }

            @Override
            public Boolean visit(EString p, Void arg) {
                return false;
            }

            @Override
            public Boolean visit(Neg p, Void arg) {
                return false;
            }

            @Override
            public Boolean visit(Not p, Void arg) {
                return false;
            }

            @Override
            public Boolean visit(EMul p, Void arg) {
                return false;
            }

            @Override
            public Boolean visit(EAdd p, Void arg) {
                return false;
            }

            @Override
            public Boolean visit(ERel p, Void arg) {
                return false;
            }

            @Override
            public Boolean visit(EAnd p, Void arg) {
                return false;
            }

            @Override
            public Boolean visit(EOr p, Void arg) {
                return false;
            }
        }, null);
    }

    public static void checkReturns(latte.Absyn.Prog AST) {
        AST.accept(new Prog.Visitor<Void, Void>() {
            @Override
            public Void visit(Program p, Void arg) {
                for (var def : p.listtopdef_) {
                    def.accept(new TopDef.Visitor<Void, Void>() {
                        @Override
                        public Void visit(FnDef p, Void arg) {
                            if (!(boolean) p.funct_.accept(functVisitor, arg)) {
                                throw new LatteError(String.format("Could not find return expression in %s function.", p.funct_.accept(
                                    new Funct.Visitor<String, Void>() {
                                        @Override
                                        public String visit(Function p, Void arg) {
                                            return p.identp_.accept(new IdentP.Visitor<String, Void>() {
                                                @Override
                                                public String visit(IdentPos p, Void arg) {
                                                    return p.ident_;
                                                }
                                            }, null);
                                        }
                                    }, null)), p.line_num, p.col_num);
                            }
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
