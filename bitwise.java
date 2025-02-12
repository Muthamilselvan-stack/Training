public class bitwise {
    public static void main(String[] args)
    {
        int a = 492;
        int b = 333;
        System.out.println("a&b = "+ (a & b));
        System.out.println("a|b = "+ (a | b));
        System.out.println("a^b = "+ (a ^ b));
        System.out.println("~a= "+ ~a);
        a &= b;
        System.out.println("a= " + a);
    }
}