
package it.sevenbits.task3.thirdhomework;

import it.sevenbits.task3.array.MyArray;
import it.sevenbits.task3.exception.MyException;
import it.sevenbits.task3.interfacereverse.implementation.InvertArray;

/**
 * Homework 4.
 * Sedukhina Polina
 */

public final class MyThirdHomework {
    /**
     * size of array.
     */
    private static final int SIZE = 7;

    /**
     * Default constructor.
     */
    private MyThirdHomework() {
    }
    /**
     * @param args incoming arguments
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