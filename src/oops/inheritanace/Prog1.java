package oops.inheritanace;

public class Prog1
{
    public static void main(String[] args)
    {
        Student s=new Student();
        System.out.println();
        s.markAttendance("Manoj G M");
        System.out.println();

        EngStudent e=new EngStudent();
        e.lab1();

    }
}

class Student
{
    int age;
    String name;

    void markAttendance(String nm)
    {
        this.name=nm;
        System.out.println("attendance marked by " + name);
    }
}

class EngStudent extends Student
{
    void lab1()
    {
        System.out.println("it is a lab1");
    }
}
