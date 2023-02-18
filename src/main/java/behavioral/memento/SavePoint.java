package main.java.behavioral.memento;

public class SavePoint {
    private int point;
    private String name;

    public SavePoint(int point, String name) {
        this.point = point;
        this.name = name;
    }

    public int getPoint() {
        return point;
    }

    public String getName() {
        return name;
    }
}
