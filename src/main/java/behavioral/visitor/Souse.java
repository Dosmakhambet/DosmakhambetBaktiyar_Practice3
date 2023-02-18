package main.java.behavioral.visitor;

public class Souse implements Dish{
    @Override
    public void cook(Cooker cooker) {
        cooker.cook(this);
    }
}
