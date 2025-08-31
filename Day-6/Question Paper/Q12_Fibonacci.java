// Q12: Write a function to print the first n terms of Fibonacci series.
public class Q12_Fibonacci {
    static void fibonacciSeries(int n) {
        int a = 0, b = 1;
        System.out.print(a + " " + b + " ");
        for (int i = 3; i <= n; i++) {
            int c = a + b;
            System.out.print(c + " ");
            a = b;
            b = c;
        }
        System.out.println();
    }

    public static void main(String[] args) {
        fibonacciSeries(7);
    }
}
