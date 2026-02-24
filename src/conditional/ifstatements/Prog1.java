package conditional.ifstatements;

public class Prog1 {
    public static void main(String[] args) {
        int i=100;

        Demo d=new Demo();
        d.fun(i);
        d.fun1(i);
    }
}


class Demo
{
    void fun(int a)
    {
        if(a==10)
        {
            System.out.println("condition passed");
        }

    }

    void fun1(int a)
    {
        if((a%2) == 0)
        {
            System.out.println("Number is even");
        }
    }

}