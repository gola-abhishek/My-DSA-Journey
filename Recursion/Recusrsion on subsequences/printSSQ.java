public class printSSQ {
    public static void main(String[] args) {

        printSQ("abc", "");
    }
    
    static void printSQ(String s, String currAns) {
        if (s.length() == 0) {
            System.out.println(currAns);
            return;
        }
        char curr = s.charAt(0);
        String remString = s.substring(1);
        printSQ(remString, currAns + curr);
        printSQ(remString, currAns);
    }
}
