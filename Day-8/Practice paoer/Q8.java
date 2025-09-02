// Q8. Greatest of 4 Numbers
import java.util.*;
class Q8 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int a = sc.nextInt(), b = sc.nextInt(), c = sc.nextInt(), d = sc.nextInt();
        int max = a;
        if(b > max) max = b;
        if(c > max) max = c;
        if(d > max) max = d;
        System.out.println("Greatest: " + max);
    }
}
