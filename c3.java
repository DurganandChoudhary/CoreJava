package Condition;

import java.util.Scanner;

public class c3 {
    public static void main(String[] args) {
        
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter x: ");
        int x = sc.nextInt();
        System.out.println("Enter y :");
        int y=sc.nextInt();

        if(x>y)
        {
            System.out.println("X is greater");
        }
        else if(y>x)
        {
            System.out.println("Y is greater");
        }
        else
        {
            System.out.println("Both are equal.");
        }
    }
    
}
