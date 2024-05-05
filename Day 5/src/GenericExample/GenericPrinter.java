package GenericExample;

public class GenericPrinter<T> {
    private final T data;

    public GenericPrinter(T data) {
        this.data = data;
    }

    public void print() {
        System.out.println("print::: " + data);
    }
}
