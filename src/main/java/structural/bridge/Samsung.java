package main.java.structural.bridge;

public class Samsung extends Mobile{
    public Samsung(Case aCase) {
        super(aCase);
    }

    @Override
    void buy() {
        System.out.print("Buy Samsung.");
        aCase.create();
    }
}
