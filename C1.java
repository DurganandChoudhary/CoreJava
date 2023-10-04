package Condition;

public class C1 {
    public static void main(String[] args) {
        /*Syntax of if statement
         
          if(boolean expression T or F)
          {
             //body
         }
          else{
          //do this
          }
        */
       /*  
        int salary = 30000;
        if(salary>10000)
        {
            salary = salary + 2000;
        }
        else
        {
            salary=salary+1000;
            
        }
        System.out.println(salary);

        */

        int salary = 25000;
        if(salary>5000 && salary<10000)
        {
            salary += 1000;
        }
        else if(salary>10000 && salary<15000)
        {
            salary += 2000;
        }
        else if(salary>15000 && salary <=25000)
        {
            salary += 3000;
        }
        else
        {
            salary += 4000;
        }
        System.out.println(salary);



    }
    
}