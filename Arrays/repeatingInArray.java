import java.util.Scanner;

public class repeatingInArray {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter Size of Array : ");
        int n = sc.nextInt();
        int arr[] = new int[n];

        System.out.println("Input  " + n + " Array Elemensts : ");
        for (int i = 0; i < n; i++) {
            arr[i] = sc.nextInt();
        }

        System.out.println("The First Repeating Number is : " + firstRepeatingValue(arr));

        System.out.println("The Last Repeating Number is : " + lastRepeatingValue(arr));
    }
    
    // find the first repeating value in the array

    static int firstRepeatingValue(int[] arr) {

        for (int i = 0; i < arr.length; i++) {
            for (int j = i + 1; j < arr.length; j++) {
                if (arr[i] == arr[j]) {
                    return arr[i];
                }
            }
        }
        return -1;
    }

    // find the last repeating value in the array

    static int lastRepeatingValue(int[] arr) {

        int lastVal = -1;

        for (int i = 0; i < arr.length; i++) {
            for (int j = i + 1; j < arr.length; j++) {
                if (arr[i] == arr[j]) {
                    lastVal = arr[i];
                }
            }
        }
        return lastVal;
    }

}
