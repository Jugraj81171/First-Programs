import java.util.Scanner;

public class sum_of_numbersdw {
    public static void main (String[] args)


    {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Enter the number for which you want to calculate sum ");
        int x = scanner.nextInt();
        int sum =0;
        int i =1;

        do
        {
          System.out.println(i);

          sum = sum+ i;
        i++;
        }
        while(i<=x);
        System.out.println("Sum of the numbers is "+sum);
    }
}
