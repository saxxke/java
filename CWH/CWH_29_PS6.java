public class CWH_29_PS6 {
    public static void main(String[] args) {
        // Question 1
        /*
         * float[] arr = { 22.5f, 55.5f, 66.3f, 25.5f, 22.5f };
         * float sum = 0;
         * for (int i = 0; i < arr.length; i++) {
         * sum = sum + arr[i];
         * }
         * System.out.println(sum);
         */
        // Question 2
        /*
         * float[] arr = { 22.5f, 55.5f, 66.3f, 25.5f, 22.5f };
         * float num = 22.5f;
         * boolean isInArray = false;
         * for (float element : arr) {
         * if (num == element) {
         * isInArray = true;
         * break;
         * }
         * }
         * if (isInArray) {
         * System.out.println("The value is present in the Array");
         * } else {
         * System.out.println("The value is not in the Array");
         * }
         */
        // Question 3
        /*
         * int[] marks = { 20, 52, 96, 52, 63 };
         * float sum = 0;
         * for (int element : marks) {
         * sum = sum + element;
         * }
         * System.out.println("The average marks is " + sum / marks.length);
         */
        // Question 4 ( Adding two matrices using array)
        /*
         * int[][] mat1 = { { 1, 2, 3 }, { 4, 5, 6 } };
         * int[][] mat2 = { { 2, 6, 13 }, { 3, 7, 1 } };
         * int[][] result = { { 0, 0, 0 }, { 0, 0, 0 } };
         * for (int i = 0; i < mat1.length; i++) { // row number of times
         * for (int j = 0; j < mat1[i].length; j++) {// column number of times
         * result[i][j] = mat1[i][j] + mat2[i][j];
         * System.out.print(result[i][j] + " ");
         * }
         * System.out.println("");
         * }
         */
        // Queston 5 (reverse an Array)
        /*
         * int[] arr = { 1, 2, 3, 4, 5, 6 };
         * int l = arr.length;
         * int n = Math.floorDiv(l, 2);
         * int temp;
         * for (int i = 0; i < n; i++) {
         * // Swap a[i] and a[l-1-i]
         * temp = arr[i];
         * arr[i] = arr[l - 1 - i];
         * arr[l - 1 - i] = temp;
         * 
         * }
         * for (int element : arr) {
         * System.out.print(element + " ");
         * }
         */
        // Question 6
        /*
         * int[] arr = { 1, 2100, -3, 456, 4, 5, 67 };
         * int max = Integer.MIN_VALUE;
         * for (int e : arr) {
         * if (e > max) {
         * max = e;
         * }
         * }
         * System.out.println(max);
         */
        // Question 7
        /*
         * int[] arr = { 1, 2100, -3, 456, 4, 5, 67 };
         * int min = Integer.MAX_VALUE;
         * for (int e : arr) {
         * if (e < min) {
         * min = e;
         * }
         * }
         * System.out.println(min);
         */
        // Question 8
        /*
         * int[] arr = { 1, 2, 3, 4, 5, 6, 7 };
         * boolean isSorted = true;
         * for (int i = 0; i < arr.length - 1; i++) {// arr.length-1 is used bcoz one
         * extra check will take place
         * if (arr[i] > arr[i + 1]) {
         * isSorted = false;
         * break;
         * }
         * }
         * if (isSorted) {
         * System.out.println("the array is sorted");
         * } else {
         * System.out.println("The array is not sorted");
         * }
         */
    }
}
