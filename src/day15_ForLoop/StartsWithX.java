package day15_ForLoop;

import java.util.Scanner;

/*
1. Write a program that asks user to enter a word. If the word starts with x, replace it with a.
                    Input:
                        xcodex
                    Output:
                        acodex
 */
public class StartsWithX {
    public static void main(String[] args) {
        System.out.println("Enter a word: ");
        String word = new Scanner(System.in).next();//in order to get only one input from user
        if (word.charAt(0)=='x'){// charAt returns char, so == must be used for comparing.
            System.out.println(word.replaceFirst("x", "a"));
        }
    }
}
