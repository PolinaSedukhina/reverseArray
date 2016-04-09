package it.sevenbits.task3.interfacereverse.implementation;

import it.sevenbits.task3.array.MyArray;
import it.sevenbits.task3.interfacereverse.IInvertInterface;

/**
 * Provides reversing for arrays of any type.
 */

public class InvertArray implements IInvertInterface {
    /**
     * Function inverts an integer array.
     * @param array inverted array
     * @param <T> is a type
     */
    public final <T> void reverseArray(final MyArray<T> array) {
        if (array.getMyArray().length == 0) {
            throw new IllegalArgumentException("Array is empty");
        }
        int lengthOfArray = array.getMyArray().length;
        T temp;
        for (int i = 0; i < lengthOfArray / 2; i++) {
            temp = (array.getMyArray())[i];
            array.getMyArray()[i] = array.getMyArray()[lengthOfArray - i - 1];
            array.getMyArray()[lengthOfArray - i - 1] = temp;
        }

    }
}