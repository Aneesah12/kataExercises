package kata1;

import java.util.Arrays;
import java.util.List;
import java.util.NoSuchElementException;
import java.util.stream.Collectors;
import java.util.stream.Stream;

public class Kata {

    public static String HighAndLow(String numberList) {
        String[] a =  numberList.split(" ");
        Stream<String> b = Arrays.stream(a);
        Stream<Integer> c = b.map(s->Integer.valueOf(s));
        List<Integer> d = c.collect(Collectors.toList());

        Integer max = d
                .stream()
                .mapToInt(v -> v)
                .max().orElseThrow(NoSuchElementException::new);

        Integer min = d
                .stream()
                .mapToInt(p -> p)
                .min().orElseThrow(NoSuchElementException::new);


        return String.valueOf(max) + " " + String.valueOf(min);

    }
}