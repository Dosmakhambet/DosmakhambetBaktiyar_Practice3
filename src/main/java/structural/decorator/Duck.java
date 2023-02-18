package main.java.structural.decorator;

public class Duck extends Bird{
    Duck(Mammal mammal) {
        super(mammal);
    }

    @Override
    public void doSomething() {
        super.doSomething();
        System.out.print(" Can fly");
    }
}
