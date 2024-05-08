package assignments.oops;

import java.util.Scanner;

 public class Age {
    int x;
    public void age_validation(int age ){
        if (age>=18){
            System.out.println("You are eligibile to vote");
        }
            else
            {
                 throw new ArithmeticException("Person is not eligible to vote");
            }

        }



    public static void main(String[] args) {
        Age age =new Age();
        Scanner scanner =new Scanner(System.in);
        System.out.println("Please Enter the age of candidate");
        int x= scanner.nextInt();
        age.age_validation(x);
    }
}
