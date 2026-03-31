import java.util.Scanner;

class AverageofThree{
    public static void main(String[] args) {

        // Create Scanner object to take input
        Scanner sc = new Scanner(System.in);

        // Ask user to enter first number
        System.out.print("Enter first number: ");
        double num1 = sc.nextDouble();

        // Ask user to enter second number
        System.out.print("Enter second number: ");
        double num2 = sc.nextDouble();

        // Ask user to enter third number
        System.out.print("Enter third number: ");
        double num3 = sc.nextDouble();

        // Calculate average
        double average = (num1 + num2 + num3) / 3;

        // Display the result
        System.out.println("Average of three numbers = " + average);
    }
}