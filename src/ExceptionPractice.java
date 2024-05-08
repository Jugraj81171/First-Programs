
import java.util.Scanner;


public class ExceptionPractice {
    public static void main(String[] args) {
        Scanner scanner=new Scanner(System.in);
        System.out.println("Enter first number");
        int num1= scanner.nextInt();
        System.out.println("Enter second number");
        int num2= scanner.nextInt();
        int result=0;
        try{
             result =num1/num2;
        }
        catch(NullPointerException e){
            e.printStackTrace();
        }
        catch(ArithmeticException e){
            e.printStackTrace();
        }
         catch(Exception e)
         {
             e.printStackTrace();
         }
        


    }






}
