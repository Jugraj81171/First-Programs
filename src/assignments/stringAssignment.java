package assignments;

import java.util.Scanner;

/*Create a program to check if a given string is a palindrome (reads the same backward as forward).*/
public class stringAssignment {
    public boolean isPalindrome(String s)
    {
        for(int i=0,j=s.length()-1;i<j;i++,j--)
        {
            if(s.charAt(i)!=s.charAt(j))
            {
                return false;
            }

        }

        return true;

    }
     public static void main(String[] args)
     {
         Scanner scanner =new Scanner(System.in);
         System.out.println("Enter any string to check if its palindrome or not:");
         String s=scanner.nextLine();
         stringAssignment input =new stringAssignment();
        if(input.isPalindrome(s))
        {
            System.out.println("String is Palindrome");
        }
        else
            System.out.println("String is not a Palindrome");


     }
}
