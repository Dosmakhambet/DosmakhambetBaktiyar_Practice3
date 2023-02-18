package main.java.behavioral.observer;

public abstract class User {
    private String name;

    public User(String name) {
        this.name = name;
    }

    abstract void update(int chapter);
}
