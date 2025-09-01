// 5. Reverse a number using loop
import java.util.Scanner;
class Q5 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt(), rev = 0;
        while (n > 0) {
            int digit = n % 10;
            rev = rev * 10 + digit;
            n /= 10;
        }
        System.out.println("Reversed: " + rev);
    }
}
