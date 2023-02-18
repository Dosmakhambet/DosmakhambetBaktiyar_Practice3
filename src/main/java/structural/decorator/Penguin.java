package main.java.structural.decorator;

public class Penguin extends Bird{

    Penguin(Mammal mammal) {
        super(mammal);
    }

    @Override
    public void doSomething() {
        super.doSomething();
        System.out.print(" Can swim.");
    }
}
