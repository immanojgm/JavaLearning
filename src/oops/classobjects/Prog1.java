package oops.classobjects;

public class Prog1
{



    public static void main(String[] args)
    {
        Student std=new Student();
        Student std2=new Student();

        std.name="Manoj G M";
        std.age=25;
        std.rollNo=101;
        std.college="BIET";

        std2.name="akhil";
        std2.age=25;
        std2.rollNo=102;
        std2.college="BIET";


        System.out.println(std.name);
        System.out.println(std.age);
        System.out.println(std.rollNo);
        System.out.println(std.college);

        std.matkAttendence();
        System.out.println();


        System.out.println(std2.name);
        System.out.println(std2.age);
        System.out.println(std2.rollNo);
        System.out.println(std2.college);
        std2.matkAttendence();
    }
}

class Student
{
    String name;
    int age;
    int rollNo;
    String college;

    void matkAttendence()
    {
        System.out.println("Attendence marked by " +name);
    }
}
