package main.java.behavioral.observer;

public interface Netflix {

    void addSubscriber(User user);

    void removeSubscriber(User user);

    void notifice();
}
