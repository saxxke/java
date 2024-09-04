import java.util.Scanner;

public class calculator {
    public static void main(String[] args) {
        try (Scanner in = new Scanner(System.in)) {
            // Take input from user till user does not press X or x
            int ans = 0;
            OUTER: while (true) {
                System.out.print("Enter the operator: ");
                char op = in.next().trim().charAt(0);
                switch (op) {
                    case '+', '-', '*', '/', '%' -> {
                        // input two numbers
                        System.out.print("Enter two numbers: ");
                        int num1 = in.nextInt();
                        int num2 = in.nextInt();
                        if (op == '+') {
                            ans = num1 + num2;
                        }
                        if (op == '-') {
                            ans = num1 - num2;
                        }
                        if (op == '*') {
                            ans = num1 * num2;
                        }
                        if (op == '/') {

                            if (num2 != 0) {
                                ans = num1 / num2;
                            } else {
                                System.out.println("Invalid operation!!");
                            }
                        }
                        if (op == '%') {
                            ans = num1 % num2;
                        }
                    }
                    case 'x', 'X' -> {
                        break OUTER;
                    }
                    default -> System.out.println("Invalid operation!!");
                }
                System.out.println(ans);
            }
        }
    }
}

