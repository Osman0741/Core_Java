package day18_NestedLoop;

import java.util.Scanner;

public class AdditionOfTwoNumbers {
    public static void main(String[] args) {

        Scanner scan = new Scanner(System.in);
        while(true){
            System.out.println("Enter first number: ");
            int num1 = scan.nextInt();
            System.out.println("Enter second number: ");
            int num2 = scan.nextInt();
            System.out.println("Addition: " + (num1 + num2));
            System.out.println("Would you like continue");
            String answer = scan.next().toLowerCase();
            while (!(answer.equals("yes") || answer.equals("no"))) {
                System.out.println("Invalid entry, please re-enter:");
                answer = scan.next().toLowerCase();
            }
            if (answer.equals("no")) {
                break;
            }
        }


    }
}
