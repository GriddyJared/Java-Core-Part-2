package org.example.Regex;

import java.util.regex.Matcher;
import java.util.regex.Pattern;

public class FindContains {



    public  boolean containsOrderUUid(String input){
        String regex = "\\borderUUID=([a-f0-9\\-]+)\\b";
        Pattern pattern = Pattern.compile(regex);
        Matcher matcher = pattern.matcher(input);

        return matcher.find();
    }

    public  String findOrderUUid(String input){
        String regex = "\\borderUUID=([a-f0-9\\-]+)\\b";
        Pattern pattern = Pattern.compile(regex);
        Matcher matcher = pattern.matcher(input);

        if(matcher.find()){
            return matcher.group(1);
        }else {
            return null;
        }
    }

    public  String findEmail(String input){
        String regex = "\\b([a-zA-Z0-9._%+-]+@[a-zA-Z0-9.-]+\\.[a-zA-Z]{2,})\\b";
        Pattern pattern = Pattern.compile(regex);
        Matcher matcher = pattern.matcher(input);

        if(matcher.find()){
            return matcher.group(1);
        }else {
            return null;
        }
    }

    public  int findOrders(String input){
        String regex = "total number of orders successfully processed: \\[(\\d+)]";
        Pattern pattern = Pattern.compile(regex);
        Matcher matcher = pattern.matcher(input);

        if(matcher.find()){
            String ordersCountStr = matcher.group(1);
            return Integer.parseInt(ordersCountStr);
        } else {
            return 0;
        }
    }





}
