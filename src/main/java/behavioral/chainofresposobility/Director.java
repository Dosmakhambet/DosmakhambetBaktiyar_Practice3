package main.java.behavioral.chainofresposobility;

public class Director extends AbstractPerson{
    private String name;

    public Director(int limit, String name) {
        super(limit);
        this.name = name;
    }

    @Override
    public void buy(String product) {
        System.out.println(name + " director buy product " + product);

    }
}
