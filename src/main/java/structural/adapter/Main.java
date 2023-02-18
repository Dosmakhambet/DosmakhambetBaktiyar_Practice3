package main.java.structural.adapter;

public class Main {
    public static void main(String args[]){
        DeviceApater deviceApater = new EuropiaAdapter(new Macbook());

        deviceApater.charge();
    }
}
