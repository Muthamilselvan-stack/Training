public class primenumber1 {
    public static void main(String[] args) {
        System.out.println("Prime numbers between 1 and 1000 are:");
        
       
        for (int num = 2; num <= 1000; num++) {
            boolean isPrime = true;
            
           
            for (int i = 2; i <= num / 2; i++) {
                if (num % i == 0) {
                    isPrime = false;
                    break;
                }
            }
            
            
            if (isPrime) {
                System.out.println(num);
            }
        }
    }
}
