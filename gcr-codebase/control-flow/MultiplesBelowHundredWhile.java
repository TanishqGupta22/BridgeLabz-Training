import java.util.Scanner;

public class MultiplesBelowHundredWhile {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        int number = sc.nextInt();

        if (number <= 0 || number >= 100) {
            System.out.println("Invalid input");
            return;
        }

        int counter = number - 1;

        while (counter > 1) {
            if (number % counter == 0) {
                System.out.println(counter);
            }
            counter--;
        }
    }
}