public class arrCopy {
    public static void main(String[] args) {

        int ages[] = new int[5];
        ages[0] = 20;
        ages[1] = 21;
        ages[2] = 22;
        ages[3] = 23;
        ages[4] = 24;
        System.out.println("Original Array : ");
        printarray(ages);
        
    //    int ages2[] = ages;// normal  if chnanged change in original aray 
        int ages2[] = ages.clone();// Clone Changes not appear in the original refrenced array cause we have made a clone
        
        System.out.println("Copied Array : ");
        printarray(ages2);
        
        ages2[0] = 0;
        ages2[1] = 0;
        
        System.out.println("Original Array after changing : ");
        printarray(ages);
        System.out.println("Copied Array after changing : ");
        printarray(ages2);
    }

    static void printarray(int arr[]) {
        for (int i = 0; i < arr.length; i++) {
            System.out.print(arr[i] + " ");
        }
        System.out.println();
    }
}
