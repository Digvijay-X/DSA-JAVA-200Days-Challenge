
// Overloading using Parameters

public class OverloadingWithParameters {
    // same function name but different parameters

    public static void print(String name) {
        System.out.println("Name: " + name);
    }

    public static void print(int age) {
        System.out.println("Age: " + age);
    }

    public static void print(String name, int age) {
        System.out.println("Name: " + name + ", Age: " + age);
    }

    public static void main(String[] args) {
        print("Digvijay");
        print(21);
        print("Digvijay", 21);
    }
}
