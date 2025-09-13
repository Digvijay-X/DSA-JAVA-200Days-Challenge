import java.util.Scanner;

public class pra {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        int[] arr = new int[5];

        // Input
        System.out.println("Enter 5 numbers: ");
        for(int i=0; i<5; i++) {
            arr[i] = sc.nextInt();
        }

        // Output
        System.out.print("You entered: ");
        for(int i=0; i<5; i++) {
            System.out.print(arr[i] + " ");
        }
        System.out.println();

        // Update
        arr[2] = 100;

        System.out.print("After update: ");
        for(int i=0; i<5; i++) {
            System.out.print(arr[i] + " ");
        }
    }
}
