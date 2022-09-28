package nodes.pages;

import Symol_Table.Scope;
import com.company.Main;
import nodes.Node;
import visitor.ASTVisitor;

import java.io.File;
import java.io.FileWriter;
import java.io.IOException;

public class Page extends Node {
    Header header;
    Body body;
    String name;

    public Header getHeader() {
        return header;
    }

    public void setHeader(Header header) {
        this.header = header;
    }

    public Body getBody() {
        return body;
    }

    public void setBody(Body body) {
        this.body = body;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    @Override
    public void accept(ASTVisitor astVisitor) {
        astVisitor.visit(this);
        if (this.header != null)
            this.header.accept(astVisitor);
        if (this.body != null)
            this.body.accept(astVisitor);

        System.out.print("\n\t}");
    }

    @Override
    public void check(Scope scope) throws IOException {
        boolean check = true;
        ///اختبار اذا كان اسم page معرف سابقا من قبل page أخرى
        if (Main.symbolTable.getPage_controller().containsKey(name))
            Main.fWriter.write("error in line  " + this.getLine() + "..The page name " + name + "  is already in use. ");
        else {
            ////اختبار اذا كان اسم page مستخدم كنوع آخر اي كاسم controller
            for (int i = 0; i < Main.symbolTable.getPage_controller().size(); i++) {
                if (Main.symbolTable.getPage_controller().get(Main.symbolTable.getPage_controller().keySet().toArray()[i]).equals(name)) {
                    check = false;
                    break;
                } else
                    check = true;

            }
            if (!check)
                Main.fWriter.write("error in line  " + +this.getLine() + "..This page name " + name + " is already defined by another type ");
            else
                Main.symbolTable.setPage_controller(name, "");
        }
    }


    @Override
    public void CodeGenerate(int helper, String name) {
        File ff = new File("C:\\xampp\\htdocs\\"+this.name + ".php");
        if (ff.exists()) {
            ff.delete();
        }
        FileWriter myWriter = null;
        try {
            myWriter = new FileWriter(ff, true);

            myWriter.append("<!DOCTYPE html>\n");
            myWriter.flush();

            if (this.header != null)
                this.header.CodeGenerate(0, this.name);
            if (this.body != null)
                this.body.CodeGenerate(0, this.name);

            myWriter.append("\n</html>");
            myWriter.flush();

        } catch (IOException e) {
            throw new RuntimeException(e);
        }

    }
}
