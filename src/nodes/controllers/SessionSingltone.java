package nodes.controllers;

import nodes.Node;
import visitor.ASTVisitor;

import java.io.File;
import java.io.FileWriter;
import java.io.IOException;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

public class SessionSingltone extends Node {

    private SessionSingltone(){
    }

    public List<Session> getSessionList() {
        return sessionList;
    }

    public void setSessionList(Session session) {
        this.sessionList.add(session);
    }

    List<Session>sessionList = new ArrayList<>();
    private static SessionSingltone session_instance=null;

    public  static SessionSingltone getInstance(){

        if(session_instance==null)
            session_instance=new SessionSingltone();
        return  session_instance;
    }
    @Override
    public void accept(ASTVisitor astVisitor) {


        astVisitor.visit(this);
        for (int i = 0; i < sessionList.size() ; i++) {

            if (sessionList.get(i) != null)
                this.sessionList.get(i).accept(astVisitor);


        }
        System.out.println(";");
    }

    @Override
    public  void  CodeGenerate(int helper, String name)  {

        File ff=new File("C:\\xampp\\htdocs\\"+ name + ".php");
        FileWriter fw = null;
        try {
            fw = new FileWriter(ff,true);



            for (int i = 0; i < sessionList.size() ; i++) {
                if (sessionList.get(i) != null)
                {
                   if(i==0) {fw.append("\nsession_start(); \n");
                    fw.flush();}
                    this.sessionList.get(i).CodeGenerate(1, name);
                }


            }




        } catch (IOException e) {
            throw new RuntimeException(e);
        }




    }



}
