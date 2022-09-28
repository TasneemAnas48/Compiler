package nodes.controllers;

import nodes.Node;
import visitor.ASTVisitor;

public class Logic extends Node {
    @Override
    public void accept(ASTVisitor astVisitor) {
        astVisitor.visit(this);
    }


    @Override
    public void CodeGenerate(int helper, String name) {

    }

}
