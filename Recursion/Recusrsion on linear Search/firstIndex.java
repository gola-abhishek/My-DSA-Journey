public class firstIndex {
    public static void main(String[] args) {
        int[] arr = { 1, 2, 3, 2, 8, 3, 9, 8, 3 };
        int target = 3;
        
        System.out.println("First index : " + findIdx(arr, target, 0));
    }
    
    // print the index of the element if exist
    static int findIdx(int arr[], int target, int idx) {
        // base case
        if (idx == arr.length)
            return -1;

        // self work
        if (arr[idx] == target)
            return idx;

        // recursive work
        return findIdx(arr, target, idx + 1);
    }

}
