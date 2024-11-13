package Model;

public abstract class LibraryComponent {
    protected String title;

    public LibraryComponent(String title) {
        this.title = title;
    }

    public String getTitle() {
        return title;
    }

    public abstract void display();
}
