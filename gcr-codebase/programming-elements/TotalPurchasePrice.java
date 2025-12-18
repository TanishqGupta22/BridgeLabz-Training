import java.util.Scanner;

class TotalPurchasePrice {
    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);

        // Input unit price
        System.out.print("Enter unit price (INR): ");
        int unitPrice = sc.nextInt();

        // Input quantity
        System.out.print("Enter quantity: ");
        int quantity = sc.nextInt();

        // Calculate total price
        int totalPrice = unitPrice * quantity;

        // Display output
        System.out.println(
            "The total purchase price is INR " + totalPrice +
            " if the quantity " + quantity +
            " and unit price is INR " + unitPrice
        );
    }
}