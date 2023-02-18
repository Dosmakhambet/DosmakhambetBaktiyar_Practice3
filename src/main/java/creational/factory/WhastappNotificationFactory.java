package main.java.creational.factory;

public class WhastappNotificationFactory implements NotificationFactory{
    @Override
    public Notification createNotification() {
        return new WhastappNotification();
    }
}
