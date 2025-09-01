// 8. Find factorial of a number using do-while loop
import java.util.Scanner;
class Q8 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt(), fact = 1;
        int i = 1;
        do {
            fact *= i;
            i++;
        } while (i <= n);
        System.out.println("Factorial = " + fact);
    }
}
