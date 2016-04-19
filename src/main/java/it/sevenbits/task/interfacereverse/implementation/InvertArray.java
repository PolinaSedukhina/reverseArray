 package it.sevenbits.task.interfacereverse.implementation;

import it.sevenbits.task.array.MyArray;
import it.sevenbits.task.interfacereverse.IInvertInterface;

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
        try {
            if (array.getMyArray().length == 0) {
                throw new IllegalArgumentException("Array is empty");
            }
        } catch (NullPointerException e) {
            throw new NullPointerException("Null pointer exception");
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