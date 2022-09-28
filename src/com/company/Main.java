package com.company;

import Symol_Table.SymbolTable;
import nodes.Program;
import org.antlr.v4.runtime.CharStream;
import org.antlr.v4.runtime.CommonTokenStream;
import org.antlr.v4.runtime.tree.ParseTree;
import visitor.BaseVisitor;
import java.io.BufferedWriter;
import java.io.FileWriter;
import java.io.IOException;
import gen.DSLLexer;
import gen.DSLParser;
import static org.antlr.v4.runtime.CharStreams.fromFileName;

public class Main {

    public static  SymbolTable symbolTable = new SymbolTable() ;

    public  static BufferedWriter fWriter;

    static {
        try {
             fWriter
                    = new BufferedWriter(new FileWriter(
                    "error_file.txt"));

        } catch (IOException e) {
            e.printStackTrace();
        }

    }


    public static void main(String[] args) throws IOException {


        try {
            String source = "sample2.txt";
            CharStream cs = fromFileName(source);
            DSLLexer lexer = new DSLLexer(cs);
            CommonTokenStream token  = new CommonTokenStream(lexer);
            DSLParser parser = new DSLParser(token);
            ParseTree tree = parser.program();
            Program program = (Program) new BaseVisitor().visit(tree);
            program.CodeGenerate(0 , "");

            fWriter.close();
        } catch (IOException e) {
            e.printStackTrace();
        }
    }
}
