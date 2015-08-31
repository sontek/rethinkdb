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



public class OrderBy extends ReqlExpr {


    public OrderBy(Object arg) {
        this(new Arguments(arg), null);
    }
    public OrderBy(Arguments args){
        this(args, null);
    }
    public OrderBy(Arguments args, OptArgs optargs) {
        this(TermType.ORDER_BY, args, optargs);
    }
    protected OrderBy(TermType termType, Arguments args, OptArgs optargs){
        super(termType, args, optargs);
    }
}
