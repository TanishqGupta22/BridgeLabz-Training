import java.util.Scanner;

public class FactorialFor {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        int number = sc.nextInt();

        if (number < 0) {
            System.out.println("Not a natural number");
            return;
        }

        int factorial = 1;

        for (int i = 1; i <= number; i++) {
            factorial = factorial * i;
        }

        System.out.println("Factorial of " + number + " is " + factorial);
    }
}