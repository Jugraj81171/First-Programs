import java.util.Scanner;

public class addition_for {
    public static void main (String[] args)
    {
        System.out.println("Enter the number for which you want to calculate addition");
        Scanner scanner = new Scanner (System.in) ;
        int n = scanner.nextInt();
        int sum=0;
        for(int i =0 ; i<= n;i++)
        {
            System.out.println(i);
            sum = sum +i;

        }

      System.out.println("Sum of numbers is "+ sum);

    }
}
