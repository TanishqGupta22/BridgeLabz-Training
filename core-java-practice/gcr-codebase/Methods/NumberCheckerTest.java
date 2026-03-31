public class NumberCheckerTest {

    public static void main(String[] args) {
        int number = 153;

        int[] digits = NumberChecker.getDigits(number);

        System.out.print("Digits: ");
        for (int d : digits)
            System.out.print(d + " ");

        System.out.println("\nDigit Count: " + NumberChecker.countDigits(number));
        System.out.println("Duck Number: " + NumberChecker.isDuckNumber(digits));
        System.out.println("Armstrong Number: " +
                NumberChecker.isArmstrong(number, digits));

        NumberChecker.largestSecondLargest(digits);
        NumberChecker.smallestSecondSmallest(digits);

        System.out.println("Sum of Digits: " +
                NumberCheckerExtended.sumOfDigits(digits));
        System.out.println("Sum of Squares: " +
                NumberCheckerExtended.sumOfSquares(digits));
        System.out.println("Harshad Number: " +
                NumberCheckerExtended.isHarshad(number, digits));

        int[][] freq = NumberCheckerExtended.digitFrequency(digits);
        System.out.println("Digit Frequency:");
        for (int i = 0; i < freq.length; i++)
            if (freq[i][1] > 0)
                System.out.println(freq[i][0] + " -> " + freq[i][1]);
    }
}
