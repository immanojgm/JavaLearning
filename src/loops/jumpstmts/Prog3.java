package loops.jumpstmts;

public class Prog3
{
    public static void main(String[] args) {
        int i;

        System.out.println("Printing ODD NUMBERS from 1 to 10");
        for (i = 1; i <= 10; i++)
        {
            if (i%2==0) {
                continue;//go to next iteration and don't execute below code of line until condition becomes false
            }
            System.out.println(i);
        }

        System.out.println("Printing EVEn NUMBERS from 1 to 10");
        for (i=1;i<=10;i++)
        {
            if (i%2!=0)
            {
                continue;
            }
            System.out.println(i);
        }
    }
}
