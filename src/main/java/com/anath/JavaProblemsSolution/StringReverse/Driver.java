package com.anath.JavaProblemsSolution.StringReverse;

public class Driver {
    public static void main(String[] args){
        String input = "Alok Nath";
        String output = reverseStr(input);
        System.out.println(output);
    }

    public static String reverseStr(String s){
        if(s==null || s.length()==1)
            return s;
        else
            return reverseStr(s.substring(1))+s.charAt(0);
    }
}
