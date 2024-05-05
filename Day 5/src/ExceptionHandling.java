import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.IOException;

public class ExceptionHandling {
    public static void main(String[] args) {
        try {
            int result = 10/0;
        } catch (ArithmeticException ex) {
            System.out.println("ArithmeticException " + ex.getMessage());
        } catch (Exception ex) {
            System.out.println("Exception " + ex.getMessage());
        } finally {
            System.out.println("finally block execute");
        }

        FileInputStream fis = null;
        try {
            fis = new FileInputStream("abc");
        } catch (IOException ex) {
            System.out.println(ex.getMessage());
        } finally {
            // fis.close();
        }

        try (FileInputStream fis1 = new FileInputStream("abc")) {

        } catch (IOException ex) {
            System.out.println(ex.getMessage());
        }
    }
}
