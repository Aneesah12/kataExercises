package kata1;

public class Kata2 {

    public static String HighAndLow(String numberList) {
        String[] stringNumbers = numberList.split(" ");
        int[] integers = new int[stringNumbers.length];

        int i;
        int maxNumber = integers[0];
        int minNumber = integers[0];
        for (i = 0; i < integers.length; i++) {
            integers[i] = Integer.parseInt(stringNumbers[i]);
            if (integers[i] > maxNumber) {
                maxNumber = integers[i];
            }

            if (integers[i] < minNumber) {
                minNumber = integers[i];
            }
        }
        return String.valueOf(maxNumber) + " " + String.valueOf(minNumber);
    }
}
