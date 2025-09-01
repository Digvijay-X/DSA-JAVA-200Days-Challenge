// 6. Check if a number is Armstrong number
import java.util.Scanner;
class Q6 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt(), temp = n, sum = 0;
        while (n > 0) {
            int digit = n % 10;
            sum += digit * digit * digit;
            n /= 10;
        }
        if (sum == temp) System.out.println("Armstrong");
        else System.out.println("Not Armstrong");
    }
}
