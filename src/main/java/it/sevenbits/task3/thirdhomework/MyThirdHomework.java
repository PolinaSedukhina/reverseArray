package it.sevenbits.task3.thirdhomework;

import it.sevenbits.task3.interfacereverse.implementation.InvertArray;

/**
 * Homework 3.
 * Sedukhina Polina
 */

public final class MyThirdHomework {
    /**
     * size of array.
     */
    private static final int SIZE = 8;

    /**
     * Default constructor.
     */
    private MyThirdHomework() {
    }
    /**
     * @param args incoming arguments
     */
    public static void main(final String[] args) {
        Integer[] myArray = new Integer[SIZE];
        for (int i = 0; i < SIZE; i++) {
            myArray[i] = i;
        }
        InvertArray reverse = new InvertArray();
        reverse.reverseArray(myArray);
        for (int x : myArray) {
            System.out.print(x + " ");
        }
        System.out.println();
        String[] myArrayString = {"a", "b", "c"};
        reverse.reverseArray(myArrayString);
        for (String x : myArrayString) {
            System.out.print(x + " ");
        }
    }
}