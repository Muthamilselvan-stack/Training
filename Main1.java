import java.util.Scanner;

public class Main1 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int Age = scanner.nextInt();  
        scanner.nextLine();
        String date = scanner.nextLine();
        String Name = scanner.nextLine();
        System.out.println("Age is     : " + Age);
        System.out.println("Date is    : " + date);
        System.out.println("My Name is : " + Name);
      }
}
