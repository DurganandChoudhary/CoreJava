public class Student 
{
    String sname = "Rahul";
    int sroll = 101;

    void m1()
    {
        System.out.println("Student name is "+sname);
        System.out.println("Student roll is "+sroll);
    }
    static void m2()
    {
        Student s = new Student();
        System.out.println("Student name = "+s.sname);
        System.out.println("Student roll = "+s.sroll);
    }
    public static void main(String[] args) 
    {
        Student s = new Student();
        s.m1();
        Student.m2();
        
    }
    
}
