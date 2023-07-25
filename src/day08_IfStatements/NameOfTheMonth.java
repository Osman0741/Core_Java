package day08_IfStatements;

public class NameOfTheMonth {
    public static void main(String[] args) {
        int number = 3;
        boolean month1 = number == 1;
        boolean month2 = number == 2, month3 = number == 3, month4 = number == 4,
                month5 = number == 5, month6 = number == 6, month7 = number == 7,
                month8 = number == 8, month9 = number == 9, month10 = number == 10, month11 = number == 11,
                month12 = number == 12;
        if (month1) {
            System.out.println("January");
        }
        if (month2) {
            System.out.println("February");
        }
        if (month3) {
            System.out.println("March");
        }
        if (month4) {
            System.out.println("April");
        }
        if (month5) {
            System.out.println("May");
        }
        if (month6) {
            System.out.println("June");
        }
        if (month7) {
            System.out.println("July");
        }
        if (month8) {
            System.out.println("August");
        }
        if (month9) {
            System.out.println("September");
        }
        if (month10) {
            System.out.println("October");
        }
        if (month11) {
            System.out.println("November");
        }
        if (month12) {
            System.out.println("December");
        }
    }
}