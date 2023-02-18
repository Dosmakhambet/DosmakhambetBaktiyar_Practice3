package main.java.creational.abstractfactory;

public class PizzaOperator implements Operator{
    @Override
    public void accept() {
        System.out.println("Accept order for pizza");
    }
}
