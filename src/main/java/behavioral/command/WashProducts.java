package main.java.behavioral.command;

public class WashProducts implements Action{
    private Product product;

    public WashProducts(Product product) {
        this.product = product;
    }

    @Override
    public void execute() {
        product.wash();
    }
}
