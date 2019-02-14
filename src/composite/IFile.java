package composite;

import java.util.List;

// 文件和目录的抽象
public interface IFile {
    // 显示文件名称
    void display();

    boolean add(IFile iFile);

    boolean remove(IFile iFile);

    List<IFile> getChild();
}
