package Controller;

import Model.Composite.Book;
import Model.LibraryComponent;

public interface SearchStrategy {
    Book search(LibraryComponent libraryComponent, String searchTerm);
}
