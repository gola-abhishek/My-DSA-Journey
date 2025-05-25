import java.util.Scanner;

public class matricesMultiply {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.println("Enter data for matrix 1 : ");
        System.out.println("Enter no of rows and columns : ");
        int r1 = sc.nextInt();
        int c1 = sc.nextInt();

        int[][] arr1 = new int[r1][c1];

        System.out.println("Enter " + r1 * c1 + " elements : ");
        for (int i = 0; i < r1; i++) {
            for (int j = 0; j < c1; j++) {
                arr1[i][j] = sc.nextInt();
            }
        }

        System.out.println("Enter data for matrix 2 : ");
        System.out.println("Enter no of rows and columns : ");
        int r2 = sc.nextInt();
        int c2 = sc.nextInt();

        int[][] arr2 = new int[r2][c2];

        System.out.println("Enter " + r2 * c2 + " elements : ");
        for (int i = 0; i < r2; i++) {
            for (int j = 0; j < c2; j++) {
                arr2[i][j] = sc.nextInt();
            }
        }

        System.out.println("Matrix 1 : ");
        print2DArray(arr1);
        System.out.println("Matrix 2 : ");
        print2DArray(arr2);

        matricesMulti(arr1, r1, c1, arr2, r2, c2);// calling the function 
    }

    static void print2DArray(int[][] array) {
        for (int i = 0; i < array.length; i++) {
            for (int j = 0; j < array[i].length; j++) {
                System.out.print(array[i][j] + " ");
            }
            System.out.println();
        }
    }

    static void matricesMulti(int[][] a, int r1, int c1, int[][] b, int r2, int c2) {
        if (c1 != r2) {
            System.out.println("Wrong Input - multiplication Not Possible ");
            return;
        }

        int[][] mul = new int[r1][c2];

        for (int i = 0; i < r1; i++) {
            for (int j = 0; j < c2; j++) {
                for (int k = 0; k < c1; k++) {
                    mul[i][j] += a[i][k] * b[k][j];
                }
            }
        }
        System.out.println("multiplication of matrix 1 and matrix 2 : ");
        print2DArray(mul);
    }
}
