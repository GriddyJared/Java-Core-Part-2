package org.example.Part4;

public class isIn {

    public static boolean  found(String wordToFind, String wordToCheck) {
        return  (wordToCheck.toLowerCase().contains(wordToFind.toLowerCase()));

    }
}
