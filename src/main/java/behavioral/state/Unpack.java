package main.java.behavioral.state;

public class Unpack implements State{
    @Override
    public void handle() {
        System.out.println("Pizza is unpacking");
    }
}
