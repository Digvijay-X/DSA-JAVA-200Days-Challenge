public class TypeConversion {
    public static void main(String[] args) {
        // Automatic type conversion (widening)
        int num = 100;
        double d = num;  // int -> double
        System.out.println("Integer: " + num);
        System.out.println("Converted to double: " + d);
    }
}
