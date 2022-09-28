package Symol_Table;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

public class Scope {

    Map<String , String> variables = new HashMap<>();
    int ID = 1;
    Scope parent ;
    Map<String , FunctionScope> functionScopeMap = new HashMap<>() ;
    Map<String ,Integer> values_integer = new HashMap<>();
    Map<String , List<String>> values_list = new HashMap<>();
    String controller_name ;
    String name_scope ;

    public String getController_name() {
        return controller_name;
    }

    public void setController_name(String controller_name) {
        this.controller_name = controller_name;
    }

    public String getName_scope() {
        return name_scope;
    }

    public void setName_scope(String name_scope) {
        this.name_scope = name_scope;
    }

    public Map<String, FunctionScope> getFunctionScopeMap() {
        return functionScopeMap;
    }

    public Map<String, List<String>> getValues_list() {
        return values_list;
    }

    public void setValues_list(String name, String value) {
        this.values_list.get(name).add(value);
    }
    public void initValues_list(String name, List<String> value) {
        this.values_list.put(name, value);
    }

    public void setFunctionScopeMap(String name , FunctionScope functionScope) {
        this.functionScopeMap.put(name , functionScope);
    }
    public  void increase(int id){  ID = id + 1;}

    public Scope getParent() {
        return parent;
    }

    public void setParent(Scope parent) {
        this.parent = parent;
    }

    public Map<String, String> getVariables() {
        return variables;
    }

    public void setVariables(String name , String type) {
        this.variables.put(name, type);
    }

    public int getID() {
        return ID;
    }

    public void setID(int ID) {
        this.ID = ID;
    }

    public Map<String, Integer> getValues_integer() {
        return values_integer;
    }

    public void setValues_integer(String name , int values_integer) {
        this.values_integer.put(name , values_integer) ;
    }

}
