// Autogenerated by metajava.py.
// Do not edit this file directly.
// The template for this file is located at:
// ../../../../../../../../templates/AstSubclass.java

package com.rethinkdb.gen.ast;

import com.rethinkdb.gen.proto.TermType;
import com.rethinkdb.gen.exc.ReqlDriverError;
import com.rethinkdb.model.Arguments;
import com.rethinkdb.model.OptArgs;
import com.rethinkdb.ast.ReqlAst;



public class And extends ReqlExpr {


    public And(Object arg) {
        this(new Arguments(arg), null);
    }
    public And(Arguments args){
        this(args, null);
    }
    public And(Arguments args, OptArgs optargs) {
        this(TermType.AND, args, optargs);
    }
    protected And(TermType termType, Arguments args, OptArgs optargs){
        super(termType, args, optargs);
    }
}
