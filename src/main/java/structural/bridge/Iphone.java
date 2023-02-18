package main.java.structural.bridge;

public class Iphone extends Mobile{

    public Iphone(Case aCase) {
        super(aCase);
    }

    @Override
    void buy() {
        System.out.print("Byu Iphone.");
        aCase.create();
    }
}
