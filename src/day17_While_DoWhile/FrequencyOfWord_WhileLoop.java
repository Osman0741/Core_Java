package day17_While_DoWhile;

public class FrequencyOfWord_WhileLoop {
    public static void main(String[] args) {
        String str = "java Java jaVa python python";
        str = str.toLowerCase();
        int countJava = 0;
        while (str.contains("java")) {
            str = str.replaceFirst("java", "");
            countJava++;
        }
        System.out.println("countJava = " + countJava);
        System.out.println("-------------------------------------");
        String s = "java Java jaVa python python";
        s = s.toLowerCase();
        int count1 = 0;
        int count2 = 0;
        while ((s.contains("java") || s.contains("python"))) {
            if (s.contains("java")) {
                s = s.replaceFirst("java", "");
                count1++;
            }
            if (s.contains("python")) {
                s = s.replaceFirst("python", "");
                count2++;
            }


        }
        System.out.println("count1 = " + count1);
        System.out.println("count2 = " + count2);
    }
}
