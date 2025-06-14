public class SortedArray {
    public static void main(String[] args) {
        // int[] arr = { 1, 2, 7, 5, 3 };
        int[] arr = { 1, 2, 3, 4, 5 };

        System.out.println(isSorted(arr, 0));
    }

    static boolean isSorted(int arr[], int idx) {
        // base case 
        if (idx == arr.length-1) {
            return true;
        }

        // recursive work
        if (arr[idx] < arr[idx + 1]) {
            return isSorted(arr, idx + 1);
        }
        
        // self work
        return false;
    }
}
