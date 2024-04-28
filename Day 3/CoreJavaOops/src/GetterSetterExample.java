public class GetterSetterExample {
    public static void main(String[] args) {
        Employee1 employee1 = new Employee1("asdf", 10);
        employee1.setId(10);
        System.out.println(employee1.getId());
    }
}

class Employee1 {
    private String name;
    private int id;

    public Employee1(String name, int id) {
        this.name = name;
        this.id = id;
    }

    @Override
    public String toString() {
        return "Employee1{" +
                "name='" + name + '\'' +
                ", id=" + id +
                '}';
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }
//    public int getId(){
//        return this.id;
//    }
//
//    public void setId(int id) {
//        if(id <= 0) {
//            System.out.println("Value should not be less than zero");
//        } else {
//            this.id = id;
//        }
//    }
}


