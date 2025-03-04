import java.util.Scanner;

public class Extractor {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.print("Enter the original string: ");
        String input = scanner.nextLine();
        StringBuilder builder = new StringBuilder(input);
        StringBuffer buffer = new StringBuffer(input);
        System.out.print("Enter the starting index: ");
        int start = scanner.nextInt();
        System.out.print("Enter the ending index: ");
        int end = scanner.nextInt();
        if(start>=0 && end<=input.length() && start<end)
        {
            String fromBuilder = builder.substring(start, end);
            String fromBuffer = buffer.substring(start, end);
            System.out.println("\nExtracted Substring from StringBuilder: " + fromBuilder);
            System.out.println("Extracted Substring from StringBuffer: " + fromBuffer);
        } 
        else 
        {
            System.out.println("Invalid");
        }
        scanner.close();
    }
}
