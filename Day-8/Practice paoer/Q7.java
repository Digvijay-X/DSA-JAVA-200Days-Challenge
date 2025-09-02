// Q7. Bill Discount System
import java.util.*;
class Q7 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int bill = sc.nextInt();
        double finalBill;
        if(bill > 5000) finalBill = bill * 0.8;
        else if(bill >= 2000) finalBill = bill * 0.9;
        else finalBill = bill;
        System.out.println("Final Bill: " + finalBill);
    }
}
