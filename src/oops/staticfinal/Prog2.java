package oops.staticfinal;

public class Prog2
{
    public static void main(String[] args)
    {
        final int X;
        X=10;
        final int Y=20;
        System.out.println(X);
        System.out.println(Y);
        Random r1=new Random();

        System.out.println(r1.PI);


    }
}

class Random
{
    final double PI;
    Random()
    {
        PI=3.14;
    }
}
