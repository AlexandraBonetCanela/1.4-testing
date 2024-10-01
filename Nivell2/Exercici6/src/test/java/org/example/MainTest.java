package org.example;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class MainTest {
    @Test
    void testAccessElementArrayThrowsNullPointerException(){
        assertThrowsExactly(ArrayIndexOutOfBoundsException.class,()->{
            Main.accesElementArray();
        });
    }
}