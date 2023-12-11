package test.pack;
import test.pack.RopeSwing;

public class Rope {
    Rope() {
        System.out.print("1 ");
    }

    Rope(Integer num) {
        System.out.print("3 ");
    }
    Rope(Object num) {
        System.out.print("4 ");
    }
    Rope(int... nums) {
        System.out.print("5 ");
    }
    public static void main(String[] args) {
        new Rope(100);
        new Rope(1000L);
    }
}


