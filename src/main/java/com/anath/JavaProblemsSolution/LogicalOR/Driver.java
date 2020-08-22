package com.anath.JavaProblemsSolution.LogicalOR;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.ArrayList;
import java.util.Arrays;

public class Driver {
    public static void main(String[] args) throws IOException {
        BufferedReader input = new BufferedReader(new InputStreamReader(System.in));
        int test_cases = Integer.parseInt(input.readLine().trim());
        while ( test_cases-- > 0 ){
            String[] inputLine = input.readLine().trim().split(" ");
            int size = Integer.parseInt(inputLine[0]);
            int number = Integer.parseInt(inputLine[1]);
            inputLine = input.readLine().split(" ");
            int result = 0;
            int data = 0;
            for (int i=0; i<size; i++) {
                data = Integer.parseInt(inputLine[i]);
                if (data%number==0)
                    result |= data;
            }
            System.out.println(result);
        }
    }
}
