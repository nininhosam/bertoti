package Model;
import Model.Composite.Section;
import java.util.ArrayList;
import java.util.List;
import java.util.Objects;

public class LibrarySingleton {
    private static LibrarySingleton instance;
    private final List<LibraryComponent> components;
    private LibrarySingleton(){
        components = new ArrayList<>();
    };

    public static LibrarySingleton getInstance(){
        if (instance == null) {
            instance = new LibrarySingleton();
        }
        return instance;
    }

    public void addComponent(LibraryComponent component) {
        components.add(component);
    }
    public List<LibraryComponent> getComponents(){
        return components;
    }
    public Section searchSection(String name){
        for (LibraryComponent comp: components) {
            if (comp instanceof Section && Objects.equals(comp.title, name)) {
                return (Section) comp;
            };
        };
        return null;
    }

}
