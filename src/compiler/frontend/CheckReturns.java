package compiler.frontend;

import latte.Absyn.*;

import java.lang.Void;

public class CheckReturns {
    private static final Block.Visitor<Boolean, Void> blockVisitor = new Block.Visitor<Boolean, Void>() {
        @Override
        public Boolean visit(BlockOfStatements p, Void arg) {
            boolean isThereReturn = false;
            for (var stmt : p.liststmt_) {
//                isThereReturn = isThereReturn || p.<Boolean, Void>accept(new Stmt.Visitor<Boolean, Void>() {
//                    @Override
//                    public Boolean visit(Empty p, Void arg) {
//                        return false;
//                    }
//
//                    @Override
//                    public Boolean visit(BStmt p, Void arg) {
//                        return null;
//                    }
//
//                    @Override
//                    public Boolean visit(Decl p, Void arg) {
//                        return null;
//                    }
//
//                    @Override
//                    public Boolean visit(Ass p, Void arg) {
//                        return null;
//                    }
//
//                    @Override
//                    public Boolean visit(AssArr p, Void arg) {
//                        return null;
//                    }
//
//                    @Override
//                    public Boolean visit(AssAttr p, Void arg) {
//                        return null;
//                    }
//
//                    @Override
//                    public Boolean visit(Incr p, Void arg) {
//                        return null;
//                    }
//
//                    @Override
//                    public Boolean visit(Decr p, Void arg) {
//                        return null;
//                    }
//
//                    @Override
//                    public Boolean visit(Ret p, Void arg) {
//                        return null;
//                    }
//
//                    @Override
//                    public Boolean visit(VRet p, Void arg) {
//                        return null;
//                    }
//
//                    @Override
//                    public Boolean visit(Cond p, Void arg) {
//                        return null;
//                    }
//
//                    @Override
//                    public Boolean visit(CondElse p, Void arg) {
//                        return null;
//                    }
//
//                    @Override
//                    public Boolean visit(While p, Void arg) {
//                        return null;
//                    }
//
//                    @Override
//                    public Boolean visit(For p, Void arg) {
//                        return null;
//                    }
//
//                    @Override
//                    public Boolean visit(SExp p, Void arg) {
//                        return null;
//                    }
//                }, null);
            }
            return null;
        }
    };

    public static void checkReturns(Prog AST) {
        AST.accept(new Prog.Visitor<Void, Void>() {
            @Override
            public Void visit(Program p, Void arg) {
                for (var def : p.listtopdef_) {
                    def.accept(new TopDef.Visitor<Void, Void>() {
                        @Override
                        public Void visit(FnDef p, Void arg) {
                            p.funct_.accept(new Funct.Visitor<Void, Void>() {
                                @Override
                                public Void visit(Function p, Void arg) {
                                    p.block_.accept(blockVisitor, null);
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
