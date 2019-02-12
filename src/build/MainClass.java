package build;
/*
    想盖房子？
        HouseDirector(HouseBuilder){让工程对建造房子}
        HouseBuilder接口  <------  A类房屋Builder | B类房屋Builder
    你只需要：
       房子 = new HouseDirector(new HouseBuilder{...}).盖房子。
       // HouseDirector接受的是HouseBuilder接口

      如果需要新的房子，只需要创建一个Builder。
 */
public class MainClass {
    public static void main(String[] args) {
        HouseDirector houseDirector1 = new HouseDirector(new HouseTypeABuilder());  // 传入什么类型的工程队都行
        House house1 = houseDirector1.makeHouse();

        HouseDirector houseDirector2 = new HouseDirector(new HouseTypeBBuilder());
        House house2 = houseDirector2.makeHouse();
    }
}
