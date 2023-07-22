package day06_PrimitiveTypeCasting;

public class PrimitiveCasting {
    public static void main(String[] args) {
        byte a = 100;
        short b = a;
        // short b = (short) a
        int c = b; // implicit casting
        long d = c;
        float e = d;
        double f = e;
        System.out.println("f = " + f);

        System.out.println("--------------------------------------");
        int x = 55;
        short y = (short)x;
        System.out.println(x +" : "+ y);
        long j = 1000000;
        short k =(short)j;
        System.out.println(j+" : "+k);
        double s = 10.8;
        int n = (int) s;
        System.out.println(s + " : "+ n);
        double d1 = 12.57;
        short s1 = (short) d1;
        System.out.println(d1+" : "+s1);
    }
}
