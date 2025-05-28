import java.util.Scanner;

public class generateSpiral {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter n : ");
        int n = sc.nextInt();

        int[][] spiralMatrix = makeSpiralMatrix(n);
        System.out.println("Generated Spiral Matrix : ");
        printMatrix(spiralMatrix);

        sc.close();
    }

    static void printMatrix(int[][] matrix) {

        for (int i = 0; i < matrix.length; i++) {
            for (int j = 0; j < matrix[i].length; j++) {
                System.out.print(matrix[i][j] + " ");
            }
            System.out.println();
        }
    }

    // make spiral clockwise

    static int[][] makeSpiralMatrix(int n) {

        if (n <= 0) {
            System.out.println(" InValid Number for Matrix... ");
        }

        int[][] matrix = new int[n][n];

        int topRow = 0, bottomRow = n - 1;
        int leftCol = 0, rightCol = n - 1;
        int current = 1;

        while (current <= n * n) {
            // topRow -> leftCol to rightCol
            for (int j = leftCol; j <= rightCol && current <= n * n; j++) {
                matrix[topRow][j] = current++;
            }
            topRow++;

            // rightCol -> topRow to bottomRow
            for (int i = topRow; i <= bottomRow && current <= n * n; i++) {
                matrix[i][rightCol] = current++;
            }
            rightCol--;

            // bottomRow -> rightCol to leftCol
            for (int j = rightCol; j >= leftCol && current <= n * n; j--) {
                matrix[bottomRow][j] = current++;
            }
            bottomRow--;

            // leftCol -> bottomRow to topRow
            for (int i = bottomRow; i >= topRow && current <= n * n; i--) {
                matrix[i][leftCol] = current++;
            }
            leftCol++;
        }

        return matrix;
    }
}