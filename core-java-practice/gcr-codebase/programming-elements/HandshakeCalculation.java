import java.util.Scanner;

class HandshakeCalculator {
    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);

        // Input number of students
        System.out.print("Enter number of students: ");
        int numberOfStudents = sc.nextInt();

        // Calculate maximum handshakes
        int handshakes = (numberOfStudents * (numberOfStudents - 1)) / 2;

        // Display result
        System.out.println("Maximum number of handshakes = " + handshakes);
    }
}