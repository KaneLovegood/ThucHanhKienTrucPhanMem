package composite;
import java.util.ArrayList;
import java.util.List;

public class FolderComposite implements FileSystemComponent {

    private String name;
    private List<FileSystemComponent> children;

    public FolderComposite(String name) {
        this.name = name;
        children = new ArrayList<>();
    }

    public void add(FileSystemComponent component) {
        children.add(component);
    }

    public void remove(FileSystemComponent component) {
        children.remove(component);
    }

    @Override
    public void display(String indent) {
        System.out.println(indent + "+ Folder: " + name);

        for (FileSystemComponent component : children) {
            component.display(indent + "   ");
        }
    }
}