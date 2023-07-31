package day16_ForLoopStringPractice;

public class Reverse {
    public static void main(String[] args) {
      String str ="Wooden Spoon",
              reverse="";
        for (int i = str.length()-1; i >=0 ; i--) {
            char ch = str.charAt(i);
            reverse += ch;

        }
        System.out.println(reverse);


    }
}
/*1. Write a program that can reverse a String
        Ex:
        input:
        Wooden Spoon

        output:
        noopS nedooW
        */