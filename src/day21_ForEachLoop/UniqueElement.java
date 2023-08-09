package day21_ForEachLoop;

public class UniqueElement {
    public static void main(String[] args) {
        String[] words = {"Java", "Java", "C#","C++", "Python", "Python"};
        for (String word : words) {
            int count=0;
            for (String s : words) {
                if(word.equals(s))
                    count++;

            }
            if(count==1)
                System.out.println(word);

        }
    }
}
