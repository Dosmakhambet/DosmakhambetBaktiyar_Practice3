package main.java.behavioral.command;

public class Cooker {
    private Action buy;
    private Action cut;
    private Action wash;
    private Action cook;

    public Cooker(Action buy, Action cut, Action wash, Action cook) {
        this.buy = buy;
        this.cut = cut;
        this.wash = wash;
        this.cook = cook;
    }

    public void buy(){
        buy.execute();
    }

    public void wash(){
        wash.execute();
    }

    public void cook(){
        cook.execute();
    }

    public void cut(){
        cut.execute();
    }

}
