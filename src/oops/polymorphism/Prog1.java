package oops.polymorphism;

public class Prog1
{
    public static void main(String[] args)
    {
        System.out.println();
        Addition a=new Addition();
        int Sum=a.Add(10,20);
        int Add=a.Add(10,20,30);
        System.out.println("sum of two numbers is "+ Sum);
        System.out.println("sum of three numbers is "+ Add );
        System.out.println();
        Animal a1=new Cat();
        Animal b1=new Dog();
        a1.run();
        b1.run();

    }
}

class Addition
{
    public int Add(int a,int b)         //method overloading
    {
        return (a+b);
    }

    public int Add(int a,int b,int c)       //method overloading
    {
        return (a+b+c);
    }
}


abstract class Animal
{
    abstract void run();
}

class Dog extends Animal
{
    @Override
    public void run()           //method overriding
    {
        System.out.println("Dog is running");
    }
}

class Cat extends Animal
{
    public void run()       //method overriding
    {
        System.out.println("cat is running");
    }

}
