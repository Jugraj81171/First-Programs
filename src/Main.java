import java.util.Scanner;

import static java.lang.System.exit;

//TIP To <b>Run</b> code, press <shortcut actionId="Run"/> or
// click the <icon src="AllIcons.Actions.Execute"/> icon in the gutter.
public class Main {
    public static void main(String[] args) {
        //TIP Press <shortcut actionId="ShowIntentionActions"/> with your caret at the highlighted text
        // to see how IntelliJ IDEA suggests fixing it.
        System.out.println("Welcome to my calculator");
        System.out.println("Press 1 for addition \nPress 2 for multiplication \nPress 3 for divison \nPress 4 for reminder \nPress 5 for subtraction\n Press 0 for exit");
        Scanner scanner = new Scanner(System.in);
         System.out.println("Enter the value of num1");
        int x = scanner.nextInt();
        System.out.println("Enter the value of num2");
        int y = scanner.nextInt();
        System.out.println("Enter the case number");
        int input = scanner.nextInt();
        switch(input) {
            case 1:
                int z = x+y;
                System.out.println("The addition of num1 and num2 is " + z);
                break;
            case 2:
                int m= x*y;
                System.out.println("The multiplication of num1 and num2 is " + m);
                break;
                case 3:
                double l= (double) x /y;
                System.out.println("The division of num1 and num2 is " + l);
                break;
            case 4:
                int k= x%y;
                System.out.println("The modulus of num1 and num2 is " + k);
                break;

            case 5:
                double p=(double) x-y;
                System.out.println("The subtraction of num1 and num2  is " + p);
                break;
            case 0:

                System.out.println("you are out of calculator " );
                break;
            default:
                System.out.println("bye!" );
        }




    }
}