import java.util.Scanner;

class AreaOfCircle {
    public static void main(String[] args) {

        // Create Scanner object to take input from user
        Scanner sc = new Scanner(System.in);

        // Ask user to enter the radius
        System.out.print("Enter radius of the circle: ");
        double radius = sc.nextDouble();

        // Calculate area using formula πr²
        double area = Math.PI * radius * radius;

        // Display the area
        System.out.println("Area of Circle = " + area);
    }
}
