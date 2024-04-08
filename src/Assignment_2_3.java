import java.util.Scanner;

//Write a Java program that takes a user's age as input and
// determines whether they are eligible to vote or not.
public class Assignment_2_3
{

    public static void main (String[] args)
    {
        Scanner scanner= new Scanner(System.in);
        System.out.println("Please enter your age");
        int age = scanner.nextInt();
        if(age >= 18)
        {
            System.out.println("Congrats!You are eligible to vote");
        }
        else
            System.out.println("Sorry! you are not eligible to vote");
    }

}
