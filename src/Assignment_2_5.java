import java.util.Scanner;

/* Create a Java program that takes a numerical month input (1-12)
and outputs the corresponding month name using a switch case.*/
public class Assignment_2_5 {

        public static void main (String[] args)
        {
            Scanner scanner = new Scanner(System.in);
            System.out.println("Please enter the month of the year(1-12)");
            int month = scanner.nextInt();

            switch(month)
            {
                case 1:
                    System.out.println("Month of the year is January.");
                    break;

                case 2:
                    System.out.println("Month of the year is February.");
                    break;

                case 3:
                    System.out.println("Month of the year is March.");
                    break;

                case 4:
                    System.out.println("Month of the year is April.");
                    break;

                case 5:
                    System.out.println("Month of the year is May..");
                    break;

                case 6:
                    System.out.println("Month of the year is June.");
                    break;

                case 7:
                    System.out.println("Month of the year is July.");
                    break;
                case 8:
                    System.out.println("Month of the year is August.");
                    break;
                case 9:
                    System.out.println("Month of the year is September.");
                    break;
                case 10:
                    System.out.println("Month of the year is October.");
                    break;
                case 11:
                    System.out.println("Month of the year is Number.");
                    break;
                case 12:
                    System.out.println("Month of the year is December.");
                    break;
                default:
                    System.out.println("Sorry Input is not valid!Try to enter number between 1 to 12.");
                    break;
            }


        }

    }

