public class p6 {
    public static void main(String[] args) {
        pattern(5);
    }

    static void pattern(int n) {
        for (int row = 1; row <= n; row++) {
            
            int c = row;

            for (int space = 0; space < n - c; space++) {
                System.out.print("  ");
            }

            for (int col = row; col >= 1; col--) {
                System.out.print("*" + " ");
            }

            System.out.println();
        }
    }
}
