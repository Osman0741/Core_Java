package day24_CustomMethods_Return;

public class BreakfastTasks {
    public static void main(String[] args) {

        initials("osman","özdemir");
        System.out.println("----------------------------");
        domain("osman@gmail.com");
        System.out.println("------------------------------");
        nameOfMonth(9);
        System.out.println("-----------------------------");
        nameOfDay(9);


    }
    //1. Create a method that can display the initials of the person.    initials(String firstName, String lastName)

    public static void initials(String firstName, String lastName){
        String initials= firstName.charAt(0)+"."+lastName.charAt(0);
        initials=initials.toUpperCase();
       System.out.println(initials);



    }
    //2. Create a method that can display the domain of the email.  domain(String email)
    public static void domain(String email){
         String domain= email.substring(email.indexOf("@")+1,email.lastIndexOf(".")) ;
        System.out.println(domain);



    }
    //3. Create a method that can display the name of the month based on the given number to the method
    public static void nameOfMonth(int number){

        if(number<1 ||number>12){
            System.out.println("Invalid");
            return;
        }
        String result= (number==1)?"January" :(number==2)?"Februaray" :(number==3)?"March" :(number==4)?"April"
                :(number==5)?"May" :(number==6)?"June" :(number==7)?"July" :(number==8)?"August"
                :(number==9)?"September":(number==10)?"October":(number==11)?"November" : "December";
        System.out.println(result);

    }
    //4. Create a method that can print the name of the day based on the given number to the method
    public static void nameOfDay(int number){
        String result="";
        if(number>=1 && number<=7){
            result= (number==1)?"Monday" :(number==2)?"Tuesday" :(number==3)?"Wednesday":(number==4)?"Thursday":(number==5)?"Friday"
                    :(number==6)?"Saturday" : "Sunday";
        }else{
            result="Invalid";
        }
        System.out.println(result);
    }




}




