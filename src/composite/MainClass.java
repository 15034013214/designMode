package composite;

import java.util.List;

// 构造了一个文件系统的，树形目录
public class MainClass {
    public static void main(String[] args) {
        // C 盘
        Folder rootFolder = new Folder("C");
        // xm 目录
        Folder xmFolder = new Folder("xm");
        // xm.txt文件
        File xmFile = new File("xm.txt");
        // xm 目录下的内容
        File xjjFile = new File("xjj.txt");
        xmFolder.add(xjjFile);


        rootFolder.add(xmFile);
        rootFolder.add(xmFolder);

        disPlayTree(rootFolder , 0);
    }

    // 便利树（递归获取）
    public static void disPlayTree(IFile rootFolder , int deep){
        for(int i = 0; i < deep; i++) {
            System.out.print("--");
        }
        // 显示根节点
        rootFolder.display();
        // 获得子节点
        List<IFile> childs = rootFolder.getChild();
        // 便利子节点
        for(IFile file : childs){
            if(file instanceof File){
                for(int i = 0; i <= deep; i++) {
                    System.out.print("--");
                }
                file.display();
            }else {
                disPlayTree(file , deep + 1);
            }
        }
    }
}
