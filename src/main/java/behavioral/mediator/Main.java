package main.java.behavioral.mediator;

public class Main {
    public static void main(String[] args) {
        Translator english = new EnglishTranslater();
        User hipanic = new Hispanic("Eduardo", english);
        User chinese = new Chinese("Lee", english);

        hipanic.translateWord();
        chinese.translateWord();
    }
}
