// Q8: Write a function to swap two numbers using call by value and observe the result.
public class Q8_SwapValues {
    static void swapValues(int a, int b) {
        int temp = a;
        a = b;
        b = temp;
        System.out.println("Inside function: a=" + a + ", b=" + b);
    }

    public static void main(String[] args) {
        int a = 10, b = 20;
        System.out.println("Before function call: a=" + a + ", b=" + b);
        swapValues(a, b);
        System.out.println("After function call: a=" + a + ", b=" + b);
    }
}
