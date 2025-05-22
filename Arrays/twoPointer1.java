import java.util.Scanner;

public class twoPointer1 {

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

        sortArrayAtParity(arr);
        System.out.println("Sorted Array after Even at Begi. : ");
        printArray(arr);

    }
    
    static void printArray(int arr[]) {
        for (int i = 0; i < arr.length; i++) {
            System.out.print(arr[i] + " ");
        }
        System.out.println();
    }

    static void swapArr(int[] arr, int i, int j) {
        int temp = arr[i];
        arr[i] = arr[j];
        arr[j] = temp;
    }

    static int[] sortArrayAtParity(int[] arr) { // sortEvenAtBegining
        int n = arr.length;
        int left = 0;
        int right = n - 1;

        while (left < right) {
            // arr[left] % 2 == 1 : odd , arr[right] % 2 == 0 : Even

            if (arr[left] % 2 == 1 && arr[right] % 2 == 0) {
                swapArr(arr, left, right);
                left++;
                right--;
            }
            if (arr[left] % 2 == 0) {
                left++;
            }
            if (arr[right] % 2 == 1) {
                right--;
            }
        }
        return arr;
    }
}
