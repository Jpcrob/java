package test.pack;
import java.util.Scanner;
public class Score {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter Grade: ");
        int grade = sc.nextInt();
        String rank;
        if (grade >= 0 && grade <= 100) {
            rank = switch (grade / 10) {
                case 9 -> "A";
                case 8 -> "B";
                case 7 -> "C";
                case 6 -> "D";
                default -> "F";
            };
        } else {
            rank = "Invalid";
        }
        System.out.println(rank+" Grade.");
    }
}
