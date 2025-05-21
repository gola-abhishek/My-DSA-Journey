import java.util.Scanner;

public class targetSum {
    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);
        System.out.println("Enter Size of Array : ");
        int n = sc.nextInt();
        int arr[] = new int[n];

        System.out.println("Input Array Elemensts : ");
        for (int i = 0; i < n; i++) {
            arr[i] = sc.nextInt();
        }

        // Functions calls 

        System.out.println("Enter the target Element : ");
        int x = sc. nextInt();

        TwoSum(arr , x);
        ThreeSum(arr, x);
    }

    static void TwoSum(int arr[], int target ) {

        int n = arr.length;
        int count = 0;

        for (int i = 0; i < n; i++) {
            for (int j = i; j < n; j++) {
                if (arr[i] + arr[j] == target) {
                    count++;
                }
            }
        }
        System.out.println("The number of doublet whose sum is "+ target +" are : " + count);
    }
    
    static void ThreeSum(int arr[], int target ) {
        
        int n = arr.length;
        int count = 0;
        
        for (int i = 0; i < n; i++) {
            for (int j = i + 1; j < n; j++) {
                for (int k = j + 1; k < n; k++) {
                    if (arr[i] + arr[j] + arr[k] == target) {
                        count++;
                    }
                }
            }
        }
        System.out.println("The number of triplet whose sum is "+ target +" are : " + count);
    }
}
