package Flyweight;

import java.util.HashMap;
import java.util.Map;

public class MyCharacterFactory {
    private Map<Character , MyCharacter> pool;

    public MyCharacterFactory(){
        pool = new HashMap<Character, MyCharacter>();
    }

    public MyCharacter getMyCharacter(Character character){
        if(pool.containsKey(character)){
            return pool.get(character);
        }else {
            MyCharacter myCharacter = new MyCharacter(character);
            pool.put(character , myCharacter);
            return pool.get(character);
        }
    }
}
