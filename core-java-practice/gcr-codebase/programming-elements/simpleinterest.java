import java.util.Scanner;

class SimpleInterest{
    public static void main(String[] args) {

        // Create Scanner object to take input from user
        Scanner sc = new Scanner(System.in);

        // Ask user to enter Principal amount
        System.out.print("Enter Principal amount: ");
        double principal = sc.nextDouble();

        // Ask user to enter Rate of Interest
        System.out.print("Enter Rate of Interest: ");
        double rate = sc.nextDouble();

        // Ask user to enter Time (in years)
        System.out.print("Enter Time (in years): ");
        double time = sc.nextDouble();

        // Calculate Simple Interest using formula
        double simpleInterest = (principal * rate * time) / 100;

        // Display the result
        System.out.println("Simple Interest = " + simpleInterest);
    }
}
