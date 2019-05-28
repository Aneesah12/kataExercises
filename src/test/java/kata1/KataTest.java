package kata1;

import org.junit.Test;

import static org.junit.Assert.assertEquals;


public class KataTest {
    @Test
    public void Test1() {
        assertEquals("44 -6", Kata.HighAndLow("8 -6 3 44 0 0 9 4 -2 7 4")); //add in number 42 and negative numbers
    }

    @Test
    public void Test2() {
        assertEquals("11 -5", Kata.HighAndLow("8 5 11 -5 0"));
    }

    @Test
    public void Test3() {
        assertEquals("41 -12", Kata.HighAndLow("2 41 21 19 -12 15 -1 6"));
    }

    @Test
    public void Test4() {
        assertEquals("11 2", Kata.HighAndLow("8 5 11 6 2"));
    }
}

