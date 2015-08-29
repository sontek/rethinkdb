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



public class Javascript extends ReqlExpr {


    public Javascript(Object arg) {
        this(new Arguments(arg), null);
    }
    public Javascript(Arguments args){
        this(args, null);
    }
    public Javascript(Arguments args, OptArgs optargs) {
        this(TermType.JAVASCRIPT, args, optargs);
    }
    protected Javascript(TermType termType, Arguments args, OptArgs optargs){
        super(termType, args, optargs);
    }
}
