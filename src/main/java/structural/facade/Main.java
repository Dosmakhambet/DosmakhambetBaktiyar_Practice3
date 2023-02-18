package main.java.structural.facade;

public class Main {
    public static void main(String args[]){
        CoffeeMachine coffeeMachine = new CoffeeMachine();

        coffeeMachine.turnOn();
        coffeeMachine.makeCoffee();
        System.out.println("\n\n");
        coffeeMachine.makeCoffee();
    }
}
