// Question 3 : Write a Java program to check if a number is a palindrome in Java.
// A number is called a palindrome if it is equal to its reverse.
// Example: 121 is a palindrome, 321 is not.

public class PalindromeCheck {

   
    public static boolean isPalindrome(int number) {
        int original = number;
        int reverse = 0;

        while (number != 0) {
            int digit = number % 10;
            reverse = reverse * 10 + digit;
            number /= 10;
        }

        return original == reverse;
    }

    public static void main(String[] args) {
        int num = 121;
        if (isPalindrome(num)) {
            System.out.println(num + " is a Palindrome");
        } else {
            System.out.println(num + " is NOT a Palindrome");
        }
    }
}
