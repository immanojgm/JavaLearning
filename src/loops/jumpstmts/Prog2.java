package loops.jumpstmts;

import java.util.Scanner;

public class Prog2
{
    public static void main(String[] args)
    {
        System.out.println("enter number to check whether it is prime or not");
        Scanner sc=new Scanner(System.in);
        int i=sc.nextInt();
        int j;
        for (j=2;j<i;j++)
        {
            if (i%j==0)
            {
                System.out.println(i + " is not a prime number");
                break;
            }


        }
        if(j==i) {
            System.out.println(i + " is a prime number");
        }

    }
}
