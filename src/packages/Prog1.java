package packages;
import packages.college.Student;
import packages.school.Teacher;

//import packages.school.Student;
public class Prog1
{
    public static void main(String[] args)
    {
        Student s=new Student();
        s.print();

        packages.college.Teacher t=new packages.college.Teacher();
        t.print();

        System.out.println();

        packages.school.Student s1=new packages.school.Student();
        s1.print();

        Teacher t1=new Teacher();
        t1.print();

    }

}
