import java.util.Scanner;

public class followUp {
    public static void main(String[] args) {

        // int[][] arr = {
        // { 5, 4, 3 },
        // { 4, 3, 4 },
        // { 7, 4, 64 }
        // };
        // print2DArrayReverse(arr);

        Scanner sc = new Scanner(System.in);
        System.out.println("Enter n : ");
        int n = sc.nextInt();

        int[][] spiralMatrix = makeSpiralMatrix(n);
        System.out.println("Generated Spiral Matrix : ");
        printMatrix(spiralMatrix);

        sc.close();
    }

    // 1. reverse every row of 2D array

    static void print2DArrayReverse(int[][] arr) {
        for (int i = 0; i < arr.length; i++) {
            for (int j = arr.length - 1; j >= 0; j--) {
                System.out.print(arr[i][j] + " ");
            }
            System.out.println();
        }
    }

    static void printMatrix(int[][] matrix) {

        for (int i = 0; i < matrix.length; i++) {
            for (int j = 0; j < matrix[i].length; j++) {
                System.out.print(matrix[i][j] + " ");
            }
            System.out.println();
        }
    }

    // 2 . make spiral anticlockwise

    static int[][] makeSpiralMatrix(int n) {

        if (n <= 0) {
            System.out.println(" InValid Number for Matrix... ");
        }

        int[][] matrix = new int[n][n];

        int topRow = 0, bottomRow = n - 1;
        int leftCol = 0, rightCol = n - 1;
        int current = 1;

        while (current <= n * n) {

            // leftCol -> topRow to bottomRow
            for (int i = topRow; i <= bottomRow && current <= n * n; i++) {
                matrix[i][leftCol] = current++;
            }
            leftCol++;

            // bottomRow -> leftCol to rightCol
            for (int j = leftCol; j <= rightCol && current <= n * n; j++) {
                matrix[bottomRow][j] = current++;
            }
            bottomRow--;

            // rightCol -> bottomRow to topRow
            for (int i = bottomRow; i >= topRow && current <= n * n; i--) {
                matrix[i][rightCol] = current++;
            }
            rightCol--;

            // topRow -> rightCol to leftCol
            for (int j = rightCol; j >= leftCol && current <= n * n; j--) {
                matrix[topRow][j] = current++;
            }
            topRow++;

        }

        return matrix;
    }
}
