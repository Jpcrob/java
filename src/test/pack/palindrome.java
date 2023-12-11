package test.pack;
import java.util.Scanner;
public class palindrome {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Input: ");
        String in = sc.nextLine().toLowerCase().replaceAll("\\s","");
        StringBuilder input = new StringBuilder(in).reverse();
        String sb = input.toString();
        String result = in.equals(sb) ? " palindrome" : " not palindrome";
        System.out.println(result);
    }
}
