package com.sparta;

import java.util.Arrays;

public class Client {

    public void invokeRecuriveFibonacci() {
        // write your code here
        int[] sequence;

        RecursiveFibonacci rf = new RecursiveFibonacci();

        sequence = rf.fibonacci(10);
        System.out.println("\n" + Arrays.toString(sequence));

        sequence = rf.fibonacci(20);
        System.out.println("\n" + Arrays.toString(sequence));

        sequence = rf.fibonacci(30);
        System.out.println("\n" + Arrays.toString(sequence));

    }
}
