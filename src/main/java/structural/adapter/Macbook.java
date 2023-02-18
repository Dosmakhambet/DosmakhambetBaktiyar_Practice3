package main.java.structural.adapter;

public class Macbook implements Device{
    @Override
    public void charge() {
        System.out.println("Connected to power");
    }
}
