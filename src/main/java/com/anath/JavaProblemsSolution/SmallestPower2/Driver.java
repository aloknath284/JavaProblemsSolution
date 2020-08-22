package com.anath.JavaProblemsSolution.SmallestPower2;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class Driver {
    public static void main(String[] args) throws IOException {
        BufferedReader input = new BufferedReader(new InputStreamReader(System.in));
        int test_cases = Integer.parseInt(input.readLine().trim());
        while (test_cases-- > 0){
            int num = Integer.parseInt(input.readLine().trim());
            int count = 0;

            while (num/2 != 0){
                num = num + num%2;
                num = num/2;
                count++;
            }

            System.out.println((int)Math.pow(2,count));
        }
    }
}
