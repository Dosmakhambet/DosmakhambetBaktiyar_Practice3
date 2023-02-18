package main.java.behavioral.observer;

public class Student extends User{
    public Student(String name) {
        super(name);
    }

    @Override
    void update(int chapter) {
        System.out.println("Notice new chapter " + chapter);
    }
}
