class factorial{
    public static void main(String[] args) {
        int num = 5;
        int fact = 1;

        // Loop to calculate factorial
        for (int i = 1; i <= num; i++) {
            fact = fact * i;
        }

        // Printing the factorial
        System.out.println("Factorial = " + fact);
    }
}