package main.java.behavioral.mediator;

public class Hispanic extends User{

    public Hispanic(String name, Translator translator) {
        super(name, translator);
    }

    @Override
    void translateWord() {
        System.out.println(name + " translated cómo estás to english");
        this.translator.translate("cómo estás");
    }
}
