package day17_While_DoWhile;

public class BranchingStatements2 {
    public static void main(String[] args) {
        for (char i = 'A'; i < 'F'; i++) {
            if(i=='C'){
                continue;
            }
            System.out.print(i+" ");

        }
        System.out.println();
        System.out.println("-----------------------------");
        //print all even numbers between 1~10 by using loop and branching statement
        for (int i = 1; i <11 ; i++) {// skip the odd numbers
            if (i%2!=0){
                continue;
            }
            System.out.print(i+" ");

        }
        System.out.println();
        //print all odd numbers between 1~10 by using loop and branching statement
        for (int i = 1; i <11 ; i++) { // skip the even numbers
            if (i%2==0){
                continue;
            }
            System.out.print(i+" ");

        }

    }
}
