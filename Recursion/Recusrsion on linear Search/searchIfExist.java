public class searchIfExist {
    public static void main(String[] args) {
        int[] arr = { 1, 2, 3, 2, 8, 3, 9, 8, 3 };
        int target = 3;

        System.out.println(search(arr, target, 0));

    }

    // check if element exist in the given array
    static boolean search(int arr[], int target, int idx) {
        // base case
        if (idx == arr.length)
            return false;

        // self work
        if (arr[idx] == target)
            return true;

        // recursive work
        return search(arr, target, idx + 1);
    }
}
