package assignments;

import java.util.Scanner;

//Develop a program to count the number of vowels and consonants in a given string.
public class CountOfConsonants {
    public static void main(String[] args) {
        Scanner scanner =new Scanner(System.in);
        System.out.println("Please enter any string");
        String s1=scanner.nextLine();
      String s =s1.toLowerCase();
        int count1=0;
        int count2=0;
        for(int i=0;i<s.length();i++)
        {
            if(s.charAt(i)=='a'||s.charAt(i)=='e'||s.charAt(i)=='o'||s.charAt(i)=='u'||s.charAt(i)=='i')
            {
                count1++;
            }
            else
                count2++;
        }
        System.out.println("Number of Vowels :"+count1);
        System.out.println("Number of Consonants:"+count2);

    }

}
