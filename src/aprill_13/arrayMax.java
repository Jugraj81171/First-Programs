package aprill_13;

public class arrayMax
{
    public static void main(String[] args)
    {
        int max =0;
        int[] arr = {10,20,30,40,50};
        for(int i=0;i<arr.length;i++)
        {
            if(arr[i]>max)
            {
                max=arr[i];
            }

        }
        System.out.println("maximum :"+max);
    }
}
