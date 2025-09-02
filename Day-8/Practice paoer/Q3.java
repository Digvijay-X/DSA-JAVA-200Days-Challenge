// Q3. Triangle Validity Checker
import java.util.*;
class Q3 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int a = sc.nextInt(), b = sc.nextInt(), c = sc.nextInt();
        if(a+b>c && a+c>b && b+c>a) System.out.println("Valid Triangle");
        else System.out.println("Not a Valid Triangle");
    }
}
