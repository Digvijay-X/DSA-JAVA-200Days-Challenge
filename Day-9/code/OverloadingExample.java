
// Function Overloading

public class OverloadingExample {
    // method 1
    public static int sum(int a, int b) {
        return a + b;
    }

    // method 2 (overloaded with different number of parameters)
    public static int sum(int a, int b, int c) {
        return a + b + c;
    }

    // method 3 (overloaded with different datatype)
    public static double sum(double a, double b) {
        return a + b;
    }

    public static void main(String[] args) {
        System.out.println("Sum of 2 ints: " + sum(5, 10));
        System.out.println("Sum of 3 ints: " + sum(5, 10, 15));
        System.out.println("Sum of 2 doubles: " + sum(2.5, 3.5));
    }
}
