package main.java.behavioral.state;

public class Pizza implements State{
    State state;

    public void setState(State state) {
        this.state = state;
    }

    private void changeState(){
        if(state instanceof Order){
            setState(new Make());
        }else if (state instanceof Make){
            setState(new Unpack());
        }else if (state instanceof Unpack){
            setState(new Deliver());
        }else if (state instanceof Deliver){
            setState(new Order());
        }
    }
    @Override
    public void handle() {
        changeState();
        state.handle();
    }
}
