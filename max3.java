public class max3 {
    public static void main(String[] args) {
        int[] arr = {1, 2, 3, 4, 5};
        int temp = arr[0]; 

        for (int i = 1; i < arr.length; i++) {
            if (arr[i] > temp) {
                temp = arr[i];
            }
        }

        System.out.println("Maximum value: " + temp);
    }
}
