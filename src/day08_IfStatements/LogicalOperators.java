package day08_IfStatements;

public class LogicalOperators {
    public static void main(String[] args) {
        String name = "Micheal";
        int age = 19;
        String citizen = "USA";
        boolean isEligible = age >= 18 && citizen == "USA";
        System.out.println(name+ " is eligible for voting :"+ isEligible);
        System.out.println("-------------------------------------------------------");
        String name2 = "Adam";
        int creditScore = 720, age2 = 32, income = 99000;
        boolean isEligible2 = age2 >= 23 && creditScore >= 700 && income> 100000;
        System.out.println(name2+ " is eligible for loan: "+ isEligible2);

        System.out.println("----------------------------------------------------------");

        String name3 = "Shay";
        int age3 = 21;
        char gender ='F';
        boolean isEligible3 = age3 >=18 && (gender == 'F' || gender == 'M');
        System.out.println(name3+ " is eligible :" + isEligible3);


        System.out.println("-------------------------------------------------------");

        String name4 = "James";

        String countryOfBirth = "USA";
        boolean marriedToUSCitizen = false;

        boolean isEligible4 =  countryOfBirth == "USA" || marriedToUSCitizen == true;
        //                       true

        System.out.println(name4 +" is eligible to apply for US citizenShip: "+isEligible4);

        System.out.println("----------------------------------------------------------------");

        String student = "Ali";

        double gpa = 2.5;
        int familyIncome = 50000;

        boolean isEligible5 =  gpa >= 3.5 || familyIncome <= 60000;
        //                      false || true

        System.out.println(student +" is eligible for scholarship: "+isEligible5);

        System.out.println("-------------------------------------------");

        boolean result2 = true;

        System.out.println("result2 = " + result2);

        boolean result3 = !result2;

        System.out.println("result3 = " + result3);

        System.out.println("-------------------------------------------");

        int score = 55;
        boolean passed = score >= 60;
        boolean failed = !passed;

        System.out.println("passed = " + passed);
        System.out.println("failed = " + failed);
        int age5 = 18;
        boolean eligible = age5 >= 18;
        boolean notEligible = !eligible;
        System.out.println(eligible+ "\n"+ notEligible);

    }
}