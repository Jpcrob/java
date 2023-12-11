package test.pack;
import static java.lang.Math.*;
public class taskMath {

    public static int add(int a, int b) {
        return Math.addExact(a,b);
        // Your code here
    }

    public static int subtract(int a, int b) {
        return Math.subtractExact(a,b);
        // Your code here
    }

    public static int multiply(int a, int b) {
        return Math.multiplyExact(a,b);
        // Your code here
    }

    public static int divide(int a, int b) {
        return  Math.floorDiv(a, b);
        // Your code here
    }

    public static void main(String[] args) {
        System.out.println(add(8,2));
        System.out.println(subtract(8,2));
        System.out.println(multiply(8,2));
        System.out.println(divide(8,2));
        // Demonstrate the math operations here
    }
}
