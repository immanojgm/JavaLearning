package arrays;

import java.util.Scanner;

public class Prog1
{
    public static void main(String[] args)
    {
        int[] arr=new int[3];
        Scanner sc =new Scanner(System.in);
        System.out.println("enter elements of array");
        for (int i=0;i<arr.length;i++)
        {
            System.out.println("array element at position at " + i);
            arr[i]=sc.nextInt();

        }
        System.out.println("Array elements are ");
        for (int j=0;j<arr.length;j++)
        {
            System.out.print(arr[j]+ " ");
        }
    }
}
