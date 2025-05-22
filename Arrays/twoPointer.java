import java.util.Scanner;

public class twoPointer {
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

        // function calls

        sortZeroesAndOnes(arr);// approach 1
        System.out.println("Sorted 0's and 1's array : ");
        printArray(arr);

        sortZeroOnesApr2(arr); // approach 2
        System.out.println("Sorted 0's and 1's array : ");
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

    static void sortZeroesAndOnes(int[] arr) { // approach 1
        int n = arr.length;
        int zeroes = 0;
        // count number of zeroes 

        for (int i = 0; i < n; i++) {
            if (arr[i] == 0) {
                zeroes++;
            }
        }
        //0 to zeroes-1 : 0 , zeroes to n-1 : 1

        for (int i = 0; i < n; i++) {
            if (i < zeroes) {
                arr[i] = 0;
            } else {
                arr[i] = 1;
            }
        }
    }

    static void sortZeroOnesApr2(int[] arr) { // approach 2
        int n = arr.length;
        int left = 0;
        int right = n - 1;

        while (left < right) {
            if (arr[left] == 1 && arr[right] == 0) {
                swapArr(arr, left, right);
                left++;
                right--;
            }

            if (arr[left] == 0) {
                left++;
            }
            if (arr[right] == 1) {
                right--;
            }
        }
    }
}
