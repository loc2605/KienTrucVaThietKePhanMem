package composite;

import java.util.ArrayList;
import java.util.List;

public class Folder implements FileSystemItem {
    private String name;
    private List<FileSystemItem> children;

    public Folder(String name) {
        this.name = name;
        this.children = new ArrayList<>();
    }

    public void add(FileSystemItem item) {
        children.add(item);
    }

    public void remove(FileSystemItem item) {
        children.remove(item);
    }

    @Override
    public void display(String indent) {
        System.out.println(indent + "+ Folder: " + name);
        for (FileSystemItem item : children) {
            item.display(indent + "   ");
        }
    }

    @Override
    public String getName() {
        return name;
    }
}