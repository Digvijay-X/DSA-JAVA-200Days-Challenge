// Question 2: Write a program that reads a set of integers
// and prints the sum of even and odd integers.
import java.util.Scanner;

public class Q2 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        int evenSum = 0, oddSum = 0;
        System.out.print("Enter how many numbers you want to input: ");
        int n = sc.nextInt();

        System.out.println("Enter " + n + " integers:");
        for (int i = 0; i < n; i++) {
            int num = sc.nextInt();
            if (num % 2 == 0) {
                evenSum += num;
            } else {
                oddSum += num;
            }
        }

        System.out.println("Sum of even numbers = " + evenSum);
        System.out.println("Sum of odd numbers = " + oddSum);
    }
}
