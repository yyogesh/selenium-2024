//TIP To <b>Run</b> code, press <shortcut actionId="Run"/> or
// click the <icon src="AllIcons.Actions.Execute"/> icon in the gutter.
public class Main {
    public static void main(String[] args) {
        //TIP Press <shortcut actionId="ShowIntentionActions"/> with your caret at the highlighted text
        // to see how IntelliJ IDEA suggests fixing it.
        System.out.println("Hello and welcome!");

        for (int i = 1; i <= 5; i++) {
            //TIP Press <shortcut actionId="Debug"/> to start debugging your code. We have set one <icon src="AllIcons.Debugger.Db_set_breakpoint"/> breakpoint
            // for you, but you can always add more by pressing <shortcut actionId="ToggleLineBreakpoint"/>.
            System.out.println("i = " + i);
        }

        int a = 10;

        String str = "10";
        int b = Integer.parseInt(str);

       //  Integer integer = new Integer(20);

        Student ajay = new Student("Ajay", 1);
        String info = ajay.getStudentInfo();
        System.out.println("Student info is::" + info);

        Student rahul = new Student("Rahul", 2);
        String rahulInfo = rahul.getStudentInfo();
        System.out.println("Rahul info is::" + rahulInfo);

        String sInfo = Student.getInfo();
        System.out.println(sInfo);

        String a1 = "adf";
        String a2 = "adf1";

        String b1 = a1+ "a";
        String b2 = b1+ "a";

        String x1 = new String("asdf");

        System.out.println(a1.toUpperCase());
        System.out.println(a1.length());

        String email = "yogeshggn@gmail.com";
        int zx = email.indexOf('@');
        System.out.println("zx value " + zx);
        System.out.println(email.substring(0, zx));
        System.out.println(email.substring(zx + 1, email.length()));

    }
}

class Student {
    String name; // NULL
    int id; // 0

    public Student() {
        System.out.println("Default constructor of Student class");
    }

    public Student(String name, int sId) {
        this.name = name;
        id = sId;
    }

    public Student(String name, int sId, int value) {
        this.name = name;
        id = sId;
    }

    public String getStudentInfo() {
        return "name :: " + name + " id::" + id;
    }

    public static String getInfo() {
       return "Student static method";
    }

    static {
        System.out.println("static block");
    }


}