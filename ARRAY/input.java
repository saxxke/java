
import java.util.Arrays;
import java.util.Scanner;

public class input {
    public static void main(String[] args) {
        try (Scanner in = new Scanner(System.in)) {
            // array of primitives
            int arr[] = new int[5];
            // input using for loops
            for (int i = 0; i < arr.length; i++) {
                arr[i] = in.nextInt();
            }
            System.out.println(Arrays.toString(arr));
        }

        // for (int i = 0; i < arr.length; i++) {
        // System.out.print(arr[i] + " ");
        // }

        // for(int num : arr) { // for every element in array, print the element
        // System.out.print(num + " "); // here num represents element of the array
        // }

        // System.out.println(arr[5]); // index out of bound error

        // array of objects
        String[] str = { "king", "harry", "jit", "ayan" };
        System.out.println(Arrays.toString(str));
        // modify
        str[1] = "kunal";
        System.out.println(Arrays.toString(str));
    }
}