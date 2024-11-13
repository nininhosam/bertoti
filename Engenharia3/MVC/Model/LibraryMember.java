package Model;

public class LibraryMember implements LibraryObserver {
    public String name;
    public LibraryMember(String name){
        this.name = name;
    }
    @Override
    public void update(String bookTitle, Boolean available) {
        if (available) {
            System.out.printf("Usuário(a) \"%s\" foi notificado(a) que o livro \"%s\" está disponível\n", name, bookTitle);
        } else {
            System.out.printf("Usuário(a) \"%s\" foi notificado(a) que o livro \"%s\" não está disponível\n", name, bookTitle);
        }
    }
}
