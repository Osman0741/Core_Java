package day25_CustomMethods_Overloading;

public class SumOfNumbers {
    public static void main(String[] args) {
       int result1= sumOf2Numbers(5,9);
        System.out.println(result1);
        System.out.println("---------------------------------");
       int result2= sumOf3Numbers(6,9,8);
        System.out.println(result2);
        System.out.println("-----------------------------------");
        int result3= sumOf4Number(52,36,96,87);
        System.out.println(result3);

    }

    public static int sumOf4Number(int num1, int num2, int num3, int num4) {
        return sumOf3Numbers(num1,num2,num3)+num4;
    }

    public static int sumOf3Numbers(int num1, int num2, int num3) {
        return num1+num2+num3;
    }

    public static int sumOf2Numbers(int num1, int num2){
        return num1+num2;
    }
}
/*
Task1:
	    1. create a method that can find the sum of two numbers
	                    method name: sumOf2Numbers
	    2. create a method that can find the sum of three numbers
	                    method name: sumOf3Numbers
	    3. create a method that can find the sum of four numbers
	                    method name: sumOf4Numbers
 */