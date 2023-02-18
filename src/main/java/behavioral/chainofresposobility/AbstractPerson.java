package main.java.behavioral.chainofresposobility;

public abstract class AbstractPerson {
    private int limit;
    private AbstractPerson next;

    public AbstractPerson(int limit) {
        this.limit = limit;
    }

    public void setNext(AbstractPerson next) {
        this.next = next;
    }

    public void doJob(int price, String product ){
        if(this.limit >= price){
            buy(product);
        }else {
            System.out.println("notify top person");
            next.doJob(price, product);
        }
    }

    public abstract void buy(String product);

}
