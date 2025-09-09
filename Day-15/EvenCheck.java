// Question 2 : Write a method named isEven that accepts an int argument.
// The method should return true if the argument is even, or false otherwise.
// Also write a program to test your method.

public class EvenCheck {
    
    public static boolean isEven(int number) {
        return number % 2 == 0;
    }

    public static void main(String[] args) {
        int num = 13;
        if (isEven(num)) {
            System.out.println(num + " is Even");
        } else {
            System.out.println(num + " is Odd");
        }
    }
}
