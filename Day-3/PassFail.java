// Check if student will Pass or Fail
import java.util.Scanner;

public class PassFail {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.print("Enter your marks: ");
        int marks = sc.nextInt();

        if (marks >= 33) {
            System.out.println("Pass ");
        } else {
            System.out.println("Fail ");
        }

        sc.close();
    }
}
