package metro;

import org.junit.Test;

import java.util.ArrayList;

import static org.junit.Assert.assertEquals;

public class MetroTest {
    Metro metro = new Metro();

    @Test
    public void test1() {
        ArrayList<int[]> list = new ArrayList<>();
        list.add(new int[] {10,0});
        list.add(new int[] {3,5});
        list.add(new int[] {2,5});

        assertEquals(5, metro.countPassengers(list));
    }

    @Test
    public void test2() {
        ArrayList<Integer> list2 = new ArrayList<>();
        list2.add(3);
        list2.add(4);
        list2.add(5);
        System.out.println(list2);
        assertEquals(12, metro.countPassengers2(list2));
    }


}
