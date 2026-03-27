package composite;

public class FileItem implements FileSystemItem {
    private String name;

    public FileItem(String name) {
        this.name = name;
    }

    @Override
    public void display(String indent) {
        System.out.println(indent + "- File: " + name);
    }

    @Override
    public String getName() {
        return name;
    }
}