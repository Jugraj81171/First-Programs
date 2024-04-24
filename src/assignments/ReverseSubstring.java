package assignments;

import java.util.Scanner;

/*Write a Java program that takes a sentence as input and reverses the order of words in it. A word is defined as a sequence of non-space characters. The program should maintain the order of characters within each word.
For example:

Input: "Hello World" Output: "World Hello"

Input: "Java Programming is Fun" Output: "Fun is Programming Java"*/
public class ReverseSubstring {
    public static void main(String[] args) {
        Scanner scanner =new Scanner(System.in);
        System.out.println("Enter any string");
        String s= scanner.nextLine();
        String[] s1=s.split(" ");
        for(int i=s1.length-1;i>=0;i--)
        {
            System.out.print(s1[i]+" ");

        }


    }
}
