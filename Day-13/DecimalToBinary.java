import java.util.Scanner;

public class DecimalToBinary {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.print("Enter a decimal number: ");
        int decimal = sc.nextInt();  

        int num = decimal; 
        String binary = ""; 

        while (decimal > 0) {
            int remainder = decimal % 2;   
            binary = remainder + binary;   
            decimal = decimal / 2;         
        }

        System.out.println("Decimal: " + num);
        System.out.println("Binary: " + binary);

        sc.close();
    }
}
