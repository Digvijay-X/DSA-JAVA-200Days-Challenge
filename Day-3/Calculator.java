// Simple Calculator using switch
import java.util.Scanner;

public class Calculator {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.print("Enter first number: ");
        double n1 = sc.nextDouble();

        System.out.print("Enter second number: ");
        double n2 = sc.nextDouble();

        System.out.print("Choose operation (+, -, *, /): ");
        char op = sc.next().charAt(0);

        switch (op) {
            case '+': System.out.println("Result = " + (n1 + n2)); break;
            case '-': System.out.println("Result = " + (n1 - n2)); break;
            case '*': System.out.println("Result = " + (n1 * n2)); break;
            case '/':
                if (n2 != 0) {
                    System.out.println("Result = " + (n1 / n2));
                } else {
                    System.out.println("Cannot divide by 0");
                }
                break;
            default: System.out.println("Invalid operator!");
        }

        sc.close();
    }
}
