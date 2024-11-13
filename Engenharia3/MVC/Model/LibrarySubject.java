package Model;

public interface LibrarySubject {
    void addObserver(LibraryObserver observer);
    void removeObserver(LibraryObserver observer);
    void changeAvailability();
}

