package BufferedRead;

public class ReadUserNamePassword 
{
    public static void main(String[] args) 
    {
        java.io.Console c = System.console();

        System.out.println("Enter User Name : ");
        String uname = c.readLine();

        System.out.println("Enter Password : ");
        char[] ch = c.readPassword();

        String pwd = String.valueOf(ch);

        System.out.println("Enter your job");
        String job = c.readLine();

        System.out.println("User Name is :"+uname);
        System.out.println("Password is : "+pwd);
        c.printf("My Job is : %\n",job);

        
    }
    
}
