package Flyweight;

public class MianClass {
    public static void main(String[] args) {
        MyCharacterFactory myCharacterFactory = new MyCharacterFactory();
        MyCharacter myCharacter1 = myCharacterFactory.getMyCharacter('a');
        MyCharacter myCharacter2 = myCharacterFactory.getMyCharacter('a');
        // 这个时候myCharacter1 和  myCharacter2  共享同一个对象。
    }
}
