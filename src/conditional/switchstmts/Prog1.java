package conditional.switchstmts;

import java.util.Scanner;

public class Prog1 {
    public static void main(String[] args)
    {
        int i;
        System.out.println("enter your choice");
        Scanner sc= new Scanner(System.in);
        i=sc.nextInt();
        Demo d=new Demo();
        d.fun(i);

    }
}


class Demo
{
    void fun(int a)
    {
        switch (a)
        {
            case 1:
                System.out.println("you have entered 1");
                break;

            case 2:
                System.out.println("you have entered 2");
                break;

            case 3:
                System.out.println("you have entered 3");
                break;

            case 4:
                System.out.println("you have entered 4");
                break;

            default:
                System.out.println("you have entered wrong number");
                break;

        }
    }
}