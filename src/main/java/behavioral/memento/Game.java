package main.java.behavioral.memento;

public class Game {
    private SavePoint savePoint;

    public SavePoint getSavePoint() {
        return savePoint;
    }

    public void setSavePoint(SavePoint savePoint) {
        this.savePoint = savePoint;
    }
}
