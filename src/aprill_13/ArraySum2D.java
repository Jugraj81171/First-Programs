package aprill_13;

import java.util.Scanner;

public class ArraySum2D {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int[][] arr= new int[3][3];
        int[][] arr2=new int [3][3];

        int[][] arr3 = new int[0][];
        for (int i=0;i<arr.length;i++){
            for (int j=0;j<arr.length;j++){

                arr3[i][j]=arr[i][j]+arr2[i][j];
            }
        }

    }
}
