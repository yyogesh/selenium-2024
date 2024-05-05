package GenericExample;

public class TextPrinter {
    private final String data;

    public TextPrinter(String data) {
        this.data = data;
    }

    public void print() {
        System.out.println("print::: " + data);
    }
}
