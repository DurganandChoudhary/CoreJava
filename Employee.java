public class Employee {

    static String ename = "Raja";
    int empno = 101;
    double esalary = 1000;

    void empDetails(int empid)
    {
         String ejob = "Analyst";

        System.out.println("Employee name : "+Employee.ename);
        System.out.println("Employee Number is : "+empno);
        System.out.println("Employee salary is : "+esalary);
        System.out.println("Employee job is : "+ejob);
        System.out.println("Employee Id is : "+empid);
    }
    public static void main(String[] args) 
    {
        Employee emp =new Employee();
        emp.empDetails(101);
       
    }
    
}
