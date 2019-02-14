package Bridge.Plan3bridge;

public class MainClass {
    public static void main(String[] args) {
        Engine engine = new Engine2000();
        Bus bus = new Bus(engine);
        bus.installEngine();
    }
}