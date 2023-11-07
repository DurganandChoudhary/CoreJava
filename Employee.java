package BufferedRead;

// import java.io.BufferedReader;
// import java.io.IOException;
// import java.io.InputStreamReader;

public class Employee {
    public static void main(String[] args) throws Exception 
    {

        // java.io.BufferedReader br = new java.io.BufferedReader(new java.io.InputStreamReader(System.in));

        java.io.InputStreamReader isr = new java.io.InputStreamReader(System.in);

        java.io.BufferedReader br = new java.io.BufferedReader(isr);

        System.out.println("Enter employee name ");
        String ename = br.readLine();

        System.out.println("Employee Number : ");
        int empno = Integer.parseInt(br.readLine());

        System.out.println("Employee name is : " + ename);
        System.out.println("Employee number is : " + empno);

    }
}
