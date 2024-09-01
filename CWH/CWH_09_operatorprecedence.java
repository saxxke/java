public class CWH_09_operatorprecedence{
    public static void main(String[] args) {
        // Precendence & Associativity
        int p = 6*5-34/2;
        /*
        Highest Precedence goes to * & / . They are then evaluated on the basis
        of left to right associativity
         =30-34/2
         =30-17
         =13
         */
        int q = 60/5-34*2;
        /*
         =12-34*2
        =12-68
         =-56
         */
        System.out.println(p);
        System.out.println(q);

        // Quick Quiz 1
        int x = 6;
        int y = 1;
        int s = x*y/2;
        System.out.println(s);

        // Quick Quiz 2
        int b = 0 ;
        int c = 0 ;
        int a = 10 ;
        int k = (b*b - 4*a*c)/(2*a);
        System.out.println(k);
    }
    
}