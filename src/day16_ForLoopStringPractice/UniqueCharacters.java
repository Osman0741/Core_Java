package day16_ForLoopStringPractice;

public class UniqueCharacters {
    public static void main(String[] args) {
        String str ="AABCCD";
        for (int i = 0; i <str.length(); i++) {
            char ch = str.charAt(i);
            if(str.indexOf(str.charAt(i))== str.lastIndexOf(str.charAt(i))){
                System.out.println(ch+ " Unique Character!");
            }

        }
    }
}
/*
Write a program that can return the unique characters from a String

			Ex:
				input:
					AABCCD

				output:
					BD

			Hint: You will need indexOf() and lastIndexOf()
				  if the first and last index numbers of the character are same, then it's unique



				  indexOf('A') ==> 0
				  lastIndexOf('A') ==> 1


				  indexOf('B') ==>2
				  lastIndexOf('B') ==> 2


 */