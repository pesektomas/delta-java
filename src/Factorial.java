public class Factorial {

    public static long getFactorial(int number) {
        if (number < 0) {
            return -1;
        }

        if (number == 0) {
            return 1;
        }

        long factorial = 1;
        while (number > 0) {
            factorial = factorial * number;
            number--;
        }

        return factorial;
    }

}
