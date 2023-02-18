package main.java.creational.abstractfactory;

public interface BusinessFactory {
    Packer getPacker();
    Operator getOperator();
    Deliver getDeliver();
}
