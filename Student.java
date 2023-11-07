package BufferedRead;

public class Student 
{
    public static void main(String[] args) throws Exception
    {
        
        java.io.DataInputStream dis = new java.io.DataInputStream(System.in);

        System.out.println("Enter Student Name : ");
        String sname=dis.readLine();
        System.out.println("Student Name is "+sname);

    }
    
}
