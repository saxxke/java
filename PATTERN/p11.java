public class p11 {
    public static void main(String[] args) {
        pattern(5);
    }

    static void pattern(int n) {
        for (int row = n; row >= 1; row--) {
            for (int space = n-row; space >= 1; space--) {
                System.out.print(" ");
            }
            for (int col = 1; col <= row; col++) {
                System.out.print("* ");
            }
            System.out.println();
        }
    }
}
