package org.example.Part1;

public class CovertSong {

    public static String Convert(String song){
        song=song.replace(","," ");
        song=song.replace("\n"," ");
        song=song.toLowerCase();

        return song;
    }
}
