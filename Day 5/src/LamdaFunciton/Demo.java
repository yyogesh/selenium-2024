package LamdaFunciton;

@FunctionalInterface
interface A{
    void show();
}

class Example implements  A {

    @Override
    public void show() {
        System.out.println("Show function of example class");
    }
}

public class Demo {
    public static void main(String[] args) {
        A obj = new Example();
        obj.show();

        Example example = new Example() {
            @Override
            public void show() {
                System.out.println("Show function of inner example class");
            }
        };

        A example1 = new Example() {
            @Override
            public void show() {
                System.out.println("Show function of inner example class");
            }
        };

        example.show();

        A obj1 = new A() {
            @Override
            public void show() {
                System.out.println("Show function of inner anonymous class");
            }
        };

        obj1.show();

        A obj2 = () -> {
                System.out.println("Show function of lamda class");
        };

        obj2.show();
    }
}
