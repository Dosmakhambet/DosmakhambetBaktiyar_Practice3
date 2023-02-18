package main.java.creational.prototype;

public class Main {
    public static void main(String args[]){
        Bussiness bussiness = new Bussiness("Tesla","USA",Sphere.Car,1000);
        FranchiseFactory franchiseFactory = new FranchiseFactory(bussiness);

        System.out.println(bussiness);
        Bussiness franchiseTesla = franchiseFactory.openFranchise("Almaty");
        System.out.println(franchiseTesla);

    }
}
