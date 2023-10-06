//Assignment 1
public class Test1 {

    static int x = 111;
    static int y = 222;

    static void m1()
    {
        System.out.println(x+"..."+y);
        System.out.println(Test1.x+"..."+Test1.y);
        Test1 t = new Test1();
        System.out.println(t.x+"..."+t.y); 
    }
    public static void main(String[] args)
    {
        Test1.m1();        
    }
    
}
