public class CWH_24_breakandcontinue {
    public static void main(String[] args) {
        // using for loop

        /*
         * for (int i = 10; i > 0; i--) {
         * if (i == 7) {
         * break; // break the loop
         * }
         * System.out.println(i);
         * }
         * for(int i=7;i>0;i--){
         * if(i==3){
         * continue;//continue skips the rest statement
         * }
         * System.out.println(i);
         * }
         */

        // using do while loop

        int i = 0;
        do {
            System.out.println(i);
            System.out.println("Java is great");
            if (i == 2) {
                System.out.println("Ending the loop");
                break;
            }
            i++;
        } while (i < 5);
        System.out.println("Loop ends here");
        int j = 0;
        do {
            j++;
            if (j == 2) {
                System.out.println("Ending the loop");
                continue;
            }
           
            System.out.println(j);
            System.out.println("Java is great");

        } while (j < 5);
        System.out.println("Loop ends here");

    }
}
