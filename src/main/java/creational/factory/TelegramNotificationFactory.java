package main.java.creational.factory;

public class TelegramNotificationFactory implements NotificationFactory{
    @Override
    public Notification createNotification() {
        return new TelegramNotification();
    }
}
