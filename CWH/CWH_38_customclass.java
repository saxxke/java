class Employee1 {
    int id;
    String name;
    int salary;

    public void printDetailsof() {
        System.out.println("My id is : " + id);
        System.out.println("My name is : " + name);
    }

    public int getSalary() {
        return salary;

    }
}

public class CWH_38_customclass {
    public static void main(String[] args) {
        System.out.println("This is our custom class");
        Employee1 harry = new Employee1();// Instantiating a new Employee Object
        // Setting Attributes
        harry.id = 12;
        harry.name = "CWH";
        harry.salary = 12000;
        // Printingt the Attributes
        harry.printDetailsof();
        int salary = harry.getSalary();
        System.out.println("My salary is : " + salary);
        // System.out.println(harry.id);
        // System.out.println(harry.name);
    }
}