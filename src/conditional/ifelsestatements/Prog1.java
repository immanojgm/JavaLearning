package conditional.ifelsestatements;

import java.util.Scanner;

public class Prog1 {
    public static void main(String[] args) {
        int i;
        System.out.println("enter any positive numbers");
        Scanner sc= new Scanner(System.in);
        i=sc.nextInt();

        Demo d = new Demo();
        d.fun(i);

    }
}


class Demo {
    void fun(int a) {

            if (a > 0) {
                System.out.println(a + " is positive number");
            } else {
                System.out.println(a + " 4is a zero");
            }
        }
    }

