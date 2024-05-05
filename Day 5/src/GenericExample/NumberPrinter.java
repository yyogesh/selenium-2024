package GenericExample;

public class NumberPrinter {
    private final Integer data;

    public NumberPrinter(Integer data) {
        this.data = data;
    }

    public void print() {
        System.out.println("print::: " + data);
    }
}
