package main.java.behavioral.strategy;

public class Order implements State {
    @Override
    public void handle() {
        System.out.println("Pizza is ordering");
    }
}
