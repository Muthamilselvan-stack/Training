public class MatrixTranspose {
    public static void main(String[] args) {
      
        int[][] matrix1 = {
            {1, 2, 3},
            {4, 5, 6},
            {7, 8, 9}
        };

        System.out.println("Original Matrix:");
        displayMatrix(matrix1);

        int[][] transpose = new int[3][3];
        for (int i = 0; i < 3; i++) {
            for (int j = 0; j < 3; j++) {
                transpose[j][i] = matrix1[i][j];
            }
        }

        System.out.println("Transposed Matrix:");
        displayMatrix(transpose);
    }

    public static void displayMatrix(int[][] matrix1) {
        for (int[] row : matrix1) {
            for (int element : row) {
                System.out.print(element + " ");
            }
            System.out.println();
        }
    }
}
