public class CustomException {

  
    static class InsufficientFundsException extends Exception {
        public InsufficientFundsException(String message) {
            super(message);
        }

        public InsufficientFundsException(String message, Throwable cause) {
            super(message, cause);
        }
    }

    static class InvalidAgeRuntimeException extends RuntimeException {
        public InvalidAgeRuntimeException(String message) {
            super(message);
        }
    }

    static class BankAccount {
        private String accountNumber;
        private double balance;

        public BankAccount(String accountNumber, double initialBalance) {
            this.accountNumber = accountNumber;
            this.balance = initialBalance;
        }

        public double getBalance() {
            return balance;
        }

        public void deposit(double amount) {
            if (amount <= 0) throw new IllegalArgumentException("Deposit amount must be positive");
            balance += amount;
        }


        public void withdraw(double amount) throws InsufficientFundsException {
            if (amount <= 0) throw new IllegalArgumentException("Withdrawal amount must be positive");
            if (amount > balance) {
                throw new InsufficientFundsException(
                        "Insufficient funds: requested " + amount + ", available " + balance);
            }
            balance -= amount;
        }
    }


    static void validateAge(int age) {
        if (age < 0 || age > 150) {
            throw new InvalidAgeRuntimeException("Invalid age: " + age);
        }
    }

    public static void main(String[] args) {
        System.out.println("--- Custom Exceptions Demo ---");

        BankAccount acct = new BankAccount("ACC100", 100.0);
        System.out.println("Initial balance: " + acct.getBalance());

        try {
            System.out.println("Attempting to withdraw 150...");
            acct.withdraw(150); 
        } catch (InsufficientFundsException e) {
          
            System.out.println("Caught checked exception: " + e.getMessage());
        }

        System.out.println("Depositing 100...");
        acct.deposit(100);
        System.out.println("Balance after deposit: " + acct.getBalance());

        try {
            System.out.println("Attempting to withdraw 50...");
            acct.withdraw(50);
            System.out.println("Withdrawal succeeded. Balance: " + acct.getBalance());
        } catch (InsufficientFundsException e) {
            System.out.println("Should not happen here: " + e.getMessage());
        }

        System.out.println("\n-- Unchecked exception demo (validateAge) --");
        try {
            System.out.println("Validating age -5...");
            validateAge(-5); 
        } catch (InvalidAgeRuntimeException e) {
            System.out.println("Caught unchecked exception: " + e.getMessage());
        }

        System.out.println("Demo complete.");
    }
}
