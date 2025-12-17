import java.util.Scanner;

class powercalculation{
    public static void main(String[] args) {

        // Create Scanner object to take input from user
        Scanner sc = new Scanner(System.in);

        // Ask user to enter base
        System.out.print("Enter base: ");
        double base = sc.nextDouble();

        // Ask user to enter exponent
        System.out.print("Enter exponent: ");
        double exponent = sc.nextDouble();

        // Calculate power using Math.pow() method
        double result = Math.pow(base, exponent);

        // Display the result
        System.out.println(base + " raised to the power " + exponent + " = " + result);
    }
}
