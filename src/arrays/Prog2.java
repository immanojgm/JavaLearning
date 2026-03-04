package arrays;

public class Prog2
{
    public static void main(String[] args)
    {
        int[] arr = new int[5];
        int a=100;
        for (int i=0;i<arr.length;i++)
        {
            arr[i]=a;
            a+=2;

        }

        System.out.println("Array elements are");
        for (int j=0;j<arr.length;j++)
        {
            System.out.println(arr[j] + " ");
        }

        System.out.println("reverse of array elements");

            for (int k=arr.length-1;k>=0;k--)
            {
                System.out.println(arr[k] + " ");
            }



    }
}
