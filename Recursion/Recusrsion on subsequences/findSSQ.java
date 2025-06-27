import java.util.ArrayList;
import java.util.Scanner;

public class findSSQ {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter String for subsequences : ");
        String s = sc.next();
        ArrayList<String> ans = getSSQ(s);
        for (String ss : ans) {
            System.out.println(ss);
        }
        sc.close();
    }
    
    static ArrayList<String> getSSQ(String s) {
        ArrayList<String> ans = new ArrayList<>();
        if (s.length() == 0) {
            ans.add("");
            return ans;
        }

        char curr = s.charAt(0);
        ArrayList<String> smallAns = getSSQ(s.substring(1));

        for (String ss : smallAns) {
            ans.add(ss);
            ans.add(curr + ss);
        }
        return ans;
    }
}