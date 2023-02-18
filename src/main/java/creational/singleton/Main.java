package main.java.creational.singleton;

public class Main {
    public static void main(String args[]){

        Singleton s = Singleton.getInstance();

        s.addElem(1);
        s.addElem(2);
        s.addElem(3);

        Singleton s2 = Singleton.getInstance();

        s2.getList().stream().forEach(elem -> System.out.print(elem + " "));
    }
}
