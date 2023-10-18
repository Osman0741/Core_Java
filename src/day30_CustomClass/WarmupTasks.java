package day30_CustomClass;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;

public class WarmupTasks {
    public static void main(String[] args) {
        ArrayList<Integer> list = new ArrayList<>();
        list.addAll(Arrays.asList(1,2,3,4,5,6,7,8,9));

        Collections.swap(list, 0,list.size()-1);
        System.out.println(list);

        System.out.println("-----------------------------------");

        ArrayList<Integer> numbers=new ArrayList<>();
        numbers.addAll(Arrays.asList(1,0,2,0,3,0,4,0));
        int size= numbers.size();
        numbers.removeAll(Arrays.asList(0));
        int sizeWithoutZeros=numbers.size();
        int numberOfZeros= size-sizeWithoutZeros;
        for (int i = 0; i < numberOfZeros ; i++) {
            numbers.add(0);

        }
        System.out.println(numbers);

        ArrayList<Integer> list2 = new ArrayList<>();
        list2.addAll(Arrays.asList(1,0,2,0,3,0,4,0));

        ArrayList<Integer> result = new ArrayList<>();

        for (Integer each : list2) {
            if(each != 0){
                result.add(each);
            }
        }

        for (Integer each : list2) {
            if(each == 0){
                result.add(each);
            }
        }

        System.out.println(result);


        System.out.println("-----------------------------------------------------------");

        String str="ABCD123$%#@&456EFG!";

        ArrayList<Character> chars = new ArrayList<>();

        for (int i = 0; i <str.length() ; i++) {
            chars.add(str.charAt(i));
        }
        ArrayList<Character> numbers2 = new ArrayList<>(chars);
        ArrayList<Character> letters = new ArrayList<>(chars);
        ArrayList<Character> special = new ArrayList<>(chars);

        numbers2.removeIf(p-> !Character.isDigit(p));
        System.out.println(numbers2);

        letters.removeIf(p-> !Character.isLetter(p));
        System.out.println(letters);

        special.removeIf(p-> Character.isLetterOrDigit(p));
        System.out.println(special);

        // specialChar.removeAll( letters );
        //  specialChar.removeAll( digits );







    }
}
/*
1. write a program that can swap the first and last elements of an ArrayList
2. Write a program that can move all the zeros to the last indexes of ArrayList
					Ex:
						list: {1,0,2,0,3,0,4,0}
					output:
						[1, 2, 3, 4, 0, 0, 0, 0]
3. Write a program that can extract the special characters, digits and letters from a string and stores them into separate ArrayLists of Characters
				Ex:
					str = "ABCD123$%#@&456EFG!"
				output:
					list1: {1, 2, 3, 4, 5, 6}
					list2: {A, B, C, D, E, F, G}
					list3: {$, %, #, @, &, !}
 */