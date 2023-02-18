package main.java.behavioral.state;

public class Main {
    public static void main(String[] args) {
        Pizza pizza = new Pizza();

        pizza.setState(new Deliver());

        pizza.handle();
        pizza.handle();
        pizza.handle();
        pizza.handle();
    }
}
