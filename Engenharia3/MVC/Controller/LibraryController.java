package Controller;

import Controller.Strategy.TitleSearch;
import Model.Composite.Book;
import Model.Composite.Section;
import Model.LibraryComponent;
import Model.LibraryMember;
import Model.LibrarySingleton;
import View.LibraryView;

public class LibraryController {
    LibrarySingleton library = LibrarySingleton.getInstance();
    SearchStrategy strategy = new TitleSearch();

    public Book addBook(String title, String author, String section) {
        Book book = new Book(title, author);
        Section bookSection = library.searchSection(section);
        if (bookSection == null) {
            bookSection = new Section(section);
            library.addComponent(bookSection);
        };
        bookSection.addComponent(book);
        return book;
    }

    public void searchBooks(String searchTerm) {
        for (LibraryComponent component : library.getComponents()) {
            Book book = strategy.search(component, searchTerm);
            if (book != null){
                System.out.printf("\tEncontrado o livro com titulo \"%s\" por \"%s\"\n", book.getTitle(), book.getAuthor());
                break;
            }
        }
    }
    public void displayLibrary() {
        LibraryView view = new LibraryView();
        for (LibraryComponent component : library.getComponents()) {
            view.displayLibraryComponent(component);
        }

    }
    public void setSearchStrategy(SearchStrategy searchStrategy) {
        this.strategy = searchStrategy;
    }

    public void subscribeUserToBook(LibraryMember member, Book book) {
        book.addObserver(member);
    }

    public void changeAvailability(Book book) {
        book.changeAvailability();
    }

    public void unsubscribeUserFromBook(LibraryMember member, Book book) {
        book.removeObserver(member);
    }
}
