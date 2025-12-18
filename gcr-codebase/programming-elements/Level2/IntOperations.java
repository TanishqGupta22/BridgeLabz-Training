import java.util.Scanner;

class IntOperationsg {
    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);

        // Taking input values
        System.out.print("Enter value of a: ");
        int a = sc.nextInt();

        System.out.print("Enter value of b: ");
        int b = sc.nextInt();

        System.out.print("Enter value of c: ");
        int c = sc.nextInt();

        // Integer operations
        int result1 = a + b * c;   // multiplication first
        int result2 = a * b + c;   // multiplication first
        int result3 = c + a / b;   // division first
        int result4 = a % b + c;   // modulus first

        // Display results
        System.out.println(
            "The results of Int Operations are " +
            result1 + ", " + result2 + ", " +
            result3 + ", and " + result4
        );
    }
}