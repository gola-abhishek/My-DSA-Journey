import java.util.Scanner;

public class rectangleSum {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter Rows and Columns for matrix : ");
        int r = sc.nextInt();
        int c = sc.nextInt();

        int matrix[][] = new int[r][c];

        System.out.println("Enter " + r * c + " elements for matrix : ");
        for (int i = 0; i < r; i++) {
            for (int j = 0; j < c; j++) {
                matrix[i][j] = sc.nextInt();
            }
        }
        System.out.println("Original matrix : ");
        printMatrix(matrix);

        System.out.println("Enter Coordinates for rectangleSum  : ");
        System.out.println("Enter l1 and r1 :");
        int l1 = sc.nextInt();
        int r1 = sc.nextInt();
        System.out.println("Enter l2 and r2 :");
        int l2 = sc.nextInt();
        int r2 = sc.nextInt();

        int[][] prefixSum = findPrefixSumMatrix(matrix);

        System.out.println("The sum of rectangle (Brute Force) is : " + findSum(matrix, l1, r1, l2, r2));
        System.out.println("The sum of rectangle (Row-wise Prefix Sum) is : " + findSum2(matrix, l1, r1, l2, r2));
        System.out.println("The sum of rectangle (2D Prefix Sum) is : " + findSum3(prefixSum, l1, r1, l2, r2));

        sc.close();
    }

    static void printMatrix(int[][] array) {
        for (int i = 0; i < array.length; i++) {
            for (int j = 0; j < array[i].length; j++) {
                System.out.print(array[i][j] + " ");
            }
            System.out.println();
        }
    }

    // ✅ Method 1: Brute force method
    static int findSum(int[][] matrix, int l1, int r1, int l2, int r2) {
        int sum = 0;
        for (int i = l1; i <= l2; i++) {
            for (int j = r1; j <= r2; j++) {
                sum += matrix[i][j];
            }
        }
        return sum;
    }

    // ✅ FIXED findPrefixSumMatrix - Returns correct prefix sum matrix
    static int[][] findPrefixSumMatrix(int[][] matrix) {
        int r = matrix.length;
        int c = matrix[0].length;
        int[][] prefixSum = new int[r][c];

        // Copy original matrix values first
        for (int i = 0; i < r; i++) {
            for (int j = 0; j < c; j++) {
                prefixSum[i][j] = matrix[i][j];
            }
        }

        // Compute row-wise prefix sum
        for (int i = 0; i < r; i++) {
            for (int j = 1; j < c; j++) {
                prefixSum[i][j] += prefixSum[i][j - 1];
            }
        }

        // Compute column-wise prefix sum
        for (int j = 0; j < c; j++) {
            for (int i = 1; i < r; i++) {
                prefixSum[i][j] += prefixSum[i - 1][j];
            }
        }

        return prefixSum;
    }

    // ✅ Method 2: Uses row-wise prefix sum only
    static int findSum2(int[][] matrix, int l1, int r1, int l2, int r2) {
        int sum = 0;

        // Create row-wise prefix sum matrix separately to avoid modifying the original
        // matrix
        int[][] rowPrefixSum = new int[matrix.length][matrix[0].length];

        // Copy the original matrix
        for (int i = 0; i < matrix.length; i++) {
            rowPrefixSum[i][0] = matrix[i][0]; // First column remains same
            for (int j = 1; j < matrix[0].length; j++) {
                rowPrefixSum[i][j] = rowPrefixSum[i][j - 1] + matrix[i][j];
            }
        }

        // Calculate sum using rowPrefixSum
        for (int i = l1; i <= l2; i++) {
            if (r1 > 0) {
                sum += rowPrefixSum[i][r2] - rowPrefixSum[i][r1 - 1];
            } else {
                sum += rowPrefixSum[i][r2];
            }
        }
        return sum;
    }

    // ✅ Method 3: Uses full 2D prefix sum
    static int findSum3(int[][] prefixSum, int l1, int r1, int l2, int r2) {
        int sum = prefixSum[l2][r2];
        int left = (r1 > 0) ? prefixSum[l2][r1 - 1] : 0;
        int up = (l1 > 0) ? prefixSum[l1 - 1][r2] : 0;
        int leftUp = (l1 > 0 && r1 > 0) ? prefixSum[l1 - 1][r1 - 1] : 0;

        return sum - left - up + leftUp;
    }
}
