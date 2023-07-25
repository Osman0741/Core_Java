package day08_IfStatements;

public class EligibleToVote {

    public static void main(String[] args) {
        int age = 20;
        String citizen = "USA";
        boolean eligible = age >=21 && citizen == "USA";
        if (eligible){
            System.out.println("Eligible");
        }
        if (!eligible){
            System.out.println("Not Eligible");
        }
    }
}
