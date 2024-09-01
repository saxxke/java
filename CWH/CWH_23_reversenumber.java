import java.util.Scanner;
public class CWH_23_reversenumber {
    public static void main(String[] args) {
        // Program to print first n natural number in reverse order
        System.out.println("Enter your Number : ");
        try(Scanner sc = new Scanner(System.in)){
            int n = sc.nextInt();
            for (int i = n -1; i != 0; i--) {
            System.out.println(i);     
            }
        }
    }
}
