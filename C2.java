package Condition;

import java.util.Scanner;

public class C2 {
    public static void main(String[] args) {
        
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter Length :");
        int l = sc.nextInt();
        System.out.println("Enter Bredth : ");
        int b = sc.nextInt();

        if(l==b)
        {
            System.out.println("Square");
        }
        else{
            System.out.println("Rectangle");
        }
        
    }
    
}
