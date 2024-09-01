public class CWH_27_arraysdisplay {
    public static void main(String[] args) {
        /*
         * int [] arr1 = {55,44,66,33,42};
         * float[] arr2 ={22.5f,55.5f,66.3f};
         * String []arr3 ={"rohan","ram","king","raja"};
         * System.out.println(arr1.length);
         * System.out.println(arr2[2]);
         * System.out.println(arr3[1]);
         */
        int[] arr1 = { 55, 44, 66, 33, 42 };
        for (int i = 0; i < arr1.length; i++) {
            System.out.println(arr1[i]);
        }
        System.out.println("");
        // for reverse order
        for (int j = arr1.length - 1; j >= 0; j--) {
            System.out.println(arr1[j]);
        }
        System.out.println("");
        // Displaying the array in for each loop
        for (int element : arr1) {
            System.out.println(element);
        }
    }
}
