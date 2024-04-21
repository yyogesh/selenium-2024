import java.util.Scanner;

public class Demo {
    public static void main(String[] a1) {
        // new keyword used to crate an object
        Scanner scanner = new Scanner(System.in);
        System.out.println("Please enter your mark ");
        int mark = scanner.nextInt();
        System.out.println("Your mark is " + mark);

        if(mark > 80) {
            System.out.println("Excellent");
        } else if(mark > 60) {
            System.out.println("Good");
        } else {
            System.out.println("Please try again");
        }

        switch (mark) {
            case 78:
            case 80:
                System.out.println("Switch statement Excellent");
                break;
            case 60:
                System.out.println("Good");
                break;
            default:
                System.out.println("Bad");
        }

        // 100 of boxes

        // starting point initializaiton
        // ending 20 box
        // 1 box

       for(int i =1; i <= 20; i++) {
           System.out.println("Value of i is::" + i);
       }

        int i = 0;
        while ( i <= 20) {
            System.out.println("Value of i is in while loop::" + i);
            i++;
        }

        do {
            System.out.println("Value of i is in do while loop::" + i);
            i++;
        } while (i <= 30);
    }
}
