package org.example.Part1;

import java.util.HashMap;

public class Part1 {


    public static void main(String[] args) {
        HashMap<String,Integer> timesRepeated =new HashMap<>();
        int times = 0;
        String song= "In the town where I was born\n" +
                "Lived a man who sailed to sea\n" +
                "And he told us of his life\n" +
                "In the land of submarines\n" +
                "\n" +
                "So we sailed up to the sun\n" +
                "'Til we found the sea of green\n" +
                "And we lived beneath the waves\n" +
                "In our yellow submarine\n" +
                "\n" +
                "We all live in a yellow submarine\n" +
                "Yellow submarine, yellow submarine\n" +
                "We all live in a yellow submarine\n" +
                "Yellow submarine, yellow submarine\n" +
                "\n" +
                "And our friends are all aboard\n" +
                "Many more of them live next door\n" +
                "And the band begins to play\n" +
                "\n" +
                "We all live in a yellow submarine\n" +
                "Yellow submarine, yellow submarine\n" +
                "We all live in a yellow submarine\n" +
                "Yellow submarine, yellow submarine\n" +
                "\n" +
                "Full speed ahead, Mr. Boatswain, full speed ahead!\n" +
                "Full speed it is, Sergeant!\n" +
                "Cut the cable, drop the cable!\n" +
                "Aye-aye, sir, aye-aye!\n" +
                "Captain, Captain!\n" +
                "\n" +
                "As we live a life of ease (a life of ease)\n" +
                "Everyone of us (everyone of us) has all we need (has all we need)\n" +
                "Sky of blue (sky of blue) and sea of green (sea of green)\n" +
                "In our yellow (in our yellow) submarine (submarine, ah-ha)\n" +
                "\n" +
                "We all live in a yellow submarine\n" +
                "Yellow submarine, yellow submarine\n" +
                "We all live in a yellow submarine\n" +
                "Yellow submarine, yellow submarine\n" +
                "\n" +
                "We all live in a yellow submarine\n" +
                "Yellow submarine, yellow submarine\n" +
                "We all live in a yellow submarine\n" +
                "Yellow submarine, yellow submarine\n";


        song= Remove.Convert(song);

        String[] songArray = song.split(" ");

        for (String val1 : songArray) {
            times = 0;
            for (String val2 : songArray) {
                if (val1.equals(val2)) {
                    times += 1;
                }

            }
            timesRepeated.put(val1,times);
        }
        System.out.println("This is the amount of times each word is repeated : " + timesRepeated);
    }
}
