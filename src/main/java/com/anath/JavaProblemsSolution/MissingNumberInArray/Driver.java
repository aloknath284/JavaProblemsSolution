package com.anath.JavaProblemsSolution.MissingNumberInArray;

import java.util.*;
import java.lang.*;
import java.io.*;
import java.io.BufferedReader;
import java.io.InputStreamReader;

//Problem : https://practice.geeksforgeeks.org/problems/subarray-with-given-sum/0

class Driver {
    public static void main (String[] args) throws Exception {
        BufferedReader input = new BufferedReader(new InputStreamReader(System.in));
        int test_cases = Integer.parseInt(input.readLine().trim());
        while (test_cases-- > 0){
            int number = Integer.parseInt(input.readLine().trim());
            String[] inputLine = input.readLine().trim().split(" ");
            ArrayList<Integer> input_array_list = new ArrayList<Integer>();
            for (String s : inputLine)
                input_array_list.add(Integer.parseInt(s.trim()));
            for (int i=0;i<number;i++){
                if (!input_array_list.contains(i+1)) {
                    System.out.println(i+1);
                    break;
                }
            }
        }
    }
}