import java.util.Arrays;

public class arrBasics {
    public static void main(String[] args) {
        arrBasics obj = new arrBasics();// if not static then object of class is required
        obj.ArrEx();// use object_name .(dot) Function_name

        multiArr();// Direct call of static function
    }

    void ArrEx() { // 1 D arrays

        int ages[] = new int[5];
        ages[0] = 20;
        ages[1] = 21;
        ages[2] = 22;
        ages[3] = 23;
        ages[4] = 24;
        System.out.println(ages[3]);// single element print
        System.out.println(ages.length); // Length of array
        System.out.println(Arrays.toString(ages)); // whole array print

        String names[] = new String[5];
        names[0] = "abhi";
        names[1] = "abhi1";
        names[2] = "abhi2";
        names[3] = "abhi3";
        names[4] = "abhi4";
        System.out.println(Arrays.toString(names)); // whole array print

    }

    static void multiArr() { // 2 D arrays
        int[][] arr1 = new int[3][3];
        int[][] arr2 = {
                { 5, 4, 3 },
                { 4, 3, 4 },
                { 7, 4, 64 }
        };

        System.out.println(arr2[2][2]);// single element print
        System.out.println(arr2.length);
        System.out.println(Arrays.deepToString(arr2));// whole array print
    }
}
