package main.java.structural.facade;

public class CoffeeMachine {
    private boolean hasCoffee = false;
    private Water water;
    private Coffee coffee;

    CoffeeMachine(){
        water = new Water();
        coffee = new Coffee();
    }

    public void turnOn(){
        System.out.println("Turn on.");
    }

    public void makeCoffee(){
        water.boilWater();
        if(hasCoffee){
            coffee.grindCoffee();
        }else{
            coffee.addCoffee();
            hasCoffee = true;
            coffee.grindCoffee();
        }

        System.out.println("Coffee done");
    }
}
