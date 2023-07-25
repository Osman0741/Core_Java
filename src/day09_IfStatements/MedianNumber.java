package day09_IfStatements;

/*
Create a class called MedianNumber. write a program that can find the median number between three DIFFERENT given integers

			Ex:
				a = 10, b= 15, c = 20;

			Output:
				15 is the median number


			Posibility #1: a could be median number
			Posibility #2: b could be median number
			Posibility #3: c could be median number
 */
public class MedianNumber {
    public static void main(String[] args) {
        int a =15 , b=40, c = 10;
        if ((a<b && b<c )|| (c<b && b<a) ){
            System.out.println(b+ " is the median number");
        }
        if ((b<a && a<c) || (c<a && a<b)){
            System.out.println(a + " is the median number");
        if ((a<c && c<b)|| (b<c && c<a)){
                System.out.println( c+ " is the median number");
            }

        }

        }
    }