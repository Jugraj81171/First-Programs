import java.util.Scanner;

public class assignment1_1 {
    public static void main (String[] args){
        Scanner scanner = new Scanner(System.in);
        System.out.println("Choose an option from below:\n1. Press 1 for Red light\n2.Press 2 for yellow light\n3.Press 3 for Green light");

        int input = scanner.nextInt();
        switch(input){
            case(1):
                System.out.println("STOP");
            break;

            case 2:
                System.out.println("READY");
            break;
            case 3:
                System.out.println("GO");
            break;
            default:
                System.out.println("Not a valid entry!");

        }

    }

}
