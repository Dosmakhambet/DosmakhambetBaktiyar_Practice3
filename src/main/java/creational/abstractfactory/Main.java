package main.java.creational.abstractfactory;

public class Main {
    public static void main (String args[]){
        BusinessFactory pizza = new PizzaDeliverFactory();
        Operator operator = pizza.getOperator();
        Deliver deliver = pizza.getDeliver();
        Packer packer = pizza.getPacker();

        operator.accept();
        packer.wrapup();
        deliver.deliver();
    }
}
