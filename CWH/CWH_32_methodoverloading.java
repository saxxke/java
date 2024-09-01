public class CWH_32_methodoverloading {
    // methods

    // Case 1
    // static void change1(int a){
    // a = 98;
    // }

    // Case 2
    // static void change2(int [] arr){
    // arr[0] = 98;
    // }

    // Case 3
    // static void tellJoke(){
    // System.out.println("I invented a new word!\n" +
    // "Plagiarism!");
    // }

    // Method Overloading
    static void foo() {
        System.out.println("Good Morning bro!");
    }

    static void foo(int a) {
        System.out.println("Good morning " + a + " bro!");
    }

    static void foo(int a, int b) {
        System.out.println("Good morning " + a + " bro!");
        System.out.println("Good morning " + b + " bro!");
    }

    // static int foo(int a, int b){
    // System.out.println("Good morning " + a + " bro!");
    // System.out.println("Good morning " + b + " bro!");
    // }
    // It will throw error bcoz we haven't changed the parameters , only just changing the datatype of the method won't work


    public static void main(String[] args) {
 
        //methods

        // Case 1: Changing the Integer
        // int x = 45;
        // change1(x);
        // System.out.println("The value of x after running change is: " + x);

        // Case 2: Changing the Array
        // int [] marks = {52, 73, 77, 89, 98, 94};
        // change2(marks);
        // System.out.println("The value of x after running change is: " + marks[0]);

        // for integer changing doesn't work bcoz it can't read the data but for array it works!

        // Case 3:
        // tellJoke();

        // Method Overloading

        foo();
        foo(3000);
        foo(3000, 4000);
        
        // Arguments are actual!

    }
}
