import java.util.Scanner;
import java.util.Random;

public class NumberGuessingGame {

    static Scanner sc = new Scanner(System.in);
    static Random random = new Random();

    static int generateGuess(int low, int high) {
        return random.nextInt(high - low + 1) + low;
    }

    static char getFeedback() {
        System.out.print("Enter feedback (h = high, l = low, c = correct): ");
        return sc.next().charAt(0);
    }

    public static void main(String[] args) {

        int low = 1, high = 100;
        char feedback;

        System.out.println("Think of a number between 1 and 100.");

        while (true) {
            int guess = generateGuess(low, high);
            System.out.println("Computer guesses: " + guess);

            feedback = getFeedback();

            if (feedback == 'c') {
                System.out.println("Computer guessed the correct number!");
                break;
            } else if (feedback == 'h') {
                high = guess - 1;
            } else if (feedback == 'l') {
                low = guess + 1;
            }
        }
    }
}
