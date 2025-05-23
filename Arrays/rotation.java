import java.util.Scanner;

public class rotation {
    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);
        System.out.println("Enter size of array : ");
        int n = sc.nextInt();

        int arr[] = new int[n];

        System.out.println("Enter " + n + " Elements of Arrays : ");
        for (int i = 0; i < arr.length; i++) {
            arr[i] = sc.nextInt();
        }

        System.out.println("Enter the rotaion Steps :");
        int k = sc.nextInt();

        // printarray(rotate(arr, k));// rotate

        rotateInPlace(arr, k);// rotateInPlace
        printarray(arr);

    }

    static void printarray(int arr[]) {
        for (int i = 0; i < arr.length; i++) {
            System.out.print(arr[i] + " ");
        }
        System.out.println();
    }

    // rotate the given array by 'k' steps

    static int[] rotate(int[] arr, int k) {

        int n = arr.length;
        k = k % n;

        int ans[] = new int[n];
        int j = 0;

        for (int i = n - k; i < n; i++) {
            ans[j++] = arr[i];
        }

        for (int i = 0; i < n - k; i++) {
            ans[j++] = arr[i];
        }
        return ans;
    }

    // rotate the given array by k steps without ExtraSpace
    // like ans array is used prevously

    static void swapArr(int[] arr, int i, int j) {
        int temp = arr[i];
        arr[i] = arr[j];
        arr[j] = temp;
    }

    static void reverse(int[] arr, int i, int j) {
        while (i < j) {
            swapArr(arr, i, j);
            i++;
            j--;
        }
    }

    static void rotateInPlace(int[] arr, int k) {
        int n = arr.length;
        k = k % n;

        reverse(arr, 0, n - k - 1);
        reverse(arr, n - k, n - 1);
        reverse(arr, 0, n - 1);
    }
}
