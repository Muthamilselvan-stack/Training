import java.util.Scanner;

public class SumOfSeries {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

       
        System.out.print("Enter the number of terms: ");
        int n = scanner.nextInt();

        int term = 9; 
        int sum = 0;

        
        for (int i = 1; i <= n; i++) {
            sum += term; 
            System.out.print(term); 
            if (i < n) {
                System.out.print(" + "); 
            }
            term = term * 10 + 9; 
        }

        System.out.println("\nThe sum of the series is: " + sum);

        scanner.close();
    }
}
