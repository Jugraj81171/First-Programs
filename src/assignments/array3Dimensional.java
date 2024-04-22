package assignments;
/*
add two 3x3 arrays
int[][] array1= {{54,12,4}, {2,36,40}, {6,4,5}} int[][] array2 = {{2,9,40}, {5,3,6}, {3,5,12}}
*/

public class array3Dimensional {

    public static void main(String[] args) {
        int[][] array1= {{54,12,4}, {2,36,40}, {6,4,5}};
        int[][] array2 = {{2,9,40}, {5,3,6}, {3,5,12}};
        int[][] array3=new int[3][3];
        for(int i=0;i<array1.length;i++)
        {
            for (int j=0;j<array1[0].length;j++)
            {

                array3[i][j]=array1[i][j]+array2[i][j];
            }
        }
        System.out.print("addition of this array will be:{");
        for(int x=0;x<array3.length;x++)
        {
            System.out.print("{");
            for(int y=0;y<array3[x].length;y++)
            {
                System.out.print(array3[x][y]+",");
            }
            System.out.print("}");
        }
        System.out.print("}");

    }

}
