package day25_CustomMethods_Overloading;

import utilities.StringUtility;

public class Test {
    public static void main(String[] args) {
        String str= "Wooden Spoon";
        StringUtility.printEachChar(str);

        System.out.println("---------------------------");

        String s1 = "Cydeo School";
        String result= StringUtility.reverse(s1);
        System.out.println(result);

        System.out.println("------------------------------");

        String word = "Java";
      boolean palindrome=  StringUtility.isPalindrome(word);
        System.out.println(palindrome);

        System.out.println("-----------------------------------------");

        String[] names = {"Anna", "Java", "Python", "racecar", "Mom", "Cydeo"};
        int count=0;
        for (String name : names) {

         if(StringUtility.isPalindrome(name))  // if(name.equalsIgnoreCase(StringUtility.reverse(name)))
                count++;
        }
        System.out.println(count);
        System.out.println("--------------------------------------------");

        String s2 = "aaaaabbbbbbccccddddd";
      String result2 = StringUtility.removeDuplicates(s2);
        System.out.println(result2);

    }

}
