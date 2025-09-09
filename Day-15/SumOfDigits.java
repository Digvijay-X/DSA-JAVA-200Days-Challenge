// Question 5 : Write a Java method to compute the sum of the digits in an integer.
// Hint : Approach this question in the following way :
// a. Take a variable sum = 0 
// b. Find the last digit of the number 
// c. Add it to the sum 
// d. Repeat until the number becomes 0

public class SumOfDigits {
    
    public static int sumDigits(int number) {
        int sum = 0;
        while (number != 0) {
            int digit = number % 10;
            sum += digit;
            number /= 10;
        }
        return sum;
    }

    public static void main(String[] args) {
        int num = 1234;
        System.out.println("Sum of digits of " + num + " = " + sumDigits(num));
    }
}
