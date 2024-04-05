import java.util.Scanner;

public class multiplicationdw {
    public static void main (String[] args)
    {
       System.out.println("Enter the number for which you want to get multiplication table ");
       Scanner scanner= new Scanner (System.in);
       int num = scanner.nextInt();
       int mul=1;
       int i=1;
       do {
           mul = num * i;
           System.out.println(num+"*"+i+"="+mul);
           i++;

       }while (i<= 10);




    }
}
