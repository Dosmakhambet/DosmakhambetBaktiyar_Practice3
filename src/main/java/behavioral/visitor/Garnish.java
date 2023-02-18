package main.java.behavioral.visitor;

public class Garnish implements Dish{
    @Override
    public void cook(Cooker cooker) {
        cooker.cook(this);
    }
}
