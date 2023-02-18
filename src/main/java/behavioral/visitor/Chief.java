package main.java.behavioral.visitor;

public class Chief implements Cooker{
    @Override
    public void cook(MainDish dish) {
        System.out.println("Cooking main dish");
    }

    @Override
    public void cook(Garnish dish) {
        System.out.println("Cooking garnish");

    }

    @Override
    public void cook(Souse dish) {
        System.out.println("Cooking souce");

    }
}
