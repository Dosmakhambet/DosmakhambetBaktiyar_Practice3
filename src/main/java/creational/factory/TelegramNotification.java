package main.java.creational.factory;

public class TelegramNotification implements Notification{
    @Override
    public void notificate() {
        System.out.println("Notificate by Telegram");
    }
}
