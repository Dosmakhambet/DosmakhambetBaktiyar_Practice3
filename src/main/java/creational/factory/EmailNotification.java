package main.java.creational.factory;

public class EmailNotification implements Notification{
    @Override
    public void notificate() {
        System.out.println("Notificate by Email");
    }
}
