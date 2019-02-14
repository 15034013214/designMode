package Flyweight;

// 具体的享元角色
public class MyCharacter {
    private char mychar;

    public MyCharacter(char mychar){
        this.mychar = mychar;
    }

    public void display(){
        System.out.println(mychar);
    }
}
