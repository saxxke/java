public class CWH_34_recursion {
    static int factorial(int n) {
        if (n == 0 || n == 1) {
            return 1;
        } else {
            return n * factorial(n - 1);
        }
    }

    static int factorial_iterative(int m) {
        if (m == 0 || m == 1) {
            return 1;
        } else {
            int product = 1;
            for (int i = 1; i <= m; i++) {
                product *= i;
            }
            return product;
        }
    }

    public static void main(String[] args) {
        int x = 5;
        int y = 6;
        System.out.println("The value of the factorial n is : " + factorial(x));
        System.out.println("The value of the factorial n is : " + factorial_iterative(y));

    }
}