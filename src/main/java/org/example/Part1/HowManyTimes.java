package org.example.Part1;

public class HowManyTimes {
    String word;
    String[] arr;

    int count=0;
    public HowManyTimes(String word) {
        this.word = word;
    }

    public int makeArray (String word){
        for( String val : word.split(" ")){
            count+=1;
        }
        arr= new String[count];
        for( String val : word.split(" ")){
        }

        return 0;
    }
}
