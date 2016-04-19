package it.sevenbits.task.reverse;

import it.sevenbits.task.array.MyArray;
import it.sevenbits.task.exception.MyException;
import it.sevenbits.task.interfacereverse.implementation.InvertArray;
import org.junit.Assert;
import org.junit.Before;
import org.junit.Test;
import static org.junit.Assert.assertArrayEquals;
import static junit.framework.TestCase.fail;

/**
 * Created by polly on 18.04.16.
 */
public class InvertArrayTest {
    private InvertArray myArray;
    @Before
    public void setUp() {
        myArray = new InvertArray();
    }
    @Test
    public void invertTestInteger(){
        Integer[] someArray={1,2,3};
        MyArray<Integer> original = new MyArray<Integer>();
        original.setMyArray(someArray);
        myArray.reverseArray(original);
        Integer[] reversedArray={3,2,1};
        assertArrayEquals("Wrong reverse",original.getMyArray(),reversedArray);
    }
    @Test
    public void invertTestString(){
        String[] someArray={"a","b","c"};
        MyArray<String> original = new MyArray<String>();
        original.setMyArray(someArray);
        myArray.reverseArray(original);
        String[] reversedArray={"c","b","a"};
        assertArrayEquals("Wrong reverse",original.getMyArray(),reversedArray);
    }
    @Test (expected = IllegalArgumentException.class)
    public void invertEmptyTest() throws MyException {
        Integer[] someArray = {};
        MyArray<Integer> original = new MyArray<Integer>();
        original.setMyArray(someArray);
        myArray.reverseArray(original);
        fail();
    }
    @Test (expected = NullPointerException.class)
    public void invertNullTest() throws NullPointerException {
        Integer[] someArray = null;
        MyArray<Integer> original = new MyArray<Integer>();
        original.setMyArray(someArray);
        myArray.reverseArray(original);
        fail();
    }
}
