public class EvenNumberdecending{
    public static void main(String[] args) {
        int n = 6;
        System.out.println("Even numbers from 1 to " + n + ":");

       for (int i = n; i >= 2; i--) {
            if (i % 2 == 0) {
         System.out.println(i); 
            }
        }
    }
}
