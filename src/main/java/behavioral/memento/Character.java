package main.java.behavioral.memento;

public class Character {
    private int point;
    private String name;

    public Character(int point, String name) {
        this.point = point;
        this.name = name;
    }

    public int getPoint() {
        return point;
    }

    public void setPoint(int point) {
        this.point = point;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public SavePoint savePoint(){
        return new SavePoint(point, name);
    }

    public void loadGame(SavePoint savePoint){
        this.name = savePoint.getName();
        this.point = savePoint.getPoint();
    }
    @Override
    public String toString() {
        return "Character{" +
                "point=" + point +
                ", name='" + name + '\'' +
                '}';
    }
}
