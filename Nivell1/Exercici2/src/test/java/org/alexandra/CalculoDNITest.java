package org.alexandra;

import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;
import org.junit.jupiter.params.ParameterizedTest;
import org.junit.jupiter.params.provider.CsvSource;

import static org.junit.jupiter.api.Assertions.*;

class CalculoDNITest {

    int dni;
    @BeforeEach
    void setUp() {
        dni = 47902116;
    }

    @ParameterizedTest
    @CsvSource({
            "47902116, Q",
            "43748065, H",
            "78940035, X",
            "45685578, B",
            "45685579, N",
            "45685580, J",
            "45685581, Z",
            "45685582, S",
            "45685583, Q",
            "45685584, V"
    })
    void testCalculateDNI(int dniNumber, char expectedLetter) {
        assertEquals(expectedLetter, CalculoDNI.calculateDNI(dniNumber) );
    }
}