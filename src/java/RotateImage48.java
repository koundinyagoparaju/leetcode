import java.util.Arrays;

public class RotateImage48 {
    public static void main(String[] args) {
        int[][] matrix = new int[][] {new int[]{5, 1, 9, 11}, new int[]{2, 4, 8, 10}, new int[]{13, 3, 6, 7}, new int[]{15, 14, 12, 16}};
        rotate(matrix);
    }
    private static void rotate(int[][] matrix) {
        double numOfRings = Math.ceil(matrix.length / 2.0);
        for (int k = 0; k < numOfRings; k++) {
            rotateKthRing(matrix, k);
        }
    }

    private static void rotateKthRing(int[][] matrix, int k) {
        int numElementsToRotate = matrix.length - 2 * k - 1;
        for (int i = 0; i < numElementsToRotate; i++) {
            rotateIthElementInKthRing(matrix, k, i);
        }
    }

    private static void rotateIthElementInKthRing(int[][] matrix, int k, int i) {
        int l = matrix.length;
        int temp = matrix[l - 1 - k - i][k];

        matrix[l - 1 - k - i][k] =  matrix[l - 1 - k][l - 1 - k - i];

        matrix[l - 1 - k][l - 1 - k - i] =  matrix[k + i][l - 1 - k];

        matrix[k + i][l - 1 - k] =  matrix[k][k + i];

        matrix[k][k + i] = temp;
    }
}
