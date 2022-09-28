package Symol_Table;

import nodes.controllers.Type;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

public class FunctionScope{

    String name ;
    Type return_ = new Type() ;
    List<FunctionScope> similar_functions = new ArrayList<>() ;
    Map<String , String> parameters = new HashMap<>();

    public List<FunctionScope> getSimilar_functions() {
        return similar_functions;
    }

    public void setSimilar_functions(FunctionScope similar_functions) {
        this.similar_functions.add(similar_functions);
    }

    public Type getReturn_() {
        return return_;
    }

    public Map<String, String> getParameters() {
        return parameters;
    }

    public void setParameters(String name , String type) {
        this.parameters.put(name, type);
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public void setReturn_(Type return_) {
        this.return_ = return_;
    }

   }
