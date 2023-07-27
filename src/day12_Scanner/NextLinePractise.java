package day12_Scanner;

import java.util.Scanner;

public class NextLinePractise {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        System.out.println("Enter your age: ");
        int age= input.nextInt();
        input.nextLine();
        System.out.println("Enter your full name");
        String name= input.nextLine();
        System.out.println("Enter your GPA");
        double GPA= input.nextDouble();
        input.nextLine();
        System.out.println("Enter your school");
        String school= input.nextLine();
        System.out.println("age = " + age);
        System.out.println("name = " + name);
        System.out.println("GPA = " + GPA);
        System.out.println("school = " + school);
        input.close();
    }
}
