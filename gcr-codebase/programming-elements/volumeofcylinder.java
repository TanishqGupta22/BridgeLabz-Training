import java.util.Scanner;

class volumeofcylinder{
    
    public static void main(String[] args) {

        // Create Scanner object to take input from user
        Scanner sc = new Scanner(System.in);

        // Ask user to enter radius
        System.out.print("Enter radius of the cylinder: ");
        double radius = sc.nextDouble();

        // Ask user to enter height
        System.out.print("Enter height of the cylinder: ");
        double height = sc.nextDouble();

        // Calculate volume using formula πr²h
        double volume = Math.PI * radius * radius * height;

        // Display the volume
        System.out.println("Volume of Cylinder = " + volume);
    }
}
