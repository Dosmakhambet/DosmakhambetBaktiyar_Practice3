package main.java.behavioral.mediator;

public class EnglishTranslater implements Translator{

    @Override
    public void translate(String word) {
        if(word.equalsIgnoreCase("nihao")){
            System.out.println("Hello");
        }else if(word.equalsIgnoreCase("holla")){
            System.out.println("Hello");
        }else if(word.equalsIgnoreCase("cómo estás")){
            System.out.println("How are you");
        }
    }
}
