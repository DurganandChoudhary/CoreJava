//Assignment 3
public class Student1 
{
    static String sname = "Rahul";
    int sroll = 111;
    static double smark = 99.99;
    char sgender = 'M';

    void studentDetails()
    {
        int sId = 007;

        System.out.println("Student name = "+sname);
        System.out.println("Student Roll No : "+sroll);
        System.out.println("Marks = "+smark);
        System.out.println("Gender = "+sgender);
        System.out.println("Student ID = "+sId);

    }
    static void getDetails()
    {
        System.out.println("********************************");

        Student1 s = new Student1();
        System.out.println("Name = "+sname);
        System.out.println("Roll = "+s.sroll);
        System.out.println("Marks = "+smark);
        System.out.println("Gender = "+s.sgender);
    }
    public static void main(String[] args) 
    {
        Student1 s = new Student1();
        s.studentDetails();
        Student1.getDetails();
        
    }
    
}
