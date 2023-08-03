package day20_Arrays;

public class AppearedTwice {
    public static void main(String[] args) {
        int[] numbers ={1,2,3,4,5,1,6,7,8,9};
        for (int i = 0; i < numbers.length; i++) {
            int num = numbers[i];
            int count=0;
            for (int i1 = 0; i1 < numbers.length; i1++) {
                if(num==numbers[i1])
                    count++;

            }
            if(count==2){
                num=numbers[i];
                System.out.println(num);
                break;
            }

        }
    }
}
