package day15_ForLoop;

public class ForLoopPractises {
    public static void main(String[] args) {
        // print digits from 15 to 45 by using for loop.
        for(int i= 15; i<=45; i++ ){
            System.out.print(i+" ");
        }
        System.out.println();
        System.out.println("------------------------------------");
        //print even digits between 1~55
        for(int i = 1; i<55; i++ ){
            if (i % 2==0){
                System.out.print(i+" ");
            }


            }
        System.out.println();
        System.out.println("-------------------------");
            for(int i=2; i<55; i +=2){
            System.out.print(i+" ");
        }
    }
}
