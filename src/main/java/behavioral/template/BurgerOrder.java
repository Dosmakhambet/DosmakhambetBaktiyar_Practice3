package main.java.behavioral.template;

public class BurgerOrder extends MakeOrder{
    @Override
    void chooseDish() {
        System.out.println("Choose burger");
    }
}
