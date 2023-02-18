package main.java.structural.decorator;

public abstract class Bird implements Mammal{
    private Mammal mammal;

    Bird(Mammal mammal){
        this.mammal = mammal;
    }

    @Override
    public void doSomething() {
        mammal.doSomething();
    }
}
