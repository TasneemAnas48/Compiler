package nodes.pages;

import Symol_Table.Scope;
import nodes.Node;
import nodes.controllers.Type;
import visitor.ASTVisitor;

import java.io.IOException;
import java.util.ArrayList;
import java.util.List;

public class Attribute extends Node {
    String attribute_name;
    List <String> attribute_list = new ArrayList<>() ;
    Integer attribute_int;

    public String getAttribute_name() {
        return attribute_name;
    }

    public void setAttribute_name(String attribute_name) {
        this.attribute_name = attribute_name;
    }

    public List<String> getAttribute_list() {
        return attribute_list;
    }

    public void setAttribute_list(List<String> attribute_list) {
        this.attribute_list = attribute_list;
    }

    public Integer getAttribute_int() {
        return attribute_int;
    }

    public void setAttribute_int(Integer attribute_int) {
        this.attribute_int = attribute_int;
    }

    @Override
    public void accept(ASTVisitor astVisitor) {
        astVisitor.visit(this);
        System.out.print(", ");
    }

    @Override
    public void check(Scope scope) throws IOException {

    }
}
