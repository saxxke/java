public class p12 {
    public static void main(String[] args) {
        pattern(5);
    }

    static void pattern(int n) {
        for (int row = 0; row <= 2 * n; row++) {
            int totalNoSpaces = row > n ? 2 * n - row : row;
            int totalColsInRow = row > n ? row - n : n - row;
            for (int space = totalNoSpaces; space >= 1; space--) {
                System.out.print(" ");
            }
            for (int col = totalColsInRow; col >= 1; col--) {
                System.out.print("* ");
            }
            System.out.println();
        }
    }
}