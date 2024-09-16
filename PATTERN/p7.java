public class p7 {
    public static void main(String[] args) {
        pattern(5);
    }

    static void pattern(int n) {
        for (int row = n; row >= 1; row--) {

            int c = row;

            for (int space = n - c; space > 0; space--) {
                System.out.print("  ");
            }

            for (int col = row; col >= 1; col--) {
                System.out.print("*" + " ");
            }

            System.out.println();
        }
    }
}
