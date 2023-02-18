package main.java.behavioral.command;

public class CutProducts implements Action{
    private Product product;

    public CutProducts(Product product) {
        this.product = product;
    }

    @Override
    public void execute() {
        product.cut();
    }
}
