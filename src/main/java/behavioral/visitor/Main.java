package main.java.behavioral.visitor;

public class Main {
    public static void main(String[] args) {
        Cooker chief = new Chief();

        WellingtonBeef wellington = new WellingtonBeef();

        wellington.cook(chief);
    }
}
