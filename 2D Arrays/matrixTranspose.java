import java.util.Scanner;

public class matrixTranspose {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter no of rows and columns : ");
        int r = sc.nextInt();
        int c = sc.nextInt();

        int[][] arr1 = new int[r][c];

        System.out.println("Enter " + r * c + " elements : ");
        for (int i = 0; i < r; i++) {
            for (int j = 0; j < c; j++) {
                arr1[i][j] = sc.nextInt();
            }
        }
        // print2DTranspose(arr1);

        // transposeInPlace(arr1, r, c);

        print2DArray(findTranspose(arr1, r, c));

    }

    // method 1
    static void print2DTranspose(int[][] array) {
        for (int i = 0; i < array.length; i++) {
            for (int j = 0; j < array[i].length; j++) {
                System.out.print(array[j][i] + " ");
            }
            System.out.println();
        }
    }

    // method 2
    static void transposeInPlace(int[][] arr1, int r, int c) {
        for (int i = 0; i < r; i++) {
            for (int j = i; j < c; j++) {
                int temp = arr1[i][j];
                arr1[i][j] = arr1[j][i];
                arr1[j][i] = temp;
            }
        }
        System.out.println("Transposed Array : ");
        print2DArray(arr1);
    }

    static void print2DArray(int[][] array) {
        for (int i = 0; i < array.length; i++) {
            for (int j = 0; j < array[i].length; j++) {
                System.out.print(array[i][j] + " ");
            }
            System.out.println();
        }
    }

    // method 3

    static int[][] findTranspose(int[][] arr, int r, int c) {

        int transpose[][] = new int[r][c];

        for (int i = 0; i < r; i++) {
            for (int j = 0; j < c; j++) {
                transpose[i][j] = arr[j][i];
            }

        }
        return transpose;
    }
}
