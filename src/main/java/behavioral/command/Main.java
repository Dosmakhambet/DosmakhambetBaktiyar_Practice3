package main.java.behavioral.command;

public class Main {
    public static void main(String args[]){
        Product meat = new Product();

        Cooker cooker = new Cooker(
                new BuyProducts(meat),
                new WashProducts(meat),
                new CutProducts(meat),
                new CookProducts(meat)
        );

        cooker.buy();
        cooker.wash();
        cooker.cut();
        cooker.cook();
    }
}
