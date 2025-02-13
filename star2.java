public class star2 {
    public static void main(String[] args) {
        int n = 4; 

        for (int i = 1; i <= n; i++) {
            
            for (int k = i; k < n; k++) {
                System.out.print(" ");
            }
            
            for (int j = 1; j <= (2 * i - 1); j++) 
            {
                if (i == n || j==1|| j==(2*i-1)) {
                    System.out.print("*");
                } else {
                    System.out.print("0");
                }
            }
        
            System.out.println();
        }
    }
}
