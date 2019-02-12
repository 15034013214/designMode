package build;

/**
 * 用于设计房子的类
 * 可以让所有的工程对执行任务
 */
public class HouseDirector {
    private HouseBuilder houseBuilder = null;
    HouseDirector(HouseBuilder houseBuilder){   // 需要什么工程对干活就传入什么工程队
        this.houseBuilder = houseBuilder;
    }

    public House makeHouse(){
        houseBuilder.buildFloor("地板");
        houseBuilder.buildWall("墙面");
        return houseBuilder.getHouse();
    }
}
