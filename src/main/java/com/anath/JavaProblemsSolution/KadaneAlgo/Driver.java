package com.anath.JavaProblemsSolution.KadaneAlgo;

import java.util.*;
import java.lang.*;
import java.io.*;
import java.io.BufferedReader;
import java.io.InputStreamReader;

//Problem : https://practice.geeksforgeeks.org/problems/kadanes-algorithm/0

class Driver {
    public static void main (String[] args) throws Exception {
        BufferedReader input = new BufferedReader(new InputStreamReader(System.in));
        int test_cases = Integer.parseInt(input.readLine().trim());
        while (test_cases-- > 0){
            int array_size = Integer.parseInt(input.readLine().trim());
            int[] array = new int[array_size];
            String[] inputLine = input.readLine().trim().split(" ");
            for (int i=0;i<array_size;i++)
                array[i]=Integer.parseInt(inputLine[i]);
            int max_sum = array[0];
            int current_sum = array[0];
            for (int i=1 ; i<array_size;i++){
                current_sum = Math.max(array[i],current_sum+array[i]);
                max_sum = Math.max(current_sum,max_sum);
            }
            System.out.println(max_sum);
        }
    }
}