package main.java.behavioral.observer;

public class Main {
    public static void main(String[] args) {
        User student1 = new Student("Almas");
        User student2 = new Student("Timur");

        Netflix netflix = new BlackWindow();

        netflix.addSubscriber(student1);
        netflix.addSubscriber(student2);

        netflix.notifice();

        netflix.removeSubscriber(student1);

        netflix.notifice();
    }
}
