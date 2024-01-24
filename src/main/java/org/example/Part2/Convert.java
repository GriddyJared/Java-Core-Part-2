package org.example.Part2;

import java.util.*;

public class Convert {
    public static List<String> toList(String[]songArray){


        return new ArrayList<>(Arrays.asList(songArray));

    }

    public static List<String> removeDuplicates (List<String> songList){


        return new HashSet<>(songList).stream().toList();



    }
}
