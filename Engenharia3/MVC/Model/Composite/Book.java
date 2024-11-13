package Model.Composite;

import Model.LibraryComponent;
import Model.LibraryObserver;
import Model.LibrarySubject;

import java.util.ArrayList;
import java.util.List;

public class Book extends LibraryComponent implements LibrarySubject {
    private List<LibraryObserver> subscribedUsers;
    private Boolean available;
    private String author;

    public Book(String title, String author) {
        super(title);
        this.author = author;
        this.subscribedUsers = new ArrayList<>();
        this.available = false;
    }

    public String getAuthor() {
        return author;
    }

    @Override
    public void display() {
        System.out.println("\tBook: " + getTitle() + " by " + getAuthor());
    }

    @Override
    public void addObserver(LibraryObserver observer) {
        subscribedUsers.add(observer);
    }

    @Override
    public void removeObserver(LibraryObserver observer) {
        subscribedUsers.remove(observer);
    }

    @Override
    public void changeAvailability() {
        available = !available;
        for (LibraryObserver obs: subscribedUsers) {
            obs.update(title, available);
        }
    }
}