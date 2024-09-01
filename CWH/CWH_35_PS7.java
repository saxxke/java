public class CWH_35_PS7 {
    // Question 1
    static void multiplication(int n) {
        for (int i = 1; i <= 10; i++) {
            System.out.format("%d X %d = %d\n", n, i, n * i);
        }
    }

    // Question 2
    static void pattern1(int n) {
        for (int i = 0; i < n; i++) {
            for (int j = 0; j < i + 1; j++) {
                System.out.print("*");
            }
            System.out.println();
        }
    }

    // Question 3
    static int sumRec(int n) {
        if (n == 1) {
            return 1;
        }
        return n + sumRec(n - 1);

    }

    // Question 4
    static void pattern2(int n) {
        for (int i = n; i > 0; i--) {
            for (int j = 0; j < i; j++) {
                System.out.print("*");
            }
            System.out.println();
        }
    }

    // Question 5
    static int fib(int n) {
        if (n == 1 || n == 2) {
            return n - 1;
        } else {
            return fib(n - 1) + fib(n - 2);
        }
    }

    // Question 7
    static void pattern2_rec(int n) {
        if (n > 0) {
            for (int i = 0; i < n; i++) {
                System.out.print("*");
            }
            System.out.println();
            pattern2_rec(n - 1);
        }
    }

    // Question 8
    static void pattern1_rec(int n) {
        if (n > 0) {
            pattern1_rec(n - 1);
            for (int i = 0; i < n; i++) {
                System.out.print("*");
            }
            System.out.println();
        }
    }

    // Question 9
    static float fahrenheit(float cel) {
        float fahren = (cel * (9 / 5.0f)) + 32.0f;
        return fahren;
    }

    // Question 10
    static int nSum(int n) {
        int sum = 0;
        for (int i = 1; i <= n; i++) {
            sum += i;
        }
        return sum;
    }

    public static void main(String[] args) {
        // Question 1
        multiplication(7);
        // Question 2
        pattern1(4);
        // Question 3
        int c = sumRec(10);
        System.out.println(c);
        // Question 4
        pattern2(4);
        // Question 5
        // fibonacci series 0 1 1 2 3 5 8 13 21 34
        int result = fib(7);
        System.out.println((result));
        // Question 7
        pattern2_rec(4);
        // Question 8
        pattern1_rec(4);
        // Question 9
        float celcius = 15.7f;
        System.out.println(celcius + " °C" + " -> " + fahrenheit(celcius) + " °F");
        // Question 10
        int num = 5;
        System.out.println("The sum of first " + num + "th natural numbers is: " + nSum(num));

    }
}
