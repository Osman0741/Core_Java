package day22_MultiDimensionalArray;

import java.util.Arrays;

public class ReverseSentence {
    public static void main(String[] args) {
        String sentence= "Today is a good day to learn Java";
      String[] arr=  sentence.split(" ");
        System.out.println(Arrays.toString(arr));
        String reverse="";
        for (int i = arr.length - 1; i >= 0; i--) {
            reverse+=arr[i]+" ";

        }
        System.out.println(reverse);


    }
}
/*
1. Write a program that can reverse a sentence
			Ex:
				sentence = "Today is a good day to learn Java";
			output:
				Java learn to day good a is Today
 */