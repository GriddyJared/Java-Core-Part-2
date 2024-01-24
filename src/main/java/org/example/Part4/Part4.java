package org.example.Part4;


import java.io.*;
import java.util.*;

public class Part4 {
    public static void main(String[] args) throws BeatlesException, FileNotFoundException {
        File songFile= new File("/Users/jaredhall/IdeaProjects/Java_Core_Part2/src/main/java/org/example/Part4/beatles yellow submarine.txt");
        Scanner scanner = new Scanner(songFile);
        String song = "";
        try {
            while (scanner.hasNext()){
                song = song.concat(scanner.nextLine() + "\n");

            }

        } catch (Exception w) {
            w.printStackTrace();
        }

        if (!isIn.found("Show must go on!", song)){
            throw new BeatlesException("Beatles");
        }else{
            System.out.println("Word has been found");
        }




    }
}
