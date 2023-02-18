package main.java.behavioral.mediator;

public class Chinese extends User{

    public Chinese(String name, Translator translator) {
        super(name, translator);
    }

    @Override
    void translateWord() {
        System.out.println(name + " translated nihao");
        this.translator.translate("nihao");
    }
}
