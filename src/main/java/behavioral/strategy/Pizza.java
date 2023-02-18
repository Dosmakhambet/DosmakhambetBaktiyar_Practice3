package main.java.behavioral.strategy;

public class Pizza implements State {
    State state;

    public void setState(State state) {
        this.state = state;
    }

    @Override
    public void handle() {
        state.handle();
    }
}
