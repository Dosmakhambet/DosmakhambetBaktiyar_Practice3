package main.java.creational.prototype;

public class FranchiseFactory {
    private Bussiness bussiness;

    public FranchiseFactory(Bussiness bussiness){
        this.bussiness = bussiness;
    }

    public Bussiness openFranchise(String location){
        return (Bussiness) bussiness.openNewLocation(location);
    }
}
