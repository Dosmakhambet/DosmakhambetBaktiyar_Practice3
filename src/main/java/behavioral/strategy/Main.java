package main.java.behavioral.strategy;

public class Main {
    public static void main(String[] args) {
        Pizza pizza = new Pizza();

        pizza.setState(new Unpack());
        pizza.handle();

        pizza.setState(new Deliver());
        pizza.handle();

        pizza.setState(new Order());
        pizza.handle();

        pizza.setState(new Make());
        pizza.handle();
    }
}
