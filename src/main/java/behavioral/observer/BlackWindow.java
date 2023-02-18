package main.java.behavioral.observer;

import java.util.ArrayList;
import java.util.List;

public class BlackWindow implements Netflix{
    List<User> subscribers = new ArrayList<>();
    int count = 0;

    @Override
    public void addSubscriber(User user) {
        this.subscribers.add(user);
    }

    @Override
    public void removeSubscriber(User user) {
        this.subscribers.remove(user);
    }

    @Override
    public void notifice() {
        count++;
        for (User user:subscribers) {
            user.update(count);
        }
    }
}
