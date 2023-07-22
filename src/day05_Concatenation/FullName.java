package day05_Concatenation;

public class FullName {

    public static void main(String[] args) {

        String firstName = "Osman";
        String lastName = "ÖZDEMİR";
        int age = 32;
        String jobTitle = "Java Developer";
        String companyName = "Apple";
        double salary = 108900;
        String fullName = firstName + " " + lastName;
        System.out.println(fullName);
        // Full name of person is________
        System.out.println("Full name of person is " + fullName);
        // ___is___years old
        System.out.println(fullName + " is " + age + " years old.");
        System.out.println(fullName + " is "+ jobTitle +" works at " +companyName+", and "+ fullName + "'s Salary is $"+ salary);

    }
}
