package main.java.behavioral.template;

public class Main {
    public static void main(String[] args) {
        MakeOrder burger = new BurgerOrder();

        burger.makeOrder();

        burger = new PastaOrder();

        System.out.println();

        burger.makeOrder();
    }
}
