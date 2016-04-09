package it.sevenbits.task3.array;

/**
 * realizes the essence of the array.
 * @param <T> is a type
 */
public class MyArray<T> {
    /**
     * array of T.
     */
    private T[] myArray;



    /**
     * Returns myArray.
     * @return myArray
     */
    public final T[] getMyArray() {
        return myArray;
    }

    /**
     * Assigns field myArray array of type T.
     * @param theMyArray input array
     */
    public final void setMyArray(final T[] theMyArray) {
        myArray = theMyArray;
    }
}
