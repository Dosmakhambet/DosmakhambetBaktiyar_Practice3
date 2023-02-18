package main.java.behavioral.strategy;

public class Make implements State {

    @Override
    public void handle() {
        System.out.println("Pizza is making");
    }
}
