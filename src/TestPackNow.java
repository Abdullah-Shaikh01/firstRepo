import MyPackage.Demo;

public class TestPackNow {
    public static void main(String[] args) {
        Demo d = new Demo();
        Demo.main(args);
        System.out.println("Sum of 2 and 3 is "+d.add(2,3));
        System.out.println("Difference of 2 and 3 is "+d.subtract(2,3));
        System.out.println("Product of 2 and 3 is "+d.product(2,3));
        System.out.println("Quotient of divison of 6 by 3 is "+d.divide(6,3));
        System.out.println("Remainder of divison of 6 by 3 is "+d.modulo(6,3));
    }
}
