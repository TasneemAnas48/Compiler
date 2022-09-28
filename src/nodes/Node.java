package nodes;

import Symol_Table.Scope;
import visitor.ASTVisitor;

import java.io.IOException;
import java.util.List;
import java.util.Map;

public class Node {
    private int line;
    private int col;

    public int getLine() {
        return line;
    }

    public void setLine(int line) {
        this.line = line;
    }

    public int getCol() {
        return col;
    }

    public void setCol(int col) {
        this.col = col;
    }

    public void accept(ASTVisitor astVisitor){
        astVisitor.visit(this);
    }

    ////تابع للتحقق هل المتغير معرف مسبقا ويرد 0 اذا لم يكن موجود و 1 اذا كان من نفس النوع و2 اذا كان من نوع آخر
    public int check_var(String name , Scope scope , Scope parent , String type){

        if(scope == null)
            return 0;

        if(scope.getVariables().containsKey(name) && scope.getVariables().get(name).equals(type))
            return 1;

        if(scope.getVariables().containsKey(name) && !scope.getVariables().get(name).equals(type))
            return 2;

        if(parent == null)
            return  0;

        if(parent.getVariables().containsKey(name) && parent.getVariables().get(name).equals(type))
            return 1;

        if(parent.getVariables().containsKey(name) && !parent.getVariables().get(name).equals(type))
            return 2;

        return check_var(name , parent , parent.getParent() , type) ;

    }

    public void check(Scope scope) throws IOException { return  ;}

    ///تابع لإرجاع قيمة Int المخزنة في المتحول
    public  int check_int(String name , Scope scope , Scope parent , int val){
        if(scope == null) {
            return val;
        }

        if(scope.getValues_integer().containsKey(name) ) {
            return scope.getValues_integer().get(name) ;
        }


        if(parent == null) {
            return val;
        }

        if(parent.getValues_integer().containsKey(name) ) {
            return parent.getValues_integer().get(name) ;
        }

        return check_int(name , parent , parent.getParent() , val) + 1 ;
    }

    public List<String> list_value(String name , Scope scope , Scope parent , List<String>val){
        if(scope == null)
            return val;

        if(scope.getValues_list().containsKey(name) ) {
            return scope.getValues_list().get(name) ;
        }


        if(parent == null)
            return  val;

        if(parent.getValues_list().containsKey(name) ) {
            return parent.getValues_list().get(name) ;

        }
        return list_value(name , parent , parent.getParent() , val)  ;
    }

    public  void  CodeGenerate(int helper, String name)  {

    }
    public void check_fun(Map<String , String> map) throws IOException { return  ;}



}
