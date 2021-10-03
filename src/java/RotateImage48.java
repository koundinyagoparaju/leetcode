import java.util.Arrays;

public class RotateImage48 {
    public static void main(String[] args) {
        int[][] matrix = new int[][] {new int[]{5, 1, 9, 11}, new int[]{2, 4, 8, 10}, new int[]{13, 3, 6, 7}, new int[]{15, 14, 12, 16}};
        rotate(matrix);
        System.out.println(Arrays.deepToString(matrix));;
    }
    private static void rotate(int[][] matrix) {
        for (int k = 0; k < Math.ceil(matrix.length / 2.0); k++) {
            rotateKthRing(matrix, k);
        }
    }

    private static void rotateKthRing(int[][] matrix, int k) {
        int numElementsToRotate = matrix.length - 2 * k - 1;
        for (int i = 0; i < numElementsToRotate; i++) {
            rotateIthElementInKthRing(matrix, k, i);
        }
        System.out.println(Arrays.deepToString(matrix));
    }

    private static void rotateIthElementInKthRing(int[][] matrix, int k, int i) {
        int temp = matrix[k][k + i], swap;
        int l = matrix.length;

        swap = temp;
        temp = matrix[k + i][l - 1 - k];
        matrix[k + i][l - 1 - k] = swap;

        swap = temp;
        temp = matrix[l - 1 - k][l - 1 - k - i];
        matrix[l - 1 - k][l - 1 - k - i] = swap;

        swap = temp;
        temp = matrix[l - 1 - k - i][k];
        matrix[l - 1 - k - i][k] = swap;

        swap = temp;
        temp = matrix[k][k + i];
        matrix[k][k + i] = swap;
    }
}
