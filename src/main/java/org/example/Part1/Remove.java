package org.example.Part1;

public class Remove {

    public static String Convert(String song){
        song=song.replace(","," ");
        song=song.replace("\n"," ");
        song=song.replace("("," ");
        song=song.replace(")"," ");
        song=song.toLowerCase();

        return song;
    }
}
