class BankAccount {

    // Static variable (shared by all accounts)
    static String bankName = "State Bank of India";
    private static int totalAccounts = 0;

    // Instance variables
    String accountHolderName;
    final int accountNumber;   // final variable

    // Constructor using this keyword
    BankAccount(String accountHolderName, int accountNumber) {
        this.accountHolderName = accountHolderName;
        this.accountNumber = accountNumber;
        totalAccounts++;
    }

    // Static method
    static void getTotalAccounts() {
        System.out.println("Total Accounts: " + totalAccounts);
    }

    // Method to display details
    void displayDetails(Object obj) {
        if (obj instanceof BankAccount) {
            System.out.println("Bank Name: " + bankName);
            System.out.println("Account Holder: " + accountHolderName);
            System.out.println("Account Number: " + accountNumber);
        } else {
            System.out.println("Invalid Account Object");
        }
    }
}

public class BankAccountSystem {
    public static void main(String[] args) {

        BankAccount acc1 = new BankAccount("Tanishq Gupta", 101);
        BankAccount acc2 = new BankAccount("Rahul Sharma", 102);

        acc1.displayDetails(acc1);
        System.out.println();
        acc2.displayDetails(acc2);

        System.out.println();
        BankAccount.getTotalAccounts();
    }
}
