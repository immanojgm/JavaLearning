package functios.examples;

public class Prog2 {


    public static void main(String[] args) {
        int a = 12, b = 34;
//        Prog2 prg=new Prog2();

        //fun();
        //myName("manoj");
        //sum(a, b);
        int x= num();
        System.out.println(x);


    }

    static void sum(int a, int b)     //  I/P , O/P
    {
        int c = a + b;
        System.out.println("sum=" + c);
    }

    static void myName(String name)   //   I/P , NO O/P
    {
        System.out.println("hello " + name);
    }

    static int num()                //     NO I/P , O/P
    {
        return 10;
    }

    static void fun()               //   NO I/P  ,  NO O/P
    {
        System.out.println("hello");
    }

}
