package day26_CustomMethodPractice;

import utilities.ArraysUtility;

import java.util.Arrays;

public class RemoveElements2 {
    public static void main(String[] args) {
        int[] arr1={1,2,3,4,5};

        int[] arr2= removeElement(arr1,4);
        System.out.println(Arrays.toString(arr2));


    }
    public static int[] removeElement(int[] array, int index){

        if(index < 0 || index > array.length-1){
            System.err.println("Invalid Index Number: "+index);
            System.exit(0);
        }

        int[] result={};
        for (int i = 0; i < array.length; i++) {
            if(i != index){
                result= ArraysUtility.addElement(result , array[i]);

            }

        }
        return result;
    }
}
