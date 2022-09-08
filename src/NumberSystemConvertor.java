public class NumberSystemConvertor {

    private static final byte BIN_BASE = 2;

    private static final byte DEC_BASE = 10;

    public static String decToBin(int decNumber) {
        StringBuilder results = new StringBuilder();
        boolean isNegative = decNumber < 0;

        if (isNegative) {
            decNumber = decNumber * -1;
        }

        while (decNumber > 0) {
            int binNumber = decNumber % BIN_BASE;
            results.append(binNumber);

            decNumber = decNumber / BIN_BASE;
        }

        if (isNegative) {
            results.append('-');
        }

        return results.reverse().toString();
    }

    public static int binToDec(int binaryNumber) {
        int results = 0;
        int position = 0;
        while (binaryNumber > 0) {
            int tempNumber = binaryNumber % BIN_BASE;
            results = (int) (results + tempNumber * Math.pow(BIN_BASE, position));

            binaryNumber = binaryNumber / DEC_BASE;
            position ++;
        }

        return results;
    }

}
