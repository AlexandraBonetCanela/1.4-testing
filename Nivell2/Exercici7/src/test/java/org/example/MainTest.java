package org.example;

import org.junit.jupiter.api.Test;

import java.util.Optional;

import static org.junit.jupiter.api.Assertions.*;

class MainTest {

    @Test
    void testOptionalObjectIsEmpty() {
        Optional<String> optional = Optional.empty();
        assertFalse(optional.isPresent());
    }

}