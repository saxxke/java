public class p26 {
    public static void main(String[] args) {
        pattern(6);
    }

    static void pattern(int n) {
        for (int row = 1; row <= n; row++) {
            // for every row, run the col
            for (int col = 1; col <= n - row + 1; col++) {
                System.out.print(row + " ");
            }
            // when one row is printed, we need to add a newline
            System.out.println();
        }
    }
}
