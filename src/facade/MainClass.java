package facade;

public class MainClass {
    public static void main(String[] args) {
        Facade facade = new Facade();
        facade.do12Something();     //通过facade 来访问类似的类群。
        facade.do123Something();
    }
}