import java.util.Scanner;
public class CWH_05_Takinginput{
    public static void main(String[] args) {
        System.out.println("Taking Inputs From The User:");
     try (  Scanner sc = new Scanner(System.in)){
       System.out.println("Enter number 1:");
        int a = sc.nextInt();
        //float a = sc.nextFloat();
        System.out.println("Enter number 2:");
       int b = sc.nextInt();
       //float b = sc.nextFloat();
       int sum =  a + b;
        //float sum = a + b;
        System.out.println("The sum of these numbers is:");
        System.out.println(sum);
        //for validating a datatype ( int , float , string etc.)
//boolean b1 =sc.hasNextInt();
//System.out.println(b1);
        //for printing a string
//String str = sc.nextLine();
//System.out.println(str);
        //for printing the first word of a string 
//String str = sc.next();
//System.out.println(str);
     }
    }
}