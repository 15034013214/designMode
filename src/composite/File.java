package composite;

import java.util.List;

public class File implements IFile{
    private String name;

    public File(String name){
        this.name = name;
    }

    @Override
    public void display() {
        System.out.println(name);
    }

    /*
        对于叶子节点而言，下面这个方法是没有用的。
        这种情况有两种选择，
            1：透明的：
                就是现在这种模式，这些方法都实现了。但是都没有作用。
            2：安全的：
                就是细化父类接口，将没有用的这些方法再抽象出一个分支来。
     */
    @Override
    public boolean add(IFile iFile) {
        return false;
    }

    @Override
    public boolean remove(IFile iFile) {
        return false;
    }

    @Override
    public List<IFile> getChild() {
        return null;
    }
}
