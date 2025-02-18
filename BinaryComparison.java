public class BinaryComparison {
    public static void main(String[] args) {
        int[] a = {1, 1, 0, 1, 1, 0};
        int[] b = {1, 1, 0, 1, 1, 0};
        int count = 0;
        if (a.length == b.length) {
            for (int i = 0; i < a.length; i++) {
                if (a[i] == b[i]) {
                    count++;
                }
            }
            if (count == a.length) {
                System.out.println("Yes");
            } else {
                System.out.println("No");
            }
        } else {
            System.out.println(" ");
        }
    }
}
