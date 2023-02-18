package main.java.structural.bridge;

public abstract class Mobile {
    protected Case aCase;

    protected Mobile(Case aCase){
        this.aCase = aCase;
    }

    abstract void buy();
}
