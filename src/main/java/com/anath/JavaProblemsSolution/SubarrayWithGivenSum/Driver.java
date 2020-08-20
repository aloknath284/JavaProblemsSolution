package com.anath.JavaProblemsSolution.SubarrayWithGivenSum;

import org.omg.CORBA.INTERNAL;

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
            String[] inputLine = input.readLine().trim().split(" ");
            int array_size = Integer.parseInt(inputLine[0]);
            int reqd_sum = Integer.parseInt(inputLine[1]);
            int[] array = new int[array_size];
            String[] inputArray = input.readLine().trim().split(" ");
            for (int i=0;i<array_size;i++)
                array[i]=Integer.parseInt(inputArray[i]);
            int current_sum = 0;
            int start_index = 0;
            int end_index = -1;
            HashMap<Integer,Integer> data_store = new HashMap<Integer, Integer>();
            for(int i = 0; i<array_size; i++) {
                current_sum += array[i];
                if (current_sum-reqd_sum == 0){
                    start_index=0;
                    end_index=i;
                    break;
                }else if(data_store.containsKey(current_sum-reqd_sum)){
                    start_index = (data_store.get(current_sum-reqd_sum))+1;
                    end_index=i;
                    break;
                }
                data_store.put(current_sum,i);
            }
            if(end_index == -1) {
                System.out.println("-1");
            } else {
                System.out.println((start_index+1)+" "+(end_index+1));
            }
        }
    }
}