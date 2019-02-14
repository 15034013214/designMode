package Bridge.Plan3bridge;

public class Jeep extends Car{
    public Jeep(Engine engine) {
        super(engine);
    }

    @Override
    public void installEngine() {
        System.out.println("给Jeep安装引擎");
        this.getEngine().installEngine();
    }
}
