package Model.Composite;

import Model.LibraryComponent;

import java.util.ArrayList;
import java.util.List;

public class Section  extends LibraryComponent {
    private final List<LibraryComponent> components = new ArrayList<>();

    public Section(String title) {
        super(title);
    }

    public void addComponent(LibraryComponent component) {
        components.add(component);
    }

    public void removeComponent(LibraryComponent component) {
        components.remove(component);
    }

    @Override
    public void display() {
        System.out.println("Section: " + getTitle());
        for (LibraryComponent component : components) {
            component.display();
        }
    }
    public List<LibraryComponent> getComponents(){
        return components;
    }
}