import java.util.Scanner;

public class assignment1_3 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Enter the grades of the student");
        int grades = scanner.nextInt();
        if ((grades <= 100) && (grades >= 90)) {

            System.out.println("grade = A");

        } else if ((grades <= 89) && (grades >= 80)) {

            System.out.println("grade = B");

        } else if ((grades <= 79) && (grades >= 70)) {

            System.out.println("grade = C");

        } else if ((grades <= 69) && (grades >= 60)) {

            System.out.println("grade = D");

        } else if ((grades <= 59) && (grades >= 0)) {

            System.out.println("grade = Fail");

        } else {
            System.out.println("Entered grades is invalid. Try Again !");
        }

    }
}
