// Q10. Library Fine Calculator
import java.util.*;
class Q10 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int days = sc.nextInt();
        if(days <= 5) System.out.println("Fine: " + days*2);
        else if(days <= 10) System.out.println("Fine: " + days*3);
        else if(days <= 30) System.out.println("Fine: " + days*5);
        else System.out.println("Membership Cancelled");
    }
}
