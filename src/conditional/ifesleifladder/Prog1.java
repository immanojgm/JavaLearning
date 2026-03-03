package conditional.ifesleifladder;

import java.util.Scanner;

public class Prog1
{
    public static void main(String[] args)
    {
        System.out.println("enter any positive number");
        Scanner sc=new Scanner(System.in);
        int i=sc.nextInt();
        if (i<0)
        {
            System.out.println("enter valid number");
        }
        else if(i==0)
        {
            System.out.println("number is 0");
        }
        else if (i>=1 && i<=10)
        {
            System.out.println("number is 10 or below 10");

        }
        else if (i>10 && i<=20)
        {
            System.out.println("number is 20 or below 20");

        }
        else if (i>20 && i<=30 )
        {
            System.out.println("number is 30 or below 30");
        }
        else if (i>30 && i<=40)
        {
            System.out.println("number is 40 or below 40");

        }
        else if (i>40 && i<=50)
        {
            System.out.println("number is 50 or below 50");

        }
        else
        {
            System.out.println("number is above 50");
        }
    }
}
