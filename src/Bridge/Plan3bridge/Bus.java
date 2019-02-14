package Bridge.Plan3bridge;

public class Bus extends Car{

    public Bus(Engine engine) {
        super(engine);
    }

    @Override
    public void installEngine() {
        System.out.print("bus 安装引擎");
        this.getEngine().installEngine();
    }
}
