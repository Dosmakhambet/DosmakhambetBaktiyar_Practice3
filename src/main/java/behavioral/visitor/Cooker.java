package main.java.behavioral.visitor;

public interface Cooker {

    void cook(MainDish dish);

    void cook(Garnish dish);

    void cook(Souse dish);
}
