package assignments;

import java.util.Scanner;

/*number[] = 10,30,43,54,23,543,43,32
Reverse the array
find the maximum element
find the second maximum*/
public class ReverseArray {

    private int[] number;

    public void reverse(int [] number)
    {
        this.number = number;
        for (int i = 0,j=number.length-1;i<=number.length/2;i++,j--)
        {

            int temp=number[j];
            number[j]=number[i];
            number[i]=temp;


        }
        System.out.print("Reversed array will be :{");
        for (int k=0;k<number.length;k++)
        {
        System.out.print(number[k]);
        System.out.print(",");

        }
        System.out.print("}");
        System.out.println();
    }
    public void maximum(int[] number)
    {
        this.number=number;
        int max=0;
        for (int i=0;i<number.length;i++)
        {


            if(number[i]>max){
                max= number[i];
            }

        }
        System.out.println("Maximum number of this array is :"+max);
    }
    public void minimum(int[] number) {
        this.number = number;

        int min = number[0];

        for (int i=0;i<number.length;i++) {
            if (min >number[i]) {
                min = number[i];
            }
        }
        System.out.println("Miniumum number of this array is:"+min);
    }
    public void secondMaximum(int[] number)
    {
        this.number=number;



        for (int i=0;i<number.length;i++)
        {
            for(int j= i+1;j<number.length;j++)

            {
                if (number[j]>number[i])
                {
                    int temp = number[j];
                    number[j]=number[i];
                    number[i]=temp;
                }
            }

        }

        System.out.println("Second Maximum number of this array is :"+number[1]);
    }
public void secondMinimum(int[] number)

{
    this.number=number;
    for (int i=0;i<number.length;i++)
    {
        for (int j=i+1;j<number.length;j++)
        {
            if (number[j]<number[i])
            {
                int temp =number[j];
                number[j]=number[i];
                number[i]=temp;

            }
        }
    }
    System.out.println("Second Minimum number of this array is:"+number[1]);
}
public void sumOfArray(int[] number)
{
    this.number=number;
    int sum=0;
    for(int i=0;i<number.length;i++)
    {
        sum = sum+number[i];

    }
    System.out.println("Sum of this Array is:"+sum);
}
public void averageOfArray(int[] number)
{
    this.number= number;

    int sum=0;

    for (int i=0;i<number.length;i++)
    {
        sum =sum+number[i];

    }
   int  average= sum/number.length;
    System.out.println("Average of this array is:"+average);
}
public void sortTheArray(int[] number)
{
    this.number=number;
    for(int i=0;i<number.length;i++)
    {
       for(int j=i+1;j<number.length;j++)
       {
           if(number[j]<number[i])
           {
                int temp=number[j];
                number[i]=number[i];
                number[i]=temp;
           }
       }
    }
    System.out.print("Sorted Array will be :{");
    for (int k=0;k<number.length;k++)
    {
        System.out.print(number[k]);
        System.out.print(",");
    }
    System.out.println("}");
}

    public static void main(String[] args)

    {
        Scanner scanner=new Scanner(System.in);
        System.out.println("Please Enter the length of the array you want to create: ");
        int n=scanner.nextInt();
        int[] number=new int[n];
        System.out.println("Please Enter the elements of the array");

        for (int j=0;j<n;j++)
           {
               number[j]=scanner.nextInt();
           }

        System.out.print("The given array is :{");
        for(int i=0;i<n;i++)
        {
            System.out.print(number[i]);
            System.out.print(",");

        }
        System.out.print("}");
        System.out.println();
        ReverseArray rev = new ReverseArray();
        rev.reverse(number);
        rev.maximum(number);
        rev.minimum(number);
        rev.secondMaximum(number);
        rev.secondMinimum(number);
        rev.sumOfArray(number);
        rev.averageOfArray(number);
        rev.sortTheArray(number);

    }
}
