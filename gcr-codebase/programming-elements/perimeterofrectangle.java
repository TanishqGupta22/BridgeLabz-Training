import java.util.Scanner;

class perimeterofrectangle{
    public static void main(String[] args) {

        // Create Scanner object to take input from user
        Scanner sc = new Scanner(System.in);

        // Ask user to enter length
        System.out.print("Enter length of the rectangle: ");
        double length = sc.nextDouble();

        // Ask user to enter breadth
        System.out.print("Enter breadth of the rectangle: ");
        double breadth = sc.nextDouble();

        // Calculate perimeter using formula 2(l + b)
        double perimeter = 2 * (length + breadth);

        // Display the result
        System.out.println("Perimeter of Rectangle = " + perimeter);
    }
}