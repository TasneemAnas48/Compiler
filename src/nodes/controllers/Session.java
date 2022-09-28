package nodes.controllers;

import nodes.Node;
import visitor.ASTVisitor;

import java.io.File;
import java.io.FileWriter;
import java.io.IOException;


public class Session extends ListUse {

    String key;
    ListSize listSize;
    ListGet listGet;
    CallFunction callFunction;
    Type typevalue;


    public String getKey() {

        return key;
    }

    public void setKey(String key) {
        this.key = key;
    }

    public ListSize getListSize() {
        return listSize;
    }

    public void setListSize(ListSize listSize) {
        this.listSize = listSize;
    }

    public ListGet getListGet() {
        return listGet;
    }

    public void setListGet(ListGet listGet) {
        this.listGet = listGet;
    }

    public CallFunction getCallFunction() {
        return callFunction;
    }

    public void setCallFunction(CallFunction callFunction) {
        this.callFunction = callFunction;
    }


    public Type getTypevalue() {
        return typevalue;
    }

    public void setTypevalue(Type typevalue) {
        this.typevalue = typevalue;
    }


    @Override
    public void accept(ASTVisitor astVisitor) {
        astVisitor.visit(this);

        if (this.listGet != null) {
            this.listGet.accept(astVisitor);
        }
        if (this.callFunction != null) {
            this.callFunction.accept(astVisitor);
        }

    }


    @Override
    public void CodeGenerate(int helper, String name) {
        File ff = new File("C:\\xampp\\htdocs\\"+ name + ".php");
        FileWriter fw = null;
        try {
            fw = new FileWriter(ff, true);


            if (key != null) {

                fw.append("\n $_SESSION[" + "'" + key + "'" + "]=");
                fw.flush();

            }

            if (listSize != null) {
                fw.append("$" + getName() + ".size();");
                fw.flush();


            }
            if (listGet != null) {
                fw.append("$" + getName() + "[");
                fw.flush();
                this.listGet.CodeGenerate(1, name);
                fw.append(";");
                fw.flush();
            }


            if (typevalue != null) {

                this.typevalue.CodeGenerate(1, name);
                fw.append(";\n ");
                fw.flush();

            }
            if (callFunction != null) {
                this.callFunction.CodeGenerate(1, name);
                fw.append(";\n ");
                fw.flush();

            }


        } catch (IOException e) {
            throw new RuntimeException(e);
        }

    }

}

