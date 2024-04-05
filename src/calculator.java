import java.util.Scanner;

import static com.sun.xml.internal.bind.v2.schemagen.Util.equalsIgnoreCase;

public class calculator {
    public static <string> void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        double result;
       char customer_response;



        do {
            System.out.println("***********welcome to my minni calculator*********\n1. Press 1 for addition\n2.Press 2 for multiplication\n3.Press 3 for subtraction\n4.Press 4 for divison");
            int choice = scanner.nextInt();
            System.out.println("Enter first number please");
           int num1 = scanner.nextInt();
            System.out.println("Enter second number please");
            int num2 = scanner.nextInt();
            if (choice == 1) {

                result = num1 + num2;
                System.out.println("Addition of " + num1 + " and " + num2 + " is" + result);

            } else if (choice == 2) {
                result = num1 * num2;
                System.out.println("multiplication of " + num1 + " and " + num2 + " is" + result);

            } else if (choice == 3) {
                result = num1 - num2;
                System.out.println("Subtraction of " + num1 + " and " + num2 + " is" + result);

            } else if (choice == 4) {
                result = (double)num1 / num2;
                System.out.println("Division of " + num1 + " and " + num2 + " is" + result);

            } else {
                System.out.println("Input is not valid ! Try Again");
            }
            System.out.println("Do you want to continue Type (Y|N)");
            customer_response = scanner.next().charAt(0);


        } while (customer_response != 'N');
        System.out.println("Thanks!");
    }
}
