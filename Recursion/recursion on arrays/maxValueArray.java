public class maxValueArray {
    public static void main(String[] args) {
        int[] arr = { 6, 8, 3, 9, 7, 1, 2, 0 };

        // print the max value in the given array

        System.out.println("Max Value : " + maxValue(arr, 0));    }
    
    static int maxValue(int[] arr, int idx) {
        // base case
        if (idx == arr.length - 1) {
            return arr[idx];
        }
        // small problem -> idx+1 , end of the array -> max
        int smallAns = maxValue(arr, idx + 1);
        // self work and final ans
        return Math.max(arr[idx], smallAns);
    }
}
