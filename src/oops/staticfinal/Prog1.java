package oops.staticfinal;


//static keyword
public class Prog1
{
    public static void main(String[] args)
    {
Student s1=new Student("Manoj",25,101);
Student s2=new Student("Naveen",25,102);
        System.out.println(s1.name);
        System.out.println(s2.name);
        //System.out.println(s1.college);
        System.out.println(Student.college);
    }
}


class Student
{
    int rollNumber;
    int age;
    String name;
    static String college="BIET";

    Student(String name,int age, int rollNumber)
    {
        this.age=age;
        this.rollNumber=rollNumber;
        this.name=name;
    }


}