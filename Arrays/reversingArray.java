import java.util.Scanner;

public class reversingArray {
    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);
        System.out.println("Enter Size of Array : ");
        int n = sc.nextInt();
        int arr[] = new int[n];

        System.out.println("Input  " + n + " Array Elemensts : ");
        for (int i = 0; i < n; i++) {
            arr[i] = sc.nextInt();
        }

        // functions calls

        reverseArr(arr);

        printarray(arr);

    }

    static void printarray(int arr[]) {
        for (int i = 0; i < arr.length; i++) {
            System.out.print(arr[i] + " ");
        }
        System.out.println();
    }

    // swap in array for reverse (Mam METHOD)

    static void swapArr(int[] arr, int i, int j) {
        int temp = arr[i];
        arr[i] = arr[j];
        arr[j] = temp;
    }

    // reverse of the given array with swap Fxn (Mam METHOD)

    static void reverseArr(int[] arr) {
        int i = 0;
        int j = arr.length - 1;

        while (i < j) {
            swapArr(arr, i, j);
            i++;
            j--;
        }
    }
}
