public class sumArray {
    public static void main(String[] args) {
        int[] arr = { 6, 8, 3, 9, 7, 1, 2, 0 };

        // print the sum of given array
        System.out.println("Sum of array : " + sumOfArray(arr, 0));
    }
    
    static int sumOfArray(int[] arr, int idx) {
        // base case
        if (idx == arr.length) {
            return 0;
        }
        // recursive work
        int smallAns = sumOfArray(arr, idx + 1);
        // self work
        return smallAns + arr[idx];
    }
}
