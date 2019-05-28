package kata4;

import org.junit.Test;

import static org.junit.Assert.assertEquals;

public class CountingDuplicatesTest {

    @Test
    public void test1() throws Exception {
        assertEquals(0, CountingDuplicates.duplicateCounter("abcde"));
    }

    @Test
    public void test2() throws Exception {
        assertEquals(2, CountingDuplicates.duplicateCounter("aabbcde"));
    }

    @Test
    public void test3() throws Exception {
        assertEquals(2, CountingDuplicates.duplicateCounter("aabBcde"));
    }

    @Test
    public void test4() throws Exception {
        assertEquals(1, CountingDuplicates.duplicateCounter("indivisibility"));
    }

    @Test
    public void test5() throws Exception {
        assertEquals(2, CountingDuplicates.duplicateCounter("Indivisibilities"));
    }

    @Test
    public void test6() throws Exception {
        assertEquals(2, CountingDuplicates.duplicateCounter("aA11"));
    }

    @Test
    public void test7() throws Exception {
        assertEquals(2, CountingDuplicates.duplicateCounter("ABBA"));
    }


}
