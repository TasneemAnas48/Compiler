package nodes.controllers;

import nodes.Node;

import java.io.File;
import java.io.FileWriter;
import java.io.IOException;

public class Post extends Node {
    String name , key ;

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getKey() {
        return key;
    }

    public void setKey(String key) {
        this.key = key;
    }


    @Override
    public void CodeGenerate(int helper, String name) {
        try {
            File f = new File("C:\\xampp\\htdocs\\"+ name + ".php");
            FileWriter fw = new FileWriter(f, true);
            if (this.getName() != null)
                fw.append("\n$" + this.getName());
            fw.flush();
            if(key!=null)
                fw.append(" = $_POST['" + key + "']");
            fw.flush();
            if(helper==0)
                fw.append(";\n" );
            fw.flush();
            fw.close();
        } catch (IOException e) {
            System.out.println("An error occurred.");
            e.printStackTrace();
        }
    }

}