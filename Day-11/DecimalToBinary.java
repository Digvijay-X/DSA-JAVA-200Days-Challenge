public class DecimalToBinary {

    static String decimalToBinary(int decimal) {
        String binary = "";

        while (decimal > 0) {
            int remainder = decimal % 2; // remainder nikalna
            binary = remainder + binary; // pehle wali string ke aage jodna
            decimal = decimal / 2;       // next step ke liye divide karna
        }

        return binary;
    }

    public static void main(String[] args) {
        int decimal = 11;
        String binary = decimalToBinary(decimal);
        System.out.println("Decimal: " + decimal + " → Binary: " + binary);
    }
}
