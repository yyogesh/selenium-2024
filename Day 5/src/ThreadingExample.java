
class A extends Thread
{
    public void run()
    {
        for(int i=1;i<=100;i++)
        {
            System.out.println("Hi");
            try {
                Thread.sleep(100);
            } catch (InterruptedException e) {
                throw new RuntimeException(e);
            }

        }
    }
}
class B extends Thread
{
    public void run()
    {
        for(int i=1;i<=100;i++)
        {
            System.out.println("Hello");
            try {
                Thread.sleep(100);
            } catch (InterruptedException e) {
                throw new RuntimeException(e);
            }
        }
    }
}

public class ThreadingExample {
    public static void main(String[] args) throws InterruptedException {
        A obj1=new A();
        B obj2=new B();

//        obj1.run1();
//        obj2.run1();
        obj1.start();
        obj2.start();
    }
}
