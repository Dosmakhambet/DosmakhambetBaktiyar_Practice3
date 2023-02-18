package main.java.structural.flyweight;

public class Main {
    public static void main(String args[]){
        CharacterFactory factory = new CharacterFactory();

        factory.getCharacter("terror").shoot();
        factory.getCharacter("terror").shoot();
        factory.getCharacter("terror").shoot();
        factory.getCharacter("terror").shoot();
        factory.getCharacter("terror").shoot();


        factory.getCharacter("conter-terror").shoot();
        factory.getCharacter("conter-terror").shoot();
        factory.getCharacter("conter-terror").shoot();
        factory.getCharacter("conter-terror").shoot();
        factory.getCharacter("conter-terror").shoot();

    }
}
