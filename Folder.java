import java.util.ArrayList;
import java.util.List;

public class Folder implements StorageContainer {

    private String name;
    private List<StorageUnit> children;

    public Folder(String name) {
        this.name = name;
        this.children = new ArrayList<>();
    }

    @Override
    public String getName() {
        return name;
    }

    @Override
    public void addStorageUnit(StorageUnit unit) {
        children.add(unit);
    }

    @Override
    public long getSize() {

        long total = 0;

        for (StorageUnit child : children) {
            total += child.getSize();
        }

        return total;
    }

    @Override
    public void display(String indent) {

        System.out.println(
            indent + "Folder: " + name
            + " - " + getSize() + " bytes"
        );

        for (StorageUnit child : children) {
            child.display(indent + "    ");
        }
    }
}
