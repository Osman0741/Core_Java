package day20_Arrays;

import java.util.Scanner;

/*
5. Items
			1. Create an array named items with the length of 5
			2. Create an array named prices with the length of 5
			3. Ask user to enter item name and price 5 times and store them into the items and prices arrays
			4. calculate the total price of the arrays
			5. display each item name and price in separate lines

						ItemName -- Price
 */
public class Items {
    public static void main(String[] args) {
        String[] items = new String[5];
        double[] prices= new double[5];
        Scanner scan = new Scanner(System.in);
        int sum=0;
        for (int i = 0; i < items.length; i++) {
            System.out.println("Enter items ");
            items[i]=scan.next();
            System.out.println("Enter prices");
            prices[i]=scan.nextDouble();
            sum += prices[i];
          //  System.out.println(items[i]+"="+prices[i]);
        }
        for (int i = 0; i < items.length; i++) {

            System.out.println(items[i]+"="+prices[i]);
        }
        System.out.println("sum = " + sum);






        }

    }

