public class ReversePairs {
    public static void main(String[] args) {
        int[] input = {1, 2, 3, 4, 5, 6};
        int n = 3;
        reverseChunks(input, n);
        for (int num : input) {
            System.out.print(num + " ");
        }
    }

    public static void reverseChunks(int[] array, int n) {
        for (int i = 0; i < array.length; i += n) {
            int left = i;
            int right = Math.min(i + n - 1, array.length - 1);
            while (left < right) {
                int temp = array[left];
                array[left] = array[right];
                array[right] = temp;
                left++;
                right--;
            }
        }
    }
}


