package main.java.creational.abstractfactory;

public class PizzaDeliverFactory implements BusinessFactory{

    @Override
    public Packer getPacker() {
        return new PizzaPacker();
    }

    @Override
    public Operator getOperator() {
        return new PizzaOperator();
    }

    @Override
    public Deliver getDeliver() {
        return new PizzaDeliver();
    }
}
