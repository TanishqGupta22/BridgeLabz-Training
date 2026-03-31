import java.util.Scanner;

public class ReverseStringUsingStringBuilder {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.print("Enter a string: ");
        String input = sc.nextLine();

        // Create StringBuilder object
        StringBuilder sb = new StringBuilder();

        // Append the string
        sb.append(input);

        // Reverse the string
        sb.reverse();

        // Convert back to String
        String reversedString = sb.toString();

        System.out.println("Reversed string: " + reversedString);

        sc.close();
    }
}
