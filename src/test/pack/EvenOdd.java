package test.pack;


import java.util.Scanner;

public class EvenOdd {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Enter a number:");
        int number = scanner.nextInt();
        if(number==0){
            System.out.println("The number is Zero");
        }
        else {
            String evenOdd;
            evenOdd = (number % 2 == 0) ? number + " is even number" : number + " is odd number";
            System.out.println(evenOdd);
            String posNeg = (number > 0) ? "Positive" : "Negative";
            System.out.println("and is " + posNeg);
        }
    }
}
