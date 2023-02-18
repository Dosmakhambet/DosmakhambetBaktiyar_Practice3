package main.java.structural.bridge;

public class Main {
    public static void main(String args[]){
        Iphone iphone = new Iphone(new CaseDC());
        Samsung samsung = new Samsung(new CaseDC());

        iphone.buy();
        samsung.buy();
    }
}
