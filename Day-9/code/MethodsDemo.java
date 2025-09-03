
// Inbuilt vs User-defined Methods

public class MethodsDemo {
    public static void main(String[] args) {
        // Inbuilt method
        System.out.println("Square root of 25 is: " + Math.sqrt(25));

        // User-defined method
        System.out.println("Factorial of 5 is: " + factorial(5));
    }

    // user-defined method
    public static int factorial(int n) {
        int f = 1;
        for (int i = 1; i <= n; i++) {
            f *= i;
        }
        return f;
    }
}
