public class p31 {
    public static void main(String[] args) {
        pattern(4);
    }
    static void pattern(int n) {

        int orginalN = n;
        n = 2 * n;
        for (int row = 1; row <= n - 1; row++) {
            for (int col = 1; col <= n - 1; col++) {
                int numberindex = orginalN - Math.min(Math.min(row, col), Math.min(n - row, n - col)) + 1;
                System.out.print(numberindex + " ");
            }
            System.out.println();
        }
    }
}
