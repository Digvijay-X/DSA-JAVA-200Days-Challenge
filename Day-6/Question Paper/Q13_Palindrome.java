// Q13: Write a function to check whether a string is a palindrome.
public class Q13_Palindrome {
    static boolean isPalindrome(String str) {
        String rev = "";
        for (int i = str.length() - 1; i >= 0; i--) {
            rev += str.charAt(i);
        }
        return str.equals(rev);
    }

    public static void main(String[] args) {
        System.out.println("Is 'madam' palindrome? " + isPalindrome("madam"));
    }
}
