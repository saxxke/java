
import java.util.Scanner;

public class CWH_13_strings {
    public static void main(String[] args) {
        //String name = new String("King ");
       //  System.out.println(name);

       String name = " King";
       System.out.print("The name is :");
       System.out.println(name);

       int a = 6;
       float b = 5.6425f;
       System.out.printf("The value of a is %d and value of b is %f",a,b);
       System.out.format("The value of a is %d and value of b is %f",a,b);

       System.out.println("Enter String");
       try (Scanner sc = new Scanner(System.in)) {
        // String st = sc.next(); (It is used for only printing the first word of a string)
          String st = sc.nextLine();
           System.out.println(st);
    }       
    }
    
}
