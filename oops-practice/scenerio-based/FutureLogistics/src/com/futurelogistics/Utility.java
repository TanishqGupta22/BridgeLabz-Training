import java.util.Scanner;

public class UserInterface {

    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);
        Utility utility = new Utility();

        System.out.println("Enter the Goods Transport details");
        String input = sc.nextLine();

        GoodsTransport transport = utility.parseDetails(input);

        if (transport == null) {
            return;
        }

        System.out.println("\nTransporter id : " + transport.getTransportId());
        System.out.println("Date of transport : " + transport.getTransportDate());
        System.out.println("Rating of the transport : " + transport.getTransportRating());

        String type = utility.findObjectType(transport);

        if (type.equals("BrickTransport")) {
            BrickTransport bt = (BrickTransport) transport;
            System.out.println("Quantity of bricks : " + bt.getBrickQuantity());
            System.out.println("Brick price : " + bt.getBrickPrice());
        } else {
            TimberTransport tt = (TimberTransport) transport;
            System.out.println("Type of the timber : " + tt.timberType);
            System.out.println("Timber price per kilo : " + tt.timberPrice);
        }

        System.out.println("Vehicle for transport : " + transport.vehicleSelection());
        System.out.println("Total charge : " + transport.calculateTotalCharge());
    }
}
