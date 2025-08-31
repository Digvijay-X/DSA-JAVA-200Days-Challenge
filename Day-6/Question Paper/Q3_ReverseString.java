// Q3: Write a function that returns the reverse of a string.
public class Q3_ReverseString {
    static String reverseString(String str) {
        String rev = "";
        for (int i = str.length() - 1; i >= 0; i--) {
            rev += str.charAt(i);
        }
        return rev;
    }

    public static void main(String[] args) {
        String reversed = reverseString("Digvijay");
        System.out.println("Reversed: " + reversed);
    }
}
