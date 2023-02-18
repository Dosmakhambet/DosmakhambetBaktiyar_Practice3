package main.java.creational.prototype;

public class Bussiness implements Franchise{
    private String name;
    private String location;
    private Sphere sphere;
    private int profability;

    public Bussiness(String name, String location, Sphere sphere, int profability) {
        this.name = name;
        this.location = location;
        this.sphere = sphere;
        this.profability = profability;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getLocation() {
        return location;
    }

    public void setLocation(String location) {
        this.location = location;
    }

    public Sphere getSphere() {
        return sphere;
    }

    public void setSphere(Sphere sphere) {
        this.sphere = sphere;
    }

    public int getProfability() {
        return profability;
    }

    public void setProfability(int profability) {
        this.profability = profability;
    }

    @Override
    public Object openNewLocation(String location) {
        Bussiness franchise = new Bussiness(name,location,sphere,profability);

        franchise.setLocation(location);

        return franchise;
    }

    @Override
    public String toString() {
        return "Bussiness{" +
                "name='" + name + '\'' +
                ", location='" + location + '\'' +
                ", sphere=" + sphere +
                ", profability=" + profability +
                '}';
    }
}
