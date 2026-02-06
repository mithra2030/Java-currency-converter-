import java.util.Scanner;

public class CurrencyConverter {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        // Fixed conversion rates
        double usdToInr = 83.0;
        double eurToInr = 90.0;
        double inrToUsd = 1 / usdToInr;
        double inrToEur = 1 / eurToInr;

        int choice;

        do {
            System.out.println("\n===== Currency Converter =====");
            System.out.println("1. USD to INR");
            System.out.println("2. EUR to INR");
            System.out.println("3. INR to USD");
            System.out.println("4. INR to EUR");
            System.out.println("5. Exit");
            System.out.print("Enter your choice: ");
            choice = sc.nextInt();

            if (choice >= 1 && choice <= 4) {
                System.out.print("Enter amount: ");
                double amount = sc.nextDouble();

                if (amount <= 0) {
                    System.out.println("Invalid amount!");
                    continue;
                }

                switch (choice) {
                    case 1:
                        System.out.println("Converted Amount: ₹" + (amount * usdToInr));
                        break;
                    case 2:
                        System.out.println("Converted Amount: ₹" + (amount * eurToInr));
                        break;
                    case 3:
                        System.out.println("Converted Amount: $" + (amount * inrToUsd));
                        break;
                    case 4:
                        System.out.println("Converted Amount: €" + (amount * inrToEur));
                        break;
                }
            } else if (choice != 5) {
                System.out.println("Invalid choice!");
            }

        } while (choice != 5);

        System.out.println("Thank you for using Currency Converter!");
        sc.close();
    }
}
