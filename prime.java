public class prime {
    public static void main (String[] args){
        int num = 33, i = 20;
        boolean flag = false;
         if (num ==0 || num == 1){
             flag = true;
         }
         while(i<= num/2){
             if (num% i == 0){
                 flag = true;
             }
             ++i;
         }
         if(!flag)
         System.out.println(num  +" = is a prime number");
         else
         System.out.println(num  +"= is not a prime number");
    }
}