public class Main {
    public static void main(String[] args) {
        System.out.println("Hello world!");
        System.out.println();

        System.out.println("5! = " + Factorial.getFactorial(5));
        System.out.println();

        SentenceAnalyzer sentenceAnalyzer = new SentenceAnalyzer("Hello my first school day after 9 years.We will see,we will see.");
        sentenceAnalyzer.analyze();
        System.out.println();

        System.out.println("5 DEC to BIN = " + NumberSystemConvertor.decToBin(5));
        System.out.println("101 BIN to DEC = " + NumberSystemConvertor.binToDec(101));

        // System.out.println("5 BIN to DEC = " + Integer.toBinaryString(5));
        // System.out.println("101 BIN to DEC = " + Integer.parseInt("101", 2));
    }
}
