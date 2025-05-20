import java.util.Arrays;

public class arrExample {
    public static void main(String[] args) {
        sumOfElemnts();
        maxInArray();
        searchInArray();
        occurenceOfX(7);
        lastOccrence(7);
        isSorted();
        smallestAndLargestElement();
    }

    static void sumOfElemnts() {
        int arr[] = { 1, 5, 3, 7, 2, 4, 7, 9 };
        int sum = 0;

        for (int i = 0; i < arr.length; i++) {
            sum = sum + arr[i];
        }
        System.out.println("Sum is : " + sum);
    }

    static void maxInArray() {
        int arr[] = { 1, 5, 3, 7, 2, 4, 7, 9 };
        int ans = 0;

        for (int i = 1; i < arr.length; i++) {
            if (arr[i] > ans) {
                ans = arr[i];
            }
        }

        System.out.println("Max Element : " + ans);
    }

    static void searchInArray() {
        int arr[] = { 1, 5, 3, 7, 2, 4, 7, 9 };
        int target = 4;
        int ans = -1;

        for (int i = 1; i < arr.length; i++) {
            if (arr[i] == target) {
                ans = i;
                break;
            }
        }

        System.out.println("Found " + target + " at Index : " + ans);

    }

    static void occurenceOfX(int x) {
        int arr[] = { 1, 5, 3, 7, 7, 4, 7, 9 };
        int count = 0;

        for (int i = 1; i < arr.length; i++) {
            if (arr[i] == x) {
                count++;
            }
        }

        System.out.println("Count Of " + x + " is : " + count);
    }

    static void lastOccrence(int x) {
        int arr[] = { 1, 5, 3, 7, 7, 4, 7, 9 };
        int lastIndex = -1;

        for (int i = 1; i < arr.length; i++) {
            if (arr[i] == x) {
                lastIndex = i;
            }
        }

        System.out.println("last Index of " + x + " is : " + lastIndex);
    }

    static void isSorted() {
        // int arr[] = { 1, 5, 3, 7, 7, 4, 7, 9 }; // not sorted
        int arr[] = { 1, 2, 3, 6, 9, 14, 17, 29 }; // sorted
        boolean check = true;

        for (int i = 1; i < arr.length; i++) {

            /*
             * i = 0
             * arr[0] < arr[-1] which does not exist so we should start with arr[1]
             */
            if (arr[i] < arr[i - 1]) {// not sorted
                check = false;
                break;
            }
        }
        System.out.println("Is Sorted : " + check);
    }

    static void smallestAndLargestElement() {
        int arr[] = { 1, 5, 3, 7, 7, 4, 7, 9 };
        Arrays.sort(arr);

        for (int i = 0; i < arr.length; i++) {
            System.out.print(arr[i] + " ");
        }
        System.out.println();

        int[] ans = { arr[0], arr[arr.length - 1] };
        System.out.println(Arrays.toString(ans));
    }
}