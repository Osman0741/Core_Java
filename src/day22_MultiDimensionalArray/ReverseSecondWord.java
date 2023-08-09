package day22_MultiDimensionalArray;

public class ReverseSecondWord {
    public static void main(String[] args) {
        String sentence="I Love Java";
        String[] arr=sentence.split(" ");
        String reverse="";
        for (int i = arr[1].length()-1; i >= 0; i--) {
            reverse += arr[1].charAt(i);

        }
        System.out.println(reverse);
        String result= sentence.replace(arr[1], reverse);
        System.out.println(result);
        /*
        words[1] = reverse;
        System.out.println(Arrays.toString(words));

        String result = "";
        for (String word : words) {
           result += word +" ";
        }

        System.out.println(result);
         */

    }
}
/*
2. Write a program that can reverse the second word of the sentence
			Ex:
				sentence = "I Love Java";
			output:
				I evoL Java
 */