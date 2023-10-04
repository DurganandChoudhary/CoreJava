package Condition;

import java.util.Scanner;

public class c5 {
    public static void main(String[] args) {
        int bonus;
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter salary: ");
        int salary =sc.nextInt();
        System.out.println("Enter years: ");
        int years = sc.nextInt();

        if(years>5)
        {
            bonus =salary*5/100;
            System.out.println("Bonus ="+bonus);
        }
        else
        {
            
            System.out.println("No bonus");
        }
       
    }
    
}
