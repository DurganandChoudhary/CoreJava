package Condition;

import java.util.Scanner;

public class c4 {
    public static void main(String[] args) {
        
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter quantity : ");
        int q=sc.nextInt();

        if((q*100)>1000)
        {
            System.out.println("You get a discount of "+(0.1*q*100)+" and your total cost is "+(q*100-(0.1*q*100)));
        }
        else{
            System.out.println("No Discount");
        }
    }
    
}
