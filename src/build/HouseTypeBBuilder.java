package build;

/**
 * A类房屋实际的工程队
 * 负责将房子从无到有建造出来。
 */
public class HouseTypeBBuilder implements HouseBuilder{
    private House house = null;

    @Override
    public void buildFloor(String floor) {
        house.floor = floor;
    }

    @Override
    public void buildWall(String wall) {
        house.wall = wall;
    }

    @Override
    public House getHouse() {
        return house;
    }

}
