package main.java.behavioral.memento;

public class Main {
    public static void main(String[] args) {
        Character character = new Character( 100,"Aladin");
        Game game = new Game();

        game.setSavePoint(character.savePoint());

        System.out.println(character);

        character.setPoint(23);
        character.setName("Dzhafar");
        System.out.println(character);

        character.loadGame(game.getSavePoint());

        System.out.println(character);
    }
}
