package aprill_13;

public class array_reverse {
    public static void main(String[] args) {
        int[] arr ={10,20,30,40,50,60,70};

        for (int i=0,j= arr.length-1;i<(arr.length)/2;i++,j--)
        {

          int temp= arr[j];
          arr[j]=  arr[i];
            arr[i]=temp;




        }
        for (int k=0;k<arr.length;k++) {
            System.out.println(arr[k]);
        }
    }
}
