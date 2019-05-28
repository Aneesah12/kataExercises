package kata5;

import java.util.Arrays;

public class StrayNumbers {

    public static int stray(int[] numbers) {
        Arrays.sort(numbers);
        if(numbers[0] == numbers[1]){
            return numbers[numbers.length-1];
        } else {
            return numbers[0];
        }
        }
    }
