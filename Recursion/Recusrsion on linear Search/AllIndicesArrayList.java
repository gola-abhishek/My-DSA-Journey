// finding all indices of the target element and returning the ArrayList of integer.

import java.util.ArrayList;

public class AllIndicesArrayList {
    public static void main(String[] args) {
        int[] arr = { 1, 2, 4, 4, 5, 4 };
        int target = 4;
        ArrayList<Integer> ans = allIndices(arr, target, 0); // ans-> all indices
        System.out.println(ans);
    }

    static ArrayList<Integer> allIndices(int[] arr, int target, int idx) {

        ArrayList<Integer> ans = new ArrayList<>();

        // base case
        if (idx == arr.length) {
            return ans; // return the empty arrayList
        }

        // self work
        if (arr[idx] == target) {
            ans.add(idx);// add the first index to ans ArrayList
        }

        // recursive work
        ArrayList<Integer> smallAns = allIndices(arr, target, idx + 1);
        ans.addAll(smallAns);// add all remaining index to ans ArrayList
        return ans;
    }
}
