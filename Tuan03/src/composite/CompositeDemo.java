package composite;

public class CompositeDemo {
    public static void main(String[] args) {
        Folder root = new Folder("Root");
        Folder documents = new Folder("Documents");
        Folder images = new Folder("Images");

        FileItem file1 = new FileItem("resume.pdf");
        FileItem file2 = new FileItem("photo.jpg");
        FileItem file3 = new FileItem("notes.txt");

        documents.add(file1);
        documents.add(file3);
        images.add(file2);

        root.add(documents);
        root.add(images);

        root.display("");
    }
}