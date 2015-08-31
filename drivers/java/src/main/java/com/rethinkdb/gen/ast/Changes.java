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



public class Changes extends ReqlExpr {


    public Changes(Object arg) {
        this(new Arguments(arg), null);
    }
    public Changes(Arguments args){
        this(args, null);
    }
    public Changes(Arguments args, OptArgs optargs) {
        this(TermType.CHANGES, args, optargs);
    }
    protected Changes(TermType termType, Arguments args, OptArgs optargs){
        super(termType, args, optargs);
    }
}
