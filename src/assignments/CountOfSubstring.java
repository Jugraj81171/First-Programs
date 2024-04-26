package assignments;

import java.util.Scanner;

/*Given a string, find the length of the longest substring without repeating characters*/
public class CountOfSubstring {
      public static void main(String[] args) {
            Scanner scanner = new Scanner(System.in);
            String s = scanner.nextLine(); //jagga
            int maxLength = 0;
            int[] arr = new int[256];

            int start = 0;

            for (int i = 0; i < s.length(); i++) {
                  char currentChar = s.charAt(i); // j, a, g
                  start = Math.max(start, arr[currentChar]); // 0, 1, 
                  maxLength = Math.max(maxLength, i - start + 1); // 1, 1
                  arr[currentChar] = i + 1; // 1, 2
            }

            System.out.println(maxLength);

      }
}
