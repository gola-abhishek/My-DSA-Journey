import java.util.Scanner;

public class basicsStr {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        String s = sc.nextLine();
        System.out.println("Output : " + s);

        char ch = s.charAt(2);
        System.out.println("Char at index : " + ch);

        for (int i = 0; i < s.length(); i++) {
            System.out.println(s.charAt(i));
        }

        System.out.println("Substring : " + s.substring(0, 6));
        sc.close();
    }
}