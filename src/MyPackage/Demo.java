
package MyPackage;

public class Demo{
    public int product(int a,int b)
    {
        return a*b;
    }
    public int add(int a,int b)
    {
        return a+b;
    }
    public int subtract(int a,int b)
    {
        return a-b;
    }
    public int divide(int a,int b)
    {
        return a/b;
    }
    public int modulo(int a,int b)
    {
        return a%b;
    }
    
    public static void main(String[] args) {
        Demo d = new Demo();
        System.out.println("\tCaclulator");
    }
}