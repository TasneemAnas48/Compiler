package nodes;

import visitor.ASTVisitor;

import java.io.File;
import java.io.FileWriter;
import java.io.IOException;
import java.util.ArrayList;
import java.util.List;

public class Program extends Node{
    List <ProgramDesign>programDesigns = new ArrayList<>( ) ;

    public List<ProgramDesign> getProgramDesigns() {
        return programDesigns;
    }

    public void setProgramDesigns(List<ProgramDesign> programDesigns) {
        this.programDesigns = programDesigns;
    }

    @Override
    public void accept(ASTVisitor astVisitor) {
        astVisitor.visit(this);
        for (int i = 0; i < programDesigns.size(); i++) {
            if (programDesigns.get(i) != null)
                this.programDesigns.get(i).accept(astVisitor);
        }
        System.out.println("\n} ");
    }

    
    public  void  CodeGenerate(int helper, String name)  {
//        File ff=new File("input.txt");
//        FileWriter fw = null;
//        try {
//            fw = new FileWriter(ff,true);
//            fw.append("<?php \n");
//            fw.flush();
//
//        } catch (IOException e) {
//            throw new RuntimeException(e);
//        }



        for (int i = 0; i < programDesigns.size(); i++) {
            if (programDesigns.get(i) != null)
                this.programDesigns.get(i).CodeGenerate(0, name);
        }

//
//        try {
//            fw = new FileWriter(ff,true);
//            fw.append(" \n ?>");
//            fw.flush();
//
//        } catch (IOException e) {
//            throw new RuntimeException(e);
//        }


    }

}
