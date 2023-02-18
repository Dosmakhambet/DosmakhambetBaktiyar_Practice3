package main.java.behavioral.command;

public class BuyProducts implements Action{
    private Product product;

    public BuyProducts(Product product) {
        this.product = product;
    }

    @Override
    public void execute() {
       product.buy();
    }
}
