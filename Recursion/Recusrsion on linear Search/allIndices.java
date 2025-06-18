public class allIndices {
    public static void main(String[] args) {
        int[] arr = { 1, 2, 3, 2, 8, 3, 9, 8, 3 };
        int target = 3;
        
        System.out.println("All indices of the target element :- ");
        findAllndices(arr, target, 0);
    }
    
    // return all the indices of te element in the given array
    static void findAllndices(int[] arr, int target, int idx) {
        // base case
        if (idx == arr.length)
            return;

        // self work
        if (arr[idx] == target)
            System.out.println(idx);

        // recursive work
        findAllndices(arr, target, idx + 1);
    }
}
