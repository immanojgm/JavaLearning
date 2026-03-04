package constructor.parameterisedconstroctor;

public class Prog1
{
    public static void main(String[] args) {
//        int i;
//        String name;
//
        Bike b1=new Bike(10,"manoj");
        Bike b2=new Bike(15,"anuj");
        b1.display();
        b2.display();


    }
}

class Bike{
      int id;
      String name;
    Bike(int i,String n)
    {
        id=i;
        name=n;
    }

    void display()
    {
        System.out.println("ID= " + id + " NAME= " + name);
    }
}
