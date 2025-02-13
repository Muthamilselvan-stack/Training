
   import java.util.Scanner;

public class armstrong {
    public static void main(String[] args) {
        
        Scanner scanner = new Scanner(System.in);
        System.out.print("Enter a number: ");
        int number = scanner.nextInt();

      
        int originalNumber = number;
        int numOfDigits = 0;
        while (number != 0) {
            number /= 10;
            numOfDigits++;
        }

        
        number = originalNumber;

        
        int sum = 0;
        while (number != 0) {
            int digit = number % 10;
            sum += Math.pow(digit, numOfDigits);
            number /= 10;
        }

        
        if (sum == originalNumber) {
            System.out.println(originalNumber + " is an Armstrong number.");
        } else {
            System.out.println(originalNumber + " is not an Armstrong number.");
        }

        scanner.close();
    }
}
