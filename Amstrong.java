import java.util.Scanner;

public class Amstrong {
    public static void main(String[] args) {
        
        int num1,num2,s;
        Scanner sc=new Scanner(System.in);
        System.out.println("Enter a number....");
        int a=sc.nextInt();
        num2=a;
        num1=0;

        while(a!=0)
        {
            s=a%10;
            num1+=(s*s*s);
            a=a/10;
        }
        if(num1==num2)
        System.out.println("Amstrong Number...");
        else
        System.out.println("Not a Amstrong Number.....");
    }
    
}
