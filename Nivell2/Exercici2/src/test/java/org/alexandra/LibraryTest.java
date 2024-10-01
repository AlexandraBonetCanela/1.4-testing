package org.alexandra;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class LibraryTest {

    @Test
    void testReferenceObjectIsTheSame(){
        Library library1 = new Library();
        Library library2 = library1;

        assertEquals(library1, library2);
    }
}