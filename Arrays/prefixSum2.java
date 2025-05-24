import java.util.Scanner;

public class prefixSum2 {
    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);
        System.out.println("Enter Size of Array : ");
        int n = sc.nextInt();
        int arr[] = new int[n + 1];

        System.out.println("Input " + n + " Elemensts : ");
        for (int i = 1; i <= n; i++) {
            arr[i] = sc.nextInt();
        }
        // check array Partition by prefixSum == suffixSum

        System.out.println("Equal Partition Possible : " + equalSumPartition(arr));
    }
    
    static int findArraySum(int[] arr) {
        int totalSum = 0;
        for (int i = 0; i < arr.length; i++) {
            totalSum += arr[i];
        }
        return totalSum;
    }
    static boolean equalSumPartition(int[] arr) {
        int totalSum = findArraySum(arr);
        int prefSum = 0;
        for (int i = 0; i < arr.length; i++) {
            prefSum += arr[i];
            int suffixSum = totalSum - prefSum;
            if (suffixSum == prefSum) {
                return true;
            }
        }
        return false;
    }
}
