import java.util.Scanner;

public class CWH_18_elseif {
    public static void main(String[] args) {
        int age;
        System.out.println("Enter your age: ");
        try (Scanner sc = new Scanner(System.in)) {
            age = sc.nextInt();
        switch (age)
        {
            case 18 -> System.out.println("You are going to become an adult!");
            case 23 -> System.out.println("You are going to join a job!");
            case 60 -> System.out.println("You are going to get retired!");
            default -> System.out.println("Enjoy your life!");
        }
        System.out.println("Thanks for using my Java code!");
          /*   if (age > 56) {
                System.out.println("You Are Experienced");
            } else if (age > 46) {
                System.out.println("You Are Semi-experienced");
            } else if (age > 36) {
                System.out.println("You are Semi-semi-experienced ");
            } else {
                System.out.println("You Are not experineced");
            } */
        }

    }

}
