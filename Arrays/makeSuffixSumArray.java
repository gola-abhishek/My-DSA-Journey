import java.util.Arrays;
import java.util.Scanner;

public class makeSuffixSumArray {
    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);
        System.out.println("Enter size of array : ");
        int n = sc.nextInt();

        int arr[] = new int[n];

        System.out.println("Enter " + n + " Elements of Arrays : ");
        for (int i = 0; i < arr.length; i++) {
            arr[i] = sc.nextInt();
        }

        int ans[] = SuffixSumArray(arr);
        System.out.println("Suffix Sum Array : ");
        // printArray(ans);
        System.out.println(Arrays.toString(ans));

        sc.close();
    }

    static void printArray(int arr[]) {
        for (int i = 0; i < arr.length; i++) {
            System.out.print(arr[i] + " ");
        }
        System.out.println();
    }

    static int findArraySum(int[] arr) {
        int totalSum = 0;
        for (int i = 0; i < arr.length; i++) {
            totalSum += arr[i];
        }
        return totalSum;
    }

    static int[] SuffixSumArray(int[] arr) {
        int n = arr.length;
        int sfxSum[] = new int[n];

        int total = findArraySum(arr);
        int prefSum = 0;

        sfxSum[0] = total;

        for (int i = 1; i < n; i++) {
            prefSum += arr[i-1];
            sfxSum[i] = total - prefSum;
        }
        return sfxSum;
    }
}
