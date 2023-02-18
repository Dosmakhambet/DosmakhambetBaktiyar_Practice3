package main.java.creational.abstractfactory;

public class PizzaPacker implements Packer{
    @Override
    public void wrapup() {
        System.out.println("Wrap up pizza");
    }
}
