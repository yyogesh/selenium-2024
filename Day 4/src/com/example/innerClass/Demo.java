package com.example.innerClass;

class University {
    public void display() {
        System.out.println("Display method of department class");
    }
    class Department {
        public void display() {
            System.out.println("Display method of department class");
        }
    }
}

public class Demo {
    public static void main(String[] args) {
        University university = new University();
        University.Department department = university.new Department();
        department.display();

        University abc = new University() {
            @Override
            public void display() {
                System.out.println("Anonymouse Inner class");
            }
        };

        abc.display();

    }
}
