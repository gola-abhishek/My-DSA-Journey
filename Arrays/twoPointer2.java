import java.util.Scanner;

public class twoPointer2 {

    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);
        System.out.println("Enter Size of Array : ");
        int n = sc.nextInt();
        int arr[] = new int[n];

        System.out.println("Input Array Elemensts : ");
        for (int i = 0; i < n; i++) {
            arr[i] = sc.nextInt();
        }

        System.out.println("Original Array : ");
        printArray(arr);

        int[] sortedSquares = sortSquares(arr); // Calling the function
        System.out.print("Sorted squares : ");
        printArray(sortedSquares);
    }

    static void printArray(int arr[]) {
        for (int i = 0; i < arr.length; i++) {
            System.out.print(arr[i] + " ");
        }
        System.out.println();
    }

    static int[] sortSquares(int[] arr) {
        int n = arr.length;
        int left = 0, right = n - 1;
        int k = n - 1; // Start filling from the last index
        int ans[] = new int[n];

        while (left <= right) {
            if (Math.abs(arr[left]) > Math.abs(arr[right])) {
                ans[k--] = arr[left] * arr[left];
                left++;
            } else {
                ans[k--] = arr[right] * arr[right];
                right--;
            }
        }
        return ans;
    }
}
