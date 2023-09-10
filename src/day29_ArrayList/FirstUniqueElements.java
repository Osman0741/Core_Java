package day29_ArrayList;

import java.util.ArrayList;

public class FirstUniqueElements {
    public static void main(String[] args) {
        ArrayList<Integer> list= new ArrayList<>();
        list.add(1);
        list.add(1);
        list.add(1);
        list.add(2);
        list.add(3);
        list.add(3);
        list.add(3);
        list.add(4);
        for (Integer each : list) {
            int frequency=0;
            for (Integer integer : list) {
                if(each==integer)
                    frequency++;
            }
            if(frequency==1){
                System.out.println(each);
                break;
            }

        }

    }
}
