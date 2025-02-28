public class HarshadNumbersRange {
    public static void main(String[] args) {
        System.out.println("Harshad numbers between 500 and 2500:");
        
        for (int num = 500; num <= 2500; num++) {
            if (isHarshad(num)) {
                System.out.print(num + " ");
            }
        }
    }

    public static boolean isHarshad(int num) {
        int sum = 0, temp = num;

        while (temp > 0) {
            sum += temp % 10; 
            temp /= 10; 
        }

        return num % sum == 0; 
    }
}
