package nodes.pages;

import Symol_Table.Scope;
import nodes.Node;
import visitor.ASTVisitor;

import java.io.IOException;

public class GetData extends Node {
    String attribute_name;
    String attribute_value;
    String type;

    public String getType() {
        return type;
    }

    public void setType(String type) {
        this.type = type;
    }

    public String getAttribute_name() {
        return attribute_name;
    }

    public void setAttribute_name(String attribute_name) {
        this.attribute_name = attribute_name;
    }

    public String getAttribute_value() {
        return attribute_value;
    }

    public void setAttribute_value(String attribute_value) {
        this.attribute_value = attribute_value;
    }

    @Override
    public void accept(ASTVisitor astVisitor) {
        astVisitor.visit(this);
    }
    @Override
    public void check(Scope scope) throws IOException {

    }
}
