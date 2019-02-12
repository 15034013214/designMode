package prototype;

import java.util.ArrayList;

public class Person implements Cloneable{   // Cloneable 的作用是申明该类可以克隆。
    public String country;
    public String name;
    public ArrayList<String> friends;
    // get set 方法。。。。
    @Override
    protected Person clone() throws CloneNotSupportedException {
        Person returnPerson = (Person)super.clone();
        returnPerson.friends = (ArrayList<String>) friends.clone(); // 对于引用数据数据类型，实现深度克隆（复制内部数据）。
        return returnPerson;  // 使用object的克隆方法实现克隆。

    }
}
