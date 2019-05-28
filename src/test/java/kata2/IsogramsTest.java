package kata2;

import org.junit.Test;

import static org.junit.Assert.assertEquals;

public class IsogramsTest {

    @Test
    public void FixedTests() {
        assertEquals(Isograms.isIsogram("2Dermatoglyphics"), true);
        assertEquals(Isograms.isIsogram("isogram"), true);
    }

    @Test
    public void FixedTests2() {
        assertEquals(Isograms.isIsogram("moose") , false);
        assertEquals(Isograms.isIsogram("isIsogram") , false);
        assertEquals(Isograms.isIsogram("aba") , false);
        assertEquals(Isograms.isIsogram("moOse") , false);
        assertEquals(Isograms.isIsogram("thumbscrewjapingly") , true);
        assertEquals(Isograms.isIsogram("") , true);
    }
}
