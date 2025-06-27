public class keypadCombinations {
    public static void main(String[] args) {
        String dig = "79";
        String[] kp = { "", "", "abc", "def", "ghi", "jkl", "mno", "pqrs", "tuv", "wxyz" };
        
        combinations(dig, kp, "");
    }

    static void combinations(String dig,String[] kp, String res ) {
        if (dig.length() == 0) {
            System.out.print(res + " ");
            return;
        }
        int currNum = dig.charAt(0) - '0'; // 2
        String currString = kp[currNum]; // "abc"
        
        for (int i = 0; i < currString.length(); i++) {
            combinations(dig.substring(1), kp, res + currString.charAt(i));
        }
    }
}
