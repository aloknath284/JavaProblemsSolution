package com.anath.JavaProblemsSolution.CharReplaceForDistinct;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class Driver {
    public static void main(String[] args) throws IOException {
        BufferedReader input = new BufferedReader(new InputStreamReader(System.in));
        int testCases = Integer.parseInt(input.readLine().trim());
        final int MAX_LENGTH = 26;
        int[] count = new int[26];
        for (int i=0 ; i<MAX_LENGTH ;i++)
            count[i]=0;
        while (testCases-- >0){
            String string = input.readLine().trim();
            int len = string.length();
            if (len > MAX_LENGTH)
                System.out.println(-1);
            for (int i=0 ; i<MAX_LENGTH ;i++)
                count[i]=0;
            int distinct = 0;
            for (int i=0; i<len; i++){
                if ((count[string.charAt(i)-'a']++)==0)
                    distinct++;
            }
            System.out.println(len-distinct);
        }
    }
}
