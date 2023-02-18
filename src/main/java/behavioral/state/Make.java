package main.java.behavioral.state;

public class Make implements State{

    @Override
    public void handle() {
        System.out.println("Pizza is making");
    }
}
