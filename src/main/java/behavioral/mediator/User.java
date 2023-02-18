package main.java.behavioral.mediator;

public abstract class User {
    protected String name;
    protected Translator translator;

    public User(String name, Translator translator) {
        this.name = name;
        this.translator = translator;
    }


    abstract void translateWord();
}
