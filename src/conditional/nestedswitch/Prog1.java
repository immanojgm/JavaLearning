package conditional.nestedswitch;

import java.util.Scanner;

public class Prog1
{
    public static void main(String[] args) {
        int i;
        System.out.println("enter your choice");
        Scanner sc=new Scanner(System.in);
        i=sc.nextInt();

        switch (i)
        {
            case 1:
            {
                System.out.println("enter your choice inner switch for case 1");
                int j=sc.nextInt();
                switch (j)
                {
                    case 1:
                        System.out.println("you have entered inner switch as 1");
                        break;

                    case 2:
                        System.out.println("you have entered inner switch as 2");
                        break;

                    default :
                        System.out.println("you have entered wrong inner switch choice");
                        break;


                }

            }

            case 2:
            {
                System.out.println("enter your choice inner switch for case 2");
                int k=sc.nextInt();
                switch (k)
                {
                    case 1:
                        System.out.println("you have entered inner switch as 1");
                        break;

                    case 2:
                        System.out.println("you have entered inner switch as 2");
                        break;

                    default :
                        System.out.println("you have entered wrong inner switch choice");
                        break;

                }
            }

            default:
                System.out.println("you have entered wrong choice");
                break;
        }

    }
}
