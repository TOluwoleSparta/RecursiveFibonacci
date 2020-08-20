package com.sparta;

public class RecursiveFibonacci {

    // creating array in which to store and return the sequence
    public int[] fibonacci(int seqLengthInput) {
        int[] returnArray = new int[seqLengthInput];
        return fillFibonacciSequence(seqLengthInput, returnArray);
    }

    // filling array recursively
    private int[] fillFibonacciSequence(int nthTerm, int[] sequence) {
        if (nthTerm > 1) {
            // get actual nth term
            sequence[nthTerm - 1] = getFibonacciTerm(nthTerm - 1);
            // go backwards in sequence (recursive)
            return fillFibonacciSequence(nthTerm - 1, sequence);
        }

        return sequence;
    }

    // getting fibonacci values recursively
    private int getFibonacciTerm(int nthTerm) {
        if (nthTerm == 0) {
            return 0;
        } else if (nthTerm == 1) {
            return 1;
        } else {
            return getFibonacciTerm(nthTerm - 1) + getFibonacciTerm(nthTerm - 2);
        }
    }
}
