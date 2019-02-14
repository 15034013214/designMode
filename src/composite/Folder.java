package composite;

import java.util.ArrayList;
import java.util.List;

public class Folder implements IFile{
    private String name;
    private List<IFile> childs;

    public Folder(String name){
        this.name = name;
        this.childs = new ArrayList<IFile>();
    }

    @Override
    public void display() {
        System.out.println(name);
    }

    @Override
    public boolean add(IFile iFile) {
        return childs.add(iFile);
    }

    @Override
    public boolean remove(IFile iFile) {
        return childs.remove(iFile);
    }

    @Override
    public List<IFile> getChild() {
        return childs;
    }
}
