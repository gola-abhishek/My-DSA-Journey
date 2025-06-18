public class lastIndex {
    public static void main(String[] args) {
        int[] arr = { 1, 3, 3, 2, 8, 3, 9 };
        int target = 3;

        System.out.println(lastIdx(arr, target, 0));
        
        System.out.println(lastIdxReverseTraverse(arr, target, arr.length-1));
    }

    static int lastIdx(int[] arr, int target, int idx) {
        // base case
        if (idx == arr.length) {
            return -1;
        }
        // recursive work
        int lastElementIndex = lastIdx(arr, target, idx + 1);
        if (arr[idx] == target && idx > lastElementIndex) {
            return idx;
        }

        // self work
        return lastElementIndex;
    }
    
    static int lastIdxReverseTraverse(int[] arr, int target, int idx) {
        // base case
        if (idx < 0) {
            return -1;
        }
        // recursive work
        if (arr[idx] == target) {
            return idx;
        }

        // self work
        return lastIdx(arr, target, idx - 1);
    }
}
