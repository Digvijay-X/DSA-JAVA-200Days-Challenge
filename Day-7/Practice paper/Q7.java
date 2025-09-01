// 7. Print Fibonacci series using while loop up to n terms
import java.util.Scanner;
class Q7 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int a = 0, b = 1, count = 0;
        while (count < n) {
            System.out.print(a + " ");
            int next = a + b;
            a = b;
            b = next;
            count++;
        }
    }
}
