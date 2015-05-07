// Autogenerated by convert_protofile.py on 2015-05-07.
// Do not edit this file directly.
// The template for this file is located at:
// ../../../../../../../../templates/AstSubclass.java
package com.rethinkdb.ast.gen;

import com.rethinkdb.ast.helper.Arguments;
import com.rethinkdb.ast.helper.OptArgs;
import com.rethinkdb.ast.RqlAst;
import com.rethinkdb.proto.TermType;
import java.util.*;



public class And extends RqlQuery {


    public And(java.lang.Object arg) {
        this(new Arguments(arg), null);
    }
    public And(Arguments args, OptArgs optargs) {
        this(null, args, optargs);
    }
    public And(RqlAst prev, Arguments args, OptArgs optargs) {
        this(prev, TermType.AND, args, optargs);
    }
    protected And(RqlAst previous, TermType termType, Arguments args, OptArgs optargs){
        super(previous, termType, args, optargs);
    }


    /* Static factories */
    public static And fromArgs(Object... args){
        return new And(new Arguments(args), null);
    }


}
