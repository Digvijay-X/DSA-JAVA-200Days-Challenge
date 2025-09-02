// Q6. Eligibility Checker
import java.util.*;
class Q6 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int age = sc.nextInt();
        String citizen = sc.next();
        if(age >= 18 && citizen.equalsIgnoreCase("Indian"))
            System.out.println("Eligible to vote");
        else
            System.out.println("Not Eligible");
    }
}
