import java.util.Scanner;

public class uniqueInArray {
    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);
        System.out.println("Enter Size of Array : ");
        int n = sc.nextInt();
        int arr[] = new int[n];

        System.out.println("Input  " + n + " Array Elemensts : ");
        for (int i = 0; i < n; i++) {
            arr[i] = sc.nextInt();
        }

        System.out.println("Unique number is : " + unique(arr));
        sc.close();
    }
    
    // Find a unique number in the given aerray

    static int unique(int arr[]) {

        for (int i = 0; i < arr.length; i++) {
            for (int j = i + 1; j < arr.length; j++) {
                if (arr[i] == arr[j]) {
                    arr[i] = -1;
                    arr[j] = -1;
                    break;
                }
            }
        }
        int ans = -1;
        for (int i = 0; i < arr.length; i++) {
            if (arr[i] > 0) {
                ans = arr[i];
            }
        }
        return ans;
    }

}
