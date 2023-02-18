package main.java.creational.abstractfactory;

public class PizzaDeliver implements Deliver{
    @Override
    public void deliver() {
        System.out.println("Deliver pizza");
    }
}
