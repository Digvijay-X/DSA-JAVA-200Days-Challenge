// Q1. Absolute Value Finder
import java.util.*;
class Q1 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        if(n < 0) n = -n;
        System.out.println("Absolute value: " + n);
    }
}
