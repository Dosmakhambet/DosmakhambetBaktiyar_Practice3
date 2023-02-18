package main.java.structural.flyweight;

import java.util.HashMap;

public class CharacterFactory {
    private static final HashMap<String, Character> map = new HashMap<>();

    public Character getCharacter(String type){
        if(map.containsKey(type)){
            return map.get(type);
        }else{
            Character character = null;
            switch (type){
                case "terror":
                    character = new Terror();
                    map.put(type,character);
                    break;
                case "conter-terror":
                    character = new ConterTerror();
                    map.put(type,character);
                    break;
            }

            return character;
        }
    }
}
