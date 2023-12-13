package test.pack;

import java.util.Scanner;

public class Days {
    public static void main (String[] args) {
        String[] days = {"","Monday", "Tuesday", "Wednesday", "Thursday", "Friday", "Saturday", "Sunday"};
        Scanner scanner = new Scanner(System.in);
        System.out.print("Enter a number between 1 and 7: ");
        int num = scanner.nextInt();
        if (num >= 1 && num <= 7) {
            String numDay = days[num];
            System.out.println(num + " is " + numDay);
        }
        else {
            System.out.println("Invalid input. Please enter a number between 1-7.");
        }
    }
}