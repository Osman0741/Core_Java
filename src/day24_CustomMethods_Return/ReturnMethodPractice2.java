package day24_CustomMethods_Return;

public class ReturnMethodPractice2 {
    public static void main(String[] args) {
        //create a function that can calculate the grade
       String result= grade(100);
        System.out.println(result);

    }
    public static String grade(int score){
        String result="";
        if (score>100 || score<0){
            result="Invalid";
        }
        result= (score>=90)?"A" :(score>=80)? "B" :(score>=70)? "C":(score>=60)? "D": "F";
        return result;
    }
}
