import java.util.Scanner;
public class CWH_06_excercise1{
    public static void main(String[] args) {
        System.out.println("Enter obtained marks:");
        try (Scanner sc = new Scanner(System.in)){
        System.out.println("BENGALI:");
        float a = sc.nextFloat();
        System.out.println("ENGLISH:");
        float b = sc.nextFloat();
        System.out.println("MATH:"); 
        float c = sc.nextFloat();
        System.out.println("SCIENCE:");
        float d = sc.nextFloat();
        System.out.println("HISTORY:");
        float e = sc.nextFloat();
        float avg = (a + b + c + d + e )/ 5 ;
        System.out.println("The average of the obtained marks are:");
        System.out.println(avg);
        }
    }
}