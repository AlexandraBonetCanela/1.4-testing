package org.alexandra;

public class CalculoDNI {


    public static void main(String[] args) {

       Character dniLetter = calculateDNI(47902116);
       System.out.println(dniLetter);
    }

    public static Character calculateDNI(int dniNumber) {
        int remainder = dniNumber % 23;

        Character[] dniLetters ={'T', 'R', 'W', 'A', 'G', 'M', 'Y', 'F', 'P', 'D', 'X', 'B', 'N', 'J', 'Z', 'S', 'Q', 'V', 'H', 'L', 'C', 'K', 'E'};

        return dniLetters[remainder];
    }
}