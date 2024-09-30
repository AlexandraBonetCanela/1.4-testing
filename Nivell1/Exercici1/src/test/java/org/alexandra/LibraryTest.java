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
    void testLibraryBooksListHasSameSizeAfterAddingTwoBooks() {
        library.addLibraryBook("My roommate is a vampire");
        library.addLibraryBook("Jumpnauts");

        assertEquals(2, library.getLibraryBooks().size());
    }
    @Test
    void testLibraryBooksListHasSpecificBookInCorrectPosition(){
        library.addLibraryBook("My roommate is a vampire");
        library.addLibraryBook("Jumpnauts");

        assertEquals(1, library.getLibraryBooks().indexOf("Jumpnauts"));
    }
    @Test
    void testNoDuplicateBooksAllowedInLibraryBooksList(){
        library.addLibraryBook("My roommate is a vampire");
        library.addLibraryBook("My roommate is a vampire");

        assertEquals(1, library.getLibraryBooks().size());
    }
    @Test
    void testLibraryBooksListHasBookInSpecificPosition(){
        library.addLibraryBook("My roommate is a vampire");
        library.addLibraryBook("Jumpnauts");
        library.addLibraryBookByPosition("Phantasma", 2);

        assertEquals("Phantasma", library.getBook(2));
    }
    @Test
    void testAddBookModifiesLibraryBooksList(){
        assertEquals(0, library.getLibraryBooks().size());
        library.addLibraryBook("My roommate is a vampire");
        assertEquals(1, library.getLibraryBooks().size());
    }
    @Test
    void testLibraryBooksListHasLessSizeAfterRemoveBook(){
        library.addLibraryBook("Hobbit");
        assertEquals(1, library.getLibraryBooks().size());
        library.removeLibraryBook("Hobbit");
        assertEquals(0, library.getLibraryBooks().size());
    }
    //TODO order alphabetically test
}
