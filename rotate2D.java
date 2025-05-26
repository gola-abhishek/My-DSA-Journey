import java.util.Scanner;

public class rotate2D {
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
        System.out.println("Original Array : ");
        print2DArray(arr1);

        rotate(arr1, r);
    }

    static void print2DArray(int[][] array) {
        for (int i = 0; i < array.length; i++) {
            for (int j = 0; j < array[i].length; j++) {
                System.out.print(array[i][j] + " ");
            }
            System.out.println();
        }
    }

    static void transposeInPlace(int[][] arr1, int r, int c) {
        for (int i = 0; i < r; i++) {
            for (int j = i; j < c; j++) {
                int temp = arr1[i][j];
                arr1[i][j] = arr1[j][i];
                arr1[j][i] = temp;
            }
        }
    }

    static void ArrayReverse(int[] arr) {
        int i = 0;
        int j = arr.length - 1;

        while (i < j) {
            int temp = arr[i];
            arr[i] = arr[j];
            arr[j] = temp;
            i++;
            j--;
        }
    }

    static void rotate(int[][] arr, int n) {

        transposeInPlace(arr, n, n); // step 1 

        for (int i = 0; i < arr.length; i++) {
            ArrayReverse(arr[i]); // step 2 
        }

    System.out.println("Rotated Array : ");
    print2DArray(arr); // print the array
    }
}
