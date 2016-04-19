 package it.sevenbits.task.array;

import org.junit.Before;
import org.junit.Test;
import static org.junit.Assert.assertArrayEquals;

/**
 * Test.
 */
public class MyArrayTest {
    private MyArray<Integer> integerMyArray;
    @Before
    public void setUp() {
        integerMyArray = new MyArray<Integer>();
    }
    @Test
    public void testSetGet() {
        Integer[] original = {1,2,3};
        integerMyArray.setMyArray(original);
        assertArrayEquals("Get is bad",original,integerMyArray.getMyArray());
    }
}
