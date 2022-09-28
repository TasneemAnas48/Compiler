package nodes.controllers;

import nodes.Node;
import visitor.ASTVisitor;

import java.io.File;
import java.io.FileWriter;
import java.io.IOException;
import java.util.ArrayList;
import java.util.List;

public class LogicBody extends Node {
    List<Logic> logicList = new ArrayList<>();


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
        System.out.println("\n\t\t]");
    }

    @Override
    public void CodeGenerate(int helper, String name) {
        try {
            File f=new File("C:\\xampp\\htdocs\\"+ name + ".php");
            FileWriter fw=new FileWriter(f,true);  //Create filewriter object for the file descriptor with append options set as tru
            for (int i = 0; i < this.getLogicList().size(); i++) {
                getLogicList().get(i).CodeGenerate(0, name);
            }
            fw.flush();
            fw.close();
        } catch (IOException e) {
            System.out.println("An error occurred.");
            e.printStackTrace();
        }
    }

}
