package nameDirectory;
import java.util.ArrayList;

public class NameDirectory {
    private ArrayList<String> names = new ArrayList<>();

    public void addName(String name) {
        if (name != null && !name.isBlank()) names.add(name);
    }

    public boolean removeName(String name) {
        return names.remove(name);
    }

    public boolean containsName(String name) {
        return names.contains(name);
    }

    public void printAll() {
        for (String n : names) System.out.println(n);
    }

    public static void main(String[] args) {
        NameDirectory d = new NameDirectory();
        d.addName("Arun");
        d.addName("Bala");
        d.addName("Chitra");
        System.out.println(d.containsName("Bala"));
        d.removeName("Bala");
        d.printAll();
    }
}
