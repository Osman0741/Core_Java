package day16_ForLoopStringPractice;

import java.util.Collections;

// write a program that can separate digits , letters and special characters of given a string
public class DigitsLettersSpecialChars {
    public static void main(String[] args) {
        String str = "Cydeo1234500000000School@ !$";
        String digits = "",
                letters = "",
                specialChars = "";
        for (int i = 0; i < str.length(); i++) {
            char ch = str.charAt(i);
            if (ch >= '0' && ch <= '9'&& ch!='0')
                digits += ch;
             else if ((ch >= 'a' && ch <= 'z') || (ch >= 'A' && ch <= 'Z'))
                letters += ch;
             else
                if (ch != ' ')
                    specialChars += ch;


        }
        System.out.println("digits = "+digits);
        System.out.println("letters = "+letters);
        System.out.println("specialChars = "+specialChars);

    }

}

