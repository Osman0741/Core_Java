package day20_Arrays;

import java.util.Arrays;

public class ArraysIntro {
    public static void main(String[] args) {
        String[] myGroup= new String[5];
        myGroup[0]="Osman";
        myGroup[1]="Murat";
        myGroup[2]="Ali";
        myGroup[3]="Veli";
        myGroup[4]="Burak";
       // myGroup[5]="Serhat";
       // myGroup[-1]="Mustafa"
      /*  String[] myGroup;
        myGroup = new String[5];*/
        //System.out.println(myGroup); hashcode
        System.out.println(Arrays.toString(myGroup));
        System.out.println("--------------------------------------------");
        String[] days={"Monday","Tuesday","Wednesday","Thursday","Friday","Saturday","Sunday"};
        // index         0          1          2          3          4         5         6
        int number=5;
        if(number<1 || number>7){
            System.out.println("Invalid Entry");
            System.exit(0);
        }
        System.out.println(Arrays.toString(days));
        System.out.println(days[number-1]);
    }
}
