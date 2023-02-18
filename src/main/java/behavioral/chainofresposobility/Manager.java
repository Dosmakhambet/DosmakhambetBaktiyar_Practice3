package main.java.behavioral.chainofresposobility;

public class Manager extends AbstractPerson{
    private String name;
    public Manager(int limit, String name) {
        super(limit);
        this.name = name;
    }

    @Override
    public void buy(String product) {
        System.out.println(name + " manager buy product " + product);
    }
}
