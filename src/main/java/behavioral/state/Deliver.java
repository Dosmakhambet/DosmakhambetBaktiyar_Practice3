package main.java.behavioral.state;

public class Deliver implements State{
    @Override
    public void handle() {
        System.out.println("Pizza is delivering");
    }
}
