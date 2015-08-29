// Autogenerated by metajava.py.
// Do not edit this file directly.
// The template for this file is located at:
// ../../../../../../../../templates/AstSubclass.java

package com.rethinkdb.gen.ast;

import com.rethinkdb.gen.proto.TermType;
import com.rethinkdb.gen.model.TopLevel;
import com.rethinkdb.model.Arguments;
import com.rethinkdb.model.OptArgs;
import com.rethinkdb.ast.ReqlAst;



public class SetIntersection extends ReqlExpr {


    public SetIntersection(Object arg) {
        this(new Arguments(arg), null);
    }
    public SetIntersection(Arguments args){
        this(args, null);
    }
    public SetIntersection(Arguments args, OptArgs optargs) {
        this(TermType.SET_INTERSECTION, args, optargs);
    }
    protected SetIntersection(TermType termType, Arguments args, OptArgs optargs){
        super(termType, args, optargs);
    }
}
