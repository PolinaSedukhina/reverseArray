package it.sevenbits.task3.interfacereverse;

import it.sevenbits.task3.array.MyArray;

/**
 * Interface realize reverse of array of type T.
 */
public interface IInvertInterface {
    /**
     * @param array input array
     * @param <T> is a type
     */
    <T> void reverseArray(MyArray<T> array);
}
