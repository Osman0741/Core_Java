package day20_Arrays;

import java.util.Scanner;

public class MinMaxNumbers {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        System.out.println("How many numbers would you like to enter");
        int length = scan.nextInt();
        if (length <= 0) {
            System.out.println("Invalid Entry");
            System.exit(0);
        }
        int[] numbers = new int[length];

        for (int i = 0; i < numbers.length; i++) {
            System.out.println("Enter a number");
            int num = scan.nextInt();
            numbers[i] = num;
        }
        int max = numbers[0];
        int min = numbers[0];
        for (int i = 0; i < numbers.length; i++) {
            if (min > numbers[i])
                min = numbers[i];
            if (max < numbers[i])
                max = numbers[i];
        }
        System.out.println("min = " + min);
        System.out.println("max = " + max);
    }


}

