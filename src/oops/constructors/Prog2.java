package oops.constructors;

public class Prog2
{
    public static void main(String[] args)
    {
        Student s1=new Student();
        Student s2=new Student(25,"Manoj G M");
        Student s3=new Student(25,"Manoj G M","BIET");

        System.out.println(s1.college);
        System.out.println(s2.age);
        System.out.println(s3.name);

    }
}


class Student
{
    int rollNo;
    int age;
    String name;
    String college;


    Student()
    {
        rollNo=101;
        age=25;
        name="Manoj G M";
        college="BIET";
    }


    Student(int a,String n)
    {
        age=a;
        name=n;
    }

    Student(int age, String name, String college )
    {
        this.age=age;
        this.name=name;
        this.college=college;
    }

}