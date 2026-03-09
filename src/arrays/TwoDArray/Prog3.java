package arrays.TwoDArray;

public class Prog3
{
    public static void main(String[] args)
    {
        int [][] arr={{1,2,3},
                {1,2,3,4,5},
                {1,2,4,5,},
        };

        System.out.println("Array elements are");

        for(int row=0;row< arr.length;row++)
        {
            for(int col=0;col<arr[row].length;col++)
            {
                System.out.print(arr[row][col] + " ");
            }
            System.out.println();
        }

    }
}
