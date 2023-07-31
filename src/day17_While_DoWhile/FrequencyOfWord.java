package day17_While_DoWhile;

public class FrequencyOfWord {
    public static void main(String[] args) {
        String str = "java Java JAva jAVA JaVA";
        int frequency =0;
        for (int i = 0; i <=str.length()-4 ; i++) {
            String s = str.substring(i,i+4);
            if(s.equalsIgnoreCase("java")){
                frequency++;
            }

        }
        System.out.println(frequency);
    }
}
