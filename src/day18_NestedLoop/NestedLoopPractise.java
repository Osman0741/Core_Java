package day18_NestedLoop;

import java.util.Scanner;

public class NestedLoopPractise {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        while (true) {
            System.out.println("Enter your age:");
            int age = scan.nextInt();
            while (!(age > 1 && age < 120)) {
                System.out.println("Invalid entry, re-enter:");
                age = scan.nextInt();
            }
            System.out.println("Would you like continue:");
            String answer = scan.next().toLowerCase();
            while (!(answer.equals("yes") || answer.equals("no"))) {
                System.out.println("Invalid entry, re-enter:");
                answer = scan.next().toLowerCase();

                }
            if (answer.equals("no")) {
                break;
            }
        }
        scan.close();
    }
}