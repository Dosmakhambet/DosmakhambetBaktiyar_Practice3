package main.java.behavioral.visitor;

import java.util.ArrayList;
import java.util.List;

public class WellingtonBeef implements Dish{
    List<Dish> list = new ArrayList<>();

    public WellingtonBeef() {
        list.add(new MainDish());
        list.add(new Garnish());
        list.add(new Souse());
    }

    @Override
    public void cook(Cooker cooker) {
        list.forEach(el -> el.cook(cooker));
    }
}
