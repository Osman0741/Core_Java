package day08_IfStatements;

public class NameOfDays {
    public static void main(String[] args) {
        int number = 6;
        boolean day1 = number==1, day2 = number==2, day3 = number==3,
                day4 = number==4, day5 = number==5, day6 = number==6, day7 = number==7;
        if (day1){
            System.out.println("Sunday");
        }
        if (day2){
            System.out.println("Monday");
        }
        if (day3){
            System.out.println("Tuesday");
        }
        if (day4){
            System.out.println("Wednesday");
        }
        if (day5){
            System.out.println("Thursday");
        }
        if (day6){
            System.out.println("Friday");
        }
        if (day7){
            System.out.println("Saturday");
        }
    }
}