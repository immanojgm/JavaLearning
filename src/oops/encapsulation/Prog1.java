package oops.encapsulation;


//Encapsulation


public class Prog1
{
    public static void main(String[] args)
    {
        BankAccount ba = new BankAccount();
        ba.deposite(1000);
        System.out.println(ba.getBalance());
        ba.withdraw(200);
        System.out.println(ba.getBalance());
    }
}


class BankAccount
{
    private double balance;

    public void deposite(int amt)
    {
        balance+=amt;
    }

    public void withdraw(int amt)
    {
        balance-=amt;
    }

    public double getBalance()
    {
        return balance;
    }
}