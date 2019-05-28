package kata3;

public class NumberFun {
    public static long findNextSquare(long sq) {
        double firstNumber = Math.sqrt(sq);

        if (firstNumber % 1 != 0) {
            return -1;
        } else {

            double secondNumber = firstNumber + 1;
            double answer = Math.pow(secondNumber, 2);
            return (long) answer;
        }
    }
}
