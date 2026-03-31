package composite;
public class Main {

    public static void main(String[] args) {

        FolderComposite root = new FolderComposite("Root");

        FileLeaf file1 = new FileLeaf("file1.txt");
        FileLeaf file2 = new FileLeaf("file2.txt");

        FolderComposite documents = new FolderComposite("Documents");
        documents.add(new FileLeaf("doc1.pdf"));
        documents.add(new FileLeaf("doc2.pdf"));

        root.add(file1);
        root.add(file2);
        root.add(documents);

        root.display("");
    }
}