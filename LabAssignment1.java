import java.util.Scanner;

public class LabAssignment1 {
    public static void main(String[] args) throws InterruptedException {
        Scanner scanner = new Scanner(System.in);


        System.out.println("Welcome to GNX Investments!");
        System.out.println("(Sponsored by CashApp and PgLang)");
        for (int i = 0; i < 5; i++) {
            Thread.sleep(500);
            System.out.print("💸");
        }

        System.out.println("\n");
        Thread.sleep(2000);

        System.out.print("Please enter an investment amount: ");
        double initialAmount = scanner.nextDouble();
        System.out.print("Enter annual interest rate (e.g., 4.25 for 4.25%): ");
        double annualInterestRate = scanner.nextDouble();
        System.out.print("Enter number of years: ");
        int numberOfYears = scanner.nextInt();
        // calculate the monthly interest
        double monthlyInterestRate = (annualInterestRate / 100) / 12;
        // calculate future value using this from formula FV=P×(1+r)n×12
        double futureValue = initialAmount * Math.pow(1 + monthlyInterestRate, numberOfYears * 12);
        // future value with the format specifiersss for 2 decimals
        System.out.printf("Future investment value: $%.2f%n", futureValue);

        scanner.close();
    }

}
