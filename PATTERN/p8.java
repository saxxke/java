public class p8 {
    public static void main(String[] args) {
        pattern(5);
    }
    static void pattern(int n) {
        for (int row = 1; row <=  n; row++) {

            int c = row ;

            for (int space = 0; space < n-c; space++) {
                System.out.print("  ");
            }

            for (int col = c; col >= 1; col--) {
                System.out.print("*" + " ");
            }
            for (int col = 2; col <= c; col++) {
                System.out.print("*" + " ");
            }

            System.out.println();
        }
    }
}
