public class CWH_10_resulting_data_type {
    public static void main(String[] args) {
        byte x = 5;
        int y = 6;
        short z = 8;
        int a = y + z;
        float b = 6.54f + x;
        System.out.println(a);
        System.out.println(b);

        //Increment & Decrement Operators
        int i = 56;
        int m = i++;// first m is assigned i (56) then i is incemented
        int j = 67;
        int n = ++j;// first j is incemented then n is assigned j (68)
        System.out.println(m);
        System.out.println(n);
        System.out.println(i++);
        System.out.println(i);
        System.out.println(++i);
        System.out.println(i);
        char ch = 'a';
        System.out.println(++ch);
    }
    
}
