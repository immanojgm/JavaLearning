package arrays.TwoDArray;

import java.util.*;

public class Prog1
{
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int[][] arr=new int[3][3];
       // int num;
        for(int i=0;i< arr.length;i++)
        {
            for (int j=0;j< arr[i].length;j++)
            {
                System.out.println("enter element for row " + i +" and column " +j);
              int num=sc.nextInt();
              arr[i][j]=num;
            }
        }

        System.out.println("Array elements are:");
        for(int i=0;i<arr.length;i++)
        {
            for (int j=0;j< arr[i].length;j++)
            {
                System.out.print(arr[i][j] + " ");
            }
            System.out.println();
        }
    }
}
