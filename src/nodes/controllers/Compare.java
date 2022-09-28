package nodes.controllers;

import nodes.Node;
import visitor.ASTVisitor;

public class Compare extends Node {



    @Override
    public void accept(ASTVisitor astVisitor) {
        astVisitor.visit(this);

    }


    public void CodeGenerate(int helper, String name) {
    }
}
