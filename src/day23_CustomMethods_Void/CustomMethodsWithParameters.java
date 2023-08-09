package day23_CustomMethods_Void;

public class CustomMethodsWithParameters {
    public static void main(String[] args) {
        oddOrEven(5);
        ageOfPerson(1990);
        numbers(10,60);

    }
    // create a function that can check if a number is odd number or even number
    public static void oddOrEven(int number){
        if(number%2==0){
            System.out.println(number+" is even number");
        }else{
            System.out.println(number+" is odd number");
        }

    }
    // create a function that can display the age of the person
    public static void ageOfPerson(int birthYear){
        int age= 2023 - birthYear;
        System.out.println("Age is "+age);
    }
    //create a function that can print all the numbers between X and Y
    public static void numbers(int x, int y){
        for (int i = x; i <=y ; i++) {
            System.out.print(i+" ");

        }
    }
}
