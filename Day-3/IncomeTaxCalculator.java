// Simple Income Tax Calculator using else-if
import java.util.Scanner;

public class IncomeTaxCalculator {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.print("Enter your income: ");
        double income = sc.nextDouble();
        double tax;

        if (income <= 250000) {
            tax = 0;
        } else if (income <= 500000) {
            tax = 0.05 * income;
        } else if (income <= 1000000) {
            tax = 0.2 * income;
        } else {
            tax = 0.3 * income;
        }

        System.out.println("Your tax is: " + tax);

        sc.close();
    }
}
