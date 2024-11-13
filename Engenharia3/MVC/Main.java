import Controller.LibraryController;
import Controller.Strategy.AuthorSearch;
import Model.Composite.Book;
import Model.LibraryMember;
class MVC {
    public static void main (String[] args){
        LibraryController controller = new LibraryController();

        System.out.println("\t\t[Composite] Listando tudo que está na seção Principal:");
        Book b1 = controller.addBook("Um belo dia", "Margaret", "Romance");
        Book b2 = controller.addBook("Uma bela tarde", "Rosane", "Romance");
        Book b3 = controller.addBook("Uma bela noite", "Marianne", "Romance");
        controller.addBook("Fora do comum", "Robert", "Aventura");
        controller.addBook("Fora do normal", "Patrick", "Aventura");
        controller.addBook("Mais uma vez", "Ronald", "Sci-fi");
        controller.displayLibrary();

        System.out.println("\n\t\t[Observer] Notificando a disponibilidade dos livros aos usuários inscritos:");
        LibraryMember m1 = new LibraryMember("John");
        LibraryMember m2 = new LibraryMember("Mary");
        LibraryMember m3 = new LibraryMember("Victor");
        controller.subscribeUserToBook(m1, b1);
        controller.subscribeUserToBook(m2, b2);
        controller.subscribeUserToBook(m3, b1);
        controller.subscribeUserToBook(m3, b2);
        controller.subscribeUserToBook(m3, b3);
        controller.changeAvailability(b1);
        controller.changeAvailability(b2);
        controller.changeAvailability(b3);

        System.out.println("\n\t\t[Strategy] Procurando livros por Titulo e Autor");
        controller.searchBooks("Uma bela noite");
        controller.setSearchStrategy(new AuthorSearch());
        controller.searchBooks("Patrick");
    }
}