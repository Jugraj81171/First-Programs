import java.util.Scanner;
import java.util.*;
public class practice1 {
    public static void main (String[] args){
        Scanner scanner = new Scanner(System.in);
        System.out.println("Enter any character");
        char x = scanner.next().charAt(0);

        if ( x=='a' || x== 'e' || x== 'i'||x=='o'||x=='u' || x=='A' || x== 'E' || x== 'I'||x=='O'||x=='U')
        {
            System.out.println("Entered character is a constant") ;
        }
        else
            System.out.println("Entered character is a variable") ;

    }

}
