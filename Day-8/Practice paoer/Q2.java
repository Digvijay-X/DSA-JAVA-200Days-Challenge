// Q2. Character Case Checker
import java.util.*;
class Q2 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        char ch = sc.next().charAt(0);
        if(ch >= 'A' && ch <= 'Z') System.out.println("Uppercase");
        else if(ch >= 'a' && ch <= 'z') System.out.println("Lowercase");
        else if(ch >= '0' && ch <= '9') System.out.println("Digit");
        else System.out.println("Special Character");
    }
}
