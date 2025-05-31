import java.util.Scanner;

public class PrefixSum {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter Rows and Columns for matrix: ");
        int r = sc.nextInt();
        int c = sc.nextInt();

        int matrix[][] = new int[r][c];

        System.out.println("Enter " + r * c + " elements for matrix: ");
        for (int i = 0; i < r; i++) {
            for (int j = 0; j < c; j++) {
                matrix[i][j] = sc.nextInt();
            }
        }
        System.out.println("Original matrix:");
        printMatrix(matrix);

        // Precompute prefix sum matrices
        int[][] rowWisePrefixSum = computeRowWisePrefixSum(matrix);
        int[][] prefixSum = computePrefixSum(matrix);

        System.out.println("Prefix Sum Matrix:");
        printMatrix(prefixSum);

        System.out.println("Enter Coordinates for rectangleSum:");
        System.out.println("Enter l1 and r1:");
        int l1 = sc.nextInt();
        int r1 = sc.nextInt();
        System.out.println("Enter l2 and r2:");
        int l2 = sc.nextInt();
        int r2 = sc.nextInt();

        System.out.println("Brute Force Sum: " + findSum(matrix, l1, r1, l2, r2));
        System.out.println("Optimized Sum (Row-wise prefix): " + findSum2(rowWisePrefixSum, l1, r1, l2, r2));
        System.out.println("Optimized Sum (2D Prefix Sum): " + findSum3(prefixSum, l1, r1, l2, r2));

        sc.close();
    }

    static void printMatrix(int[][] array) {
        for (int[] row : array) {
            for (int num : row) {
                System.out.print(num + " ");
            }
            System.out.println();
        }
    }

    // Brute force method
    static int findSum(int[][] matrix, int l1, int r1, int l2, int r2) {
        int sum = 0;
        for (int i = l1; i <= l2; i++) {
            for (int j = r1; j <= r2; j++) {
                sum += matrix[i][j];
            }
        }
        return sum;
    }

    // Compute only Row-wise Prefix Sum Matrix
    static int[][] computeRowWisePrefixSum(int[][] matrix) {
        int r = matrix.length, c = matrix[0].length;
        int[][] rowPrefix = new int[r][c];

        // Copy matrix values
        for (int i = 0; i < r; i++) {
            for (int j = 0; j < c; j++) {
                rowPrefix[i][j] = matrix[i][j];
            }
        }

        // Row-wise prefix sum
        for (int i = 0; i < r; i++) {
            for (int j = 1; j < c; j++) {
                rowPrefix[i][j] += rowPrefix[i][j - 1];
            }
        }
        return rowPrefix;
    }

    // Compute full 2D prefix sum matrix
    static int[][] computePrefixSum(int[][] matrix) {
        int r = matrix.length, c = matrix[0].length;
        int[][] prefixSum = new int[r][c];

        // Copy matrix values
        for (int i = 0; i < r; i++) {
            for (int j = 0; j < c; j++) {
                prefixSum[i][j] = matrix[i][j];
            }
        }

        // Row-wise prefix sum
        for (int i = 0; i < r; i++) {
            for (int j = 1; j < c; j++) {
                prefixSum[i][j] += prefixSum[i][j - 1];
            }
        }

        // Column-wise prefix sum
        for (int j = 0; j < c; j++) {
            for (int i = 1; i < r; i++) {
                prefixSum[i][j] += prefixSum[i - 1][j];
            }
        }
        return prefixSum;
    }

    // Row-wise prefix sum optimization (Now uses only row-wise prefix sum matrix)
    static int findSum2(int[][] rowWisePrefixSum, int l1, int r1, int l2, int r2) {
        int sum = 0;
        for (int i = l1; i <= l2; i++) {
            if (r1 > 0) {
                sum += rowWisePrefixSum[i][r2] - rowWisePrefixSum[i][r1 - 1];
            } else {
                sum += rowWisePrefixSum[i][r2];
            }
        }
        return sum;
    }

    // Fully optimized 2D Prefix Sum method
    static int findSum3(int[][] prefixSum, int l1, int r1, int l2, int r2) {
        int sum = prefixSum[l2][r2];
        int left = (r1 > 0) ? prefixSum[l2][r1 - 1] : 0;
        int up = (l1 > 0) ? prefixSum[l1 - 1][r2] : 0;
        int leftUp = (l1 > 0 && r1 > 0) ? prefixSum[l1 - 1][r1 - 1] : 0;
        return sum - left - up + leftUp;
    }
}
