public class swapVar {
    public static void main(String[] args) {

        int a = 9;
        int b = 6;

        swap(a, b);

    }
    
    static void swap(int a, int b) {

        System.out.println(" Original value before swap : " + a + " and " + b);

        // Method 1 using temp variable
        int temp;
        temp = a;
        a = b;
        b = temp;

        System.out.println(" Original value after swap : " + a + " and " + b);

        // Method 2 without temp variable
        a = a + b;
        b = a - b;
        a = a - b;

        System.out.println(" Original value after swap : " + a + " and " + b);
    }

}
