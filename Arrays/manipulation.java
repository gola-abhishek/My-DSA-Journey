import java.util.Scanner;

public class manipulation {
    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);
        System.out.println("Enter Size of Array : ");
        int n = sc.nextInt();
        int arr[] = new int[n];

        System.out.println("Input  " + n + " Array Elemensts : ");
        for (int i = 0; i < n; i++) {
            arr[i] = sc.nextInt();

        }
        // functions calls 

        System.out.println("Max number is : " + findMax(arr));

        System.out.println("The Second Max is : " + findSecondMax(arr)); // Mam
        sc.close();
    }

    // find the maximun number

    static int findMax(int arr[]) {
        int max = Integer.MIN_VALUE;
        for (int i = 0; i < arr.length; i++) {
            if (arr[i] > max) {
                max = arr[i];
            }
        }
        return max;
    }

    // find the Second maximun number (MA'AM METHOD)

    static int findSecondMax(int[] arr) {
        int mx = findMax(arr);
        int n = arr.length;
        for (int i = 0; i < n; i++) {
            if (arr[i] == mx) {
                arr[i] = Integer.MIN_VALUE;
            }
        }
        int secondMax = findMax(arr);
        return secondMax;
    }
}
