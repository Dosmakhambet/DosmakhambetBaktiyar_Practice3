package main.java.behavioral.strategy;

public class Unpack implements State {
    @Override
    public void handle() {
        System.out.println("Pizza is unpacking");
    }
}
