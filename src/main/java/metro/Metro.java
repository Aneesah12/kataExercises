package metro;

import java.util.ArrayList;

public class Metro {
    public int countPassengers(ArrayList<int[]> list) {
        return list.stream()
                .mapToInt(x -> x[0] - x[1])
                .sum();
    }

//    int sum = Arrays.asList(33,45)
//            .stream()
//            .mapToInt(i -> i)
//            .sum();


    public int countPassengers2(ArrayList<Integer> list2) {
        Integer sum = 0;
        for(Integer s : list2)
            sum += s;
        return sum;
    }
}

//        Integer sum = 0;
//        Integer sum2 = 0;
//        for (int[] array : list) {
//            sum += array[0];
//            sum2 += array[1];
//        }
//        return sum - sum2;

//    Integer sum = 0;
//        for (int[] array : list) {
//            sum += array[0] - array[1];
//        }
//        return sum;

//        Integer diff = 0;
//        for (int[] array : list) {
//            diff += array[0];
//            diff -= array[1];
//        }
//        return diff;


//    public static void main(String[] args)
//    {
//
//        // Creating a list of Strings
//        List<String> list = Arrays.asList("3", "6", "8",
//                "14", "15");
//
//        // Using Stream mapToInt(ToIntFunction mapper)
//        // and displaying the corresponding IntStream
//        list.stream().mapToInt(num -> Integer.parseInt(num))
//                .filter(num -> num % 3 == 0)
//                .forEach(System.out::println);
//    }