package main.java.behavioral.template;

public abstract class MakeOrder {

    void makeOrder(){
        System.out.println("Open App");
        chooseDish();
        System.out.println("Pay for food");
    }

   abstract void chooseDish();

}
