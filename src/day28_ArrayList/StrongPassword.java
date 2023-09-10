package day28_ArrayList;

public class StrongPassword {
    public static void main(String[] args) {
        String password ="Cydeo1990!";
        boolean r1= password.length()>=8 && !password.contains(" ");
        boolean r2=false; // it checks if the char is UpperCase or not
        boolean r3=false; // it checks if the char is LowerCase or not
        boolean r4=false; // it checks if the char is Digit or not
        boolean r5=false; // it checks if the char is Special Character or not
        for(int i=0; i<password.length(); i++){
            char ch= password.charAt(i);
            if(Character.isUpperCase(ch)){
                r2=true;
            } else if (Character.isLowerCase(ch)) {
                r3=true;

            } else if (Character.isDigit(ch)) {
                r4=true;

            }else {
                r5=true;
            }
        }
        boolean isStrongPassword= r1 && r2 && r3 && r4 && r5;
        System.out.println("isStrongPassword = " + isStrongPassword);
    }
    public static boolean isStrongPassword(String password){
        boolean r1 = password.length() >= 8 && !password.contains(" ");
        boolean r2 = false; // has upper case
        boolean r3 = false; //has lower case
        boolean r4 = false; //has special char
        boolean r5 = false; // has digit

        char[] chars = password.toCharArray();

        for (char each : chars) {

            if(Character.isUpperCase(each)){
                r2 = true;
            }else if(Character.isLowerCase(each)){
                r3 = true;
            }else if(Character.isDigit(each)){
                r5 = true;
            }else{ // special char
                r4 = true;
            }

        }

        boolean isStrongPassword = r1 && r2 && r3 && r4 && r5;
        return isStrongPassword;
    }
}
/*
1.Write a program that can verify if a password is a strong password. Characteristics of strong passwords are:
        1.1 Password must be at least have 8 characters long, and should not contain space
        1.2 PassWord should at least contain one upper case letter
        1.3 PassWord should at least contain one lower case letter
        1.4 Password should at least contain one special characters
        1.5 Password should at least contain a digit
 */