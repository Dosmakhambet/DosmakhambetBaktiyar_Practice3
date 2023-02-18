package main.java.behavioral.chainofresposobility;

public class Employee extends AbstractPerson{
    private String name;

    public Employee( int limit, String name) {
        super(limit);
        this.name = name;
    }

    @Override
    public void buy(String product) {
        System.out.println(name + " employee buy product " + product);
    }
}
