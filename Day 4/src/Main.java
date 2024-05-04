import com.example.abstracexample.Wagnor;
import com.example.service.EmployeeService;



// superclass Person
class Person {
    private String name; // INSTANCE VARIABLE

    public Person(String name) {
        this.name = name;
    }

    void message()
    {
        System.out.println("This is person class " + this.name);
    }
}

// Subclass Student
class Student extends Person {
     int rollNo; // INSTANCE VARIABLE

    public Student(String name, int rollNo) {
        super(name);
        this.rollNo = rollNo;
    }

    @Override
    void message()
    {
        int x = 10; // LOCAL VARIABLE
        int y = 20;
        int result  = x +y;
        System.out.println("This is student class");
    }
    // Note that display() is
    // only in Student class
    void display()
    {
        // will invoke or call current
        // class message() method
        message();
        super.message();
    }
}

public class Main {
    public static void main(String[] args) {
        EmployeeService employeeService = new EmployeeService();
        employeeService.getEmployeeByDepartment();

        Student student = new Student("Ravi", 1);
        student.display();

        Person student2 = new Student("Ravi", 1);

        int a =10;
        long b = a;// Widening type casting

        long x = 10;
        int b1 = (int) x; // Nassorwing type cast

        double amount = 1.5;
        int amountx = (int) amount;


        Wagnor wagnor = new Wagnor();
        wagnor.getSafety();

    }
}





