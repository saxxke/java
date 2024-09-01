public class CWH_28_multidimensionalarray {
    public static void main(String[] args) {
        int[][] arr; // It is a 2D array
        arr = new int[2][3];
        arr[0][0] = 101;
        arr[0][1] = 102;
        arr[0][2] = 103;
        arr[1][0] = 201;
        arr[1][1] = 202;
        arr[1][2] = 203;
        /*
         * for (int i = 0; i < arr.length; i++) {
         * for (int j = 0; j < arr[i].length; j++) {
         * System.out.print(arr[i][j]);
         * System.out.print(" ");
         * }
         * System.out.println("");
         * }
         */
        // Using for each loop for multidimensional array
        for (int[] arr1 : arr) {
            for (int j = 0; j < arr1.length; j++) {
                System.out.print(arr1[j]);
                System.out.print(" ");
            }
            System.out.println("");
        }
    }
}
