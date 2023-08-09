package day21_ForEachLoop;

import java.util.Arrays;

public class MergeTwoArrays {
    public static void main(String[] args) {
        String[] group1 = {"Ali", "Layan", "Aysenur" }; // 3
        String[] group2 = {"Maria", "Aygun", "Duygu", "Suat", "Valeriy"}; //5
        String[] group3= new String[group1.length+ group2.length];
        int i=0;
        for (String s : group1) {
            group3[i++]=s;

        }
        for (String s : group2) {
            group3[i++]=s;

        }
        System.out.println(Arrays.toString(group3));


        System.out.println("-----------------------------------------------");

        char[] ch1 = {'A', 'B', 'C'};
        char[] ch2 = {'D', 'E', 'F', 'G', 'H'};

        char[] chars = new char[ch1.length + ch2.length];

        int j = 0;

        for (char ch : ch1) {
            chars[j]= ch;
            j++;
        }

        for (char ch : ch2) {
            chars[j]= ch;
            j++;
        }

        System.out.println(Arrays.toString(chars));

    }
}
