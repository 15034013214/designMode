package build;

// 装修房子的工程队接口
public interface HouseBuilder {
    void buildFloor(String floor);
    void buildWall(String wall);
    House getHouse();
}
