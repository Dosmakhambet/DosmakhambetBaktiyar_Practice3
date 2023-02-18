package main.java.creational.singleton;

import java.util.ArrayList;
import java.util.List;

public class Singleton {

    private static Singleton singleton = null;
    private static List<Integer> list = new ArrayList<>();

    private Singleton(){}

    public static synchronized Singleton getInstance(){
        if(singleton == null){
            singleton = new Singleton();
        }
        return singleton;
    }

    public void addElem(Integer a){
        list.add(a);
    }

    public List<Integer> getList(){
        return list;
    }


}
