package org.alexandra;

import java.util.ArrayList;
import java.util.Collections;

public class Library {

    private ArrayList<String> libraryBooks;

    public Library() {
        libraryBooks = new ArrayList<>();
    }

    public void addLibraryBook(String book) {
        addLibraryBookByPosition(book, libraryBooks.size());
    }

    public ArrayList<String> getLibraryBooks() {
        return libraryBooks;
    }

    public String getBook(int position) {
        return libraryBooks.get(position);
    }

    public void addLibraryBookByPosition(String book, int position) {
        if (!libraryBooks.contains(book)){
            libraryBooks.add(position, book);
        } else {
            System.out.println("Book already saved in the library");
        }
        sortLibraryBooks();
    }

    public void removeLibraryBook(String libraryBook) {
        libraryBooks.remove(libraryBook);
        sortLibraryBooks();
    }

    public void sortLibraryBooks() {
        Collections.sort(libraryBooks);
    }
 }
