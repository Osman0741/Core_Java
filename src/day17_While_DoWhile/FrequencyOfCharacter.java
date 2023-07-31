package day17_While_DoWhile;

public class FrequencyOfCharacter {
    public static void main(String[] args) {
        String str = "AAABBBC";
        char ch ='A';
        int count =0;
        for (int i = 0; i <str.length(); i++) {
            char ch2 = str.charAt(i);
            if (ch2==ch){
                count ++;
            }

        }
        System.out.println("count = " + count);

    }
}
/*
1. Write a program that can return the frequency of a char from a String

			Ex:
				str = "AAABBBC"
				ch = 'A'

			Output:
				3


 */