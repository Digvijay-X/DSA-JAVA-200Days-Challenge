// Q7: Write a function that adds 5 to a number to demonstrate call by value.
public class Q7_AddFive {
    static void addFive(int num) {
        num += 5;
        System.out.println("Inside function: " + num);
    }

    public static void main(String[] args) {
        int number = 20;
        System.out.println("Before function call: " + number);
        addFive(number);
        System.out.println("After function call: " + number);
    }
}
