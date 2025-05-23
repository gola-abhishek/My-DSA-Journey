import java.util.Scanner;

public class prefixSum {
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

        // fnctions calls

        // System.out.println("prefixSum Array Outplace : ");
        // int pref[] = makePrefixSumArr(arr);
        // printArray(pref);

        System.out.println("prefixSum Array InPlace : ");
        int ans[] = makePrefixSumArray(arr);
        printArray(ans);
    }

    static void printArray(int arr[]) {
        for (int i = 0; i < arr.length; i++) {
            System.out.print(arr[i] + " ");
        }
        System.out.println();
    }

    static int[] makePrefixSumArr(int[] arr) { // prefixSum with extra Array 
        int n = arr.length;
        int[] pref = new int[n];
        pref[0] = arr[0];
        for (int i = 1; i < n; i++) {
            pref[i] = pref[i - 1] + arr[i];
        }
        return pref;
    }
    
    static int[] makePrefixSumArray(int[] arr) { // prefixSum in same array 
        int n = arr.length;
        for (int i = 1; i < n; i++) {
            arr[i] += arr[i - 1];
        }
        return arr;
    }
}
