package functios.examples;

public class Prog1
{
    int a,b;
    Prog1(int m,int n)
    {
        this.a=m;
        this.b=n;
    }
    void sum()
        {
            int sum = a + b;
            System.out.println(sum);
        }


    public static void main(String[] args)
    {
        //int i=10,j=20;
        Prog1 prg=new Prog1(10,20);
        prg.sum();


    }
}
