public class ArrayPrint {
    public static void main(String[] args) {
        int[] arr = { 6, 8, 3 , 9, 7, 1 ,2 ,0 };

        printArray(arr, 0);// print array elements 
    }

    static void printArray(int[] arr, int idx) {
        // base case 
        if (idx == arr.length) {
            return;
        }
        // self work 
        System.out.print(arr[idx] + " ");
        //recursive work
        printArray(arr, idx + 1);
    }
}
