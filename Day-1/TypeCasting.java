public class TypeCasting {
    public static void main(String[] args) {
        // Explicit type casting (narrowing)
        double d = 9.78;
        int i = (int) d;  // double -> int
        System.out.println("Original double: " + d);
        System.out.println("After casting to int: " + i);
    }
}
