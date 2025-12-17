import java.util.Scanner;

class perimeterofcircle{
    public static void main(String[] args) {

        // Create Scanner object to take input from user
        Scanner sc = new Scanner(System.in);

        // Ask user to enter radius
        System.out.print("Enter radius of the circle: ");
        double radius = sc.nextDouble();

        // Calculate perimeter using formula 2πr
        double perimeter = 2 * Math.PI * radius;

        // Display the result
        System.out.println("Perimeter of Circle = " + perimeter);
    }
}
