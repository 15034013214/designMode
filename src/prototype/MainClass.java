package prototype;

public class MainClass {
    public static void main(String[] args) throws CloneNotSupportedException {
        Person person1 = new Person();
        person1.country = "中国";
        Person person2 = person1.clone();   // 通过person1克隆出person2
    }
}
