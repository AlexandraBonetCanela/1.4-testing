package org.alexandra;

import static org.junit.jupiter.api.Assertions.*;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

public class LibraryTest {

    Library library;

    @BeforeEach
    void setUp() {
        library = new Library();
    }
    @Test
    void testLibraryBooksIsNotNull(){
        assertNotNull(library.getLibraryBooks());
    }
    @Test
    void testLibraryBooksHasSameSizeAfterAddingTwoBooks() {
        library.addLibraryBook("My roommate is a vampire");
        library.addLibraryBook("Jumpnauts");

        assertEquals(2, library.getLibraryBooks().size());
    }
    @Test
    void testLibraryBooksHasSpecificBookInCorrectPosition(){
        library.addLibraryBook("My roommate is a vampire");
        library.addLibraryBook("Jumpnauts");

        assertEquals(0, library.getLibraryBooks().indexOf("Jumpnauts"));
    }
    @Test
    void testNoDuplicateBooksAllowedInLibraryBooks(){
        library.addLibraryBook("My roommate is a vampire");
        library.addLibraryBook("My roommate is a vampire");

        assertEquals(1, library.getLibraryBooks().size());
    }
    @Test
    void testLibraryBooksHasBookInSpecificPosition(){
        library.addLibraryBook("My roommate is a vampire");
        library.addLibraryBook("Jumpnauts");
        library.addLibraryBookByPosition("Phantasma", 2);

        assertEquals("Phantasma", library.getBook(2));
    }
    @Test
    void testAddBookModifiesLibraryBooks(){
        assertEquals(0, library.getLibraryBooks().size());
        library.addLibraryBook("My roommate is a vampire");
        assertEquals(1, library.getLibraryBooks().size());
    }
    @Test
    void testLibraryBooksHasLessSizeAfterRemoveBook(){
        library.addLibraryBook("Hobbit");
        assertEquals(1, library.getLibraryBooks().size());
        library.removeLibraryBook("Hobbit");
        assertEquals(0, library.getLibraryBooks().size());
    }
    @Test
    void testLibraryBooksIsAlphabeticallyOrdered(){
        library.addLibraryBook("My roommate is a vampire");
        library.addLibraryBook("Jumpnauts");
        library.addLibraryBook("Hobbit");
        assertEquals("Hobbit", library.getBook(0));
        assertEquals("Jumpnauts", library.getBook(1));
        assertEquals("My roommate is a vampire", library.getBook(2));
    }
}
