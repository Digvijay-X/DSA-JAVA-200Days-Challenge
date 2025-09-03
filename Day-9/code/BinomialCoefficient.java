

// Binomial Coefficient (nCr)


public class BinomialCoefficient {
    // Function to calculate factorial
    public static int factorial(int n) {
        int fact = 1;
        for (int i = 1; i <= n; i++) {
            fact *= i;
        }
        return fact;
    }

    // Function to calculate nCr
    public static int binomialCoefficient(int n, int r) {
        return factorial(n) / (factorial(r) * factorial(n - r));
    }

    public static void main(String[] args) {
        int n = 5, r = 2;
        System.out.println("Binomial Coefficient (nCr) = " + binomialCoefficient(n, r));
    }
}
