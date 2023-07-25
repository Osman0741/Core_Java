package day08_IfStatements;

/**
 * System.out.println( true == !false ); // true
 * System.out.println( !true != false ); // false
 * System.out.println( !false == true); // true
 * System.out.println(!!false); //false
 * System.out.println(!!!true); // false
 */
public class GradeReport {
    public static void main(String[] args) {
        int score = 85;
        boolean a = score >= 90 && score <=100;
        boolean b = score >= 80 && score <= 89;
        // boolean b = score >= 80 && !a
        boolean c = score >= 70 && score <= 79;
        boolean d = score >= 60 && score <= 69;
        boolean f = score >= 0 && score <= 59;
        // boolean f = !a && !b && !c && !d
        if (a){
            System.out.println("Excellent");
        }
        if (b){
            System.out.println("Great");
        }
        if (c){
            System.out.println("Good");
        }
        if (d){
            System.out.println("Passed");
        }
        if (a){
            System.out.println("Failed");
        }

    }
}