package day10_NestedIf;

public class TernariesIntro {
    public static void main(String[] args) {
        int n = 100;
        if (n % 2 == 0) {
            System.out.println("even");
        } else {
            System.out.println("odd");
        }
        System.out.println("--------------------------");
        String result = (n % 2 == 0) ? "even" : "odd";
        System.out.println(result);
        System.out.println("--------------------------");
        int age = 17;
        System.out.println((age >= 21) ? "Eligible" : "Not Eligible");
        System.out.println("----------------------------------------");
        int x = 0;
        if (x > 0) {
            System.out.println("Positive");
        } else if (x < 0) {
            System.out.println("Negative");
        } else {
            System.out.println("Zero");
        }
       String result2= (x > 0) ? "Positive":(x<0)? "Negative": "Zero";
        System.out.println(result2);
    }
}