public class shortcircuit{
    public static void main(String[] args) {
        int a = 10;
        int b = 30;
        int c = 20;
        int max = (a>b)&(a>c) ?a:((b>c)? b:c);
        System.out.println("The maximum number is :"+max);
    }
}