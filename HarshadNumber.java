import java.util.Scanner;

public class HarshadNumber {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.print("Enter a number: ");
        int num = scanner.nextInt();
        scanner.close();
        int sum = 0, temp = num;

        while (temp > 0) {
            sum += temp % 10; 
            temp /= 10; 
        }

        if (num % sum == 0) {
            System.out.println(num + " is a Harshad Number.");
        } else {
            System.out.println(num + " is NOT a Harshad Number.");
        }
    }
}
