// Logical operators 

public class LogicalOperators {
    public static void main(String[] args) {
        int p = 15, q = 10, r = 5;
        // && operator[AND]
        System.out.println((p > q) && (p > r)); // true
        System.out.println((p > q) && (p < r)); // false

        // || operator[OR]
        System.out.println((r < q) || (p < q)); // true
        System.out.println((p < q) || (q < r)); // false
        System.out.println((p > q) || (q < r)); // true

        // ! operator[NOT]
        System.out.println(!(p == q)); // true
        System.out.println(!(p > q));// false
    }
}