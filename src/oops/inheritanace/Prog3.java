package oops.inheritanace;


// SUPER KEYWORD

public class Prog3
{
    public static void main(String[] args)
    {
//        Student3 s3 =new Student3();
//        s3.rollNum=102;
//        s3.age=25;
//        s3.name="Manoj G M";
//        s3.print();

        MyCollege c=new MyCollege("Manoj G M",25,101,"BIET");
//        c.rollNum=102;
//        c.age=25;
//        c.name="Manoj G M";
//        c.college="BIET";

        c.print();

    }
}


class Student3
{
    String name;
    int age;
    int rollNum;

    Student3(int age,int rollNum,String name)
    {
        this.name=name;
        this.age=age;
        this.rollNum=rollNum;
    }

    void print()
    {
        System.out.println(name+","+age+","+rollNum);
    }
}

class MyCollege extends Student3
{
    String college;
    MyCollege(String name,int age,int rollNum,String college)
    {
        super(age,rollNum,name);
        this.college=college;
    }
    void print()
    {
        super.print();
        System.out.println(college);
    }
}