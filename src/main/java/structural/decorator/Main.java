package main.java.structural.decorator;

public class Main {
    public static void main(String args[]){
        Bird bird = new Duck(new Penguin(new Chicken(new MammalImpl())));

        bird.doSomething();
    }
}
