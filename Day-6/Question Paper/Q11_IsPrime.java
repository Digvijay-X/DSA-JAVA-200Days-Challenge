// Q11: Write a function to check whether a number is prime.
public class Q11_IsPrime {
    static boolean isPrime(int n) {
        if (n <= 1) return false;
        for (int i = 2; i <= Math.sqrt(n); i++) {
            if (n % i == 0) return false;
        }
        return true;
    }

    public static void main(String[] args) {
        System.out.println("Is 17 prime? " + isPrime(17));
    }
}
