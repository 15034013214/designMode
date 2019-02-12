package factory.sumpleFactory.factory;

import factory.sumpleFactory.productImpl.Fruit;

/**
 * 工厂角色
 */
public class FruitFactory {

    /**
     * get方法获取所有具体实例
     * @param type  要获取什么类型的水果(类名)
     * @return 返回水果
     */
    public static Fruit getFruit(String type) throws IllegalAccessException, InstantiationException, ClassNotFoundException {
        /*
        // 根据字符串判断
        if(type.equalsIgnoreCase("apple")){
            return Apple.class.newInstance();
        }else if(type.equalsIgnoreCase("banana")){
            return Banana.class.newInstance();
        }else {
            return null;
        }
        */

        // 直接根据类名创建实例
        Class frute = Class.forName(type);
        return (Fruit) frute.newInstance();
    }
}
