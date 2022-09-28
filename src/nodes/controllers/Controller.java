package nodes.controllers;

import Symol_Table.Scope;
import com.company.Main;
import nodes.Node;
import visitor.ASTVisitor;

import java.io.File;
import java.io.FileWriter;
import java.io.IOException;
import java.util.ArrayList;
import java.util.List;

public class Controller extends Node {
    String name, page_name;

    SessionSingltone session = SessionSingltone.getInstance();


    List<Logic> logicList = new ArrayList<>();
    List<Function> functions = new ArrayList<>();

    public SessionSingltone getSession() {
        return session;
    }

    public void setSession(SessionSingltone session) {
        this.session = session;
    }


    public List<Function> getFunctions() {
        return functions;
    }

    public void setFunctions(List<Function> functions) {
        this.functions = functions;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getPage_name() {
        return page_name;
    }

    public void setPage_name(String page_name) {
        this.page_name = page_name;
    }

    public List<Logic> getLogicList() {
        return logicList;
    }

    public void setLogicList(List<Logic> logicList) {
        this.logicList = logicList;
    }

    @Override
    public void accept(ASTVisitor astVisitor) {
        astVisitor.visit(this);
        for (int i = 0; i < logicList.size(); i++) {
            if (logicList.get(i) != null)
                this.logicList.get(i).accept(astVisitor);
        }
        if (session != null)
            this.session.accept(astVisitor);


        System.out.print("\n\t}");
    }

    @Override
    public void check(Scope scope) throws IOException {
        boolean check = true;
        ///اختبار اذا كان اسم controller معرف مسبقا ك page
        if (Main.symbolTable.getPage_controller().containsKey(name))
            Main.fWriter.write("error in line  " + this.getLine() + "..This container name  " + name + "  is already defined by another type\n");

        else {
            ///اختبار اذا كان اسم الكونترولر معرف سابقا ك controller (مكرر)
            for (int i = 0; i < Main.symbolTable.getPage_controller().size(); i++) {
                if (Main.symbolTable.getPage_controller().get(Main.symbolTable.getPage_controller().keySet().toArray()[i]).equals(name)) {
                    check = false;
                    break;
                } else
                    check = true;

            }
            if (!check)
                Main.fWriter.write("error in line  " + this.getLine() + "..The controller name  " + name + "  is already in use.\n");
            else
                Main.symbolTable.setPage_controller_index(Main.symbolTable.getPage_controller().size() - 1, name);

        }
        if (!Main.symbolTable.getPage_controller().containsKey(page_name)) {
            Main.fWriter.write("error in line " + this.getLine() + "..Page " + page_name + " Not Declared\n");
        }


    }

    @Override
    public void CodeGenerate(int helper, String name) {

        File ff = new File( "C:\\xampp\\htdocs\\"+ this.name +".php");
        if (ff.exists()) {
            ff.delete();
        }
        FileWriter fw = null;
        try {
            fw = new FileWriter(ff, true);
            fw.append("\n\n<?php \n");
            fw.flush();

            if (session != null) {
                this.session.CodeGenerate(0, this.name);
            }


            for (int i = 0; i < logicList.size(); i++) {
                if (logicList.get(i) != null)
                    this.logicList.get(i).CodeGenerate(0, this.name);
            }


            for (int i = 0; i < functions.size(); i++) {
                if (functions.get(i) != null)
                    this.functions.get(i).CodeGenerate(0, this.name);
            }


            fw.append(" \n ?>");
            fw.flush();

        } catch (IOException e) {
            throw new RuntimeException(e);
        }


    }

}
