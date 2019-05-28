package kata5;

import org.junit.Test;

import static org.junit.Assert.assertEquals;

public class StrayNumbersTest {

    @Test
    public void simpleArray1() {
        assertEquals(2, getActualFor(1, 1, 2));
    }

    @Test
    public void simpleArray2() {
        assertEquals(3, getActualFor(17, 17, 3, 17, 17));
    }

    @Test
    public void simpleArray3() {
        assertEquals(3, getActualFor(17, 17, 17, 17, 17, 3, 17));
    }

    @Test
    public void simpleArray4() {
        assertEquals(4, getActualFor(4, 2, 2, 2, 2));
    }


    public static int getActualFor(int... numbers) {
        return StrayNumbers.stray(numbers);
    }



}
