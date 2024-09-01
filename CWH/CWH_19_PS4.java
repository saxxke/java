import java.util.Scanner;

public class CWH_19_PS4 {
    public static void main(String[] args) {
        // Question 2
        /*
         * System.out.println("Taking Inputs from the User :");
         * try( Scanner sc = new Scanner(System.in)){
         * System.out.println("Enter Marks in Subject 1 : ");
         * int sub1 = sc.nextInt();
         * System.out.println("Enter Marks in Subject 2 : ");
         * int sub2 = sc.nextInt();
         * System.out.println("Enter Marks in Subject 3 : ");
         * int sub3 = sc.nextInt();
         * int total = (sub1+sub2+sub3)/3;
         * if(sub1>=33 && sub2>=33 && sub3>=33 && total>=40) {
         * System.out.println("PASS");
         * }
         * else{
         * System.out.println("FAIL");
         * }
         * 
         * }
         */

        // Question 3
        /*
         * try (Scanner sc = new Scanner(System.in)) {
         * System.out.println("Enter your income in lakhs per annum:");
         * float tax = 0;
         * float income = sc.nextFloat();
         * if (income <= 2.5f) {
         * tax = tax + 0;
         * } else if (income > 2.5f && income <= 5.0f) {
         * tax = tax + 0.05f * (5.0f - 2.5f);
         * } else if (income > 5.0f && income <= 10.0f) {
         * tax = tax + 0.05f * (5.0f - 2.5f);
         * tax = tax + 0.2f * (income - 5.0f);
         * } else if (income > 10.0f) {
         * tax = tax + 0.05f * (5.0f - 2.5f);
         * tax = tax + 0.2f * (10.0f - 5.0f);
         * tax = tax + 0.3f * (income - 10.0f);
         * }
         * System.out.println("The total tax paid by the employee is: " + tax);
         * }
         */
        // Question 4
        /*
         * try (Scanner sc = new Scanner(System.in)) {
         * System.out.println("Enter number: ");
         * int day = sc.nextInt();
         * switch (day) {
         * case 1 -> System.out.println("Monday");
         * case 2 -> System.out.println("Tuesday");
         * case 3 -> System.out.println("Wednesday");
         * case 4 -> System.out.println("Thursday");
         * case 5 -> System.out.println("Friday");
         * case 6 -> System.out.println("Saturday");
         * case 7 -> System.out.println("Sunday");
         * }
         * }
         */
        // Question 6
        /*
         * try(Scanner sc = new Scanner(System.in)){
         * System.out.println("Enter website name : ");
         * String website = sc.next();
         * if (website.endsWith(".org")){
         * System.out.println("This is a organizational website");
         * }
         * else if (website.endsWith(".com")){
         * System.out.println("This is a commercial website");
         * }
         * else if (website.endsWith(".in")){
         * System.out.println("This is an Indian website");
         * }
         * }
         */
        // Question 5
        try (Scanner sc = new Scanner(System.in)) {
            System.out.println("Enter your year : ");
            int year = sc.nextInt();
            if (year % 100 == 0 && year % 400 == 0) {
                System.out.println("It is a Leapyear");
            } else if (year % 100!= 0 && year % 4 == 0) {
                System.out.println("It is a Leapyear");
            } else {
                System.out.println("It is not a Leapyear");
            }
        }
    }

}
