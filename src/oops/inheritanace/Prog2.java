package oops.inheritanace;

//TYPES OF INHERITANCE



public class Prog2
{
    public static void main(String[] args)
    {
        System.out.println();
//        Student1 s1 =new Student1();
//        s1.markAttendance("Manoj G M");
        //System.out.println();

//        EngStudent1 e1=new EngStudent1();
//        e1.engStudent();
//
//        CSEngineeringStudent c1=new CSEngineeringStudent();
//        c1.attendCSLab();

//         MedicalStudent m1=new MedicalStudent();
//         m1.medStudent();

        System.out.println();

        MedLab ml=new MedLab();
        ml.attendBotanyLab();

    }
}

class Student1
{
    String name;
    int age;


    public void markAttendance(String nm)
    {

        System.out.println("Attendance marked by " + nm);
    }

}

class EngStudent1 extends Student1          //Simple Inheritance
{                                           //this class also used in hierarchical inheritance
    public void engStudent()
    {
        System.out.println("he/she is a Engineering student");
    }
}

class CSEngineeringStudent extends EngStudent1          //multilevel Inheritance
{
    public void attendCSLab()
    {
        System.out.println("he/she attending CS Lab");
    }
}


class MedicalStudent extends Student1           //this class used in hierarchical inheritance
{
    public void medStudent()
    {
        System.out.println("he/she is a medical student");
    }
}

class MedLab extends MedicalStudent
{
    public void attendBotanyLab()
    {
        System.out.println("he/she attending Botany lab");
    }
}






