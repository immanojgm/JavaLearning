package arrays.TwoDArray;

import java.util.*;

public class Prog2
{
    public static void main(String[] args)
    {
        int[][] arr=new int[3][];
        arr[0]=new int[3];
        arr[1]=new int[5];
        arr[2]=new int[4];

        Scanner sc= new Scanner(System.in);
        int num;

        for (int row=0;row<arr.length;row++)
        {
            for(int col=0;col<arr[row].length;col++)
            {
                System.out.println("enter element for row " + row + " and column " +col);
                num=sc.nextInt();
                arr[row][col]=num;
            }
        }

        System.out.println("your array elements are");
        for (int row=0;row<arr.length;row++)
        {
            for(int col=0;col<arr[row].length;col++)
            {

                System.out.print(arr[row][col] + " ");
            }
            System.out.println();
        }
    }
}
