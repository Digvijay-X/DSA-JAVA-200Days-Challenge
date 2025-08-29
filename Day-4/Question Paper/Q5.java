// Question 5: What is wrong in the following program?
//
// for (int i = 0; i <= 5; i++) {
//     System.out.println("i = " + i);
// }
// System.out.println("i after the loop = " + i);
//
// Answer: 'i' is declared inside the loop, so it cannot be accessed outside.

public class Q5 {
    public static void main(String[] args) {
        // Wrong way
        for (int i = 0; i <= 5; i++) {
            System.out.println("i = " + i);
        }
        // System.out.println("i after the loop = " + i); // ERROR

        // Correct way
        int j;
        for (j = 0; j <= 5; j++) {
            System.out.println("j = " + j);
        }
        System.out.println("j after the loop = " + j);
    }
}
