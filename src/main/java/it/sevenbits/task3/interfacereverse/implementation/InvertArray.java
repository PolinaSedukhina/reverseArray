
package it.sevenbits.task3.interfacereverse.implementation;

import it.sevenbits.task3.interfacereverse.IInvertInterface;

/**
 * Provides reversing for arrays of any type.
 */

public class InvertArray implements IInvertInterface{
    /**
     * Function inverts an integer array.
     * @param array inverted array
     * @param <T> is a type
     */
    public final <T> void reverseArray(final T[] array) {
        if (array == null) {
            return;
        }
        T temp;
        for (int i = 0; i < array.length / 2; i++) {
            temp = array[i];
            array[i] = array[array.length - i - 1];
            array[array.length - i - 1] = temp;
        }
    }
}