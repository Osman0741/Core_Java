package day27_WrapperClasses;

public class WrapperClassMethods {
    public static void main(String[] args) {
        String str="123";
       int n= Integer.parseInt(str);
        System.out.println(n+1);//int
        System.out.println(str+1);//1231
        System.out.println("----------------------");

        String str2 = "10.5";
       double n2= Double.parseDouble(str2);
        System.out.println(n2+1);//double
        System.out.println(str2+1);//10.51
        System.out.println("-------------------------");

        String str3="true";
     boolean r= Boolean.parseBoolean(str3);
        System.out.println(r);
     if(r){
         System.out.println("Osman Özdemir");
     }

        System.out.println("-------------------------");
     int max= Integer.MAX_VALUE;
     int min= Integer.MIN_VALUE;
        System.out.println("max = " + max);
        System.out.println("min = " + min);

      byte max2=  Byte.MAX_VALUE;
      byte min2= Byte.MIN_VALUE;
        System.out.println("max2 = " + max2);
        System.out.println("min2 = " + min2);

        long max3 = Long.MAX_VALUE;
        long min3 = Long.MIN_VALUE;
        System.out.println("max3 = " + max3);
        System.out.println("min3 = " + min3);

        String s1 = "maybe";

        boolean r1 = Boolean.parseBoolean(s1);

        System.out.println(r1);

        System.out.println("--------------------------------------------");

        String s2 = "123";
        Integer x = Integer.valueOf(s2); //Integer
        int y = Integer.valueOf(s2);// Integer

        String s3 = "236";
       Integer n3= Integer.valueOf(s3);

        System.out.println(x);
        System.out.println(y);

        String s4 = "1.5";
        Double z = Double.valueOf(s4);// Double

        System.out.println(z);

        System.out.println("-----------------------------------------------------");

        char ch1 = 'A';

        //isDigit()
        boolean r2 = Character.isDigit(ch1);

        //isLetter()
        boolean r3 = Character.isLetter(ch1);

        // special char
        boolean r4= !Character.isLetterOrDigit(ch1);

        // upperCase
        boolean r5 = Character.isUpperCase(ch1);

        //lowerCase
        boolean r6 = Character.isLowerCase(ch1);

        System.out.println(r2);
        System.out.println(r3);
        System.out.println(r4);
        System.out.println(r5);
        System.out.println(r6);

        System.out.println("----------------------------------");

        String s = "ab1cde2efg3hi4";

        int sum = 0;

        for (char each : s.toCharArray()) {

            if( Character.isDigit(each) ){
                sum += Integer.parseInt(""+each);
            }

        }

        System.out.println("sum = " + sum);



    }
}
