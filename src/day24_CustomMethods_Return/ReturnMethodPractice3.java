package day24_CustomMethods_Return;

public class ReturnMethodPractice3 {
    public static void main(String[] args) {
        String str="aaaaabbbbbccccdddeeef";
        int result= frequency(str, 'a');
        String unique="";
        System.out.println(result);
        for (int i = 0; i <str.length() ; i++) {
            result=frequency(str,str.charAt(i));
            if(result==1)
                unique=""+str.charAt(i);

        }
        System.out.println(unique);

        }


    public static int frequency (String str, char c){
        int count=0;
        for (int i = 0; i <str.length() ; i++) {
            if(str.charAt(i)==c)
                count++;

        }
        return count;
    }
}
