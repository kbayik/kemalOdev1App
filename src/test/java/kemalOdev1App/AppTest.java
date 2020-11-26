/*
 * This Java source file was generated by the Gradle 'init' task.
 */
package kemalOdev1App;

import org.junit.jupiter.api.Test;
import static org.junit.jupiter.api.Assertions.*;

import java.util.ArrayList;
import java.util.Arrays;

class AppTest {

    @Test void testFoundBoth() {
        ArrayList<Integer> array = new ArrayList<>(Arrays.asList(1, 2, 3, 4));
        ArrayList<Integer> newArray = new ArrayList<>(Arrays.asList(1, 2, 3, 4));
        assertEquals(App.searchBoth(array,newArray, 4), 3);
  
    }

    @Test void testFoundFirst() {
        ArrayList<Integer> array = new ArrayList<>(Arrays.asList(1, 2, 3, 4));
        ArrayList<Integer> newArray = new ArrayList<>(Arrays.asList(12, 13, 14, 15));
        assertEquals(App.searchBoth(array,newArray, 4), 1);
  
    }

    @Test void testFoundSecond() {
        ArrayList<Integer> array = new ArrayList<>(Arrays.asList(1, 2, 3, 4));
        ArrayList<Integer> newArray = new ArrayList<>(Arrays.asList(12, 13, 14, 15));
        assertEquals(App.searchBoth(array,newArray, 12), 2);
  
    }

    @Test void testNotFound() {
        ArrayList<Integer> array = new ArrayList<>(Arrays.asList(1, 2, 3, 4));
        ArrayList<Integer> newArray = new ArrayList<>(Arrays.asList(12, 13, 14, 15));
        assertEquals(App.searchBoth(array,newArray, 22), 0);
  
    }

    @Test void testBothArraysNull() {
        assertEquals(App.searchBoth(null,null, 22), -1);
  
    }

    @Test void testFirstArrayNull() {
        ArrayList<Integer> newArray = new ArrayList<>(Arrays.asList(12, 13, 14, 15));
        assertEquals(App.searchBoth(null,newArray, 22), -1);
  
    }

    @Test void testSecondArrayNull() {
        ArrayList<Integer> array = new ArrayList<>(Arrays.asList(1, 2, 3, 4));
        assertEquals(App.searchBoth(array,null, 22), -1);
  
    }

    @Test void testBothArraysEmpty() {
        ArrayList<Integer> array = new ArrayList<>();
        ArrayList<Integer> newArray = new ArrayList<>();
        assertEquals(App.searchBoth(array,newArray, 22), 0);
    }

    @Test void testFirstArrayEmptyFoundSecond() {
        ArrayList<Integer> array = new ArrayList<>();
        ArrayList<Integer> newArray = new ArrayList<>(Arrays.asList(12, 13, 14, 15));
        assertEquals(App.searchBoth(array,newArray, 13), 2);
    }
}
