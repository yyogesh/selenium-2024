package GenericExample;

public class MultiType<T, V> {
    private final T data1;
    private final V data2;

    public MultiType(T data1, V data2) {
        this.data1 = data1;
        this.data2 = data2;
    }

    public void print() {
        System.out.println("print::: " + data1 + " : " + data2);
    }
}
