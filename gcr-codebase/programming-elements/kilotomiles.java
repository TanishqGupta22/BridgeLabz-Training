import java.util.Scanner;

class KilometerToMiles {
    public static void main(String[] args) {

        // Create Scanner object to take input from user
        Scanner sc = new Scanner(System.in);

        // Ask user to enter distance in kilometers
        System.out.print("Enter distance in kilometers: ");
        double kilometers = sc.nextDouble();

        // Conversion formula: 1 kilometer = 0.621371 miles
        double miles = kilometers * 0.621371;

        // Display the result
        System.out.println(kilometers + " kilometers = " + miles + " miles");
    }
}