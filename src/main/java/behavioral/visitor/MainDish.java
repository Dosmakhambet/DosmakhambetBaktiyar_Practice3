package main.java.behavioral.visitor;

public class MainDish implements Dish{
    @Override
    public void cook(Cooker cooker) {
        cooker.cook(this);
    }
}
