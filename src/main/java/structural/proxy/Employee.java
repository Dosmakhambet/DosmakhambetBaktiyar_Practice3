package main.java.structural.proxy;

public class Employee implements User{

    @Override
    public void login(String username) {
        System.out.println(username+ " login to system");
    }
}
