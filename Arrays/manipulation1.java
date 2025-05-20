import java.util.Scanner;

public class manipulation1 {
    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);
        System.out.println("Enter size of array : ");
        int n = sc.nextInt();

        int arr[] = new int[n];

        System.out.println("Enter " + n + " Elements of Arrays : ");
        for (int i = 0; i < arr.length; i++) {
            arr[i] = sc.nextInt();
        }

        // Functions calls

        reverse1(arr); // own

        reverse2(arr); // mam 

    }

    // reverse of the given array (OWN METHOD)

    static void reverse1(int[] arr) {
        int n = arr.length;

        for (int i = 0; i < n; i++) {
            System.out.print(arr[i] + " ");// original
        }

        System.out.println();

        for (int i = n - 1; i >= 0; i--) {
            System.out.print(arr[i] + " "); // reverse
        }
    }

    // reverse of the given array without using swap Fxn (Mam METHOD)

    static void reverse2(int[] arr) {
        int n = arr.length;
        int[] ans = new int[n];
        int j = 0;

        for (int i = n - 1; i >= 0; i--) {
            ans[j++] = arr[i]; // reverse process
        }

        for (int i = 0; i < ans.length; i++) {
            System.out.print(ans[i] + " ");
        }
    }
}
