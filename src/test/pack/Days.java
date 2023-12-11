package test.pack;

import java.util.Scanner;

public class Days {
    public static void main (String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter a Number from 1-7: ");
        int days = sc.nextInt();
        String red = "\u001B[32m";
        String normal = "\u001B[0m";

        if (days >= 1 && days <= 7) {
            switch (days) {
                case 1:
                    System.out.println(red+"Monday"+normal+" today");
                    break;
                case 2:
                    System.out.println("Tuesday");
                    break;
                case 3:
                    System.out.println("Wednesday");
                    break;
                case 4:
                    System.out.println("Thursday");
                    break;
                case 5:
                    System.out.println("Friday");
                    break;
                case 6:
                    System.out.println("Saturday");
                    break;
                case 7:
                    System.out.println("Sunday");
                    break;
                default:
                    System.out.println("Invalid Input");
            }
        }
        else{
            System.out.println("Invalid");
        }
    }
}