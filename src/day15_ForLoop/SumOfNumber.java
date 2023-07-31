package day15_ForLoop;

import java.util.Scanner;

public class SumOfNumber {
    public static void main(String[] args) {
        int sum=0;
        for (int i = 0; i <101 ; i++) {
            sum +=i;
        }
        System.out.println(sum);
        System.out.println("-------------------");
        Scanner scan = new Scanner(System.in);
        int total =0;
        for (int i = 0; i <5 ; i++) {
            System.out.println("Enter a integer: ");
            total += scan.nextInt();

        }
        System.out.println(total);
    }
}
