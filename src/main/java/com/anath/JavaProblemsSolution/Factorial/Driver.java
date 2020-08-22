package com.anath.JavaProblemsSolution.Factorial;


public class Driver {
    public static void main(String[] args){
        int input = 5;
        int output = findFact(input);
        System.out.println(output);
    }

    public static int findFact(int num){
        if (num==1)
            return 1;
        return num*findFact(num-1);
    }
}

