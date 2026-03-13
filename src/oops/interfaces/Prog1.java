package oops.interfaces;

public class Prog1
{
    public static void main(String[] args)
    {
        Car c1=new ElectricCar();
        c1.start();
        c1.accelerate();
        c1.break1();

    }
}

 interface Car
{
    void start();
    void accelerate();
    void break1();
}


class FuelCar implements Car
{
    @Override
    public void start()
    {
        System.out.println("key inserted and car started");
    }
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


class ElectricCar implements Car
{
    @Override
    public void start()
    {
        System.out.println("key inserted and car started");
    }
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