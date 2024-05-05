package GenericExample;

public class Demo {
    public static void main(String[] args) {
        NumberPrinter numberPrinter = new NumberPrinter(5);
        numberPrinter.print(); // output = print::: 5
        TextPrinter textPrinter = new TextPrinter("Hello");
        textPrinter.print();   // output = print::: Hello

        System.out.println("******************************");

        GenericPrinter<Integer> integerPrinter = new GenericPrinter<Integer>(5);
        integerPrinter.print();   // output = print::: 5

        GenericPrinter<String> stringPrinter = new GenericPrinter<>("Hello");
        stringPrinter.print();   // output = print::: Hello

        GenericPrinter<Double> doublePrinter = new GenericPrinter<>(45.34);
        doublePrinter.print();   // output = print::: 45.34

        GenericPrinter<Long> longPrinter = new GenericPrinter<>(5L);
        longPrinter.print();    // output = print::: 5

        System.out.println("******************************");

        MultiType<Integer, String> multiType = new MultiType<>(1, "asdf");
    }
}
