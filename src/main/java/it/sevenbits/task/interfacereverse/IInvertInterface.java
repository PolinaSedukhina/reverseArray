 package it.sevenbits.task.interfacereverse;

import it.sevenbits.task.array.MyArray;

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
