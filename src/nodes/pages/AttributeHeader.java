package nodes.pages;

import nodes.Node;
import visitor.ASTVisitor;

import java.io.File;
import java.io.FileWriter;
import java.io.IOException;
import java.util.HashMap;
import java.util.Map;
import java.util.Objects;

public class AttributeHeader extends Node {
    String key;
    String value;

    public String getKey() {
        return key;
    }

    public void setKey(String key) {
        this.key = key;
    }

    public String getValue() {
        return value;
    }

    public void setValue(String value) {
        this.value = value;
    }

    @Override
    public void accept(ASTVisitor astVisitor) {
        astVisitor.visit(this);
    }

    @Override
    public void CodeGenerate(int helper, String name) {
        File ff = new File("C:\\xampp\\htdocs\\"+name + ".php");
        FileWriter myWriter = null;
        try {
            myWriter = new FileWriter(ff, true);


            if (Objects.equals(this.key, "language"))
                myWriter.append("<html lang=" + this.value + ">\n");

            if (Objects.equals(this.key, "title"))
                myWriter.append("<head>\n" +
                                "    <meta charset=\"utf-8\">\n" +
                                "    <meta name=\"viewport\" content=\"width=device-width, initial-scale=1\">\n" +
                                "    <title>" + this.value.substring(1,this.value.length()-1) + "</title>\n" +
                                "</head>\n");

            myWriter.flush();

        } catch (IOException e) {
            throw new RuntimeException(e);
        }

    }
}
