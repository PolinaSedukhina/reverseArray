 package it.sevenbits.task.Main;

import it.sevenbits.task.array.MyArray;
import it.sevenbits.task.exception.MyException;
import it.sevenbits.task.interfacereverse.implementation.InvertArray;

/**
 * Homework 5.
 * Sedukhina Polina
 */

public final class Main {
    /**
     * size of array.
     */
    private static final int SIZE = 5;

    /**
     * Default constructor.
     */
    private Main() {
    }
    /**
     * @param args input arguments
     * @throws MyException is exception
     */
    public static void main(final String[] args) throws MyException {
        try {
            MyArray<Integer> array = new MyArray<Integer>();
            Integer[] myArray = new Integer[SIZE];
            for (int i = 0; i < SIZE; i++) {
                myArray[i] = i;
            }
            array.setMyArray(myArray);
            InvertArray reverse = new InvertArray();
            reverse.reverseArray(array);
            for (int x : myArray) {
                System.out.print(x + " ");
            }
            System.out.println();


            MyArray<String> arrayString = new MyArray<String>();
            String[] myArrayString = {"a", "b", "c"};
            arrayString.setMyArray(myArrayString);
            reverse.reverseArray(arrayString);
            for (String x : myArrayString) {
                System.out.print(x + " ");
            }
        } catch (IllegalArgumentException e) {
            throw new MyException(e);
        }
    }
}