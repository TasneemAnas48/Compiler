package Symol_Table;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

public class SymbolTable {

    Map<String , String > page_controller  =  new HashMap<>();
    Map<String , List<Scope>> all_controllers = new HashMap<>() ;

    public Map<String, List<Scope>> getAll_controllers() {
        return all_controllers;
    }

    public void setdef_controllers(String key ) {
        all_controllers.put(key , new ArrayList<>());
    }

    public void setAll_controllers(String key , Scope scope) {
        if(all_controllers.containsKey(key))
            all_controllers.get(key).add(scope);
    }

    public Map<String, String> getPage_controller() {
        return page_controller;
    }

    public void setPage_controller(String page, String controller) {
        this.page_controller.put(page , controller);
    }

    public void setPage_controller_index(int index, String controller) {
       page_controller.replace( this.page_controller.keySet().toArray()[index].toString() , controller);
    }

}
