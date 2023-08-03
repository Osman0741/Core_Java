package day20_Arrays;

import java.util.Arrays;

public class ArrayPractise2 {
    public static void main(String[] args) {
        char[] letters = new char[26];
      /*  for (int i = 0 ,j='A'; i < letters.length ; i++,j++) {
            letters[i]= (char) j;
            */
        char ch = 'A';
        for (int i = 0; i < letters.length; i++) {
            letters[i]=ch++;

        }
        System.out.println(Arrays.toString(letters));

    }

}

