import java.util.*;
import java.util.regex.*;
import java.time.*;

public class GlobalShipment {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = Integer.parseInt(sc.nextLine());

        while (n-- > 0) {
            String record = sc.nextLine();
            if (isValidRecord(record)) {
                System.out.println("COMPLIANT RECORD");
            } else {
                System.out.println("NON-COMPLIANT RECORD");
            }
        }
    }

    static boolean isValidRecord(String record) {
        String[] parts = record.split("\\|");
        if (parts.length != 5) return false;

        return isValidCode(parts[0]) &&
               isValidDate(parts[1]) &&
               isValidMode(parts[2]) &&
               isValidWeight(parts[3]) &&
               isValidStatus(parts[4]);
    }

    // Shipment Code Validation
    static boolean isValidCode(String code) {
        if (!code.matches("SHIP-[1-9][0-9]{5}")) return false;

        String digits = code.substring(5);

        int count = 1;
        for (int i = 1; i < digits.length(); i++) {
            if (digits.charAt(i) == digits.charAt(i - 1)) {
                count++;
                if (count > 3) return false;
            } else {
                count = 1;
            }
        }
        return true;
    }

    // Date Validation
    static boolean isValidDate(String date) {
        try {
            if (!date.matches("20\\d{2}-(0[1-9]|1[0-2])-(0[1-9]|[12][0-9]|3[01])"))
                return false;

            LocalDate parsedDate = LocalDate.parse(date);

            int year = parsedDate.getYear();
            if (year < 2000 || year > 2099) return false;

            return true;
        } catch (Exception e) {
            return false;
        }
    }

    // Mode Validation
    static boolean isValidMode(String mode) {
        Set<String> validModes = new HashSet<>(Arrays.asList(
                "AIR", "SEA", "ROAD", "RAIL", "EXPRESS", "FREIGHT"
        ));
        return validModes.contains(mode);
    }

    // Weight Validation
    static boolean isValidWeight(String weight) {
        if (!weight.matches("([1-9]\\d{0,5}(\\.\\d{1,2})?|0(\\.\\d{1,2})?)"))
            return false;

        double value = Double.parseDouble(weight);
        return value > 0 && value <= 999999.99;
    }

    // Delivery Status Validation
    static boolean isValidStatus(String status) {
        return status.equals("DELIVERED") ||
               status.equals("CANCELLED") ||
               status.equals("IN_TRANSIT");
    }
}