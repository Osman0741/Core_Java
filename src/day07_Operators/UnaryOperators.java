package day07_Operators;

public class UnaryOperators {

    public static void main(String[] args) {

        int a = +25;
        int b = -25;
        System.out.println(a+ "\n"+b);
        int c=  45;
        ++c; // pre increment; increase the value  by 1 right away;
        System.out.println(c);
        System.out.println(c--);// post decrement; first passes current value, then decrease the value by 1
        System.out.println(c);
        int d = 67;
        System.out.println(d++);//67, d =68
        System.out.println(d--);//68 d= 67
        System.out.println(++d);//68 d= 68
        System.out.println(--d);//67 d=67
        System.out.println(d);//67
    }
}
