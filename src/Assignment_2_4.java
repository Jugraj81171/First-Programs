import java.util.Scanner;
/*Implement a Java program that takes a day of the week
as input and outputs whether it's a weekday or a weekend using a switch case.*/
public class Assignment_2_4 {
    public static void main (String[] args)
    {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Please enter the day of the week");
        String day = scanner.nextLine();
        String day2 = day.toLowerCase();
        switch(day2)
        {
            case "monday":
                System.out.println("It's a weekday");
                break;

            case "tuesday":
                System.out.println("It's a weekday");
                break;

            case "wednesday":
                System.out.println("It's a weekday");
                break;

            case "thursday":
                System.out.println("It's a weekday");
                break;

            case "friday":
                System.out.println("It's a weekday");
                break;

            case "saturday":
                System.out.println("It's weekend");
                break;

            case "sunday":
                System.out.println("It's weekend");
                break;

            default:
                System.out.println("Sorry Input is not valid!Try to give valid day");
                break;
        }


    }

}
