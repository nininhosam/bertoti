package Controller.Strategy;

import Controller.SearchStrategy;
import Model.Composite.Book;
import Model.Composite.Section;
import Model.LibraryComponent;

public class TitleSearch implements SearchStrategy {
    @Override
    public Book search(LibraryComponent libraryComponent, String searchTerm) {
        if (libraryComponent instanceof Book book) {
            if (book.getTitle().toLowerCase().contains(searchTerm.toLowerCase())) {
                return book;
            }
        } else if (libraryComponent instanceof Section section) {
            System.out.println("Searching books in section: " + section.getTitle());
            for (LibraryComponent component : section.getComponents()) {
                Book foundBook = search(component, searchTerm);
                if (foundBook != null) {
                    return foundBook;
                }
            }
        }
        return null;
    }
}
