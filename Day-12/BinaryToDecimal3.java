import java.util.Scanner;

public class BinaryToDecimal3 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter binary number: ");
        String binary = sc.next();

        int decimal = Integer.parseInt(binary, 2);
        System.out.println("Decimal value: " + decimal);

        sc.close();
    }
}
