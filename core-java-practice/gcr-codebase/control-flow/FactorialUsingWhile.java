import java.util.Scanner;

public class FactorialUsingWhile {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        int number = sc.nextInt();

        if (number < 0) {
            System.out.println("Not a natural number");
            return;
        }

        int factorial = 1;
        int i = 1;

        while (i <= number) {
            factorial = factorial * i;
            i++;
        }

        System.out.println("Factorial of " + number + " is " + factorial);
    }
}