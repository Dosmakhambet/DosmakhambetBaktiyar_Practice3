package main.java.structural.decorator;

public class Chicken extends Bird{

    Chicken(Mammal mammal) {
        super(mammal);
    }

    @Override
    public void doSomething() {
        super.doSomething();
        System.out.print(" Can run.");
    }
}
