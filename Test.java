package BufferedRead;

import java.io.*;
class Test 
{
    public static void main(String[] args)throws Exception
    {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        System.out.println("Enter User Name : ");

        String str = br.readLine();
        System.out.println("User Name is "+str);

        
    }
    
}
