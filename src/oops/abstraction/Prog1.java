package oops.abstraction;

public class Prog1
{
    public static void main(String[] args)
    {
        System.out.println();
        Car c=new ElectricCar();
        c.start();
        c.accelerate();
        c.break1();
        System.out.println();
        Car c1=new FuelCar();
        c1.start();
        c1.accelerate();
        c1.break1();

    }
}

abstract class Car
{
    void start()
    {
        System.out.println("key inserted and car started");
    }

    abstract void accelerate();
    abstract void break1();
}


class FuelCar extends Car
{
    @Override
    public void accelerate()
    {
        System.out.println("Accelerator is applied in Fuel Car");
    }

    @Override
    public void break1()
    {
        System.out.println("Break applied in Fuel Car");
    }

}


class ElectricCar extends Car
{
    @Override
    public void accelerate()
    {
        System.out.println("Accelerator is applied in Electric Car");
    }

    @Override
    public void break1()
    {
        System.out.println("Break applied in Electric Car");
    }

}