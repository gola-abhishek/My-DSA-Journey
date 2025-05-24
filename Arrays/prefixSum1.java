import java.util.Scanner;

public class prefixSum1 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter Size of Array : ");
        int n = sc.nextInt();
        int arr[] = new int[n+1];

        System.out.println("Input " + n + " Elemensts : ");
        for (int i = 1; i <= n; i++) {
            arr[i] = sc.nextInt();
        }

        int[] prefixQuerySum = makePrefixSumArray(arr); // prefix sum with queries 

        System.out.println("Enter number of queries : ");
        int q = sc.nextInt();

        while (q-- > 0) {
            System.out.println("Enter Range : ");
            int l = sc.nextInt();
            int r = sc.nextInt();

            int ans = prefixQuerySum[r] + prefixQuerySum[l - 1];
            System.out.println("Sum : " + ans);
        }
    }
    
    static void printArray(int arr[]) {
        for (int i = 0; i < arr.length; i++) {
            System.out.print(arr[i] + " ");
        }
        System.out.println();
    }

    static int[] makePrefixSumArray(int[] arr) {
        int n = arr.length;
        for (int i = 1; i < n; i++) {
            arr[i] += arr[i - 1];
        }
        return arr;
    }
}
