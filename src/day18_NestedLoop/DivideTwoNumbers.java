package day18_NestedLoop;

public class DivideTwoNumbers {
    public static void main(String[] args) {
        int num1= 98,
                num2=7;
      int  a=num1;
        int result=0;
        while (num1>=num2){
            num1-=num2;
            result++;
        }
        System.out.println(a+"/"+num2+"="+result+" and remainder is "+num1);
    }
}
