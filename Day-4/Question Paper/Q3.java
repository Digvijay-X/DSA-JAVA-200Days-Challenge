// Question 3: Write a program to find factorial of a number
// Example: 5! = 5 * 4 * 3 * 2 * 1 = 120
import java.util.Scanner;

public class Q3 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter a number: ");
        int n = sc.nextInt();

        long fact = 1;
        for (int i = 1; i <= n; i++) {
            fact *= i;
        }

        System.out.println("Factorial of " + n + " = " + fact);
    }
}
