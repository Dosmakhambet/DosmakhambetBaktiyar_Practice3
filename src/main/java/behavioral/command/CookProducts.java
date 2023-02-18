package main.java.behavioral.command;

public class CookProducts implements Action{
    private Product product;

    public CookProducts(Product product) {
        this.product = product;
    }

    @Override
    public void execute() {
        product.cook();
    }
}
