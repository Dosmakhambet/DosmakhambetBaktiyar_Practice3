package main.java.structural.proxy;

public class Main {
    public static void main(String args[]){
        User user = new ProxyUser();

        user.login("c++");
        user.login("asel");
    }
}
