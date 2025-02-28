import java.util.Scanner;

public class Consecutive {

    public static boolean isPronic(int num) {
        for (int i = 0; i * (i + 1) <= num; i++) {
            if (i * (i + 1) == num) {
                return true;
            }
        }
        return false;
    }

    public static boolean isAbundant(int num) {
        int sum = 0;
        for (int i = 1; i <= num / 2; i++) {
            if (num % i == 0) {
                sum += i;
            }
        }
        return sum > num;
    }

    public static boolean isNiven(int num) {
        int sum = 0, temp = num;
        while (temp > 0) {
            sum += temp % 10;
            temp /= 10;
        }
        return num % sum == 0;
    }

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.print("Enter a number: ");
        int num = scanner.nextInt();
        scanner.close();

        System.out.println("The number " + num + " is:");
        if (isPronic(num)) System.out.println("- Pronic Number");
        if (isAbundant(num)) System.out.println("- Abundant Number");
        if (isNiven(num)) System.out.println("- Niven (Harshad) Number");

        if (!isPronic(num) && !isAbundant(num) && !isNiven(num)) {
            System.out.println("- None of the above");
        }
    }
}
