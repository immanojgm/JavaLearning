package oops.constructors;

public class Prog1
{
    public static void main(String[] args)
    {
        Students s1 = new Students();

        System.out.println(s1.college);
        System.out.println(s1.age);
        System.out.println(s1.rollNo);
        System.out.println(s1.name);

        Students s2=new Students(25,102,"Akhil","BIET");


        System.out.println(s2.college);
        System.out.println(s2.age);
        System.out.println(s2.rollNo);
        System.out.println(s2.name);



    }
}


class Students
{
    String name;
    int age;
    int rollNo;
    String college;

    Students()
    {
        name="Manoj G M";
        age=25;
        rollNo=101;
        college="BIET";
    }

    Students(int a,int rN,String n,String c)   // constructor overloading
    {
        name=n;
        age=a;
        rollNo=rN;
        college=c;
    }

}