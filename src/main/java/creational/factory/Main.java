package main.java.creational.factory;

public class Main {
    public static void main(String args[]){
        NotificationFactory notificationFactory = testPattern("telegram");

        notificationFactory.createNotification().notificate();
    }

    private static NotificationFactory testPattern(String test){

        if(test.equalsIgnoreCase("email")){
            return  new EmailNotificationFactory();
        }else if(test.equalsIgnoreCase("telegram")){
            return new TelegramNotificationFactory();
        }else if(test.equalsIgnoreCase("whatsapp")){
            return new WhastappNotificationFactory();
        }else{
            throw new RuntimeException("No type Notification");
        }
    }
}
