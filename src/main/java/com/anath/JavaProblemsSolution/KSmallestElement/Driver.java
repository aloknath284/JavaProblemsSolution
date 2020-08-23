package com.anath.JavaProblemsSolution.KSmallestElement;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.Arrays;

public class Driver {
    public static void main(String[] args) throws IOException {
        BufferedReader input = new BufferedReader(new InputStreamReader(System.in));
        int test_cases = Integer.parseInt(input.readLine().trim());
        while (test_cases-->0){
            int size = Integer.parseInt(input.readLine().trim());
            String[] inputLine = input.readLine().trim().split(" ");
            int smallest_pos = Integer.parseInt(input.readLine().trim());
            int[] array = new int[size];
            for (int i=0; i<size; i++)
                array[i] = Integer.parseInt(inputLine[i].trim());
            Arrays.sort(array);
            System.out.println(array[--smallest_pos]);
        }
    }
}
