public class basics2D {
    public static void main(String[] args) {

        // int[][] arr1 = new int[3][4];

        int[][] arr = {
                { 5, 4, 3 },
                { 4, 3, 4 },
                { 7, 4, 64 }
            };
        print2DArray(arr);
    }

    static void print2DArray(int[][] array) {
        for (int i = 0; i < array.length; i++) {
            for (int j = 0; j < array[i].length; j++) {
                System.out.print(array[i][j] + " ");
            }
            System.out.println();
        }
    }
}
