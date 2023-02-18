package main.java.behavioral.strategy;

public class Deliver implements State {
    @Override
    public void handle() {
        System.out.println("Pizza is delivering");
    }
}
