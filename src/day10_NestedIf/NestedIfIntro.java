package day10_NestedIf;

public class NestedIfIntro {
    public static void main(String[] args) {
        int score = 400;

        if (score >= 0 && score <= 100) {
            if (score >= 60) {
                System.out.println("Passed");
            } else {
                System.out.println("Failed");
            }

        } else {
            System.out.println("Invalid Score");
        }
        System.out.println("--------------------------------------");
        int age = 19;
        boolean hasID = false;
        if (hasID) {
            if (age >= 21) {
                System.out.println("Eligible to buy Alcohol");
            } else {
                System.out.println("Not Eligible to buy Alcohol ");
            }
        } else {
            System.out.println("You must have an ID");
        }
        System.out.println("-----------------------------------");
        int n= 76; // 1~~7
        if (n>=1 && n<=7){
            if (n==1){
                System.out.println("Monday");
            } else if (n==2) {
                System.out.println("Tuesday");

            }
            else if (n==3) {
                System.out.println("Wednesday");

            }
            else if (n==4) {
                System.out.println("Thursday");

            }
            else if (n==5) {
                System.out.println("Friday");

            }
            else if (n==6) {
                System.out.println("Saturday");

            }
            else  {
                System.out.println("Sunday");

            }

        }else {
            System.out.println("Invalid Number");
        }
    }
}