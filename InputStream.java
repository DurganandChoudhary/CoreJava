package BufferedRead;

import java.io.BufferedReader;
import java.io.InputStreamReader;

public class InputStream 
{
    public static void main(String[] args)throws Exception
    {
        InputStreamReader str = new InputStreamReader(System.in);
        BufferedReader br = new BufferedReader(str);
        System.out.println("Enter your name : ");
        String str1 = br.readLine();
        
    }
    
}
